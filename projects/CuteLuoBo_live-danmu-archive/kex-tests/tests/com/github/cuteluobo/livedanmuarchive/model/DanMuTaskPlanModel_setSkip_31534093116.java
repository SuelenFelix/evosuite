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

public class DanMuTaskPlanModel_setSkip_31534093116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7469;
     Object term7524;

    public DanMuTaskPlanModel_setSkip_31534093116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7470 = new Integer(1460722225);
        Long term7508 = new Long(-278716491237139968L);
        Long term7510 = new Long(-629491722907628764L);
        Integer term7512 = new Integer(1743224434);
        Boolean term7514 = new Boolean(false);
        Boolean term7516 = new Boolean(false);
        Long term7518 = new Long(-5552123402871285352L);
        Long term7520 = new Long(-5587528177305224828L);
        Long term7522 = new Long(7950532649535587877L);
        term7469 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7469, term7469.getClass(), "id", term7470);
        setField(term7469, term7469.getClass(), "platform", "SIODFGaQhr");
        setField(term7469, term7469.getClass(), "videoCreatorUid", "qYzsiuXOgS");
        setField(term7469, term7469.getClass(), "videoId", "bxrCBbrrct");
        setField(term7469, term7469.getClass(), "videoCreatedTime", term7508);
        setField(term7469, term7469.getClass(), "slicedTime", term7510);
        setField(term7469, term7469.getClass(), "pageCurrent", term7512);
        setField(term7469, term7469.getClass(), "skip", term7514);
        setField(term7469, term7469.getClass(), "taskFail", term7516);
        setField(term7469, term7469.getClass(), "createTime", term7518);
        setField(term7469, term7469.getClass(), "updateTime", term7520);
        setField(term7469, term7469.getClass(), "finishTime", term7522);
        term7524 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term7524;
        callMethod(klass, "setSkip", argTypes, term7469, args);
    }

};


