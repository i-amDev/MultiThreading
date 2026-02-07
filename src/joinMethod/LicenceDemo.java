package joinMethod;

public class LicenceDemo {

    public static void main(String[] args) {

        Medical medical = new Medical();
        medical.start();

        try {
            medical.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        TestDrive testDrive = new TestDrive();
        testDrive.start();

        try {
            testDrive.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        OfficerSign officerSign = new OfficerSign();
        officerSign.start();
    }
}

class Medical extends Thread{

    @Override
    public void run() {
        System.out.println("Medical started....");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Medical completed!!!");
    }
}

class TestDrive extends Thread{

    @Override
    public void run() {
        System.out.println("Test drive started....");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test drive completed!!!");
    }
}

class OfficerSign extends Thread{

    @Override
    public void run() {
        System.out.println("Officer sign started....");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Officer sign completed!!!");
    }
}
