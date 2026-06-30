package io.javabrains.ipldashboard.model;

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
import static io.javabrains.ipldashboard.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Match_getTeam1_39293852411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2773;

    public Match_getTeam1_39293852411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2773 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term2787 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2773, term2773.getClass(), "id", -8885298608300233488L);
        setField(term2773, term2773.getClass(), "city", "XOiDvlDhdc");
        setIntField(term2787, term2787.getClass(), "year", 2020);
        setShortField(term2787, term2787.getClass(), "month", (short) 5);
        setShortField(term2787, term2787.getClass(), "day", (short) 14);
        setField(term2773, term2773.getClass(), "date", term2787);
        setField(term2773, term2773.getClass(), "playerOfMatch", "AdxvLJhNLe");
        setField(term2773, term2773.getClass(), "venue", "lHfTrWKMPk");
        setField(term2773, term2773.getClass(), "team1", "JDaAnsVTGV");
        setField(term2773, term2773.getClass(), "team2", "mLUZFTfjle");
        setField(term2773, term2773.getClass(), "tossWinner", "xIeFjkHkOe");
        setField(term2773, term2773.getClass(), "tossDecision", "SdCKLMIYnX");
        setField(term2773, term2773.getClass(), "matchWinner", "OJJtVNPyKZ");
        setField(term2773, term2773.getClass(), "result", "AKNapTAfmD");
        setField(term2773, term2773.getClass(), "resultMargin", "xJgPlLxpgC");
        setField(term2773, term2773.getClass(), "umpire1", "EYtfuJaxiM");
        setField(term2773, term2773.getClass(), "umpire2", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeam1", argTypes, term2773, args);
    }

};


