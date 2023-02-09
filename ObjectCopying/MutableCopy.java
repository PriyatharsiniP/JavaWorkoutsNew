package org.example.objectCopying;

import java.util.HashMap;
import java.util.Map;

public class MutableCopy {

    //Shallow copy
    public static void shallowCopy(Worker worker){
        Worker worker3 = worker;
        System.out.println("Before performing shallow copy, the original worker object is : ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
        Map<String,Integer> mapVariable3 = new HashMap<>();
        mapVariable3.put("Walia",19999);
        mapVariable3.put("Sumalia",3000);
        worker3.setWorkerMap(mapVariable3);
        System.out.println("The Object cloning done via shallow copy : ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker3.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
        System.out.println("After performing shallow copy, the original worker object is : ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
    }

    //Cloning using clone method (deep copy)
    public static void cloneMethodCloning(Worker worker) throws CloneNotSupportedException {
        Worker worker2 = (Worker)worker.clone();
        Map<String,Integer> mapVariable2 = new HashMap<>();
        mapVariable2.put("Harish",1);
        mapVariable2.put("sindhu",3);
        worker2.setWorkerMap(mapVariable2);
        System.out.println("cloned worker2 object details after changes in it: ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker2.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
        System.out.println("original worker object details after changes in cloned object: ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
    }

    //Cloning using copy constructor (deep copy)
    public static void copyConstructorCloning(Worker worker){
        Worker worker1 = new Worker(worker);
        Map<String,Integer> mapVariable1 = new HashMap<>();
        mapVariable1.put("Priya",10022);
        mapVariable1.put("Hajira",20000);
        worker1.setWorkerMap(mapVariable1);
        System.out.println("cloned worker1 object details after changing: ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker1.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
        System.out.println("original worker object details after changes in cloned object: ");
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> mapFor:worker.getWorkerMap().entrySet()) {
            System.out.println("Key :" + mapFor.getKey() + " Value : " + mapFor.getValue());
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Map<String,Integer> mapVariable = new HashMap<>();
        mapVariable.put("Rolex",100);
        mapVariable.put("Rekha",102);
        mapVariable.put("Sinha",103);
        Worker worker = new Worker(mapVariable);
        for(Map.Entry<String,Integer> mapFor:worker.getWorkerMap().entrySet()){
            System.out.println("Key :"+mapFor.getKey()+" Value : "+mapFor.getValue());
            //op:
            //Key :Rekha Value : 102
            //Key :Sinha Value : 103
            //Key :Rolex Value : 100
        }
        //Cloning using copy constructor (deep copy)
        copyConstructorCloning(worker);
        //Cloning using clone method (deep copy)
        cloneMethodCloning(worker);
        //Shallow copy
        shallowCopy(worker);

    }
}
