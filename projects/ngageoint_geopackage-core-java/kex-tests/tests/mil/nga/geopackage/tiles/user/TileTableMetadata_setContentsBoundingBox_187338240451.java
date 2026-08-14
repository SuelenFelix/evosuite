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

public class TileTableMetadata_setContentsBoundingBox_187338240451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6577;

    public TileTableMetadata_setContentsBoundingBox_187338240451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6577 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6577, term6577.getClass(), "contentsBoundingBox", null);
        setField(term6577, term6577.getClass(), "contentsSrsId", null);
        setField(term6577, term6577.getClass(), "tileBoundingBox", null);
        setLongField(term6577, term6577.getClass(), "tileSrsId", 0L);
        setField(term6577, term6577.getClass(), "tableName", null);
        setField(term6577, term6577.getClass(), "dataType", null);
        setField(term6577, term6577.getClass(), "identifier", null);
        setField(term6577, term6577.getClass(), "description", null);
        setField(term6577, term6577.getClass(), "idColumnName", null);
        setBooleanField(term6577, term6577.getClass(), "autoincrement", false);
        setField(term6577, term6577.getClass(), "additionalColumns", null);
        setField(term6577, term6577.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContentsBoundingBox", argTypes, term6577, args);
    }

};


