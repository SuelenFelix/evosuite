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

public class MainDatabaseService_updateDanMuSenderTask_13141819349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public MainDatabaseService_updateDanMuSenderTask_13141819349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term544 = new Integer(-1456670397);
        Long term582 = new Long(-8708192233349544946L);
        Long term584 = new Long(0L);
        Long term586 = new Long(0L);
        Integer term588 = new Integer(0);
        Boolean term590 = new Boolean(false);
        Boolean term592 = new Boolean(false);
        Long term594 = new Long(5907001541142728739L);
        Long term596 = new Long(4178434741742309755L);
        Long term598 = new Long(-2068172595987555756L);
        term543 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term543, term543.getClass(), "id", term544);
        setField(term543, term543.getClass(), "platform", "tbcdzjIfER");
        setField(term543, term543.getClass(), "videoCreatorUid", "HyxfbSQYBe");
        setField(term543, term543.getClass(), "videoId", "pCTimMblYc");
        setField(term543, term543.getClass(), "videoCreatedTime", term582);
        setField(term543, term543.getClass(), "danmuTotalNum", term584);
        setField(term543, term543.getClass(), "danmuSentNum", term586);
        setField(term543, term543.getClass(), "pageSize", term588);
        setField(term543, term543.getClass(), "skip", term590);
        setField(term543, term543.getClass(), "taskFail", term592);
        setField(term543, term543.getClass(), "createTime", term594);
        setField(term543, term543.getClass(), "updateTime", term596);
        setField(term543, term543.getClass(), "finishTime", term598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Object[] args = new Object[1];
        args[0] = term543;
        callMethod(klass, "updateDanMuSenderTask", argTypes, null, args);
    }

};


