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

public class GeometryIndex_getId_19620826892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;

    public GeometryIndex_getId_19620826892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term302 = new Double(0.28570734989730284);
        Double term304 = new Double(0.40176586625454525);
        Double term306 = new Double(0.2641345529914265);
        Double term308 = new Double(0.36923381893433327);
        term284 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term284, term284.getClass(), "tableIndex", null);
        setField(term284, term284.getClass(), "tableName", "NRdvgJlhkX");
        setLongField(term284, term284.getClass(), "geomId", -2813493605142626659L);
        setDoubleField(term284, term284.getClass(), "minX", 0.28570734989730284);
        setDoubleField(term284, term284.getClass(), "maxX", 0.40176586625454525);
        setDoubleField(term284, term284.getClass(), "minY", 0.2641345529914265);
        setDoubleField(term284, term284.getClass(), "maxY", 0.36923381893433327);
        setField(term284, term284.getClass(), "minZ", term302);
        setField(term284, term284.getClass(), "maxZ", term304);
        setField(term284, term284.getClass(), "minM", term306);
        setField(term284, term284.getClass(), "maxM", term308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term284, args);
    }

};


