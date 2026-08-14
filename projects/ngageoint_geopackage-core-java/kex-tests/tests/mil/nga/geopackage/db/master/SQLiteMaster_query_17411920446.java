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
import java.util.ArrayList;

public class SQLiteMaster_query_17411920446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11626;
     Object term11635;

    public SQLiteMaster_query_17411920446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11837 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term11836 = ((Class) term11837).getDeclaredField((String) "TYPE");
        ((Field) term11836).setAccessible(true);
        Object enum40 = ((Field) term11836).get((Object) null);
        term11626 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 1);
        setElement(term11626, 0, enum40);
        ArrayList term11648 = new ArrayList();
        ((ArrayList) term11648).add("IDCWpPLRkE");
        ((ArrayList) term11648).add("nyiiPDVjAc");
        ((ArrayList) term11648).add("aKnKipADSo");
        ((ArrayList) term11648).add("wSQxaModmm");
        ((ArrayList) term11648).add("UlajhuVLaP");
        ((ArrayList) term11648).add("gGSMzuGICf");
        ((ArrayList) term11648).add("hxCBltsObl");
        ((ArrayList) term11648).add("BndsHwAFMv");
        ArrayList term11748 = new ArrayList();
        ((ArrayList) term11748).add("GzFkzHGYFt");
        ((ArrayList) term11748).add("tShwQLRGNe");
        ((ArrayList) term11748).add("LvtrsXUliU");
        ((ArrayList) term11748).add("xLbjWUgOIL");
        ((ArrayList) term11748).add("jDtqGUpnZN");
        ((ArrayList) term11748).add("nGKItKLYNC");
        ((ArrayList) term11748).add("UiUYnPrcCi");
        term11635 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term11635, term11635.getClass(), "combineOperation", "xrwlQZdwCp");
        setField(term11635, term11635.getClass(), "queries", term11648);
        setField(term11635, term11635.getClass(), "arguments", term11748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11626;
        args[2] = term11635;
        callMethod(klass, "query", argTypes, null, args);
    }

};


