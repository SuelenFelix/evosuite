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

public class SQLiteMasterQuery_add_21032236082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17057;
     Object enum55;

    public SQLiteMasterQuery_add_21032236082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17070 = new ArrayList();
        ((ArrayList) term17070).add("DfISiziTgG");
        ((ArrayList) term17070).add("XqgfKFvPSD");
        ((ArrayList) term17070).add("JiVRgTZvKc");
        ((ArrayList) term17070).add("XPKmummaqg");
        ((ArrayList) term17070).add("BKLfkLiZTH");
        ((ArrayList) term17070).add("SPpkrGcPRr");
        ((ArrayList) term17070).add("sEccwbJKYE");
        ArrayList term17158 = new ArrayList();
        ((ArrayList) term17158).add("AWRooQKkdW");
        ((ArrayList) term17158).add("vjxIhXHxGR");
        ((ArrayList) term17158).add("QXzGXbEXMu");
        ((ArrayList) term17158).add("qxSDVejjiY");
        ((ArrayList) term17158).add("xBsXSDjXYK");
        ((ArrayList) term17158).add("sEnIVFtZuQ");
        ((ArrayList) term17158).add("ZVecLZMLHF");
        term17057 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term17057, term17057.getClass(), "combineOperation", "jiKYgYHqIS");
        setField(term17057, term17057.getClass(), "queries", term17070);
        setField(term17057, term17057.getClass(), "arguments", term17158);
        Class<? extends Object> term17433 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term17432 = ((Class) term17433).getDeclaredField((String) "ROOTPAGE");
        ((Field) term17432).setAccessible(true);
        enum55 = ((Field) term17432).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum55;
        args[1] = "fztQhjqwdP";
        args[2] = "eVpkWxjuki";
        callMethod(klass, "add", argTypes, term17057, args);
    }

};


