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

public class GoogleResponse_setErrorCodes_209352598222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15580;

    public GoogleResponse_setErrorCodes_209352598222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15580 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        setBooleanField(term15580, term15580.getClass(), "success", false);
        setField(term15580, term15580.getClass(), "challengeTs", null);
        setField(term15580, term15580.getClass(), "hostname", null);
        setFloatField(term15580, term15580.getClass(), "score", 0.0F);
        setField(term15580, term15580.getClass(), "action", null);
        setField(term15580, term15580.getClass(), "errorCodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setErrorCodes", argTypes, term15580, args);
    }

};


