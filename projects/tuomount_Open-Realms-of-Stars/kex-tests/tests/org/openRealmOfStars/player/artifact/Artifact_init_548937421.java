package org.openRealmOfStars.player.artifact;

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
import static org.openRealmOfStars.player.artifact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class Artifact_init_548937421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;
     Object enum1;

    public Artifact_init_548937421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455 = new Integer(-6029667);
        Class<? extends Object> term492 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term491 = ((Class) term492).getDeclaredField((String) "SHIPHULL");
        ((Field) term491).setAccessible(true);
        enum1 = ((Field) term491).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.artifact.ArtifactType");
        Object[] args = new Object[3];
        args[0] = term455;
        args[1] = "jJCZpVmanW";
        args[2] = enum1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


