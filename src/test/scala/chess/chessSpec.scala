package chess

import org.scalatest._

class ChessSpec extends FunSpec {
  describe("Pawn") {
    it("has a color and a location") {
      val p = Pawn("white", (1, 2))
      assert(p.color == "white")
      assert(p.position == (1, 2))
    }
  }
}