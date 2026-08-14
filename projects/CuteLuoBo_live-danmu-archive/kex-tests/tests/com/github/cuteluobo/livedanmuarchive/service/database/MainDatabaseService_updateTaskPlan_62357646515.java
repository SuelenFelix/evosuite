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

public class MainDatabaseService_updateTaskPlan_62357646515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;

    public MainDatabaseService_updateTaskPlan_62357646515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term753 = new Integer(1622346318);
        Long term791 = new Long(-6292278961887936280L);
        Long term793 = new Long(-6645965768855543712L);
        Integer term795 = new Integer(1048535127);
        Boolean term797 = new Boolean(false);
        Boolean term799 = new Boolean(false);
        Long term801 = new Long(4784595517102746672L);
        Long term803 = new Long(-7612550318181586304L);
        Long term805 = new Long(-2170847986967241072L);
        term752 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term752, term752.getClass(), "id", term753);
        setField(term752, term752.getClass(), "platform", "vrQLuWIDJX");
        setField(term752, term752.getClass(), "videoCreatorUid", "flxyYxBRtu");
        setField(term752, term752.getClass(), "videoId", "OclPbYPkcH");
        setField(term752, term752.getClass(), "videoCreatedTime", term791);
        setField(term752, term752.getClass(), "slicedTime", term793);
        setField(term752, term752.getClass(), "pageCurrent", term795);
        setField(term752, term752.getClass(), "skip", term797);
        setField(term752, term752.getClass(), "taskFail", term799);
        setField(term752, term752.getClass(), "createTime", term801);
        setField(term752, term752.getClass(), "updateTime", term803);
        setField(term752, term752.getClass(), "finishTime", term805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Object[] args = new Object[1];
        args[0] = term752;
        callMethod(klass, "updateTaskPlan", argTypes, null, args);
    }

};


