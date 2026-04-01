package org.openRealmOfStars.ai.planet;

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
import static org.openRealmOfStars.ai.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class ChallengingScoring_scoreConstructions_11297439901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190630;
     Object term190631;

    public ChallengingScoring_scoreConstructions_11297439901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190630 = newInstance(Class.forName("org.openRealmOfStars.ai.planet.ChallengingScoring"));
        term190631 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.planet.ChallengingScoring");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"), 0).getClass();
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[4] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term190631;
        callMethod(klass, "scoreConstructions", argTypes, term190630, args);
    }

};


