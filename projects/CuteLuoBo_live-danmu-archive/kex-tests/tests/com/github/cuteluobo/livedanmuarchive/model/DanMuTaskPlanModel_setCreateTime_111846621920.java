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

public class DanMuTaskPlanModel_setCreateTime_111846621920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7813;
     Object term7868;

    public DanMuTaskPlanModel_setCreateTime_111846621920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7814 = new Integer(-420030135);
        Long term7852 = new Long(1442167273909860961L);
        Long term7854 = new Long(6895382576300001141L);
        Integer term7856 = new Integer(267763294);
        Boolean term7858 = new Boolean(false);
        Boolean term7860 = new Boolean(false);
        Long term7862 = new Long(9062006526792682783L);
        Long term7864 = new Long(-7400951017937830861L);
        Long term7866 = new Long(-8993073054427011802L);
        term7813 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7813, term7813.getClass(), "id", term7814);
        setField(term7813, term7813.getClass(), "platform", "WVbxuoDBcn");
        setField(term7813, term7813.getClass(), "videoCreatorUid", "pvDEABOxLt");
        setField(term7813, term7813.getClass(), "videoId", "beAMpkroCQ");
        setField(term7813, term7813.getClass(), "videoCreatedTime", term7852);
        setField(term7813, term7813.getClass(), "slicedTime", term7854);
        setField(term7813, term7813.getClass(), "pageCurrent", term7856);
        setField(term7813, term7813.getClass(), "skip", term7858);
        setField(term7813, term7813.getClass(), "taskFail", term7860);
        setField(term7813, term7813.getClass(), "createTime", term7862);
        setField(term7813, term7813.getClass(), "updateTime", term7864);
        setField(term7813, term7813.getClass(), "finishTime", term7866);
        term7868 = new Long(2287785643837657068L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7868;
        callMethod(klass, "setCreateTime", argTypes, term7813, args);
    }

};


