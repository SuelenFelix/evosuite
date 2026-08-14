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

public class SQLiteMaster_count_150803640545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11353;

    public SQLiteMaster_count_150803640545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11366 = new ArrayList();
        ((ArrayList) term11366).add("vrQLuWIDJX");
        ((ArrayList) term11366).add("flxyYxBRtu");
        ((ArrayList) term11366).add("OclPbYPkcH");
        ((ArrayList) term11366).add("IoAlmYsBwc");
        ArrayList term11418 = new ArrayList();
        ((ArrayList) term11418).add("TEParAifyi");
        ((ArrayList) term11418).add("OWDIEULEFu");
        ((ArrayList) term11418).add("dWRymuLBtr");
        ((ArrayList) term11418).add("AijpHYOFuy");
        ((ArrayList) term11418).add("SbAoxhfrkn");
        ((ArrayList) term11418).add("kuTXqwMtDB");
        ((ArrayList) term11418).add("Ghbwtircqb");
        term11353 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term11353, term11353.getClass(), "combineOperation", "BYqFIqCKAV");
        setField(term11353, term11353.getClass(), "queries", term11366);
        setField(term11353, term11353.getClass(), "arguments", term11418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11353;
        callMethod(klass, "count", argTypes, null, args);
    }

};


