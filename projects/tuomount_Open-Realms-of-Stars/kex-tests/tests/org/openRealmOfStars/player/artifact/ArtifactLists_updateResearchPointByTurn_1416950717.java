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

public class ArtifactLists_updateResearchPointByTurn_1416950717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41004;
     Object term41006;

    public ArtifactLists_updateResearchPointByTurn_1416950717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41004 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term41004, term41004.getClass(), "discoveredArtifacts", null);
        setField(term41004, term41004.getClass(), "researchedArtifacts", null);
        setIntField(term41004, term41004.getClass(), "artifactResearchPoints", 0);
        term41006 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[4];
        args[0] = term41006;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "updateResearchPointByTurn", argTypes, term41004, args);
    }

};


