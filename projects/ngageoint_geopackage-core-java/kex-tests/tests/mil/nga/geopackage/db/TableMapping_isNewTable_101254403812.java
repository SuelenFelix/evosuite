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

public class TableMapping_isNewTable_101254403812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9002;

    public TableMapping_isNewTable_101254403812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9028 = new LinkedHashMap();
        HashMap term9035 = new HashMap();
        Set<Object> term9072 =  ((Map) term9035).keySet();
        HashSet term9034 = new HashSet((Collection<? extends Object>) term9072);
        term9002 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9002, term9002.getClass(), "fromTable", "UKAReurpHG");
        setField(term9002, term9002.getClass(), "toTable", "WVRMUmrljA");
        setBooleanField(term9002, term9002.getClass(), "transferContent", true);
        setField(term9002, term9002.getClass(), "columns", term9028);
        setField(term9002, term9002.getClass(), "droppedColumns", term9034);
        setField(term9002, term9002.getClass(), "where", "NTlKJDDWlk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewTable", argTypes, term9002, args);
    }

};


