package MeyerBriggsPersonalityEvaluatorApp;

import java.util.Scanner;

public class MeyerBriggs {



    public static void meyerBriggsAnalysis(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("What is your name: ");
        String nameInput= scanner.nextLine();



        String [][] firstEntry=extrovertedIntrovertedQuestions();
        System.out.println();
       String [][] secondEntry=sensingIntuitiveQuestions();
        System.out.println();
        String [][] thirdEntry=thinkingFeelingQuestions();
        System.out.println();
       String [][] fourthEntry=judgingPerceptiveQuestions();
        System.out.println();

        System.out.println("Hello"+" "+nameInput+" "+"You selected");
        System.out.println();

       summaryExtraction(firstEntry);
        System.out.println();
       summaryExtraction(secondEntry);
        System.out.println();
       summaryExtraction(thirdEntry);
        System.out.println();
       summaryExtraction(fourthEntry);


      String firstPersonalityType=extrovertedIntrovertedType(personalityType(firstEntry));
      String secondPersonalityType=sensingIntuitiveType(personalityType(secondEntry));
      String thirdPersonalityType=thinkingFeelingType(personalityType(thirdEntry));
      String fourthPersonalityType=judgingPerceptiveType(personalityType(fourthEntry));

      String personalityCombination= firstPersonalityType+secondPersonalityType+thirdPersonalityType+fourthPersonalityType;
        System.out.println();
      personalityAnalysis(personalityCombination);



    }

    public static void personalityAnalysis(String personalityCombination ){
        switch (personalityCombination){
            case "ISTJ":
                System.out.println("""
                      ISTJ Personality Type
                     
                      WHO IS A LOGISTICIAN (ISTJ)?
                      
                      A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits.
                      These people tend to be reserved yet willful, with a rational outlook on life.
                      They compose their actions carefully and carry them out with methodical purpose.
                      
                      
                                                     
                      """);
                break;

            case "ISFJ":
                System.out.println("""
                      ISFJ Personality Type
                      
                      WHO IS A DEFENDER (ISFJ)?
                                            
                      A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits.
                      These people tend to be warm and unassuming in their own steady way.
                      They’re efficient and responsible, giving careful attention to practical details in their daily lives.
                                            
                      
                                            
                                           
                      """);
                break;
            case "ESTJ":
                System.out.println("""
                      ESTJ Personality Type
                      
                      WHO IS AN EXECUTIVE (ESTJ)?
                                            
                      An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits.
                      They possess great fortitude, emphatically following their own sensible judgment.
                      They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
                      
                      
                   
                      """);
                break;
            case "ESFJ":
                System.out.println("""
                      ESFJ Personality Type
                                            
                      WHO IS A CONSUL (ESFJ)?
                                            
                      A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits.
                      They are attentive and people-focused, and they enjoy taking part in their social community.
                      Their achievements are guided by decisive values, and they willingly offer guidance to others
                                            
                      """);
                break;
            case "INFJ":
                System.out.println("""
                      INFJ Personality Type  
                                           
                      WHO IS AN ADVOCATE (INFJ)?
                                              
                      An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits.
                      They tend to approach life with deep thoughtfulness and imagination.
                      Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
                       
                       
                                             
                                             
                                             
                       """);
                break;
            case "INFP":
                System.out.println("""
                      INFP Personality Type
                     
                      WHO IS A MEDIATOR (INFP)?
                                           
                      A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits.
                      These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and
                      creative approach to everything they do.
                      """);
                break;
            case"ENFJ":
                System.out.println("""
                      ENFJ Personality Type 
                      
                      WHO IS A PROTAGONIST (ENFJ)?
                                            
                      A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits.
                      These warm, forthright types love helping others, and they tend to have strong ideas and values.
                      They back their perspective with the creative energy to achieve their goals.
                    
                                            
                      
                                          
                                            
                      """);
                break;
            case"ENFP":
                System.out.println("""
                      ENFP Personality Type
                                            
                      WHO IS A CAMPAIGNER (ENFP)?
                                            
                      A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits.
                      These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others.
                      Their vibrant energy can flow in many directions.
                      """);
                break;
            case"INTJ":
                System.out.println("""
                      INTJ Personality Type
                                            
                      WHO IS AN ARCHITECT (INTJ)?
                                            
                      An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits.
                      These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. 
                      Their inner world is often a private, complex one.
                      """);
                break;
            case"INTP":
                System.out.println("""
                      INTP Personality Type
                                            
                      WHO IS A LOGICIAN (INTP)?
                                            
                      A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits.
                      These flexible thinkers enjoy taking an unconventional approach to many aspects of life.
                      They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                      """);
                break;
            case"ENTJ":
                System.out.println("""
                      ENTJ Personality Type
                                            
                      WHO IS A COMMANDER (ENTJ)?
                                            
                      A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits.
                      They are decisive people who love momentum and accomplishment. They gather information to construct their creative
                      visions but rarely hesitate for long before acting on them.
                      """);
                break;
            case"ENTP":
                System.out.println("""
                      ENTP Personality Type
                                            
                      WHO IS A DEBATER (ENTP)?
                                            
                      A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits.
                      They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.
                      They pursue their goals vigorously despite any resistance they might encounter.
                      """);
                break;
            case"ISTP":
                System.out.println("""
                      ISTP Personality Type
                                            
                      WHO IS A VIRTUOSO (ISTP)?
                                            
                      A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits.
                      They tend to have an individualistic mindset, pursuing goals without needing much external connection.
                      They engage in life with inquisitiveness and personal skill, varying their approach as needed
                      """);
                break;
            case"ISFP":
                System.out.println("""
                      ISFP Personality Type
                                            
                      WHO IS AN ADVENTURER (ISFP)?
                                            
                      An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits.
                      They tend to have open minds, approaching life, new experiences, and people with grounded warmth.
                      Their ability to stay in the moment helps them uncover exciting potentials.
                      """);
                break;
            case"ESTP":
                System.out.println("""
                      ESTP Personality Type
                                            
                      WHO IS AN ENTREPRENEUR (ESTP)?
                                            
                      An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits.
                      They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. 
                      They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
                      """);
                break;
            case"ESFP":
                System.out.println("""
                      ESFP Personality Type
                                            
                      WHO IS AN ENTERTAINER (ESFP)?
                                            
                      An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits.
                      These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
                      They can be very social, often encouraging others into shared activities.
                      """);
                break;









        }




    }

