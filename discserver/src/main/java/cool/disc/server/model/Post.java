package cool.disc.server.model;

import io.norberg.automatter.AutoMatter;

import javax.annotation.Nullable;
import java.util.List;

@AutoMatter
public interface Post {
    String id();
    String writerId();
    String receiverId();
    String message();
    @Nullable Integer privacy();
    @Nullable String songId();
    @Nullable List<String> comments();
    @Nullable Integer likes();
}