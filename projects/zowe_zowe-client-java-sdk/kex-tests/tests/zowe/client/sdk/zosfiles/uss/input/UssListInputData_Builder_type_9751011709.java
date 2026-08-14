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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class UssListInputData_Builder_type_9751011709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44011;
     Object enum134;

    public UssListInputData_Builder_type_9751011709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44024 = new Integer(-602026508);
        Integer term44062 = new Integer(-157887805);
        Class<? extends Object> term44173 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term44172 = ((Class) term44173).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term44172).setAccessible(true);
        enum134 = ((Field) term44172).get((Object) null);
        Integer term44108 = new Integer(1876565163);
        term44011 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term44011, term44011.getClass(), "path", "BwtdjiefJn");
        setField(term44011, term44011.getClass(), "maxLength", term44024);
        setField(term44011, term44011.getClass(), "group", "jDmhBrIoDa");
        setField(term44011, term44011.getClass(), "user", "SPtPatHeOm");
        setField(term44011, term44011.getClass(), "mtime", "ywmcuThdfL");
        setField(term44011, term44011.getClass(), "size", term44062);
        setField(term44011, term44011.getClass(), "name", "GBOEuByOfr");
        setField(term44011, term44011.getClass(), "perm", "NHbOFFjyVK");
        setField(term44011, term44011.getClass(), "type", enum134);
        setField(term44011, term44011.getClass(), "depth", term44108);
        setBooleanField(term44011, term44011.getClass(), "filesys", false);
        setBooleanField(term44011, term44011.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Object[] args = new Object[1];
        args[0] = enum134;
        callMethod(klass, "type", argTypes, term44011, args);
    }

};


