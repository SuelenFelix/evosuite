package zowe.client.sdk.zosfiles.dsn.model;

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
import static zowe.client.sdk.zosfiles.dsn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Dataset_getCdate_989534664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3998;

    public Dataset_getCdate_989534664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3998 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term3998, term3998.getClass(), "dsname", "xtftXXMbem");
        setField(term3998, term3998.getClass(), "blksz", "cudZvLMQon");
        setField(term3998, term3998.getClass(), "catnm", "lihXWlGDxk");
        setField(term3998, term3998.getClass(), "cdate", "JmcmxoGhIK");
        setField(term3998, term3998.getClass(), "dev", "jXzmYyrnnT");
        setField(term3998, term3998.getClass(), "dsntp", "igCAtimmYB");
        setField(term3998, term3998.getClass(), "dsorg", "DyiXbeYIaN");
        setField(term3998, term3998.getClass(), "edate", "VGizxZnyHX");
        setField(term3998, term3998.getClass(), "extx", "kVEZMHmRtR");
        setField(term3998, term3998.getClass(), "lrectl", "ekxGuOYIwi");
        setField(term3998, term3998.getClass(), "migr", "RbVQXSpxXy");
        setField(term3998, term3998.getClass(), "mvol", "YpJbIgJWWv");
        setField(term3998, term3998.getClass(), "ovf", "JppkknKVOw");
        setField(term3998, term3998.getClass(), "rdate", "iljANwuEjk");
        setField(term3998, term3998.getClass(), "recfm", "kNqaJKIATy");
        setField(term3998, term3998.getClass(), "sizex", "vKQukfbJUd");
        setField(term3998, term3998.getClass(), "spacu", "lFRJFUMVbx");
        setField(term3998, term3998.getClass(), "used", "sZdUNdggUW");
        setField(term3998, term3998.getClass(), "vol", "OqbwYQfvAe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCdate", argTypes, term3998, args);
    }

};


