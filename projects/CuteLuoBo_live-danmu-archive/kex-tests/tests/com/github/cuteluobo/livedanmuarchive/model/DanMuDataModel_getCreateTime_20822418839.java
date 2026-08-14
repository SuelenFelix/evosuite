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
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModel_getCreateTime_20822418839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5694;

    public DanMuDataModel_getCreateTime_20822418839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5695 = new Long(-5656664340499957324L);
        Integer term5697 = new Integer(-1410220680);
        Integer term5711 = new Integer(389427431);
        Integer term5713 = new Integer(-1945706126);
        Long term5715 = new Long(-5460517064177800852L);
        term5694 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5694, term5694.getClass(), "id", term5695);
        setField(term5694, term5694.getClass(), "userId", term5697);
        setField(term5694, term5694.getClass(), "data", "JppkknKVOw");
        setField(term5694, term5694.getClass(), "format", term5711);
        setField(term5694, term5694.getClass(), "type", term5713);
        setField(term5694, term5694.getClass(), "createTime", term5715);
        setField(term5694, term5694.getClass(), "createTimeText", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term5694, args);
    }

};


