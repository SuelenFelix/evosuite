package io.javabrains.ipldashboard.data;

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
import static io.javabrains.ipldashboard.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MatchInput_setUmpire2_185383668369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13158;

    public MatchInput_setUmpire2_185383668369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13158 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term13158, term13158.getClass(), "id", null);
        setField(term13158, term13158.getClass(), "city", null);
        setField(term13158, term13158.getClass(), "date", null);
        setField(term13158, term13158.getClass(), "player_of_match", null);
        setField(term13158, term13158.getClass(), "venue", null);
        setField(term13158, term13158.getClass(), "neutral_venue", null);
        setField(term13158, term13158.getClass(), "team1", null);
        setField(term13158, term13158.getClass(), "team2", null);
        setField(term13158, term13158.getClass(), "toss_winner", null);
        setField(term13158, term13158.getClass(), "toss_decision", null);
        setField(term13158, term13158.getClass(), "winner", null);
        setField(term13158, term13158.getClass(), "result", null);
        setField(term13158, term13158.getClass(), "result_margin", null);
        setField(term13158, term13158.getClass(), "eliminator", null);
        setField(term13158, term13158.getClass(), "method", null);
        setField(term13158, term13158.getClass(), "umpire1", null);
        setField(term13158, term13158.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUmpire2", argTypes, term13158, args);
    }

};


