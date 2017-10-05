import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void checkLengthIs81() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertTrue(sudoku.checkLength("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}
	
	@Test
	public void checkLengthLessThan81() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkLength("41736982563215894795872431682543716979158643234691275828964357157329168416487529"));
	}

	@Test
	public void checkLengthMoreThan81() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkLength("4173698256321589479587243168254371697915864323469127582896435715732916841648752931"));
	}
	
	@Test
	public void checkSudokuLength() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertEquals(sudoku.sudokuLength, 81);
	}
	
	@Test
	public void checkContainsZero() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkInteger("417369825632158947958724316825437169791586432346012758289643571573291684164875293"));
	}
	
	@Test
	public void checkContainsLetter() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkInteger("417369825632158947958724316825437169791586432346a12758289643571573291684164875293"));
	}
	
	@Test
	public void checkIsNegative() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkInteger("-17369825632158947958724316825437169791586432346012758289643571573291684164875293"));
	}
	
	@Test
	public void checkIncorrectRow() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkRows("447369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}
	
	@Test
	public void checkCorrectRow() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertTrue(sudoku.checkRows("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}
	
	@Test
	public void checkIncorrectColumn() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertFalse(sudoku.checkColumns("417369825632158947958724316825437169791586432346912758289643571573291683164875293"));
	}
	
	@Test
	public void checkCorrectColumn() {
		SudokuVerifier sudoku = new SudokuVerifier();
		assertTrue(sudoku.checkColumns("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}
}
