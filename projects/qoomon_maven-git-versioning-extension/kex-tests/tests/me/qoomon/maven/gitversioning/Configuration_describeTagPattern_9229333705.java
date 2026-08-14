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

public class Configuration_describeTagPattern_9229333705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2071;

    public Configuration_describeTagPattern_9229333705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2071 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration"));
        setField(term2071, term2071.getClass(), "disable", null);
        setField(term2071, term2071.getClass(), "projectVersionPattern", null);
        setField(term2071, term2071.getClass(), "describeTagPattern", null);
        setField(term2071, term2071.getClass(), "describeTagFirstParent", null);
        setField(term2071, term2071.getClass(), "updatePom", null);
        setField(term2071, term2071.getClass(), "refs", null);
        setField(term2071, term2071.getClass(), "rev", null);
        setField(term2071, term2071.getClass(), "relatedProjects", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "describeTagPattern", argTypes, term2071, args);
    }

};


