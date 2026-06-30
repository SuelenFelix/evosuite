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

public class MatchInput_setNeutralvenue_180431089212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4236;

    public MatchInput_setNeutralvenue_180431089212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4236 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term4236, term4236.getClass(), "id", "OqbwYQfvAe");
        setField(term4236, term4236.getClass(), "city", "tRxZafjqIx");
        setField(term4236, term4236.getClass(), "date", "DhjNLmRMCu");
        setField(term4236, term4236.getClass(), "player_of_match", "PgPzMSEjjX");
        setField(term4236, term4236.getClass(), "venue", "wzsPSPcRdj");
        setField(term4236, term4236.getClass(), "neutral_venue", "kGMQdqJYyB");
        setField(term4236, term4236.getClass(), "team1", "XJJNClzHRf");
        setField(term4236, term4236.getClass(), "team2", "HDaezxQfQR");
        setField(term4236, term4236.getClass(), "toss_winner", "iikZEapDlu");
        setField(term4236, term4236.getClass(), "toss_decision", "nhoHrZfnIN");
        setField(term4236, term4236.getClass(), "winner", "ZkMALXpEAZ");
        setField(term4236, term4236.getClass(), "result", "tXfQjSqDzN");
        setField(term4236, term4236.getClass(), "result_margin", "BjugTaMcxJ");
        setField(term4236, term4236.getClass(), "eliminator", "vGiuZVPJNH");
        setField(term4236, term4236.getClass(), "method", "tlzpzIjMib");
        setField(term4236, term4236.getClass(), "umpire1", "AZdLeSugwv");
        setField(term4236, term4236.getClass(), "umpire2", "RMsXuyzKJV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FwPbDZcHmB";
        callMethod(klass, "setNeutral_venue", argTypes, term4236, args);
    }

};


