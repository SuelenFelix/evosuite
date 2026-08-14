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

public class TileColumns_updateColumns_5822274546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;

    public TileColumns_updateColumns_5822274546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term815 = new ArrayList();
        HashMap term820 = new HashMap();
        term725 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term742 = (Object[]) newArray("java.lang.String", 6);
        setIntField(term725, term725.getClass(), "zoomLevelIndex", -6029667);
        setIntField(term725, term725.getClass(), "tileColumnIndex", -2068769794);
        setIntField(term725, term725.getClass(), "tileRowIndex", -117576464);
        setIntField(term725, term725.getClass(), "tileDataIndex", -1007160944);
        setField(term725, term725.getClass(), "tableName", "RYdKCNNMBR");
        setElement(term742, 0, "yGtHPyvYiQ");
        setElement(term742, 1, "MvRIxilFMJ");
        setElement(term742, 2, "iNwOJRBEjp");
        setElement(term742, 3, "XylxrMBraH");
        setElement(term742, 4, "pORebkoRdD");
        setElement(term742, 5, "mXGCWJDOqA");
        setField(term725, term725.getClass(), "columnNames", term742);
        setField(term725, term725.getClass(), "columns", term815);
        setBooleanField(term725, term725.getClass(), "custom", false);
        setField(term725, term725.getClass(), "nameToIndex", term820);
        setIntField(term725, term725.getClass(), "pkIndex", 1135664017);
        setBooleanField(term725, term725.getClass(), "pkModifiable", true);
        setBooleanField(term725, term725.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term725, args);
    }

};


