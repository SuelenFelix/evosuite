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
import java.lang.Long;
import java.util.LinkedList;
import java.lang.Object;

public class ZosLogResponse_init_10374876660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term17;
     Object term19;

    public ZosLogResponse_init_10374876660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term3 = new Long(6375119433582206027L);
        term17 = new Long(-8257434502486459194L);
        Long term143 = new Long(-8400487765614892086L);
        Object term22 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term22, term22.getClass(), "cart", "sjlJAEtRrb");
        setField(term22, term22.getClass(), "color", "MuLcgQHgqz");
        setField(term22, term22.getClass(), "jobName", "xxtlPwDYFs");
        setField(term22, term22.getClass(), "message", "jJCZpVmanW");
        setField(term22, term22.getClass(), "messageId", "EGtDIRbSSb");
        setField(term22, term22.getClass(), "replyId", "SzjVpOQTyS");
        setField(term22, term22.getClass(), "system", "MjGYSRKTNF");
        setField(term22, term22.getClass(), "type", "hRNSzYYIrc");
        setField(term22, term22.getClass(), "subType", "RMFIsYGgne");
        setField(term22, term22.getClass(), "time", "NRdvgJlhkX");
        setField(term22, term22.getClass(), "timeStamp", term143);
        Long term157 = new Long(5270370404989704783L);
        Object term146 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term146, term146.getClass(), "cart", "");
        setField(term146, term146.getClass(), "color", "");
        setField(term146, term146.getClass(), "jobName", "");
        setField(term146, term146.getClass(), "message", "");
        setField(term146, term146.getClass(), "messageId", "");
        setField(term146, term146.getClass(), "replyId", "");
        setField(term146, term146.getClass(), "system", "");
        setField(term146, term146.getClass(), "type", "");
        setField(term146, term146.getClass(), "subType", "");
        setField(term146, term146.getClass(), "time", "");
        setField(term146, term146.getClass(), "timeStamp", term157);
        Long term161 = new Long(7411271909051562686L);
        Object term160 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term160, term160.getClass(), "cart", null);
        setField(term160, term160.getClass(), "color", null);
        setField(term160, term160.getClass(), "jobName", null);
        setField(term160, term160.getClass(), "message", null);
        setField(term160, term160.getClass(), "messageId", null);
        setField(term160, term160.getClass(), "replyId", null);
        setField(term160, term160.getClass(), "system", null);
        setField(term160, term160.getClass(), "type", null);
        setField(term160, term160.getClass(), "subType", null);
        setField(term160, term160.getClass(), "time", null);
        setField(term160, term160.getClass(), "timeStamp", term161);
        term19 = new LinkedList();
        ((LinkedList) term19).add(term22);
        ((LinkedList) term19).add(term146);
        ((LinkedList) term19).add(term160);
        ((LinkedList) term19).add((Object)null);
        ((LinkedList) term19).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term1;
        args[1] = term3;
        args[2] = "PAEBtnZtTD";
        args[3] = term17;
        args[4] = term19;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


