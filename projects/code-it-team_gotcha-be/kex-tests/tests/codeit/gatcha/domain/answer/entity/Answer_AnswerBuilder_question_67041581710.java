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

public class Answer_AnswerBuilder_question_67041581710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2371;

    public Answer_AnswerBuilder_question_67041581710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2371 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        setField(term2371, term2371.getClass(), "id", null);
        setField(term2371, term2371.getClass(), "body", null);
        setField(term2371, term2371.getClass(), "question", null);
        setField(term2371, term2371.getClass(), "user", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "question", argTypes, term2371, args);
    }

};


