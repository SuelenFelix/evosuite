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

public class DanMuSenderTaskSelector_getStartFinishTime_15784630949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833;

    public DanMuSenderTaskSelector_getStartFinishTime_15784630949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term834 = new Long(-5216789073301458893L);
        Long term836 = new Long(-1832940336320585644L);
        Long term838 = new Long(-8033714905181142681L);
        Long term840 = new Long(-9040825890007374809L);
        Long term842 = new Long(1368340889161782793L);
        Long term844 = new Long(-5786861555969446503L);
        Long term846 = new Long(2354625302846375590L);
        Long term848 = new Long(7276637106827860087L);
        Integer term850 = new Integer(1227103734);
        Long term888 = new Long(-3936701866695933852L);
        Long term890 = new Long(0L);
        Long term892 = new Long(0L);
        Integer term894 = new Integer(0);
        Boolean term896 = new Boolean(false);
        Boolean term898 = new Boolean(false);
        Long term900 = new Long(1215116475929634177L);
        Long term902 = new Long(1597484336218508869L);
        Long term904 = new Long(-685023850445639859L);
        term833 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term833, term833.getClass(), "startCreateTime", term834);
        setField(term833, term833.getClass(), "endCreateTime", term836);
        setField(term833, term833.getClass(), "startUpdateTime", term838);
        setField(term833, term833.getClass(), "endUpdateTime", term840);
        setField(term833, term833.getClass(), "startFinishTime", term842);
        setField(term833, term833.getClass(), "endFinishTime", term844);
        setField(term833, term833.getClass(), "startVideoCreatedTime", term846);
        setField(term833, term833.getClass(), "endVideoCreatedTime", term848);
        setField(term833, term833.getClass(), "id", term850);
        setField(term833, term833.getClass(), "platform", "BYqFIqCKAV");
        setField(term833, term833.getClass(), "videoCreatorUid", "vrQLuWIDJX");
        setField(term833, term833.getClass(), "videoId", "flxyYxBRtu");
        setField(term833, term833.getClass(), "videoCreatedTime", term888);
        setField(term833, term833.getClass(), "danmuTotalNum", term890);
        setField(term833, term833.getClass(), "danmuSentNum", term892);
        setField(term833, term833.getClass(), "pageSize", term894);
        setField(term833, term833.getClass(), "skip", term896);
        setField(term833, term833.getClass(), "taskFail", term898);
        setField(term833, term833.getClass(), "createTime", term900);
        setField(term833, term833.getClass(), "updateTime", term902);
        setField(term833, term833.getClass(), "finishTime", term904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartFinishTime", argTypes, term833, args);
    }

};


