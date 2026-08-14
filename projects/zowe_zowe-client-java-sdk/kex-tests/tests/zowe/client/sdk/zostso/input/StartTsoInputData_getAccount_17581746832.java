package zowe.client.sdk.zostso.input;

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
import static zowe.client.sdk.zostso.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartTsoInputData_getAccount_17581746832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;

    public StartTsoInputData_getAccount_17581746832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term155, term155.getClass(), "account", "MjGYSRKTNF");
        setField(term155, term155.getClass(), "characterSet", "hRNSzYYIrc");
        setField(term155, term155.getClass(), "codePage", "RMFIsYGgne");
        setField(term155, term155.getClass(), "columns", "NRdvgJlhkX");
        setField(term155, term155.getClass(), "logonProcedure", "uuaPigETmJ");
        setField(term155, term155.getClass(), "regionSize", "MxlszYVzRf");
        setField(term155, term155.getClass(), "rows", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccount", argTypes, term155, args);
    }

};


