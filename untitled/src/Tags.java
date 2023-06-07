import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tags  {

    @JsonProperty("tags")
    private String tags;

    ///region Constructor

    public Tags(String tags) {
        this.tags = tags;
    }

    public Tags() {

    }
    ///endregion

    ///region Get and Set

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Tags{" +
                "tags=" + tags +
                '}';
    }


    ///endregion
}
