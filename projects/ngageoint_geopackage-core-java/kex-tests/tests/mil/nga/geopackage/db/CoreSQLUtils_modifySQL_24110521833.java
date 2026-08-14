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

public class CoreSQLUtils_modifySQL_24110521833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2964;

    public CoreSQLUtils_modifySQL_24110521833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2990 = new LinkedHashMap();
        HashMap term2997 = new HashMap();
        Set<Object> term3054 =  ((Map) term2997).keySet();
        HashSet term2996 = new HashSet((Collection<? extends Object>) term3054);
        term2964 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term2964, term2964.getClass(), "fromTable", "whBvTVIIlC");
        setField(term2964, term2964.getClass(), "toTable", "IgRJUzaCwW");
        setBooleanField(term2964, term2964.getClass(), "transferContent", true);
        setField(term2964, term2964.getClass(), "columns", term2990);
        setField(term2964, term2964.getClass(), "droppedColumns", term2996);
        setField(term2964, term2964.getClass(), "where", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.CoreSQLUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.TableMapping");
        Object[] args = new Object[3];
        args[0] = "tPlsykYBqO";
        args[1] = "bLPjGVBhlX";
        args[2] = term2964;
        callMethod(klass, "modifySQL", argTypes, null, args);
    }

};


