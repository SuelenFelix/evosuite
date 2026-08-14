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

public class DanMuTaskPlanModel_getPlatform_10867759603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6292;

    public DanMuTaskPlanModel_getPlatform_10867759603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6293 = new Integer(982388293);
        Long term6331 = new Long(-7709317346333670618L);
        Long term6333 = new Long(-1964501434345816975L);
        Integer term6335 = new Integer(-159494544);
        Boolean term6337 = new Boolean(false);
        Boolean term6339 = new Boolean(false);
        Long term6341 = new Long(4689907154423223972L);
        Long term6343 = new Long(8512025621149521819L);
        Long term6345 = new Long(2022482096970820459L);
        term6292 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6292, term6292.getClass(), "id", term6293);
        setField(term6292, term6292.getClass(), "platform", "AZdLeSugwv");
        setField(term6292, term6292.getClass(), "videoCreatorUid", "RMsXuyzKJV");
        setField(term6292, term6292.getClass(), "videoId", "FwPbDZcHmB");
        setField(term6292, term6292.getClass(), "videoCreatedTime", term6331);
        setField(term6292, term6292.getClass(), "slicedTime", term6333);
        setField(term6292, term6292.getClass(), "pageCurrent", term6335);
        setField(term6292, term6292.getClass(), "skip", term6337);
        setField(term6292, term6292.getClass(), "taskFail", term6339);
        setField(term6292, term6292.getClass(), "createTime", term6341);
        setField(term6292, term6292.getClass(), "updateTime", term6343);
        setField(term6292, term6292.getClass(), "finishTime", term6345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatform", argTypes, term6292, args);
    }

};


