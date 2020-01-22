package chess

sealed trait Piece {
	def color: String
	def position: Tuple2[Int, Int]
	def legalMove(target: Tuple2[Int, Int]): Boolean
}

final case class Pawn(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = ???
}

final case class Rook(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = target match {
		case x if target == position => false
		case x if target._1 == position._1 => true
		case x if target._2 == position._2 => true
		case _ => false
	}
}

final case class Knight(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = ???
}

final case class Bishop(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = target match {
		case x if target == position => false
		case x if (target._1 - position._1).abs == (target._2 - position._2).abs => true
		case _ => false
	}
}

final case class Queen(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = ???
}

final case class King(color: String, position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = ???
}
