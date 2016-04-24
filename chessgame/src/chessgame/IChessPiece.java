package chessgame;

public interface IChessPiece {
    
    enum Color {
        Black,
        White
    }
    
    String          getName();
    Color           getColor();
    PiecePosition[] getAvailablePositions();
    // Para los pro que quieran optar a más nota, descomentar esto
    // PiecePosition   getPosition();
    // Para los pata negra que quieran optar a más nota, descomentar esto
    // void         moveToPosition(PiecePosition Position);
}
