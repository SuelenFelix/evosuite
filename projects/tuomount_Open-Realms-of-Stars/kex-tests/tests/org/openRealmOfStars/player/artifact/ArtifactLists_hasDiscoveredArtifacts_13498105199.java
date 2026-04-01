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

public class ArtifactLists_hasDiscoveredArtifacts_13498105199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5674;

    public ArtifactLists_hasDiscoveredArtifacts_13498105199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5675 = new ArrayList();
        ArrayList term5679 = new ArrayList();
        term5674 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term5674, term5674.getClass(), "discoveredArtifacts", term5675);
        setField(term5674, term5674.getClass(), "researchedArtifacts", term5679);
        setIntField(term5674, term5674.getClass(), "artifactResearchPoints", -49052672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasDiscoveredArtifacts", argTypes, term5674, args);
    }

};


