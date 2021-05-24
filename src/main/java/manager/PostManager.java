package manager;

import domain.VKPost;

public class PostManager {
    private VKPost[] posts;

    public VKPost[] getPosts() {
        //logic
        return null;
    }

    public VKPost[] search(int owner_id, String domain, String query, boolean owners_only, int count, int offset) {
        //logic
        return null;
    }

    public int delete(int owner_id, int post_id) {
        return 1;
    }
}
