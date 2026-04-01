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

public class SignUpDTO_SignUpDTOBuilder_toString_138862724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;

    public SignUpDTO_SignUpDTOBuilder_toString_138862724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("codeit.gatcha.domain.user.DTO.SignUpDTO$SignUpDTOBuilder"));
        setField(term313, term313.getClass(), "email", "IoAlmYsBwc");
        setField(term313, term313.getClass(), "password", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.DTO.SignUpDTO$SignUpDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term313, args);
    }

};


