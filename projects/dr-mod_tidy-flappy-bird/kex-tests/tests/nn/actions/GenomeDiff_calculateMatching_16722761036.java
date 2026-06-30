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
import java.util.LinkedHashMap;

public class GenomeDiff_calculateMatching_16722761036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753;
     Object term831;
     Object term862;

    public GenomeDiff_calculateMatching_16722761036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term755 = new HashMap();
        Set<Object> term889 =  ((Map) term755).keySet();
        HashSet term754 = new HashSet((Collection<? extends Object>) term889);
        HashMap term770 = new HashMap();
        Set<Object> term890 =  ((Map) term770).keySet();
        HashSet term769 = new HashSet((Collection<? extends Object>) term890);
        HashMap term781 = new HashMap();
        Set<Object> term891 =  ((Map) term781).keySet();
        HashSet term780 = new HashSet((Collection<? extends Object>) term891);
        HashMap term803 = new HashMap();
        HashMap term817 = new HashMap();
        term753 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term753, term753.getClass(), "matchingGenes", term754);
        setField(term753, term753.getClass(), "excessGenes", term769);
        setField(term753, term753.getClass(), "disjointGenes", term780);
        setField(term753, term753.getClass(), "mapGenome1", term803);
        setField(term753, term753.getClass(), "mapGenome2", term817);
        term831 = new LinkedHashMap();
        term862 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term831;
        args[1] = term862;
        callMethod(klass, "calculateMatching", argTypes, term753, args);
    }

};


