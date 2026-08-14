package zowe.client.sdk.zoslogs.model;

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
import static zowe.client.sdk.zoslogs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ZosLogItem_getCart_6598055801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public ZosLogItem_getCart_6598055801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term344 = new Long(6375119433582206027L);
        term223 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term223, term223.getClass(), "cart", "NRdvgJlhkX");
        setField(term223, term223.getClass(), "color", "uuaPigETmJ");
        setField(term223, term223.getClass(), "jobName", "MxlszYVzRf");
        setField(term223, term223.getClass(), "message", "LQFpaHEwXR");
        setField(term223, term223.getClass(), "messageId", "oVcInYnLWB");
        setField(term223, term223.getClass(), "replyId", "aJlieCFVtF");
        setField(term223, term223.getClass(), "system", "ZiaGIbnzTs");
        setField(term223, term223.getClass(), "type", "tbcdzjIfER");
        setField(term223, term223.getClass(), "subType", "HyxfbSQYBe");
        setField(term223, term223.getClass(), "time", "pCTimMblYc");
        setField(term223, term223.getClass(), "timeStamp", term344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCart", argTypes, term223, args);
    }

};


