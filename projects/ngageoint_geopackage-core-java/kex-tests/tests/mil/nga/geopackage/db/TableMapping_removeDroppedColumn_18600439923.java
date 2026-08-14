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

public class TableMapping_removeDroppedColumn_18600439923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10002;

    public TableMapping_removeDroppedColumn_18600439923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10028 = new LinkedHashMap();
        HashMap term10035 = new HashMap();
        Set<Object> term10084 =  ((Map) term10035).keySet();
        HashSet term10034 = new HashSet((Collection<? extends Object>) term10084);
        term10002 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10002, term10002.getClass(), "fromTable", "tsTGdgQYUL");
        setField(term10002, term10002.getClass(), "toTable", "TtGbVmKcnX");
        setBooleanField(term10002, term10002.getClass(), "transferContent", true);
        setField(term10002, term10002.getClass(), "columns", term10028);
        setField(term10002, term10002.getClass(), "droppedColumns", term10034);
        setField(term10002, term10002.getClass(), "where", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNdorvdUgu";
        callMethod(klass, "removeDroppedColumn", argTypes, term10002, args);
    }

};


