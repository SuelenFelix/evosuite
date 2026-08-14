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

public class TileColumns_getTileRowColumn_122186914037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2997;

    public TileColumns_getTileRowColumn_122186914037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2997 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2997, term2997.getClass(), "zoomLevelIndex", 0);
        setIntField(term2997, term2997.getClass(), "tileColumnIndex", 0);
        setIntField(term2997, term2997.getClass(), "tileRowIndex", 0);
        setIntField(term2997, term2997.getClass(), "tileDataIndex", 0);
        setField(term2997, term2997.getClass(), "tableName", null);
        setField(term2997, term2997.getClass(), "columnNames", null);
        setField(term2997, term2997.getClass(), "columns", null);
        setBooleanField(term2997, term2997.getClass(), "custom", false);
        setField(term2997, term2997.getClass(), "nameToIndex", null);
        setIntField(term2997, term2997.getClass(), "pkIndex", 0);
        setBooleanField(term2997, term2997.getClass(), "pkModifiable", false);
        setBooleanField(term2997, term2997.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileRowColumn", argTypes, term2997, args);
    }

};


