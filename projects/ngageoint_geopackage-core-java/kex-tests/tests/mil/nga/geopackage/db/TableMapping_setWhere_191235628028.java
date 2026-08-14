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

public class TableMapping_setWhere_191235628028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10451;

    public TableMapping_setWhere_191235628028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10477 = new LinkedHashMap();
        HashMap term10484 = new HashMap();
        Set<Object> term10533 =  ((Map) term10484).keySet();
        HashSet term10483 = new HashSet((Collection<? extends Object>) term10533);
        term10451 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10451, term10451.getClass(), "fromTable", "EdPAvpluZg");
        setField(term10451, term10451.getClass(), "toTable", "DzHVBMqWtE");
        setBooleanField(term10451, term10451.getClass(), "transferContent", true);
        setField(term10451, term10451.getClass(), "columns", term10477);
        setField(term10451, term10451.getClass(), "droppedColumns", term10483);
        setField(term10451, term10451.getClass(), "where", "THZSpzBRYP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfBIVGBQOE";
        callMethod(klass, "setWhere", argTypes, term10451, args);
    }

};


