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

public class UssCreateZfsInputData_Builder_cylsSec_16170610134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52580;
     Object term52657;

    public UssCreateZfsInputData_Builder_cylsSec_16170610134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52581 = new Integer(98922530);
        Integer term52583 = new Integer(-1388471422);
        Integer term52585 = new Integer(-1498296052);
        Integer term52587 = new Integer(2098647989);
        Integer term52589 = new Integer(1598895173);
        ArrayList term52627 = new ArrayList();
        ((ArrayList) term52627).add("GGzwMoHZXC");
        ((ArrayList) term52627).add("IpmgwHTgnG");
        Integer term52655 = new Integer(1830648570);
        term52580 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term52580, term52580.getClass(), "owner", term52581);
        setField(term52580, term52580.getClass(), "group", term52583);
        setField(term52580, term52580.getClass(), "perms", term52585);
        setField(term52580, term52580.getClass(), "cylsPri", term52587);
        setField(term52580, term52580.getClass(), "cylsSec", term52589);
        setField(term52580, term52580.getClass(), "storageClass", "qYtAeLzOhW");
        setField(term52580, term52580.getClass(), "managementClass", "tJzmOfcUnY");
        setField(term52580, term52580.getClass(), "dataClass", "TKlccZUpjz");
        setField(term52580, term52580.getClass(), "volumes", term52627);
        setField(term52580, term52580.getClass(), "timeout", term52655);
        term52657 = new Integer(-227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term52657;
        callMethod(klass, "cylsSec", argTypes, term52580, args);
    }

};


