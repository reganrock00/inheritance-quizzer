
public class Askers
	{
			private String que;
			private String called;
			private String answer;
			
			
			public Askers(String q, String c, String a)
			{
				que = q;
				called = c;
				answer = a;
			}

			public String getCalled()
				{
					return called;
				}

			public void setCalled(String called)
				{
					this.called = called;
				}

			public String getQue()
				{
					return que;
				}

			public void setQue(String que)
				{
					this.que = que;
				}

			public String getAnswer()
				{
					return answer;
				}

			public void setAnswer(String answer)
				{
					this.answer = answer;
				}
	}
