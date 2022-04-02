import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
public class TeamZeta 
{
    public static void main(String[] args) 
    {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
    }
    
    public static void Check_level(int high, int low, String crop,CSVParser parser,String soil,int val)
    {
         for (CSVRecord record : parser) 
         {
             String cropN=record.get("crop_name");
             if(cropN==crop)
             {
                 for (CSVRecord record1 : parser) 
                 {
                     String soilT=record1.get("soil_type");
                     if(soilT==soil)
                     {
                         
                         
                     }
                 }
             }
         }
    }
}