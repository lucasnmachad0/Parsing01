    public class Parsing01 {
    public static void main(String[] args) {
        //preço da camisa
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        //Converer e imprimir shirtPrice como int
       int shirtPriceInt = Integer.parseInt(shirtPrice);
       System.out.println("O preco da camisa e $" + shirtPrice);
       
       // Converter e imprimir taxRate como double
       double taxRateDouble = Double.parseDouble(taxRate);
       System.out.println("A taxa de imposto e: " + taxRateDouble);
       
       // tentar converter gibberish para int (vai dar erro)
       try {
           int gibberishInt = Integer.parseInt(gibberish);
           System.out.println("O valor gibberish convertido para int e: " + gibberishInt);
       } catch (NumberFormatException e) {
           System.out.println("Erro ao converter gibberish para int: " + e.getMessage());
       }
    }
    
}
