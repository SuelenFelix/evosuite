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

public class MatchInput_setUmpire2_185383668334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12728;

    public MatchInput_setUmpire2_185383668334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12728 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term12728, term12728.getClass(), "id", "ZwjARhAtHC");
        setField(term12728, term12728.getClass(), "city", "XXvscsYBWv");
        setField(term12728, term12728.getClass(), "date", "uePedtiAfL");
        setField(term12728, term12728.getClass(), "player_of_match", "AdSHvysxQB");
        setField(term12728, term12728.getClass(), "venue", "jlraKkBWFA");
        setField(term12728, term12728.getClass(), "neutral_venue", "mRBtFTxVdE");
        setField(term12728, term12728.getClass(), "team1", "IVacFDAZcj");
        setField(term12728, term12728.getClass(), "team2", "EEYmuwyVDP");
        setField(term12728, term12728.getClass(), "toss_winner", "EWFbEDAVrE");
        setField(term12728, term12728.getClass(), "toss_decision", "EMiMtYgfvr");
        setField(term12728, term12728.getClass(), "winner", "OyYyYYnJuF");
        setField(term12728, term12728.getClass(), "result", "aYLvcxZohT");
        setField(term12728, term12728.getClass(), "result_margin", "mnHyQbMyld");
        setField(term12728, term12728.getClass(), "eliminator", "KHtaDOIcJZ");
        setField(term12728, term12728.getClass(), "method", "vgdwrCZczl");
        setField(term12728, term12728.getClass(), "umpire1", "gKMNrpKBpu");
        setField(term12728, term12728.getClass(), "umpire2", "ZbHJVEqcoa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "awDQVEVIKi";
        callMethod(klass, "setUmpire2", argTypes, term12728, args);
    }

};


