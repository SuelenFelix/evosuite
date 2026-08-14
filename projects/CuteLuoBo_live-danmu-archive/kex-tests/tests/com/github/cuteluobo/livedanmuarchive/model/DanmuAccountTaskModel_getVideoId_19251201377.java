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

public class DanmuAccountTaskModel_getVideoId_19251201377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3615;

    public DanmuAccountTaskModel_getVideoId_19251201377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3616 = new Integer(1540719661);
        Integer term3618 = new Integer(1265463001);
        Integer term3644 = new Integer(335112684);
        Long term3646 = new Long(1195529027276497124L);
        Integer term3648 = new Integer(0);
        Integer term3650 = new Integer(0);
        Integer term3652 = new Integer(1551099402);
        Boolean term3654 = new Boolean(false);
        Long term3656 = new Long(-2783999800714825789L);
        Long term3658 = new Long(4266570509071948633L);
        Long term3660 = new Long(-7291742736502427077L);
        term3615 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3615, term3615.getClass(), "id", term3616);
        setField(term3615, term3615.getClass(), "danmuSenderTaskId", term3618);
        setField(term3615, term3615.getClass(), "senderUid", "WzMEhMXkKx");
        setField(term3615, term3615.getClass(), "videoId", "XOiDvlDhdc");
        setField(term3615, term3615.getClass(), "lastVideoPartIndex", term3644);
        setField(term3615, term3615.getClass(), "lastVideoPartCid", term3646);
        setField(term3615, term3615.getClass(), "pageIndex", term3648);
        setField(term3615, term3615.getClass(), "pageSize", term3650);
        setField(term3615, term3615.getClass(), "lastDanmuIndex", term3652);
        setField(term3615, term3615.getClass(), "stop", term3654);
        setField(term3615, term3615.getClass(), "createTime", term3656);
        setField(term3615, term3615.getClass(), "updateTime", term3658);
        setField(term3615, term3615.getClass(), "finishTime", term3660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoId", argTypes, term3615, args);
    }

};


