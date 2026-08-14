package com.github.cuteluobo.livedanmuarchive.service.database;

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
import static com.github.cuteluobo.livedanmuarchive.service.database.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class MainDatabaseService_updateAccountTask_16055153997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public MainDatabaseService_updateAccountTask_16055153997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term410 = new Integer(-1339778481);
        Integer term412 = new Integer(1725571209);
        Integer term438 = new Integer(-522618178);
        Long term440 = new Long(6855071767938501807L);
        Integer term442 = new Integer(0);
        Integer term444 = new Integer(0);
        Integer term446 = new Integer(1134449235);
        Boolean term448 = new Boolean(false);
        Long term450 = new Long(-5892135042702373494L);
        Long term452 = new Long(5262507301787091109L);
        Long term454 = new Long(-6823727938421990489L);
        term409 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term409, term409.getClass(), "id", term410);
        setField(term409, term409.getClass(), "danmuSenderTaskId", term412);
        setField(term409, term409.getClass(), "senderUid", "LQFpaHEwXR");
        setField(term409, term409.getClass(), "videoId", "oVcInYnLWB");
        setField(term409, term409.getClass(), "lastVideoPartIndex", term438);
        setField(term409, term409.getClass(), "lastVideoPartCid", term440);
        setField(term409, term409.getClass(), "pageIndex", term442);
        setField(term409, term409.getClass(), "pageSize", term444);
        setField(term409, term409.getClass(), "lastDanmuIndex", term446);
        setField(term409, term409.getClass(), "stop", term448);
        setField(term409, term409.getClass(), "createTime", term450);
        setField(term409, term409.getClass(), "updateTime", term452);
        setField(term409, term409.getClass(), "finishTime", term454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Object[] args = new Object[1];
        args[0] = term409;
        callMethod(klass, "updateAccountTask", argTypes, null, args);
    }

};


