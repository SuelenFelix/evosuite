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
import java.lang.Integer;

public class Question_QuestionBuilder_id_16750367861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term17;

    public Question_QuestionBuilder_id_16750367861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        term1 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question$QuestionBuilder"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "body", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "valid", false);
        term17 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.question.entity.Question$QuestionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term17;
        callMethod(klass, "id", argTypes, term1, args);
    }

};


