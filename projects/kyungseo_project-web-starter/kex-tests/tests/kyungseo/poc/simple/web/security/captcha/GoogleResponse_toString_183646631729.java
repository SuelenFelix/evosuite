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

public class GoogleResponse_toString_183646631729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15603;

    public GoogleResponse_toString_183646631729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15603 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        setBooleanField(term15603, term15603.getClass(), "success", false);
        setField(term15603, term15603.getClass(), "challengeTs", null);
        setField(term15603, term15603.getClass(), "hostname", null);
        setFloatField(term15603, term15603.getClass(), "score", 0.0F);
        setField(term15603, term15603.getClass(), "action", null);
        setField(term15603, term15603.getClass(), "errorCodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15603, args);
    }

};


