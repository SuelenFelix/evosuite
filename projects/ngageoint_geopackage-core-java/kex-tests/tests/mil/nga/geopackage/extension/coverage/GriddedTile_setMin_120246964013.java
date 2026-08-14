package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GriddedTile_setMin_120246964013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567;
     Object term592;

    public GriddedTile_setMin_120246964013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term584 = new Double(0.7591353014991907);
        Double term586 = new Double(0.791695029600875);
        Double term588 = new Double(0.6862221294683138);
        Double term590 = new Double(0.15917839663695388);
        term567 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term567, term567.getClass(), "id", 7009926388951271268L);
        setField(term567, term567.getClass(), "contents", null);
        setField(term567, term567.getClass(), "tableName", "MxlszYVzRf");
        setLongField(term567, term567.getClass(), "tableId", -7672528020740371001L);
        setDoubleField(term567, term567.getClass(), "scale", 1.0);
        setDoubleField(term567, term567.getClass(), "offset", 0.9828442029246764);
        setField(term567, term567.getClass(), "min", term584);
        setField(term567, term567.getClass(), "max", term586);
        setField(term567, term567.getClass(), "mean", term588);
        setField(term567, term567.getClass(), "standardDeviation", term590);
        term592 = new Double(0.9374115574082594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term592;
        callMethod(klass, "setMin", argTypes, term567, args);
    }

};


