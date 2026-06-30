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
import java.lang.Integer;

public class Admin_QuestionDTO_setId_11595274264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;
     Object term331;

    public Admin_QuestionDTO_setId_11595274264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term329 = new Integer(1227103734);
        term316 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term316, term316.getClass(), "body", "LQFpaHEwXR");
        setField(term316, term316.getClass(), "id", term329);
        term331 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term331;
        callMethod(klass, "setId", argTypes, term316, args);
    }

};


