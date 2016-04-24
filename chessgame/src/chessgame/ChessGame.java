package chessgame;

public class ChessGame {
    
    static  IChessLogic createArtificialIntelligenceLogic() {
        return null;
    }

    static  IChessLogic createPlayerLogic() {
        return null;
    }

    static IChessTable createTable() {
        return null;
    }
    
    static void printTable(IChessTable Table) {
    }
    
    public static void main(String[] args) {
        
        IChessTable table = createTable();
        IChessLogic ai = createArtificialIntelligenceLogic();
        IChessLogic player = createPlayerLogic();

        System.out.println("Bienvenido al juego del ajedrez, tu llevas las blancas");
        while (table.containsKing(IChessPiece.Color.White) && table.containsKing(IChessPiece.Color.Black)) {

            if(!player.performNextMovement(table, IChessPiece.Color.White))
                System.out.println("Algo ha ido mal, ...");

            if(table.containsKing(IChessPiece.Color.Black) && table.containsKing(IChessPiece.Color.Black))
                if(!ai.performNextMovement(table, IChessPiece.Color.Black))
                    System.out.println("Algo ha ido mal, ...");
        }
        
        if (table.containsKing(IChessPiece.Color.Black))
            System.out.println("GANARON LAS NEGRAS!!!!");
        else
            System.out.println("GANARON LAS BLANCAS!!!!");
    }
    
}
