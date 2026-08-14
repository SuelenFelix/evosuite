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

public class DanmuSenderTaskModel_setDanmuTotalNum_141518793112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1007;
     Object term1064;

    public DanmuSenderTaskModel_setDanmuTotalNum_141518793112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1008 = new Integer(-522618178);
        Long term1046 = new Long(-2068172595987555756L);
        Long term1048 = new Long(0L);
        Long term1050 = new Long(0L);
        Integer term1052 = new Integer(0);
        Boolean term1054 = new Boolean(false);
        Boolean term1056 = new Boolean(false);
        Long term1058 = new Long(-6292278961887936280L);
        Long term1060 = new Long(-6645965768855543712L);
        Long term1062 = new Long(4784595517102746672L);
        term1007 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1007, term1007.getClass(), "id", term1008);
        setField(term1007, term1007.getClass(), "platform", "xrwlQZdwCp");
        setField(term1007, term1007.getClass(), "videoCreatorUid", "IDCWpPLRkE");
        setField(term1007, term1007.getClass(), "videoId", "nyiiPDVjAc");
        setField(term1007, term1007.getClass(), "videoCreatedTime", term1046);
        setField(term1007, term1007.getClass(), "danmuTotalNum", term1048);
        setField(term1007, term1007.getClass(), "danmuSentNum", term1050);
        setField(term1007, term1007.getClass(), "pageSize", term1052);
        setField(term1007, term1007.getClass(), "skip", term1054);
        setField(term1007, term1007.getClass(), "taskFail", term1056);
        setField(term1007, term1007.getClass(), "createTime", term1058);
        setField(term1007, term1007.getClass(), "updateTime", term1060);
        setField(term1007, term1007.getClass(), "finishTime", term1062);
        term1064 = new Long(-7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1064;
        callMethod(klass, "setDanmuTotalNum", argTypes, term1007, args);
    }

};


