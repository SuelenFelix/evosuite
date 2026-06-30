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

public class MatchInput_setTeam1_185077534314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5008;

    public MatchInput_setTeam1_185077534314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5008 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term5008, term5008.getClass(), "id", "TwfWVQGiIj");
        setField(term5008, term5008.getClass(), "city", "gUvcueTURF");
        setField(term5008, term5008.getClass(), "date", "EwQBhZjCIT");
        setField(term5008, term5008.getClass(), "player_of_match", "aSkmSwTnEw");
        setField(term5008, term5008.getClass(), "venue", "xvkbvaEGYd");
        setField(term5008, term5008.getClass(), "neutral_venue", "HBGNxdNURv");
        setField(term5008, term5008.getClass(), "team1", "mfCpTPPQQm");
        setField(term5008, term5008.getClass(), "team2", "OcJCIDNIXA");
        setField(term5008, term5008.getClass(), "toss_winner", "XfRABIFVEp");
        setField(term5008, term5008.getClass(), "toss_decision", "MHGKyEnwKc");
        setField(term5008, term5008.getClass(), "winner", "ShIELyuULw");
        setField(term5008, term5008.getClass(), "result", "IpQuOGMgmj");
        setField(term5008, term5008.getClass(), "result_margin", "pJbnHTYrxn");
        setField(term5008, term5008.getClass(), "eliminator", "iIRsCSYqXH");
        setField(term5008, term5008.getClass(), "method", "nghfqDXyCG");
        setField(term5008, term5008.getClass(), "umpire1", "WBAOTqErtm");
        setField(term5008, term5008.getClass(), "umpire2", "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rYbtIDVdnd";
        callMethod(klass, "setTeam1", argTypes, term5008, args);
    }

};


