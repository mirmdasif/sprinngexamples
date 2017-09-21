package net.asifhossain.manytomany.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class RepositoryTest {
    @PersistenceContext
    EntityManager em;

    @Test
    public void test() {

    }
}
