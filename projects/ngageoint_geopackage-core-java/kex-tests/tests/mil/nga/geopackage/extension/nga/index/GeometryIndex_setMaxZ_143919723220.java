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

public class GeometryIndex_setMaxZ_143919723220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term968;
     Object term994;

    public GeometryIndex_setMaxZ_143919723220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term986 = new Double(0.48862955528902696);
        Double term988 = new Double(0.426231085465289);
        Double term990 = new Double(0.0027299293098262956);
        Double term992 = new Double(0.29874017652881824);
        term968 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term968, term968.getClass(), "tableIndex", null);
        setField(term968, term968.getClass(), "tableName", "TEParAifyi");
        setLongField(term968, term968.getClass(), "geomId", 6855071767938501807L);
        setDoubleField(term968, term968.getClass(), "minX", 0.29874017652881824);
        setDoubleField(term968, term968.getClass(), "maxX", 0.32554480512985284);
        setDoubleField(term968, term968.getClass(), "minY", 0.8924855581421237);
        setDoubleField(term968, term968.getClass(), "maxY", 0.32237559209193944);
        setField(term968, term968.getClass(), "minZ", term986);
        setField(term968, term968.getClass(), "maxZ", term988);
        setField(term968, term968.getClass(), "minM", term990);
        setField(term968, term968.getClass(), "maxM", term992);
        term994 = new Double(0.32554480512985284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term994;
        callMethod(klass, "setMaxZ", argTypes, term968, args);
    }

};


