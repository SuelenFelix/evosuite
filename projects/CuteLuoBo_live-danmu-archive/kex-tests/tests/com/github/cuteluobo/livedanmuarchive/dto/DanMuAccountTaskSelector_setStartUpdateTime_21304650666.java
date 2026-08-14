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

public class DanMuAccountTaskSelector_setStartUpdateTime_21304650666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2100;
     Object term2163;

    public DanMuAccountTaskSelector_setStartUpdateTime_21304650666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2101 = new Long(-1635471392209071620L);
        Long term2103 = new Long(-4714000263923324167L);
        Long term2105 = new Long(6906379511067694917L);
        Long term2107 = new Long(-9204303423581447271L);
        Long term2109 = new Long(6248239231585852341L);
        Long term2111 = new Long(-88538481937688851L);
        Integer term2149 = new Integer(0);
        Integer term2151 = new Integer(0);
        Integer term2117 = new Integer(1632125673);
        Integer term2119 = new Integer(454281060);
        Integer term2145 = new Integer(-1786399638);
        Long term2147 = new Long(4069264186851023313L);
        Integer term2153 = new Integer(2055867847);
        Boolean term2155 = new Boolean(false);
        Long term2157 = new Long(5184635470881147510L);
        Long term2159 = new Long(918397384129253729L);
        Long term2161 = new Long(-2187638136407967948L);
        term2100 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2100, term2100.getClass(), "startCreateTime", term2101);
        setField(term2100, term2100.getClass(), "endCreateTime", term2103);
        setField(term2100, term2100.getClass(), "startUpdateTime", term2105);
        setField(term2100, term2100.getClass(), "endUpdateTime", term2107);
        setField(term2100, term2100.getClass(), "startFinishTime", term2109);
        setField(term2100, term2100.getClass(), "endFinishTime", term2111);
        setField(term2100, term2100.getClass(), "pageIndex", term2149);
        setField(term2100, term2100.getClass(), "pageSize", term2151);
        setField(term2100, term2100.getClass(), "id", term2117);
        setField(term2100, term2100.getClass(), "danmuSenderTaskId", term2119);
        setField(term2100, term2100.getClass(), "senderUid", "ytSBIKXogI");
        setField(term2100, term2100.getClass(), "videoId", "nHXjMycHlU");
        setField(term2100, term2100.getClass(), "lastVideoPartIndex", term2145);
        setField(term2100, term2100.getClass(), "lastVideoPartCid", term2147);
        setField(term2100, term2100.getClass(), "lastDanmuIndex", term2153);
        setField(term2100, term2100.getClass(), "stop", term2155);
        setField(term2100, term2100.getClass(), "createTime", term2157);
        setField(term2100, term2100.getClass(), "updateTime", term2159);
        setField(term2100, term2100.getClass(), "finishTime", term2161);
        term2163 = new Long(8708846223293804408L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2163;
        callMethod(klass, "setStartUpdateTime", argTypes, term2100, args);
    }

};


