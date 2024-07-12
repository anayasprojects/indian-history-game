import java.util.Scanner;

public class HistoryGame {

    public static String line(String[] options) {
        String answer = "";
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                answer = in.nextLine();
            } catch (Exception e) {
                System.out.println("This is not a proper answer. Please retry. Answer " + options[0] + " or " + options[1] + ".");
            }
            
            for (String opt : options) {
                if (answer.toLowerCase().equals(opt)) {
                    return answer.toLowerCase();
                }
            }
            System.out.println("This is not a proper answer. Please retry. Answer " + options[0] + " or " + options[1] + ".");
        }
    }

    public static void quit() {
        String q1 = "You are a farmer in Champaran, India in 1917. When the British took over your town a few years ago, you were forced to switch from farming rice to farming indigo. The British buy your indigo at extremely low prices, and you are barely paid for your labor, so you suffer from extreme poverty like most of your neighbors. One day, a man named Mahatma Gandhi arrives in your village. He gathers nearby farmers, including you, and organizes a protest of the tinkathia system, the oppressive system forcing farmers to farm indigo. The British give way, and you are free to farm rice again, thanks to Gandhi. He invites you to move to his ashram, Sabarmati, and free more people from the oppressive British rule. Do you STAY or LEAVE?";
        System.out.print("\033[H\033[2J");
        System.out.flush();
        print(q1);
    }
    public static void print(String str) {
        int index = 0;
        System.out.println();
        while (index < str.length()) {
            
            int lineLength = Math.min(str.length() - index, 90);
            int endIndex = index + lineLength;
    
            
            if (endIndex < str.length() && str.charAt(endIndex) != ' ') {
                while (endIndex > index && str.charAt(endIndex) != ' ') {
                    endIndex--;
                }
                if (endIndex == index) {
                    
                    endIndex = index + lineLength;
                }
            }
    
            System.out.println(str.substring(index, endIndex).trim());
            index = endIndex + 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String q1 = "You are a farmer in Champaran, India in 1917. When the British took over your town a few years ago, you were forced to switch from farming rice to farming indigo. The British buy your indigo at extremely low prices, and you are barely paid for your labor, so you suffer from extreme poverty like most of your neighbors. One day, a man named Mahatma Gandhi arrives in your village. He gathers nearby farmers, including you, and organizes a protest of the tinkathia system, the oppressive system forcing farmers to farm indigo. The British give way, and you are free to farm rice again, thanks to Gandhi. He invites you to move to his ashram, Sabarmati, and free more people from the oppressive British rule. Do you STAY or LEAVE?";
        String[] a1s = { "stay", "leave" };
        String a1 = "";
        String q2 = "You continue growing your rice in peace. You earn back the money you lost farming indigo and enjoy a modest life in Champaran. 3 years after Gandhi freed you, you hear he is visiting your village again. When he visits, he tells you that he is starting a movement called the Non-Cooperation Movement. His goal is to boycott British goods, especially clothes, by having civilians sew their own clothing which is currently illegal. There is a high chance of being arrested as a clothes-maker, but the movement could help free India from British rule. Do you decide to MAKE your own clothes or BUY clothes from your friend who is participating?";
        String[] a2s = { "make", "buy" };
        String a2 = "";
        String responseMake = "You get arrested for making your own clothes, but the movement has a massive effect on rallying support for India’s independence, and you played a role in it! After a year of prison, you are let go, and you return to Champaran. ";
        String responseBuy = "The merchant you buy clothes from gets arrested, but you are safe. The countrywide movement has a massive effect on rallying support for India’s independence, and you played a role in it! You return to your peaceful life of farming rice.";
        String q3 = "You move to Sabarmati Ashram and enjoy a calm life as you work with Gandhi. One day, 3 years after the indigo protests, Gandhi visits your house. He is starting a new movement called the Non-Cooperation Movement. His goal is to boycott British goods, especially clothes, by having civilians sew their own clothing which is currently illegal. He wants you to travel around India with him and convince civilians to take part. However, it could be dangerous to you. Do you TRAVEL with him or STAY at the ashram and participate from home?";
        String[] a3s = { "travel", "stay" };
        String a3 = "";
        String responseTravel = "You travel with Gandhi around India, and you help convince thousands of people to take part in the movement. They make their own clothes and realize that the British government is oppressive in nature. The movement has a massive effect on rallying support for India’s independence, and you played a big role in it! After a few years of traveling, you return home to Sabarmati Ashram.";
        String responseStay = "You work hard at home, making your own clothes and supporting Gandhi from Sabarmati and supporting the cause. Gandhi returns home, and you listen as he describes the incredible support he encountered throughout India. He inspired many people to want to revolt against the British government, and garnered support throughout the country.";
        String q4 = "You spend a decade working peacefully at home and growing rice. Eventually, you hear news that Gandhi is in your village. You make your way to the town commons and listen as he explains his plan. He has been planning a movement to march to Navsari to defy the British Salt Laws. To make his own salt will be a direct violation of the British Empire. He plans to take a large group of people with him to protest. You are fearful that you may be arrested by the police, injured, or killed. Will you GO to the protest or STAY home and wait?";
        String[] a4s = {"go", "stay"};
        String a4 = "";
        String responseGo4 = "The march was long. Days passed as you traveled through villages with Gandhi, and as you stopped for rest, more and more people joined the march. By the time you reach the ocean, there are tens of thousands of people participating in the Salt Satyagraha, or act of civil disobedience. You see Gandhi reach down and pick up a piece of salt from the mud. He boils it, making his own salt and breaking the law of the British Empire. As you and thousands of others follow, the police come and arrest you all, including Gandhi. ";
        String responseStay4 = "You hear from a friend that Gandhi’s march has amassed tens of thousands of people. He apparently reached the ocean and successfully began to make his own salt, breaking the law of the British Empire. He and the rest were arrested, but the movement sparked similar others throughout India. Overall, the Salt Satyagraha, or act of civil disobedience, was successful in promoting the fight for independence.";
        String ifArr = "However, the police recognize you as the clothing maker they arrested before! Unfortunately, you are sentenced to a lifetime in prison for repeat offenses.";
        String ifNotArr = "You are later released from prison and return to Sabarmati.";
        String q5 = "You spend a decade working peacefully at Sabarmati Ashram. Eventually, Gandhi starts talking about a new protest. He has been planning a movement to march to Navsari to defy the British Salt Laws. To make his own salt will be a direct violation of the British Empire. He plans to take a large group of people with him to protest. You are fearful that you may be arrested by the police, injured, or killed. Will you GO to the protest or STAY home and wait?";
        String[] a5s = { "go", "stay" };
        String a5 = "";
        String responseGo5 = "The march was long. Days passed as you traveled through villages with Gandhi, and as you stopped for rest, more and more people joined the march. By the time you reach the ocean, there are tens of thousands of people participating in the Salt Satyagraha, or act of civil disobedience. You see Gandhi reach down and pick up a piece of salt from the mud. He boils it, making his own salt and breaking the law of the British Empire. As you and thousands of others follow, the police come and arrest you all, including Gandhi. You are later released from prison and return to Sabarmati.";
        String responseStay5 = "You hear from a friend that Gandhi’s march has amassed tens of thousands of people. He apparently reached the ocean and successfully began to make his own salt, breaking the law of the British Empire. He and the rest were arrested, but the movement sparked similar others throughout India. Overall, the Salt Satyagraha, or act of civil disobedience, was successful in promoting the fight for independence.";
        String closing = "In 1942, India is finally freed. You and everyone cheer and celebrate wholeheartedly as the British return home. 5 years later, India is partitioned into 2 countries of Pakistan and India. The violent divide along religious borders marks the start of two new countries and a new era for South Asia.";
        String stats = "This project is completely written and coded in Java by yours truly. It has 8 different endings and 17 different paragraphs. All information is well-researched and as accurate as possible. Thank you for enjoying it!";


        boolean game = true;
        while (game) {
            
            quit();
            
            a1  = line(a1s);
            if (a1.equals("stay")) {

                print(q2);
                a2 = line(a2s);
                if(a2.equals("make")){
                    print(responseMake);
                } else if(a2.equals("buy")){
                    print(responseBuy);
                }

                print(q4);
                a4 = line(a4s);

                if(a4.equals("go")){

                    if(a2.equals("make")){
                        print(responseGo4 + ifArr);
                    } else if(a2.equals("buy")){
                        print(responseGo4 + ifNotArr);
                    }
                } else if(a4.equals("stay")){
                    print(responseStay4);
                }
                
            } 
            
            
            else if (a1.equals("leave")) {
                
                print(q3);
                a3 = line(a3s);
                if(a3.equals("travel")){
                    print(responseTravel);
                } else if(a3.equals("buy")){
                    print(responseStay);
                }

                print(q5);
                a5 = line(a5s);

                if(a5.equals("go")){
                    print(responseGo5);
                } else if(a5.equals("stay")){
                    print(responseStay5);
                }

            }
            
            print(closing);
            
            print(stats);
            String[] ends = {"quit", "restart"};
            String end = line(ends);
            quit();
        }
    }

}