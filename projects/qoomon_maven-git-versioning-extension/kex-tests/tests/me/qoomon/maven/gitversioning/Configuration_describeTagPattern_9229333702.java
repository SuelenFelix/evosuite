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

public class Configuration_describeTagPattern_9229333702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2008;

    public Configuration_describeTagPattern_9229333702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2009 = new Boolean(false);
        Boolean term2035 = new Boolean(true);
        Boolean term2037 = new Boolean(false);
        Boolean term2040 = new Boolean(false);
        ArrayList term2042 = new ArrayList();
        ArrayList term2046 = new ArrayList();
        term2008 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration"));
        Object term2039 = newInstance(Class.forName("me.qoomon.maven.gitversioning.Configuration$RefPatchDescriptionList"));
        setField(term2008, term2008.getClass(), "disable", term2009);
        setField(term2008, term2008.getClass(), "projectVersionPattern", "RkybSrpybU");
        setField(term2008, term2008.getClass(), "describeTagPattern", "xOEqzGAmDU");
        setField(term2008, term2008.getClass(), "describeTagFirstParent", term2035);
        setField(term2008, term2008.getClass(), "updatePom", term2037);
        setField(term2039, term2039.getClass(), "considerTagsOnBranches", term2040);
        setField(term2039, term2039.getClass(), "list", term2042);
        setField(term2008, term2008.getClass(), "refs", term2039);
        setField(term2008, term2008.getClass(), "rev", null);
        setField(term2008, term2008.getClass(), "relatedProjects", term2046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "describeTagPattern", argTypes, term2008, args);
    }

};


