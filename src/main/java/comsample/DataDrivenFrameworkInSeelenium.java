//package comsample;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class DataDrivenFrameworkInSeelenium {
//
//	public static void main(String[] args) throws FileNotFoundException {
//		
//		
//		FileInputStream file = new FileInputStream("C:\\Users\\tpatil\\OneDrive - Sopra Steria\\input.xlsx"); //outputstream
//	
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		
//		int NumRows = sheet.getLastRowNum();
//		NumRows = NumRows + 1;
//		
//		int NumCols = sheet.getRow(0).getLastCellNum();
//		
//		System.out.println("Numbe of rows:" + NumRows);
//		System.out.println("Numbe of rows:" + NumCols);
//		
//		for(int r=0; r<NumRows; r++) {
//			XSSFRow Row = sheet.getRow(r); //createrow
//			for(int c=0; c<NumCols; c++) {
//				XSSFCell cell = row.getCell(c); //createcell //cell.setcellvalues("selenium")
//				System.out.print(cell + "  ");
//			}
//			System.out.println();
//		}//workbook.write(file);
//		workbook.close();
//		file.close();
//		
//	}
//
//}
