package zowe.client.sdk.zostso.input;

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
import static zowe.client.sdk.zostso.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartTsoInputData_getCharacterSet_1319969574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487;

    public StartTsoInputData_getCharacterSet_1319969574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term487, term487.getClass(), "account", "xOEqzGAmDU");
        setField(term487, term487.getClass(), "characterSet", "eZFUvlxvGV");
        setField(term487, term487.getClass(), "codePage", "BYqFIqCKAV");
        setField(term487, term487.getClass(), "columns", "vrQLuWIDJX");
        setField(term487, term487.getClass(), "logonProcedure", "flxyYxBRtu");
        setField(term487, term487.getClass(), "regionSize", "OclPbYPkcH");
        setField(term487, term487.getClass(), "rows", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterSet", argTypes, term487, args);
    }

};


