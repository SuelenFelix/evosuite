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

public class TableMapping_getMappedColumns_157886898020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9715;

    public TableMapping_getMappedColumns_157886898020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9741 = new LinkedHashMap();
        HashMap term9748 = new HashMap();
        Set<Object> term9785 =  ((Map) term9748).keySet();
        HashSet term9747 = new HashSet((Collection<? extends Object>) term9785);
        term9715 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9715, term9715.getClass(), "fromTable", "zaloBqlrSo");
        setField(term9715, term9715.getClass(), "toTable", "vvoLrMGCoN");
        setBooleanField(term9715, term9715.getClass(), "transferContent", true);
        setField(term9715, term9715.getClass(), "columns", term9741);
        setField(term9715, term9715.getClass(), "droppedColumns", term9747);
        setField(term9715, term9715.getClass(), "where", "pXdglvyrQe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMappedColumns", argTypes, term9715, args);
    }

};


