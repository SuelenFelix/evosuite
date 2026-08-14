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

public class TableMapping_hasWhere_111970551926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10289;

    public TableMapping_hasWhere_111970551926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10315 = new LinkedHashMap();
        HashMap term10322 = new HashMap();
        Set<Object> term10359 =  ((Map) term10322).keySet();
        HashSet term10321 = new HashSet((Collection<? extends Object>) term10359);
        term10289 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10289, term10289.getClass(), "fromTable", "DPskuFUobI");
        setField(term10289, term10289.getClass(), "toTable", "wBGfLpNNiZ");
        setBooleanField(term10289, term10289.getClass(), "transferContent", true);
        setField(term10289, term10289.getClass(), "columns", term10315);
        setField(term10289, term10289.getClass(), "droppedColumns", term10321);
        setField(term10289, term10289.getClass(), "where", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasWhere", argTypes, term10289, args);
    }

};


