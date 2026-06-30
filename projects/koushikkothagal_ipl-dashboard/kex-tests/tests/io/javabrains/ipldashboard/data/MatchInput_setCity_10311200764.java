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

public class MatchInput_setCity_10311200764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;

    public MatchInput_setCity_10311200764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1148 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term1148, term1148.getClass(), "id", "UoYtihxVaS");
        setField(term1148, term1148.getClass(), "city", "JDswTTCZHV");
        setField(term1148, term1148.getClass(), "date", "onpbIeEKoi");
        setField(term1148, term1148.getClass(), "player_of_match", "YRHGsAkhxb");
        setField(term1148, term1148.getClass(), "venue", "ffYhPOzlUs");
        setField(term1148, term1148.getClass(), "neutral_venue", "MLqYREekMl");
        setField(term1148, term1148.getClass(), "team1", "ytSBIKXogI");
        setField(term1148, term1148.getClass(), "team2", "nHXjMycHlU");
        setField(term1148, term1148.getClass(), "toss_winner", "ieCtQFdkii");
        setField(term1148, term1148.getClass(), "toss_decision", "dEnhdmILtU");
        setField(term1148, term1148.getClass(), "winner", "hoicvmsovO");
        setField(term1148, term1148.getClass(), "result", "eqJfYWRaEL");
        setField(term1148, term1148.getClass(), "result_margin", "fhkbdRViHi");
        setField(term1148, term1148.getClass(), "eliminator", "uWHnvSvaPl");
        setField(term1148, term1148.getClass(), "method", "kBdSllIBVz");
        setField(term1148, term1148.getClass(), "umpire1", "TJmVBGfTML");
        setField(term1148, term1148.getClass(), "umpire2", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        callMethod(klass, "setCity", argTypes, term1148, args);
    }

};


