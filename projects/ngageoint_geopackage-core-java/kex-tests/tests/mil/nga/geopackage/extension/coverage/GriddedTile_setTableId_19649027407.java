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
import java.lang.Long;

public class GriddedTile_setTableId_19649027407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351;
     Object term376;

    public GriddedTile_setTableId_19649027407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term368 = new Double(0.13481025392611334);
        Double term370 = new Double(0.3800088629986428);
        Double term372 = new Double(0.5840714198152577);
        Double term374 = new Double(0.7559240768573477);
        term351 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term351, term351.getClass(), "id", -4325723315152823407L);
        setField(term351, term351.getClass(), "contents", null);
        setField(term351, term351.getClass(), "tableName", "SzjVpOQTyS");
        setLongField(term351, term351.getClass(), "tableId", 2535595959091595249L);
        setDoubleField(term351, term351.getClass(), "scale", 1.0);
        setDoubleField(term351, term351.getClass(), "offset", 0.6076495596892013);
        setField(term351, term351.getClass(), "min", term368);
        setField(term351, term351.getClass(), "max", term370);
        setField(term351, term351.getClass(), "mean", term372);
        setField(term351, term351.getClass(), "standardDeviation", term374);
        term376 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term376;
        callMethod(klass, "setTableId", argTypes, term351, args);
    }

};


