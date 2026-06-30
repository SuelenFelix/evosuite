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

public class Answer_AnswerBuilder_body_1081741749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2370;

    public Answer_AnswerBuilder_body_1081741749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2370 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        setField(term2370, term2370.getClass(), "id", null);
        setField(term2370, term2370.getClass(), "body", null);
        setField(term2370, term2370.getClass(), "question", null);
        setField(term2370, term2370.getClass(), "user", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "body", argTypes, term2370, args);
    }

};


