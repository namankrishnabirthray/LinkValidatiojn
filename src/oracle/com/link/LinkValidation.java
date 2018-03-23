                      package oracle.com.link;

                      import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashSet;
                      import java.util.List;
                      import java.util.Set;

                      import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
                      import org.openqa.selenium.WebElement;
                      import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

                      public class LinkValidation {
	
	                   private static String[] links = null;
                       private static int linksCount = 0;
      

	                   static{
		
	                   System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe"); 
	                    }
		               public static void main(String[] args) throws Exception {
		
			           WebDriver driver=new ChromeDriver();
			
			
			  
	                   driver.get("https://www-stage.oracle.com/storage/index.html");
	                  
	                   HashSet<WebElement> linksize1=new HashSet<WebElement>(); 
	                   List<WebElement> linksize =  driver.findElements(By.tagName("a")); 
	                   for(WebElement links:linksize){
	                	          linksize1.add(links);
	                                                 }
	                  
	                  
	                  
	                    linksCount = linksize1.size();
	                    System.out.println("Total no of links Available: "+linksCount);
	                    
	                    links= new String[linksCount];
	                    System.out.println("List of links Available: ");  
	                  // print all the links from webpage 
	                    int count=0;
	                    for(int i=0;i< 30;i++)
	                      {
	                    	
	                     links[i] = linksize.get(i).getAttribute("href");

	                      } 
	                   
	                        count=0;
	                     for(int i=0;i< 30;i++)
	                     {
	                	 
	                    	 try{
	                    		 driver.navigate().to(links[i]); 
	                    	    }
	                    	 catch(Exception e){
	                    		 
	                    	 }
	                     Thread.sleep(3000);
	                     String s5= driver.getCurrentUrl();
	                     String titles=driver.getTitle();
	                     System.out.println(s5);
	                    String sA[] = s5.split("/"); 
	                     String s6 =sA[sA.length-1];
	                  
	                     String s7=new String("index.html");
	                     if(s6.compareTo(s7)==0){
	                	 System.out.println("Page titles is    "+" =  "+titles+"  URL is fail");
	                                        }
	                     else  {
	                	 String s8[]=s6.split("");
	                	 String  s9[]=s7.split("");
	                	 
	                	 if(s8[0].compareTo(s9[0])==0){
	                	 
	                	 
	                	 if(s8[0].compareTo(s9[0])==0)
	                		 {
	                			 
	                	 if(s8[1].compareTo(s9[1])==0){
	                		 
	                     if(s8[2].compareTo(s9[2])==0){
	                	 if(s8[3].compareTo(s9[3])==0){
	                	 if(s8[4].compareTo(s9[4])==0){
	                					 
	                	  if(s8[5].compareTo(s9[5])==0){
	                						 
	                	 if(s8[6].compareTo(s9[6])==0){
	                	 if(s8[7].compareTo(s9[7])==0){
	                								 
	                	 if(s8[8].compareTo(s9[8])==0){
	                	 if(s8[9].compareTo(s9[9])==0){
	                		 
	                		
	                		 
	                      System.out.println("Page titles is    "+" =  "+titles+"  URL DUPlicate Fail+ "); }}}}}}}}}}  
	      
	                	      }   
	                      else{ 	
	                	  System.out.println("Page titles is    "+" =  "+titles+"  URL is Pass ");
	                	      }
	                          }
	                        count++;
                           System.out.println(count);
	                 
	                          }
	                     driver.close();
		                       }                      
                              }        
	                  
	                  
	                  
	                  
	                 
	                          
	                	 
	                                                    
	                 
	                                          
	                  
	                  
	                          



