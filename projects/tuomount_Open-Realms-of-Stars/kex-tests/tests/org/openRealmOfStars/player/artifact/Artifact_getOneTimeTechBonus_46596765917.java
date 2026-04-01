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

public class Artifact_getOneTimeTechBonus_46596765917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5118;

    public Artifact_getOneTimeTechBonus_46596765917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5118 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.Artifact"));
        setIntField(term5118, term5118.getClass(), "index", 0);
        setField(term5118, term5118.getClass(), "name", null);
        setField(term5118, term5118.getClass(), "artifactType", null);
        setIntField(term5118, term5118.getClass(), "oneTimeTechBonus", 0);
        setField(term5118, term5118.getClass(), "icon", null);
        setField(term5118, term5118.getClass(), "description", null);
        setBooleanField(term5118, term5118.getClass(), "unique", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.Artifact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOneTimeTechBonus", argTypes, term5118, args);
    }

};


