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

public class TileMatrix_getTableName_11309174326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public TileMatrix_getTableName_11309174326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term175, term175.getClass(), "contents", null);
        setField(term175, term175.getClass(), "tableName", "SzjVpOQTyS");
        setLongField(term175, term175.getClass(), "zoomLevel", -7672528020740371001L);
        setLongField(term175, term175.getClass(), "matrixWidth", -4502405999831680926L);
        setLongField(term175, term175.getClass(), "matrixHeight", 1967728129628047933L);
        setLongField(term175, term175.getClass(), "tileWidth", 2120084523938730454L);
        setLongField(term175, term175.getClass(), "tileHeight", 6855071767938501807L);
        setDoubleField(term175, term175.getClass(), "pixelXSize", 0.8474802076607362);
        setDoubleField(term175, term175.getClass(), "pixelYSize", 0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term175, args);
    }

};


