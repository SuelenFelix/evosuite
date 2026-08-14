package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuSenderTaskSelector_setStartFinishTime_152261164810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936;
     Object term1009;

    public DanMuSenderTaskSelector_setStartFinishTime_152261164810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term937 = new Long(-6950146046121430355L);
        Long term939 = new Long(1667122142089513324L);
        Long term941 = new Long(-6342139649364011743L);
        Long term943 = new Long(-4924950707540628022L);
        Long term945 = new Long(-4393710401270724527L);
        Long term947 = new Long(-4822736661741380518L);
        Long term949 = new Long(-5386201758403679145L);
        Long term951 = new Long(-7268507582722666254L);
        Integer term953 = new Integer(-1339778481);
        Long term991 = new Long(5671808784468963649L);
        Long term993 = new Long(0L);
        Long term995 = new Long(0L);
        Integer term997 = new Integer(0);
        Boolean term999 = new Boolean(false);
        Boolean term1001 = new Boolean(false);
        Long term1003 = new Long(2297097306706899827L);
        Long term1005 = new Long(-900457279156388404L);
        Long term1007 = new Long(1084801489398441516L);
        term936 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term936, term936.getClass(), "startCreateTime", term937);
        setField(term936, term936.getClass(), "endCreateTime", term939);
        setField(term936, term936.getClass(), "startUpdateTime", term941);
        setField(term936, term936.getClass(), "endUpdateTime", term943);
        setField(term936, term936.getClass(), "startFinishTime", term945);
        setField(term936, term936.getClass(), "endFinishTime", term947);
        setField(term936, term936.getClass(), "startVideoCreatedTime", term949);
        setField(term936, term936.getClass(), "endVideoCreatedTime", term951);
        setField(term936, term936.getClass(), "id", term953);
        setField(term936, term936.getClass(), "platform", "OclPbYPkcH");
        setField(term936, term936.getClass(), "videoCreatorUid", "IoAlmYsBwc");
        setField(term936, term936.getClass(), "videoId", "TEParAifyi");
        setField(term936, term936.getClass(), "videoCreatedTime", term991);
        setField(term936, term936.getClass(), "danmuTotalNum", term993);
        setField(term936, term936.getClass(), "danmuSentNum", term995);
        setField(term936, term936.getClass(), "pageSize", term997);
        setField(term936, term936.getClass(), "skip", term999);
        setField(term936, term936.getClass(), "taskFail", term1001);
        setField(term936, term936.getClass(), "createTime", term1003);
        setField(term936, term936.getClass(), "updateTime", term1005);
        setField(term936, term936.getClass(), "finishTime", term1007);
        term1009 = new Long(6273754186658578034L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1009;
        callMethod(klass, "setStartFinishTime", argTypes, term936, args);
    }

};


