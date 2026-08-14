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

public class GeometryIndex_setMinM_143211946722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1042;
     Object term1068;

    public GeometryIndex_setMinM_143211946722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1060 = new Double(0.24259014218848696);
        Double term1062 = new Double(0.1544348383112728);
        Double term1064 = new Double(0.5187846213101265);
        Double term1066 = new Double(0.045893173090043815);
        term1042 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1042, term1042.getClass(), "tableIndex", null);
        setField(term1042, term1042.getClass(), "tableName", "dWRymuLBtr");
        setLongField(term1042, term1042.getClass(), "geomId", 5262507301787091109L);
        setDoubleField(term1042, term1042.getClass(), "minX", 0.5187846213101265);
        setDoubleField(term1042, term1042.getClass(), "maxX", 0.045893173090043815);
        setDoubleField(term1042, term1042.getClass(), "minY", 0.3626177854778667);
        setDoubleField(term1042, term1042.getClass(), "maxY", 0.3163771663728089);
        setField(term1042, term1042.getClass(), "minZ", term1060);
        setField(term1042, term1042.getClass(), "maxZ", term1062);
        setField(term1042, term1042.getClass(), "minM", term1064);
        setField(term1042, term1042.getClass(), "maxM", term1066);
        term1068 = new Double(0.3626177854778667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term1068;
        callMethod(klass, "setMinM", argTypes, term1042, args);
    }

};


