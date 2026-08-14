package zowe.client.sdk.zosfiles.dsn.methods;

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
import static zowe.client.sdk.zosfiles.dsn.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnList_getMembers_10835749673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;
     Object term819;

    public DsnList_getMembers_10835749673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList"));
        setField(term806, term806.getClass(), "connection", null);
        setField(term806, term806.getClass(), "request", null);
        Class<? extends Object> term920 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term919 = ((Class) term920).getDeclaredField((String) "VOL");
        ((Field) term919).setAccessible(true);
        Object enum1 = ((Field) term919).get((Object) null);
        term819 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term819, term819.getClass(), "volume", "eZFUvlxvGV");
        setField(term819, term819.getClass(), "attribute", enum1);
        setField(term819, term819.getClass(), "maxLength", "BYqFIqCKAV");
        setField(term819, term819.getClass(), "start", "vrQLuWIDJX");
        setField(term819, term819.getClass(), "recall", "flxyYxBRtu");
        setField(term819, term819.getClass(), "pattern", "OclPbYPkcH");
        setField(term819, term819.getClass(), "responseTimeout", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.methods.DsnList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Object[] args = new Object[2];
        args[0] = "xOEqzGAmDU";
        args[1] = term819;
        callMethod(klass, "getMembers", argTypes, term806, args);
    }

};


