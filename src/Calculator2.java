public class Calculator2 {
    //Change tax and tip if you prefer different values
   
    
    public static double findTotal( int valorOriginal){       
        double taxa = 0.05, gorjeta = 0.15;
        
        
        valorOriginal += (valorOriginal * (taxa + gorjeta));
        return valorOriginal;
        
        
        //Calculate an individual's total after tax and tip
        //Print this value
    }
}
