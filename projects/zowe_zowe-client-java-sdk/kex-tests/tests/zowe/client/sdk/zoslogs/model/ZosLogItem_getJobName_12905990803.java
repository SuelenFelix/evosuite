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

public class ZosLogItem_getJobName_12905990803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;

    public ZosLogItem_getJobName_12905990803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term790 = new Long(-8400487765614892086L);
        term669 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term669, term669.getClass(), "cart", "OWDIEULEFu");
        setField(term669, term669.getClass(), "color", "dWRymuLBtr");
        setField(term669, term669.getClass(), "jobName", "AijpHYOFuy");
        setField(term669, term669.getClass(), "message", "SbAoxhfrkn");
        setField(term669, term669.getClass(), "messageId", "kuTXqwMtDB");
        setField(term669, term669.getClass(), "replyId", "Ghbwtircqb");
        setField(term669, term669.getClass(), "system", "xrwlQZdwCp");
        setField(term669, term669.getClass(), "type", "IDCWpPLRkE");
        setField(term669, term669.getClass(), "subType", "nyiiPDVjAc");
        setField(term669, term669.getClass(), "time", "aKnKipADSo");
        setField(term669, term669.getClass(), "timeStamp", term790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobName", argTypes, term669, args);
    }

};


