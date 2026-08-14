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

public class DsnCopyInputData_Builder_toDataSet_7779967755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17539;

    public DsnCopyInputData_Builder_toDataSet_7779967755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17539 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder"));
        setField(term17539, term17539.getClass(), "fromVolser", "TGiJfagfky");
        setField(term17539, term17539.getClass(), "fromDataSet", "BJklinBmhN");
        setField(term17539, term17539.getClass(), "toVolser", "IOddzvEWcl");
        setField(term17539, term17539.getClass(), "toDataSet", "bIrtpkYJWT");
        setBooleanField(term17539, term17539.getClass(), "replace", true);
        setBooleanField(term17539, term17539.getClass(), "copyAllMembers", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCopyInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VuLLXpvPpZ";
        callMethod(klass, "toDataSet", argTypes, term17539, args);
    }

};


