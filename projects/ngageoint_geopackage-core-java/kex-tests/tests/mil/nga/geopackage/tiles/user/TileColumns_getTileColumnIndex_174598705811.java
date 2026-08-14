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

public class TileColumns_getTileColumnIndex_174598705811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1402;

    public TileColumns_getTileColumnIndex_174598705811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1432 = new ArrayList();
        HashMap term1437 = new HashMap();
        term1402 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1419 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term1402, term1402.getClass(), "zoomLevelIndex", -1968847291);
        setIntField(term1402, term1402.getClass(), "tileColumnIndex", 579005622);
        setIntField(term1402, term1402.getClass(), "tileRowIndex", -14890619);
        setIntField(term1402, term1402.getClass(), "tileDataIndex", 1632125673);
        setField(term1402, term1402.getClass(), "tableName", "pXOkjyeIRb");
        setElement(term1419, 0, "GgZWSjxjyE");
        setField(term1402, term1402.getClass(), "columnNames", term1419);
        setField(term1402, term1402.getClass(), "columns", term1432);
        setBooleanField(term1402, term1402.getClass(), "custom", true);
        setField(term1402, term1402.getClass(), "nameToIndex", term1437);
        setIntField(term1402, term1402.getClass(), "pkIndex", 454281060);
        setBooleanField(term1402, term1402.getClass(), "pkModifiable", true);
        setBooleanField(term1402, term1402.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnIndex", argTypes, term1402, args);
    }

};


