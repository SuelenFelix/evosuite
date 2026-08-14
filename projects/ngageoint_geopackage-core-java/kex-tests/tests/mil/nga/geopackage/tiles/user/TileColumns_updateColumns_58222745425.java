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

public class TileColumns_updateColumns_58222745425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2883;

    public TileColumns_updateColumns_58222745425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2883 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2883, term2883.getClass(), "zoomLevelIndex", 0);
        setIntField(term2883, term2883.getClass(), "tileColumnIndex", 0);
        setIntField(term2883, term2883.getClass(), "tileRowIndex", 0);
        setIntField(term2883, term2883.getClass(), "tileDataIndex", 0);
        setField(term2883, term2883.getClass(), "tableName", null);
        setField(term2883, term2883.getClass(), "columnNames", null);
        setField(term2883, term2883.getClass(), "columns", null);
        setBooleanField(term2883, term2883.getClass(), "custom", false);
        setField(term2883, term2883.getClass(), "nameToIndex", null);
        setIntField(term2883, term2883.getClass(), "pkIndex", 0);
        setBooleanField(term2883, term2883.getClass(), "pkModifiable", false);
        setBooleanField(term2883, term2883.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term2883, args);
    }

};