    public static String personalityType(String [][] response){

        int countA=0;
        int countB=0;

        for (int index=0; index< response.length; index++){
            for (int innerIndex=0; innerIndex<response[index].length-1;innerIndex++){

                if (response[index][0].equals("A")){
                    countA++;
                }
                else {
                    countB++;
                }


            }
        }

        if (countA>countB){
            return "A";
        }
        else return "B";

    }
    public static void summaryExtraction(String [][] response){

        int countA=0;
        int countB=0;

        for (int index=0; index< response.length; index++){
            for (int innerIndex=0; innerIndex<response[index].length-1;innerIndex++){

                if (response[index][0].equals("A")){
                    System.out.println(response[index][1]);
                    countA++;
                }
                else {
                    System.out.println(response[index][1]);
                    countB++;
                }


            }
        }
        System.out.println("Number of A Selected: "+countA);
        System.out.println("Number of B Selected: "+countB);

    }

    public static String[][] extrovertedIntrovertedQuestions(){

        String [][]extrovertedIntroverted = {{"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"},
                {"A. more outgoing, think out loud", "B. more reserved, think to yourself "},
                {"A. seek many tasks, public activities, interaction with others","B. seek private, solitary activities with quiet to concentrate"},
                {"A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"},
                {"A. active, initiate ","B. reflective, deliberate"}
        };
        Scanner scanner=new Scanner(System.in);

        int countA=0;
        int countB=0;

       String[] [] extrovertedIntrovertedArray=new String[5][2];


        for (int i=0; i< extrovertedIntroverted.length; i++){

            String A=extrovertedIntroverted[i][0];
            String B=extrovertedIntroverted[i][1];




                System.out.println(extrovertedIntroverted[i][0]+"\t"+extrovertedIntroverted[i][1]);


                System.out.print("choose A or B: ");
                String response = scanner.nextLine();

              while ( !response.equals("A")&&!response.equals("B")&&!response.equals("a")&&!response.equals("b")) {
                 System.out.println("Expected A or B as response, try again: ");
                   response = scanner.nextLine();

                }

                if (response.equals("a") || response.equals("A")){

                    extrovertedIntrovertedArray[i][0]="A";
                    extrovertedIntrovertedArray[i][1]=A;


                }
                else {
                    extrovertedIntrovertedArray[i][0] = "B";
                    extrovertedIntrovertedArray[i][1]=B;
                }



            }
        return extrovertedIntrovertedArray;







    }
    public static  String [][] sensingIntuitiveQuestions(){

        String [][]sensingIntuitive = {{"A. interpret literally","B. look for meaning and possibilities"},
                {"A. practical, realistic, experiential","B. imaginative, innovative,theoretical"},
                {"A. standard, usual, conventional","B. different, novel, unique"},
                {"A. focus on here-and-now","B. look to the future, global perspective, “big picture”"},
                {"A. facts, things, “what is”", "B. ideas, dreams, “what could be,”philosophical"}
        };
        Scanner scanner=new Scanner(System.in);



        String[] [] sensingIntuitiveArray=new String[5][2];


        for (int i=0; i< sensingIntuitive.length; i++){

            String A=sensingIntuitive[i][0];
            String B=sensingIntuitive[i][1];




            System.out.println(sensingIntuitive[i][0]+"\t"+sensingIntuitive[i][1]);


            System.out.print("choose A or B: ");
            String response = scanner.nextLine();

            while ( !response.equals("A")&&!response.equals("B")&&!response.equals("a")&&!response.equals("b")) {
                System.out.println("Expected A or B as response, try again: ");
                response = scanner.nextLine();

            }

            if (response.equals("a") || response.equals("A")){

                sensingIntuitiveArray[i][0]="A";
                sensingIntuitiveArray[i][1]=A;


            }
            else {
                sensingIntuitiveArray[i][0] = "B";
                sensingIntuitiveArray[i][1]=B;
            }



        }
        return sensingIntuitiveArray;



    }

