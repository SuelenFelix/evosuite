package codility.ambitious;

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
import static codility.ambitious.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class IdenticalPairOfIndices_1_apply_12833874971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term16;
     Object term18;

    public IdenticalPairOfIndices_1_apply_12833874971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("codility.ambitious.IdenticalPairOfIndices$1"));
        setField(term15, term15.getClass(), "this$0", null);
        term16 = new Long(2442117782898005296L);
        term18 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codility.ambitious.IdenticalPairOfIndices$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        Object[] args = new Object[2];
        args[0] = term16;
        args[1] = term18;
        callMethod(klass, "apply", argTypes, term15, args);
    }

};


