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

public class MainDatabaseService_getAccountTaskListBySelector_20295211585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;

    public MainDatabaseService_getAccountTaskListBySelector_20295211585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279 = new Long(8428634514691209827L);
        Long term281 = new Long(-2585684163342970173L);
        Long term283 = new Long(8059786003080744426L);
        Long term285 = new Long(-4365849114644724155L);
        Long term287 = new Long(2486810210675247493L);
        Long term289 = new Long(7009926388951271268L);
        Integer term327 = new Integer(0);
        Integer term329 = new Integer(0);
        Integer term295 = new Integer(-616727354);
        Integer term297 = new Integer(-1955890973);
        Integer term323 = new Integer(-2038273078);
        Long term325 = new Long(-7672528020740371001L);
        Integer term331 = new Integer(1227103734);
        Boolean term333 = new Boolean(false);
        Long term335 = new Long(-4502405999831680926L);
        Long term337 = new Long(1967728129628047933L);
        Long term339 = new Long(2120084523938730454L);
        term278 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term278, term278.getClass(), "startCreateTime", term279);
        setField(term278, term278.getClass(), "endCreateTime", term281);
        setField(term278, term278.getClass(), "startUpdateTime", term283);
        setField(term278, term278.getClass(), "endUpdateTime", term285);
        setField(term278, term278.getClass(), "startFinishTime", term287);
        setField(term278, term278.getClass(), "endFinishTime", term289);
        setField(term278, term278.getClass(), "pageIndex", term327);
        setField(term278, term278.getClass(), "pageSize", term329);
        setField(term278, term278.getClass(), "id", term295);
        setField(term278, term278.getClass(), "danmuSenderTaskId", term297);
        setField(term278, term278.getClass(), "senderUid", "RMFIsYGgne");
        setField(term278, term278.getClass(), "videoId", "NRdvgJlhkX");
        setField(term278, term278.getClass(), "lastVideoPartIndex", term323);
        setField(term278, term278.getClass(), "lastVideoPartCid", term325);
        setField(term278, term278.getClass(), "lastDanmuIndex", term331);
        setField(term278, term278.getClass(), "stop", term333);
        setField(term278, term278.getClass(), "createTime", term335);
        setField(term278, term278.getClass(), "updateTime", term337);
        setField(term278, term278.getClass(), "finishTime", term339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Object[] args = new Object[1];
        args[0] = term278;
        callMethod(klass, "getAccountTaskListBySelector", argTypes, null, args);
    }

};


