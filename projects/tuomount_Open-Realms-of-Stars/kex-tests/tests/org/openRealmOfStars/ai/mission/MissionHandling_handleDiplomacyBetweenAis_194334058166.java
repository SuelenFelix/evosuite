package org.openRealmOfStars.ai.mission;

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
import static org.openRealmOfStars.ai.mission.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MissionHandling_handleDiplomacyBetweenAis_194334058166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389566;
     Object term389567;

    public MissionHandling_handleDiplomacyBetweenAis_194334058166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389566 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.MissionHandling"));
        term389567 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.MissionHandling");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.Game");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term389567;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "handleDiplomacyBetweenAis", argTypes, term389566, args);
    }

};


