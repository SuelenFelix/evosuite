package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Leader_assignJob_128506132130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049730;

    public Leader_assignJob_128506132130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049730 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1049730, term1049730.getClass(), "name", null);
        setField(term1049730, term1049730.getClass(), "homeworld", null);
        setIntField(term1049730, term1049730.getClass(), "age", 0);
        setIntField(term1049730, term1049730.getClass(), "timeInJob", 0);
        setIntField(term1049730, term1049730.getClass(), "level", 0);
        setIntField(term1049730, term1049730.getClass(), "experience", 0);
        setField(term1049730, term1049730.getClass(), "militaryRank", null);
        setField(term1049730, term1049730.getClass(), "gender", null);
        setField(term1049730, term1049730.getClass(), "race", null);
        setField(term1049730, term1049730.getClass(), "title", null);
        setField(term1049730, term1049730.getClass(), "job", null);
        setField(term1049730, term1049730.getClass(), "parent", null);
        setIntField(term1049730, term1049730.getClass(), "parentIndex", 0);
        setField(term1049730, term1049730.getClass(), "perkList", null);
        setField(term1049730, term1049730.getClass(), "stats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Job");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "assignJob", argTypes, term1049730, args);
    }

};


