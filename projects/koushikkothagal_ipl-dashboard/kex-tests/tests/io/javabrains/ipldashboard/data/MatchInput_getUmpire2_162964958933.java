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

public class MatchInput_getUmpire2_162964958933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12353;

    public MatchInput_getUmpire2_162964958933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12353 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term12353, term12353.getClass(), "id", "UiWhvbypdr");
        setField(term12353, term12353.getClass(), "city", "CgleElJNje");
        setField(term12353, term12353.getClass(), "date", "ZrchvNGMtd");
        setField(term12353, term12353.getClass(), "player_of_match", "WaEcyVlcIx");
        setField(term12353, term12353.getClass(), "venue", "ONcbPCQnHd");
        setField(term12353, term12353.getClass(), "neutral_venue", "AobDaplFLl");
        setField(term12353, term12353.getClass(), "team1", "pDkMNnAGgv");
        setField(term12353, term12353.getClass(), "team2", "PaCpFXGzdX");
        setField(term12353, term12353.getClass(), "toss_winner", "FftYCNbnks");
        setField(term12353, term12353.getClass(), "toss_decision", "lJoltmsadS");
        setField(term12353, term12353.getClass(), "winner", "mvfDtZNEHr");
        setField(term12353, term12353.getClass(), "result", "bvSgmFUDOU");
        setField(term12353, term12353.getClass(), "result_margin", "XMHwbfiHRl");
        setField(term12353, term12353.getClass(), "eliminator", "bucTnYicnp");
        setField(term12353, term12353.getClass(), "method", "EkgprvqZlM");
        setField(term12353, term12353.getClass(), "umpire1", "fbnKvthhOz");
        setField(term12353, term12353.getClass(), "umpire2", "PGfCDJTBek");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmpire2", argTypes, term12353, args);
    }

};


