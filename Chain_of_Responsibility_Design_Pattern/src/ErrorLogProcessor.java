public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor next) {
        super(next);
    }

    public void log(int logLevel,String message) {
        if(logLevel==ERROR){
            System.out.println("Error"+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
