package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, List<String>> element : timetable.entrySet()) {
            for (String s : (element.getValue())) {
                set.add(s);
            }
        }
        set.stream().sorted(Comparator.comparing(String :: length));
        return set;
    }
}
