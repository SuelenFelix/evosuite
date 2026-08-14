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

public class UssGetAclInputData_getType_4938556128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40245;

    public UssGetAclInputData_getType_4938556128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40245 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData"));
        setField(term40245, term40245.getClass(), "type", null);
        setField(term40245, term40245.getClass(), "user", null);
        setBooleanField(term40245, term40245.getClass(), "useCommas", false);
        setBooleanField(term40245, term40245.getClass(), "suppressHeader", false);
        setBooleanField(term40245, term40245.getClass(), "suppressBaseAcl", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetAclInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term40245, args);
    }

};


