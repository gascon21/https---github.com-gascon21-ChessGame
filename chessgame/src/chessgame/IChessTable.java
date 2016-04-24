package chessgame;

public interface IChessTable {
    IChessPiece[]   getPieces();
    IChessPiece[]   getPieces(IChessPiece.Color PieceColor);
    IChessPiece     getPieceAt(int Index);
    int             getPieceCount();
    IChessPiece     getPieceAt(PiecePosition Position);
    void            removePieceAt(PiecePosition Position);
    boolean         movePieceAt(IChessPiece Piece, PiecePosition Position);
    boolean         containsKing(IChessPiece.Color PieceColor);
}
