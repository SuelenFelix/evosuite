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

public class DanMuTaskPlanModel_getUpdateTime_22183560621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7900;

    public DanMuTaskPlanModel_getUpdateTime_22183560621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7901 = new Integer(-1497710478);
        Long term7939 = new Long(-7283193381993602128L);
        Long term7941 = new Long(6351887424140565471L);
        Integer term7943 = new Integer(49950830);
        Boolean term7945 = new Boolean(false);
        Boolean term7947 = new Boolean(false);
        Long term7949 = new Long(6273670659288205855L);
        Long term7951 = new Long(-4776514981294468834L);
        Long term7953 = new Long(-7273680182770718108L);
        term7900 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7900, term7900.getClass(), "id", term7901);
        setField(term7900, term7900.getClass(), "platform", "uSUvKAyuvd");
        setField(term7900, term7900.getClass(), "videoCreatorUid", "onQLVONGuf");
        setField(term7900, term7900.getClass(), "videoId", "SOrEHbcbmn");
        setField(term7900, term7900.getClass(), "videoCreatedTime", term7939);
        setField(term7900, term7900.getClass(), "slicedTime", term7941);
        setField(term7900, term7900.getClass(), "pageCurrent", term7943);
        setField(term7900, term7900.getClass(), "skip", term7945);
        setField(term7900, term7900.getClass(), "taskFail", term7947);
        setField(term7900, term7900.getClass(), "createTime", term7949);
        setField(term7900, term7900.getClass(), "updateTime", term7951);
        setField(term7900, term7900.getClass(), "finishTime", term7953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term7900, args);
    }

};


