
/**
 * Write a description of geneanddna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class geneanddna {
    public String findgeneindna(String dna)
    {
        String result="";
        int startindex=dna.indexOf("ATG");
       
        if (startindex == -1)
        {
              return "Fuck..!!! ATG not found";
        }
        int stopindex=dna.indexOf("TAA",startindex+3);
        if (stopindex == -1)
        {
              return "Fuck..!!! TAA not found";
        }
        result = dna.substring(startindex,stopindex+3);
        return result;
    }
        
    public void test()
    {
        // String dna="GTCTGCAGTCGTATATGACGTGTACGTAGTCTAGTAATGACGTAGTACGTAGATGGGCTA";
        String dna="GTCTGCATGCGTAGTGATACGTGTACGTAGTCTAGTATATTGACGTAGTACGTAGATTGGGCTA";
        System.out.println("Dna is " + dna);
        String gene=findgeneindna(dna);
        System.out.println("Gene is " + gene);
        
        

}
}


