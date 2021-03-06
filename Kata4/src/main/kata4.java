package main;
import java.io.IOException;
import view.MailListReader;
import model.Mail;
import view.MailHistogramBuilder;
import model.Histogram;
import view.HistogramDisplay;
import java.util.List;

public class kata4 {
    
    static List<Mail> listMails;
    static Histogram c;
    
    public static void main(String[] args) throws IOException{
    	input();
        process();
        output();
    }
    

    
    public static void input() throws IOException{
        MailListReader a = new MailListReader();
        listMails = a.read("C:\\Users\\Armando\\Desktop\\a.txt");
    }
    
    public static void process(){
        MailHistogramBuilder b = new MailHistogramBuilder();
        c = b.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(c).execute();
    }
}