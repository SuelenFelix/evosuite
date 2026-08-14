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

public class GeometryIndex_getMaxX_183367347011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636;

    public GeometryIndex_getMaxX_183367347011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term654 = new Double(0.22651340641904605);
        Double term656 = new Double(0.8878841294187743);
        Double term658 = new Double(0.6588948704887806);
        Double term660 = new Double(0.6397214730945112);
        term636 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term636, term636.getClass(), "tableIndex", null);
        setField(term636, term636.getClass(), "tableName", "hNxWaHcfhY");
        setLongField(term636, term636.getClass(), "geomId", -2585684163342970173L);
        setDoubleField(term636, term636.getClass(), "minX", 0.8878841294187743);
        setDoubleField(term636, term636.getClass(), "maxX", 0.6588948704887806);
        setDoubleField(term636, term636.getClass(), "minY", 0.6397214730945112);
        setDoubleField(term636, term636.getClass(), "maxY", 0.25937345430928016);
        setField(term636, term636.getClass(), "minZ", term654);
        setField(term636, term636.getClass(), "maxZ", term656);
        setField(term636, term636.getClass(), "minM", term658);
        setField(term636, term636.getClass(), "maxM", term660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxX", argTypes, term636, args);
    }

};


