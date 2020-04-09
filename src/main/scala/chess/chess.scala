package chess

sealed trait Piece {
	def position: Tuple2[Int, Int]
	def legalMove(target: Tuple2[Int, Int]): Boolean
	
	def diagonalMotion(origin: Tuple2[Int, Int], target: Tuple2[Int, Int]): Boolean = target match {
		case x if target == origin => false
		case x if (target._1 - origin._1).abs == (target._2 - origin._2).abs => true
		case _ => false
	}
	
	def rectilinearMotion(origin: Tuple2[Int, Int], target: Tuple2[Int, Int]): Boolean = target match {
		case x if target == origin => false
		case x if target._1 == origin._1 => true
		case x if target._2 == origin._2 => true
		case _ => false
	}
}

final case class BlackPawn(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = ???
}

final case class WhitePawn(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = ???
}

final case class Rook(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean =
		rectilinearMotion(position, target)
}

final case class Knight(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = target match {
		case x if target == position => false
		case x if (target._1 - position._1).abs == 1 && (target._2 - position._2).abs == 2 => true
		case x if (target._1 - position._1).abs == 2 && (target._2 - position._2).abs == 1 => true
		case _ => false
	}
}

final case class Bishop(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean =
		diagonalMotion(position, target)
}

final case class Queen(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = 
		diagonalMotion(position, target) || rectilinearMotion(position, target)
}

final case class King(position: Tuple2[Int, Int]) extends Piece {
	def legalMove(target: Tuple2[Int, Int]): Boolean = 
		(diagonalMotion(position, target) || rectilinearMotion(position, target)) && (target._1 - position._1).abs <= 1 && (target._2 - position._2).abs <= 1
}
