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

public class UssCreateZfsInputData_Builder_perms_3162591743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52341;
     Object term52478;

    public UssCreateZfsInputData_Builder_perms_3162591743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52342 = new Integer(9726679);
        Integer term52344 = new Integer(-25637976);
        Integer term52346 = new Integer(1555897383);
        Integer term52348 = new Integer(202001407);
        Integer term52350 = new Integer(158873461);
        ArrayList term52388 = new ArrayList();
        ((ArrayList) term52388).add("UimMMORkzd");
        ((ArrayList) term52388).add("huVIXUWLtI");
        ((ArrayList) term52388).add("vhKzFyKPOT");
        ((ArrayList) term52388).add("nQhIgWXdRc");
        ((ArrayList) term52388).add("EusenEbIoF");
        ((ArrayList) term52388).add("SScVQYSvWH");
        ((ArrayList) term52388).add("MnovcqFhCl");
        Integer term52476 = new Integer(-430151637);
        term52341 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term52341, term52341.getClass(), "owner", term52342);
        setField(term52341, term52341.getClass(), "group", term52344);
        setField(term52341, term52341.getClass(), "perms", term52346);
        setField(term52341, term52341.getClass(), "cylsPri", term52348);
        setField(term52341, term52341.getClass(), "cylsSec", term52350);
        setField(term52341, term52341.getClass(), "storageClass", "BJhjdJUhkz");
        setField(term52341, term52341.getClass(), "managementClass", "cdHYQDgUZR");
        setField(term52341, term52341.getClass(), "dataClass", "KAORSSPSeV");
        setField(term52341, term52341.getClass(), "volumes", term52388);
        setField(term52341, term52341.getClass(), "timeout", term52476);
        term52478 = new Integer(-1697741339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term52478;
        callMethod(klass, "perms", argTypes, term52341, args);
    }

};


