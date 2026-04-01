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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class ArtifactLists_getTypesResearched_31795038513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5714;
     Object enum14;

    public ArtifactLists_getTypesResearched_31795038513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5715 = new ArrayList();
        ArrayList term5719 = new ArrayList();
        term5714 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term5714, term5714.getClass(), "discoveredArtifacts", term5715);
        setField(term5714, term5714.getClass(), "researchedArtifacts", term5719);
        setIntField(term5714, term5714.getClass(), "artifactResearchPoints", 76929641);
        Class<? extends Object> term5737 = Class.forName((String) "org.openRealmOfStars.player.artifact.ArtifactType");
        Field term5736 = ((Class) term5737).getDeclaredField((String) "SHIPHULL");
        ((Field) term5736).setAccessible(true);
        enum14 = ((Field) term5736).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.artifact.ArtifactType");
        Object[] args = new Object[1];
        args[0] = enum14;
        callMethod(klass, "getTypesResearched", argTypes, term5714, args);
    }

};


