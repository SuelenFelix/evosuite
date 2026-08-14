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

public class GeometryIndex_setMinY_113335419714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;
     Object term772;

    public GeometryIndex_setMinY_113335419714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term764 = new Double(0.9374115574082594);
        Double term766 = new Double(0.8454723071922143);
        Double term768 = new Double(0.8566567697571895);
        Double term770 = new Double(0.9203805380592256);
        term746 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term746, term746.getClass(), "tableIndex", null);
        setField(term746, term746.getClass(), "tableName", "eZFUvlxvGV");
        setLongField(term746, term746.getClass(), "geomId", 2486810210675247493L);
        setDoubleField(term746, term746.getClass(), "minX", 0.8566567697571895);
        setDoubleField(term746, term746.getClass(), "maxX", 0.9203805380592256);
        setDoubleField(term746, term746.getClass(), "minY", 0.5804948995371725);
        setDoubleField(term746, term746.getClass(), "maxY", 0.20737514139742264);
        setField(term746, term746.getClass(), "minZ", term764);
        setField(term746, term746.getClass(), "maxZ", term766);
        setField(term746, term746.getClass(), "minM", term768);
        setField(term746, term746.getClass(), "maxM", term770);
        term772 = new Double(0.7919370314903882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term772;
        callMethod(klass, "setMinY", argTypes, term746, args);
    }

};


