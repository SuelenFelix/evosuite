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

public class TileTableMetadata_getTileSrsId_128961503956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6592;

    public TileTableMetadata_getTileSrsId_128961503956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6592 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6592, term6592.getClass(), "contentsBoundingBox", null);
        setField(term6592, term6592.getClass(), "contentsSrsId", null);
        setField(term6592, term6592.getClass(), "tileBoundingBox", null);
        setLongField(term6592, term6592.getClass(), "tileSrsId", 0L);
        setField(term6592, term6592.getClass(), "tableName", null);
        setField(term6592, term6592.getClass(), "dataType", null);
        setField(term6592, term6592.getClass(), "identifier", null);
        setField(term6592, term6592.getClass(), "description", null);
        setField(term6592, term6592.getClass(), "idColumnName", null);
        setBooleanField(term6592, term6592.getClass(), "autoincrement", false);
        setField(term6592, term6592.getClass(), "additionalColumns", null);
        setField(term6592, term6592.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileSrsId", argTypes, term6592, args);
    }

};


