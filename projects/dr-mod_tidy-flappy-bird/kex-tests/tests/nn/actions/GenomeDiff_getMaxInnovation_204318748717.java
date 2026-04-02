package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GenomeDiff_getMaxInnovation_204318748717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public GenomeDiff_getMaxInnovation_204318748717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term916, term916.getClass(), "matchingGenes", null);
        setField(term916, term916.getClass(), "excessGenes", null);
        setField(term916, term916.getClass(), "disjointGenes", null);
        setField(term916, term916.getClass(), "mapGenome1", null);
        setField(term916, term916.getClass(), "mapGenome2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMaxInnovation", argTypes, term916, args);
    }

};


