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

public class MatchInput_setTosswinner_139273216053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13142;

    public MatchInput_setTosswinner_139273216053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13142 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term13142, term13142.getClass(), "id", null);
        setField(term13142, term13142.getClass(), "city", null);
        setField(term13142, term13142.getClass(), "date", null);
        setField(term13142, term13142.getClass(), "player_of_match", null);
        setField(term13142, term13142.getClass(), "venue", null);
        setField(term13142, term13142.getClass(), "neutral_venue", null);
        setField(term13142, term13142.getClass(), "team1", null);
        setField(term13142, term13142.getClass(), "team2", null);
        setField(term13142, term13142.getClass(), "toss_winner", null);
        setField(term13142, term13142.getClass(), "toss_decision", null);
        setField(term13142, term13142.getClass(), "winner", null);
        setField(term13142, term13142.getClass(), "result", null);
        setField(term13142, term13142.getClass(), "result_margin", null);
        setField(term13142, term13142.getClass(), "eliminator", null);
        setField(term13142, term13142.getClass(), "method", null);
        setField(term13142, term13142.getClass(), "umpire1", null);
        setField(term13142, term13142.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setToss_winner", argTypes, term13142, args);
    }

};


