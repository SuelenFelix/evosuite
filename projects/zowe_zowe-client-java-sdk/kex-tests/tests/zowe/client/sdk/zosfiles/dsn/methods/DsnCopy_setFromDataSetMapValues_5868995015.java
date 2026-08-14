package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DsnCopy_setFromDataSetMapValues_5868995015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;
     Object term235;

    public DsnCopy_setFromDataSetMapValues_5868995015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnCopy"));
        setField(term234, term234.getClass(), "connection", null);
        setField(term234, term234.getClass(), "request", null);
        term235 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData"));
        setField(term235, term235.getClass(), "fromVolser", "NRdvgJlhkX");
        setField(term235, term235.getClass(), "fromDataSet", "uuaPigETmJ");
        setField(term235, term235.getClass(), "toVolser", "MxlszYVzRf");
        setField(term235, term235.getClass(), "toDataSet", "LQFpaHEwXR");
        setBooleanField(term235, term235.getClass(), "replace", true);
        setBooleanField(term235, term235.getClass(), "copyAllMembers", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnCopy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData");
        Object[] args = new Object[1];
        args[0] = term235;
        callMethod(klass, "setFromDataSetMapValues", argTypes, term234, args);
    }

};


