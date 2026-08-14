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

public class MainDatabaseService_addSenderTask_4532962552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MainDatabaseService_addSenderTask_4532962552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Long term40 = new Long(2442117782898005296L);
        Long term42 = new Long(0L);
        Long term44 = new Long(0L);
        Integer term46 = new Integer(0);
        Boolean term48 = new Boolean(false);
        Boolean term50 = new Boolean(false);
        Long term52 = new Long(6375119433582206027L);
        Long term54 = new Long(-8257434502486459194L);
        Long term56 = new Long(-8400487765614892086L);
        term1 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "platform", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "videoCreatorUid", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "videoId", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "videoCreatedTime", term40);
        setField(term1, term1.getClass(), "danmuTotalNum", term42);
        setField(term1, term1.getClass(), "danmuSentNum", term44);
        setField(term1, term1.getClass(), "pageSize", term46);
        setField(term1, term1.getClass(), "skip", term48);
        setField(term1, term1.getClass(), "taskFail", term50);
        setField(term1, term1.getClass(), "createTime", term52);
        setField(term1, term1.getClass(), "updateTime", term54);
        setField(term1, term1.getClass(), "finishTime", term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "addSenderTask", argTypes, null, args);
    }

};


