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

public class MatchInput_getPlayerofmatch_5802473367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2317;

    public MatchInput_getPlayerofmatch_5802473367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2317 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term2317, term2317.getClass(), "id", "qxSDVejjiY");
        setField(term2317, term2317.getClass(), "city", "xBsXSDjXYK");
        setField(term2317, term2317.getClass(), "date", "sEnIVFtZuQ");
        setField(term2317, term2317.getClass(), "player_of_match", "ZVecLZMLHF");
        setField(term2317, term2317.getClass(), "venue", "fztQhjqwdP");
        setField(term2317, term2317.getClass(), "neutral_venue", "eVpkWxjuki");
        setField(term2317, term2317.getClass(), "team1", "SJiQaLvSKv");
        setField(term2317, term2317.getClass(), "team2", "OEXDRUKcFl");
        setField(term2317, term2317.getClass(), "toss_winner", "RYdKCNNMBR");
        setField(term2317, term2317.getClass(), "toss_decision", "yGtHPyvYiQ");
        setField(term2317, term2317.getClass(), "winner", "MvRIxilFMJ");
        setField(term2317, term2317.getClass(), "result", "iNwOJRBEjp");
        setField(term2317, term2317.getClass(), "result_margin", "XylxrMBraH");
        setField(term2317, term2317.getClass(), "eliminator", "pORebkoRdD");
        setField(term2317, term2317.getClass(), "method", "mXGCWJDOqA");
        setField(term2317, term2317.getClass(), "umpire1", "dpNsDgfPso");
        setField(term2317, term2317.getClass(), "umpire2", "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_of_match", argTypes, term2317, args);
    }

};


