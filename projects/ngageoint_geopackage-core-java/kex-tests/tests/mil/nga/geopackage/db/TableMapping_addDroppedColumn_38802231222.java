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

public class TableMapping_addDroppedColumn_38802231222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9899;

    public TableMapping_addDroppedColumn_38802231222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9925 = new LinkedHashMap();
        HashMap term9932 = new HashMap();
        Set<Object> term9981 =  ((Map) term9932).keySet();
        HashSet term9931 = new HashSet((Collection<? extends Object>) term9981);
        term9899 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9899, term9899.getClass(), "fromTable", "FjOiNAfBOc");
        setField(term9899, term9899.getClass(), "toTable", "iCCsaLHohG");
        setBooleanField(term9899, term9899.getClass(), "transferContent", true);
        setField(term9899, term9899.getClass(), "columns", term9925);
        setField(term9899, term9899.getClass(), "droppedColumns", term9931);
        setField(term9899, term9899.getClass(), "where", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MYWYUeLGOp";
        callMethod(klass, "addDroppedColumn", argTypes, term9899, args);
    }

};


