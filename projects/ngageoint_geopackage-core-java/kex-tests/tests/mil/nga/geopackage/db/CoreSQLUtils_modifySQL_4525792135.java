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

public class CoreSQLUtils_modifySQL_4525792135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3202;

    public CoreSQLUtils_modifySQL_4525792135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3228 = new LinkedHashMap();
        HashMap term3235 = new HashMap();
        Set<Object> term3282 =  ((Map) term3235).keySet();
        HashSet term3234 = new HashSet((Collection<? extends Object>) term3282);
        term3202 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term3202, term3202.getClass(), "fromTable", "wGmYcqUkgE");
        setField(term3202, term3202.getClass(), "toTable", "idgaQsnJpQ");
        setBooleanField(term3202, term3202.getClass(), "transferContent", true);
        setField(term3202, term3202.getClass(), "columns", term3228);
        setField(term3202, term3202.getClass(), "droppedColumns", term3234);
        setField(term3202, term3202.getClass(), "where", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[2];
        args[0] = "OWKQODBLzb";
        args[1] = term3202;
        callMethod(klass, "modifySQL", argTypes, null, args);
    }

};


