package kyungseo.poc.simple.web.security.captcha;

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
import static kyungseo.poc.simple.web.security.captcha.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GoogleResponse_setHostname_21239568346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7083;

    public GoogleResponse_setHostname_21239568346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7083 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term7122 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 0);
        setBooleanField(term7083, term7083.getClass(), "success", true);
        setField(term7083, term7083.getClass(), "challengeTs", "TJmVBGfTML");
        setField(term7083, term7083.getClass(), "hostname", "tPlsykYBqO");
        setFloatField(term7083, term7083.getClass(), "score", 0.6076495F);
        setField(term7083, term7083.getClass(), "action", "bLPjGVBhlX");
        setField(term7083, term7083.getClass(), "errorCodes", term7122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "whBvTVIIlC";
        callMethod(klass, "setHostname", argTypes, term7083, args);
    }

};


