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

public class UssGetInputData_getRecordsRange_6774349717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10055;

    public UssGetInputData_getRecordsRange_6774349717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10081 = new Integer(-2038273078);
        term10055 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData"));
        setField(term10055, term10055.getClass(), "search", "VgZnGoIFwQ");
        setField(term10055, term10055.getClass(), "research", "jUbSRrkrYZ");
        setBooleanField(term10055, term10055.getClass(), "insensitive", false);
        setField(term10055, term10055.getClass(), "maxreturnsize", term10081);
        setIntField(term10055, term10055.getClass(), "queryCount", -2038273078);
        setBooleanField(term10055, term10055.getClass(), "binary", false);
        setField(term10055, term10055.getClass(), "recordsRange", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssGetInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordsRange", argTypes, term10055, args);
    }

};


