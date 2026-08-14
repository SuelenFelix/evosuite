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

public class DanMuTaskPlanModel_getPageCurrent_168525485613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7212;

    public DanMuTaskPlanModel_getPageCurrent_168525485613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7213 = new Integer(-130649791);
        Long term7251 = new Long(3077284143733577490L);
        Long term7253 = new Long(4458302820344896046L);
        Integer term7255 = new Integer(534834644);
        Boolean term7257 = new Boolean(false);
        Boolean term7259 = new Boolean(false);
        Long term7261 = new Long(-432424084523104253L);
        Long term7263 = new Long(6150186973473930616L);
        Long term7265 = new Long(-3850323135468805420L);
        term7212 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7212, term7212.getClass(), "id", term7213);
        setField(term7212, term7212.getClass(), "platform", "iIRsCSYqXH");
        setField(term7212, term7212.getClass(), "videoCreatorUid", "nghfqDXyCG");
        setField(term7212, term7212.getClass(), "videoId", "WBAOTqErtm");
        setField(term7212, term7212.getClass(), "videoCreatedTime", term7251);
        setField(term7212, term7212.getClass(), "slicedTime", term7253);
        setField(term7212, term7212.getClass(), "pageCurrent", term7255);
        setField(term7212, term7212.getClass(), "skip", term7257);
        setField(term7212, term7212.getClass(), "taskFail", term7259);
        setField(term7212, term7212.getClass(), "createTime", term7261);
        setField(term7212, term7212.getClass(), "updateTime", term7263);
        setField(term7212, term7212.getClass(), "finishTime", term7265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageCurrent", argTypes, term7212, args);
    }

};


