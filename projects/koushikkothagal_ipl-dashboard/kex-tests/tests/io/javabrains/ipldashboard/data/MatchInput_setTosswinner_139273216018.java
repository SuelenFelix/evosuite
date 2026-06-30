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

public class MatchInput_setTosswinner_139273216018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6552;

    public MatchInput_setTosswinner_139273216018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6552 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term6552, term6552.getClass(), "id", "wBGfLpNNiZ");
        setField(term6552, term6552.getClass(), "city", "yUGCjlqgJE");
        setField(term6552, term6552.getClass(), "date", "PXdVZyoJyC");
        setField(term6552, term6552.getClass(), "player_of_match", "vLerpqavFM");
        setField(term6552, term6552.getClass(), "venue", "qnvxzwuGKX");
        setField(term6552, term6552.getClass(), "neutral_venue", "EdPAvpluZg");
        setField(term6552, term6552.getClass(), "team1", "DzHVBMqWtE");
        setField(term6552, term6552.getClass(), "team2", "THZSpzBRYP");
        setField(term6552, term6552.getClass(), "toss_winner", "ZfBIVGBQOE");
        setField(term6552, term6552.getClass(), "toss_decision", "QSrDQfEsTR");
        setField(term6552, term6552.getClass(), "winner", "PsqusYmejD");
        setField(term6552, term6552.getClass(), "result", "NTWMiBEaDF");
        setField(term6552, term6552.getClass(), "result_margin", "SPBstwKFVr");
        setField(term6552, term6552.getClass(), "eliminator", "WxYUTuqmIq");
        setField(term6552, term6552.getClass(), "method", "OeQLvhVERT");
        setField(term6552, term6552.getClass(), "umpire1", "IlvgFINwIa");
        setField(term6552, term6552.getClass(), "umpire2", "GEJABPlHSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aQFUvuaYxd";
        callMethod(klass, "setToss_winner", argTypes, term6552, args);
    }

};


