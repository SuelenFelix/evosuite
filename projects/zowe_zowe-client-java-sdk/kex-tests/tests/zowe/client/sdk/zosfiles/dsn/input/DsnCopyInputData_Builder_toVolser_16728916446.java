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

public class DsnCopyInputData_Builder_toVolser_16728916446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17652;

    public DsnCopyInputData_Builder_toVolser_16728916446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17652 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder"));
        setField(term17652, term17652.getClass(), "fromVolser", "UEdzEKEEEV");
        setField(term17652, term17652.getClass(), "fromDataSet", "BcENaQFYSd");
        setField(term17652, term17652.getClass(), "toVolser", "POPYycoDBy");
        setField(term17652, term17652.getClass(), "toDataSet", "LuWMOXdAPA");
        setBooleanField(term17652, term17652.getClass(), "replace", true);
        setBooleanField(term17652, term17652.getClass(), "copyAllMembers", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "blSffTnsOv";
        callMethod(klass, "toVolser", argTypes, term17652, args);
    }

};


