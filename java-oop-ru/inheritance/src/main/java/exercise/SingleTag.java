package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("<" + this.name);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            out.append(" ").append(entry.getKey())
                    .append("=").append("\"")
                    .append(entry.getValue()).append("\"");
        }
        out.append(">");
        return out.toString();
    }
}
// END
