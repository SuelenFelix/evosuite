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

public class MatchInput_getWinner_5318111221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7721;

    public MatchInput_getWinner_5318111221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7721 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term7721, term7721.getClass(), "id", "mLwibAPEsa");
        setField(term7721, term7721.getClass(), "city", "zsWKWiTFuo");
        setField(term7721, term7721.getClass(), "date", "UPUbwyHQKN");
        setField(term7721, term7721.getClass(), "player_of_match", "lgQkrXANyI");
        setField(term7721, term7721.getClass(), "venue", "MeTmRZXErV");
        setField(term7721, term7721.getClass(), "neutral_venue", "jNxbVmoZgq");
        setField(term7721, term7721.getClass(), "team1", "PvmBHIXaMY");
        setField(term7721, term7721.getClass(), "team2", "hulYxtowxw");
        setField(term7721, term7721.getClass(), "toss_winner", "GNEmuHPNcU");
        setField(term7721, term7721.getClass(), "toss_decision", "IoSfuKDFRe");
        setField(term7721, term7721.getClass(), "winner", "AWYyZiNfsm");
        setField(term7721, term7721.getClass(), "result", "ITRRYiuDwH");
        setField(term7721, term7721.getClass(), "result_margin", "llRfwANcVF");
        setField(term7721, term7721.getClass(), "eliminator", "sUEeHQTWkA");
        setField(term7721, term7721.getClass(), "method", "BDIRCxAWLA");
        setField(term7721, term7721.getClass(), "umpire1", "eOJfbiZLnb");
        setField(term7721, term7721.getClass(), "umpire2", "nKZKnxWYCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinner", argTypes, term7721, args);
    }

};


