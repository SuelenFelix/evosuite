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

public class Artifact_getFullDescription_67413184523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5144;

    public Artifact_getFullDescription_67413184523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5144 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        setIntField(term5144, term5144.getClass(), "index", 0);
        setField(term5144, term5144.getClass(), "name", null);
        setField(term5144, term5144.getClass(), "artifactType", null);
        setIntField(term5144, term5144.getClass(), "oneTimeTechBonus", 0);
        setField(term5144, term5144.getClass(), "icon", null);
        setField(term5144, term5144.getClass(), "description", null);
        setBooleanField(term5144, term5144.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullDescription", argTypes, term5144, args);
    }

};


