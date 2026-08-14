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

public class TileColumns_hasZoomLevelColumn_108826406728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2912;

    public TileColumns_hasZoomLevelColumn_108826406728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2912 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2912, term2912.getClass(), "zoomLevelIndex", 0);
        setIntField(term2912, term2912.getClass(), "tileColumnIndex", 0);
        setIntField(term2912, term2912.getClass(), "tileRowIndex", 0);
        setIntField(term2912, term2912.getClass(), "tileDataIndex", 0);
        setField(term2912, term2912.getClass(), "tableName", null);
        setField(term2912, term2912.getClass(), "columnNames", null);
        setField(term2912, term2912.getClass(), "columns", null);
        setBooleanField(term2912, term2912.getClass(), "custom", false);
        setField(term2912, term2912.getClass(), "nameToIndex", null);
        setIntField(term2912, term2912.getClass(), "pkIndex", 0);
        setBooleanField(term2912, term2912.getClass(), "pkModifiable", false);
        setBooleanField(term2912, term2912.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasZoomLevelColumn", argTypes, term2912, args);
    }

};


