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

public class DanMuSenderTaskSelector_setStartUpdateTime_9549276266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520;
     Object term593;

    public DanMuSenderTaskSelector_setStartUpdateTime_9549276266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term521 = new Long(2443640364875054177L);
        Long term523 = new Long(-1610676979013636850L);
        Long term525 = new Long(2062173786000223358L);
        Long term527 = new Long(-8658027316505137504L);
        Long term529 = new Long(414749984815662075L);
        Long term531 = new Long(463622836963501975L);
        Long term533 = new Long(305759998609888272L);
        Long term535 = new Long(-8654565919063661957L);
        Integer term537 = new Integer(-616727354);
        Long term575 = new Long(-5248475803419977214L);
        Long term577 = new Long(0L);
        Long term579 = new Long(0L);
        Integer term581 = new Integer(0);
        Boolean term583 = new Boolean(false);
        Boolean term585 = new Boolean(false);
        Long term587 = new Long(-6723783499250797216L);
        Long term589 = new Long(41775768178052008L);
        Long term591 = new Long(6682528376118987775L);
        term520 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term520, term520.getClass(), "startCreateTime", term521);
        setField(term520, term520.getClass(), "endCreateTime", term523);
        setField(term520, term520.getClass(), "startUpdateTime", term525);
        setField(term520, term520.getClass(), "endUpdateTime", term527);
        setField(term520, term520.getClass(), "startFinishTime", term529);
        setField(term520, term520.getClass(), "endFinishTime", term531);
        setField(term520, term520.getClass(), "startVideoCreatedTime", term533);
        setField(term520, term520.getClass(), "endVideoCreatedTime", term535);
        setField(term520, term520.getClass(), "id", term537);
        setField(term520, term520.getClass(), "platform", "aJlieCFVtF");
        setField(term520, term520.getClass(), "videoCreatorUid", "ZiaGIbnzTs");
        setField(term520, term520.getClass(), "videoId", "tbcdzjIfER");
        setField(term520, term520.getClass(), "videoCreatedTime", term575);
        setField(term520, term520.getClass(), "danmuTotalNum", term577);
        setField(term520, term520.getClass(), "danmuSentNum", term579);
        setField(term520, term520.getClass(), "pageSize", term581);
        setField(term520, term520.getClass(), "skip", term583);
        setField(term520, term520.getClass(), "taskFail", term585);
        setField(term520, term520.getClass(), "createTime", term587);
        setField(term520, term520.getClass(), "updateTime", term589);
        setField(term520, term520.getClass(), "finishTime", term591);
        term593 = new Long(682356318767179819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term593;
        callMethod(klass, "setStartUpdateTime", argTypes, term520, args);
    }

};


