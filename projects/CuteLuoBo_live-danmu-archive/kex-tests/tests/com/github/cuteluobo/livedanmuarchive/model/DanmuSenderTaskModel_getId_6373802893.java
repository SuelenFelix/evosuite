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

public class DanmuSenderTaskModel_getId_6373802893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;

    public DanmuSenderTaskModel_getId_6373802893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term157 = new Integer(1162663216);
        Long term195 = new Long(7411271909051562686L);
        Long term197 = new Long(0L);
        Long term199 = new Long(0L);
        Integer term201 = new Integer(0);
        Boolean term203 = new Boolean(false);
        Boolean term205 = new Boolean(false);
        Long term207 = new Long(4872422362414183754L);
        Long term209 = new Long(6811161968424632369L);
        Long term211 = new Long(-7237588299778557629L);
        term156 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term156, term156.getClass(), "id", term157);
        setField(term156, term156.getClass(), "platform", "SzjVpOQTyS");
        setField(term156, term156.getClass(), "videoCreatorUid", "MjGYSRKTNF");
        setField(term156, term156.getClass(), "videoId", "hRNSzYYIrc");
        setField(term156, term156.getClass(), "videoCreatedTime", term195);
        setField(term156, term156.getClass(), "danmuTotalNum", term197);
        setField(term156, term156.getClass(), "danmuSentNum", term199);
        setField(term156, term156.getClass(), "pageSize", term201);
        setField(term156, term156.getClass(), "skip", term203);
        setField(term156, term156.getClass(), "taskFail", term205);
        setField(term156, term156.getClass(), "createTime", term207);
        setField(term156, term156.getClass(), "updateTime", term209);
        setField(term156, term156.getClass(), "finishTime", term211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term156, args);
    }

};


