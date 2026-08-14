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

public class TileColumns_getTileRowColumn_122186914018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2219;

    public TileColumns_getTileRowColumn_122186914018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2261 = new ArrayList();
        HashMap term2266 = new HashMap();
        term2219 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term2236 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term2219, term2219.getClass(), "zoomLevelIndex", -1465035361);
        setIntField(term2219, term2219.getClass(), "tileColumnIndex", 1090617576);
        setIntField(term2219, term2219.getClass(), "tileRowIndex", -1547384488);
        setIntField(term2219, term2219.getClass(), "tileDataIndex", 1442160736);
        setField(term2219, term2219.getClass(), "tableName", "igCAtimmYB");
        setElement(term2236, 0, "DyiXbeYIaN");
        setElement(term2236, 1, "VGizxZnyHX");
        setField(term2219, term2219.getClass(), "columnNames", term2236);
        setField(term2219, term2219.getClass(), "columns", term2261);
        setBooleanField(term2219, term2219.getClass(), "custom", false);
        setField(term2219, term2219.getClass(), "nameToIndex", term2266);
        setIntField(term2219, term2219.getClass(), "pkIndex", 1114000454);
        setBooleanField(term2219, term2219.getClass(), "pkModifiable", false);
        setBooleanField(term2219, term2219.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileRowColumn", argTypes, term2219, args);
    }

};


