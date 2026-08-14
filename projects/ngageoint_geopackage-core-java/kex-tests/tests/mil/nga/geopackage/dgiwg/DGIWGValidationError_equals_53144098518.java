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

public class DGIWGValidationError_equals_53144098518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14721;
     Object term14843;

    public DGIWGValidationError_equals_53144098518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14885 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term14884 = ((Class) term14885).getDeclaredField((String) "METADATA_FEATURE");
        ((Field) term14884).setAccessible(true);
        Object enum37 = ((Field) term14884).get((Object) null);
        Object term14835 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term14835, term14835.getClass(), "column", "");
        setField(term14835, term14835.getClass(), "value", "");
        Object term14838 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term14838, term14838.getClass(), "column", "");
        setField(term14838, term14838.getClass(), "value", "");
        ArrayList term14833 = new ArrayList();
        ((ArrayList) term14833).add(term14835);
        ((ArrayList) term14833).add(term14838);
        term14721 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term14721, term14721.getClass(), "table", "WHcwFgsGFC");
        setField(term14721, term14721.getClass(), "column", "HzqpegHiRq");
        setField(term14721, term14721.getClass(), "value", "jwsfVjMoJT");
        setField(term14721, term14721.getClass(), "constraint", "ZfdXfCCFDf");
        setField(term14721, term14721.getClass(), "requirement", enum37);
        setField(term14721, term14721.getClass(), "primaryKeys", term14833);
        term14843 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14843;
        callMethod(klass, "equals", argTypes, term14721, args);
    }

};


