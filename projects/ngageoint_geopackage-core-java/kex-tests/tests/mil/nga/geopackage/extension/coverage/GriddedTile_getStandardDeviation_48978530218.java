package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GriddedTile_getStandardDeviation_48978530218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;

    public GriddedTile_getStandardDeviation_48978530218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term765 = new Double(0.6355029654528058);
        Double term767 = new Double(0.0022646783892913414);
        Double term769 = new Double(0.36226058076369927);
        Double term771 = new Double(0.03699061125289671);
        term748 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term748, term748.getClass(), "id", 1233889271256172047L);
        setField(term748, term748.getClass(), "contents", null);
        setField(term748, term748.getClass(), "tableName", "tbcdzjIfER");
        setLongField(term748, term748.getClass(), "tableId", 6617340557564669657L);
        setDoubleField(term748, term748.getClass(), "scale", 1.0);
        setDoubleField(term748, term748.getClass(), "offset", 0.8598297828918529);
        setField(term748, term748.getClass(), "min", term765);
        setField(term748, term748.getClass(), "max", term767);
        setField(term748, term748.getClass(), "mean", term769);
        setField(term748, term748.getClass(), "standardDeviation", term771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardDeviation", argTypes, term748, args);
    }

};


