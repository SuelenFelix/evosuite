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
import java.util.ArrayList;
import java.lang.Object;

public class Team_getMatches_11815517011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8895;

    public Team_getMatches_11815517011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8913 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8916 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8913, term8913.getClass(), "id", -1832940336320585644L);
        setField(term8913, term8913.getClass(), "city", "");
        setIntField(term8916, term8916.getClass(), "year", 2010);
        setShortField(term8916, term8916.getClass(), "month", (short) 7);
        setShortField(term8916, term8916.getClass(), "day", (short) 3);
        setField(term8913, term8913.getClass(), "date", term8916);
        setField(term8913, term8913.getClass(), "playerOfMatch", "");
        setField(term8913, term8913.getClass(), "venue", "");
        setField(term8913, term8913.getClass(), "team1", "");
        setField(term8913, term8913.getClass(), "team2", "");
        setField(term8913, term8913.getClass(), "tossWinner", "");
        setField(term8913, term8913.getClass(), "tossDecision", "");
        setField(term8913, term8913.getClass(), "matchWinner", "");
        setField(term8913, term8913.getClass(), "result", "");
        setField(term8913, term8913.getClass(), "resultMargin", "");
        setField(term8913, term8913.getClass(), "umpire1", "");
        setField(term8913, term8913.getClass(), "umpire2", "");
        ArrayList term8911 = new ArrayList();
        ((ArrayList) term8911).add(term8913);
        term8895 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8895, term8895.getClass(), "id", 1672578078364590450L);
        setField(term8895, term8895.getClass(), "teamName", "AbonCTtbef");
        setLongField(term8895, term8895.getClass(), "totalMatches", 4949335493504695457L);
        setLongField(term8895, term8895.getClass(), "totalWins", -5216789073301458893L);
        setField(term8895, term8895.getClass(), "matches", term8911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatches", argTypes, term8895, args);
    }

};


