package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileDaoUtils_getMapZoom_59457009320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4513;
     Object term4531;

    public TileDaoUtils_getMapZoom_59457009320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4513 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term4513, term4513.getClass(), "contents", null);
        setField(term4513, term4513.getClass(), "tableName", "zaloBqlrSo");
        setField(term4513, term4513.getClass(), "srs", null);
        setLongField(term4513, term4513.getClass(), "srsId", -1592696983130738594L);
        setDoubleField(term4513, term4513.getClass(), "minX", 0.01784667720947175);
        setDoubleField(term4513, term4513.getClass(), "minY", 0.4395312828193261);
        setDoubleField(term4513, term4513.getClass(), "maxX", 0.5715204226647931);
        setDoubleField(term4513, term4513.getClass(), "maxY", 0.6420798930164424);
        term4531 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4531, term4531.getClass(), "contents", null);
        setField(term4531, term4531.getClass(), "tableName", "vvoLrMGCoN");
        setLongField(term4531, term4531.getClass(), "zoomLevel", 6902365338255307910L);
        setLongField(term4531, term4531.getClass(), "matrixWidth", -8019730974733786399L);
        setLongField(term4531, term4531.getClass(), "matrixHeight", 394960377236392159L);
        setLongField(term4531, term4531.getClass(), "tileWidth", -2955854401507097864L);
        setLongField(term4531, term4531.getClass(), "tileHeight", 329213208496958131L);
        setDoubleField(term4531, term4531.getClass(), "pixelXSize", 0.0011409626665044303);
        setDoubleField(term4531, term4531.getClass(), "pixelYSize", 0.5195852993308188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        argTypes[1] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Object[] args = new Object[2];
        args[0] = term4513;
        args[1] = term4531;
        callMethod(klass, "getMapZoom", argTypes, null, args);
    }

};


