# SI_2023_lab2_205014

Владимир Камбовски 
бр. на индекс : 205014


2.Слика од CFG


![alt text](https://github.com/VladimirKambovski/SI_2023_lab2_205014/blob/master/CFG.png?raw=true)


3. Цикломатската комплексност ја пресметуваме така што пресметуваме според следната формула 
      - број на ребра - број на јазли +2 така што добиваме дека бројот е 11

4. Everybranch имаме 5 случаи :  
    - user да е null - ке влезе во прв услов и ке даде исклучок и ке рипне до крај.
    -  User user = new User(null, "123456", "VladimirKambovski"); - овој тест случај ке влезе во if во кој се проверува дали username е null и ке продолжи во делот каде што
        има иницјализација на стрингови поради тоа што е-маил не содржи @, после ќе го провери if случајот за лозинката дали е помала од 8 карактери и дали се содржат карактерите во username. нема да се 
        исполни условот и ке оди во else за без празно место и ке пројде низ for каде што ке провери дали лозинката има специјални карактери
    
    - User user = new User ("Kambovski1", "V12 33", "vladimir.kambovski@students.finki.ukim.mk");
        User user1 = new User ("Kambovski1", "654321", "vladimir.kambovski@students.finki.ukim.mk");
        User user2 = new User ("Vladimir", "7654321", "vladimir.kambovski@students.finki.ukim.mk");
        User user3 = new User ("vladimir001", "11223344", "kambovski01@gmail.com");
       овој тест случај проверува дали e-mail содржи @ или . и после ќе провери дали лозинката содржи празно место и ќе пројде во последниот return false;
       
    - User user = new User ("vladimir", "vladimir", "VladimirKambovski");  овој тест случај проверува дали некој карактер од username се содржи во лозинката и ќе врати falsе
    
    - User user = new User (null, "vladimir", "vladimir.kambovski@students.finki.ukim.mk");  овој тест случај проверува дали username е null.

5. Multiple conditions: 

  -ttx - ставаме user да е null и ќе фрли exception
  
  -ftx - User user2 = new User ("vladimir", null, null); ќе врати T и ќе фрли exception 
  
  -fft - User user3 = new User("vladimir", "123456", null); Ставаме  email да е null за да се исполни user.getEmail() == null
  
  -fff - User user4 = new User("vladimir", "123456", "vladimir.kambovski@students.finki.ukim.mk"); нема точен услов и нема да фрли exception
