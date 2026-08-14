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

public class CoreSQLUtils_modifySQL_141690058734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3089;

    public CoreSQLUtils_modifySQL_141690058734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3115 = new LinkedHashMap();
        HashMap term3122 = new HashMap();
        Set<Object> term3179 =  ((Map) term3122).keySet();
        HashSet term3121 = new HashSet((Collection<? extends Object>) term3179);
        term3089 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term3089, term3089.getClass(), "fromTable", "MAcUBcBckh");
        setField(term3089, term3089.getClass(), "toTable", "oVgzLbrsFr");
        setBooleanField(term3089, term3089.getClass(), "transferContent", true);
        setField(term3089, term3089.getClass(), "columns", term3115);
        setField(term3089, term3089.getClass(), "droppedColumns", term3121);
        setField(term3089, term3089.getClass(), "where", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "KoyGrUJeJW";
        args[2] = "HqBOwkVqjD";
        args[3] = term3089;
        callMethod(klass, "modifySQL", argTypes, null, args);
    }

};


