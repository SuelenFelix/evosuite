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

public class MatchInput_setEliminator_5551029728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10412;

    public MatchInput_setEliminator_5551029728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10412 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term10412, term10412.getClass(), "id", "RTTvrwwhou");
        setField(term10412, term10412.getClass(), "city", "lRORwXipuk");
        setField(term10412, term10412.getClass(), "date", "fVdTcjgHdw");
        setField(term10412, term10412.getClass(), "player_of_match", "wwAwLLcLPp");
        setField(term10412, term10412.getClass(), "venue", "nHpMKOmlpQ");
        setField(term10412, term10412.getClass(), "neutral_venue", "fKhrQsJToZ");
        setField(term10412, term10412.getClass(), "team1", "wsysQLGFnl");
        setField(term10412, term10412.getClass(), "team2", "ckQLZGFjMX");
        setField(term10412, term10412.getClass(), "toss_winner", "qphdrqUtNx");
        setField(term10412, term10412.getClass(), "toss_decision", "bwlLFAfNWx");
        setField(term10412, term10412.getClass(), "winner", "JWodNQzjjV");
        setField(term10412, term10412.getClass(), "result", "CAgxWjhxNf");
        setField(term10412, term10412.getClass(), "result_margin", "goAoCMhKBu");
        setField(term10412, term10412.getClass(), "eliminator", "BWxJSgKHRT");
        setField(term10412, term10412.getClass(), "method", "AGXoIndFnm");
        setField(term10412, term10412.getClass(), "umpire1", "mwmFMNEzkK");
        setField(term10412, term10412.getClass(), "umpire2", "kVAmKknVln");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MRFLbEGYKG";
        callMethod(klass, "setEliminator", argTypes, term10412, args);
    }

};


