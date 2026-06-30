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

public class GenomeDiff_averageWeight_186348404014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;

    public GenomeDiff_averageWeight_186348404014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term913 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term913, term913.getClass(), "matchingGenes", null);
        setField(term913, term913.getClass(), "excessGenes", null);
        setField(term913, term913.getClass(), "disjointGenes", null);
        setField(term913, term913.getClass(), "mapGenome1", null);
        setField(term913, term913.getClass(), "mapGenome2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "averageWeight", argTypes, term913, args);
    }

};


