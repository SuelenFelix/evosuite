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
import java.lang.Integer;

public class TileColumns_setZoomLevelIndex_16620983838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;
     Object term1132;

    public TileColumns_setZoomLevelIndex_16620983838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1113 = new ArrayList();
        HashMap term1118 = new HashMap();
        term1083 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1100 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term1083, term1083.getClass(), "zoomLevelIndex", -1179120542);
        setIntField(term1083, term1083.getClass(), "tileColumnIndex", -73683645);
        setIntField(term1083, term1083.getClass(), "tileRowIndex", -226514366);
        setIntField(term1083, term1083.getClass(), "tileDataIndex", 1193880199);
        setField(term1083, term1083.getClass(), "tableName", "SdCKLMIYnX");
        setElement(term1100, 0, "OJJtVNPyKZ");
        setField(term1083, term1083.getClass(), "columnNames", term1100);
        setField(term1083, term1083.getClass(), "columns", term1113);
        setBooleanField(term1083, term1083.getClass(), "custom", true);
        setField(term1083, term1083.getClass(), "nameToIndex", term1118);
        setIntField(term1083, term1083.getClass(), "pkIndex", -1087774327);
        setBooleanField(term1083, term1083.getClass(), "pkModifiable", false);
        setBooleanField(term1083, term1083.getClass(), "valueValidation", false);
        term1132 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1132;
        callMethod(klass, "setZoomLevelIndex", argTypes, term1083, args);
    }

};


