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

public class DGIWGValidationError_toString_149088735016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13851;

    public DGIWGValidationError_toString_149088735016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14016 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term14015 = ((Class) term14016).getDeclaredField((String) "METADATA_PRODUCT");
        ((Field) term14015).setAccessible(true);
        Object enum35 = ((Field) term14015).get((Object) null);
        Object term13970 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term13970, term13970.getClass(), "column", "");
        setField(term13970, term13970.getClass(), "value", "");
        ArrayList term13968 = new ArrayList();
        ((ArrayList) term13968).add(term13970);
        term13851 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term13851, term13851.getClass(), "table", "PznxWXsZME");
        setField(term13851, term13851.getClass(), "column", "ZzIujlwVsw");
        setField(term13851, term13851.getClass(), "value", "LWyEaeIyAo");
        setField(term13851, term13851.getClass(), "constraint", "yVMkkQhvmN");
        setField(term13851, term13851.getClass(), "requirement", enum35);
        setField(term13851, term13851.getClass(), "primaryKeys", term13968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13851, args);
    }

};


