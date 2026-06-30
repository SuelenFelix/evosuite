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

public class GoogleResponse_getAction_48325409326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15594;

    public GoogleResponse_getAction_48325409326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15594 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        setBooleanField(term15594, term15594.getClass(), "success", false);
        setField(term15594, term15594.getClass(), "challengeTs", null);
        setField(term15594, term15594.getClass(), "hostname", null);
        setFloatField(term15594, term15594.getClass(), "score", 0.0F);
        setField(term15594, term15594.getClass(), "action", null);
        setField(term15594, term15594.getClass(), "errorCodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term15594, args);
    }

};


