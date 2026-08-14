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

public class CoreSQLUtils_transferTableContent_18291878028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2620;

    public CoreSQLUtils_transferTableContent_18291878028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2646 = new LinkedHashMap();
        HashMap term2653 = new HashMap();
        Set<Object> term2690 =  ((Map) term2653).keySet();
        HashSet term2652 = new HashSet((Collection<? extends Object>) term2690);
        term2620 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term2620, term2620.getClass(), "fromTable", "YRHGsAkhxb");
        setField(term2620, term2620.getClass(), "toTable", "ffYhPOzlUs");
        setBooleanField(term2620, term2620.getClass(), "transferContent", true);
        setField(term2620, term2620.getClass(), "columns", term2646);
        setField(term2620, term2620.getClass(), "droppedColumns", term2652);
        setField(term2620, term2620.getClass(), "where", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2620;
        callMethod(klass, "transferTableContent", argTypes, null, args);
    }

};


