package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoreSQLUtils_buildColumnsAs_15691785868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2182;
     Object term2255;

    public CoreSQLUtils_buildColumnsAs_15691785868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2182 = (Object[]) newArray("java.lang.String", 6);
        setElement(term2182, 0, "IDCWpPLRkE");
        setElement(term2182, 1, "nyiiPDVjAc");
        setElement(term2182, 2, "aKnKipADSo");
        setElement(term2182, 3, "wSQxaModmm");
        setElement(term2182, 4, "UlajhuVLaP");
        setElement(term2182, 5, "gGSMzuGICf");
        term2255 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2255, 0, "hxCBltsObl");
        setElement(term2255, 1, "BndsHwAFMv");
        setElement(term2255, 2, "GzFkzHGYFt");
        setElement(term2255, 3, "tShwQLRGNe");
        setElement(term2255, 4, "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2182;
        args[1] = term2255;
        callMethod(klass, "buildColumnsAs", argTypes, null, args);
    }

};


