package Task21;

import Task21.Chair;

public class VIC implements Chair {

    @Override
    public void sit(Chair chair) {
        System.out.println("Это Task21.VIC");
    }

    @Override
    public String GetType() {
        return "vic";
    }
}
