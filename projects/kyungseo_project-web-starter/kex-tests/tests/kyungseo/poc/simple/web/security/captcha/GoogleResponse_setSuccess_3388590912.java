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
import java.lang.Boolean;

public class GoogleResponse_setSuccess_3388590912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2463;
     Object term2575;

    public GoogleResponse_setSuccess_3388590912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2608 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term2607 = ((Class) term2608).getDeclaredField((String) "InvalidSecret");
        ((Field) term2607).setAccessible(true);
        Object enum3 = ((Field) term2607).get((Object) null);
        Class<? extends Object> term2979 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term2978 = ((Class) term2979).getDeclaredField((String) "MissingResponse");
        ((Field) term2978).setAccessible(true);
        Object enum4 = ((Field) term2978).get((Object) null);
        Class<? extends Object> term3356 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term3355 = ((Class) term3356).getDeclaredField((String) "BadRequest");
        ((Field) term3355).setAccessible(true);
        Object enum5 = ((Field) term3355).get((Object) null);
        Class<? extends Object> term3718 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term3717 = ((Class) term3718).getDeclaredField((String) "TimeoutOrDuplicate");
        ((Field) term3717).setAccessible(true);
        Object enum6 = ((Field) term3717).get((Object) null);
        term2463 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term2502 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 4);
        setBooleanField(term2463, term2463.getClass(), "success", false);
        setField(term2463, term2463.getClass(), "challengeTs", "onpbIeEKoi");
        setField(term2463, term2463.getClass(), "hostname", "YRHGsAkhxb");
        setFloatField(term2463, term2463.getClass(), "score", 0.26413453F);
        setField(term2463, term2463.getClass(), "action", "ffYhPOzlUs");
        setElement(term2502, 0, enum3);
        setElement(term2502, 1, enum4);
        setElement(term2502, 2, enum5);
        setElement(term2502, 3, enum6);
        setField(term2463, term2463.getClass(), "errorCodes", term2502);
        term2575 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2575;
        callMethod(klass, "setSuccess", argTypes, term2463, args);
    }

};


