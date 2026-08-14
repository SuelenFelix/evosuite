package zowe.client.sdk.zoslogs.response;

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
import static zowe.client.sdk.zoslogs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class ZosLogResponse_getSource_12588029613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;

    public ZosLogResponse_getSource_12588029613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term605 = new Long(5127676408959197577L);
        Object term594 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term594, term594.getClass(), "cart", "");
        setField(term594, term594.getClass(), "color", "");
        setField(term594, term594.getClass(), "jobName", "");
        setField(term594, term594.getClass(), "message", "");
        setField(term594, term594.getClass(), "messageId", "");
        setField(term594, term594.getClass(), "replyId", "");
        setField(term594, term594.getClass(), "system", "");
        setField(term594, term594.getClass(), "type", "");
        setField(term594, term594.getClass(), "subType", "");
        setField(term594, term594.getClass(), "time", "");
        setField(term594, term594.getClass(), "timeStamp", term605);
        Long term618 = new Long(-6573104506744284592L);
        Object term607 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term607, term607.getClass(), "cart", "");
        setField(term607, term607.getClass(), "color", "");
        setField(term607, term607.getClass(), "jobName", "");
        setField(term607, term607.getClass(), "message", "");
        setField(term607, term607.getClass(), "messageId", "");
        setField(term607, term607.getClass(), "replyId", "");
        setField(term607, term607.getClass(), "system", "");
        setField(term607, term607.getClass(), "type", "");
        setField(term607, term607.getClass(), "subType", "");
        setField(term607, term607.getClass(), "time", "");
        setField(term607, term607.getClass(), "timeStamp", term618);
        Long term631 = new Long(-4920224193275732920L);
        Object term620 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term620, term620.getClass(), "cart", "");
        setField(term620, term620.getClass(), "color", "");
        setField(term620, term620.getClass(), "jobName", "");
        setField(term620, term620.getClass(), "message", "");
        setField(term620, term620.getClass(), "messageId", "");
        setField(term620, term620.getClass(), "replyId", "");
        setField(term620, term620.getClass(), "system", "");
        setField(term620, term620.getClass(), "type", "");
        setField(term620, term620.getClass(), "subType", "");
        setField(term620, term620.getClass(), "time", "");
        setField(term620, term620.getClass(), "timeStamp", term631);
        Long term644 = new Long(8428634514691209827L);
        Object term633 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term633, term633.getClass(), "cart", "");
        setField(term633, term633.getClass(), "color", "");
        setField(term633, term633.getClass(), "jobName", "");
        setField(term633, term633.getClass(), "message", "");
        setField(term633, term633.getClass(), "messageId", "");
        setField(term633, term633.getClass(), "replyId", "");
        setField(term633, term633.getClass(), "system", "");
        setField(term633, term633.getClass(), "type", "");
        setField(term633, term633.getClass(), "subType", "");
        setField(term633, term633.getClass(), "time", "");
        setField(term633, term633.getClass(), "timeStamp", term644);
        ArrayList term592 = new ArrayList();
        ((ArrayList) term592).add(term594);
        ((ArrayList) term592).add(term607);
        ((ArrayList) term592).add(term620);
        ((ArrayList) term592).add(term633);
        term576 = newInstance(Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse"));
        setLongField(term576, term576.getClass(), "timeZone", 4872422362414183754L);
        setLongField(term576, term576.getClass(), "nextTimeStamp", 6811161968424632369L);
        setField(term576, term576.getClass(), "source", "pXOkjyeIRb");
        setLongField(term576, term576.getClass(), "totalItems", -7237588299778557629L);
        setField(term576, term576.getClass(), "items", term592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term576, args);
    }

};


