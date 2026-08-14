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
import java.lang.Integer;

public class TileColumns_setZoomLevelIndex_166209838327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2901;
     Object term2910;

    public TileColumns_setZoomLevelIndex_166209838327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2901 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2901, term2901.getClass(), "zoomLevelIndex", 0);
        setIntField(term2901, term2901.getClass(), "tileColumnIndex", 0);
        setIntField(term2901, term2901.getClass(), "tileRowIndex", 0);
        setIntField(term2901, term2901.getClass(), "tileDataIndex", 0);
        setField(term2901, term2901.getClass(), "tableName", null);
        setField(term2901, term2901.getClass(), "columnNames", null);
        setField(term2901, term2901.getClass(), "columns", null);
        setBooleanField(term2901, term2901.getClass(), "custom", false);
        setField(term2901, term2901.getClass(), "nameToIndex", null);
        setIntField(term2901, term2901.getClass(), "pkIndex", 0);
        setBooleanField(term2901, term2901.getClass(), "pkModifiable", false);
        setBooleanField(term2901, term2901.getClass(), "valueValidation", false);
        term2910 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2910;
        callMethod(klass, "setZoomLevelIndex", argTypes, term2901, args);
    }

};


