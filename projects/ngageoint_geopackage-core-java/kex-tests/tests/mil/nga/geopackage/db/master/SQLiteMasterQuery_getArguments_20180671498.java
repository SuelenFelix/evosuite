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

public class SQLiteMasterQuery_getArguments_20180671498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19267;

    public SQLiteMasterQuery_getArguments_20180671498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19280 = new ArrayList();
        ArrayList term19284 = new ArrayList();
        ((ArrayList) term19284).add("HHmNoYxIGj");
        ((ArrayList) term19284).add("PtirvZmsGt");
        ((ArrayList) term19284).add("HWkpTmtlrc");
        ((ArrayList) term19284).add("hMmaoREuCK");
        ((ArrayList) term19284).add("VeDtgDzGAN");
        ((ArrayList) term19284).add("aWYOWZFyaX");
        ((ArrayList) term19284).add("BRIVNtfUWU");
        ((ArrayList) term19284).add("DbiCVtPPCT");
        ((ArrayList) term19284).add("WzFopsaDuG");
        term19267 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term19267, term19267.getClass(), "combineOperation", "aNWLJdrZMq");
        setField(term19267, term19267.getClass(), "queries", term19280);
        setField(term19267, term19267.getClass(), "arguments", term19284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArguments", argTypes, term19267, args);
    }

};


