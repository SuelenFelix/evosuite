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

public class TableMapping_getColumns_101782180319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9634;

    public TableMapping_getColumns_101782180319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9660 = new LinkedHashMap();
        HashMap term9667 = new HashMap();
        Set<Object> term9704 =  ((Map) term9667).keySet();
        HashSet term9666 = new HashSet((Collection<? extends Object>) term9704);
        term9634 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9634, term9634.getClass(), "fromTable", "ywmcuThdfL");
        setField(term9634, term9634.getClass(), "toTable", "GBOEuByOfr");
        setBooleanField(term9634, term9634.getClass(), "transferContent", true);
        setField(term9634, term9634.getClass(), "columns", term9660);
        setField(term9634, term9634.getClass(), "droppedColumns", term9666);
        setField(term9634, term9634.getClass(), "where", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumns", argTypes, term9634, args);
    }

};


