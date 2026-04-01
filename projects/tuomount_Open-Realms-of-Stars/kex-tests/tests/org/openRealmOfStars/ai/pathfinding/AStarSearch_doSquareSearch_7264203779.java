package org.openRealmOfStars.ai.pathfinding;

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
import static org.openRealmOfStars.ai.pathfinding.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class AStarSearch_doSquareSearch_7264203779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17199;

    public AStarSearch_doSquareSearch_7264203779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17207 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17207, term17207.getClass(), "x", -1433815725);
        setIntField(term17207, term17207.getClass(), "y", -1445089135);
        setDoubleField(term17207, term17207.getClass(), "distance", 0.22651340641904605);
        Object term17211 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17211, term17211.getClass(), "x", -291618851);
        setIntField(term17211, term17211.getClass(), "y", -378436487);
        setDoubleField(term17211, term17211.getClass(), "distance", 0.8878841294187743);
        Object term17215 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17215, term17215.getClass(), "x", 584949609);
        setIntField(term17215, term17215.getClass(), "y", 879795058);
        setDoubleField(term17215, term17215.getClass(), "distance", 0.6588948704887806);
        Object term17219 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17219, term17219.getClass(), "x", -1016087889);
        setIntField(term17219, term17219.getClass(), "y", 1968287557);
        setDoubleField(term17219, term17219.getClass(), "distance", 0.6397214730945112);
        Object term17223 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17223, term17223.getClass(), "x", 1101385603);
        setIntField(term17223, term17223.getClass(), "y", 1980267589);
        setDoubleField(term17223, term17223.getClass(), "distance", 0.25937345430928016);
        ArrayList term17205 = new ArrayList();
        ((ArrayList) term17205).add(term17207);
        ((ArrayList) term17205).add(term17211);
        ((ArrayList) term17205).add(term17215);
        ((ArrayList) term17205).add(term17219);
        ((ArrayList) term17205).add(term17223);
        term17199 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17202 = (Object[]) newArray("[I", 2);
        int[] term17203 = (int[]) newIntArray(0);
        int[] term17204 = (int[]) newIntArray(0);
        Object term17232 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17199, term17199.getClass(), "maxX", 2106616847);
        setIntField(term17199, term17199.getClass(), "maxY", 403107947);
        setElement(term17202, 0, term17203);
        setElement(term17202, 1, term17204);
        setField(term17199, term17199.getClass(), "blockMap", term17202);
        setField(term17199, term17199.getClass(), "points", term17205);
        setIntField(term17199, term17199.getClass(), "tx", -2009434910);
        setIntField(term17199, term17199.getClass(), "ty", -374887532);
        setIntField(term17199, term17199.getClass(), "targetDistance", -165487736);
        setIntField(term17232, term17232.getClass(), "x", -608393431);
        setIntField(term17232, term17232.getClass(), "y", 298082829);
        setDoubleField(term17232, term17232.getClass(), "distance", 0.5873228247510078);
        setField(term17199, term17199.getClass(), "targetPoint", term17232);
        setIntField(term17199, term17199.getClass(), "routeIndex", -1494372780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doSquareSearch", argTypes, term17199, args);
    }

};


