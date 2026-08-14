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
import java.lang.Long;

public class TileMatrix_setMatrixWidth_177151085510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;
     Object term317;

    public TileMatrix_setMatrixWidth_177151085510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term297, term297.getClass(), "contents", null);
        setField(term297, term297.getClass(), "tableName", "NRdvgJlhkX");
        setLongField(term297, term297.getClass(), "zoomLevel", 4044358158040652353L);
        setLongField(term297, term297.getClass(), "matrixWidth", -4443169559037975007L);
        setLongField(term297, term297.getClass(), "matrixHeight", -3842548265506930260L);
        setLongField(term297, term297.getClass(), "tileWidth", -5788180182343976541L);
        setLongField(term297, term297.getClass(), "tileHeight", 2936323121573284007L);
        setDoubleField(term297, term297.getClass(), "pixelXSize", 0.6436713023569729);
        setDoubleField(term297, term297.getClass(), "pixelYSize", 0.7332741045694002);
        term317 = new Long(-1154553077993834885L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term317;
        callMethod(klass, "setMatrixWidth", argTypes, term297, args);
    }

};


