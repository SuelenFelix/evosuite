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

public class CoreSQLUtils_transferTableContentSQL_8534316629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2701;

    public CoreSQLUtils_transferTableContentSQL_8534316629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2727 = new LinkedHashMap();
        HashMap term2734 = new HashMap();
        Set<Object> term2771 =  ((Map) term2734).keySet();
        HashSet term2733 = new HashSet((Collection<? extends Object>) term2771);
        term2701 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term2701, term2701.getClass(), "fromTable", "ytSBIKXogI");
        setField(term2701, term2701.getClass(), "toTable", "nHXjMycHlU");
        setBooleanField(term2701, term2701.getClass(), "transferContent", true);
        setField(term2701, term2701.getClass(), "columns", term2727);
        setField(term2701, term2701.getClass(), "droppedColumns", term2733);
        setField(term2701, term2701.getClass(), "where", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[1];
        args[0] = term2701;
        callMethod(klass, "transferTableContentSQL", argTypes, null, args);
    }

};


