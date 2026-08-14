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
import java.lang.Integer;

public class TileColumns_setTileDataIndex_12255010839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3015;
     Object term3024;

    public TileColumns_setTileDataIndex_12255010839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3015 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        setIntField(term3015, term3015.getClass(), "zoomLevelIndex", 0);
        setIntField(term3015, term3015.getClass(), "tileColumnIndex", 0);
        setIntField(term3015, term3015.getClass(), "tileRowIndex", 0);
        setIntField(term3015, term3015.getClass(), "tileDataIndex", 0);
        setField(term3015, term3015.getClass(), "tableName", null);
        setField(term3015, term3015.getClass(), "columnNames", null);
        setField(term3015, term3015.getClass(), "columns", null);
        setBooleanField(term3015, term3015.getClass(), "custom", false);
        setField(term3015, term3015.getClass(), "nameToIndex", null);
        setIntField(term3015, term3015.getClass(), "pkIndex", 0);
        setBooleanField(term3015, term3015.getClass(), "pkModifiable", false);
        setBooleanField(term3015, term3015.getClass(), "valueValidation", false);
        term3024 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3024;
        callMethod(klass, "setTileDataIndex", argTypes, term3015, args);
    }

};


