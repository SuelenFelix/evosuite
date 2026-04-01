package org.openRealmOfStars.starMap.history.event;

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
import static org.openRealmOfStars.starMap.history.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LeaderEvent_init_11414265781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26479;

    public LeaderEvent_init_11414265781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26479 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term26479;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


