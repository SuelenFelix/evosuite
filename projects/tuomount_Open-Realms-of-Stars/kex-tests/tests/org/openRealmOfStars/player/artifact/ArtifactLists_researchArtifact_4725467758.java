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

public class ArtifactLists_researchArtifact_4725467758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5664;

    public ArtifactLists_researchArtifact_4725467758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5665 = new ArrayList();
        ArrayList term5669 = new ArrayList();
        term5664 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term5664, term5664.getClass(), "discoveredArtifacts", term5665);
        setField(term5664, term5664.getClass(), "researchedArtifacts", term5669);
        setIntField(term5664, term5664.getClass(), "artifactResearchPoints", -1015274146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "researchArtifact", argTypes, term5664, args);
    }

};


