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

public class TileTableMetadata_setContentsBoundingBox_187338240422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5603;

    public TileTableMetadata_setContentsBoundingBox_187338240422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5604 = new Long(8428634514691209827L);
        ArrayList term5668 = new ArrayList();
        ArrayList term5672 = new ArrayList();
        term5603 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term5603, term5603.getClass(), "contentsBoundingBox", null);
        setField(term5603, term5603.getClass(), "contentsSrsId", term5604);
        setField(term5603, term5603.getClass(), "tileBoundingBox", null);
        setLongField(term5603, term5603.getClass(), "tileSrsId", -1L);
        setField(term5603, term5603.getClass(), "tableName", "zNFLXMifnS");
        setField(term5603, term5603.getClass(), "dataType", "HHQcYMSBVc");
        setField(term5603, term5603.getClass(), "identifier", "wdoqITnaAP");
        setField(term5603, term5603.getClass(), "description", "rIPMBcrNqB");
        setField(term5603, term5603.getClass(), "idColumnName", "UDaboHZHhz");
        setBooleanField(term5603, term5603.getClass(), "autoincrement", true);
        setField(term5603, term5603.getClass(), "additionalColumns", term5668);
        setField(term5603, term5603.getClass(), "columns", term5672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.BoundingBox");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContentsBoundingBox", argTypes, term5603, args);
    }

};


