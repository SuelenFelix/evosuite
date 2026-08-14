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

public class DanMuTaskPlanModel_getSkip_190371817915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7384;

    public DanMuTaskPlanModel_getSkip_190371817915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7385 = new Integer(252575029);
        Long term7423 = new Long(3472971833455746664L);
        Long term7425 = new Long(3731931947533293029L);
        Integer term7427 = new Integer(57189932);
        Boolean term7429 = new Boolean(false);
        Boolean term7431 = new Boolean(false);
        Long term7433 = new Long(9214973322210954344L);
        Long term7435 = new Long(3662777917800385964L);
        Long term7437 = new Long(-7005300544167632229L);
        term7384 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7384, term7384.getClass(), "id", term7385);
        setField(term7384, term7384.getClass(), "platform", "WVRMUmrljA");
        setField(term7384, term7384.getClass(), "videoCreatorUid", "NTlKJDDWlk");
        setField(term7384, term7384.getClass(), "videoId", "vOuMEpOQAg");
        setField(term7384, term7384.getClass(), "videoCreatedTime", term7423);
        setField(term7384, term7384.getClass(), "slicedTime", term7425);
        setField(term7384, term7384.getClass(), "pageCurrent", term7427);
        setField(term7384, term7384.getClass(), "skip", term7429);
        setField(term7384, term7384.getClass(), "taskFail", term7431);
        setField(term7384, term7384.getClass(), "createTime", term7433);
        setField(term7384, term7384.getClass(), "updateTime", term7435);
        setField(term7384, term7384.getClass(), "finishTime", term7437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkip", argTypes, term7384, args);
    }

};


