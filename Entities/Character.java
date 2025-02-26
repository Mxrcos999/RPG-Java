package Entities;

import java.util.List;
import java.util.ArrayList;

public class Character extends BaseEntity {
    private List<Quest> quests = new ArrayList<>();

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

    public void addQuest(Quest quest) {
        if (quest != null) {
            this.quests.add(quest);
        }
    }
}
