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

public class GriddedTile_setScale_5539704049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;
     Object term448;

    public GriddedTile_setScale_5539704049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term440 = new Double(0.2852810965221698);
        Double term442 = new Double(0.6300849762307866);
        Double term444 = new Double(0.9737083944266686);
        Double term446 = new Double(0.0668892744806211);
        term423 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term423, term423.getClass(), "id", 5127676408959197577L);
        setField(term423, term423.getClass(), "contents", null);
        setField(term423, term423.getClass(), "tableName", "hRNSzYYIrc");
        setLongField(term423, term423.getClass(), "tableId", -6573104506744284592L);
        setDoubleField(term423, term423.getClass(), "scale", 1.0);
        setDoubleField(term423, term423.getClass(), "offset", 0.8474802076607362);
        setField(term423, term423.getClass(), "min", term440);
        setField(term423, term423.getClass(), "max", term442);
        setField(term423, term423.getClass(), "mean", term444);
        setField(term423, term423.getClass(), "standardDeviation", term446);
        term448 = new Double(0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term448;
        callMethod(klass, "setScale", argTypes, term423, args);
    }

};


