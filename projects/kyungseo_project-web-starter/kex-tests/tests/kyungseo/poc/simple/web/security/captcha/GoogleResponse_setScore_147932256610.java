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
import java.lang.Float;

public class GoogleResponse_setScore_147932256610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11686;
     Object term11726;

    public GoogleResponse_setScore_147932256610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11686 = newInstance(Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse"));
        Object[] term11725 = (Object[]) newArray("kyungseo.poc.simple.web.security.captcha.GoogleResponse$ErrorCode", 0);
        setBooleanField(term11686, term11686.getClass(), "success", false);
        setField(term11686, term11686.getClass(), "challengeTs", "idgaQsnJpQ");
        setField(term11686, term11686.getClass(), "hostname", "VgZnGoIFwQ");
        setFloatField(term11686, term11686.getClass(), "score", 0.8474802F);
        setField(term11686, term11686.getClass(), "action", "jUbSRrkrYZ");
        setField(term11686, term11686.getClass(), "errorCodes", term11725);
        term11726 = new Float(0.9985961F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.captcha.GoogleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term11726;
        callMethod(klass, "setScore", argTypes, term11686, args);
    }

};


