package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DsnCopyInputData_isReplace_17833485656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18427;

    public DsnCopyInputData_isReplace_17833485656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18427 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData"));
        setField(term18427, term18427.getClass(), "fromVolser", "bVbexZPmwW");
        setField(term18427, term18427.getClass(), "fromDataSet", "tvxYdqiyGc");
        setField(term18427, term18427.getClass(), "toVolser", "ZEXFoMSKeG");
        setField(term18427, term18427.getClass(), "toDataSet", "HvxahUfZcJ");
        setBooleanField(term18427, term18427.getClass(), "replace", true);
        setBooleanField(term18427, term18427.getClass(), "copyAllMembers", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReplace", argTypes, term18427, args);
    }

};


