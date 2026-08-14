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

public class GeometryIndex_setMaxM_143920972524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116;
     Object term1142;

    public GeometryIndex_setMaxM_143920972524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1134 = new Double(0.39286935532362843);
        Double term1136 = new Double(0.11577948268926874);
        Double term1138 = new Double(0.5617009352394552);
        Double term1140 = new Double(0.09067063848644474);
        term1116 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term1116, term1116.getClass(), "tableIndex", null);
        setField(term1116, term1116.getClass(), "tableName", "SbAoxhfrkn");
        setLongField(term1116, term1116.getClass(), "geomId", -484994522244390100L);
        setDoubleField(term1116, term1116.getClass(), "minX", 0.11577948268926874);
        setDoubleField(term1116, term1116.getClass(), "maxX", 0.5617009352394552);
        setDoubleField(term1116, term1116.getClass(), "minY", 0.09067063848644474);
        setDoubleField(term1116, term1116.getClass(), "maxY", 0.268304014379393);
        setField(term1116, term1116.getClass(), "minZ", term1134);
        setField(term1116, term1116.getClass(), "maxZ", term1136);
        setField(term1116, term1116.getClass(), "minM", term1138);
        setField(term1116, term1116.getClass(), "maxM", term1140);
        term1142 = new Double(0.268304014379393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term1142;
        callMethod(klass, "setMaxM", argTypes, term1116, args);
    }

};


