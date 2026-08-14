package zowe.client.sdk.zosfiles.uss.input.factory;

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
import static zowe.client.sdk.zosfiles.uss.input.factory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UssSetAclInputData_getSet_182532400712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12319;

    public UssSetAclInputData_getSet_182532400712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12319 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData"));
        setBooleanField(term12319, term12319.getClass(), "abort", false);
        setField(term12319, term12319.getClass(), "links", null);
        setField(term12319, term12319.getClass(), "deleteType", null);
        setField(term12319, term12319.getClass(), "set", null);
        setField(term12319, term12319.getClass(), "modify", null);
        setField(term12319, term12319.getClass(), "delete", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSet", argTypes, term12319, args);
    }

};


