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

public class DanMuSenderTaskSelector_getEndUpdateTime_17705378197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;

    public DanMuSenderTaskSelector_getEndUpdateTime_17705378197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term626 = new Long(-7291743527973326814L);
        Long term628 = new Long(-5963439350418910964L);
        Long term630 = new Long(9013624480170062917L);
        Long term632 = new Long(7862575738391801707L);
        Long term634 = new Long(50358265865610362L);
        Long term636 = new Long(5510783420697225605L);
        Long term638 = new Long(6005241913654469005L);
        Long term640 = new Long(-1983291584002806658L);
        Integer term642 = new Integer(-1955890973);
        Long term680 = new Long(5946780097489996391L);
        Long term682 = new Long(0L);
        Long term684 = new Long(0L);
        Integer term686 = new Integer(0);
        Boolean term688 = new Boolean(false);
        Boolean term690 = new Boolean(false);
        Long term692 = new Long(-8652538484981166496L);
        Long term694 = new Long(2701184207686293431L);
        Long term696 = new Long(4474998035090263139L);
        term625 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term625, term625.getClass(), "startCreateTime", term626);
        setField(term625, term625.getClass(), "endCreateTime", term628);
        setField(term625, term625.getClass(), "startUpdateTime", term630);
        setField(term625, term625.getClass(), "endUpdateTime", term632);
        setField(term625, term625.getClass(), "startFinishTime", term634);
        setField(term625, term625.getClass(), "endFinishTime", term636);
        setField(term625, term625.getClass(), "startVideoCreatedTime", term638);
        setField(term625, term625.getClass(), "endVideoCreatedTime", term640);
        setField(term625, term625.getClass(), "id", term642);
        setField(term625, term625.getClass(), "platform", "HyxfbSQYBe");
        setField(term625, term625.getClass(), "videoCreatorUid", "pCTimMblYc");
        setField(term625, term625.getClass(), "videoId", "hNxWaHcfhY");
        setField(term625, term625.getClass(), "videoCreatedTime", term680);
        setField(term625, term625.getClass(), "danmuTotalNum", term682);
        setField(term625, term625.getClass(), "danmuSentNum", term684);
        setField(term625, term625.getClass(), "pageSize", term686);
        setField(term625, term625.getClass(), "skip", term688);
        setField(term625, term625.getClass(), "taskFail", term690);
        setField(term625, term625.getClass(), "createTime", term692);
        setField(term625, term625.getClass(), "updateTime", term694);
        setField(term625, term625.getClass(), "finishTime", term696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndUpdateTime", argTypes, term625, args);
    }

};


