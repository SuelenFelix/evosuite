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

public class Artifact_setOneTimeTechBonus_128916142718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5122;
     Object term5126;

    public Artifact_setOneTimeTechBonus_128916142718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5122 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        setIntField(term5122, term5122.getClass(), "index", 0);
        setField(term5122, term5122.getClass(), "name", null);
        setField(term5122, term5122.getClass(), "artifactType", null);
        setIntField(term5122, term5122.getClass(), "oneTimeTechBonus", 0);
        setField(term5122, term5122.getClass(), "icon", null);
        setField(term5122, term5122.getClass(), "description", null);
        setBooleanField(term5122, term5122.getClass(), "unique", false);
        term5126 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5126;
        callMethod(klass, "setOneTimeTechBonus", argTypes, term5122, args);
    }

};


