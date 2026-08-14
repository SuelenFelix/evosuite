package tudelft.smells.sensitiveequality;

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
import static tudelft.smells.sensitiveequality.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Cart_add_2564930511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;
     Object term300;

    public Cart_add_2564930511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term296 = new ArrayList();
        term295 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Cart"));
        setField(term295, term295.getClass(), "items", term296);
        term300 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        Object term314 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term315 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term317 = (int[]) newIntArray(6);
        setField(term300, term300.getClass(), "name", "SzjVpOQTyS");
        setIntField(term300, term300.getClass(), "qty", -1955890973);
        setIntField(term315, term315.getClass(), "signum", 1);
        setIntElement(term317, 0, 1807);
        setIntElement(term317, 1, 1210968587);
        setIntElement(term317, 2, -857410878);
        setIntElement(term317, 3, 520383771);
        setIntElement(term317, 4, 2106706510);
        setIntElement(term317, 5, 1731185477);
        setField(term315, term315.getClass(), "mag", term317);
        setIntField(term315, term315.getClass(), "bitCountPlusOne", 0);
        setIntField(term315, term315.getClass(), "bitLengthPlusOne", 0);
        setIntField(term315, term315.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term315, term315.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term314, term314.getClass(), "intVal", term315);
        setIntField(term314, term314.getClass(), "scale", 52);
        setIntField(term314, term314.getClass(), "precision", 0);
        setField(term314, term314.getClass(), "stringCache", null);
        setLongField(term314, term314.getClass(), "intCompact", -9223372036854775808L);
        setField(term300, term300.getClass(), "individualPrice", term314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Cart");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tudelft.smells.sensitiveequality.Item");
        Object[] args = new Object[1];
        args[0] = term300;
        callMethod(klass, "add", argTypes, term295, args);
    }

};


