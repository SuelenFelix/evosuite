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

public class MatchInput_getTossdecision_112663280319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6949;

    public MatchInput_getTossdecision_112663280319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6949 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term6949, term6949.getClass(), "id", "zNFLXMifnS");
        setField(term6949, term6949.getClass(), "city", "HHQcYMSBVc");
        setField(term6949, term6949.getClass(), "date", "wdoqITnaAP");
        setField(term6949, term6949.getClass(), "player_of_match", "rIPMBcrNqB");
        setField(term6949, term6949.getClass(), "venue", "UDaboHZHhz");
        setField(term6949, term6949.getClass(), "neutral_venue", "nRvKihUSPj");
        setField(term6949, term6949.getClass(), "team1", "BbNeQJpYPr");
        setField(term6949, term6949.getClass(), "team2", "riMtzCoxNj");
        setField(term6949, term6949.getClass(), "toss_winner", "YAXkVjQZcV");
        setField(term6949, term6949.getClass(), "toss_decision", "pumvwBWvpy");
        setField(term6949, term6949.getClass(), "winner", "HwLHeGLyhe");
        setField(term6949, term6949.getClass(), "result", "RDnkgWkcbz");
        setField(term6949, term6949.getClass(), "result_margin", "IBpaxltauX");
        setField(term6949, term6949.getClass(), "eliminator", "hePqROaplw");
        setField(term6949, term6949.getClass(), "method", "PJcSNDruWd");
        setField(term6949, term6949.getClass(), "umpire1", "VVNNlAePXF");
        setField(term6949, term6949.getClass(), "umpire2", "jnwVnmKAFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToss_decision", argTypes, term6949, args);
    }

};


