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

public class TileColumns_getZoomLevelIndex_10927683077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904;

    public TileColumns_getZoomLevelIndex_10927683077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term994 = new ArrayList();
        HashMap term999 = new HashMap();
        term904 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term921 = (Object[]) newArray("java.lang.String", 6);
        setIntField(term904, term904.getClass(), "zoomLevelIndex", 590364439);
        setIntField(term904, term904.getClass(), "tileColumnIndex", 865208305);
        setIntField(term904, term904.getClass(), "tileRowIndex", -1275173084);
        setIntField(term904, term904.getClass(), "tileDataIndex", -244121226);
        setField(term904, term904.getClass(), "tableName", "hCWPJQKpdc");
        setElement(term921, 0, "WzMEhMXkKx");
        setElement(term921, 1, "XOiDvlDhdc");
        setElement(term921, 2, "AdxvLJhNLe");
        setElement(term921, 3, "lHfTrWKMPk");
        setElement(term921, 4, "JDaAnsVTGV");
        setElement(term921, 5, "mLUZFTfjle");
        setField(term904, term904.getClass(), "columnNames", term921);
        setField(term904, term904.getClass(), "columns", term994);
        setBooleanField(term904, term904.getClass(), "custom", true);
        setField(term904, term904.getClass(), "nameToIndex", term999);
        setIntField(term904, term904.getClass(), "pkIndex", -203030934);
        setBooleanField(term904, term904.getClass(), "pkModifiable", false);
        setBooleanField(term904, term904.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevelIndex", argTypes, term904, args);
    }

};


