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

public class JwtResponse_setRoles_118003595510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110;

    public JwtResponse_setRoles_118003595510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1168 = new Long(-2813493605142626659L);
        term1110 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term1110, term1110.getClass(), "TOKEN_PREFIX", "Bearer ");
        setField(term1110, term1110.getClass(), "accessToken", "gGSMzuGICf");
        setField(term1110, term1110.getClass(), "refreshToken", "hxCBltsObl");
        setField(term1110, term1110.getClass(), "tokenType", "BndsHwAFMv");
        setField(term1110, term1110.getClass(), "roles", "GzFkzHGYFt");
        setField(term1110, term1110.getClass(), "expiryDuration", term1168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setRoles", argTypes, term1110, args);
    }

};


