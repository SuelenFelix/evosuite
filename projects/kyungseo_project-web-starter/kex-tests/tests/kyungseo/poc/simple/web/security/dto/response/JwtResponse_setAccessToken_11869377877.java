package kyungseo.poc.simple.web.security.dto.response;

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
import static kyungseo.poc.simple.web.security.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JwtResponse_setAccessToken_11869377877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;

    public JwtResponse_setAccessToken_11869377877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term781 = new Long(6811161968424632369L);
        term723 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term723, term723.getClass(), "TOKEN_PREFIX", "Bearer ");
        setField(term723, term723.getClass(), "accessToken", "OclPbYPkcH");
        setField(term723, term723.getClass(), "refreshToken", "IoAlmYsBwc");
        setField(term723, term723.getClass(), "tokenType", "TEParAifyi");
        setField(term723, term723.getClass(), "roles", "OWDIEULEFu");
        setField(term723, term723.getClass(), "expiryDuration", term781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        callMethod(klass, "setAccessToken", argTypes, term723, args);
    }

};


