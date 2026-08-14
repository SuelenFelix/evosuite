package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DGIWGValidationError_init_382573888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum27;
     Object term9978;

    public DGIWGValidationError_init_382573888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10160 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term10159 = ((Class) term10160).getDeclaredField((String) "VALIDITY_DATA_VALIDITY");
        ((Field) term10159).setAccessible(true);
        enum27 = ((Field) term10159).get((Object) null);
        term9978 = (Object[]) newArray("mil.nga.geopackage.dgiwg.DGIWGValidationKey", 6);
        Object term9979 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10004 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10029 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10054 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10079 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term10104 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term9979, term9979.getClass(), "column", "gGSMzuGICf");
        setField(term9979, term9979.getClass(), "value", "hxCBltsObl");
        setElement(term9978, 0, term9979);
        setField(term10004, term10004.getClass(), "column", "BndsHwAFMv");
        setField(term10004, term10004.getClass(), "value", "GzFkzHGYFt");
        setElement(term9978, 1, term10004);
        setField(term10029, term10029.getClass(), "column", "tShwQLRGNe");
        setField(term10029, term10029.getClass(), "value", "LvtrsXUliU");
        setElement(term9978, 2, term10029);
        setField(term10054, term10054.getClass(), "column", "xLbjWUgOIL");
        setField(term10054, term10054.getClass(), "value", "jDtqGUpnZN");
        setElement(term9978, 3, term10054);
        setField(term10079, term10079.getClass(), "column", "nGKItKLYNC");
        setField(term10079, term10079.getClass(), "value", "UiUYnPrcCi");
        setElement(term9978, 4, term10079);
        setField(term10104, term10104.getClass(), "column", "UoYtihxVaS");
        setField(term10104, term10104.getClass(), "value", "JDswTTCZHV");
        setElement(term9978, 5, term10104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Number");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        argTypes[5] = Array.newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = "aKnKipADSo";
        args[1] = "wSQxaModmm";
        args[2] = null;
        args[3] = "UlajhuVLaP";
        args[4] = enum27;
        args[5] = term9978;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


