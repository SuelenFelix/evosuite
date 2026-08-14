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

public class TileColumns_getZoomLevelColumn_163320148910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1311;

    public TileColumns_getZoomLevelColumn_163320148910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1353 = new ArrayList();
        HashMap term1358 = new HashMap();
        term1311 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1328 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term1311, term1311.getClass(), "zoomLevelIndex", -602026508);
        setIntField(term1311, term1311.getClass(), "tileColumnIndex", -157887805);
        setIntField(term1311, term1311.getClass(), "tileRowIndex", 1876565163);
        setIntField(term1311, term1311.getClass(), "tileDataIndex", -817164822);
        setField(term1311, term1311.getClass(), "tableName", "ZzIujlwVsw");
        setElement(term1328, 0, "LWyEaeIyAo");
        setElement(term1328, 1, "yVMkkQhvmN");
        setField(term1311, term1311.getClass(), "columnNames", term1328);
        setField(term1311, term1311.getClass(), "columns", term1353);
        setBooleanField(term1311, term1311.getClass(), "custom", true);
        setField(term1311, term1311.getClass(), "nameToIndex", term1358);
        setIntField(term1311, term1311.getClass(), "pkIndex", -1016503459);
        setBooleanField(term1311, term1311.getClass(), "pkModifiable", false);
        setBooleanField(term1311, term1311.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevelColumn", argTypes, term1311, args);
    }

};


