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

public class TileColumns_getZoomLevelIndex_109276830726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2892;

    public TileColumns_getZoomLevelIndex_109276830726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2892 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2892, term2892.getClass(), "zoomLevelIndex", 0);
        setIntField(term2892, term2892.getClass(), "tileColumnIndex", 0);
        setIntField(term2892, term2892.getClass(), "tileRowIndex", 0);
        setIntField(term2892, term2892.getClass(), "tileDataIndex", 0);
        setField(term2892, term2892.getClass(), "tableName", null);
        setField(term2892, term2892.getClass(), "columnNames", null);
        setField(term2892, term2892.getClass(), "columns", null);
        setBooleanField(term2892, term2892.getClass(), "custom", false);
        setField(term2892, term2892.getClass(), "nameToIndex", null);
        setIntField(term2892, term2892.getClass(), "pkIndex", 0);
        setBooleanField(term2892, term2892.getClass(), "pkModifiable", false);
        setBooleanField(term2892, term2892.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevelIndex", argTypes, term2892, args);
    }

};


