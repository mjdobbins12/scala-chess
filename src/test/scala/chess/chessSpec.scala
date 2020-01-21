package chess

import org.scalatest._

class ChessSpec extends FunSpec {
  describe("Pawn") {
    it("has a color and a location") {
      val p = Pawn("white", (0, 1))
      assert(p.color == "white")
      assert(p.position == (0, 1))
    }
  }
  
  describe("Rook") {
    it("is allowed to move laterally") {
      val r = Rook("white", (0, 0))
      assert(r.legalMove((0, 3)) == true)
    }
    
    it("is allowed to move vertically") {
      val r = Rook("white", (0, 0))
      assert(r.legalMove((3, 0)) == true)
    }
    
    it("cannot move diagonally") {
      val r = Rook("white", (0, 0))
      assert(r.legalMove((3, 3)) == false)
    }
    
    it("cannot move to a random square") {
      val r = Rook("white", (0, 0))
      assert(r.legalMove((5, 3)) == false)
    }
  }
}