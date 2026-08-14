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
import java.lang.Boolean;

public class TableMapping_setTransferContent_54581810814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9164;
     Object term9214;

    public TableMapping_setTransferContent_54581810814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term9190 = new LinkedHashMap();
        HashMap term9197 = new HashMap();
        Set<Object> term9236 =  ((Map) term9197).keySet();
        HashSet term9196 = new HashSet((Collection<? extends Object>) term9236);
        term9164 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term9164, term9164.getClass(), "fromTable", "bxrCBbrrct");
        setField(term9164, term9164.getClass(), "toTable", "CKWpJaaaxX");
        setBooleanField(term9164, term9164.getClass(), "transferContent", true);
        setField(term9164, term9164.getClass(), "columns", term9190);
        setField(term9164, term9164.getClass(), "droppedColumns", term9196);
        setField(term9164, term9164.getClass(), "where", "UBRmXJmfrt");
        term9214 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9214;
        callMethod(klass, "setTransferContent", argTypes, term9164, args);
    }

};


