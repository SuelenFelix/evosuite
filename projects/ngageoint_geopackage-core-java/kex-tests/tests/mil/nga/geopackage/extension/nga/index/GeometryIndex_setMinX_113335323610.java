package mil.nga.geopackage.extension.nga.index;

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
import static mil.nga.geopackage.extension.nga.index.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GeometryIndex_setMinX_113335323610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;
     Object term624;

    public GeometryIndex_setMinX_113335323610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term616 = new Double(0.3587267442738795);
        Double term618 = new Double(0.07802449704920456);
        Double term620 = new Double(0.5279279537140873);
        Double term622 = new Double(0.3202192021706908);
        term598 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term598, term598.getClass(), "tableIndex", null);
        setField(term598, term598.getClass(), "tableName", "pCTimMblYc");
        setLongField(term598, term598.getClass(), "geomId", 8428634514691209827L);
        setDoubleField(term598, term598.getClass(), "minX", 0.3587267442738795);
        setDoubleField(term598, term598.getClass(), "maxX", 0.07802449704920456);
        setDoubleField(term598, term598.getClass(), "minY", 0.5279279537140873);
        setDoubleField(term598, term598.getClass(), "maxY", 0.3202192021706908);
        setField(term598, term598.getClass(), "minZ", term616);
        setField(term598, term598.getClass(), "maxZ", term618);
        setField(term598, term598.getClass(), "minM", term620);
        setField(term598, term598.getClass(), "maxM", term622);
        term624 = new Double(0.22651340641904605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term624;
        callMethod(klass, "setMinX", argTypes, term598, args);
    }

};


