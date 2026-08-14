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

public class TileColumns_hasTileDataColumn_35591238221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648;

    public TileColumns_hasTileDataColumn_35591238221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2726 = new ArrayList();
        HashMap term2731 = new HashMap();
        term2648 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term2665 = (Object[]) newArray("java.lang.String", 5);
        setIntField(term2648, term2648.getClass(), "zoomLevelIndex", -1347665717);
        setIntField(term2648, term2648.getClass(), "tileColumnIndex", -1888585309);
        setIntField(term2648, term2648.getClass(), "tileRowIndex", 683666002);
        setIntField(term2648, term2648.getClass(), "tileDataIndex", 1596213415);
        setField(term2648, term2648.getClass(), "tableName", "XJJNClzHRf");
        setElement(term2665, 0, "HDaezxQfQR");
        setElement(term2665, 1, "iikZEapDlu");
        setElement(term2665, 2, "nhoHrZfnIN");
        setElement(term2665, 3, "ZkMALXpEAZ");
        setElement(term2665, 4, "tXfQjSqDzN");
        setField(term2648, term2648.getClass(), "columnNames", term2665);
        setField(term2648, term2648.getClass(), "columns", term2726);
        setBooleanField(term2648, term2648.getClass(), "custom", true);
        setField(term2648, term2648.getClass(), "nameToIndex", term2731);
        setIntField(term2648, term2648.getClass(), "pkIndex", -268815336);
        setBooleanField(term2648, term2648.getClass(), "pkModifiable", true);
        setBooleanField(term2648, term2648.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTileDataColumn", argTypes, term2648, args);
    }

};


