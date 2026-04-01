package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class NewsFactory_makeCommanderInCombat_101303179331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305954;
     Object term305955;
     Object term305957;
     Object term305959;
     Object term305961;

    public NewsFactory_makeCommanderInCombat_101303179331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305954 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory"));
        term305955 = new Boolean(false);
        term305957 = new Integer(0);
        term305959 = new Integer(0);
        term305961 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term305955;
        args[4] = null;
        args[5] = term305957;
        args[6] = term305959;
        args[7] = term305961;
        callMethod(klass, "makeCommanderInCombat", argTypes, term305954, args);
    }

};


