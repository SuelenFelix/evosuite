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

public class GitVersionDetails_init_12253882400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public GitVersionDetails_init_12253882400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70 = Class.forName((String) "me.qoomon.gitversioning.commons.GitRefType");
        Field term69 = ((Class) term70).getDeclaredField((String) "TAG");
        ((Field) term69).setAccessible(true);
        enum0 = ((Field) term69).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.GitVersionDetails");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("me.qoomon.gitversioning.commons.GitRefType");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("me.qoomon.maven.gitversioning.Configuration$RefPatchDescription");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = enum0;
        args[2] = "sjlJAEtRrb";
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


