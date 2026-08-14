package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixFile_getMode_9226948642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3285;

    public UnixFile_getMode_9226948642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3310 = new Long(8863790908271299748L);
        Long term3312 = new Long(9205327385733285058L);
        Long term3326 = new Long(4199886998224701110L);
        term3285 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3285, term3285.getClass(), "name", "OJJtVNPyKZ");
        setField(term3285, term3285.getClass(), "mode", "AKNapTAfmD");
        setField(term3285, term3285.getClass(), "size", term3310);
        setField(term3285, term3285.getClass(), "uid", term3312);
        setField(term3285, term3285.getClass(), "user", "xJgPlLxpgC");
        setField(term3285, term3285.getClass(), "gid", term3326);
        setField(term3285, term3285.getClass(), "group", "EYtfuJaxiM");
        setField(term3285, term3285.getClass(), "mtime", "gCWtLVKVVe");
        setField(term3285, term3285.getClass(), "target", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMode", argTypes, term3285, args);
    }

};


