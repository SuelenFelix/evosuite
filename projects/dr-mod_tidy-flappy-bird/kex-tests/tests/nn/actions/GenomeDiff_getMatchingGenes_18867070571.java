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

public class GenomeDiff_getMatchingGenes_18867070571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public GenomeDiff_getMatchingGenes_18867070571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term276 = new HashMap();
        Set<Object> term351 =  ((Map) term276).keySet();
        HashSet term275 = new HashSet((Collection<? extends Object>) term351);
        HashMap term291 = new HashMap();
        Set<Object> term352 =  ((Map) term291).keySet();
        HashSet term290 = new HashSet((Collection<? extends Object>) term352);
        HashMap term318 = new HashMap();
        Set<Object> term353 =  ((Map) term318).keySet();
        HashSet term317 = new HashSet((Collection<? extends Object>) term353);
        HashMap term323 = new HashMap();
        HashMap term337 = new HashMap();
        term274 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term274, term274.getClass(), "matchingGenes", term275);
        setField(term274, term274.getClass(), "excessGenes", term290);
        setField(term274, term274.getClass(), "disjointGenes", term317);
        setField(term274, term274.getClass(), "mapGenome1", term323);
        setField(term274, term274.getClass(), "mapGenome2", term337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchingGenes", argTypes, term274, args);
    }

};


