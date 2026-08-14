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

public class DGIWGValidationError_init_12191585647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum26;
     Object term9468;

    public DGIWGValidationError_init_12191585647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9560 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term9559 = ((Class) term9560).getDeclaredField((String) "GEOPACKAGE_OPTIONS");
        ((Field) term9559).setAccessible(true);
        enum26 = ((Field) term9559).get((Object) null);
        term9468 = (Object[]) newArray("mil.nga.geopackage.dgiwg.DGIWGValidationKey", 2);
        Object term9469 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        Object term9494 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term9469, term9469.getClass(), "column", "Ghbwtircqb");
        setField(term9469, term9469.getClass(), "value", "xrwlQZdwCp");
        setElement(term9468, 0, term9469);
        setField(term9494, term9494.getClass(), "column", "IDCWpPLRkE");
        setField(term9494, term9494.getClass(), "value", "nyiiPDVjAc");
        setElement(term9468, 1, term9494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGRequirement");
        argTypes[5] = Array.newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = "dWRymuLBtr";
        args[1] = "AijpHYOFuy";
        args[2] = "SbAoxhfrkn";
        args[3] = "kuTXqwMtDB";
        args[4] = enum26;
        args[5] = term9468;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


