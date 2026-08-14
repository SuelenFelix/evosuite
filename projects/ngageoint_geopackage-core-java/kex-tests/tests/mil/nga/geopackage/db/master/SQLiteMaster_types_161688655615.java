package mil.nga.geopackage.db.master;

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
import static mil.nga.geopackage.db.master.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SQLiteMaster_types_161688655615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3559;

    public SQLiteMaster_types_161688655615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3587 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term3586 = ((Class) term3587).getDeclaredField((String) "TABLE");
        ((Field) term3586).setAccessible(true);
        Object enum12 = ((Field) term3586).get((Object) null);
        Class<? extends Object> term3834 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term3833 = ((Class) term3834).getDeclaredField((String) "INDEX");
        ((Field) term3833).setAccessible(true);
        Object enum13 = ((Field) term3833).get((Object) null);
        Class<? extends Object> term4081 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term4080 = ((Class) term4081).getDeclaredField((String) "VIEW");
        ((Field) term4080).setAccessible(true);
        Object enum14 = ((Field) term4080).get((Object) null);
        term3559 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 5);
        setElement(term3559, 0, enum12);
        setElement(term3559, 1, enum13);
        setElement(term3559, 2, enum13);
        setElement(term3559, 3, enum12);
        setElement(term3559, 4, enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3559;
        callMethod(klass, "types", argTypes, null, args);
    }

};


