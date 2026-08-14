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

public class DanmuAccountTaskModel_getUpdateTime_25721745823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4723;

    public DanmuAccountTaskModel_getUpdateTime_25721745823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4724 = new Integer(-1222006000);
        Integer term4726 = new Integer(2095798786);
        Integer term4752 = new Integer(-1565502840);
        Long term4754 = new Long(-8019730974733786399L);
        Integer term4756 = new Integer(0);
        Integer term4758 = new Integer(0);
        Integer term4760 = new Integer(344323424);
        Boolean term4762 = new Boolean(false);
        Long term4764 = new Long(394960377236392159L);
        Long term4766 = new Long(-2955854401507097864L);
        Long term4768 = new Long(329213208496958131L);
        term4723 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4723, term4723.getClass(), "id", term4724);
        setField(term4723, term4723.getClass(), "danmuSenderTaskId", term4726);
        setField(term4723, term4723.getClass(), "senderUid", "aNWLJdrZMq");
        setField(term4723, term4723.getClass(), "videoId", "HHmNoYxIGj");
        setField(term4723, term4723.getClass(), "lastVideoPartIndex", term4752);
        setField(term4723, term4723.getClass(), "lastVideoPartCid", term4754);
        setField(term4723, term4723.getClass(), "pageIndex", term4756);
        setField(term4723, term4723.getClass(), "pageSize", term4758);
        setField(term4723, term4723.getClass(), "lastDanmuIndex", term4760);
        setField(term4723, term4723.getClass(), "stop", term4762);
        setField(term4723, term4723.getClass(), "createTime", term4764);
        setField(term4723, term4723.getClass(), "updateTime", term4766);
        setField(term4723, term4723.getClass(), "finishTime", term4768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term4723, args);
    }

};


