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
import java.lang.Integer;

public class NewsFactory_makeActivateGravityRipperNews_413090599105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907046;
     Object term907047;

    public NewsFactory_makeActivateGravityRipperNews_413090599105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term907046 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory"));
        term907047 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[3];
        args[0] = term907047;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "makeActivateGravityRipperNews", argTypes, term907046, args);
    }

};


