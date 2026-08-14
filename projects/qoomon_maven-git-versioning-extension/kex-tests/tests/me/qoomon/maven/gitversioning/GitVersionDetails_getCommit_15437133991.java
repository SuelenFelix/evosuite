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

public class GitVersionDetails_getCommit_15437133991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;

    public GitVersionDetails_getCommit_15437133991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term351 = Class.forName((String) "me.qoomon.gitversioning.commons.GitRefType");
        Field term350 = ((Class) term351).getDeclaredField((String) "COMMIT");
        ((Field) term350).setAccessible(true);
        Object enum1 = ((Field) term350).get((Object) null);
        term305 = newInstance(Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails"));
        setField(term305, term305.getClass(), "commit", "MuLcgQHgqz");
        setField(term305, term305.getClass(), "refType", enum1);
        setField(term305, term305.getClass(), "refName", "xxtlPwDYFs");
        setField(term305, term305.getClass(), "patchDescription", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommit", argTypes, term305, args);
    }

};


