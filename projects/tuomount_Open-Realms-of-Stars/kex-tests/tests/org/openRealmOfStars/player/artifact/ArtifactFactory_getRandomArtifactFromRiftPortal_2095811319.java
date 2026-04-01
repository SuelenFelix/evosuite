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
import java.lang.Byte;

public class ArtifactFactory_getRandomArtifactFromRiftPortal_2095811319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42745;
     Object term42746;

    public ArtifactFactory_getRandomArtifactFromRiftPortal_2095811319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42745 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactFactory"));
        term42746 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term42746;
        callMethod(klass, "getRandomArtifactFromRiftPortal", argTypes, term42745, args);
    }

};


