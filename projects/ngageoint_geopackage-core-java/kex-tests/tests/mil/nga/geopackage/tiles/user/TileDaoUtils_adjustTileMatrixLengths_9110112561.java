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
import java.util.LinkedList;
import java.lang.Object;

public class TileDaoUtils_adjustTileMatrixLengths_9110112561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3525;
     Object term3543;

    public TileDaoUtils_adjustTileMatrixLengths_9110112561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3525 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term3525, term3525.getClass(), "contents", null);
        setField(term3525, term3525.getClass(), "tableName", "AHbZyFOmlo");
        setField(term3525, term3525.getClass(), "srs", null);
        setLongField(term3525, term3525.getClass(), "srsId", 2442117782898005296L);
        setDoubleField(term3525, term3525.getClass(), "minX", 0.13238746331190498);
        setDoubleField(term3525, term3525.getClass(), "minY", 0.3455959125047594);
        setDoubleField(term3525, term3525.getClass(), "maxX", 0.5523635872663106);
        setDoubleField(term3525, term3525.getClass(), "maxY", 0.544608645520025);
        Object term3546 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3546, term3546.getClass(), "contents", null);
        setField(term3546, term3546.getClass(), "tableName", "TwfWVQGiIj");
        setLongField(term3546, term3546.getClass(), "zoomLevel", 6375119433582206027L);
        setLongField(term3546, term3546.getClass(), "matrixWidth", -8257434502486459194L);
        setLongField(term3546, term3546.getClass(), "matrixHeight", -8400487765614892086L);
        setLongField(term3546, term3546.getClass(), "tileWidth", 5270370404989704783L);
        setLongField(term3546, term3546.getClass(), "tileHeight", 7411271909051562686L);
        setDoubleField(term3546, term3546.getClass(), "pixelXSize", 0.28570734989730284);
        setDoubleField(term3546, term3546.getClass(), "pixelYSize", 0.40176586625454525);
        Object term3567 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3567, term3567.getClass(), "contents", null);
        setField(term3567, term3567.getClass(), "tableName", "");
        setLongField(term3567, term3567.getClass(), "zoomLevel", 4872422362414183754L);
        setLongField(term3567, term3567.getClass(), "matrixWidth", 6811161968424632369L);
        setLongField(term3567, term3567.getClass(), "matrixHeight", -7237588299778557629L);
        setLongField(term3567, term3567.getClass(), "tileWidth", 6967924379644551255L);
        setLongField(term3567, term3567.getClass(), "tileHeight", -2813493605142626659L);
        setDoubleField(term3567, term3567.getClass(), "pixelXSize", 0.2641345529914265);
        setDoubleField(term3567, term3567.getClass(), "pixelYSize", 0.36923381893433327);
        Object term3577 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3577, term3577.getClass(), "contents", null);
        setField(term3577, term3577.getClass(), "tableName", null);
        setLongField(term3577, term3577.getClass(), "zoomLevel", -8885298608300233488L);
        setLongField(term3577, term3577.getClass(), "matrixWidth", -4325723315152823407L);
        setLongField(term3577, term3577.getClass(), "matrixHeight", 2535595959091595249L);
        setLongField(term3577, term3577.getClass(), "tileWidth", -5476826692763582090L);
        setLongField(term3577, term3577.getClass(), "tileHeight", -872011222785455006L);
        setDoubleField(term3577, term3577.getClass(), "pixelXSize", 0.6076495596892013);
        setDoubleField(term3577, term3577.getClass(), "pixelYSize", 0.37773193782763337);
        term3543 = new LinkedList();
        ((LinkedList) term3543).add(term3546);
        ((LinkedList) term3543).add(term3567);
        ((LinkedList) term3543).add(term3577);
        ((LinkedList) term3543).add((Object)null);
        ((LinkedList) term3543).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3525;
        args[1] = term3543;
        callMethod(klass, "adjustTileMatrixLengths", argTypes, null, args);
    }

};


