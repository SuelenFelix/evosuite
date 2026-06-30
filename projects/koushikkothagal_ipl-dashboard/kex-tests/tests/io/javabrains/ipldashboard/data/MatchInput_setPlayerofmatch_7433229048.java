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

public class MatchInput_setPlayerofmatch_7433229048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2692;

    public MatchInput_setPlayerofmatch_7433229048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2692 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term2692, term2692.getClass(), "id", "WzMEhMXkKx");
        setField(term2692, term2692.getClass(), "city", "XOiDvlDhdc");
        setField(term2692, term2692.getClass(), "date", "AdxvLJhNLe");
        setField(term2692, term2692.getClass(), "player_of_match", "lHfTrWKMPk");
        setField(term2692, term2692.getClass(), "venue", "JDaAnsVTGV");
        setField(term2692, term2692.getClass(), "neutral_venue", "mLUZFTfjle");
        setField(term2692, term2692.getClass(), "team1", "xIeFjkHkOe");
        setField(term2692, term2692.getClass(), "team2", "SdCKLMIYnX");
        setField(term2692, term2692.getClass(), "toss_winner", "OJJtVNPyKZ");
        setField(term2692, term2692.getClass(), "toss_decision", "AKNapTAfmD");
        setField(term2692, term2692.getClass(), "winner", "xJgPlLxpgC");
        setField(term2692, term2692.getClass(), "result", "EYtfuJaxiM");
        setField(term2692, term2692.getClass(), "result_margin", "gCWtLVKVVe");
        setField(term2692, term2692.getClass(), "eliminator", "fWKJoSoCwE");
        setField(term2692, term2692.getClass(), "method", "wfaXBpWAUH");
        setField(term2692, term2692.getClass(), "umpire1", "VMeAzAHwZj");
        setField(term2692, term2692.getClass(), "umpire2", "PznxWXsZME");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "setPlayer_of_match", argTypes, term2692, args);
    }

};


