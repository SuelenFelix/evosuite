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

public class CaptchaSettings_setSecret_96571329415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;

    public CaptchaSettings_setSecret_96571329415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings"));
        setField(term1063, term1063.getClass(), "site", null);
        setField(term1063, term1063.getClass(), "secret", null);
        setField(term1063, term1063.getClass(), "siteV3", null);
        setField(term1063, term1063.getClass(), "secretV3", null);
        setFloatField(term1063, term1063.getClass(), "threshold", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSecret", argTypes, term1063, args);
    }

};


