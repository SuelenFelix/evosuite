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

public class ArtifactLists_generateAncientTech_152906062515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17260;
     Object term17262;

    public ArtifactLists_generateAncientTech_152906062515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17260 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term17260, term17260.getClass(), "discoveredArtifacts", null);
        setField(term17260, term17260.getClass(), "researchedArtifacts", null);
        setIntField(term17260, term17260.getClass(), "artifactResearchPoints", 0);
        term17262 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[4] = Class.forName("org.openRealmOfStars.player.artifact.ArtifactType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term17262;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "generateAncientTech", argTypes, term17260, args);
    }

};


