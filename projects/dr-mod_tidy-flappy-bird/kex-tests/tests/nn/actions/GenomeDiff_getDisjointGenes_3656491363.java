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

public class GenomeDiff_getDisjointGenes_3656491363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;

    public GenomeDiff_getDisjointGenes_3656491363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term477 = new HashMap();
        Set<Object> term556 =  ((Map) term477).keySet();
        HashSet term476 = new HashSet((Collection<? extends Object>) term556);
        HashMap term483 = new HashMap();
        Set<Object> term557 =  ((Map) term483).keySet();
        HashSet term482 = new HashSet((Collection<? extends Object>) term557);
        HashMap term510 = new HashMap();
        Set<Object> term558 =  ((Map) term510).keySet();
        HashSet term509 = new HashSet((Collection<? extends Object>) term558);
        HashMap term528 = new HashMap();
        HashMap term542 = new HashMap();
        term475 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term475, term475.getClass(), "matchingGenes", term476);
        setField(term475, term475.getClass(), "excessGenes", term482);
        setField(term475, term475.getClass(), "disjointGenes", term509);
        setField(term475, term475.getClass(), "mapGenome1", term528);
        setField(term475, term475.getClass(), "mapGenome2", term542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDisjointGenes", argTypes, term475, args);
    }

};


