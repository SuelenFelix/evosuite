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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GenomeDiff_getExcessGenes_11282423272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;

    public GenomeDiff_getExcessGenes_11282423272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term356 = new HashMap();
        Set<Object> term472 =  ((Map) term356).keySet();
        HashSet term355 = new HashSet((Collection<? extends Object>) term472);
        HashMap term387 = new HashMap();
        Set<Object> term473 =  ((Map) term387).keySet();
        HashSet term386 = new HashSet((Collection<? extends Object>) term473);
        HashMap term414 = new HashMap();
        Set<Object> term474 =  ((Map) term414).keySet();
        HashSet term413 = new HashSet((Collection<? extends Object>) term474);
        HashMap term444 = new HashMap();
        HashMap term458 = new HashMap();
        term354 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term354, term354.getClass(), "matchingGenes", term355);
        setField(term354, term354.getClass(), "excessGenes", term386);
        setField(term354, term354.getClass(), "disjointGenes", term413);
        setField(term354, term354.getClass(), "mapGenome1", term444);
        setField(term354, term354.getClass(), "mapGenome2", term458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcessGenes", argTypes, term354, args);
    }

};


