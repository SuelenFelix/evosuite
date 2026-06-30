package io.javabrains.ipldashboard.model;

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
import static io.javabrains.ipldashboard.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Match_setTossWinner_159790307816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4167;

    public Match_setTossWinner_159790307816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4167 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term4181 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term4167, term4167.getClass(), "id", -316468845751588286L);
        setField(term4167, term4167.getClass(), "city", "YpJbIgJWWv");
        setIntField(term4181, term4181.getClass(), "year", 2029);
        setShortField(term4181, term4181.getClass(), "month", (short) 8);
        setShortField(term4181, term4181.getClass(), "day", (short) 28);
        setField(term4167, term4167.getClass(), "date", term4181);
        setField(term4167, term4167.getClass(), "playerOfMatch", "JppkknKVOw");
        setField(term4167, term4167.getClass(), "venue", "iljANwuEjk");
        setField(term4167, term4167.getClass(), "team1", "kNqaJKIATy");
        setField(term4167, term4167.getClass(), "team2", "vKQukfbJUd");
        setField(term4167, term4167.getClass(), "tossWinner", "lFRJFUMVbx");
        setField(term4167, term4167.getClass(), "tossDecision", "sZdUNdggUW");
        setField(term4167, term4167.getClass(), "matchWinner", "OqbwYQfvAe");
        setField(term4167, term4167.getClass(), "result", "tRxZafjqIx");
        setField(term4167, term4167.getClass(), "resultMargin", "DhjNLmRMCu");
        setField(term4167, term4167.getClass(), "umpire1", "PgPzMSEjjX");
        setField(term4167, term4167.getClass(), "umpire2", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setTossWinner", argTypes, term4167, args);
    }

};


