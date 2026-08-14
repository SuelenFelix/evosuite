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
import java.lang.String;
import java.lang.Object;

public class GitVersionDetails_getRefName_3330559643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;

    public GitVersionDetails_getRefName_3330559643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term919 = Class.forName((String) "me.qoomon.gitversioning.commons.GitRefType");
        Field term918 = ((Class) term919).getDeclaredField((String) "COMMIT");
        ((Field) term918).setAccessible(true);
        Object enum3 = ((Field) term918).get((Object) null);
        term873 = newInstance(Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails"));
        setField(term873, term873.getClass(), "commit", "SzjVpOQTyS");
        setField(term873, term873.getClass(), "refType", enum3);
        setField(term873, term873.getClass(), "refName", "MjGYSRKTNF");
        setField(term873, term873.getClass(), "patchDescription", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefName", argTypes, term873, args);
    }

};


