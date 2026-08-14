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
import java.lang.String;
import java.lang.Object;

public class SQLiteMasterQuery_addIsNotNull_9683794504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18139;
     Object enum57;

    public SQLiteMasterQuery_addIsNotNull_9683794504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18152 = new ArrayList();
        ((ArrayList) term18152).add("mXGCWJDOqA");
        ArrayList term18168 = new ArrayList();
        ((ArrayList) term18168).add("dpNsDgfPso");
        ((ArrayList) term18168).add("hCWPJQKpdc");
        ((ArrayList) term18168).add("WzMEhMXkKx");
        ((ArrayList) term18168).add("XOiDvlDhdc");
        ((ArrayList) term18168).add("AdxvLJhNLe");
        ((ArrayList) term18168).add("lHfTrWKMPk");
        ((ArrayList) term18168).add("JDaAnsVTGV");
        ((ArrayList) term18168).add("mLUZFTfjle");
        ((ArrayList) term18168).add("xIeFjkHkOe");
        term18139 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term18139, term18139.getClass(), "combineOperation", "pORebkoRdD");
        setField(term18139, term18139.getClass(), "queries", term18152);
        setField(term18139, term18139.getClass(), "arguments", term18168);
        Class<? extends Object> term18403 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term18402 = ((Class) term18403).getDeclaredField((String) "ROOTPAGE");
        ((Field) term18402).setAccessible(true);
        enum57 = ((Field) term18402).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Object[] args = new Object[1];
        args[0] = enum57;
        callMethod(klass, "addIsNotNull", argTypes, term18139, args);
    }

};


