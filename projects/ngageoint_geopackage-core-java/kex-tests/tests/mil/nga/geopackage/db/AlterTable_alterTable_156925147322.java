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

public class AlterTable_alterTable_156925147322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46094;

    public AlterTable_alterTable_156925147322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term46120 = new LinkedHashMap();
        HashMap term46127 = new HashMap();
        Set<Object> term46174 =  ((Map) term46127).keySet();
        HashSet term46126 = new HashSet((Collection<? extends Object>) term46174);
        term46094 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term46094, term46094.getClass(), "fromTable", "MXLsVQWrwc");
        setField(term46094, term46094.getClass(), "toTable", "lRaSlqzqNY");
        setBooleanField(term46094, term46094.getClass(), "transferContent", true);
        setField(term46094, term46094.getClass(), "columns", term46120);
        setField(term46094, term46094.getClass(), "droppedColumns", term46126);
        setField(term46094, term46094.getClass(), "where", "TiEyxWXsra");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.AlterTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "iYwkCLMsbJ";
        args[2] = term46094;
        callMethod(klass, "alterTable", argTypes, null, args);
    }

};


