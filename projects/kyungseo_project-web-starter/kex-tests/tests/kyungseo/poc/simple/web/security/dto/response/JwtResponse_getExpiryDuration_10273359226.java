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

public class JwtResponse_getExpiryDuration_10273359226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616;

    public JwtResponse_getExpiryDuration_10273359226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term674 = new Long(4872422362414183754L);
        term616 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse"));
        setField(term616, term616.getClass(), "TOKEN_PREFIX", "Bearer ");
        setField(term616, term616.getClass(), "accessToken", "eZFUvlxvGV");
        setField(term616, term616.getClass(), "refreshToken", "BYqFIqCKAV");
        setField(term616, term616.getClass(), "tokenType", "vrQLuWIDJX");
        setField(term616, term616.getClass(), "roles", "flxyYxBRtu");
        setField(term616, term616.getClass(), "expiryDuration", term674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryDuration", argTypes, term616, args);
    }

};


