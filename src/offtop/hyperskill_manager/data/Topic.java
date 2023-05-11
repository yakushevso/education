package offtop.hyperskill_manager.data;

import java.util.List;

public class Topic {
    List<String> topics;
    List<String> descendants;

    public Topic(List<String> topics, List<String> descendants) {
        this.topics = topics;
        this.descendants = descendants;
    }

    public List<String> getDescendants() {
        return descendants;
    }
}
