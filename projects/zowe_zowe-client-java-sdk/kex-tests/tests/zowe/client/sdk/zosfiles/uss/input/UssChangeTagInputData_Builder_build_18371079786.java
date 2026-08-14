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

public class UssChangeTagInputData_Builder_build_18371079786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18951;

    public UssChangeTagInputData_Builder_build_18371079786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19012 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagAction");
        Field term19011 = ((Class) term19012).getDeclaredField((String) "LIST");
        ((Field) term19011).setAccessible(true);
        Object enum57 = ((Field) term19011).get((Object) null);
        Class<? extends Object> term19281 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ChangeTagType");
        Field term19280 = ((Class) term19281).getDeclaredField((String) "TEXT");
        ((Field) term19280).setAccessible(true);
        Object enum58 = ((Field) term19280).get((Object) null);
        Class<? extends Object> term19550 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.LinkType");
        Field term19549 = ((Class) term19550).getDeclaredField((String) "CHANGE");
        ((Field) term19549).setAccessible(true);
        Object enum59 = ((Field) term19549).get((Object) null);
        term18951 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder"));
        setField(term18951, term18951.getClass(), "action", enum57);
        setField(term18951, term18951.getClass(), "type", enum58);
        setField(term18951, term18951.getClass(), "codeset", "qxSDVejjiY");
        setBooleanField(term18951, term18951.getClass(), "recursive", false);
        setField(term18951, term18951.getClass(), "links", enum59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssChangeTagInputData$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term18951, args);
    }

};


