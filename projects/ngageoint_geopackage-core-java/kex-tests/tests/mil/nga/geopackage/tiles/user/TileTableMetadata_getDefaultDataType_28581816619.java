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

public class TileTableMetadata_getDefaultDataType_28581816619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5234;

    public TileTableMetadata_getDefaultDataType_28581816619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5235 = new Long(5127676408959197577L);
        ArrayList term5299 = new ArrayList();
        ArrayList term5303 = new ArrayList();
        term5234 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term5234, term5234.getClass(), "contentsBoundingBox", null);
        setField(term5234, term5234.getClass(), "contentsSrsId", term5235);
        setField(term5234, term5234.getClass(), "tileBoundingBox", null);
        setLongField(term5234, term5234.getClass(), "tileSrsId", -1L);
        setField(term5234, term5234.getClass(), "tableName", "vLerpqavFM");
        setField(term5234, term5234.getClass(), "dataType", "qnvxzwuGKX");
        setField(term5234, term5234.getClass(), "identifier", "EdPAvpluZg");
        setField(term5234, term5234.getClass(), "description", "DzHVBMqWtE");
        setField(term5234, term5234.getClass(), "idColumnName", "THZSpzBRYP");
        setBooleanField(term5234, term5234.getClass(), "autoincrement", true);
        setField(term5234, term5234.getClass(), "additionalColumns", term5299);
        setField(term5234, term5234.getClass(), "columns", term5303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term5234, args);
    }

};


