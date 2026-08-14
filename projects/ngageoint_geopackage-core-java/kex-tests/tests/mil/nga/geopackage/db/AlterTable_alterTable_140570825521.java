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

public class AlterTable_alterTable_140570825521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46001;

    public AlterTable_alterTable_140570825521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term46027 = new LinkedHashMap();
        HashMap term46034 = new HashMap();
        Set<Object> term46071 =  ((Map) term46034).keySet();
        HashSet term46033 = new HashSet((Collection<? extends Object>) term46071);
        term46001 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term46001, term46001.getClass(), "fromTable", "RZaKVKWtND");
        setField(term46001, term46001.getClass(), "toTable", "vXiaNiquft");
        setBooleanField(term46001, term46001.getClass(), "transferContent", true);
        setField(term46001, term46001.getClass(), "columns", term46027);
        setField(term46001, term46001.getClass(), "droppedColumns", term46033);
        setField(term46001, term46001.getClass(), "where", "lucCeiVnYe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.AlterTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("mil.nga.geopackage.user.UserTable");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term46001;
        callMethod(klass, "alterTable", argTypes, null, args);
    }

};


