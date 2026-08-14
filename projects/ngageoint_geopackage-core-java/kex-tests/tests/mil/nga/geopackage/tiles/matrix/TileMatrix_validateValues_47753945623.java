package mil.nga.geopackage.tiles.matrix;

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
import static mil.nga.geopackage.tiles.matrix.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class TileMatrix_validateValues_47753945623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term779;

    public TileMatrix_validateValues_47753945623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term747, term747.getClass(), "contents", null);
        setField(term747, term747.getClass(), "tableName", "vrQLuWIDJX");
        setLongField(term747, term747.getClass(), "zoomLevel", -4822736661741380518L);
        setLongField(term747, term747.getClass(), "matrixWidth", -5386201758403679145L);
        setLongField(term747, term747.getClass(), "matrixHeight", -7268507582722666254L);
        setLongField(term747, term747.getClass(), "tileWidth", 5671808784468963649L);
        setLongField(term747, term747.getClass(), "tileHeight", 2297097306706899827L);
        setDoubleField(term747, term747.getClass(), "pixelXSize", 0.8823181080774973);
        setDoubleField(term747, term747.getClass(), "pixelYSize", 0.2192450926212024);
        term779 = new Double(0.7591353014991907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = "flxyYxBRtu";
        args[1] = term779;
        callMethod(klass, "validateValues", argTypes, term747, args);
    }

};


