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

public class CoreSQLUtils_quoteWrap_2237294802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1916;

    public CoreSQLUtils_quoteWrap_2237294802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1916 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1916, 0, "vrQLuWIDJX");
        setElement(term1916, 1, "flxyYxBRtu");
        setElement(term1916, 2, "OclPbYPkcH");
        setElement(term1916, 3, "IoAlmYsBwc");
        setElement(term1916, 4, "TEParAifyi");
        setElement(term1916, 5, "OWDIEULEFu");
        setElement(term1916, 6, "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1916;
        callMethod(klass, "quoteWrap", argTypes, null, args);
    }

};


