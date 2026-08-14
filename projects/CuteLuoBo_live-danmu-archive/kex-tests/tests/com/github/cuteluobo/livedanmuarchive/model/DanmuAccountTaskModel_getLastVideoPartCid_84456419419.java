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

public class DanmuAccountTaskModel_getLastVideoPartCid_84456419419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4451;

    public DanmuAccountTaskModel_getLastVideoPartCid_84456419419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4452 = new Integer(568954359);
        Integer term4454 = new Integer(53410913);
        Integer term4480 = new Integer(-375014958);
        Long term4482 = new Long(3288941170644426558L);
        Integer term4484 = new Integer(0);
        Integer term4486 = new Integer(0);
        Integer term4488 = new Integer(1107176718);
        Boolean term4490 = new Boolean(false);
        Long term4492 = new Long(-8338004844694486146L);
        Long term4494 = new Long(6426732259596412988L);
        Long term4496 = new Long(185793058502220865L);
        term4451 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4451, term4451.getClass(), "id", term4452);
        setField(term4451, term4451.getClass(), "danmuSenderTaskId", term4454);
        setField(term4451, term4451.getClass(), "senderUid", "FPvxVzzSvD");
        setField(term4451, term4451.getClass(), "videoId", "WHcwFgsGFC");
        setField(term4451, term4451.getClass(), "lastVideoPartIndex", term4480);
        setField(term4451, term4451.getClass(), "lastVideoPartCid", term4482);
        setField(term4451, term4451.getClass(), "pageIndex", term4484);
        setField(term4451, term4451.getClass(), "pageSize", term4486);
        setField(term4451, term4451.getClass(), "lastDanmuIndex", term4488);
        setField(term4451, term4451.getClass(), "stop", term4490);
        setField(term4451, term4451.getClass(), "createTime", term4492);
        setField(term4451, term4451.getClass(), "updateTime", term4494);
        setField(term4451, term4451.getClass(), "finishTime", term4496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastVideoPartCid", argTypes, term4451, args);
    }

};


