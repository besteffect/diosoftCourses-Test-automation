/**
 * Created by Smart on 2/22/2015.
 */
public class Developer extends Person implements Work {
    public Developer(String name, String surname) {
    }

    public void completeStory(){
        System.out.println("Developer completed story");
    }
    public void fixBugs(){
        System.out.println("Developer fixed bugs");
    }
    public void sendStoryToQA(){
        System.out.println("Developer sent story to QA");
    }

    @Override
    public void doJob() {
        takeStory();
        speakToBa();  // вызываю speakToBa из общего класса Person, потому что developer наследует person
        completeStory();
        sendStoryToQA();
    }
}