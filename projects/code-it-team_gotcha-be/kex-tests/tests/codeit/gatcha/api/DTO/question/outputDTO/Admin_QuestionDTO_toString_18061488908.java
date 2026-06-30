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

public class Admin_QuestionDTO_toString_18061488908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;

    public Admin_QuestionDTO_toString_18061488908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term433 = new Integer(-883034806);
        term420 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term420, term420.getClass(), "body", "tbcdzjIfER");
        setField(term420, term420.getClass(), "id", term433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term420, args);
    }

};


