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

public class DanMuSenderTaskSelector_setStartCreateTime_152110180114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;
     Object term1425;

    public DanMuSenderTaskSelector_setStartCreateTime_152110180114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1353 = new Long(4266570509071948633L);
        Long term1355 = new Long(-7291742736502427077L);
        Long term1357 = new Long(-8121849829073967555L);
        Long term1359 = new Long(5219030281405653303L);
        Long term1361 = new Long(-8471550651709805183L);
        Long term1363 = new Long(-948292411727204525L);
        Long term1365 = new Long(-8892586408602479513L);
        Long term1367 = new Long(4616440478358528406L);
        Integer term1369 = new Integer(-883034806);
        Long term1407 = new Long(3427570961451840069L);
        Long term1409 = new Long(0L);
        Long term1411 = new Long(0L);
        Integer term1413 = new Integer(0);
        Boolean term1415 = new Boolean(false);
        Boolean term1417 = new Boolean(false);
        Long term1419 = new Long(4502292577098212311L);
        Long term1421 = new Long(-3730936709704460408L);
        Long term1423 = new Long(-8614778293741404325L);
        term1352 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1352, term1352.getClass(), "startCreateTime", term1353);
        setField(term1352, term1352.getClass(), "endCreateTime", term1355);
        setField(term1352, term1352.getClass(), "startUpdateTime", term1357);
        setField(term1352, term1352.getClass(), "endUpdateTime", term1359);
        setField(term1352, term1352.getClass(), "startFinishTime", term1361);
        setField(term1352, term1352.getClass(), "endFinishTime", term1363);
        setField(term1352, term1352.getClass(), "startVideoCreatedTime", term1365);
        setField(term1352, term1352.getClass(), "endVideoCreatedTime", term1367);
        setField(term1352, term1352.getClass(), "id", term1369);
        setField(term1352, term1352.getClass(), "platform", "aKnKipADSo");
        setField(term1352, term1352.getClass(), "videoCreatorUid", "wSQxaModmm");
        setField(term1352, term1352.getClass(), "videoId", "UlajhuVLaP");
        setField(term1352, term1352.getClass(), "videoCreatedTime", term1407);
        setField(term1352, term1352.getClass(), "danmuTotalNum", term1409);
        setField(term1352, term1352.getClass(), "danmuSentNum", term1411);
        setField(term1352, term1352.getClass(), "pageSize", term1413);
        setField(term1352, term1352.getClass(), "skip", term1415);
        setField(term1352, term1352.getClass(), "taskFail", term1417);
        setField(term1352, term1352.getClass(), "createTime", term1419);
        setField(term1352, term1352.getClass(), "updateTime", term1421);
        setField(term1352, term1352.getClass(), "finishTime", term1423);
        term1425 = new Long(-5447369594017685765L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1425;
        callMethod(klass, "setStartCreateTime", argTypes, term1352, args);
    }

};


