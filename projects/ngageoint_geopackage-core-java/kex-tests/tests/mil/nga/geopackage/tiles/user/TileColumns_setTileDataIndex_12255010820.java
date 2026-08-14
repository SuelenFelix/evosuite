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

public class TileColumns_setTileDataIndex_12255010820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2489;
     Object term2586;

    public TileColumns_setTileDataIndex_12255010820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2567 = new ArrayList();
        HashMap term2572 = new HashMap();
        term2489 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term2506 = (Object[]) newArray("java.lang.String", 5);
        setIntField(term2489, term2489.getClass(), "zoomLevelIndex", 941650513);
        setIntField(term2489, term2489.getClass(), "tileColumnIndex", 444029505);
        setIntField(term2489, term2489.getClass(), "tileRowIndex", -1034506028);
        setIntField(term2489, term2489.getClass(), "tileDataIndex", -1263114719);
        setField(term2489, term2489.getClass(), "tableName", "sZdUNdggUW");
        setElement(term2506, 0, "OqbwYQfvAe");
        setElement(term2506, 1, "tRxZafjqIx");
        setElement(term2506, 2, "DhjNLmRMCu");
        setElement(term2506, 3, "PgPzMSEjjX");
        setElement(term2506, 4, "wzsPSPcRdj");
        setField(term2489, term2489.getClass(), "columnNames", term2506);
        setField(term2489, term2489.getClass(), "columns", term2567);
        setBooleanField(term2489, term2489.getClass(), "custom", true);
        setField(term2489, term2489.getClass(), "nameToIndex", term2572);
        setIntField(term2489, term2489.getClass(), "pkIndex", -894662986);
        setBooleanField(term2489, term2489.getClass(), "pkModifiable", false);
        setBooleanField(term2489, term2489.getClass(), "valueValidation", false);
        term2586 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2586;
        callMethod(klass, "setTileDataIndex", argTypes, term2489, args);
    }

};


