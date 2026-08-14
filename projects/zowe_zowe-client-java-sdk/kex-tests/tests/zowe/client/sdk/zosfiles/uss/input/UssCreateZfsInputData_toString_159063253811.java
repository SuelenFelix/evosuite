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
import java.util.ArrayList;

public class UssCreateZfsInputData_toString_159063253811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49975;

    public UssCreateZfsInputData_toString_159063253811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49976 = new Integer(1474524152);
        Integer term49978 = new Integer(568954359);
        Integer term49980 = new Integer(53410913);
        Integer term49982 = new Integer(-375014958);
        Integer term49984 = new Integer(1107176718);
        ArrayList term50022 = new ArrayList();
        ((ArrayList) term50022).add("zgKiINdgNu");
        ((ArrayList) term50022).add("zLMTXDQHYH");
        ((ArrayList) term50022).add("PqywFWJlpE");
        ((ArrayList) term50022).add("OzXRsFGTIp");
        ((ArrayList) term50022).add("TjWpyghUWN");
        ((ArrayList) term50022).add("dkZFDZxcde");
        Integer term50098 = new Integer(480137250);
        term49975 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term49975, term49975.getClass(), "owner", term49976);
        setField(term49975, term49975.getClass(), "group", term49978);
        setField(term49975, term49975.getClass(), "perms", term49980);
        setField(term49975, term49975.getClass(), "cylsPri", term49982);
        setField(term49975, term49975.getClass(), "cylsSec", term49984);
        setField(term49975, term49975.getClass(), "storageClass", "KarbTXFmUU");
        setField(term49975, term49975.getClass(), "managementClass", "jiUSjqwSIQ");
        setField(term49975, term49975.getClass(), "dataClass", "MgLCedQfoj");
        setField(term49975, term49975.getClass(), "volumes", term50022);
        setField(term49975, term49975.getClass(), "timeout", term50098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term49975, args);
    }

};


