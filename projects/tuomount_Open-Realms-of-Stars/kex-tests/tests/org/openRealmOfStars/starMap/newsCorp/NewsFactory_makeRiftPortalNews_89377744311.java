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
import java.lang.Object;

public class NewsFactory_makeRiftPortalNews_89377744311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52481;
     Object term52483;
     Object term52499;

    public NewsFactory_makeRiftPortalNews_89377744311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52481 = new Integer(2002762153);
        term52483 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term52496 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term52483, term52483.getClass(), "name", "vTgJolwQXF");
        setIntField(term52496, term52496.getClass(), "x", -531666058);
        setIntField(term52496, term52496.getClass(), "y", -1659995523);
        setField(term52483, term52483.getClass(), "centerCoordinate", term52496);
        term52499 = new Integer(-109584269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Sun");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term52481;
        args[1] = term52483;
        args[2] = term52499;
        callMethod(klass, "makeRiftPortalNews", argTypes, null, args);
    }

};


