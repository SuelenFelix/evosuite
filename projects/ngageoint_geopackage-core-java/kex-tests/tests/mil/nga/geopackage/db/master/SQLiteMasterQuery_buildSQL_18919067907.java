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

public class SQLiteMasterQuery_buildSQL_18919067907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18972;

    public SQLiteMasterQuery_buildSQL_18919067907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18985 = new ArrayList();
        ((ArrayList) term18985).add("pXOkjyeIRb");
        ((ArrayList) term18985).add("GgZWSjxjyE");
        ((ArrayList) term18985).add("EeBVbzjcCI");
        ((ArrayList) term18985).add("UfQtPRyWRC");
        ArrayList term19037 = new ArrayList();
        ((ArrayList) term19037).add("FPvxVzzSvD");
        ((ArrayList) term19037).add("WHcwFgsGFC");
        ((ArrayList) term19037).add("HzqpegHiRq");
        ((ArrayList) term19037).add("jwsfVjMoJT");
        ((ArrayList) term19037).add("ZfdXfCCFDf");
        ((ArrayList) term19037).add("MwwjNtdOFT");
        ((ArrayList) term19037).add("VYkqXKVlAJ");
        ((ArrayList) term19037).add("XkIoWJRNwN");
        term18972 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term18972, term18972.getClass(), "combineOperation", "mvrkADEgpp");
        setField(term18972, term18972.getClass(), "queries", term18985);
        setField(term18972, term18972.getClass(), "arguments", term19037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildSQL", argTypes, term18972, args);
    }

};


