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

public class DanmuSenderTaskModel_setVideoId_25134869310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811;

    public DanmuSenderTaskModel_setVideoId_25134869310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term812 = new Integer(-1339778481);
        Long term850 = new Long(-6823727938421990489L);
        Long term852 = new Long(0L);
        Long term854 = new Long(0L);
        Integer term856 = new Integer(0);
        Boolean term858 = new Boolean(false);
        Boolean term860 = new Boolean(false);
        Long term862 = new Long(-484994522244390100L);
        Long term864 = new Long(1233889271256172047L);
        Long term866 = new Long(6617340557564669657L);
        term811 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term811, term811.getClass(), "id", term812);
        setField(term811, term811.getClass(), "platform", "TEParAifyi");
        setField(term811, term811.getClass(), "videoCreatorUid", "OWDIEULEFu");
        setField(term811, term811.getClass(), "videoId", "dWRymuLBtr");
        setField(term811, term811.getClass(), "videoCreatedTime", term850);
        setField(term811, term811.getClass(), "danmuTotalNum", term852);
        setField(term811, term811.getClass(), "danmuSentNum", term854);
        setField(term811, term811.getClass(), "pageSize", term856);
        setField(term811, term811.getClass(), "skip", term858);
        setField(term811, term811.getClass(), "taskFail", term860);
        setField(term811, term811.getClass(), "createTime", term862);
        setField(term811, term811.getClass(), "updateTime", term864);
        setField(term811, term811.getClass(), "finishTime", term866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AijpHYOFuy";
        callMethod(klass, "setVideoId", argTypes, term811, args);
    }

};


