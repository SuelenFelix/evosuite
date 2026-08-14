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

public class StartTsoInputData_setAccount_15780445023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;

    public StartTsoInputData_setAccount_15780445023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term310, term310.getClass(), "account", "oVcInYnLWB");
        setField(term310, term310.getClass(), "characterSet", "aJlieCFVtF");
        setField(term310, term310.getClass(), "codePage", "ZiaGIbnzTs");
        setField(term310, term310.getClass(), "columns", "tbcdzjIfER");
        setField(term310, term310.getClass(), "logonProcedure", "HyxfbSQYBe");
        setField(term310, term310.getClass(), "regionSize", "pCTimMblYc");
        setField(term310, term310.getClass(), "rows", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setAccount", argTypes, term310, args);
    }

};


