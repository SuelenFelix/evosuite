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

public class GoogleResponse_getHostname_5846680225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5457;

    public GoogleResponse_getHostname_5846680225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5597 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term5596 = ((Class) term5597).getDeclaredField((String) "InvalidResponse");
        ((Field) term5596).setAccessible(true);
        Object enum10 = ((Field) term5596).get((Object) null);
        Class<? extends Object> term5974 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term5973 = ((Class) term5974).getDeclaredField((String) "BadRequest");
        ((Field) term5973).setAccessible(true);
        Object enum11 = ((Field) term5973).get((Object) null);
        Class<? extends Object> term6336 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term6335 = ((Class) term6336).getDeclaredField((String) "InvalidSecret");
        ((Field) term6335).setAccessible(true);
        Object enum12 = ((Field) term6335).get((Object) null);
        Class<? extends Object> term6707 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term6706 = ((Class) term6707).getDeclaredField((String) "MissingResponse");
        ((Field) term6706).setAccessible(true);
        Object enum13 = ((Field) term6706).get((Object) null);
        term5457 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term5496 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 9);
        setBooleanField(term5457, term5457.getClass(), "success", true);
        setField(term5457, term5457.getClass(), "challengeTs", "fhkbdRViHi");
        setField(term5457, term5457.getClass(), "hostname", "uWHnvSvaPl");
        setFloatField(term5457, term5457.getClass(), "score", 0.13906479F);
        setField(term5457, term5457.getClass(), "action", "kBdSllIBVz");
        setElement(term5496, 0, enum10);
        setElement(term5496, 1, enum11);
        setElement(term5496, 2, enum10);
        setElement(term5496, 3, enum12);
        setElement(term5496, 4, enum10);
        setElement(term5496, 5, enum13);
        setElement(term5496, 6, enum11);
        setElement(term5496, 7, enum12);
        setElement(term5496, 8, enum10);
        setField(term5457, term5457.getClass(), "errorCodes", term5496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostname", argTypes, term5457, args);
    }

};


