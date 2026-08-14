package mil.nga.geopackage.tiles.reproject;

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
import static mil.nga.geopackage.tiles.reproject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileReprojectionCore_reproject_43302791831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public TileReprojectionCore_reproject_43302791831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term79, term79.getClass(), "contents", null);
        setField(term79, term79.getClass(), "tableName", "PAEBtnZtTD");
        setLongField(term79, term79.getClass(), "zoomLevel", 8059786003080744426L);
        setLongField(term79, term79.getClass(), "matrixWidth", -4365849114644724155L);
        setLongField(term79, term79.getClass(), "matrixHeight", 2486810210675247493L);
        setLongField(term79, term79.getClass(), "tileWidth", 7009926388951271268L);
        setLongField(term79, term79.getClass(), "tileHeight", -7672528020740371001L);
        setDoubleField(term79, term79.getClass(), "pixelXSize", 0.13238746331190498);
        setDoubleField(term79, term79.getClass(), "pixelYSize", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Object[] args = new Object[1];
        args[0] = term79;
        callMethod(klass, "reproject", argTypes, null, args);
    }

};


