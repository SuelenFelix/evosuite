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

public class CaptchaSettings_setSecret_9657132944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;

    public CaptchaSettings_setSecret_9657132944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings"));
        setField(term359, term359.getClass(), "site", "ZiaGIbnzTs");
        setField(term359, term359.getClass(), "secret", "tbcdzjIfER");
        setField(term359, term359.getClass(), "siteV3", "HyxfbSQYBe");
        setField(term359, term359.getClass(), "secretV3", "pCTimMblYc");
        setFloatField(term359, term359.getClass(), "threshold", 0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.CaptchaSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setSecret", argTypes, term359, args);
    }

};


