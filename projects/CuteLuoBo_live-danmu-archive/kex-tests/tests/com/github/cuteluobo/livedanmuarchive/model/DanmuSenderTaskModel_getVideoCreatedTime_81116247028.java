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

public class DanmuSenderTaskModel_getVideoCreatedTime_81116247028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2417;

    public DanmuSenderTaskModel_getVideoCreatedTime_81116247028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2418 = new Integer(-1275173084);
        Long term2456 = new Long(-685023850445639859L);
        Long term2458 = new Long(0L);
        Long term2460 = new Long(0L);
        Integer term2462 = new Integer(0);
        Boolean term2464 = new Boolean(false);
        Boolean term2466 = new Boolean(false);
        Long term2468 = new Long(-6950146046121430355L);
        Long term2470 = new Long(1667122142089513324L);
        Long term2472 = new Long(-6342139649364011743L);
        term2417 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2417, term2417.getClass(), "id", term2418);
        setField(term2417, term2417.getClass(), "platform", "cAPeiZHKGJ");
        setField(term2417, term2417.getClass(), "videoCreatorUid", "LvJFtLBaxj");
        setField(term2417, term2417.getClass(), "videoId", "PHvxnGHptP");
        setField(term2417, term2417.getClass(), "videoCreatedTime", term2456);
        setField(term2417, term2417.getClass(), "danmuTotalNum", term2458);
        setField(term2417, term2417.getClass(), "danmuSentNum", term2460);
        setField(term2417, term2417.getClass(), "pageSize", term2462);
        setField(term2417, term2417.getClass(), "skip", term2464);
        setField(term2417, term2417.getClass(), "taskFail", term2466);
        setField(term2417, term2417.getClass(), "createTime", term2468);
        setField(term2417, term2417.getClass(), "updateTime", term2470);
        setField(term2417, term2417.getClass(), "finishTime", term2472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoCreatedTime", argTypes, term2417, args);
    }

};


