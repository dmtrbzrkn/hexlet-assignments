package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("<" + this.name);

        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            out.append(" ").append(entry.getKey())
                    .append("=").append("\"")
                    .append(entry.getValue()).append("\"");
        }
        out.append(">").append(this.body);

        for (Tag tag : children) {
            out.append(tag);
        }
        out.append("</").append(name).append(">");
        return out.toString();
    }
}
// END
