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

public class TileColumns_setTileColumnIndex_194168408812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1471;
     Object term1532;

    public TileColumns_setTileColumnIndex_194168408812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1513 = new ArrayList();
        HashMap term1518 = new HashMap();
        term1471 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1488 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term1471, term1471.getClass(), "zoomLevelIndex", -1786399638);
        setIntField(term1471, term1471.getClass(), "tileColumnIndex", 2055867847);
        setIntField(term1471, term1471.getClass(), "tileRowIndex", -1048298087);
        setIntField(term1471, term1471.getClass(), "tileDataIndex", 292681826);
        setField(term1471, term1471.getClass(), "tableName", "UfQtPRyWRC");
        setElement(term1488, 0, "FPvxVzzSvD");
        setElement(term1488, 1, "WHcwFgsGFC");
        setField(term1471, term1471.getClass(), "columnNames", term1488);
        setField(term1471, term1471.getClass(), "columns", term1513);
        setBooleanField(term1471, term1471.getClass(), "custom", false);
        setField(term1471, term1471.getClass(), "nameToIndex", term1518);
        setIntField(term1471, term1471.getClass(), "pkIndex", 458147407);
        setBooleanField(term1471, term1471.getClass(), "pkModifiable", false);
        setBooleanField(term1471, term1471.getClass(), "valueValidation", false);
        term1532 = new Integer(-184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1532;
        callMethod(klass, "setTileColumnIndex", argTypes, term1471, args);
    }

};


