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

public class ApplicationProperties_getFritzBoxUrl_7795127603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12190;

    public ApplicationProperties_getFritzBoxUrl_7795127603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12190 = newInstance(Class.forName("net.vrfun.homiecenter.ApplicationProperties"));
        setField(term12190, term12190.getClass(), "appVersion", "lKrEAkypza");
        setField(term12190, term12190.getClass(), "fritzBoxUrl", "KtuuNAqGCQ");
        setField(term12190, term12190.getClass(), "fritzBoxUserName", "OGQsfjmReM");
        setField(term12190, term12190.getClass(), "fritzBoxPassword", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.ApplicationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFritzBoxUrl", argTypes, term12190, args);
    }

};


