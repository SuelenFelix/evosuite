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

public class DGIWGValidationErrors_init_454552441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15450;

    public DGIWGValidationErrors_init_454552441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15633 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term15632 = ((Class) term15633).getDeclaredField((String) "METADATA_ROW");
        ((Field) term15632).setAccessible(true);
        Object enum38 = ((Field) term15632).get((Object) null);
        Object term15566 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15566, term15566.getClass(), "column", "");
        setField(term15566, term15566.getClass(), "value", "");
        Object term15569 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15569, term15569.getClass(), "column", "");
        setField(term15569, term15569.getClass(), "value", "");
        Object term15572 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15572, term15572.getClass(), "column", "");
        setField(term15572, term15572.getClass(), "value", "");
        Object term15575 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15575, term15575.getClass(), "column", "");
        setField(term15575, term15575.getClass(), "value", "");
        Object term15578 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15578, term15578.getClass(), "column", "");
        setField(term15578, term15578.getClass(), "value", "");
        Object term15581 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15581, term15581.getClass(), "column", "");
        setField(term15581, term15581.getClass(), "value", "");
        Object term15584 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15584, term15584.getClass(), "column", "");
        setField(term15584, term15584.getClass(), "value", "");
        Object term15587 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term15587, term15587.getClass(), "column", "");
        setField(term15587, term15587.getClass(), "value", "");
        ArrayList term15564 = new ArrayList();
        ((ArrayList) term15564).add(term15566);
        ((ArrayList) term15564).add(term15569);
        ((ArrayList) term15564).add(term15572);
        ((ArrayList) term15564).add(term15575);
        ((ArrayList) term15564).add(term15578);
        ((ArrayList) term15564).add(term15581);
        ((ArrayList) term15564).add(term15584);
        ((ArrayList) term15564).add(term15587);
        term15450 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term15450, term15450.getClass(), "table", "DSNsTGYXDF");
        setField(term15450, term15450.getClass(), "column", "sQvGcVjdEx");
        setField(term15450, term15450.getClass(), "value", "rLHAoqXgPh");
        setField(term15450, term15450.getClass(), "constraint", "zUlRdimJtU");
        setField(term15450, term15450.getClass(), "requirement", enum38);
        setField(term15450, term15450.getClass(), "primaryKeys", term15564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationErrors");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Object[] args = new Object[1];
        args[0] = term15450;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


