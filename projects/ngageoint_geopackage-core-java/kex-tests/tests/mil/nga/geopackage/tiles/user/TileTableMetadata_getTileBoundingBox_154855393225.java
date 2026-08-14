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

public class TileTableMetadata_getTileBoundingBox_154855393225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5974;

    public TileTableMetadata_getTileBoundingBox_154855393225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5975 = new Long(2486810210675247493L);
        ArrayList term6039 = new ArrayList();
        ArrayList term6043 = new ArrayList();
        term5974 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term5974, term5974.getClass(), "contentsBoundingBox", null);
        setField(term5974, term5974.getClass(), "contentsSrsId", term5975);
        setField(term5974, term5974.getClass(), "tileBoundingBox", null);
        setLongField(term5974, term5974.getClass(), "tileSrsId", -1L);
        setField(term5974, term5974.getClass(), "tableName", "VVNNlAePXF");
        setField(term5974, term5974.getClass(), "dataType", "jnwVnmKAFv");
        setField(term5974, term5974.getClass(), "identifier", "TXyHhqeCjR");
        setField(term5974, term5974.getClass(), "description", "lZIgPZPgTu");
        setField(term5974, term5974.getClass(), "idColumnName", "iuCxnHGMoW");
        setBooleanField(term5974, term5974.getClass(), "autoincrement", true);
        setField(term5974, term5974.getClass(), "additionalColumns", term6039);
        setField(term5974, term5974.getClass(), "columns", term6043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileBoundingBox", argTypes, term5974, args);
    }

};


