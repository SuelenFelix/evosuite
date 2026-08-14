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

public class DanmuSenderTaskModel_getFinishTime_166035098826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2241;

    public DanmuSenderTaskModel_getFinishTime_166035098826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2242 = new Integer(590364439);
        Long term2280 = new Long(-8033714905181142681L);
        Long term2282 = new Long(0L);
        Long term2284 = new Long(0L);
        Integer term2286 = new Integer(0);
        Boolean term2288 = new Boolean(false);
        Boolean term2290 = new Boolean(false);
        Long term2292 = new Long(-9040825890007374809L);
        Long term2294 = new Long(1368340889161782793L);
        Long term2296 = new Long(-5786861555969446503L);
        term2241 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2241, term2241.getClass(), "id", term2242);
        setField(term2241, term2241.getClass(), "platform", "OWKQODBLzb");
        setField(term2241, term2241.getClass(), "videoCreatorUid", "wGmYcqUkgE");
        setField(term2241, term2241.getClass(), "videoId", "idgaQsnJpQ");
        setField(term2241, term2241.getClass(), "videoCreatedTime", term2280);
        setField(term2241, term2241.getClass(), "danmuTotalNum", term2282);
        setField(term2241, term2241.getClass(), "danmuSentNum", term2284);
        setField(term2241, term2241.getClass(), "pageSize", term2286);
        setField(term2241, term2241.getClass(), "skip", term2288);
        setField(term2241, term2241.getClass(), "taskFail", term2290);
        setField(term2241, term2241.getClass(), "createTime", term2292);
        setField(term2241, term2241.getClass(), "updateTime", term2294);
        setField(term2241, term2241.getClass(), "finishTime", term2296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinishTime", argTypes, term2241, args);
    }

};


