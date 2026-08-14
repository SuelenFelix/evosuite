package mil.nga.geopackage.extension.schema.constraints;

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
import static mil.nga.geopackage.extension.schema.constraints.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class DataColumnConstraints_init_10912729911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2008;

    public DataColumnConstraints_init_10912729911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2062 = new Boolean(false);
        Boolean term2081 = new Boolean(false);
        term2008 = newInstance(Class.forName("mil.nga.geopackage.extension.schema.constraints.DataColumnConstraints"));
        Object term2045 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2046 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2048 = (int[]) newIntArray(6);
        Object term2064 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2065 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2067 = (int[]) newIntArray(6);
        setField(term2008, term2008.getClass(), "constraintName", "MuLcgQHgqz");
        setField(term2008, term2008.getClass(), "constraintType", "xxtlPwDYFs");
        setField(term2008, term2008.getClass(), "value", "jJCZpVmanW");
        setIntField(term2046, term2046.getClass(), "signum", 1);
        setIntElement(term2048, 0, 9058);
        setIntElement(term2048, 1, 1365043541);
        setIntElement(term2048, 2, 1239861896);
        setIntElement(term2048, 3, -1338148297);
        setIntElement(term2048, 4, -418263970);
        setIntElement(term2048, 5, -265097411);
        setField(term2046, term2046.getClass(), "mag", term2048);
        setIntField(term2046, term2046.getClass(), "bitCountPlusOne", 0);
        setIntField(term2046, term2046.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2046, term2046.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2046, term2046.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2045, term2045.getClass(), "intVal", term2046);
        setIntField(term2045, term2045.getClass(), "scale", 53);
        setIntField(term2045, term2045.getClass(), "precision", 0);
        setField(term2045, term2045.getClass(), "stringCache", null);
        setLongField(term2045, term2045.getClass(), "intCompact", -9223372036854775808L);
        setField(term2008, term2008.getClass(), "min", term2045);
        setField(term2008, term2008.getClass(), "minIsInclusive", term2062);
        setIntField(term2065, term2065.getClass(), "signum", 1);
        setIntElement(term2067, 0, 2364);
        setIntElement(term2067, 1, -1446584625);
        setIntElement(term2067, 2, 1957600567);
        setIntElement(term2067, 3, -336418707);
        setIntElement(term2067, 4, -1905211145);
        setIntElement(term2067, 5, 86968353);
        setField(term2065, term2065.getClass(), "mag", term2067);
        setIntField(term2065, term2065.getClass(), "bitCountPlusOne", 0);
        setIntField(term2065, term2065.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2065, term2065.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2065, term2065.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2064, term2064.getClass(), "intVal", term2065);
        setIntField(term2064, term2064.getClass(), "scale", 52);
        setIntField(term2064, term2064.getClass(), "precision", 0);
        setField(term2064, term2064.getClass(), "stringCache", null);
        setLongField(term2064, term2064.getClass(), "intCompact", -9223372036854775808L);
        setField(term2008, term2008.getClass(), "max", term2064);
        setField(term2008, term2008.getClass(), "maxIsInclusive", term2081);
        setField(term2008, term2008.getClass(), "description", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.schema.constraints.DataColumnConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.schema.constraints.DataColumnConstraints");
        Object[] args = new Object[1];
        args[0] = term2008;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


