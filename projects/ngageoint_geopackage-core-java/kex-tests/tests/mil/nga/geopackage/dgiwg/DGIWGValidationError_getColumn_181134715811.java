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
import java.util.ArrayList;

public class DGIWGValidationError_getColumn_181134715811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11714;

    public DGIWGValidationError_getColumn_181134715811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11892 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term11891 = ((Class) term11892).getDeclaredField((String) "EXTENSIONS_OPTIONAL");
        ((Field) term11891).setAccessible(true);
        Object enum30 = ((Field) term11891).get((Object) null);
        Object term11831 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11831, term11831.getClass(), "column", "");
        setField(term11831, term11831.getClass(), "value", "");
        Object term11834 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11834, term11834.getClass(), "column", "");
        setField(term11834, term11834.getClass(), "value", "");
        Object term11837 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11837, term11837.getClass(), "column", "");
        setField(term11837, term11837.getClass(), "value", "");
        Object term11840 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11840, term11840.getClass(), "column", "");
        setField(term11840, term11840.getClass(), "value", "");
        Object term11843 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11843, term11843.getClass(), "column", "");
        setField(term11843, term11843.getClass(), "value", "");
        Object term11846 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term11846, term11846.getClass(), "column", "");
        setField(term11846, term11846.getClass(), "value", "");
        ArrayList term11829 = new ArrayList();
        ((ArrayList) term11829).add(term11831);
        ((ArrayList) term11829).add(term11834);
        ((ArrayList) term11829).add(term11837);
        ((ArrayList) term11829).add(term11840);
        ((ArrayList) term11829).add(term11843);
        ((ArrayList) term11829).add(term11846);
        term11714 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term11714, term11714.getClass(), "table", "oVgzLbrsFr");
        setField(term11714, term11714.getClass(), "column", "vQVyKLdtaz");
        setField(term11714, term11714.getClass(), "value", "OWKQODBLzb");
        setField(term11714, term11714.getClass(), "constraint", "wGmYcqUkgE");
        setField(term11714, term11714.getClass(), "requirement", enum30);
        setField(term11714, term11714.getClass(), "primaryKeys", term11829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumn", argTypes, term11714, args);
    }

};


