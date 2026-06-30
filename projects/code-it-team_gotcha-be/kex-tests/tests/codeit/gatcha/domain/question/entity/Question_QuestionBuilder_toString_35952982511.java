package codeit.gatcha.domain.question.entity;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static codeit.gatcha.domain.question.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Question_QuestionBuilder_toString_35952982511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;

    public Question_QuestionBuilder_toString_35952982511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question$QuestionBuilder"));
        setField(term167, term167.getClass(), "id", null);
        setField(term167, term167.getClass(), "body", null);
        setBooleanField(term167, term167.getClass(), "valid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.question.entity.Question$QuestionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term167, args);
    }

};


