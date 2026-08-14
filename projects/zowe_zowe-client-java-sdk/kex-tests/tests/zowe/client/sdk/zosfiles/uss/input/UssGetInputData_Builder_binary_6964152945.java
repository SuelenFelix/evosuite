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
import java.lang.Boolean;

public class UssGetInputData_Builder_binary_6964152945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54130;
     Object term54172;

    public UssGetInputData_Builder_binary_6964152945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term54156 = new Integer(-1667990367);
        term54130 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder"));
        setField(term54130, term54130.getClass(), "search", "AGXoIndFnm");
        setField(term54130, term54130.getClass(), "research", "mwmFMNEzkK");
        setBooleanField(term54130, term54130.getClass(), "insensitive", true);
        setField(term54130, term54130.getClass(), "maxreturnsize", term54156);
        setIntField(term54130, term54130.getClass(), "queryCount", 1622346318);
        setBooleanField(term54130, term54130.getClass(), "binary", false);
        setField(term54130, term54130.getClass(), "recordsRange", "kVAmKknVln");
        term54172 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54172;
        callMethod(klass, "binary", argTypes, term54130, args);
    }

};


