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

public class TableMapping_isDroppedColumn_171967050725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10186;

    public TableMapping_isDroppedColumn_171967050725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10212 = new LinkedHashMap();
        HashMap term10219 = new HashMap();
        Set<Object> term10268 =  ((Map) term10219).keySet();
        HashSet term10218 = new HashSet((Collection<? extends Object>) term10268);
        term10186 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10186, term10186.getClass(), "fromTable", "EKjQdtKxAM");
        setField(term10186, term10186.getClass(), "toTable", "TXZAIPQJHt");
        setBooleanField(term10186, term10186.getClass(), "transferContent", true);
        setField(term10186, term10186.getClass(), "columns", term10212);
        setField(term10186, term10186.getClass(), "droppedColumns", term10218);
        setField(term10186, term10186.getClass(), "where", "DIbeDHICho");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dJGPlmSRnz";
        callMethod(klass, "isDroppedColumn", argTypes, term10186, args);
    }

};


