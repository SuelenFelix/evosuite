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

public class TileColumns_setTileRowIndex_45882494016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1925;
     Object term2034;

    public TileColumns_setTileRowIndex_45882494016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2015 = new ArrayList();
        HashMap term2020 = new HashMap();
        term1925 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term1942 = (Object[]) newArray("java.lang.String", 6);
        setIntField(term1925, term1925.getClass(), "zoomLevelIndex", 1265463001);
        setIntField(term1925, term1925.getClass(), "tileColumnIndex", 335112684);
        setIntField(term1925, term1925.getClass(), "tileRowIndex", 1551099402);
        setIntField(term1925, term1925.getClass(), "tileDataIndex", -2027534003);
        setField(term1925, term1925.getClass(), "tableName", "smnHEqRFRx");
        setElement(term1942, 0, "XYtryyobou");
        setElement(term1942, 1, "OYbzXylRWW");
        setElement(term1942, 2, "DSNsTGYXDF");
        setElement(term1942, 3, "sQvGcVjdEx");
        setElement(term1942, 4, "rLHAoqXgPh");
        setElement(term1942, 5, "zUlRdimJtU");
        setField(term1925, term1925.getClass(), "columnNames", term1942);
        setField(term1925, term1925.getClass(), "columns", term2015);
        setBooleanField(term1925, term1925.getClass(), "custom", false);
        setField(term1925, term1925.getClass(), "nameToIndex", term2020);
        setIntField(term1925, term1925.getClass(), "pkIndex", 1063420942);
        setBooleanField(term1925, term1925.getClass(), "pkModifiable", true);
        setBooleanField(term1925, term1925.getClass(), "valueValidation", false);
        term2034 = new Integer(1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2034;
        callMethod(klass, "setTileRowIndex", argTypes, term1925, args);
    }

};


