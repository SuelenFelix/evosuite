package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Product_decrementCounter_10187499491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45869;

    public Product_decrementCounter_10187499491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45870 = new Long(6417149748828373606L);
        term45869 = newInstance(Class.forName("legacyfighter.dietary.Product"));
        Object term45872 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term45873 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term45875 = (int[]) newIntArray(6);
        setField(term45869, term45869.getClass(), "id", term45870);
        setIntField(term45873, term45873.getClass(), "signum", 1);
        setIntElement(term45875, 0, 40580);
        setIntElement(term45875, 1, 516588869);
        setIntElement(term45875, 2, -1823680487);
        setIntElement(term45875, 3, -163046367);
        setIntElement(term45875, 4, 802717478);
        setIntElement(term45875, 5, -762177091);
        setField(term45873, term45873.getClass(), "mag", term45875);
        setIntField(term45873, term45873.getClass(), "bitCountPlusOne", 0);
        setIntField(term45873, term45873.getClass(), "bitLengthPlusOne", 0);
        setIntField(term45873, term45873.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term45873, term45873.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term45872, term45872.getClass(), "intVal", term45873);
        setIntField(term45872, term45872.getClass(), "scale", 53);
        setIntField(term45872, term45872.getClass(), "precision", 0);
        setField(term45872, term45872.getClass(), "stringCache", null);
        setLongField(term45872, term45872.getClass(), "intCompact", -9223372036854775808L);
        setField(term45869, term45869.getClass(), "price", term45872);
        setField(term45869, term45869.getClass(), "product", "uDAdogNiBQ");
        setIntField(term45869, term45869.getClass(), "counter", -808971480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decrementCounter", argTypes, term45869, args);
    }

};


