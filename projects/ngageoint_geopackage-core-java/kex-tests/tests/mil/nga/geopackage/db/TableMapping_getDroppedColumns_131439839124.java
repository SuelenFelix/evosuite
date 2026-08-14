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

public class TableMapping_getDroppedColumns_131439839124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10105;

    public TableMapping_getDroppedColumns_131439839124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10131 = new LinkedHashMap();
        HashMap term10138 = new HashMap();
        Set<Object> term10175 =  ((Map) term10138).keySet();
        HashSet term10137 = new HashSet((Collection<? extends Object>) term10175);
        term10105 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10105, term10105.getClass(), "fromTable", "oPxuZbkYio");
        setField(term10105, term10105.getClass(), "toTable", "vKitydDVnM");
        setBooleanField(term10105, term10105.getClass(), "transferContent", true);
        setField(term10105, term10105.getClass(), "columns", term10131);
        setField(term10105, term10105.getClass(), "droppedColumns", term10137);
        setField(term10105, term10105.getClass(), "where", "urCiQnUFBM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDroppedColumns", argTypes, term10105, args);
    }

};


