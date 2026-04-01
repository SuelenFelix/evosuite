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

public class Leader_saveLeader_177708867446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4449672;

    public Leader_saveLeader_177708867446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4449672 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term4449672, term4449672.getClass(), "name", null);
        setField(term4449672, term4449672.getClass(), "homeworld", null);
        setIntField(term4449672, term4449672.getClass(), "age", 0);
        setIntField(term4449672, term4449672.getClass(), "timeInJob", 0);
        setIntField(term4449672, term4449672.getClass(), "level", 0);
        setIntField(term4449672, term4449672.getClass(), "experience", 0);
        setField(term4449672, term4449672.getClass(), "militaryRank", null);
        setField(term4449672, term4449672.getClass(), "gender", null);
        setField(term4449672, term4449672.getClass(), "race", null);
        setField(term4449672, term4449672.getClass(), "title", null);
        setField(term4449672, term4449672.getClass(), "job", null);
        setField(term4449672, term4449672.getClass(), "parent", null);
        setIntField(term4449672, term4449672.getClass(), "parentIndex", 0);
        setField(term4449672, term4449672.getClass(), "perkList", null);
        setField(term4449672, term4449672.getClass(), "stats", null);
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
        callMethod(klass, "saveLeader", argTypes, term4449672, args);
    }

};


