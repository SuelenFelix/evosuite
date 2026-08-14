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

public class TileColumns_getTileRowIndex_47770062615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1812;

    public TileColumns_getTileRowIndex_47770062615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1866 = new ArrayList();
        HashMap term1871 = new HashMap();
        term1812 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1829 = (Object[]) newArray("java.lang.String", 3);
        setIntField(term1812, term1812.getClass(), "zoomLevelIndex", -112921587);
        setIntField(term1812, term1812.getClass(), "tileColumnIndex", 933028652);
        setIntField(term1812, term1812.getClass(), "tileRowIndex", 287287233);
        setIntField(term1812, term1812.getClass(), "tileDataIndex", 962840079);
        setField(term1812, term1812.getClass(), "tableName", "aWYOWZFyaX");
        setElement(term1829, 0, "BRIVNtfUWU");
        setElement(term1829, 1, "DbiCVtPPCT");
        setElement(term1829, 2, "WzFopsaDuG");
        setField(term1812, term1812.getClass(), "columnNames", term1829);
        setField(term1812, term1812.getClass(), "columns", term1866);
        setBooleanField(term1812, term1812.getClass(), "custom", false);
        setField(term1812, term1812.getClass(), "nameToIndex", term1871);
        setIntField(term1812, term1812.getClass(), "pkIndex", 1540719661);
        setBooleanField(term1812, term1812.getClass(), "pkModifiable", true);
        setBooleanField(term1812, term1812.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileRowIndex", argTypes, term1812, args);
    }

};


