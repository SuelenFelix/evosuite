package mil.nga.geopackage.extension.ecere.tile_matrix_set;

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
import static mil.nga.geopackage.extension.ecere.tile_matrix_set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileMatrixTable_setTableName_166590416512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1053;

    public TileMatrixTable_setTableName_166590416512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1053 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        setField(term1053, term1053.getClass(), "tableName", null);
        setField(term1053, term1053.getClass(), "tms", null);
        setField(term1053, term1053.getClass(), "tmsId", null);
        setLongField(term1053, term1053.getClass(), "maxLevel", 0L);
        setLongField(term1053, term1053.getClass(), "minLevel", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTableName", argTypes, term1053, args);
    }

};


