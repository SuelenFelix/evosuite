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

public class MatchInput_getDate_6675347295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545;

    public MatchInput_getDate_6675347295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1545 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term1545, term1545.getClass(), "id", "whBvTVIIlC");
        setField(term1545, term1545.getClass(), "city", "IgRJUzaCwW");
        setField(term1545, term1545.getClass(), "date", "JUmudUmaaV");
        setField(term1545, term1545.getClass(), "player_of_match", "KoyGrUJeJW");
        setField(term1545, term1545.getClass(), "venue", "HqBOwkVqjD");
        setField(term1545, term1545.getClass(), "neutral_venue", "MAcUBcBckh");
        setField(term1545, term1545.getClass(), "team1", "oVgzLbrsFr");
        setField(term1545, term1545.getClass(), "team2", "vQVyKLdtaz");
        setField(term1545, term1545.getClass(), "toss_winner", "OWKQODBLzb");
        setField(term1545, term1545.getClass(), "toss_decision", "wGmYcqUkgE");
        setField(term1545, term1545.getClass(), "winner", "idgaQsnJpQ");
        setField(term1545, term1545.getClass(), "result", "VgZnGoIFwQ");
        setField(term1545, term1545.getClass(), "result_margin", "jUbSRrkrYZ");
        setField(term1545, term1545.getClass(), "eliminator", "bWWfajKbEX");
        setField(term1545, term1545.getClass(), "method", "cAPeiZHKGJ");
        setField(term1545, term1545.getClass(), "umpire1", "LvJFtLBaxj");
        setField(term1545, term1545.getClass(), "umpire2", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term1545, args);
    }

};


