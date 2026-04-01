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

public class JwtResponse_getTokenType_9742482214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;

    public JwtResponse_getTokenType_9742482214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term460 = new Long(5270370404989704783L);
        term402 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term402, term402.getClass(), "TOKEN_PREFIX", "Bearer ");
        setField(term402, term402.getClass(), "accessToken", "aJlieCFVtF");
        setField(term402, term402.getClass(), "refreshToken", "ZiaGIbnzTs");
        setField(term402, term402.getClass(), "tokenType", "tbcdzjIfER");
        setField(term402, term402.getClass(), "roles", "HyxfbSQYBe");
        setField(term402, term402.getClass(), "expiryDuration", term460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTokenType", argTypes, term402, args);
    }

};


