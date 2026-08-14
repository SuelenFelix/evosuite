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

public class ZosLogResponse_getTotalItems_12978671794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;

    public ZosLogResponse_getTotalItems_12978671794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term687 = new Long(-2585684163342970173L);
        Object term676 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term676, term676.getClass(), "cart", "");
        setField(term676, term676.getClass(), "color", "");
        setField(term676, term676.getClass(), "jobName", "");
        setField(term676, term676.getClass(), "message", "");
        setField(term676, term676.getClass(), "messageId", "");
        setField(term676, term676.getClass(), "replyId", "");
        setField(term676, term676.getClass(), "system", "");
        setField(term676, term676.getClass(), "type", "");
        setField(term676, term676.getClass(), "subType", "");
        setField(term676, term676.getClass(), "time", "");
        setField(term676, term676.getClass(), "timeStamp", term687);
        Long term700 = new Long(8059786003080744426L);
        Object term689 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term689, term689.getClass(), "cart", "");
        setField(term689, term689.getClass(), "color", "");
        setField(term689, term689.getClass(), "jobName", "");
        setField(term689, term689.getClass(), "message", "");
        setField(term689, term689.getClass(), "messageId", "");
        setField(term689, term689.getClass(), "replyId", "");
        setField(term689, term689.getClass(), "system", "");
        setField(term689, term689.getClass(), "type", "");
        setField(term689, term689.getClass(), "subType", "");
        setField(term689, term689.getClass(), "time", "");
        setField(term689, term689.getClass(), "timeStamp", term700);
        Long term713 = new Long(-4365849114644724155L);
        Object term702 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term702, term702.getClass(), "cart", "");
        setField(term702, term702.getClass(), "color", "");
        setField(term702, term702.getClass(), "jobName", "");
        setField(term702, term702.getClass(), "message", "");
        setField(term702, term702.getClass(), "messageId", "");
        setField(term702, term702.getClass(), "replyId", "");
        setField(term702, term702.getClass(), "system", "");
        setField(term702, term702.getClass(), "type", "");
        setField(term702, term702.getClass(), "subType", "");
        setField(term702, term702.getClass(), "time", "");
        setField(term702, term702.getClass(), "timeStamp", term713);
        Long term726 = new Long(2486810210675247493L);
        Object term715 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term715, term715.getClass(), "cart", "");
        setField(term715, term715.getClass(), "color", "");
        setField(term715, term715.getClass(), "jobName", "");
        setField(term715, term715.getClass(), "message", "");
        setField(term715, term715.getClass(), "messageId", "");
        setField(term715, term715.getClass(), "replyId", "");
        setField(term715, term715.getClass(), "system", "");
        setField(term715, term715.getClass(), "type", "");
        setField(term715, term715.getClass(), "subType", "");
        setField(term715, term715.getClass(), "time", "");
        setField(term715, term715.getClass(), "timeStamp", term726);
        Long term739 = new Long(7009926388951271268L);
        Object term728 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term728, term728.getClass(), "cart", "");
        setField(term728, term728.getClass(), "color", "");
        setField(term728, term728.getClass(), "jobName", "");
        setField(term728, term728.getClass(), "message", "");
        setField(term728, term728.getClass(), "messageId", "");
        setField(term728, term728.getClass(), "replyId", "");
        setField(term728, term728.getClass(), "system", "");
        setField(term728, term728.getClass(), "type", "");
        setField(term728, term728.getClass(), "subType", "");
        setField(term728, term728.getClass(), "time", "");
        setField(term728, term728.getClass(), "timeStamp", term739);
        ArrayList term674 = new ArrayList();
        ((ArrayList) term674).add(term676);
        ((ArrayList) term674).add(term689);
        ((ArrayList) term674).add(term702);
        ((ArrayList) term674).add(term715);
        ((ArrayList) term674).add(term728);
        term658 = newInstance(Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse"));
        setLongField(term658, term658.getClass(), "timeZone", 6967924379644551255L);
        setLongField(term658, term658.getClass(), "nextTimeStamp", -2813493605142626659L);
        setField(term658, term658.getClass(), "source", "RbVQXSpxXy");
        setLongField(term658, term658.getClass(), "totalItems", -8885298608300233488L);
        setField(term658, term658.getClass(), "items", term674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalItems", argTypes, term658, args);
    }

};


