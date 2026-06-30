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

public class MatchInput_getId_110008982036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13125;

    public MatchInput_getId_110008982036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13125 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term13125, term13125.getClass(), "id", null);
        setField(term13125, term13125.getClass(), "city", null);
        setField(term13125, term13125.getClass(), "date", null);
        setField(term13125, term13125.getClass(), "player_of_match", null);
        setField(term13125, term13125.getClass(), "venue", null);
        setField(term13125, term13125.getClass(), "neutral_venue", null);
        setField(term13125, term13125.getClass(), "team1", null);
        setField(term13125, term13125.getClass(), "team2", null);
        setField(term13125, term13125.getClass(), "toss_winner", null);
        setField(term13125, term13125.getClass(), "toss_decision", null);
        setField(term13125, term13125.getClass(), "winner", null);
        setField(term13125, term13125.getClass(), "result", null);
        setField(term13125, term13125.getClass(), "result_margin", null);
        setField(term13125, term13125.getClass(), "eliminator", null);
        setField(term13125, term13125.getClass(), "method", null);
        setField(term13125, term13125.getClass(), "umpire1", null);
        setField(term13125, term13125.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13125, args);
    }

};


