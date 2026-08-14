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

public class TileColumns_getTileColumnColumn_143671060814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743;

    public TileColumns_getTileColumnColumn_143671060814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1773 = new ArrayList();
        HashMap term1778 = new HashMap();
        term1743 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1760 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term1743, term1743.getClass(), "zoomLevelIndex", -2095575670);
        setIntField(term1743, term1743.getClass(), "tileColumnIndex", 1225272962);
        setIntField(term1743, term1743.getClass(), "tileRowIndex", 1324040357);
        setIntField(term1743, term1743.getClass(), "tileDataIndex", -1588772968);
        setField(term1743, term1743.getClass(), "tableName", "HWkpTmtlrc");
        setElement(term1760, 0, "hMmaoREuCK");
        setField(term1743, term1743.getClass(), "columnNames", term1760);
        setField(term1743, term1743.getClass(), "columns", term1773);
        setBooleanField(term1743, term1743.getClass(), "custom", false);
        setField(term1743, term1743.getClass(), "nameToIndex", term1778);
        setIntField(term1743, term1743.getClass(), "pkIndex", -93135961);
        setBooleanField(term1743, term1743.getClass(), "pkModifiable", true);
        setBooleanField(term1743, term1743.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnColumn", argTypes, term1743, args);
    }

};


