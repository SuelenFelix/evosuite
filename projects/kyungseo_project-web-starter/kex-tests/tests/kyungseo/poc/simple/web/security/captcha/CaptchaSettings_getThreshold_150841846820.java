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

public class CaptchaSettings_getThreshold_150841846820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073;

    public CaptchaSettings_getThreshold_150841846820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1073 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings"));
        setField(term1073, term1073.getClass(), "site", null);
        setField(term1073, term1073.getClass(), "secret", null);
        setField(term1073, term1073.getClass(), "siteV3", null);
        setField(term1073, term1073.getClass(), "secretV3", null);
        setFloatField(term1073, term1073.getClass(), "threshold", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThreshold", argTypes, term1073, args);
    }

};


