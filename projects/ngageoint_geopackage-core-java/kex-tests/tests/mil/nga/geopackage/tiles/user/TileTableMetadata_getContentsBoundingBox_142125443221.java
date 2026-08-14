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

public class TileTableMetadata_getContentsBoundingBox_142125443221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5480;

    public TileTableMetadata_getContentsBoundingBox_142125443221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5481 = new Long(-4920224193275732920L);
        ArrayList term5545 = new ArrayList();
        ArrayList term5549 = new ArrayList();
        term5480 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term5480, term5480.getClass(), "contentsBoundingBox", null);
        setField(term5480, term5480.getClass(), "contentsSrsId", term5481);
        setField(term5480, term5480.getClass(), "tileBoundingBox", null);
        setLongField(term5480, term5480.getClass(), "tileSrsId", -1L);
        setField(term5480, term5480.getClass(), "tableName", "WxYUTuqmIq");
        setField(term5480, term5480.getClass(), "dataType", "OeQLvhVERT");
        setField(term5480, term5480.getClass(), "identifier", "IlvgFINwIa");
        setField(term5480, term5480.getClass(), "description", "GEJABPlHSI");
        setField(term5480, term5480.getClass(), "idColumnName", "aQFUvuaYxd");
        setBooleanField(term5480, term5480.getClass(), "autoincrement", true);
        setField(term5480, term5480.getClass(), "additionalColumns", term5545);
        setField(term5480, term5480.getClass(), "columns", term5549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentsBoundingBox", argTypes, term5480, args);
    }

};


