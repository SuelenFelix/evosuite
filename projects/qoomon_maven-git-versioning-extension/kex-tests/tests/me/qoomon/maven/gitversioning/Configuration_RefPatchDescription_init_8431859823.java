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

public class Configuration_RefPatchDescription_init_8431859823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Configuration_RefPatchDescription_init_8431859823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.maven.gitversioning.Configuration$RefPatchDescription");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("me.qoomon.gitversioning.commons.GitRefType");
        argTypes[1] = Class.forName("java.util.regex.Pattern");
        argTypes[2] = Class.forName("me.qoomon.maven.gitversioning.Configuration$PatchDescription");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


