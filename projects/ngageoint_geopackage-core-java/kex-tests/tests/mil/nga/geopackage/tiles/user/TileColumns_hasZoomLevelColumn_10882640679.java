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

public class TileColumns_hasZoomLevelColumn_10882640679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1154;

    public TileColumns_hasZoomLevelColumn_10882640679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1232 = new ArrayList();
        HashMap term1237 = new HashMap();
        term1154 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1171 = (Object[]) newArray("java.lang.String", 5);
        setIntField(term1154, term1154.getClass(), "zoomLevelIndex", -469968304);
        setIntField(term1154, term1154.getClass(), "tileColumnIndex", -1145578966);
        setIntField(term1154, term1154.getClass(), "tileRowIndex", 679763016);
        setIntField(term1154, term1154.getClass(), "tileDataIndex", 1962444399);
        setField(term1154, term1154.getClass(), "tableName", "xJgPlLxpgC");
        setElement(term1171, 0, "EYtfuJaxiM");
        setElement(term1171, 1, "gCWtLVKVVe");
        setElement(term1171, 2, "fWKJoSoCwE");
        setElement(term1171, 3, "wfaXBpWAUH");
        setElement(term1171, 4, "VMeAzAHwZj");
        setField(term1154, term1154.getClass(), "columnNames", term1171);
        setField(term1154, term1154.getClass(), "columns", term1232);
        setBooleanField(term1154, term1154.getClass(), "custom", false);
        setField(term1154, term1154.getClass(), "nameToIndex", term1237);
        setIntField(term1154, term1154.getClass(), "pkIndex", 767834723);
        setBooleanField(term1154, term1154.getClass(), "pkModifiable", false);
        setBooleanField(term1154, term1154.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasZoomLevelColumn", argTypes, term1154, args);
    }

};


