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

public class StartTsoInputData_getCodePage_12442242566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819;

    public StartTsoInputData_getCodePage_12442242566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term819, term819.getClass(), "account", "IDCWpPLRkE");
        setField(term819, term819.getClass(), "characterSet", "nyiiPDVjAc");
        setField(term819, term819.getClass(), "codePage", "aKnKipADSo");
        setField(term819, term819.getClass(), "columns", "wSQxaModmm");
        setField(term819, term819.getClass(), "logonProcedure", "UlajhuVLaP");
        setField(term819, term819.getClass(), "regionSize", "gGSMzuGICf");
        setField(term819, term819.getClass(), "rows", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodePage", argTypes, term819, args);
    }

};


