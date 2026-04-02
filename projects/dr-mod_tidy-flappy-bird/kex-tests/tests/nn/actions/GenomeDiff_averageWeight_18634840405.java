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

public class GenomeDiff_averageWeight_18634840405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;

    public GenomeDiff_averageWeight_18634840405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term642 = new HashMap();
        Set<Object> term750 =  ((Map) term642).keySet();
        HashSet term641 = new HashSet((Collection<? extends Object>) term750);
        HashMap term665 = new HashMap();
        Set<Object> term751 =  ((Map) term665).keySet();
        HashSet term664 = new HashSet((Collection<? extends Object>) term751);
        HashMap term696 = new HashMap();
        Set<Object> term752 =  ((Map) term696).keySet();
        HashSet term695 = new HashSet((Collection<? extends Object>) term752);
        HashMap term722 = new HashMap();
        HashMap term736 = new HashMap();
        term640 = newInstance(Class.forName("nn.actions.GenomeDiff"));
        setField(term640, term640.getClass(), "matchingGenes", term641);
        setField(term640, term640.getClass(), "excessGenes", term664);
        setField(term640, term640.getClass(), "disjointGenes", term695);
        setField(term640, term640.getClass(), "mapGenome1", term722);
        setField(term640, term640.getClass(), "mapGenome2", term736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.GenomeDiff");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "averageWeight", argTypes, term640, args);
    }

};


