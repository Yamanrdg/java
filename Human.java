class Human {
  String name;
  String gender;
  int age;
  String job;
  String race;
  String[] familyMembersName; // array

  Human(String name, String gender, int age, String job, String race, String[] familyMembersName) {
    this.name = name; // right hand side name var are local var of constructor
    this.gender = gender;
    this.age = age;
    this.job = job;
    this.race = race;
    this.familyMembersName = familyMembersName;
  }

  void info() {
    System.out.println("Name: " + this.name);
    System.out.println("Gender: " + this.gender);
    System.out.println("Age: " + this.age);
    System.out.println("Job: " + this.job);
    System.out.println("Race: " + this.race);
  }

  void familyMembers() {
    for (int a = 0; a < this.familyMembersName.length; a++) {
      System.out.println(this.familyMembersName[a]);
    }

    // for (String member : this.familyMembersName) {
    // System.out.println(member);
    // }
  }

  public static void main(String[] args) {
    String[] familyMembers = { "Janaki" };
    Human personOne = new Human("Rabin", "Male", 21, "Web Developer", "Hindu", familyMembers);
    System.out.println();
    System.out.println("PersonOne Info:");
    personOne.info();
    System.out.println();
    System.out.println("PersonOne Family Members:");
    personOne.familyMembers();

    Human personTwo = new Human("Asmita", "Female", 19, "Student", "Hindu", familyMembers);
    System.out.println();
    System.out.println("PersonTwo Info:");
    personTwo.info();
    System.out.println();
    System.out.println("PersonTwo Family Members:");
    personTwo.familyMembers();
  }
}