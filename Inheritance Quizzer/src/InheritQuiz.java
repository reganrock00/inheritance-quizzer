import java.util.*;
import java.io.*;

public class InheritQuiz
	{
		static int numberOfQuestions, rightAnswers, arrayNum;
		public static void main(String[] args)
			{
				start();
			}
		
		public static void start()
			{
				Scanner in = new Scanner(System.in);
				System.out.println("How many questions do you want?");
				numberOfQuestions = in.nextInt();
				
				ArrayList <Askers> questions = new ArrayList <Askers>();
				questions.add(new Askers("Vehicle v = new Vehicle( );", "v.maekNoise;", "HUUUUMMMMMMMM"));
				questions.add(new Askers("Vehicle v = new Vehicle( );", "v.shouldMove;", "*moves"));
				questions.add(new Askers("Vehicle v = new Car( );", "v.haveWheels", "It do!!!"));
				questions.add(new Askers("Vehicle v = new Car( );", "v.maekNoise", "VROOM"));
				questions.add(new Askers("Car v = new Vehicle( );", "v.haveWheels", "does not run"));
				questions.add(new Askers("Car v = new Car( );", "v.maekNoise", "VROOM"));
				questions.add(new Askers("Car v = new Car( );", "v.haveWheels", "IT do!!!"));
				
				for (int i = 0; i < numberOfQuestions; i++)
					{
						arrayNum = (int)(Math.random()*6);
						System.out.println(questions.get(arrayNum).getQue());
						System.out.println(questions.get(arrayNum).getCalled());
					}
			}

	}
