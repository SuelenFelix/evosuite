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

public class StartTsoInputData_setCodePage_18389554917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term974;

    public StartTsoInputData_setCodePage_18389554917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term974 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term974, term974.getClass(), "account", "BndsHwAFMv");
        setField(term974, term974.getClass(), "characterSet", "GzFkzHGYFt");
        setField(term974, term974.getClass(), "codePage", "tShwQLRGNe");
        setField(term974, term974.getClass(), "columns", "LvtrsXUliU");
        setField(term974, term974.getClass(), "logonProcedure", "xLbjWUgOIL");
        setField(term974, term974.getClass(), "regionSize", "jDtqGUpnZN");
        setField(term974, term974.getClass(), "rows", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setCodePage", argTypes, term974, args);
    }

};


