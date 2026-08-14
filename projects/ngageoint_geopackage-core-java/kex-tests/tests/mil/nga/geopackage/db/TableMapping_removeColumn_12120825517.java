package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TableMapping_removeColumn_12120825517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9450;

    public TableMapping_removeColumn_12120825517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9476 = new LinkedHashMap();
        HashMap term9483 = new HashMap();
        Set<Object> term9532 =  ((Map) term9483).keySet();
        HashSet term9482 = new HashSet((Collection<? extends Object>) term9532);
        term9450 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9450, term9450.getClass(), "fromTable", "uSUvKAyuvd");
        setField(term9450, term9450.getClass(), "toTable", "onQLVONGuf");
        setBooleanField(term9450, term9450.getClass(), "transferContent", true);
        setField(term9450, term9450.getClass(), "columns", term9476);
        setField(term9450, term9450.getClass(), "droppedColumns", term9482);
        setField(term9450, term9450.getClass(), "where", "SOrEHbcbmn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        callMethod(klass, "removeColumn", argTypes, term9450, args);
    }

};


