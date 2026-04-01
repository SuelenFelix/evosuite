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

public class ArtifactLists_setArtifactResearchPoints_180906709022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41012;
     Object term41014;

    public ArtifactLists_setArtifactResearchPoints_180906709022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41012 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term41012, term41012.getClass(), "discoveredArtifacts", null);
        setField(term41012, term41012.getClass(), "researchedArtifacts", null);
        setIntField(term41012, term41012.getClass(), "artifactResearchPoints", 0);
        term41014 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41014;
        callMethod(klass, "setArtifactResearchPoints", argTypes, term41012, args);
    }

};


