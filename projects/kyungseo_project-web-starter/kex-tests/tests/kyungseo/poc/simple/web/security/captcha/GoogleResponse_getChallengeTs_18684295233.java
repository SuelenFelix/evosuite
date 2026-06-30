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

public class GoogleResponse_getChallengeTs_18684295233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4103;

    public GoogleResponse_getChallengeTs_18684295233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4232 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term4231 = ((Class) term4232).getDeclaredField((String) "InvalidResponse");
        ((Field) term4231).setAccessible(true);
        Object enum7 = ((Field) term4231).get((Object) null);
        Class<? extends Object> term4609 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term4608 = ((Class) term4609).getDeclaredField((String) "InvalidSecret");
        ((Field) term4608).setAccessible(true);
        Object enum8 = ((Field) term4608).get((Object) null);
        Class<? extends Object> term4980 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term4979 = ((Class) term4980).getDeclaredField((String) "TimeoutOrDuplicate");
        ((Field) term4979).setAccessible(true);
        Object enum9 = ((Field) term4979).get((Object) null);
        term4103 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term4142 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 5);
        setBooleanField(term4103, term4103.getClass(), "success", false);
        setField(term4103, term4103.getClass(), "challengeTs", "MLqYREekMl");
        setField(term4103, term4103.getClass(), "hostname", "ytSBIKXogI");
        setFloatField(term4103, term4103.getClass(), "score", 0.7944024F);
        setField(term4103, term4103.getClass(), "action", "nHXjMycHlU");
        setElement(term4142, 0, enum7);
        setElement(term4142, 1, enum8);
        setElement(term4142, 2, enum9);
        setElement(term4142, 3, enum7);
        setElement(term4142, 4, enum7);
        setField(term4103, term4103.getClass(), "errorCodes", term4142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeTs", argTypes, term4103, args);
    }

};


