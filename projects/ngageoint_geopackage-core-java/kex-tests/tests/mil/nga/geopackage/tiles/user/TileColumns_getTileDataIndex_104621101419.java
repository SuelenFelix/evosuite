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

public class TileColumns_getTileDataIndex_104621101419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2310;

    public TileColumns_getTileDataIndex_104621101419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2400 = new ArrayList();
        HashMap term2405 = new HashMap();
        term2310 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumns"));
        Object[] term2327 = (Object[]) newArray("java.lang.String", 6);
        setIntField(term2310, term2310.getClass(), "zoomLevelIndex", -556405712);
        setIntField(term2310, term2310.getClass(), "tileColumnIndex", -1772434990);
        setIntField(term2310, term2310.getClass(), "tileRowIndex", -1845499264);
        setIntField(term2310, term2310.getClass(), "tileDataIndex", -505439934);
        setField(term2310, term2310.getClass(), "tableName", "ekxGuOYIwi");
        setElement(term2327, 0, "RbVQXSpxXy");
        setElement(term2327, 1, "YpJbIgJWWv");
        setElement(term2327, 2, "JppkknKVOw");
        setElement(term2327, 3, "iljANwuEjk");
        setElement(term2327, 4, "kNqaJKIATy");
        setElement(term2327, 5, "vKQukfbJUd");
        setField(term2310, term2310.getClass(), "columnNames", term2327);
        setField(term2310, term2310.getClass(), "columns", term2400);
        setBooleanField(term2310, term2310.getClass(), "custom", true);
        setField(term2310, term2310.getClass(), "nameToIndex", term2405);
        setIntField(term2310, term2310.getClass(), "pkIndex", -344842608);
        setBooleanField(term2310, term2310.getClass(), "pkModifiable", true);
        setBooleanField(term2310, term2310.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileDataIndex", argTypes, term2310, args);
    }

};


