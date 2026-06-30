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
import java.lang.String;

public class GoogleResponse_hasClientError_177208028913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12296;

    public GoogleResponse_hasClientError_177208028913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12400 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term12399 = ((Class) term12400).getDeclaredField((String) "BadRequest");
        ((Field) term12399).setAccessible(true);
        Object enum26 = ((Field) term12399).get((Object) null);
        Class<? extends Object> term12762 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term12761 = ((Class) term12762).getDeclaredField((String) "InvalidResponse");
        ((Field) term12761).setAccessible(true);
        Object enum27 = ((Field) term12761).get((Object) null);
        term12296 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term12335 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 2);
        setBooleanField(term12296, term12296.getClass(), "success", true);
        setField(term12296, term12296.getClass(), "challengeTs", "swZVeJAxjt");
        setField(term12296, term12296.getClass(), "hostname", "xOcJIiQQDu");
        setFloatField(term12296, term12296.getClass(), "score", 0.76550204F);
        setField(term12296, term12296.getClass(), "action", "GVizqqzXpy");
        setElement(term12335, 0, enum26);
        setElement(term12335, 1, enum27);
        setField(term12296, term12296.getClass(), "errorCodes", term12335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasClientError", argTypes, term12296, args);
    }

};


