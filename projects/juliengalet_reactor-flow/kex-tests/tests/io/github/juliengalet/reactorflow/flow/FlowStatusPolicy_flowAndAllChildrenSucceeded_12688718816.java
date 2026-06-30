package io.github.juliengalet.reactorflow.flow;

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
import static io.github.juliengalet.reactorflow.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FlowStatusPolicy_flowAndAllChildrenSucceeded_12688718816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public FlowStatusPolicy_flowAndAllChildrenSucceeded_12688718816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("io.github.juliengalet.reactorflow.flow.FlowStatusPolicy"));
        setField(term3, term3.getClass(), "hasStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.flow.FlowStatusPolicy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flowAndAllChildrenSucceeded", argTypes, term3, args);
    }

};


