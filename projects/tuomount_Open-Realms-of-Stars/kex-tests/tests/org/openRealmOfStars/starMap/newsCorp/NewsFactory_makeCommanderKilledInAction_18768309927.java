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

public class NewsFactory_makeCommanderKilledInAction_18768309927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253721;
     Object term253722;
     Object term253724;
     Object term253726;

    public NewsFactory_makeCommanderKilledInAction_18768309927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253721 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory"));
        term253722 = new Boolean(false);
        term253724 = new Boolean(false);
        term253726 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term253722;
        args[5] = term253724;
        args[6] = term253726;
        callMethod(klass, "makeCommanderKilledInAction", argTypes, term253721, args);
    }

};


