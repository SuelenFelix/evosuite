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

public class UssChangeTagInputData_Builder_links_38458958712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19799;

    public UssChangeTagInputData_Builder_links_38458958712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19799 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term19799, term19799.getClass(), "action", null);
        setField(term19799, term19799.getClass(), "type", null);
        setField(term19799, term19799.getClass(), "codeset", null);
        setBooleanField(term19799, term19799.getClass(), "recursive", false);
        setField(term19799, term19799.getClass(), "links", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "links", argTypes, term19799, args);
    }

};


