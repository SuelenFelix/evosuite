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

public class TileTableMetadata_buildColumns_206689916520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5357;

    public TileTableMetadata_buildColumns_206689916520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5358 = new Long(-6573104506744284592L);
        ArrayList term5422 = new ArrayList();
        ArrayList term5426 = new ArrayList();
        term5357 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term5357, term5357.getClass(), "contentsBoundingBox", null);
        setField(term5357, term5357.getClass(), "contentsSrsId", term5358);
        setField(term5357, term5357.getClass(), "tileBoundingBox", null);
        setLongField(term5357, term5357.getClass(), "tileSrsId", -1L);
        setField(term5357, term5357.getClass(), "tableName", "ZfBIVGBQOE");
        setField(term5357, term5357.getClass(), "dataType", "QSrDQfEsTR");
        setField(term5357, term5357.getClass(), "identifier", "PsqusYmejD");
        setField(term5357, term5357.getClass(), "description", "NTWMiBEaDF");
        setField(term5357, term5357.getClass(), "idColumnName", "SPBstwKFVr");
        setBooleanField(term5357, term5357.getClass(), "autoincrement", true);
        setField(term5357, term5357.getClass(), "additionalColumns", term5422);
        setField(term5357, term5357.getClass(), "columns", term5426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildColumns", argTypes, term5357, args);
    }

};


