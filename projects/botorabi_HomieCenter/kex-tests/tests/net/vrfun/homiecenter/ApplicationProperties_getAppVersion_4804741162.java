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

public class ApplicationProperties_getAppVersion_4804741162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12101;

    public ApplicationProperties_getAppVersion_4804741162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12101 = newInstance(Class.forName("net.vrfun.homiecenter.ApplicationProperties"));
        setField(term12101, term12101.getClass(), "appVersion", "IpmgwHTgnG");
        setField(term12101, term12101.getClass(), "fritzBoxUrl", "tIpkeYIezR");
        setField(term12101, term12101.getClass(), "fritzBoxUserName", "YkZtEtthvz");
        setField(term12101, term12101.getClass(), "fritzBoxPassword", "dwlZSxlXOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.ApplicationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppVersion", argTypes, term12101, args);
    }

};


