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

public class DanmuSenderTaskModel_setPlatform_6669189966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;

    public DanmuSenderTaskModel_setPlatform_6669189966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term420 = new Integer(-616727354);
        Long term458 = new Long(5127676408959197577L);
        Long term460 = new Long(0L);
        Long term462 = new Long(0L);
        Integer term464 = new Integer(0);
        Boolean term466 = new Boolean(false);
        Boolean term468 = new Boolean(false);
        Long term470 = new Long(-6573104506744284592L);
        Long term472 = new Long(-4920224193275732920L);
        Long term474 = new Long(8428634514691209827L);
        term419 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term419, term419.getClass(), "id", term420);
        setField(term419, term419.getClass(), "platform", "aJlieCFVtF");
        setField(term419, term419.getClass(), "videoCreatorUid", "ZiaGIbnzTs");
        setField(term419, term419.getClass(), "videoId", "tbcdzjIfER");
        setField(term419, term419.getClass(), "videoCreatedTime", term458);
        setField(term419, term419.getClass(), "danmuTotalNum", term460);
        setField(term419, term419.getClass(), "danmuSentNum", term462);
        setField(term419, term419.getClass(), "pageSize", term464);
        setField(term419, term419.getClass(), "skip", term466);
        setField(term419, term419.getClass(), "taskFail", term468);
        setField(term419, term419.getClass(), "createTime", term470);
        setField(term419, term419.getClass(), "updateTime", term472);
        setField(term419, term419.getClass(), "finishTime", term474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setPlatform", argTypes, term419, args);
    }

};


