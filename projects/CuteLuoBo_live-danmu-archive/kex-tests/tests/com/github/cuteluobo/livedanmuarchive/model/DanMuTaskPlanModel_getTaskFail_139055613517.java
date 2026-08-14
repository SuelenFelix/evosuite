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

public class DanMuTaskPlanModel_getTaskFail_139055613517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7556;

    public DanMuTaskPlanModel_getTaskFail_139055613517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7557 = new Integer(842904495);
        Long term7595 = new Long(7799452759993694308L);
        Long term7597 = new Long(-1571034605670661708L);
        Integer term7599 = new Integer(1008080511);
        Boolean term7601 = new Boolean(false);
        Boolean term7603 = new Boolean(false);
        Long term7605 = new Long(-7983954942068142191L);
        Long term7607 = new Long(2274723545906746965L);
        Long term7609 = new Long(1353683663053784647L);
        term7556 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7556, term7556.getClass(), "id", term7557);
        setField(term7556, term7556.getClass(), "platform", "CKWpJaaaxX");
        setField(term7556, term7556.getClass(), "videoCreatorUid", "UBRmXJmfrt");
        setField(term7556, term7556.getClass(), "videoId", "WZzvmIHhzZ");
        setField(term7556, term7556.getClass(), "videoCreatedTime", term7595);
        setField(term7556, term7556.getClass(), "slicedTime", term7597);
        setField(term7556, term7556.getClass(), "pageCurrent", term7599);
        setField(term7556, term7556.getClass(), "skip", term7601);
        setField(term7556, term7556.getClass(), "taskFail", term7603);
        setField(term7556, term7556.getClass(), "createTime", term7605);
        setField(term7556, term7556.getClass(), "updateTime", term7607);
        setField(term7556, term7556.getClass(), "finishTime", term7609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskFail", argTypes, term7556, args);
    }

};


