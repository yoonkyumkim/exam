package test;

import java.text.ParseException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

class  LocaleTest
{
	public static void main(String[] args) 
	{
		// Print out a number using the localized number, integer, currency,
		 // and percent format for each locale
 Locale[] locales = NumberFormat.getAvailableLocales();
 double myNumber = -1234.56;
 NumberFormat form;
 for (int j=0; j<4; ++j) {
     System.out.println("FORMAT");
     for (int i = 0; i < locales.length; ++i) {
         if (locales[i].getCountry().length() == 0) {
            continue; // Skip language-only locales
         }
         locales[i].getDisplayName().startsWith("�ѱ�");
         if(locales[i].getDisplayName().startsWith("����") || locales[i].getDisplayName().startsWith("�ѱ�")){
        	 System.out.print(locales[i].getDisplayName());
        	 
         switch (j) {
         case 0:
             form = NumberFormat.getInstance(locales[i]); break;
         case 1:
             form = NumberFormat.getIntegerInstance(locales[i]); break;
         case 2:
             form = NumberFormat.getCurrencyInstance(locales[i]); break;
         default:
             form = NumberFormat.getPercentInstance(locales[i]); break;
         }
         if (form instanceof DecimalFormat) {
             System.out.print(": " + ((DecimalFormat) form).toPattern());
         }
         System.out.println(" -> " + form.format(myNumber));
         }
     }
 }
	}

}



//���������� �ٸ� ��ȭ�κ��̰� (�ѱ� - ��  �̱� - �޷�  ���� -?  ������-?)
