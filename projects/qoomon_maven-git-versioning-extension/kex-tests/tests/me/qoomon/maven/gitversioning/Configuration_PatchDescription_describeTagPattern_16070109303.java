package me.qoomon.maven.gitversioning;

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
import static me.qoomon.maven.gitversioning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Configuration_PatchDescription_describeTagPattern_16070109303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1857;

    public Configuration_PatchDescription_describeTagPattern_16070109303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1857 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration$PatchDescription"));
        setField(term1857, term1857.getClass(), "describeTagPattern", null);
        setField(term1857, term1857.getClass(), "version", null);
        setField(term1857, term1857.getClass(), "properties", null);
        setField(term1857, term1857.getClass(), "userProperties", null);
        setField(term1857, term1857.getClass(), "updatePom", null);
        setField(term1857, term1857.getClass(), "describeTagFirstParent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.Configuration$PatchDescription");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "describeTagPattern", argTypes, term1857, args);
    }

};


