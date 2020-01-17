package chess

sealed trait Piece {
	def color: String
	def position: Tuple2[Int, Int]
	def legalMove: Boolean
}

final case class Pawn(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove: Boolean = ???
}

final case class Rook(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove: Boolean = ???
}

final case class Knight(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove: Boolean = ???
}

final case class Bishop(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove: Boolean = ???
}

final case class Queen(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove: Boolean = ???
}

final case class King(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove: Boolean = ???
}
