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

public class MatchInput_getMethod_61005553029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10809;

    public MatchInput_getMethod_61005553029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10809 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term10809, term10809.getClass(), "id", "BYrGukTyof");
        setField(term10809, term10809.getClass(), "city", "jiCGTTzKGB");
        setField(term10809, term10809.getClass(), "date", "MqICFYzDJj");
        setField(term10809, term10809.getClass(), "player_of_match", "YgQvdcBQKw");
        setField(term10809, term10809.getClass(), "venue", "FiYYLuailz");
        setField(term10809, term10809.getClass(), "neutral_venue", "XebAeSnCKZ");
        setField(term10809, term10809.getClass(), "team1", "GeddnXjHGy");
        setField(term10809, term10809.getClass(), "team2", "vLTbaoAxBm");
        setField(term10809, term10809.getClass(), "toss_winner", "BXTjEyEZxD");
        setField(term10809, term10809.getClass(), "toss_decision", "oKhVzOKUFW");
        setField(term10809, term10809.getClass(), "winner", "mNHyqmOAFy");
        setField(term10809, term10809.getClass(), "result", "UxgSdhxPCH");
        setField(term10809, term10809.getClass(), "result_margin", "DAujxZPHJC");
        setField(term10809, term10809.getClass(), "eliminator", "IlBhdrCvHq");
        setField(term10809, term10809.getClass(), "method", "OirVUQhauU");
        setField(term10809, term10809.getClass(), "umpire1", "GLbyDfbNZI");
        setField(term10809, term10809.getClass(), "umpire2", "oNLcCYDAsO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term10809, args);
    }

};


