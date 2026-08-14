package org.nlpub.watset.eval;

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
import static org.nlpub.watset.eval.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PrecisionRecall_getPrecision_10280219207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;

    public PrecisionRecall_getPrecision_10280219207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.nlpub.watset.eval.PrecisionRecall"));
        setDoubleField(term26, term26.getClass(), "precision", 0.0);
        setDoubleField(term26, term26.getClass(), "recall", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.nlpub.watset.eval.PrecisionRecall");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrecision", argTypes, term26, args);
    }

};


