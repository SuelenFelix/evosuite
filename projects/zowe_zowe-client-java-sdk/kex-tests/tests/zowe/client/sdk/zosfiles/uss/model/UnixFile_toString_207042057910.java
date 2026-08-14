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

public class UnixFile_toString_207042057910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4397;

    public UnixFile_toString_207042057910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4422 = new Long(-419800263764810394L);
        Long term4424 = new Long(5904678961906211249L);
        Long term4438 = new Long(-1820639665251914495L);
        term4397 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term4397, term4397.getClass(), "name", "jXzmYyrnnT");
        setField(term4397, term4397.getClass(), "mode", "igCAtimmYB");
        setField(term4397, term4397.getClass(), "size", term4422);
        setField(term4397, term4397.getClass(), "uid", term4424);
        setField(term4397, term4397.getClass(), "user", "DyiXbeYIaN");
        setField(term4397, term4397.getClass(), "gid", term4438);
        setField(term4397, term4397.getClass(), "group", "VGizxZnyHX");
        setField(term4397, term4397.getClass(), "mtime", "kVEZMHmRtR");
        setField(term4397, term4397.getClass(), "target", "ekxGuOYIwi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4397, args);
    }

};


