package legacyfighter.dietary.newproducts;

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
import static legacyfighter.dietary.newproducts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OldProduct_getCounter_989495647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810;

    public OldProduct_getCounter_989495647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term811 = newInstance(Class.forName("java.util.UUID"));
        Object term814 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term815 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term816 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term818 = (int[]) newIntArray(6);
        Object term832 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term857 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term811, term811.getClass(), "mostSigBits", -4325723315152823407L);
        setLongField(term811, term811.getClass(), "leastSigBits", 2535595959091595249L);
        setField(term810, term810.getClass(), "serialNumber", term811);
        setIntField(term816, term816.getClass(), "signum", 1);
        setIntElement(term818, 0, 523);
        setIntElement(term818, 1, -954467915);
        setIntElement(term818, 2, 1892307494);
        setIntElement(term818, 3, -1066736592);
        setIntElement(term818, 4, 433326655);
        setIntElement(term818, 5, -242716133);
        setField(term816, term816.getClass(), "mag", term818);
        setIntField(term816, term816.getClass(), "bitCountPlusOne", 0);
        setIntField(term816, term816.getClass(), "bitLengthPlusOne", 0);
        setIntField(term816, term816.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term816, term816.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term815, term815.getClass(), "intVal", term816);
        setIntField(term815, term815.getClass(), "scale", 51);
        setIntField(term815, term815.getClass(), "precision", 0);
        setField(term815, term815.getClass(), "stringCache", null);
        setLongField(term815, term815.getClass(), "intCompact", -9223372036854775808L);
        setField(term814, term814.getClass(), "price", term815);
        setField(term810, term810.getClass(), "price", term814);
        setField(term832, term832.getClass(), "desc", "hNxWaHcfhY");
        setField(term832, term832.getClass(), "longDesc", "RkybSrpybU");
        setField(term810, term810.getClass(), "desc", term832);
        setIntField(term857, term857.getClass(), "counter", -522618178);
        setField(term810, term810.getClass(), "counter", term857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounter", argTypes, term810, args);
    }

};


