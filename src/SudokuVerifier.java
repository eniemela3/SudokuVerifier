

public class SudokuVerifier {
	
	public static int sudokuLength = 81;
	
	public int verify(String solution) {
		if (!checkLength(solution) || !checkInteger(solution)) {
			return -1;
		}
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	public boolean checkLength(String solution) {
		if (solution.length() == sudokuLength) {
			return true;
		}
		return false;
	}
	
	public boolean checkInteger(String solution) {
		try { 
		    Integer.parseInt(solution); 
		} catch(NumberFormatException e) { 
			return false; 
		} catch(NullPointerException e) {
		    return false;
		}
		int i = Integer.parseInt(solution);
		if ((i > 0) && !(solution.contains("0"))) {
		    return true;
		} else {
			return false;
		}
	}
	
	public boolean checkRows(String solution) {
		int index;	
		int rowCounter = 0;
		while (rowCounter < 9) {
			index = 1;
			String row = solution.substring(rowCounter*9, rowCounter*9 + 9);
			for (char c: row.toCharArray()) {
				if (row.substring(index).contains(""+c)) {
					return false;
				}
				index++;
			}
			rowCounter++;
		}		
		return true;
	}
	
	public boolean checkColumns(String solution) {
		int rowIndex = 0;	
		int columnIndex = 0;
		int substrIndex = 1;
		String column = "";
		String substr = "";
		while (columnIndex < 9) {
			while (rowIndex < 9) {
				substr = solution.substring(rowIndex*9 + columnIndex, rowIndex*9 + columnIndex + 1);
				column += substr;
				rowIndex++;
			}
			for (char c: column.toCharArray()) {
				System.out.println(c);
				System.out.println(column.substring(substrIndex));
				/*if (column.substring(substrIndex).charAt(c) > 0) {
					return false;
				} else {*/
					substrIndex++;
				//}
			}
			columnIndex++;
		}

		
		
		return true;
	}
}
