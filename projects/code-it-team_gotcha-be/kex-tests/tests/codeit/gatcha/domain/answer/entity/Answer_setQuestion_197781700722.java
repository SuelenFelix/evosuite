package codeit.gatcha.domain.answer.entity;

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
import static codeit.gatcha.domain.answer.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Answer_setQuestion_197781700722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1450;

    public Answer_setQuestion_197781700722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1450 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        setField(term1450, term1450.getClass(), "id", null);
        setField(term1450, term1450.getClass(), "body", null);
        setField(term1450, term1450.getClass(), "question", null);
        setField(term1450, term1450.getClass(), "user", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQuestion", argTypes, term1450, args);
    }

};


