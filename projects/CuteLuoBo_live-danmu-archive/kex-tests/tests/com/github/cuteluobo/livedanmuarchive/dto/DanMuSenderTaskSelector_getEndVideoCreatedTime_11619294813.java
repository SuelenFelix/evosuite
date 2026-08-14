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

public class DanMuSenderTaskSelector_getEndVideoCreatedTime_11619294813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public DanMuSenderTaskSelector_getEndVideoCreatedTime_11619294813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210 = new Long(7009926388951271268L);
        Long term212 = new Long(-7672528020740371001L);
        Long term214 = new Long(-4502405999831680926L);
        Long term216 = new Long(1967728129628047933L);
        Long term218 = new Long(2120084523938730454L);
        Long term220 = new Long(6855071767938501807L);
        Long term222 = new Long(-5892135042702373494L);
        Long term224 = new Long(5262507301787091109L);
        Integer term226 = new Integer(1484323161);
        Long term264 = new Long(-6823727938421990489L);
        Long term266 = new Long(0L);
        Long term268 = new Long(0L);
        Integer term270 = new Integer(0);
        Boolean term272 = new Boolean(false);
        Boolean term274 = new Boolean(false);
        Long term276 = new Long(-484994522244390100L);
        Long term278 = new Long(1233889271256172047L);
        Long term280 = new Long(6617340557564669657L);
        term209 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term209, term209.getClass(), "startCreateTime", term210);
        setField(term209, term209.getClass(), "endCreateTime", term212);
        setField(term209, term209.getClass(), "startUpdateTime", term214);
        setField(term209, term209.getClass(), "endUpdateTime", term216);
        setField(term209, term209.getClass(), "startFinishTime", term218);
        setField(term209, term209.getClass(), "endFinishTime", term220);
        setField(term209, term209.getClass(), "startVideoCreatedTime", term222);
        setField(term209, term209.getClass(), "endVideoCreatedTime", term224);
        setField(term209, term209.getClass(), "id", term226);
        setField(term209, term209.getClass(), "platform", "SzjVpOQTyS");
        setField(term209, term209.getClass(), "videoCreatorUid", "MjGYSRKTNF");
        setField(term209, term209.getClass(), "videoId", "hRNSzYYIrc");
        setField(term209, term209.getClass(), "videoCreatedTime", term264);
        setField(term209, term209.getClass(), "danmuTotalNum", term266);
        setField(term209, term209.getClass(), "danmuSentNum", term268);
        setField(term209, term209.getClass(), "pageSize", term270);
        setField(term209, term209.getClass(), "skip", term272);
        setField(term209, term209.getClass(), "taskFail", term274);
        setField(term209, term209.getClass(), "createTime", term276);
        setField(term209, term209.getClass(), "updateTime", term278);
        setField(term209, term209.getClass(), "finishTime", term280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndVideoCreatedTime", argTypes, term209, args);
    }

};