    public static String[][] thinkingFeelingQuestions(){

        String [][] thinkingFeeling = {{"A. logical, thinking, questioning","B. empathetic, feeling, accommodating"},
                {"A. candid, straight forward, frank","B. tactful, kind, encouraging"},
                {"A. firm, tend to criticize, hold the line","B. gentle, tend to appreciate,conciliate"},
                {"A. tough-minded, just ","B. tender-hearted, merciful"},
                {"A. matter of fact, issue-oriented","B. sensitive, people-oriented,compassionate"}
        };
        Scanner scanner=new Scanner(System.in);



        String[] [] thinkingFeelingArray=new String[5][2];


        for (int i=0; i< thinkingFeeling.length; i++){

            String A=thinkingFeeling[i][0];
            String B=thinkingFeeling[i][1];




            System.out.println(thinkingFeeling[i][0]+"\t"+thinkingFeeling[i][1]);


            System.out.print("choose A or B: ");
            String response = scanner.nextLine();

            while ( !response.equals("A")&&!response.equals("B")&&!response.equals("a")&&!response.equals("b")) {
                System.out.println("Expected A or B as response, try again: ");
                response = scanner.nextLine();

            }

            if (response.equals("a") || response.equals("A")){

                thinkingFeelingArray[i][0]="A";
                thinkingFeelingArray[i][1]=A;


            }
            else {
                thinkingFeelingArray[i][0] = "B";
                thinkingFeelingArray[i][1]=B;
            }



        }
        return thinkingFeelingArray;



    }

    public static String[][] judgingPerceptiveQuestions(){

        String [][] judgingPerceptive = {{"A. organized, orderly","B. flexible, adaptable"},
                {"A. plan, schedule","B. unplanned, spontaneous"},
                {"A. regulated, structured","B. easy going, “live” and “let live”"},
                {"A. preparation, plan ahead","B. go with the flow, adapt as you go"},
                {"A. control, govern","B. latitude, freedom"}
        };
        Scanner scanner=new Scanner(System.in);



        String[] [] judgingPerceptiveArray=new String[5][2];


        for (int i=0; i< judgingPerceptive.length; i++){

            String A=judgingPerceptive[i][0];
            String B=judgingPerceptive[i][1];




            System.out.println(judgingPerceptive[i][0]+"\t"+judgingPerceptive[i][1]);


            System.out.print("choose A or B: ");
            String response = scanner.nextLine();

            while ( !response.equals("A")&&!response.equals("B")&&!response.equals("a")&&!response.equals("b")) {
                System.out.println("Expected A or B as response, try again: ");
                response = scanner.nextLine();

            }

            if (response.equals("a") || response.equals("A")){

                judgingPerceptiveArray[i][0]="A";
                judgingPerceptiveArray[i][1]=A;


            }
            else {
                judgingPerceptiveArray[i][0] = "B";
                judgingPerceptiveArray[i][1]=B;
            }



        }
        return judgingPerceptiveArray;




    }

    public static  String extrovertedIntrovertedType(String countAorB){

        if (countAorB.equals("A"))
            return "E";
        else return "I";

    }

    public static String sensingIntuitiveType(String countAorB){
        if (countAorB.equals("A"))
            return "S";
        else return "N";

    }
    public static String thinkingFeelingType(String countAorB){
        if (countAorB.equals("A"))
            return "T";
        else return "F";

    }
    public static String judgingPerceptiveType(String countAorB){
        if (countAorB.equals("A"))
            return "J";
        else return "P";

    }


}


