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
import java.lang.Long;
import java.util.ArrayList;

public class TileTableMetadata_setTileSrsId_123724426728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6343;
     Object term6416;

    public TileTableMetadata_setTileSrsId_123724426728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6344 = new Long(-4502405999831680926L);
        ArrayList term6408 = new ArrayList();
        ArrayList term6412 = new ArrayList();
        term6343 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6343, term6343.getClass(), "contentsBoundingBox", null);
        setField(term6343, term6343.getClass(), "contentsSrsId", term6344);
        setField(term6343, term6343.getClass(), "tileBoundingBox", null);
        setLongField(term6343, term6343.getClass(), "tileSrsId", -1L);
        setField(term6343, term6343.getClass(), "tableName", "avhRaGZaBF");
        setField(term6343, term6343.getClass(), "dataType", "JkgoRtImdE");
        setField(term6343, term6343.getClass(), "identifier", "qFGKIJjlmV");
        setField(term6343, term6343.getClass(), "description", "IHqvyhMtuM");
        setField(term6343, term6343.getClass(), "idColumnName", "dAldIGYAXV");
        setBooleanField(term6343, term6343.getClass(), "autoincrement", true);
        setField(term6343, term6343.getClass(), "additionalColumns", term6408);
        setField(term6343, term6343.getClass(), "columns", term6412);
        term6416 = new Long(-1635471392209071620L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6416;
        callMethod(klass, "setTileSrsId", argTypes, term6343, args);
    }

};


