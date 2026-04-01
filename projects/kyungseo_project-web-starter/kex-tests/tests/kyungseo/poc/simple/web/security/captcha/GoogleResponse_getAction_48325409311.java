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

public class GoogleResponse_getAction_48325409311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11758;

    public GoogleResponse_getAction_48325409311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11843 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term11842 = ((Class) term11843).getDeclaredField((String) "BadRequest");
        ((Field) term11842).setAccessible(true);
        Object enum25 = ((Field) term11842).get((Object) null);
        term11758 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term11797 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 1);
        setBooleanField(term11758, term11758.getClass(), "success", true);
        setField(term11758, term11758.getClass(), "challengeTs", "bWWfajKbEX");
        setField(term11758, term11758.getClass(), "hostname", "cAPeiZHKGJ");
        setFloatField(term11758, term11758.getClass(), "score", 0.51832694F);
        setField(term11758, term11758.getClass(), "action", "LvJFtLBaxj");
        setElement(term11797, 0, enum25);
        setField(term11758, term11758.getClass(), "errorCodes", term11797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term11758, args);
    }

};


