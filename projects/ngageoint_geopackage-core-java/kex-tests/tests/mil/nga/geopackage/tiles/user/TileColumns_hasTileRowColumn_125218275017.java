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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class TileColumns_hasTileRowColumn_125218275017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2106;

    public TileColumns_hasTileRowColumn_125218275017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2160 = new ArrayList();
        HashMap term2165 = new HashMap();
        term2106 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term2123 = (Object[]) newArray("java.lang.String", 3);
        setIntField(term2106, term2106.getClass(), "zoomLevelIndex", -478195677);
        setIntField(term2106, term2106.getClass(), "tileColumnIndex", 972867650);
        setIntField(term2106, term2106.getClass(), "tileRowIndex", 1655935355);
        setIntField(term2106, term2106.getClass(), "tileDataIndex", -481533957);
        setField(term2106, term2106.getClass(), "tableName", "xtftXXMbem");
        setElement(term2123, 0, "cudZvLMQon");
        setElement(term2123, 1, "lihXWlGDxk");
        setElement(term2123, 2, "JmcmxoGhIK");
        setField(term2106, term2106.getClass(), "columnNames", term2123);
        setField(term2106, term2106.getClass(), "columns", term2160);
        setBooleanField(term2106, term2106.getClass(), "custom", true);
        setField(term2106, term2106.getClass(), "nameToIndex", term2165);
        setIntField(term2106, term2106.getClass(), "pkIndex", 1240914516);
        setBooleanField(term2106, term2106.getClass(), "pkModifiable", false);
        setBooleanField(term2106, term2106.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTileRowColumn", argTypes, term2106, args);
    }

};


