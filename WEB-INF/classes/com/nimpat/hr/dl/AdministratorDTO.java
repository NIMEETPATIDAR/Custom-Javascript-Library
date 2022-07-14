package com.nimpat.hr.dl;
public class AdministratorDTO implements java.io.Serializable,Comparable<AdministratorDTO>
{
private String username;
private String password;
public AdministratorDTO()
{
this.username="";
this.password="";
}
public void setUsername(String username)
{
this.username=username;
}
public String getUsername()
{
return this.username;
}
public void setPassword(String password)
{
this.password=password;
}
public String getPassword()
{
return this.password;
}
public boolean equals(Object object)  //for Deep Comparison
{
if(!(object instanceof AdministratorDTO)) return false;
AdministratorDTO other=(AdministratorDTO)object;
return this.username.equals(other.username);
}
public int compareTo(AdministratorDTO other) //Lexical Comparison
{
return this.username.compareToIgnoreCase(other.username);
}
public int hashCode()
{
return username.hashCode();
}
}