/**
 Создать класс Team, в котором мы соберем наших "работничков" и насоздаем методы, которые будут характеризовать наш рабочий процесс:
 */
public class Team {
    public static void main(String[] args){
        BA ba =new BA("Lyudmila", "Akatenkova");
        QA qa=new QA("Vitalii", "Sviderskyi");
        Developer developer=new Developer("Andrey", "Volovik");

        ba.doJob();  //вызываю методы ПООЧЕРЕДНО;
        developer.doJob();
        qa.doJob();
        developer.fixBugs();
        developer.sendStoryToQA();
        qa.verifyBug();
        qa.closeBug();
        qa.automateBug();
        qa.closeStory();
    }

}
