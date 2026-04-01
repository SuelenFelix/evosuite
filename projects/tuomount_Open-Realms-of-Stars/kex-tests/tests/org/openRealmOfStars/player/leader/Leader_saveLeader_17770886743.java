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

public class Leader_saveLeader_17770886743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657620;

    public Leader_saveLeader_17770886743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657620 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term657620, term657620.getClass(), "name", null);
        setField(term657620, term657620.getClass(), "homeworld", null);
        setIntField(term657620, term657620.getClass(), "age", 0);
        setIntField(term657620, term657620.getClass(), "timeInJob", 0);
        setIntField(term657620, term657620.getClass(), "level", 0);
        setIntField(term657620, term657620.getClass(), "experience", 0);
        setField(term657620, term657620.getClass(), "militaryRank", null);
        setField(term657620, term657620.getClass(), "gender", null);
        setField(term657620, term657620.getClass(), "race", null);
        setField(term657620, term657620.getClass(), "title", null);
        setField(term657620, term657620.getClass(), "job", null);
        setField(term657620, term657620.getClass(), "parent", null);
        setIntField(term657620, term657620.getClass(), "parentIndex", 0);
        setField(term657620, term657620.getClass(), "perkList", null);
        setField(term657620, term657620.getClass(), "stats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "saveLeader", argTypes, term657620, args);
    }

};


