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

public class StartTsoInputData_setRows_73407959015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2302;

    public StartTsoInputData_setRows_73407959015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2302 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term2302, term2302.getClass(), "account", "QXzGXbEXMu");
        setField(term2302, term2302.getClass(), "characterSet", "qxSDVejjiY");
        setField(term2302, term2302.getClass(), "codePage", "xBsXSDjXYK");
        setField(term2302, term2302.getClass(), "columns", "sEnIVFtZuQ");
        setField(term2302, term2302.getClass(), "logonProcedure", "ZVecLZMLHF");
        setField(term2302, term2302.getClass(), "regionSize", "fztQhjqwdP");
        setField(term2302, term2302.getClass(), "rows", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        callMethod(klass, "setRows", argTypes, term2302, args);
    }

};


