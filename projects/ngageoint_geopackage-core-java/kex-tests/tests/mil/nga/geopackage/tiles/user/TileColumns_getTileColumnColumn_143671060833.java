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

public class TileColumns_getTileColumnColumn_143671060833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2959;

    public TileColumns_getTileColumnColumn_143671060833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2959 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2959, term2959.getClass(), "zoomLevelIndex", 0);
        setIntField(term2959, term2959.getClass(), "tileColumnIndex", 0);
        setIntField(term2959, term2959.getClass(), "tileRowIndex", 0);
        setIntField(term2959, term2959.getClass(), "tileDataIndex", 0);
        setField(term2959, term2959.getClass(), "tableName", null);
        setField(term2959, term2959.getClass(), "columnNames", null);
        setField(term2959, term2959.getClass(), "columns", null);
        setBooleanField(term2959, term2959.getClass(), "custom", false);
        setField(term2959, term2959.getClass(), "nameToIndex", null);
        setIntField(term2959, term2959.getClass(), "pkIndex", 0);
        setBooleanField(term2959, term2959.getClass(), "pkModifiable", false);
        setBooleanField(term2959, term2959.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnColumn", argTypes, term2959, args);
    }

};


