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

public class GoogleResponse_setErrorCodes_20935259827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7175;
     Object term7282;

    public GoogleResponse_setErrorCodes_20935259827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7336 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term7335 = ((Class) term7336).getDeclaredField((String) "InvalidResponse");
        ((Field) term7335).setAccessible(true);
        Object enum14 = ((Field) term7335).get((Object) null);
        Class<? extends Object> term7713 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term7712 = ((Class) term7713).getDeclaredField((String) "InvalidSecret");
        ((Field) term7712).setAccessible(true);
        Object enum15 = ((Field) term7712).get((Object) null);
        Class<? extends Object> term8084 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term8083 = ((Class) term8084).getDeclaredField((String) "BadRequest");
        ((Field) term8083).setAccessible(true);
        Object enum16 = ((Field) term8083).get((Object) null);
        Class<? extends Object> term8446 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term8445 = ((Class) term8446).getDeclaredField((String) "MissingSecret");
        ((Field) term8445).setAccessible(true);
        Object enum17 = ((Field) term8445).get((Object) null);
        term7175 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term7214 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 9);
        setBooleanField(term7175, term7175.getClass(), "success", true);
        setField(term7175, term7175.getClass(), "challengeTs", "IgRJUzaCwW");
        setField(term7175, term7175.getClass(), "hostname", "JUmudUmaaV");
        setFloatField(term7175, term7175.getClass(), "score", 0.6608425F);
        setField(term7175, term7175.getClass(), "action", "KoyGrUJeJW");
        setElement(term7214, 0, enum14);
        setElement(term7214, 1, enum15);
        setElement(term7214, 2, enum16);
        setElement(term7214, 3, enum17);
        setElement(term7214, 4, enum14);
        setElement(term7214, 5, enum16);
        setElement(term7214, 6, enum16);
        setElement(term7214, 7, enum17);
        setElement(term7214, 8, enum14);
        setField(term7175, term7175.getClass(), "errorCodes", term7214);
        Class<? extends Object> term8817 = Class.forName((String) "kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode");
        Field term8816 = ((Class) term8817).getDeclaredField((String) "TimeoutOrDuplicate");
        ((Field) term8816).setAccessible(true);
        Object enum18 = ((Field) term8816).get((Object) null);
        term7282 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 9);
        setElement(term7282, 0, enum17);
        setElement(term7282, 1, enum16);
        setElement(term7282, 2, enum18);
        setElement(term7282, 3, enum18);
        setElement(term7282, 4, enum15);
        setElement(term7282, 5, enum14);
        setElement(term7282, 6, enum15);
        setElement(term7282, 7, enum14);
        setElement(term7282, 8, enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7282;
        callMethod(klass, "setErrorCodes", argTypes, term7175, args);
    }

};


