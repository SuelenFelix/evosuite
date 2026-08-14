package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class DanmuSenderTaskModel_getPageSize_169230722215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1272;

    public DanmuSenderTaskModel_getPageSize_169230722215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1273 = new Integer(1585847225);
        Long term1311 = new Long(-1468719814009985452L);
        Long term1313 = new Long(0L);
        Long term1315 = new Long(0L);
        Integer term1317 = new Integer(0);
        Boolean term1319 = new Boolean(false);
        Boolean term1321 = new Boolean(false);
        Long term1323 = new Long(-7738503207562305297L);
        Long term1325 = new Long(3825396310311739952L);
        Long term1327 = new Long(-3838084482494604218L);
        term1272 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1272, term1272.getClass(), "id", term1273);
        setField(term1272, term1272.getClass(), "platform", "GzFkzHGYFt");
        setField(term1272, term1272.getClass(), "videoCreatorUid", "tShwQLRGNe");
        setField(term1272, term1272.getClass(), "videoId", "LvtrsXUliU");
        setField(term1272, term1272.getClass(), "videoCreatedTime", term1311);
        setField(term1272, term1272.getClass(), "danmuTotalNum", term1313);
        setField(term1272, term1272.getClass(), "danmuSentNum", term1315);
        setField(term1272, term1272.getClass(), "pageSize", term1317);
        setField(term1272, term1272.getClass(), "skip", term1319);
        setField(term1272, term1272.getClass(), "taskFail", term1321);
        setField(term1272, term1272.getClass(), "createTime", term1323);
        setField(term1272, term1272.getClass(), "updateTime", term1325);
        setField(term1272, term1272.getClass(), "finishTime", term1327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageSize", argTypes, term1272, args);
    }

};


