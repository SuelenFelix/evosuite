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

public class MatchInput_getVenue_3601945089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3089;

    public MatchInput_getVenue_3601945089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3089 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term3089, term3089.getClass(), "id", "LWyEaeIyAo");
        setField(term3089, term3089.getClass(), "city", "yVMkkQhvmN");
        setField(term3089, term3089.getClass(), "date", "mvrkADEgpp");
        setField(term3089, term3089.getClass(), "player_of_match", "pXOkjyeIRb");
        setField(term3089, term3089.getClass(), "venue", "GgZWSjxjyE");
        setField(term3089, term3089.getClass(), "neutral_venue", "EeBVbzjcCI");
        setField(term3089, term3089.getClass(), "team1", "UfQtPRyWRC");
        setField(term3089, term3089.getClass(), "team2", "FPvxVzzSvD");
        setField(term3089, term3089.getClass(), "toss_winner", "WHcwFgsGFC");
        setField(term3089, term3089.getClass(), "toss_decision", "HzqpegHiRq");
        setField(term3089, term3089.getClass(), "winner", "jwsfVjMoJT");
        setField(term3089, term3089.getClass(), "result", "ZfdXfCCFDf");
        setField(term3089, term3089.getClass(), "result_margin", "MwwjNtdOFT");
        setField(term3089, term3089.getClass(), "eliminator", "VYkqXKVlAJ");
        setField(term3089, term3089.getClass(), "method", "XkIoWJRNwN");
        setField(term3089, term3089.getClass(), "umpire1", "aNWLJdrZMq");
        setField(term3089, term3089.getClass(), "umpire2", "HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVenue", argTypes, term3089, args);
    }

};


