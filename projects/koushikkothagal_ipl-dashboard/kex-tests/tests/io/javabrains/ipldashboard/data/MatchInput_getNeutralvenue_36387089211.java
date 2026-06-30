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

public class MatchInput_getNeutralvenue_36387089211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3861;

    public MatchInput_getNeutralvenue_36387089211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3861 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term3861, term3861.getClass(), "id", "cudZvLMQon");
        setField(term3861, term3861.getClass(), "city", "lihXWlGDxk");
        setField(term3861, term3861.getClass(), "date", "JmcmxoGhIK");
        setField(term3861, term3861.getClass(), "player_of_match", "jXzmYyrnnT");
        setField(term3861, term3861.getClass(), "venue", "igCAtimmYB");
        setField(term3861, term3861.getClass(), "neutral_venue", "DyiXbeYIaN");
        setField(term3861, term3861.getClass(), "team1", "VGizxZnyHX");
        setField(term3861, term3861.getClass(), "team2", "kVEZMHmRtR");
        setField(term3861, term3861.getClass(), "toss_winner", "ekxGuOYIwi");
        setField(term3861, term3861.getClass(), "toss_decision", "RbVQXSpxXy");
        setField(term3861, term3861.getClass(), "winner", "YpJbIgJWWv");
        setField(term3861, term3861.getClass(), "result", "JppkknKVOw");
        setField(term3861, term3861.getClass(), "result_margin", "iljANwuEjk");
        setField(term3861, term3861.getClass(), "eliminator", "kNqaJKIATy");
        setField(term3861, term3861.getClass(), "method", "vKQukfbJUd");
        setField(term3861, term3861.getClass(), "umpire1", "lFRJFUMVbx");
        setField(term3861, term3861.getClass(), "umpire2", "sZdUNdggUW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNeutral_venue", argTypes, term3861, args);
    }

};


