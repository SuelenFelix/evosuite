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

public class MatchInput_getTeam2_142710596615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5405;

    public MatchInput_getTeam2_142710596615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5405 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term5405, term5405.getClass(), "id", "UKAReurpHG");
        setField(term5405, term5405.getClass(), "city", "WVRMUmrljA");
        setField(term5405, term5405.getClass(), "date", "NTlKJDDWlk");
        setField(term5405, term5405.getClass(), "player_of_match", "vOuMEpOQAg");
        setField(term5405, term5405.getClass(), "venue", "SIODFGaQhr");
        setField(term5405, term5405.getClass(), "neutral_venue", "qYzsiuXOgS");
        setField(term5405, term5405.getClass(), "team1", "bxrCBbrrct");
        setField(term5405, term5405.getClass(), "team2", "CKWpJaaaxX");
        setField(term5405, term5405.getClass(), "toss_winner", "UBRmXJmfrt");
        setField(term5405, term5405.getClass(), "toss_decision", "WZzvmIHhzZ");
        setField(term5405, term5405.getClass(), "winner", "doQLHkjpNm");
        setField(term5405, term5405.getClass(), "result", "lCyLIcSuom");
        setField(term5405, term5405.getClass(), "result_margin", "CGOpQSZZwI");
        setField(term5405, term5405.getClass(), "eliminator", "ypEdrstygY");
        setField(term5405, term5405.getClass(), "method", "sNQFlATEeQ");
        setField(term5405, term5405.getClass(), "umpire1", "ZKMLioamsY");
        setField(term5405, term5405.getClass(), "umpire2", "WVbxuoDBcn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeam2", argTypes, term5405, args);
    }

};


