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

public class UssChangeModeInputData_Builder_links_1432577418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29698;

    public UssChangeModeInputData_Builder_links_1432577418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29698 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder"));
        setField(term29698, term29698.getClass(), "mode", null);
        setBooleanField(term29698, term29698.getClass(), "recursive", false);
        setField(term29698, term29698.getClass(), "links", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeModeInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "links", argTypes, term29698, args);
    }

};


