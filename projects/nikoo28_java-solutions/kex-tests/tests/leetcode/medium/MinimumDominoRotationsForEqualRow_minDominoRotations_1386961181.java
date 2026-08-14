package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MinimumDominoRotationsForEqualRow_minDominoRotations_1386961181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3624;
     Object term3625;
     Object term3631;

    public MinimumDominoRotationsForEqualRow_minDominoRotations_1386961181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3624 = newInstance(Class.forName("leetcode.medium.MinimumDominoRotationsForEqualRow"));
        term3625 = (int[]) newIntArray(5);
        setIntElement(term3625, 0, -1619435313);
        setIntElement(term3625, 1, 1013801066);
        setIntElement(term3625, 2, 1512541853);
        setIntElement(term3625, 3, -965421502);
        setIntElement(term3625, 4, 1319026002);
        term3631 = (int[]) newIntArray(4);
        setIntElement(term3631, 0, -1368173231);
        setIntElement(term3631, 1, 1956006038);
        setIntElement(term3631, 2, -1062304878);
        setIntElement(term3631, 3, -1377876610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinimumDominoRotationsForEqualRow");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3625;
        args[1] = term3631;
        callMethod(klass, "minDominoRotations", argTypes, term3624, args);
    }

};


