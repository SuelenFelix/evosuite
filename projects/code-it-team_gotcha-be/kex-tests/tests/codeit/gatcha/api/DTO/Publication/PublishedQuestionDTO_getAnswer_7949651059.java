package codeit.gatcha.api.DTO.Publication;

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
import static codeit.gatcha.api.DTO.Publication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PublishedQuestionDTO_getAnswer_7949651059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;

    public PublishedQuestionDTO_getAnswer_7949651059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term511, term511.getClass(), "body", null);
        setField(term511, term511.getClass(), "answer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnswer", argTypes, term511, args);
    }

};


