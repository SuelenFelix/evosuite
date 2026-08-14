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

public class GeometryIndex_setMaxY_112626393916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820;
     Object term846;

    public GeometryIndex_setMaxY_112626393916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term838 = new Double(0.3227335400819148);
        Double term840 = new Double(0.43337207054070237);
        Double term842 = new Double(0.13246999699526574);
        Double term844 = new Double(0.9126850255993704);
        term820 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term820, term820.getClass(), "tableIndex", null);
        setField(term820, term820.getClass(), "tableName", "vrQLuWIDJX");
        setLongField(term820, term820.getClass(), "geomId", -7672528020740371001L);
        setDoubleField(term820, term820.getClass(), "minX", 0.9126850255993704);
        setDoubleField(term820, term820.getClass(), "maxX", 0.11179067076100713);
        setDoubleField(term820, term820.getClass(), "minY", 0.5306473989087822);
        setDoubleField(term820, term820.getClass(), "maxY", 0.022483645678509023);
        setField(term820, term820.getClass(), "minZ", term838);
        setField(term820, term820.getClass(), "maxZ", term840);
        setField(term820, term820.getClass(), "minM", term842);
        setField(term820, term820.getClass(), "maxM", term844);
        term846 = new Double(0.025133051616627267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term846;
        callMethod(klass, "setMaxY", argTypes, term820, args);
    }

};


