package org.example.concurrentVersion;

public class UserThread extends Thread{
    private String name;
    private int pancakesToEat;

    public UserThread(String name, int pancakesToEat) {
        this.name = name;
        this.pancakesToEat = pancakesToEat;
    }

    @Override
    public void run() {
        System.out.println(name + " is eating " + pancakesToEat + " pancakes.");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
