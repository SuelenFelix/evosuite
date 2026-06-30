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

public class Question_builder_30554501317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;

    public Question_builder_30554501317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        setField(term529, term529.getClass(), "id", null);
        setField(term529, term529.getClass(), "body", null);
        setBooleanField(term529, term529.getClass(), "valid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.question.entity.Question");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term529, args);
    }

};


