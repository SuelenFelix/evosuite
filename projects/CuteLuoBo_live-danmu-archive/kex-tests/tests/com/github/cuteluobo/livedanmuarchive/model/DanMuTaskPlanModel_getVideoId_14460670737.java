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

public class DanMuTaskPlanModel_getVideoId_14460670737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6676;

    public DanMuTaskPlanModel_getVideoId_14460670737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6677 = new Integer(1270666529);
        Long term6715 = new Long(-532956263280568707L);
        Long term6717 = new Long(6073193746616629086L);
        Integer term6719 = new Integer(-1146679443);
        Boolean term6721 = new Boolean(false);
        Boolean term6723 = new Boolean(false);
        Long term6725 = new Long(-2463629530824341661L);
        Long term6727 = new Long(7800835025296877231L);
        Long term6729 = new Long(-187772971269812453L);
        term6676 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6676, term6676.getClass(), "id", term6677);
        setField(term6676, term6676.getClass(), "platform", "OIHoJeysUi");
        setField(term6676, term6676.getClass(), "videoCreatorUid", "WXMWFDGcLB");
        setField(term6676, term6676.getClass(), "videoId", "wKWbJssZuG");
        setField(term6676, term6676.getClass(), "videoCreatedTime", term6715);
        setField(term6676, term6676.getClass(), "slicedTime", term6717);
        setField(term6676, term6676.getClass(), "pageCurrent", term6719);
        setField(term6676, term6676.getClass(), "skip", term6721);
        setField(term6676, term6676.getClass(), "taskFail", term6723);
        setField(term6676, term6676.getClass(), "createTime", term6725);
        setField(term6676, term6676.getClass(), "updateTime", term6727);
        setField(term6676, term6676.getClass(), "finishTime", term6729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoId", argTypes, term6676, args);
    }

};


