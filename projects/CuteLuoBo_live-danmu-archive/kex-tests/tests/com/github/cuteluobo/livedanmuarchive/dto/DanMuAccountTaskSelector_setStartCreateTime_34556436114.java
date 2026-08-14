package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuAccountTaskSelector_setStartCreateTime_34556436114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2772;
     Object term2835;

    public DanMuAccountTaskSelector_setStartCreateTime_34556436114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2773 = new Long(2722004046017350471L);
        Long term2775 = new Long(6636235983121346803L);
        Long term2777 = new Long(146749226579788091L);
        Long term2779 = new Long(-1279670138064751276L);
        Long term2781 = new Long(-7205236974351118210L);
        Long term2783 = new Long(-2136893352275781569L);
        Integer term2821 = new Integer(0);
        Integer term2823 = new Integer(0);
        Integer term2789 = new Integer(-894662986);
        Integer term2791 = new Integer(304775596);
        Integer term2817 = new Integer(-1347665717);
        Long term2819 = new Long(-9147545274054597570L);
        Integer term2825 = new Integer(-1888585309);
        Boolean term2827 = new Boolean(false);
        Long term2829 = new Long(-8398381579707958144L);
        Long term2831 = new Long(-2195061939206930224L);
        Long term2833 = new Long(4525924047960478347L);
        term2772 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2772, term2772.getClass(), "startCreateTime", term2773);
        setField(term2772, term2772.getClass(), "endCreateTime", term2775);
        setField(term2772, term2772.getClass(), "startUpdateTime", term2777);
        setField(term2772, term2772.getClass(), "endUpdateTime", term2779);
        setField(term2772, term2772.getClass(), "startFinishTime", term2781);
        setField(term2772, term2772.getClass(), "endFinishTime", term2783);
        setField(term2772, term2772.getClass(), "pageIndex", term2821);
        setField(term2772, term2772.getClass(), "pageSize", term2823);
        setField(term2772, term2772.getClass(), "id", term2789);
        setField(term2772, term2772.getClass(), "danmuSenderTaskId", term2791);
        setField(term2772, term2772.getClass(), "senderUid", "HqBOwkVqjD");
        setField(term2772, term2772.getClass(), "videoId", "MAcUBcBckh");
        setField(term2772, term2772.getClass(), "lastVideoPartIndex", term2817);
        setField(term2772, term2772.getClass(), "lastVideoPartCid", term2819);
        setField(term2772, term2772.getClass(), "lastDanmuIndex", term2825);
        setField(term2772, term2772.getClass(), "stop", term2827);
        setField(term2772, term2772.getClass(), "createTime", term2829);
        setField(term2772, term2772.getClass(), "updateTime", term2831);
        setField(term2772, term2772.getClass(), "finishTime", term2833);
        term2835 = new Long(-3225860270104198596L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2835;
        callMethod(klass, "setStartCreateTime", argTypes, term2772, args);
    }

};


