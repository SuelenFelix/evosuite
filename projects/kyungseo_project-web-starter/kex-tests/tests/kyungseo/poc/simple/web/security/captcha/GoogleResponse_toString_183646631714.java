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

public class GoogleResponse_toString_183646631714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13138;

    public GoogleResponse_toString_183646631714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13317 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term13316 = ((Class) term13317).getDeclaredField((String) "MissingResponse");
        ((Field) term13316).setAccessible(true);
        Object enum28 = ((Field) term13316).get((Object) null);
        Class<? extends Object> term13694 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term13693 = ((Class) term13694).getDeclaredField((String) "BadRequest");
        ((Field) term13693).setAccessible(true);
        Object enum29 = ((Field) term13693).get((Object) null);
        Class<? extends Object> term14056 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term14055 = ((Class) term14056).getDeclaredField((String) "MissingSecret");
        ((Field) term14055).setAccessible(true);
        Object enum30 = ((Field) term14055).get((Object) null);
        Class<? extends Object> term14427 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term14426 = ((Class) term14427).getDeclaredField((String) "TimeoutOrDuplicate");
        ((Field) term14426).setAccessible(true);
        Object enum31 = ((Field) term14426).get((Object) null);
        Class<? extends Object> term14813 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term14812 = ((Class) term14813).getDeclaredField((String) "InvalidResponse");
        ((Field) term14812).setAccessible(true);
        Object enum32 = ((Field) term14812).get((Object) null);
        Class<? extends Object> term15190 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term15189 = ((Class) term15190).getDeclaredField((String) "InvalidSecret");
        ((Field) term15189).setAccessible(true);
        Object enum33 = ((Field) term15189).get((Object) null);
        term13138 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term13177 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 7);
        setBooleanField(term13138, term13138.getClass(), "success", false);
        setField(term13138, term13138.getClass(), "challengeTs", "JqXGgAhZPl");
        setField(term13138, term13138.getClass(), "hostname", "jiKYgYHqIS");
        setFloatField(term13138, term13138.getClass(), "score", 0.26441735F);
        setField(term13138, term13138.getClass(), "action", "DfISiziTgG");
        setElement(term13177, 0, enum28);
        setElement(term13177, 1, enum29);
        setElement(term13177, 2, enum30);
        setElement(term13177, 3, enum31);
        setElement(term13177, 4, enum32);
        setElement(term13177, 5, enum28);
        setElement(term13177, 6, enum33);
        setField(term13138, term13138.getClass(), "errorCodes", term13177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13138, args);
    }

};


