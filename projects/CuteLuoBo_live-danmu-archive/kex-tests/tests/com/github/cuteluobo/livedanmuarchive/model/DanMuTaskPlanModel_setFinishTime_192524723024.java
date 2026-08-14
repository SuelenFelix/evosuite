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

public class DanMuTaskPlanModel_setFinishTime_192524723024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8157;
     Object term8212;

    public DanMuTaskPlanModel_setFinishTime_192524723024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8158 = new Integer(1743683601);
        Long term8196 = new Long(6077991958696417121L);
        Long term8198 = new Long(-5004803270846838598L);
        Integer term8200 = new Integer(-945116798);
        Boolean term8202 = new Boolean(false);
        Boolean term8204 = new Boolean(false);
        Long term8206 = new Long(-8211859616692114655L);
        Long term8208 = new Long(7487838449539103993L);
        Long term8210 = new Long(7010148136855890340L);
        term8157 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term8157, term8157.getClass(), "id", term8158);
        setField(term8157, term8157.getClass(), "platform", "NHbOFFjyVK");
        setField(term8157, term8157.getClass(), "videoCreatorUid", "zaloBqlrSo");
        setField(term8157, term8157.getClass(), "videoId", "vvoLrMGCoN");
        setField(term8157, term8157.getClass(), "videoCreatedTime", term8196);
        setField(term8157, term8157.getClass(), "slicedTime", term8198);
        setField(term8157, term8157.getClass(), "pageCurrent", term8200);
        setField(term8157, term8157.getClass(), "skip", term8202);
        setField(term8157, term8157.getClass(), "taskFail", term8204);
        setField(term8157, term8157.getClass(), "createTime", term8206);
        setField(term8157, term8157.getClass(), "updateTime", term8208);
        setField(term8157, term8157.getClass(), "finishTime", term8210);
        term8212 = new Long(-6771377873268167033L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8212;
        callMethod(klass, "setFinishTime", argTypes, term8157, args);
    }

};


