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

public class TileTableMetadata_create_66621831732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6481;
     Object term6484;
     Object term6486;

    public TileTableMetadata_create_66621831732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6481 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6481, term6481.getClass(), "contentsBoundingBox", null);
        setField(term6481, term6481.getClass(), "contentsSrsId", null);
        setField(term6481, term6481.getClass(), "tileBoundingBox", null);
        setLongField(term6481, term6481.getClass(), "tileSrsId", 0L);
        setField(term6481, term6481.getClass(), "tableName", null);
        setField(term6481, term6481.getClass(), "dataType", null);
        setField(term6481, term6481.getClass(), "identifier", null);
        setField(term6481, term6481.getClass(), "description", null);
        setField(term6481, term6481.getClass(), "idColumnName", null);
        setBooleanField(term6481, term6481.getClass(), "autoincrement", false);
        setField(term6481, term6481.getClass(), "additionalColumns", null);
        setField(term6481, term6481.getClass(), "columns", null);
        term6484 = new Boolean(false);
        term6486 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term6484;
        args[2] = null;
        args[3] = term6486;
        callMethod(klass, "create", argTypes, term6481, args);
    }

};


