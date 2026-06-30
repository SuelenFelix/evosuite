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

public class MatchInput_setUmpire1_185383572232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11956;

    public MatchInput_setUmpire1_185383572232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11956 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term11956, term11956.getClass(), "id", "TcuXODkzBV");
        setField(term11956, term11956.getClass(), "city", "coJPjrBZNe");
        setField(term11956, term11956.getClass(), "date", "vMsWjuPTnO");
        setField(term11956, term11956.getClass(), "player_of_match", "zHvfKaOstO");
        setField(term11956, term11956.getClass(), "venue", "tOszriqETr");
        setField(term11956, term11956.getClass(), "neutral_venue", "ncSPTkhKjO");
        setField(term11956, term11956.getClass(), "team1", "jcWKHRWhyj");
        setField(term11956, term11956.getClass(), "team2", "nrQjODRMLD");
        setField(term11956, term11956.getClass(), "toss_winner", "PNoWXrsFic");
        setField(term11956, term11956.getClass(), "toss_decision", "QZBHZqZope");
        setField(term11956, term11956.getClass(), "winner", "VBUahCvyxC");
        setField(term11956, term11956.getClass(), "result", "MlzTkzKMCX");
        setField(term11956, term11956.getClass(), "result_margin", "UqKUbMyPMJ");
        setField(term11956, term11956.getClass(), "eliminator", "QpYltHAdyY");
        setField(term11956, term11956.getClass(), "method", "lbmSGBwIiV");
        setField(term11956, term11956.getClass(), "umpire1", "DAxyHoTLzZ");
        setField(term11956, term11956.getClass(), "umpire2", "fhZgTouhCC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wrikqJwXvL";
        callMethod(klass, "setUmpire1", argTypes, term11956, args);
    }

};


