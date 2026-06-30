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

public class GoogleResponse_getErrorCodes_4254753248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9202;

    public GoogleResponse_getErrorCodes_4254753248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9309 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term9308 = ((Class) term9309).getDeclaredField((String) "InvalidResponse");
        ((Field) term9308).setAccessible(true);
        Object enum19 = ((Field) term9308).get((Object) null);
        Class<? extends Object> term9686 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term9685 = ((Class) term9686).getDeclaredField((String) "MissingSecret");
        ((Field) term9685).setAccessible(true);
        Object enum20 = ((Field) term9685).get((Object) null);
        term9202 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term9241 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 3);
        setBooleanField(term9202, term9202.getClass(), "success", false);
        setField(term9202, term9202.getClass(), "challengeTs", "HqBOwkVqjD");
        setField(term9202, term9202.getClass(), "hostname", "MAcUBcBckh");
        setFloatField(term9202, term9202.getClass(), "score", 0.37773192F);
        setField(term9202, term9202.getClass(), "action", "oVgzLbrsFr");
        setElement(term9241, 0, enum19);
        setElement(term9241, 1, enum20);
        setElement(term9241, 2, enum19);
        setField(term9202, term9202.getClass(), "errorCodes", term9241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorCodes", argTypes, term9202, args);
    }

};


