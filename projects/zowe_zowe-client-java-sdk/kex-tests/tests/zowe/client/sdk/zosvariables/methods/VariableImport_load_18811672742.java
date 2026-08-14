package zowe.client.sdk.zosvariables.methods;

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
import static zowe.client.sdk.zosvariables.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VariableImport_load_18811672742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;

    public VariableImport_load_18811672742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = newInstance(Class.forName("zowe.client.sdk.zosvariables.methods.VariableImport"));
        setField(term376, term376.getClass(), "connection", null);
        setField(term376, term376.getClass(), "request", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosvariables.methods.VariableImport");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "flxyYxBRtu";
        args[1] = "OclPbYPkcH";
        args[2] = "IoAlmYsBwc";
        callMethod(klass, "load", argTypes, term376, args);
    }

};


