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

public class MatchInput_getResultmargin_10454455725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9265;

    public MatchInput_getResultmargin_10454455725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9265 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term9265, term9265.getClass(), "id", "EusenEbIoF");
        setField(term9265, term9265.getClass(), "city", "SScVQYSvWH");
        setField(term9265, term9265.getClass(), "date", "MnovcqFhCl");
        setField(term9265, term9265.getClass(), "player_of_match", "qYtAeLzOhW");
        setField(term9265, term9265.getClass(), "venue", "tJzmOfcUnY");
        setField(term9265, term9265.getClass(), "neutral_venue", "TKlccZUpjz");
        setField(term9265, term9265.getClass(), "team1", "GGzwMoHZXC");
        setField(term9265, term9265.getClass(), "team2", "IpmgwHTgnG");
        setField(term9265, term9265.getClass(), "toss_winner", "tIpkeYIezR");
        setField(term9265, term9265.getClass(), "toss_decision", "YkZtEtthvz");
        setField(term9265, term9265.getClass(), "winner", "dwlZSxlXOo");
        setField(term9265, term9265.getClass(), "result", "lKrEAkypza");
        setField(term9265, term9265.getClass(), "result_margin", "KtuuNAqGCQ");
        setField(term9265, term9265.getClass(), "eliminator", "OGQsfjmReM");
        setField(term9265, term9265.getClass(), "method", "YsUtbngnRO");
        setField(term9265, term9265.getClass(), "umpire1", "JisaWUxcNb");
        setField(term9265, term9265.getClass(), "umpire2", "NxgmYPzWCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult_margin", argTypes, term9265, args);
    }

};


