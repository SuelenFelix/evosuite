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

public class GitVersionDetails_getPatchDescription_10478739464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;

    public GitVersionDetails_getPatchDescription_10478739464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1209 = Class.forName((String) "me.qoomon.gitversioning.commons.GitRefType");
        Field term1208 = ((Class) term1209).getDeclaredField((String) "BRANCH");
        ((Field) term1208).setAccessible(true);
        Object enum4 = ((Field) term1208).get((Object) null);
        term1163 = newInstance(Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails"));
        setField(term1163, term1163.getClass(), "commit", "hRNSzYYIrc");
        setField(term1163, term1163.getClass(), "refType", enum4);
        setField(term1163, term1163.getClass(), "refName", "RMFIsYGgne");
        setField(term1163, term1163.getClass(), "patchDescription", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPatchDescription", argTypes, term1163, args);
    }

};


