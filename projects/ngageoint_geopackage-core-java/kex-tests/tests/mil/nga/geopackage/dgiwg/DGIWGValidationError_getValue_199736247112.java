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

public class DGIWGValidationError_getValue_199736247112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12160;

    public DGIWGValidationError_getValue_199736247112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12343 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term12342 = ((Class) term12343).getDeclaredField((String) "GEOPACKAGE_OPTIONS");
        ((Field) term12342).setAccessible(true);
        Object enum31 = ((Field) term12342).get((Object) null);
        Object term12285 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12285, term12285.getClass(), "column", "");
        setField(term12285, term12285.getClass(), "value", "");
        Object term12288 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12288, term12288.getClass(), "column", "");
        setField(term12288, term12288.getClass(), "value", "");
        Object term12291 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12291, term12291.getClass(), "column", "");
        setField(term12291, term12291.getClass(), "value", "");
        Object term12294 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12294, term12294.getClass(), "column", "");
        setField(term12294, term12294.getClass(), "value", "");
        Object term12297 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12297, term12297.getClass(), "column", "");
        setField(term12297, term12297.getClass(), "value", "");
        ArrayList term12283 = new ArrayList();
        ((ArrayList) term12283).add(term12285);
        ((ArrayList) term12283).add(term12288);
        ((ArrayList) term12283).add(term12291);
        ((ArrayList) term12283).add(term12294);
        ((ArrayList) term12283).add(term12297);
        term12160 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term12160, term12160.getClass(), "table", "GVizqqzXpy");
        setField(term12160, term12160.getClass(), "column", "JqXGgAhZPl");
        setField(term12160, term12160.getClass(), "value", "jiKYgYHqIS");
        setField(term12160, term12160.getClass(), "constraint", "DfISiziTgG");
        setField(term12160, term12160.getClass(), "requirement", enum31);
        setField(term12160, term12160.getClass(), "primaryKeys", term12283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term12160, args);
    }

};


