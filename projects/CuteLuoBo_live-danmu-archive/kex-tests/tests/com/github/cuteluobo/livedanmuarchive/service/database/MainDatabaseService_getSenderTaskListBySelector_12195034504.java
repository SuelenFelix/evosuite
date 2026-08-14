package com.github.cuteluobo.livedanmuarchive.service.database;

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
import static com.github.cuteluobo.livedanmuarchive.service.database.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class MainDatabaseService_getSenderTaskListBySelector_12195034504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public MainDatabaseService_getSenderTaskListBySelector_12195034504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term176 = new Long(-7237588299778557629L);
        Long term178 = new Long(6967924379644551255L);
        Long term180 = new Long(-2813493605142626659L);
        Long term182 = new Long(-8885298608300233488L);
        Long term184 = new Long(-4325723315152823407L);
        Long term186 = new Long(2535595959091595249L);
        Long term188 = new Long(-5476826692763582090L);
        Long term190 = new Long(-872011222785455006L);
        Integer term192 = new Integer(1484323161);
        Long term230 = new Long(-316468845751588286L);
        Long term232 = new Long(0L);
        Long term234 = new Long(0L);
        Integer term236 = new Integer(0);
        Boolean term238 = new Boolean(false);
        Boolean term240 = new Boolean(false);
        Long term242 = new Long(5127676408959197577L);
        Long term244 = new Long(-6573104506744284592L);
        Long term246 = new Long(-4920224193275732920L);
        term175 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term175, term175.getClass(), "startCreateTime", term176);
        setField(term175, term175.getClass(), "endCreateTime", term178);
        setField(term175, term175.getClass(), "startUpdateTime", term180);
        setField(term175, term175.getClass(), "endUpdateTime", term182);
        setField(term175, term175.getClass(), "startFinishTime", term184);
        setField(term175, term175.getClass(), "endFinishTime", term186);
        setField(term175, term175.getClass(), "startVideoCreatedTime", term188);
        setField(term175, term175.getClass(), "endVideoCreatedTime", term190);
        setField(term175, term175.getClass(), "id", term192);
        setField(term175, term175.getClass(), "platform", "SzjVpOQTyS");
        setField(term175, term175.getClass(), "videoCreatorUid", "MjGYSRKTNF");
        setField(term175, term175.getClass(), "videoId", "hRNSzYYIrc");
        setField(term175, term175.getClass(), "videoCreatedTime", term230);
        setField(term175, term175.getClass(), "danmuTotalNum", term232);
        setField(term175, term175.getClass(), "danmuSentNum", term234);
        setField(term175, term175.getClass(), "pageSize", term236);
        setField(term175, term175.getClass(), "skip", term238);
        setField(term175, term175.getClass(), "taskFail", term240);
        setField(term175, term175.getClass(), "createTime", term242);
        setField(term175, term175.getClass(), "updateTime", term244);
        setField(term175, term175.getClass(), "finishTime", term246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Object[] args = new Object[1];
        args[0] = term175;
        callMethod(klass, "getSenderTaskListBySelector", argTypes, null, args);
    }

};


