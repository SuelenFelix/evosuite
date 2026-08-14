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

public class Configuration_projectVersionPattern_15057646504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2070;

    public Configuration_projectVersionPattern_15057646504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2070 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration"));
        setField(term2070, term2070.getClass(), "disable", null);
        setField(term2070, term2070.getClass(), "projectVersionPattern", null);
        setField(term2070, term2070.getClass(), "describeTagPattern", null);
        setField(term2070, term2070.getClass(), "describeTagFirstParent", null);
        setField(term2070, term2070.getClass(), "updatePom", null);
        setField(term2070, term2070.getClass(), "refs", null);
        setField(term2070, term2070.getClass(), "rev", null);
        setField(term2070, term2070.getClass(), "relatedProjects", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "projectVersionPattern", argTypes, term2070, args);
    }

};


