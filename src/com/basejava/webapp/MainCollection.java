package com.basejava.webapp;

import com.basejava.webapp.model.Resume;

import java.util.*;

public class MainCollection {
    private static final String UUID_1 = "uuid1";
    private static final Resume RESUME_1 = new Resume(UUID_1);

    private static final String UUID_2 = "uuid2";
    private static final Resume RESUME_2 = new Resume(UUID_2);

    private static final String UUID_3 = "uuid3";
    private static final Resume RESUME_3 = new Resume(UUID_3);

    public static void main(String[] args) {


        Collection<Resume> collections = new ArrayList<>();
        collections.add(RESUME_1);
        collections.add(RESUME_2);
        collections.add(RESUME_3);

        for(Resume r : collections) {
                   System.out.println(r);
            if(Objects.equals(r.getUuid(), UUID_1)) {
                //              collections.remove(r);
            }
        }

        Iterator<Resume> iterator = collections.iterator();
        while(iterator.hasNext()) {
            Resume r = iterator.next();
            System.out.println(r);
            if(r.getUuid().equals(UUID_2)) {
                iterator.remove();
            }
        }
        System.out.println(collections.toString());

        Map<String,Resume> map = new HashMap<>();
        map.put(UUID_1, RESUME_1);
        map.put(UUID_2, RESUME_2);
        map.put(UUID_3, RESUME_3);

        //Bad!
        for(String uuid : map.keySet()) {
            System.out.println(map.get(uuid));
        }
        for(Map.Entry<String,Resume> pair : map.entrySet()) {
            System.out.println(pair.getKey());
        }
    }
}
