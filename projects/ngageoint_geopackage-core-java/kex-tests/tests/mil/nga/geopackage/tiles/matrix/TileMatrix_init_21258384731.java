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

public class TileMatrix_init_21258384731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TileMatrix_init_21258384731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term1, term1.getClass(), "contents", null);
        setField(term1, term1.getClass(), "tableName", "PAEBtnZtTD");
        setLongField(term1, term1.getClass(), "zoomLevel", 2442117782898005296L);
        setLongField(term1, term1.getClass(), "matrixWidth", 6375119433582206027L);
        setLongField(term1, term1.getClass(), "matrixHeight", -8257434502486459194L);
        setLongField(term1, term1.getClass(), "tileWidth", -8400487765614892086L);
        setLongField(term1, term1.getClass(), "tileHeight", 5270370404989704783L);
        setDoubleField(term1, term1.getClass(), "pixelXSize", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "pixelYSize", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


