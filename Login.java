class Login 
{
  protected String credentials = "admin@vit";        // password of admin
  public boolean securedLogin(String password) // secured login using password
  {                    
    if (password.compareTo(credentials)==0)
    {
        System.out.println("Welcome back, Admin!");
        return (true);
    }
    else
    {
        System.out.println("Sorry, wrong password entered!");
        return (false);
    }
  }
}