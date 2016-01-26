package de.egga.wecide.eggs;

import java.util.ArrayList;
import java.util.List;

public class EggListView {

    private final List<EggView> items = new ArrayList<>();


    public List<EggView> getItems() {
        return items;
    }

    public void addItem(EggView view) {
        items.add(view);
    }
}
