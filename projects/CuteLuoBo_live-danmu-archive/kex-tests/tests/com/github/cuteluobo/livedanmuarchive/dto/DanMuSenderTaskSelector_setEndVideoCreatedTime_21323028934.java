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

public class DanMuSenderTaskSelector_setEndVideoCreatedTime_21323028934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term385;

    public DanMuSenderTaskSelector_setEndVideoCreatedTime_21323028934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313 = new Long(1439298019805881866L);
        Long term315 = new Long(-8708192233349544946L);
        Long term317 = new Long(5907001541142728739L);
        Long term319 = new Long(4178434741742309755L);
        Long term321 = new Long(-2068172595987555756L);
        Long term323 = new Long(-6292278961887936280L);
        Long term325 = new Long(-6645965768855543712L);
        Long term327 = new Long(4784595517102746672L);
        Integer term329 = new Integer(391863371);
        Long term367 = new Long(-7612550318181586304L);
        Long term369 = new Long(0L);
        Long term371 = new Long(0L);
        Integer term373 = new Integer(0);
        Boolean term375 = new Boolean(false);
        Boolean term377 = new Boolean(false);
        Long term379 = new Long(-2170847986967241072L);
        Long term381 = new Long(4044358158040652353L);
        Long term383 = new Long(-4443169559037975007L);
        term312 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term312, term312.getClass(), "startCreateTime", term313);
        setField(term312, term312.getClass(), "endCreateTime", term315);
        setField(term312, term312.getClass(), "startUpdateTime", term317);
        setField(term312, term312.getClass(), "endUpdateTime", term319);
        setField(term312, term312.getClass(), "startFinishTime", term321);
        setField(term312, term312.getClass(), "endFinishTime", term323);
        setField(term312, term312.getClass(), "startVideoCreatedTime", term325);
        setField(term312, term312.getClass(), "endVideoCreatedTime", term327);
        setField(term312, term312.getClass(), "id", term329);
        setField(term312, term312.getClass(), "platform", "RMFIsYGgne");
        setField(term312, term312.getClass(), "videoCreatorUid", "NRdvgJlhkX");
        setField(term312, term312.getClass(), "videoId", "uuaPigETmJ");
        setField(term312, term312.getClass(), "videoCreatedTime", term367);
        setField(term312, term312.getClass(), "danmuTotalNum", term369);
        setField(term312, term312.getClass(), "danmuSentNum", term371);
        setField(term312, term312.getClass(), "pageSize", term373);
        setField(term312, term312.getClass(), "skip", term375);
        setField(term312, term312.getClass(), "taskFail", term377);
        setField(term312, term312.getClass(), "createTime", term379);
        setField(term312, term312.getClass(), "updateTime", term381);
        setField(term312, term312.getClass(), "finishTime", term383);
        term385 = new Long(-3842548265506930260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term385;
        callMethod(klass, "setEndVideoCreatedTime", argTypes, term312, args);
    }

};


