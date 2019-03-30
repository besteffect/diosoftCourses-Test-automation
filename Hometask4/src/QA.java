/**

 */
public class QA extends Person implements Work {
    public QA(String name, String surname){
    }
    public void manualTesting(){
        System.out.println("QA does manual testing");
    }
    public void findBugs (){
        System.out.println("QA Found a bug");
    }
    public void returnToDev(){
        System.out.println("Story is back to Developer from QA");
    }
    public void verifyBug(){
        System.out.println("Verification of bugs by QA");
    }
    public void closeStory(){
        System.out.println("Story is closed by QA");
    }
    public void automateBug(){
        System.out.println("Bug is automated by QA");
    }
    public void closeBug(){
        System.out.println("QA closed bug");
    }

    @Override
    public void doJob() {
        takeStory();
        speakToBa();
        manualTesting();
        findBugs();
        returnToDev();
    }
}
