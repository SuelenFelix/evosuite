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

public class EmbeddingCommand_run_14763269771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;

    public EmbeddingCommand_run_14763269771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term871 = new Integer(1162663216);
        term869 = newInstance(Class.forName("org.nlpub.watset.cli.EmbeddingCommand"));
        Object term870 = newInstance(Class.forName("org.nlpub.watset.cli.Command$FixedClustersParameters"));
        setField(term870, term870.getClass(), "k", term871);
        setField(term869, term869.getClass(), "fixed", term870);
        setField(term869, term869.getClass(), "parameters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.nlpub.watset.cli.EmbeddingCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term869, args);
    }

};


