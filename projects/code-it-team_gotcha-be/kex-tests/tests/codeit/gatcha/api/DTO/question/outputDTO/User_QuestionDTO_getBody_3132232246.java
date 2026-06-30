package codeit.gatcha.api.DTO.question.outputDTO;

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
import static codeit.gatcha.api.DTO.question.outputDTO.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_QuestionDTO_getBody_3132232246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;

    public User_QuestionDTO_getBody_3132232246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term190, term190.getClass(), "body", null);
        setField(term190, term190.getClass(), "id", null);
        setField(term190, term190.getClass(), "answer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term190, args);
    }

};


