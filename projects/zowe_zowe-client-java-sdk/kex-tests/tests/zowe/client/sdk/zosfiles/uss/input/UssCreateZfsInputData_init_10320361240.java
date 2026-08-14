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

public class UssCreateZfsInputData_init_10320361240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48182;

    public UssCreateZfsInputData_init_10320361240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48183 = new Integer(-184153539);
        Integer term48185 = new Integer(493620644);
        Integer term48187 = new Integer(1328271830);
        Integer term48189 = new Integer(1596070772);
        Integer term48191 = new Integer(97029295);
        ArrayList term48229 = new ArrayList();
        ((ArrayList) term48229).add("GEJABPlHSI");
        ((ArrayList) term48229).add("aQFUvuaYxd");
        ((ArrayList) term48229).add("zNFLXMifnS");
        Integer term48269 = new Integer(-1371869594);
        term48182 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term48182, term48182.getClass(), "owner", term48183);
        setField(term48182, term48182.getClass(), "group", term48185);
        setField(term48182, term48182.getClass(), "perms", term48187);
        setField(term48182, term48182.getClass(), "cylsPri", term48189);
        setField(term48182, term48182.getClass(), "cylsSec", term48191);
        setField(term48182, term48182.getClass(), "storageClass", "WxYUTuqmIq");
        setField(term48182, term48182.getClass(), "managementClass", "OeQLvhVERT");
        setField(term48182, term48182.getClass(), "dataClass", "IlvgFINwIa");
        setField(term48182, term48182.getClass(), "volumes", term48229);
        setField(term48182, term48182.getClass(), "timeout", term48269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Object[] args = new Object[1];
        args[0] = term48182;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


