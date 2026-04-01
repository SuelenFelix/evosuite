package org.openRealmOfStars.player.leader.stats;

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
import static org.openRealmOfStars.player.leader.stats.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LeaderStats_saveLeaderStats_83607711210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32865;

    public LeaderStats_saveLeaderStats_83607711210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32865 = newInstance(Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats"));
        setField(term32865, term32865.getClass(), "statsMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveLeaderStats", argTypes, term32865, args);
    }

};


