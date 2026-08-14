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

public class TableMapping_getWhere_195894260027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10370;

    public TableMapping_getWhere_195894260027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10396 = new LinkedHashMap();
        HashMap term10403 = new HashMap();
        Set<Object> term10440 =  ((Map) term10403).keySet();
        HashSet term10402 = new HashSet((Collection<? extends Object>) term10440);
        term10370 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10370, term10370.getClass(), "fromTable", "PXdVZyoJyC");
        setField(term10370, term10370.getClass(), "toTable", "vLerpqavFM");
        setBooleanField(term10370, term10370.getClass(), "transferContent", true);
        setField(term10370, term10370.getClass(), "columns", term10396);
        setField(term10370, term10370.getClass(), "droppedColumns", term10402);
        setField(term10370, term10370.getClass(), "where", "qnvxzwuGKX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhere", argTypes, term10370, args);
    }

};


