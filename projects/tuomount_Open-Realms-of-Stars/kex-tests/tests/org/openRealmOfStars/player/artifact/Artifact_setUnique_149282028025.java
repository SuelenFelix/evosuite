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
import java.lang.Boolean;

public class Artifact_setUnique_149282028025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5152;
     Object term5156;

    public Artifact_setUnique_149282028025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5152 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        setIntField(term5152, term5152.getClass(), "index", 0);
        setField(term5152, term5152.getClass(), "name", null);
        setField(term5152, term5152.getClass(), "artifactType", null);
        setIntField(term5152, term5152.getClass(), "oneTimeTechBonus", 0);
        setField(term5152, term5152.getClass(), "icon", null);
        setField(term5152, term5152.getClass(), "description", null);
        setBooleanField(term5152, term5152.getClass(), "unique", false);
        term5156 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5156;
        callMethod(klass, "setUnique", argTypes, term5152, args);
    }

};


