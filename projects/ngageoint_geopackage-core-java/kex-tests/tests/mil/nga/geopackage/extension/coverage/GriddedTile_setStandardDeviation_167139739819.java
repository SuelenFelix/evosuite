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

public class GriddedTile_setStandardDeviation_167139739819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783;
     Object term808;

    public GriddedTile_setStandardDeviation_167139739819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term800 = new Double(0.6047137830113202);
        Double term802 = new Double(0.6767213143579776);
        Double term804 = new Double(0.48862955528902696);
        Double term806 = new Double(0.426231085465289);
        term783 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term783, term783.getClass(), "id", 1439298019805881866L);
        setField(term783, term783.getClass(), "contents", null);
        setField(term783, term783.getClass(), "tableName", "HyxfbSQYBe");
        setLongField(term783, term783.getClass(), "tableId", -8708192233349544946L);
        setDoubleField(term783, term783.getClass(), "scale", 1.0);
        setDoubleField(term783, term783.getClass(), "offset", 0.43692187681405226);
        setField(term783, term783.getClass(), "min", term800);
        setField(term783, term783.getClass(), "max", term802);
        setField(term783, term783.getClass(), "mean", term804);
        setField(term783, term783.getClass(), "standardDeviation", term806);
        term808 = new Double(0.0027299293098262956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term808;
        callMethod(klass, "setStandardDeviation", argTypes, term783, args);
    }

};


