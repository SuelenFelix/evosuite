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

public class UssCreateZfsInputData_Builder_owner_6923715101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51995;
     Object term52108;

    public UssCreateZfsInputData_Builder_owner_6923715101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term51996 = new Integer(-2015854073);
        Integer term51998 = new Integer(538259104);
        Integer term52000 = new Integer(96566506);
        Integer term52002 = new Integer(-343325701);
        Integer term52004 = new Integer(107945604);
        ArrayList term52042 = new ArrayList();
        ((ArrayList) term52042).add("orEuhCStGM");
        ((ArrayList) term52042).add("HhEaSXWvrY");
        ((ArrayList) term52042).add("CVRGEomOth");
        ((ArrayList) term52042).add("vSeruUyNWX");
        ((ArrayList) term52042).add("UkKvaeJfEC");
        Integer term52106 = new Integer(-1963464809);
        term51995 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder"));
        setField(term51995, term51995.getClass(), "owner", term51996);
        setField(term51995, term51995.getClass(), "group", term51998);
        setField(term51995, term51995.getClass(), "perms", term52000);
        setField(term51995, term51995.getClass(), "cylsPri", term52002);
        setField(term51995, term51995.getClass(), "cylsSec", term52004);
        setField(term51995, term51995.getClass(), "storageClass", "oKwCDqywym");
        setField(term51995, term51995.getClass(), "managementClass", "zjZYTddemL");
        setField(term51995, term51995.getClass(), "dataClass", "QtrylgCLiF");
        setField(term51995, term51995.getClass(), "volumes", term52042);
        setField(term51995, term51995.getClass(), "timeout", term52106);
        term52108 = new Integer(71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssCreateZfsInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term52108;
        callMethod(klass, "owner", argTypes, term51995, args);
    }

};


