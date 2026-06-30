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

public class MatchInput_setDate_10523418396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;

    public MatchInput_setDate_10523418396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1920 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term1920, term1920.getClass(), "id", "TimdotUuNC");
        setField(term1920, term1920.getClass(), "city", "PkWMRdJcBb");
        setField(term1920, term1920.getClass(), "date", "jSpAteRute");
        setField(term1920, term1920.getClass(), "player_of_match", "swZVeJAxjt");
        setField(term1920, term1920.getClass(), "venue", "xOcJIiQQDu");
        setField(term1920, term1920.getClass(), "neutral_venue", "GVizqqzXpy");
        setField(term1920, term1920.getClass(), "team1", "JqXGgAhZPl");
        setField(term1920, term1920.getClass(), "team2", "jiKYgYHqIS");
        setField(term1920, term1920.getClass(), "toss_winner", "DfISiziTgG");
        setField(term1920, term1920.getClass(), "toss_decision", "XqgfKFvPSD");
        setField(term1920, term1920.getClass(), "winner", "JiVRgTZvKc");
        setField(term1920, term1920.getClass(), "result", "XPKmummaqg");
        setField(term1920, term1920.getClass(), "result_margin", "BKLfkLiZTH");
        setField(term1920, term1920.getClass(), "eliminator", "SPpkrGcPRr");
        setField(term1920, term1920.getClass(), "method", "sEccwbJKYE");
        setField(term1920, term1920.getClass(), "umpire1", "AWRooQKkdW");
        setField(term1920, term1920.getClass(), "umpire2", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QXzGXbEXMu";
        callMethod(klass, "setDate", argTypes, term1920, args);
    }

};


