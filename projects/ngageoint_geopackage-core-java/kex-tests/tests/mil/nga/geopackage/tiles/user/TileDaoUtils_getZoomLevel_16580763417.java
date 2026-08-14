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
import java.lang.Double;
import java.lang.Boolean;

public class TileDaoUtils_getZoomLevel_16580763417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;
     Object term3769;
     Object term3775;
     Object term3860;
     Object term3862;
     Object term3864;

    public TileDaoUtils_getZoomLevel_16580763417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3767 = (double[]) newDoubleArray(1);
        setDoubleElement(term3767, 0, 0.7154795600170818);
        term3769 = (double[]) newDoubleArray(5);
        setDoubleElement(term3769, 0, 0.6355029654528058);
        setDoubleElement(term3769, 1, 0.0022646783892913414);
        setDoubleElement(term3769, 2, 0.36226058076369927);
        setDoubleElement(term3769, 3, 0.03699061125289671);
        setDoubleElement(term3769, 4, 0.6047137830113202);
        Object term3778 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3778, term3778.getClass(), "contents", null);
        setField(term3778, term3778.getClass(), "tableName", "HBGNxdNURv");
        setLongField(term3778, term3778.getClass(), "zoomLevel", -7672528020740371001L);
        setLongField(term3778, term3778.getClass(), "matrixWidth", -4502405999831680926L);
        setLongField(term3778, term3778.getClass(), "matrixHeight", 1967728129628047933L);
        setLongField(term3778, term3778.getClass(), "tileWidth", 2120084523938730454L);
        setLongField(term3778, term3778.getClass(), "tileHeight", 6855071767938501807L);
        setDoubleField(term3778, term3778.getClass(), "pixelXSize", 0.6767213143579776);
        setDoubleField(term3778, term3778.getClass(), "pixelYSize", 0.48862955528902696);
        Object term3799 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3799, term3799.getClass(), "contents", null);
        setField(term3799, term3799.getClass(), "tableName", "");
        setLongField(term3799, term3799.getClass(), "zoomLevel", -5892135042702373494L);
        setLongField(term3799, term3799.getClass(), "matrixWidth", 5262507301787091109L);
        setLongField(term3799, term3799.getClass(), "matrixHeight", -6823727938421990489L);
        setLongField(term3799, term3799.getClass(), "tileWidth", -484994522244390100L);
        setLongField(term3799, term3799.getClass(), "tileHeight", 1233889271256172047L);
        setDoubleField(term3799, term3799.getClass(), "pixelXSize", 0.426231085465289);
        setDoubleField(term3799, term3799.getClass(), "pixelYSize", 0.0027299293098262956);
        Object term3809 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3809, term3809.getClass(), "contents", null);
        setField(term3809, term3809.getClass(), "tableName", null);
        setLongField(term3809, term3809.getClass(), "zoomLevel", 6617340557564669657L);
        setLongField(term3809, term3809.getClass(), "matrixWidth", 1439298019805881866L);
        setLongField(term3809, term3809.getClass(), "matrixHeight", -8708192233349544946L);
        setLongField(term3809, term3809.getClass(), "tileWidth", 5907001541142728739L);
        setLongField(term3809, term3809.getClass(), "tileHeight", 4178434741742309755L);
        setDoubleField(term3809, term3809.getClass(), "pixelXSize", 0.29874017652881824);
        setDoubleField(term3809, term3809.getClass(), "pixelYSize", 0.32554480512985284);
        term3775 = new LinkedList();
        ((LinkedList) term3775).add(term3778);
        ((LinkedList) term3775).add(term3799);
        ((LinkedList) term3775).add(term3809);
        ((LinkedList) term3775).add((Object)null);
        ((LinkedList) term3775).add((Object)null);
        ((LinkedList) term3775).add((Object)null);
        ((LinkedList) term3775).add((Object)null);
        ((LinkedList) term3775).add((Object)null);
        term3860 = new Double(0.8819646072665548);
        term3862 = new Double(0.5412182593116958);
        term3864 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term3767;
        args[1] = term3769;
        args[2] = term3775;
        args[3] = term3860;
        args[4] = term3862;
        args[5] = term3864;
        callMethod(klass, "getZoomLevel", argTypes, null, args);
    }

};


