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

public class GoogleResponse_getScore_9080674129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10056;

    public GoogleResponse_getScore_9080674129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10197 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term10196 = ((Class) term10197).getDeclaredField((String) "MissingSecret");
        ((Field) term10196).setAccessible(true);
        Object enum21 = ((Field) term10196).get((Object) null);
        Class<? extends Object> term10568 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term10567 = ((Class) term10568).getDeclaredField((String) "InvalidSecret");
        ((Field) term10567).setAccessible(true);
        Object enum22 = ((Field) term10567).get((Object) null);
        Class<? extends Object> term10939 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term10938 = ((Class) term10939).getDeclaredField((String) "TimeoutOrDuplicate");
        ((Field) term10938).setAccessible(true);
        Object enum23 = ((Field) term10938).get((Object) null);
        Class<? extends Object> term11325 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term11324 = ((Class) term11325).getDeclaredField((String) "BadRequest");
        ((Field) term11324).setAccessible(true);
        Object enum24 = ((Field) term11324).get((Object) null);
        term10056 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term10095 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 7);
        setBooleanField(term10056, term10056.getClass(), "success", true);
        setField(term10056, term10056.getClass(), "challengeTs", "vQVyKLdtaz");
        setField(term10056, term10056.getClass(), "hostname", "OWKQODBLzb");
        setFloatField(term10056, term10056.getClass(), "score", 0.24413109F);
        setField(term10056, term10056.getClass(), "action", "wGmYcqUkgE");
        setElement(term10095, 0, enum21);
        setElement(term10095, 1, enum22);
        setElement(term10095, 2, enum23);
        setElement(term10095, 3, enum24);
        setElement(term10095, 4, enum22);
        setElement(term10095, 5, enum22);
        setElement(term10095, 6, enum23);
        setField(term10056, term10056.getClass(), "errorCodes", term10095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term10056, args);
    }

};


