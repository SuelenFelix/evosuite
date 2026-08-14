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
import java.lang.Long;

public class TileTableMetadata_create_145607797836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6507;
     Object term6510;
     Object term6512;
     Object term6514;

    public TileTableMetadata_create_145607797836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6507 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6507, term6507.getClass(), "contentsBoundingBox", null);
        setField(term6507, term6507.getClass(), "contentsSrsId", null);
        setField(term6507, term6507.getClass(), "tileBoundingBox", null);
        setLongField(term6507, term6507.getClass(), "tileSrsId", 0L);
        setField(term6507, term6507.getClass(), "tableName", null);
        setField(term6507, term6507.getClass(), "dataType", null);
        setField(term6507, term6507.getClass(), "identifier", null);
        setField(term6507, term6507.getClass(), "description", null);
        setField(term6507, term6507.getClass(), "idColumnName", null);
        setBooleanField(term6507, term6507.getClass(), "autoincrement", false);
        setField(term6507, term6507.getClass(), "additionalColumns", null);
        setField(term6507, term6507.getClass(), "columns", null);
        term6510 = new Boolean(false);
        term6512 = new Long(0L);
        term6514 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = long.class;
        argTypes[4] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[5] = long.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term6510;
        args[2] = null;
        args[3] = term6512;
        args[4] = null;
        args[5] = term6514;
        callMethod(klass, "create", argTypes, term6507, args);
    }

};


