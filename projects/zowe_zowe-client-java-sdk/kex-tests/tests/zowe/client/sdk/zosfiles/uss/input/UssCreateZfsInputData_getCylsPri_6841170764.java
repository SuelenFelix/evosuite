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

public class UssCreateZfsInputData_getCylsPri_6841170764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48646;

    public UssCreateZfsInputData_getCylsPri_6841170764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48647 = new Integer(1655935355);
        Integer term48649 = new Integer(-481533957);
        Integer term48651 = new Integer(1240914516);
        Integer term48653 = new Integer(-1465035361);
        Integer term48655 = new Integer(1090617576);
        ArrayList term48693 = new ArrayList();
        ((ArrayList) term48693).add("jnwVnmKAFv");
        ((ArrayList) term48693).add("TXyHhqeCjR");
        ((ArrayList) term48693).add("lZIgPZPgTu");
        ((ArrayList) term48693).add("iuCxnHGMoW");
        ((ArrayList) term48693).add("GPSEWEDSTo");
        ((ArrayList) term48693).add("RCOqfVsRHt");
        ((ArrayList) term48693).add("TSyCeEZPaT");
        ((ArrayList) term48693).add("JeZFtaqkzW");
        Integer term48793 = new Integer(-1547384488);
        term48646 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term48646, term48646.getClass(), "owner", term48647);
        setField(term48646, term48646.getClass(), "group", term48649);
        setField(term48646, term48646.getClass(), "perms", term48651);
        setField(term48646, term48646.getClass(), "cylsPri", term48653);
        setField(term48646, term48646.getClass(), "cylsSec", term48655);
        setField(term48646, term48646.getClass(), "storageClass", "hePqROaplw");
        setField(term48646, term48646.getClass(), "managementClass", "PJcSNDruWd");
        setField(term48646, term48646.getClass(), "dataClass", "VVNNlAePXF");
        setField(term48646, term48646.getClass(), "volumes", term48693);
        setField(term48646, term48646.getClass(), "timeout", term48793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCylsPri", argTypes, term48646, args);
    }

};


