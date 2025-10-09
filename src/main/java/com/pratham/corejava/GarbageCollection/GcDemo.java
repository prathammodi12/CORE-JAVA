package com.pratham.corejava.GarbageCollection;

public class GcDemo {

        int objId;
        GcDemo(int objId) {
            this.objId=objId;
            System.out.println("Created"+ this.objId );
        }

    public static void main(String[] args) {
        new GcDemo(1);
        new GcDemo(2);
           for(int i=1; i<=50000;i++) {
                System.gc();
           }
    }

    @Override
    protected void finalize(){
        System.out.println("Finalized" + objId);
    }
}
