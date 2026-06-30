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

public class CaptchaSettings_getSecretV3_13583251017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673;

    public CaptchaSettings_getSecretV3_13583251017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings"));
        setField(term673, term673.getClass(), "site", "OWDIEULEFu");
        setField(term673, term673.getClass(), "secret", "dWRymuLBtr");
        setField(term673, term673.getClass(), "siteV3", "AijpHYOFuy");
        setField(term673, term673.getClass(), "secretV3", "SbAoxhfrkn");
        setFloatField(term673, term673.getClass(), "threshold", 0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecretV3", argTypes, term673, args);
    }

};


