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

public class TableMapping_isTransferContent_113485338213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9083;

    public TableMapping_isTransferContent_113485338213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9109 = new LinkedHashMap();
        HashMap term9116 = new HashMap();
        Set<Object> term9153 =  ((Map) term9116).keySet();
        HashSet term9115 = new HashSet((Collection<? extends Object>) term9153);
        term9083 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9083, term9083.getClass(), "fromTable", "vOuMEpOQAg");
        setField(term9083, term9083.getClass(), "toTable", "SIODFGaQhr");
        setBooleanField(term9083, term9083.getClass(), "transferContent", true);
        setField(term9083, term9083.getClass(), "columns", term9109);
        setField(term9083, term9083.getClass(), "droppedColumns", term9115);
        setField(term9083, term9083.getClass(), "where", "qYzsiuXOgS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTransferContent", argTypes, term9083, args);
    }

};


