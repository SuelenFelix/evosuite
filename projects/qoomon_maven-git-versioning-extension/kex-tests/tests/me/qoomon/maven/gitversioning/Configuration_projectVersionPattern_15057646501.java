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
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Configuration_projectVersionPattern_15057646501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;

    public Configuration_projectVersionPattern_15057646501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1947 = new Boolean(false);
        Boolean term1973 = new Boolean(true);
        Boolean term1975 = new Boolean(false);
        Boolean term1978 = new Boolean(false);
        ArrayList term1980 = new ArrayList();
        ArrayList term1984 = new ArrayList();
        term1946 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration"));
        Object term1977 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration$RefPatchDescriptionList"));
        setField(term1946, term1946.getClass(), "disable", term1947);
        setField(term1946, term1946.getClass(), "projectVersionPattern", "pCTimMblYc");
        setField(term1946, term1946.getClass(), "describeTagPattern", "hNxWaHcfhY");
        setField(term1946, term1946.getClass(), "describeTagFirstParent", term1973);
        setField(term1946, term1946.getClass(), "updatePom", term1975);
        setField(term1977, term1977.getClass(), "considerTagsOnBranches", term1978);
        setField(term1977, term1977.getClass(), "list", term1980);
        setField(term1946, term1946.getClass(), "refs", term1977);
        setField(term1946, term1946.getClass(), "rev", null);
        setField(term1946, term1946.getClass(), "relatedProjects", term1984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "projectVersionPattern", argTypes, term1946, args);
    }

};


