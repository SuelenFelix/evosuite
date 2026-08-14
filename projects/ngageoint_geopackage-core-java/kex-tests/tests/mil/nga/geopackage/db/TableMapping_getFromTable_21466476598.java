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

public class TableMapping_getFromTable_21466476598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8634;

    public TableMapping_getFromTable_21466476598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8660 = new LinkedHashMap();
        HashMap term8667 = new HashMap();
        Set<Object> term8704 =  ((Map) term8667).keySet();
        HashSet term8666 = new HashSet((Collection<? extends Object>) term8704);
        term8634 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term8634, term8634.getClass(), "fromTable", "xvkbvaEGYd");
        setField(term8634, term8634.getClass(), "toTable", "HBGNxdNURv");
        setBooleanField(term8634, term8634.getClass(), "transferContent", true);
        setField(term8634, term8634.getClass(), "columns", term8660);
        setField(term8634, term8634.getClass(), "droppedColumns", term8666);
        setField(term8634, term8634.getClass(), "where", "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromTable", argTypes, term8634, args);
    }

};


