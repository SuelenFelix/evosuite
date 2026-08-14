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
import java.util.ArrayList;

public class SQLiteMaster_query_5099362044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11036;

    public SQLiteMaster_query_5099362044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11049 = new ArrayList();
        ((ArrayList) term11049).add("uuaPigETmJ");
        ((ArrayList) term11049).add("MxlszYVzRf");
        ((ArrayList) term11049).add("LQFpaHEwXR");
        ((ArrayList) term11049).add("oVcInYnLWB");
        ArrayList term11101 = new ArrayList();
        ((ArrayList) term11101).add("aJlieCFVtF");
        ((ArrayList) term11101).add("ZiaGIbnzTs");
        ((ArrayList) term11101).add("tbcdzjIfER");
        ((ArrayList) term11101).add("HyxfbSQYBe");
        ((ArrayList) term11101).add("pCTimMblYc");
        ((ArrayList) term11101).add("hNxWaHcfhY");
        ((ArrayList) term11101).add("RkybSrpybU");
        ((ArrayList) term11101).add("xOEqzGAmDU");
        ((ArrayList) term11101).add("eZFUvlxvGV");
        term11036 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term11036, term11036.getClass(), "combineOperation", "NRdvgJlhkX");
        setField(term11036, term11036.getClass(), "queries", term11049);
        setField(term11036, term11036.getClass(), "arguments", term11101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11036;
        callMethod(klass, "query", argTypes, null, args);
    }

};


