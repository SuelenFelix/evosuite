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

public class GeometryIndex_getMaxY_183367250915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784;

    public GeometryIndex_getMaxY_183367250915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term802 = new Double(0.5804948995371725);
        Double term804 = new Double(0.20737514139742264);
        Double term806 = new Double(0.7919370314903882);
        Double term808 = new Double(0.2109867221632754);
        term784 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term784, term784.getClass(), "tableIndex", null);
        setField(term784, term784.getClass(), "tableName", "BYqFIqCKAV");
        setLongField(term784, term784.getClass(), "geomId", 7009926388951271268L);
        setDoubleField(term784, term784.getClass(), "minX", 0.2109867221632754);
        setDoubleField(term784, term784.getClass(), "maxX", 0.3227335400819148);
        setDoubleField(term784, term784.getClass(), "minY", 0.43337207054070237);
        setDoubleField(term784, term784.getClass(), "maxY", 0.13246999699526574);
        setField(term784, term784.getClass(), "minZ", term802);
        setField(term784, term784.getClass(), "maxZ", term804);
        setField(term784, term784.getClass(), "minM", term806);
        setField(term784, term784.getClass(), "maxM", term808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxY", argTypes, term784, args);
    }

};


