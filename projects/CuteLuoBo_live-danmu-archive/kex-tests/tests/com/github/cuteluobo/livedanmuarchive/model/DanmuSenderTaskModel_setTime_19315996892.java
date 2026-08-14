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

public class DanmuSenderTaskModel_setTime_19315996892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public DanmuSenderTaskModel_setTime_19315996892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70 = new Integer(568599855);
        Long term108 = new Long(6375119433582206027L);
        Long term110 = new Long(0L);
        Long term112 = new Long(0L);
        Integer term114 = new Integer(0);
        Boolean term116 = new Boolean(false);
        Boolean term118 = new Boolean(false);
        Long term120 = new Long(-8257434502486459194L);
        Long term122 = new Long(-8400487765614892086L);
        Long term124 = new Long(5270370404989704783L);
        term69 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term69, term69.getClass(), "id", term70);
        setField(term69, term69.getClass(), "platform", "xxtlPwDYFs");
        setField(term69, term69.getClass(), "videoCreatorUid", "jJCZpVmanW");
        setField(term69, term69.getClass(), "videoId", "EGtDIRbSSb");
        setField(term69, term69.getClass(), "videoCreatedTime", term108);
        setField(term69, term69.getClass(), "danmuTotalNum", term110);
        setField(term69, term69.getClass(), "danmuSentNum", term112);
        setField(term69, term69.getClass(), "pageSize", term114);
        setField(term69, term69.getClass(), "skip", term116);
        setField(term69, term69.getClass(), "taskFail", term118);
        setField(term69, term69.getClass(), "createTime", term120);
        setField(term69, term69.getClass(), "updateTime", term122);
        setField(term69, term69.getClass(), "finishTime", term124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setTime", argTypes, term69, args);
    }

};


