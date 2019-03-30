/**
 * Created by Smart on 2/22/2015.
 */
public class BA extends Person implements Work {
    public BA (String name, String surname){
//        this.name=name;
//        this.surname=surname;
   }
    public void createStory(){
        System.out.println("BA. New story created");
    }
    public void planMeeting(){
        System.out.println("ba. Meeting is planned");
    }

    @Override
    public void doJob() {
        createStory();
        planMeeting();

    }
}
