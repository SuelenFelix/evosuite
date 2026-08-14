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

public class DanMuTaskPlanModel_setPlatform_162184889629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8247;

    public DanMuTaskPlanModel_setPlatform_162184889629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8247 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term8247, term8247.getClass(), "id", null);
        setField(term8247, term8247.getClass(), "platform", null);
        setField(term8247, term8247.getClass(), "videoCreatorUid", null);
        setField(term8247, term8247.getClass(), "videoId", null);
        setField(term8247, term8247.getClass(), "videoCreatedTime", null);
        setField(term8247, term8247.getClass(), "slicedTime", null);
        setField(term8247, term8247.getClass(), "pageCurrent", null);
        setField(term8247, term8247.getClass(), "skip", null);
        setField(term8247, term8247.getClass(), "taskFail", null);
        setField(term8247, term8247.getClass(), "createTime", null);
        setField(term8247, term8247.getClass(), "updateTime", null);
        setField(term8247, term8247.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlatform", argTypes, term8247, args);
    }

};


