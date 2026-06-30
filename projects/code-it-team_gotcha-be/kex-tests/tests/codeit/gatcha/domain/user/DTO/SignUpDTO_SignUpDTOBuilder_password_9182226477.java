package codeit.gatcha.domain.user.DTO;

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
import static codeit.gatcha.domain.user.DTO.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SignUpDTO_SignUpDTOBuilder_password_9182226477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;

    public SignUpDTO_SignUpDTOBuilder_password_9182226477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("codeit.gatcha.domain.user.DTO.SignUpDTO$SignUpDTOBuilder"));
        setField(term359, term359.getClass(), "email", null);
        setField(term359, term359.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.DTO.SignUpDTO$SignUpDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "password", argTypes, term359, args);
    }

};


