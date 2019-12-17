import org.scalatest.FunSuite

class TestMyMath extends FunSuite {

  test("2 + 2 == 4, quick mafs") {
    //Arrange
      // Nothing
    // Act
    val result = MyMath.plusTwo(2)

    // Assert
    assert(result==4)
  }
}
