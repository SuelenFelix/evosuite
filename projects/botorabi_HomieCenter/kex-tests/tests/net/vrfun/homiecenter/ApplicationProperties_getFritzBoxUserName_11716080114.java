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

public class ApplicationProperties_getFritzBoxUserName_11716080114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12279;

    public ApplicationProperties_getFritzBoxUserName_11716080114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12279 = newInstance(Class.forName("net.vrfun.homiecenter.ApplicationProperties"));
        setField(term12279, term12279.getClass(), "appVersion", "JisaWUxcNb");
        setField(term12279, term12279.getClass(), "fritzBoxUrl", "NxgmYPzWCI");
        setField(term12279, term12279.getClass(), "fritzBoxUserName", "SqjyKmayBx");
        setField(term12279, term12279.getClass(), "fritzBoxPassword", "XjDhvToxJy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.ApplicationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFritzBoxUserName", argTypes, term12279, args);
    }

};


