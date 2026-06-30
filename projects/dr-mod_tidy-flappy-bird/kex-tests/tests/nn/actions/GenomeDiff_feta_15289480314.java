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

public class GenomeDiff_feta_15289480314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;

    public GenomeDiff_feta_15289480314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term561 = new HashMap();
        Set<Object> term637 =  ((Map) term561).keySet();
        HashSet term560 = new HashSet((Collection<? extends Object>) term637);
        HashMap term572 = new HashMap();
        Set<Object> term638 =  ((Map) term572).keySet();
        HashSet term571 = new HashSet((Collection<? extends Object>) term638);
        HashMap term583 = new HashMap();
        Set<Object> term639 =  ((Map) term583).keySet();
        HashSet term582 = new HashSet((Collection<? extends Object>) term639);
        HashMap term609 = new HashMap();
        HashMap term623 = new HashMap();
        term559 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term559, term559.getClass(), "matchingGenes", term560);
        setField(term559, term559.getClass(), "excessGenes", term571);
        setField(term559, term559.getClass(), "disjointGenes", term582);
        setField(term559, term559.getClass(), "mapGenome1", term609);
        setField(term559, term559.getClass(), "mapGenome2", term623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "feta", argTypes, term559, args);
    }

};


