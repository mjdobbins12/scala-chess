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
  
  describe("Bishop") {
    it("is allowed to move diagonally") {
      val b = Bishop("white", (2, 0))
      assert(b.legalMove((0, 2)) == true)
      assert(b.legalMove((4, 2)) == true)
    }
    
    it("cannot move vertically or laterally") {
      val b = Bishop("white", (2, 0))
      assert(b.legalMove((2, 2)) == false)
      assert(b.legalMove((4, 0)) == false)
    }
    
    it("cannot move to a random square") {
      val b = Bishop("white", (2, 0))
      assert(b.legalMove((5, 6)) == false)
    }
  }
  
  describe("Knight") {
    it("moves in its goofy manner") {
      val k = Knight("white", (1, 0))
      assert(k.legalMove((0, 2)) == true)
      assert(k.legalMove((2, 2)) == true)
    }
    
    it("cannot move like a rook") {
      val k = Knight("white", (1, 0))
      assert(k.legalMove((3, 0)) == false)
      assert(k.legalMove((1, 3)) == false)
    }
    
    it("cannot move diagonally") {
      val k = Knight("white", (1, 0))
      assert(k.legalMove((3, 2)) == false)
    }
    
    it("cannot move to a random square") {
      val k = Knight("white", (1, 0))
      assert(k.legalMove((3, 6)) == false)
    }
  }
  
  describe("Queen") {
    it("can move vertically") {
      val q = Queen("white", (4, 0))
      assert(q.legalMove((4, 4)) == true)
    }
    
    it("can move laterally") {
      val q = Queen("white", (4, 0))
      assert(q.legalMove((7, 0)) == true)
    }
    
    it("can move diagonally") {
      val q = Queen("white", (4, 0))
      assert(q.legalMove((6, 2)) == true)
    }
    
    it("cannot move like a knight") {
      val q = Queen("white", (4, 0))
      assert(q.legalMove((5, 2)) == false)
    }
    
    it("cannot move to a random square") {
      val q = Queen("white", (4, 0))
      assert(q.legalMove((1, 6)) == false)
    }
  }
  
  describe("King") {
    it("can move one square vertically") {
      val k = King("white", (5, 0))
      assert(k.legalMove((5, 1)) == true)
    }
    
    it("cannot move multiple squares vertically") {
      val k = King("white", (5, 0))
      assert(k.legalMove((5, 2)) == false)
    }
    
    it("can move one square laterally") {
      val k = King("white", (5, 0))
      assert(k.legalMove((4, 0)) == true)
    }
    
    it("cannot move multiple squares laterally") {
      val k = King("white", (5, 0))
      assert(k.legalMove((3, 0)) == false)
    }
    
    it("can move one square diagonally") {
      val k = King("white", (5, 0))
      assert(k.legalMove((4, 1)) == true)
    }
    
    it("cannot move more than one square diagonally") {
      val k = King("white", (5, 0))
      assert(k.legalMove((3, 2)) == false)
    }
    
    it("cannot move like a knight") {
      val k = King("white", (5, 0))
      assert(k.legalMove((6, 2)) == false)
    }
    
    it("cannot move to a random square") {
      val k = King("white", (4, 0))
      assert(k.legalMove((6, 6)) == false)
    }
  }
}