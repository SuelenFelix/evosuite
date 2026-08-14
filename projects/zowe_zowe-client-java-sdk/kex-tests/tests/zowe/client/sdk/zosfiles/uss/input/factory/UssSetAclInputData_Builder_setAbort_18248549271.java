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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class UssSetAclInputData_Builder_setAbort_18248549271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term79;

    public UssSetAclInputData_Builder_setAbort_18248549271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term139 = ((Class) term140).getDeclaredField((String) "SUPPRESS");
        ((Field) term139).setAccessible(true);
        Object enum0 = ((Field) term139).get((Object) null);
        Class<? extends Object> term446 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.DeleteAclType");
        Field term445 = ((Class) term446).getDeclaredField((String) "ACCESS");
        ((Field) term445).setAccessible(true);
        Object enum1 = ((Field) term445).get((Object) null);
        term1 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder"));
        setBooleanField(term1, term1.getClass(), "abort", false);
        setField(term1, term1.getClass(), "links", enum0);
        setField(term1, term1.getClass(), "deleteType", enum1);
        setField(term1, term1.getClass(), "set", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "modify", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "delete", "MuLcgQHgqz");
        term79 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.factory.UssSetAclInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term79;
        callMethod(klass, "setAbort", argTypes, term1, args);
    }

};


