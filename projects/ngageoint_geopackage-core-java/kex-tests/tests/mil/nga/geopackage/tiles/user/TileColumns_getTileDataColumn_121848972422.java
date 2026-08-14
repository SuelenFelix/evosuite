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

public class TileColumns_getTileDataColumn_121848972422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2805;

    public TileColumns_getTileDataColumn_121848972422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2835 = new ArrayList();
        HashMap term2840 = new HashMap();
        term2805 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term2822 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term2805, term2805.getClass(), "zoomLevelIndex", -1210583429);
        setIntField(term2805, term2805.getClass(), "tileColumnIndex", -663691365);
        setIntField(term2805, term2805.getClass(), "tileRowIndex", 339854490);
        setIntField(term2805, term2805.getClass(), "tileDataIndex", -615654495);
        setField(term2805, term2805.getClass(), "tableName", "vGiuZVPJNH");
        setElement(term2822, 0, "tlzpzIjMib");
        setField(term2805, term2805.getClass(), "columnNames", term2822);
        setField(term2805, term2805.getClass(), "columns", term2835);
        setBooleanField(term2805, term2805.getClass(), "custom", false);
        setField(term2805, term2805.getClass(), "nameToIndex", term2840);
        setIntField(term2805, term2805.getClass(), "pkIndex", -1476117762);
        setBooleanField(term2805, term2805.getClass(), "pkModifiable", true);
        setBooleanField(term2805, term2805.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileDataColumn", argTypes, term2805, args);
    }

};


