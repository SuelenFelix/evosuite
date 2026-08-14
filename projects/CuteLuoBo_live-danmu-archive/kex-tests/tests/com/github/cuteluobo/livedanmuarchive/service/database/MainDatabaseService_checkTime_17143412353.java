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

public class MainDatabaseService_checkTime_17143412353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;

    public MainDatabaseService_checkTime_17143412353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term89 = new Integer(1162663216);
        Long term127 = new Long(5270370404989704783L);
        Long term129 = new Long(0L);
        Long term131 = new Long(0L);
        Integer term133 = new Integer(0);
        Boolean term135 = new Boolean(false);
        Boolean term137 = new Boolean(false);
        Long term139 = new Long(7411271909051562686L);
        Long term141 = new Long(4872422362414183754L);
        Long term143 = new Long(6811161968424632369L);
        term88 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term88, term88.getClass(), "id", term89);
        setField(term88, term88.getClass(), "platform", "xxtlPwDYFs");
        setField(term88, term88.getClass(), "videoCreatorUid", "jJCZpVmanW");
        setField(term88, term88.getClass(), "videoId", "EGtDIRbSSb");
        setField(term88, term88.getClass(), "videoCreatedTime", term127);
        setField(term88, term88.getClass(), "danmuTotalNum", term129);
        setField(term88, term88.getClass(), "danmuSentNum", term131);
        setField(term88, term88.getClass(), "pageSize", term133);
        setField(term88, term88.getClass(), "skip", term135);
        setField(term88, term88.getClass(), "taskFail", term137);
        setField(term88, term88.getClass(), "createTime", term139);
        setField(term88, term88.getClass(), "updateTime", term141);
        setField(term88, term88.getClass(), "finishTime", term143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Object[] args = new Object[1];
        args[0] = term88;
        callMethod(klass, "checkTime", argTypes, null, args);
    }

};


