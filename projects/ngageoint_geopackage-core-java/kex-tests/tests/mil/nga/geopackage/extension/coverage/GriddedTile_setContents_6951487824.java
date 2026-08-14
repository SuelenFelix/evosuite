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

public class GriddedTile_setContents_6951487824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;

    public GriddedTile_setContents_6951487824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term263 = new Double(0.7655020693602768);
        Double term265 = new Double(0.1374549299694151);
        Double term267 = new Double(0.7031006357544823);
        Double term269 = new Double(0.9527281779865117);
        term246 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile"));
        setLongField(term246, term246.getClass(), "id", 4872422362414183754L);
        setField(term246, term246.getClass(), "contents", null);
        setField(term246, term246.getClass(), "tableName", "xxtlPwDYFs");
        setLongField(term246, term246.getClass(), "tableId", 6811161968424632369L);
        setDoubleField(term246, term246.getClass(), "scale", 1.0);
        setDoubleField(term246, term246.getClass(), "offset", 0.40176586625454525);
        setField(term246, term246.getClass(), "min", term263);
        setField(term246, term246.getClass(), "max", term265);
        setField(term246, term246.getClass(), "mean", term267);
        setField(term246, term246.getClass(), "standardDeviation", term269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedTile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContents", argTypes, term246, args);
    }

};


