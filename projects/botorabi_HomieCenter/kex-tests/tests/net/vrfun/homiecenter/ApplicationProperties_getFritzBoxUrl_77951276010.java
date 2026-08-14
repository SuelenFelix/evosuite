package net.vrfun.homiecenter;

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
import static net.vrfun.homiecenter.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApplicationProperties_getFritzBoxUrl_77951276010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12460;

    public ApplicationProperties_getFritzBoxUrl_77951276010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12460 = newInstance(Class.forName("net.vrfun.homiecenter.ApplicationProperties"));
        setField(term12460, term12460.getClass(), "appVersion", null);
        setField(term12460, term12460.getClass(), "fritzBoxUrl", null);
        setField(term12460, term12460.getClass(), "fritzBoxUserName", null);
        setField(term12460, term12460.getClass(), "fritzBoxPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.ApplicationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFritzBoxUrl", argTypes, term12460, args);
    }

};


