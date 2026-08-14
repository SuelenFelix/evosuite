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

public class UssCreateZfsInputData_getVolumes_3688241829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49633;

    public UssCreateZfsInputData_getVolumes_3688241829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term49634 = new Integer(1532716628);
        Integer term49636 = new Integer(-1801760683);
        Integer term49638 = new Integer(1141317871);
        Integer term49640 = new Integer(890669485);
        Integer term49642 = new Integer(691577392);
        ArrayList term49680 = new ArrayList();
        ((ArrayList) term49680).add("mhQDwIyrRi");
        ((ArrayList) term49680).add("HpZXWDPhlg");
        ((ArrayList) term49680).add("lBOokzEPfe");
        Integer term49720 = new Integer(-893623680);
        term49633 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData"));
        setField(term49633, term49633.getClass(), "owner", term49634);
        setField(term49633, term49633.getClass(), "group", term49636);
        setField(term49633, term49633.getClass(), "perms", term49638);
        setField(term49633, term49633.getClass(), "cylsPri", term49640);
        setField(term49633, term49633.getClass(), "cylsSec", term49642);
        setField(term49633, term49633.getClass(), "storageClass", "cSHGbqKqlN");
        setField(term49633, term49633.getClass(), "managementClass", "pFAfANnxup");
        setField(term49633, term49633.getClass(), "dataClass", "FbSIUZyBXZ");
        setField(term49633, term49633.getClass(), "volumes", term49680);
        setField(term49633, term49633.getClass(), "timeout", term49720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolumes", argTypes, term49633, args);
    }

};


