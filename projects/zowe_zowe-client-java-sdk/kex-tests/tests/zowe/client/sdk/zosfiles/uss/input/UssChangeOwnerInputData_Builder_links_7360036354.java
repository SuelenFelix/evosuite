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
import java.lang.String;
import java.lang.Object;

public class UssChangeOwnerInputData_Builder_links_7360036354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31088;
     Object enum97;

    public UssChangeOwnerInputData_Builder_links_7360036354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31175 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term31174 = ((Class) term31175).getDeclaredField((String) "SUPPRESS");
        ((Field) term31174).setAccessible(true);
        Object enum96 = ((Field) term31174).get((Object) null);
        term31088 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder"));
        setField(term31088, term31088.getClass(), "owner", "PapWxkhEWe");
        setField(term31088, term31088.getClass(), "group", "smnHEqRFRx");
        setBooleanField(term31088, term31088.getClass(), "recursive", true);
        setField(term31088, term31088.getClass(), "links", enum96);
        Class<? extends Object> term31421 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term31420 = ((Class) term31421).getDeclaredField((String) "FOLLOW");
        ((Field) term31420).setAccessible(true);
        enum97 = ((Field) term31420).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeOwnerInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.LinkType");
        Object[] args = new Object[1];
        args[0] = enum97;
        callMethod(klass, "links", argTypes, term31088, args);
    }

};


