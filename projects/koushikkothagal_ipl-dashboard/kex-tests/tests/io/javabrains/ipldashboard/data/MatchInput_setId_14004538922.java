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

public class MatchInput_setId_14004538922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;

    public MatchInput_setId_14004538922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term376, term376.getClass(), "id", "tbcdzjIfER");
        setField(term376, term376.getClass(), "city", "HyxfbSQYBe");
        setField(term376, term376.getClass(), "date", "pCTimMblYc");
        setField(term376, term376.getClass(), "player_of_match", "hNxWaHcfhY");
        setField(term376, term376.getClass(), "venue", "RkybSrpybU");
        setField(term376, term376.getClass(), "neutral_venue", "xOEqzGAmDU");
        setField(term376, term376.getClass(), "team1", "eZFUvlxvGV");
        setField(term376, term376.getClass(), "team2", "BYqFIqCKAV");
        setField(term376, term376.getClass(), "toss_winner", "vrQLuWIDJX");
        setField(term376, term376.getClass(), "toss_decision", "flxyYxBRtu");
        setField(term376, term376.getClass(), "winner", "OclPbYPkcH");
        setField(term376, term376.getClass(), "result", "IoAlmYsBwc");
        setField(term376, term376.getClass(), "result_margin", "TEParAifyi");
        setField(term376, term376.getClass(), "eliminator", "OWDIEULEFu");
        setField(term376, term376.getClass(), "method", "dWRymuLBtr");
        setField(term376, term376.getClass(), "umpire1", "AijpHYOFuy");
        setField(term376, term376.getClass(), "umpire2", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setId", argTypes, term376, args);
    }

};


