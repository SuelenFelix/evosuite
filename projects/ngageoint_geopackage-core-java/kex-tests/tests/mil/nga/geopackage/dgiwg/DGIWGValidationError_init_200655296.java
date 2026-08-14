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

public class DGIWGValidationError_init_200655296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum25;
     Object term8779;

    public DGIWGValidationError_init_200655296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8961 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term8960 = ((Class) term8961).getDeclaredField((String) "GEOPACKAGE_OPTIONS");
        ((Field) term8960).setAccessible(true);
        enum25 = ((Field) term8960).get((Object) null);
        term8779 = (Object[]) newArray("mil.nga.geopackage.dgiwg.DGIWGValidationKey", 6);
        Object term8780 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term8805 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term8830 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term8855 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term8880 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term8905 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term8780, term8780.getClass(), "column", "pCTimMblYc");
        setField(term8780, term8780.getClass(), "value", "hNxWaHcfhY");
        setElement(term8779, 0, term8780);
        setField(term8805, term8805.getClass(), "column", "RkybSrpybU");
        setField(term8805, term8805.getClass(), "value", "xOEqzGAmDU");
        setElement(term8779, 1, term8805);
        setField(term8830, term8830.getClass(), "column", "eZFUvlxvGV");
        setField(term8830, term8830.getClass(), "value", "BYqFIqCKAV");
        setElement(term8779, 2, term8830);
        setField(term8855, term8855.getClass(), "column", "vrQLuWIDJX");
        setField(term8855, term8855.getClass(), "value", "flxyYxBRtu");
        setElement(term8779, 3, term8855);
        setField(term8880, term8880.getClass(), "column", "OclPbYPkcH");
        setField(term8880, term8880.getClass(), "value", "IoAlmYsBwc");
        setElement(term8779, 4, term8880);
        setField(term8905, term8905.getClass(), "column", "TEParAifyi");
        setField(term8905, term8905.getClass(), "value", "OWDIEULEFu");
        setElement(term8779, 5, term8905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        argTypes[4] = Array.newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"), 0).getClass();
        Object[] args = new Object[5];
        args[0] = "ZiaGIbnzTs";
        args[1] = "tbcdzjIfER";
        args[2] = "HyxfbSQYBe";
        args[3] = enum25;
        args[4] = term8779;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


