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

public class DanMuSenderTaskSelector_getStartVideoCreatedTime_17238424801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DanMuSenderTaskSelector_getStartVideoCreatedTime_17238424801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term4 = new Long(6375119433582206027L);
        Long term6 = new Long(-8257434502486459194L);
        Long term8 = new Long(-8400487765614892086L);
        Long term10 = new Long(5270370404989704783L);
        Long term12 = new Long(7411271909051562686L);
        Long term14 = new Long(4872422362414183754L);
        Long term16 = new Long(6811161968424632369L);
        Integer term18 = new Integer(568599855);
        Long term56 = new Long(-7237588299778557629L);
        Long term58 = new Long(0L);
        Long term60 = new Long(0L);
        Integer term62 = new Integer(0);
        Boolean term64 = new Boolean(false);
        Boolean term66 = new Boolean(false);
        Long term68 = new Long(6967924379644551255L);
        Long term70 = new Long(-2813493605142626659L);
        Long term72 = new Long(-8885298608300233488L);
        term1 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1, term1.getClass(), "startCreateTime", term2);
        setField(term1, term1.getClass(), "endCreateTime", term4);
        setField(term1, term1.getClass(), "startUpdateTime", term6);
        setField(term1, term1.getClass(), "endUpdateTime", term8);
        setField(term1, term1.getClass(), "startFinishTime", term10);
        setField(term1, term1.getClass(), "endFinishTime", term12);
        setField(term1, term1.getClass(), "startVideoCreatedTime", term14);
        setField(term1, term1.getClass(), "endVideoCreatedTime", term16);
        setField(term1, term1.getClass(), "id", term18);
        setField(term1, term1.getClass(), "platform", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "videoCreatorUid", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "videoId", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "videoCreatedTime", term56);
        setField(term1, term1.getClass(), "danmuTotalNum", term58);
        setField(term1, term1.getClass(), "danmuSentNum", term60);
        setField(term1, term1.getClass(), "pageSize", term62);
        setField(term1, term1.getClass(), "skip", term64);
        setField(term1, term1.getClass(), "taskFail", term66);
        setField(term1, term1.getClass(), "createTime", term68);
        setField(term1, term1.getClass(), "updateTime", term70);
        setField(term1, term1.getClass(), "finishTime", term72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartVideoCreatedTime", argTypes, term1, args);
    }

};


