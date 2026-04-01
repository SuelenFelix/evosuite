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

public class CaptchaSettings_setThreshold_35073745810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term965;
     Object term1015;

    public CaptchaSettings_setThreshold_35073745810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term965 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings"));
        setField(term965, term965.getClass(), "site", "hxCBltsObl");
        setField(term965, term965.getClass(), "secret", "BndsHwAFMv");
        setField(term965, term965.getClass(), "siteV3", "GzFkzHGYFt");
        setField(term965, term965.getClass(), "secretV3", "tShwQLRGNe");
        setFloatField(term965, term965.getClass(), "threshold", 0.6880585F);
        term1015 = new Float(0.40176582F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term1015;
        callMethod(klass, "setThreshold", argTypes, term965, args);
    }

};


