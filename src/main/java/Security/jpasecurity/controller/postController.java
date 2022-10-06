package Security.jpasecurity.controller;


import Security.jpasecurity.model.Post;
import Security.jpasecurity.repository.postRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class postController {

    private final postRepository posts;

    public postController(postRepository posts) {
        this.posts = posts;
    }
    @GetMapping
    public Iterable<Post> findAll() {
        return posts.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post) {
        return post;
    }
}
