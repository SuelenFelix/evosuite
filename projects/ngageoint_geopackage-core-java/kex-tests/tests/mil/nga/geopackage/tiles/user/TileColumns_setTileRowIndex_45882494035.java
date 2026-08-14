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

public class TileColumns_setTileRowIndex_45882494035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977;
     Object term2986;

    public TileColumns_setTileRowIndex_45882494035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2977 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term2977, term2977.getClass(), "zoomLevelIndex", 0);
        setIntField(term2977, term2977.getClass(), "tileColumnIndex", 0);
        setIntField(term2977, term2977.getClass(), "tileRowIndex", 0);
        setIntField(term2977, term2977.getClass(), "tileDataIndex", 0);
        setField(term2977, term2977.getClass(), "tableName", null);
        setField(term2977, term2977.getClass(), "columnNames", null);
        setField(term2977, term2977.getClass(), "columns", null);
        setBooleanField(term2977, term2977.getClass(), "custom", false);
        setField(term2977, term2977.getClass(), "nameToIndex", null);
        setIntField(term2977, term2977.getClass(), "pkIndex", 0);
        setBooleanField(term2977, term2977.getClass(), "pkModifiable", false);
        setBooleanField(term2977, term2977.getClass(), "valueValidation", false);
        term2986 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2986;
        callMethod(klass, "setTileRowIndex", argTypes, term2977, args);
    }

};


