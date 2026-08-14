package org.nlpub.watset.cli;

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
import static org.nlpub.watset.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class SenseEmbeddingCommand_run_18036463111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SenseEmbeddingCommand_run_18036463111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3 = new Integer(568599855);
        HashMap term18 = new HashMap();
        term1 = newInstance(Class.forName("org.nlpub.watset.cli.SenseEmbeddingCommand"));
        Object term2 = newInstance(Class.forName("org.nlpub.watset.cli.Command$FixedClustersParameters"));
        Object term5 = newInstance(Class.forName("org.nlpub.watset.cli.Command$LocalParameters"));
        setField(term2, term2.getClass(), "k", term3);
        setField(term1, term1.getClass(), "fixed", term2);
        setField(term5, term5.getClass(), "algorithm", "PAEBtnZtTD");
        setField(term5, term5.getClass(), "params", term18);
        setField(term1, term1.getClass(), "local", term5);
        setField(term1, term1.getClass(), "parameters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.nlpub.watset.cli.SenseEmbeddingCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1, args);
    }

};


