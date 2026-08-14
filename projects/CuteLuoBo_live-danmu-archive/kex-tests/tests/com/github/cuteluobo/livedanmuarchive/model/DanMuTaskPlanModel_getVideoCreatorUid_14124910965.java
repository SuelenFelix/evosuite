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

public class DanMuTaskPlanModel_getVideoCreatorUid_14124910965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6484;

    public DanMuTaskPlanModel_getVideoCreatorUid_14124910965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6485 = new Integer(-1747406163);
        Long term6523 = new Long(-5935517391653614345L);
        Long term6525 = new Long(-6521561238735301071L);
        Integer term6527 = new Integer(388157121);
        Boolean term6529 = new Boolean(false);
        Boolean term6531 = new Boolean(false);
        Long term6533 = new Long(-6609679920238945303L);
        Long term6535 = new Long(-7296330380944173376L);
        Long term6537 = new Long(-8890284990655172580L);
        term6484 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6484, term6484.getClass(), "id", term6485);
        setField(term6484, term6484.getClass(), "platform", "tlQSNgTkQX");
        setField(term6484, term6484.getClass(), "videoCreatorUid", "PCipZnmBOF");
        setField(term6484, term6484.getClass(), "videoId", "zcorEihhLK");
        setField(term6484, term6484.getClass(), "videoCreatedTime", term6523);
        setField(term6484, term6484.getClass(), "slicedTime", term6525);
        setField(term6484, term6484.getClass(), "pageCurrent", term6527);
        setField(term6484, term6484.getClass(), "skip", term6529);
        setField(term6484, term6484.getClass(), "taskFail", term6531);
        setField(term6484, term6484.getClass(), "createTime", term6533);
        setField(term6484, term6484.getClass(), "updateTime", term6535);
        setField(term6484, term6484.getClass(), "finishTime", term6537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoCreatorUid", argTypes, term6484, args);
    }

};


