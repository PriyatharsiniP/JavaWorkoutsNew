package org.example.objectCopying;

import java.util.HashMap;
import java.util.Map;

public class Worker implements Cloneable{

    private Map<String,Integer> workerMap;

    //Normal constructor
    Worker(Map<String,Integer> map){
        this.workerMap = map;
    }
    //Copy constructor
    Worker(Worker worker){
        Map<String,Integer> constructorMap = new HashMap<String,Integer>();
        for(Map.Entry<String,Integer> mapLoop:worker.workerMap.entrySet()){
            constructorMap.put(mapLoop.getKey(),mapLoop.getValue());
        }
        this.workerMap = constructorMap;
    }

    public Map<String, Integer> getWorkerMap() {
        return workerMap;
    }

    public void setWorkerMap(Map<String, Integer> workerMap) {
        this.workerMap = workerMap;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
