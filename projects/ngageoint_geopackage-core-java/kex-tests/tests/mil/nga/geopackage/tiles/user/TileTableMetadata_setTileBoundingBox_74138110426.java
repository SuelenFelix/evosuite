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

public class TileTableMetadata_setTileBoundingBox_74138110426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6097;

    public TileTableMetadata_setTileBoundingBox_74138110426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6098 = new Long(7009926388951271268L);
        ArrayList term6162 = new ArrayList();
        ArrayList term6166 = new ArrayList();
        term6097 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6097, term6097.getClass(), "contentsBoundingBox", null);
        setField(term6097, term6097.getClass(), "contentsSrsId", term6098);
        setField(term6097, term6097.getClass(), "tileBoundingBox", null);
        setLongField(term6097, term6097.getClass(), "tileSrsId", -1L);
        setField(term6097, term6097.getClass(), "tableName", "GPSEWEDSTo");
        setField(term6097, term6097.getClass(), "dataType", "RCOqfVsRHt");
        setField(term6097, term6097.getClass(), "identifier", "TSyCeEZPaT");
        setField(term6097, term6097.getClass(), "description", "JeZFtaqkzW");
        setField(term6097, term6097.getClass(), "idColumnName", "vOVuNSCCLe");
        setBooleanField(term6097, term6097.getClass(), "autoincrement", true);
        setField(term6097, term6097.getClass(), "additionalColumns", term6162);
        setField(term6097, term6097.getClass(), "columns", term6166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTileBoundingBox", argTypes, term6097, args);
    }

};


