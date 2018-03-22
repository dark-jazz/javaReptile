package com.dark.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dark.pojo.Product;

/**  ���ߣ����ڱ� 
*    ���ڣ�2018��3��22�� ����8:00:33
*/
public class POItoExcel {
     public static void main(String[] args) {
		
	}
	public static void toExcel(List<Product> list) throws FileNotFoundException, IOException{
		 
        //�½��ĵ�   
        XSSFWorkbook workBook=new XSSFWorkbook();
        
        //������
        XSSFSheet sheet=workBook.createSheet();
        
           //�ϲ���ı���
      		CellRangeAddress cra=new CellRangeAddress(0,1, 0, 6);
      		sheet.addMergedRegion(cra);
      		//��ʾ���ı�Ϊ���Ͻǵ�����
      		Row row2=sheet.createRow(0);
      		Cell cell=row2.createCell(0);
      		cell.setCellValue("��Ʒ�۸��");
      		//���õ�Ԫ��ĸ�ʽ
      		CellStyle cs=workBook.createCellStyle();
      		cs.setAlignment(HorizontalAlignment.CENTER);
      		cs.setVerticalAlignment(VerticalAlignment.CENTER);
      		cs.setFillBackgroundColor((short) 59);
      	    cell.setCellStyle(cs);
      		
      		
      		//��ͷ
      		Row row=sheet.createRow(2);
      		
      		Cell cell11=row.createCell(0);
      		cell11.setCellValue("Ʒ��");
      		Cell cell22=row.createCell(1);
      		cell22.setCellValue("��ͼ�");
      		Cell cell33=row.createCell(2);
      		cell33.setCellValue("ƽ����");
      		Cell cell44=row.createCell(3);
      		cell44.setCellValue("��߼�");
      		Cell cell55=row.createCell(4);
      		cell55.setCellValue("���");
      		Cell cell66=row.createCell(5);
      		cell66.setCellValue("��λ");
      		Cell cell77=row.createCell(6);
      		cell77.setCellValue("��������");
      	    //���е�����
        
        
        
        
        
        
        
        
        
        for(int i=0;i<list.size();i++){
        //������
        XSSFRow row4=sheet.createRow(i+3);
      
      
        //������Ԫ��
        XSSFCell cell1=row4.createCell(0);
        XSSFCell cell2=row4.createCell(1);
        XSSFCell cell3=row4.createCell(2);
        XSSFCell cell4=row4.createCell(3);
        XSSFCell cell5=row4.createCell(4);
        XSSFCell cell6=row4.createCell(5);
        XSSFCell cell7=row4.createCell(6);
        	//�ڵ�Ԫ����д������
        cell1.setCellValue(list.get(i).getProductName());
        cell2.setCellValue(list.get(i).getLowerPrice());
        cell3.setCellValue(list.get(i).getAveragePrice());
        cell4.setCellValue(list.get(i).getMaxPrice());
        cell5.setCellValue(list.get(i).getSpecs());
        cell6.setCellValue(list.get(i).getUnit());
        cell7.setCellValue(list.get(i).getDate());
        }
         //������ĵ�д���ļ�
        workBook.write(new FileOutputStream(new File("")) );
        System.out.println("д��excel���");
        //�ر���
        workBook.close();
		
		
		
	}
     
     
}
