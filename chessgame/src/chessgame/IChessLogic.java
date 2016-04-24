package chessgame;

public interface IChessLogic {
    boolean performNextMovement(IChessTable Table, IChessPiece.Color PlayerColor);
}
