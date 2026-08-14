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

public class DanMuAccountTaskSelector_getEndUpdateTime_13488920377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2185;

    public DanMuAccountTaskSelector_getEndUpdateTime_13488920377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2186 = new Long(-2986201902216133814L);
        Long term2188 = new Long(4255811647459029682L);
        Long term2190 = new Long(8000844860910174690L);
        Long term2192 = new Long(2209808079059619773L);
        Long term2194 = new Long(8403492202041709902L);
        Long term2196 = new Long(-113028659747841511L);
        Integer term2234 = new Integer(0);
        Integer term2236 = new Integer(0);
        Integer term2202 = new Integer(458147407);
        Integer term2204 = new Integer(-184153539);
        Integer term2230 = new Integer(493620644);
        Long term2232 = new Long(7271112616766426991L);
        Integer term2238 = new Integer(1328271830);
        Boolean term2240 = new Boolean(false);
        Long term2242 = new Long(-8514728180792822493L);
        Long term2244 = new Long(5315236285592892506L);
        Long term2246 = new Long(-6969704322644192945L);
        term2185 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2185, term2185.getClass(), "startCreateTime", term2186);
        setField(term2185, term2185.getClass(), "endCreateTime", term2188);
        setField(term2185, term2185.getClass(), "startUpdateTime", term2190);
        setField(term2185, term2185.getClass(), "endUpdateTime", term2192);
        setField(term2185, term2185.getClass(), "startFinishTime", term2194);
        setField(term2185, term2185.getClass(), "endFinishTime", term2196);
        setField(term2185, term2185.getClass(), "pageIndex", term2234);
        setField(term2185, term2185.getClass(), "pageSize", term2236);
        setField(term2185, term2185.getClass(), "id", term2202);
        setField(term2185, term2185.getClass(), "danmuSenderTaskId", term2204);
        setField(term2185, term2185.getClass(), "senderUid", "ieCtQFdkii");
        setField(term2185, term2185.getClass(), "videoId", "dEnhdmILtU");
        setField(term2185, term2185.getClass(), "lastVideoPartIndex", term2230);
        setField(term2185, term2185.getClass(), "lastVideoPartCid", term2232);
        setField(term2185, term2185.getClass(), "lastDanmuIndex", term2238);
        setField(term2185, term2185.getClass(), "stop", term2240);
        setField(term2185, term2185.getClass(), "createTime", term2242);
        setField(term2185, term2185.getClass(), "updateTime", term2244);
        setField(term2185, term2185.getClass(), "finishTime", term2246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndUpdateTime", argTypes, term2185, args);
    }

};


