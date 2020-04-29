package chess

object Game extends App {
	val player1 = Seq(
            new WhitePawn((0, 1)),
            new WhitePawn((1, 1)),
            new WhitePawn((2, 1)),
            new WhitePawn((3, 1)),
            new WhitePawn((4, 1)),
            new WhitePawn((5, 1)),
            new WhitePawn((6, 1)),
            new WhitePawn((7, 1)),
            new Rook((0, 0)),
            new Knight((1, 0)),
            new Bishop((2, 0)),
            new Queen((3, 0)),
            new King((4, 0)),
            new Bishop((5, 0)),
            new Knight((6, 0)),
            new Rook((7, 0))
        )

    val player2 = Seq(
            new BlackPawn((0, 6)),
            new BlackPawn((1, 6)),
            new BlackPawn((2, 6)),
            new BlackPawn((3, 6)),
            new BlackPawn((4, 6)),
            new BlackPawn((5, 6)),
            new BlackPawn((6, 6)),
            new BlackPawn((7, 6)),
            new Rook((0, 7)),
            new Knight((1, 7)),
            new Bishop((2, 7)),
            new Queen((3, 7)),
            new King((4, 7)),
            new Bishop((5, 7)),
            new Knight((6, 7)),
            new Rook((7, 7))
        )
}