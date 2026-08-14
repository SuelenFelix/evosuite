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
import java.lang.Boolean;

public class TileTableMetadata_create_13325443530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6471;
     Object term6474;

    public TileTableMetadata_create_13325443530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6471 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6471, term6471.getClass(), "contentsBoundingBox", null);
        setField(term6471, term6471.getClass(), "contentsSrsId", null);
        setField(term6471, term6471.getClass(), "tileBoundingBox", null);
        setLongField(term6471, term6471.getClass(), "tileSrsId", 0L);
        setField(term6471, term6471.getClass(), "tableName", null);
        setField(term6471, term6471.getClass(), "dataType", null);
        setField(term6471, term6471.getClass(), "identifier", null);
        setField(term6471, term6471.getClass(), "description", null);
        setField(term6471, term6471.getClass(), "idColumnName", null);
        setBooleanField(term6471, term6471.getClass(), "autoincrement", false);
        setField(term6471, term6471.getClass(), "additionalColumns", null);
        setField(term6471, term6471.getClass(), "columns", null);
        term6474 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6474;
        callMethod(klass, "create", argTypes, term6471, args);
    }

};


