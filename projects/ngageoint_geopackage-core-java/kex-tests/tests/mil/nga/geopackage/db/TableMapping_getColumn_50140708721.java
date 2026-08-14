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

public class TableMapping_getColumn_50140708721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9796;

    public TableMapping_getColumn_50140708721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9822 = new LinkedHashMap();
        HashMap term9829 = new HashMap();
        Set<Object> term9878 =  ((Map) term9829).keySet();
        HashSet term9828 = new HashSet((Collection<? extends Object>) term9878);
        term9796 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9796, term9796.getClass(), "fromTable", "OcfNzHYdki");
        setField(term9796, term9796.getClass(), "toTable", "uPuCVuZYOI");
        setBooleanField(term9796, term9796.getClass(), "transferContent", true);
        setField(term9796, term9796.getClass(), "columns", term9822);
        setField(term9796, term9796.getClass(), "droppedColumns", term9828);
        setField(term9796, term9796.getClass(), "where", "TweMFhxNdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NBrvVzvQHe";
        callMethod(klass, "getColumn", argTypes, term9796, args);
    }

};


