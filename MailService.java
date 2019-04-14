package com.company;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Manageable<T>> {
    private Map<String, List<T>> listMap = new HashMap<>();

    @Override
    public void accept(Manageable<T> sendable) {
        try {
            if (sendable != null) {
                List<T> elements =
                        listMap.get(sendable.getKeyForMailService()) == Collections.EMPTY_LIST ? new LinkedList<T>() :
                                listMap.get(sendable.getKeyForMailService());
                elements.add(sendable.getValueForMailService());
                listMap.put(sendable.getKeyForMailService(), elements);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Map<String, List<T>> getMailBox() {
        return listMap;
    }
}

