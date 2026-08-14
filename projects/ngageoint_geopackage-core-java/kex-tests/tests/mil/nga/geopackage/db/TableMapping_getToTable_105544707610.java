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

public class TableMapping_getToTable_105544707610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8818;

    public TableMapping_getToTable_105544707610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term8844 = new LinkedHashMap();
        HashMap term8851 = new HashMap();
        Set<Object> term8888 =  ((Map) term8851).keySet();
        HashSet term8850 = new HashSet((Collection<? extends Object>) term8888);
        term8818 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term8818, term8818.getClass(), "fromTable", "IpQuOGMgmj");
        setField(term8818, term8818.getClass(), "toTable", "pJbnHTYrxn");
        setBooleanField(term8818, term8818.getClass(), "transferContent", true);
        setField(term8818, term8818.getClass(), "columns", term8844);
        setField(term8818, term8818.getClass(), "droppedColumns", term8850);
        setField(term8818, term8818.getClass(), "where", "iIRsCSYqXH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToTable", argTypes, term8818, args);
    }

};


