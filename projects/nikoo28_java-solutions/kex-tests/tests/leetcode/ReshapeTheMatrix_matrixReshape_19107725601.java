package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ReshapeTheMatrix_matrixReshape_19107725601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6534;
     Object term6535;
     Object term6555;
     Object term6557;

    public ReshapeTheMatrix_matrixReshape_19107725601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6534 = newInstance(Class.forName("leetcode.ReshapeTheMatrix"));
        term6535 = (Object[]) newArray("[I", 2);
        int[] term6536 = (int[]) newIntArray(9);
        int[] term6546 = (int[]) newIntArray(8);
        setIntElement(term6536, 0, 1505375686);
        setIntElement(term6536, 1, -132005524);
        setIntElement(term6536, 2, -1235127374);
        setIntElement(term6536, 3, -2077814162);
        setIntElement(term6536, 4, 444514470);
        setIntElement(term6536, 5, -147055177);
        setIntElement(term6536, 6, 1979044375);
        setIntElement(term6536, 7, 961252909);
        setIntElement(term6536, 8, 1455842357);
        setElement(term6535, 0, term6536);
        setIntElement(term6546, 0, 1349806561);
        setIntElement(term6546, 1, 923905351);
        setIntElement(term6546, 2, 428360161);
        setIntElement(term6546, 3, 631528579);
        setIntElement(term6546, 4, -1652091834);
        setIntElement(term6546, 5, -282021579);
        setIntElement(term6546, 6, -1652588127);
        setIntElement(term6546, 7, -1902823385);
        setElement(term6535, 1, term6546);
        term6555 = new Integer(-784924879);
        term6557 = new Integer(-1062027102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ReshapeTheMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6535;
        args[1] = term6555;
        args[2] = term6557;
        callMethod(klass, "matrixReshape", argTypes, term6534, args);
    }

};


