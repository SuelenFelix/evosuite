package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UssListZfsInputData_getMaxLength_616033186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32211;

    public UssListZfsInputData_getMaxLength_616033186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32211 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData"));
        setField(term32211, term32211.getClass(), "maxLength", null);
        setField(term32211, term32211.getClass(), "path", null);
        setField(term32211, term32211.getClass(), "fsname", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLength", argTypes, term32211, args);
    }

};


