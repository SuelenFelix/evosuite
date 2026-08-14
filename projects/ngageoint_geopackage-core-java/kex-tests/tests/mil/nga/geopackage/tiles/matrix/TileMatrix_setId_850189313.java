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

public class TileMatrix_setId_850189313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term81;

    public TileMatrix_setId_850189313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term61, term61.getClass(), "contents", null);
        setField(term61, term61.getClass(), "tableName", "MuLcgQHgqz");
        setLongField(term61, term61.getClass(), "zoomLevel", -2813493605142626659L);
        setLongField(term61, term61.getClass(), "matrixWidth", -8885298608300233488L);
        setLongField(term61, term61.getClass(), "matrixHeight", -4325723315152823407L);
        setLongField(term61, term61.getClass(), "tileWidth", 2535595959091595249L);
        setLongField(term61, term61.getClass(), "tileHeight", -5476826692763582090L);
        setDoubleField(term61, term61.getClass(), "pixelXSize", 0.28570734989730284);
        setDoubleField(term61, term61.getClass(), "pixelYSize", 0.40176586625454525);
        term81 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrixKey"));
        setField(term81, term81.getClass(), "tableName", "xxtlPwDYFs");
        setLongField(term81, term81.getClass(), "zoomLevel", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrixKey");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "setId", argTypes, term61, args);
    }

};


