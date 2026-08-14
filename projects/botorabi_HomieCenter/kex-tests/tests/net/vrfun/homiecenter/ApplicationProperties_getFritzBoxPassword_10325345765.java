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

public class ApplicationProperties_getFritzBoxPassword_10325345765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12368;

    public ApplicationProperties_getFritzBoxPassword_10325345765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12368 = newInstance(Class.forName("net.vrfun.homiecenter.ApplicationProperties"));
        setField(term12368, term12368.getClass(), "appVersion", "nxSTJflLQy");
        setField(term12368, term12368.getClass(), "fritzBoxUrl", "FlHzxEfFzI");
        setField(term12368, term12368.getClass(), "fritzBoxUserName", "aSATgQUpoe");
        setField(term12368, term12368.getClass(), "fritzBoxPassword", "VkPSXewZfB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.ApplicationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFritzBoxPassword", argTypes, term12368, args);
    }

};


