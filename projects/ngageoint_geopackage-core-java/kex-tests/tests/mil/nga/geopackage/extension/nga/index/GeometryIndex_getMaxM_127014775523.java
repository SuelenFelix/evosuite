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

public class GeometryIndex_getMaxM_127014775523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public GeometryIndex_getMaxM_127014775523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1098 = new Double(0.3163771663728089);
        Double term1100 = new Double(0.8819646072665548);
        Double term1102 = new Double(0.5412182593116958);
        Double term1104 = new Double(0.16988691727397487);
        term1080 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1080, term1080.getClass(), "tableIndex", null);
        setField(term1080, term1080.getClass(), "tableName", "AijpHYOFuy");
        setLongField(term1080, term1080.getClass(), "geomId", -6823727938421990489L);
        setDoubleField(term1080, term1080.getClass(), "minX", 0.8819646072665548);
        setDoubleField(term1080, term1080.getClass(), "maxX", 0.5412182593116958);
        setDoubleField(term1080, term1080.getClass(), "minY", 0.16988691727397487);
        setDoubleField(term1080, term1080.getClass(), "maxY", 0.39286935532362843);
        setField(term1080, term1080.getClass(), "minZ", term1098);
        setField(term1080, term1080.getClass(), "maxZ", term1100);
        setField(term1080, term1080.getClass(), "minM", term1102);
        setField(term1080, term1080.getClass(), "maxM", term1104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxM", argTypes, term1080, args);
    }

};


