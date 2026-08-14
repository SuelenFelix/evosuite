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

public class TileMatrix_setTileWidth_136163848414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;
     Object term441;

    public TileMatrix_setTileWidth_136163848414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term421, term421.getClass(), "contents", null);
        setField(term421, term421.getClass(), "tableName", "oVcInYnLWB");
        setLongField(term421, term421.getClass(), "zoomLevel", -8654565919063661957L);
        setLongField(term421, term421.getClass(), "matrixWidth", -5248475803419977214L);
        setLongField(term421, term421.getClass(), "matrixHeight", -6723783499250797216L);
        setLongField(term421, term421.getClass(), "tileWidth", 41775768178052008L);
        setLongField(term421, term421.getClass(), "tileHeight", 6682528376118987775L);
        setDoubleField(term421, term421.getClass(), "pixelXSize", 0.5840714198152577);
        setDoubleField(term421, term421.getClass(), "pixelYSize", 0.7559240768573477);
        term441 = new Long(682356318767179819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term441;
        callMethod(klass, "setTileWidth", argTypes, term421, args);
    }

};


