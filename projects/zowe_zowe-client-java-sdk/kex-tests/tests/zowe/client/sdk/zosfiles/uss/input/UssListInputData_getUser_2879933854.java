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

public class UssListInputData_getUser_2879933854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57596;

    public UssListInputData_getUser_2879933854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term57609 = new Integer(1694224101);
        Integer term57647 = new Integer(937859191);
        Class<? extends Object> term57758 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term57757 = ((Class) term57758).getDeclaredField((String) "SYMBOLIC_LINK");
        ((Field) term57757).setAccessible(true);
        Object enum160 = ((Field) term57757).get((Object) null);
        Integer term57693 = new Integer(-916584829);
        term57596 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData"));
        setField(term57596, term57596.getClass(), "path", "mfHtgSbdjD");
        setField(term57596, term57596.getClass(), "maxLength", term57609);
        setField(term57596, term57596.getClass(), "group", "cmuaUiHMVL");
        setField(term57596, term57596.getClass(), "user", "xjoSGPWUgu");
        setField(term57596, term57596.getClass(), "mtime", "uzmqjnOUXu");
        setField(term57596, term57596.getClass(), "size", term57647);
        setField(term57596, term57596.getClass(), "name", "xeyjTOCOJb");
        setField(term57596, term57596.getClass(), "perm", "DGRqjjdhzy");
        setField(term57596, term57596.getClass(), "type", enum160);
        setField(term57596, term57596.getClass(), "depth", term57693);
        setBooleanField(term57596, term57596.getClass(), "filesys", true);
        setBooleanField(term57596, term57596.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term57596, args);
    }

};


