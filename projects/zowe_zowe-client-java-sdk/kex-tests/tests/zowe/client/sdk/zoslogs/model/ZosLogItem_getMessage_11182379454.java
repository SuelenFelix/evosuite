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

public class ZosLogItem_getMessage_11182379454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;

    public ZosLogItem_getMessage_11182379454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1013 = new Long(5270370404989704783L);
        term892 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term892, term892.getClass(), "cart", "wSQxaModmm");
        setField(term892, term892.getClass(), "color", "UlajhuVLaP");
        setField(term892, term892.getClass(), "jobName", "gGSMzuGICf");
        setField(term892, term892.getClass(), "message", "hxCBltsObl");
        setField(term892, term892.getClass(), "messageId", "BndsHwAFMv");
        setField(term892, term892.getClass(), "replyId", "GzFkzHGYFt");
        setField(term892, term892.getClass(), "system", "tShwQLRGNe");
        setField(term892, term892.getClass(), "type", "LvtrsXUliU");
        setField(term892, term892.getClass(), "subType", "xLbjWUgOIL");
        setField(term892, term892.getClass(), "time", "jDtqGUpnZN");
        setField(term892, term892.getClass(), "timeStamp", term1013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term892, args);
    }

};


