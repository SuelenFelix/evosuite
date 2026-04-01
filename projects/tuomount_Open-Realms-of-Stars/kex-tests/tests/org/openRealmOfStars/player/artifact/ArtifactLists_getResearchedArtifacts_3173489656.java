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

public class ArtifactLists_getResearchedArtifacts_3173489656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5257;

    public ArtifactLists_getResearchedArtifacts_3173489656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5258 = new ArrayList();
        ArrayList term5262 = new ArrayList();
        term5257 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term5257, term5257.getClass(), "discoveredArtifacts", term5258);
        setField(term5257, term5257.getClass(), "researchedArtifacts", term5262);
        setIntField(term5257, term5257.getClass(), "artifactResearchPoints", 474518942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearchedArtifacts", argTypes, term5257, args);
    }

};


