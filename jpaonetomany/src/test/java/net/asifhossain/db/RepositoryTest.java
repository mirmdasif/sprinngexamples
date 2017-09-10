package net.asifhossain.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class RepositoryTest {

    @PersistenceContext
    private EntityManager entityManager;

    private void setUpSchema() {

        Post post = new Post("Post 1");
        post.addComment(new Comment("Comment 1"));
        post.addComment(new Comment("Comment 2"));

        entityManager.persist(post);
    }

    @Test
    public void testOneToMany() {
        setUpSchema();
        testPostCreation();
        testCommentCreation();
        testReverseMapping();
    }

    private void testReverseMapping() {
        assertEquals(1, entityManager.find(Comment.class, 1).getPost().getId());
        assertEquals(1, entityManager.find(Comment.class, 2).getPost().getId());
    }

    private void testCommentCreation() {
        assertEquals(2, entityManager.find(Post.class, 1).getComments().size());
    }

    private void testPostCreation() {
        assertNotNull(entityManager.find(Post.class, 1));
    }



    @SpringBootApplication
    static class Application {
        public static void main(String[] args) {
            SpringApplication.run(net.asifhossain.Application.class);
        }
    }
}
