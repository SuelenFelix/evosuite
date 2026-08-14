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

public class TableMapping_setFromTable_19838902199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8715;

    public TableMapping_setFromTable_19838902199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8741 = new LinkedHashMap();
        HashMap term8748 = new HashMap();
        Set<Object> term8797 =  ((Map) term8748).keySet();
        HashSet term8747 = new HashSet((Collection<? extends Object>) term8797);
        term8715 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term8715, term8715.getClass(), "fromTable", "OcJCIDNIXA");
        setField(term8715, term8715.getClass(), "toTable", "XfRABIFVEp");
        setBooleanField(term8715, term8715.getClass(), "transferContent", true);
        setField(term8715, term8715.getClass(), "columns", term8741);
        setField(term8715, term8715.getClass(), "droppedColumns", term8747);
        setField(term8715, term8715.getClass(), "where", "MHGKyEnwKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "setFromTable", argTypes, term8715, args);
    }

};


