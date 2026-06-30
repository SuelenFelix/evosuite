package codeit.gatcha.domain.user.service.signUp;

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
import static codeit.gatcha.domain.user.service.signUp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SignUpService_createNewUser_11631280030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;

    public SignUpService_createNewUser_11631280030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380 = newInstance(Class.forName("codeit.gatcha.domain.user.DTO.SignUpDTO"));
        setField(term380, term380.getClass(), "email", "TimdotUuNC");
        setField(term380, term380.getClass(), "password", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.service.signUp.SignUpService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.DTO.SignUpDTO");
        Object[] args = new Object[1];
        args[0] = term380;
        callMethod(klass, "createNewUser", argTypes, null, args);
    }

};


