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

public class DanMuSenderTaskSelector_setStartVideoCreatedTime_4532111622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term177;

    public DanMuSenderTaskSelector_setStartVideoCreatedTime_4532111622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105 = new Long(-4325723315152823407L);
        Long term107 = new Long(2535595959091595249L);
        Long term109 = new Long(-5476826692763582090L);
        Long term111 = new Long(-872011222785455006L);
        Long term113 = new Long(-316468845751588286L);
        Long term115 = new Long(5127676408959197577L);
        Long term117 = new Long(-6573104506744284592L);
        Long term119 = new Long(-4920224193275732920L);
        Integer term121 = new Integer(1162663216);
        Long term159 = new Long(8428634514691209827L);
        Long term161 = new Long(0L);
        Long term163 = new Long(0L);
        Integer term165 = new Integer(0);
        Boolean term167 = new Boolean(false);
        Boolean term169 = new Boolean(false);
        Long term171 = new Long(-2585684163342970173L);
        Long term173 = new Long(8059786003080744426L);
        Long term175 = new Long(-4365849114644724155L);
        term104 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term104, term104.getClass(), "startCreateTime", term105);
        setField(term104, term104.getClass(), "endCreateTime", term107);
        setField(term104, term104.getClass(), "startUpdateTime", term109);
        setField(term104, term104.getClass(), "endUpdateTime", term111);
        setField(term104, term104.getClass(), "startFinishTime", term113);
        setField(term104, term104.getClass(), "endFinishTime", term115);
        setField(term104, term104.getClass(), "startVideoCreatedTime", term117);
        setField(term104, term104.getClass(), "endVideoCreatedTime", term119);
        setField(term104, term104.getClass(), "id", term121);
        setField(term104, term104.getClass(), "platform", "xxtlPwDYFs");
        setField(term104, term104.getClass(), "videoCreatorUid", "jJCZpVmanW");
        setField(term104, term104.getClass(), "videoId", "EGtDIRbSSb");
        setField(term104, term104.getClass(), "videoCreatedTime", term159);
        setField(term104, term104.getClass(), "danmuTotalNum", term161);
        setField(term104, term104.getClass(), "danmuSentNum", term163);
        setField(term104, term104.getClass(), "pageSize", term165);
        setField(term104, term104.getClass(), "skip", term167);
        setField(term104, term104.getClass(), "taskFail", term169);
        setField(term104, term104.getClass(), "createTime", term171);
        setField(term104, term104.getClass(), "updateTime", term173);
        setField(term104, term104.getClass(), "finishTime", term175);
        term177 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term177;
        callMethod(klass, "setStartVideoCreatedTime", argTypes, term104, args);
    }

};


