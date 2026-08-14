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

public class TableMapping_addColumn_32300004216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9347;

    public TableMapping_addColumn_32300004216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9373 = new LinkedHashMap();
        HashMap term9380 = new HashMap();
        Set<Object> term9429 =  ((Map) term9380).keySet();
        HashSet term9379 = new HashSet((Collection<? extends Object>) term9429);
        term9347 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9347, term9347.getClass(), "fromTable", "ZKMLioamsY");
        setField(term9347, term9347.getClass(), "toTable", "WVbxuoDBcn");
        setBooleanField(term9347, term9347.getClass(), "transferContent", true);
        setField(term9347, term9347.getClass(), "columns", term9373);
        setField(term9347, term9347.getClass(), "droppedColumns", term9379);
        setField(term9347, term9347.getClass(), "where", "pvDEABOxLt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beAMpkroCQ";
        callMethod(klass, "addColumn", argTypes, term9347, args);
    }

};


