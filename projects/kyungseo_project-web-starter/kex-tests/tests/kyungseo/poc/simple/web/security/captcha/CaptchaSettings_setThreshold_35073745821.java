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
import java.lang.Float;

public class CaptchaSettings_setThreshold_35073745821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075;
     Object term1077;

    public CaptchaSettings_setThreshold_35073745821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings"));
        setField(term1075, term1075.getClass(), "site", null);
        setField(term1075, term1075.getClass(), "secret", null);
        setField(term1075, term1075.getClass(), "siteV3", null);
        setField(term1075, term1075.getClass(), "secretV3", null);
        setFloatField(term1075, term1075.getClass(), "threshold", 0.0F);
        term1077 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term1077;
        callMethod(klass, "setThreshold", argTypes, term1075, args);
    }

};


