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

public class UssCreateZfsInputData_getGroup_16573945592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48436;

    public UssCreateZfsInputData_getGroup_16573945592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48437 = new Integer(933028652);
        Integer term48439 = new Integer(287287233);
        Integer term48441 = new Integer(962840079);
        Integer term48443 = new Integer(1540719661);
        Integer term48445 = new Integer(1265463001);
        ArrayList term48483 = new ArrayList();
        Integer term48487 = new Integer(335112684);
        term48436 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term48436, term48436.getClass(), "owner", term48437);
        setField(term48436, term48436.getClass(), "group", term48439);
        setField(term48436, term48436.getClass(), "perms", term48441);
        setField(term48436, term48436.getClass(), "cylsPri", term48443);
        setField(term48436, term48436.getClass(), "cylsSec", term48445);
        setField(term48436, term48436.getClass(), "storageClass", "nRvKihUSPj");
        setField(term48436, term48436.getClass(), "managementClass", "BbNeQJpYPr");
        setField(term48436, term48436.getClass(), "dataClass", "riMtzCoxNj");
        setField(term48436, term48436.getClass(), "volumes", term48483);
        setField(term48436, term48436.getClass(), "timeout", term48487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term48436, args);
    }

};


