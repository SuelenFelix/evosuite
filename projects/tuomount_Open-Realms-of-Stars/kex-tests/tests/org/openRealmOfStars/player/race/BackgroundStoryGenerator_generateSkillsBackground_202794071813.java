package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BackgroundStoryGenerator_generateSkillsBackground_202794071813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78911;

    public BackgroundStoryGenerator_generateSkillsBackground_202794071813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78911 = newInstance(Class.forName("org.openRealmOfStars.player.race.BackgroundStoryGenerator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.BackgroundStoryGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateSkillsBackground", argTypes, term78911, args);
    }

};


