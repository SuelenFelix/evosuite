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

public class DanMuSenderTaskSelector_getStartUpdateTime_21461471165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public DanMuSenderTaskSelector_getStartUpdateTime_21461471165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term418 = new Long(-5788180182343976541L);
        Long term420 = new Long(2936323121573284007L);
        Long term422 = new Long(-1154553077993834885L);
        Long term424 = new Long(-2850532706972744550L);
        Long term426 = new Long(-2644215923136513282L);
        Long term428 = new Long(-1468719814009985452L);
        Long term430 = new Long(-7738503207562305297L);
        Long term432 = new Long(3825396310311739952L);
        Integer term434 = new Integer(-1922583790);
        Long term472 = new Long(-3838084482494604218L);
        Long term474 = new Long(0L);
        Long term476 = new Long(0L);
        Integer term478 = new Integer(0);
        Boolean term480 = new Boolean(false);
        Boolean term482 = new Boolean(false);
        Long term484 = new Long(3892018155439224435L);
        Long term486 = new Long(5953383087795962419L);
        Long term488 = new Long(7994303628307559416L);
        term417 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term417, term417.getClass(), "startCreateTime", term418);
        setField(term417, term417.getClass(), "endCreateTime", term420);
        setField(term417, term417.getClass(), "startUpdateTime", term422);
        setField(term417, term417.getClass(), "endUpdateTime", term424);
        setField(term417, term417.getClass(), "startFinishTime", term426);
        setField(term417, term417.getClass(), "endFinishTime", term428);
        setField(term417, term417.getClass(), "startVideoCreatedTime", term430);
        setField(term417, term417.getClass(), "endVideoCreatedTime", term432);
        setField(term417, term417.getClass(), "id", term434);
        setField(term417, term417.getClass(), "platform", "MxlszYVzRf");
        setField(term417, term417.getClass(), "videoCreatorUid", "LQFpaHEwXR");
        setField(term417, term417.getClass(), "videoId", "oVcInYnLWB");
        setField(term417, term417.getClass(), "videoCreatedTime", term472);
        setField(term417, term417.getClass(), "danmuTotalNum", term474);
        setField(term417, term417.getClass(), "danmuSentNum", term476);
        setField(term417, term417.getClass(), "pageSize", term478);
        setField(term417, term417.getClass(), "skip", term480);
        setField(term417, term417.getClass(), "taskFail", term482);
        setField(term417, term417.getClass(), "createTime", term484);
        setField(term417, term417.getClass(), "updateTime", term486);
        setField(term417, term417.getClass(), "finishTime", term488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartUpdateTime", argTypes, term417, args);
    }

};


