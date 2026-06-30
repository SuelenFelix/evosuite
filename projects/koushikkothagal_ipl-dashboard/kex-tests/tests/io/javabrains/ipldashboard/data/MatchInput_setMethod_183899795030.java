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

public class MatchInput_setMethod_183899795030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11184;

    public MatchInput_setMethod_183899795030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11184 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term11184, term11184.getClass(), "id", "CNqMxLvtcJ");
        setField(term11184, term11184.getClass(), "city", "ktbqerIaKW");
        setField(term11184, term11184.getClass(), "date", "VoghngXfsK");
        setField(term11184, term11184.getClass(), "player_of_match", "GbahCBMvct");
        setField(term11184, term11184.getClass(), "venue", "iiHBhsNFgk");
        setField(term11184, term11184.getClass(), "neutral_venue", "HknsTajwxJ");
        setField(term11184, term11184.getClass(), "team1", "XtiurrVYKw");
        setField(term11184, term11184.getClass(), "team2", "rsumfoDNHa");
        setField(term11184, term11184.getClass(), "toss_winner", "ceCWHUTQUM");
        setField(term11184, term11184.getClass(), "toss_decision", "LrqwfrKKtS");
        setField(term11184, term11184.getClass(), "winner", "ZUdnQXfzCI");
        setField(term11184, term11184.getClass(), "result", "EULDrUNQvw");
        setField(term11184, term11184.getClass(), "result_margin", "BtvAvsJSei");
        setField(term11184, term11184.getClass(), "eliminator", "vqnBkkxoIa");
        setField(term11184, term11184.getClass(), "method", "bycpZjxXFn");
        setField(term11184, term11184.getClass(), "umpire1", "jQWttOAiwL");
        setField(term11184, term11184.getClass(), "umpire2", "DzKFxEuEEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAMnvfDLJL";
        callMethod(klass, "setMethod", argTypes, term11184, args);
    }

};


