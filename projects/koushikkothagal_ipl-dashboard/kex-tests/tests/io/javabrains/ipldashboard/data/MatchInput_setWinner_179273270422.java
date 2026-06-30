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

public class MatchInput_setWinner_179273270422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8096;

    public MatchInput_setWinner_179273270422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8096 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term8096, term8096.getClass(), "id", "JOqQxuzRuZ");
        setField(term8096, term8096.getClass(), "city", "RSaoipUlsg");
        setField(term8096, term8096.getClass(), "date", "cSHGbqKqlN");
        setField(term8096, term8096.getClass(), "player_of_match", "pFAfANnxup");
        setField(term8096, term8096.getClass(), "venue", "FbSIUZyBXZ");
        setField(term8096, term8096.getClass(), "neutral_venue", "mhQDwIyrRi");
        setField(term8096, term8096.getClass(), "team1", "HpZXWDPhlg");
        setField(term8096, term8096.getClass(), "team2", "lBOokzEPfe");
        setField(term8096, term8096.getClass(), "toss_winner", "dtGZCsKXbW");
        setField(term8096, term8096.getClass(), "toss_decision", "bdyhHbDAmJ");
        setField(term8096, term8096.getClass(), "winner", "BBXiTNHqGE");
        setField(term8096, term8096.getClass(), "result", "IEYhJmgCVd");
        setField(term8096, term8096.getClass(), "result_margin", "KSJeYkkvpk");
        setField(term8096, term8096.getClass(), "eliminator", "qUtkFGMNUV");
        setField(term8096, term8096.getClass(), "method", "mGRiYhnMcR");
        setField(term8096, term8096.getClass(), "umpire1", "NFlvfJCVPO");
        setField(term8096, term8096.getClass(), "umpire2", "KarbTXFmUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiUSjqwSIQ";
        callMethod(klass, "setWinner", argTypes, term8096, args);
    }

};


