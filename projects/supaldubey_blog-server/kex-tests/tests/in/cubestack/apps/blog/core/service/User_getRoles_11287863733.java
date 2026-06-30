package in.cubestack.apps.blog.core.service;

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
import static in.cubestack.apps.blog.core.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class User_getRoles_11287863733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;

    public User_getRoles_11287863733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term347 = new Long(-8400487765614892086L);
        ArrayList term361 = new ArrayList();
        ((ArrayList) term361).add("HyxfbSQYBe");
        ((ArrayList) term361).add("pCTimMblYc");
        ((ArrayList) term361).add("hNxWaHcfhY");
        ((ArrayList) term361).add("RkybSrpybU");
        term346 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.User"));
        setField(term346, term346.getClass(), "personId", term347);
        setField(term346, term346.getClass(), "userName", "tbcdzjIfER");
        setField(term346, term346.getClass(), "roles", term361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term346, args);
    }

};


