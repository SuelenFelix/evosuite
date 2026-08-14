package com.github.cuteluobo.livedanmuarchive.utils.reader;

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
import static com.github.cuteluobo.livedanmuarchive.utils.reader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;

public class BatchSqliteDanMuReader_countNum_14942191697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;
     Object term1097;

    public BatchSqliteDanMuReader_countNum_14942191697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1073 = new ArrayList();
        ((ArrayList) term1073).add((Object)null);
        ((ArrayList) term1073).add((Object)null);
        ((ArrayList) term1073).add((Object)null);
        ((ArrayList) term1073).add((Object)null);
        ((ArrayList) term1073).add((Object)null);
        ((ArrayList) term1073).add((Object)null);
        ((ArrayList) term1073).add((Object)null);
        HashMap term1077 = new HashMap();
        HashMap term1087 = new HashMap();
        term1072 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term1072, term1072.getClass(), "danMuReaderList", term1073);
        setField(term1072, term1072.getClass(), "startTimeMap", term1077);
        setField(term1072, term1072.getClass(), "endTimeMap", term1087);
        Long term1098 = new Long(1672578078364590450L);
        Long term1100 = new Long(4949335493504695457L);
        Long term1102 = new Long(-5216789073301458893L);
        Integer term1104 = new Integer(454281060);
        Integer term1118 = new Integer(-1786399638);
        Integer term1120 = new Integer(2055867847);
        Long term1122 = new Long(-1832940336320585644L);
        term1097 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term1097, term1097.getClass(), "startCreateTime", term1098);
        setField(term1097, term1097.getClass(), "endCreateTime", term1100);
        setField(term1097, term1097.getClass(), "id", term1102);
        setField(term1097, term1097.getClass(), "userId", term1104);
        setField(term1097, term1097.getClass(), "data", "kuTXqwMtDB");
        setField(term1097, term1097.getClass(), "format", term1118);
        setField(term1097, term1097.getClass(), "type", term1120);
        setField(term1097, term1097.getClass(), "createTime", term1122);
        setField(term1097, term1097.getClass(), "createTimeText", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Object[] args = new Object[1];
        args[0] = term1097;
        callMethod(klass, "countNum", argTypes, term1072, args);
    }

};


