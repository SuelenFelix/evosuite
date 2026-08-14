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

public class DanMuAccountTaskSelector_setPageSize_4124410964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1932;
     Object term1995;

    public DanMuAccountTaskSelector_setPageSize_4124410964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1933 = new Long(8107921244631636572L);
        Long term1935 = new Long(-7904053112604879960L);
        Long term1937 = new Long(-6602460430714339690L);
        Long term1939 = new Long(21047099434645581L);
        Long term1941 = new Long(-8862087040734407227L);
        Long term1943 = new Long(-6394943900800506753L);
        Integer term1981 = new Integer(0);
        Integer term1983 = new Integer(0);
        Integer term1949 = new Integer(-469968304);
        Integer term1951 = new Integer(-1145578966);
        Integer term1977 = new Integer(679763016);
        Long term1979 = new Long(-4867941246533901410L);
        Integer term1985 = new Integer(1962444399);
        Boolean term1987 = new Boolean(false);
        Long term1989 = new Long(1044883697493326351L);
        Long term1991 = new Long(-7406618974062419277L);
        Long term1993 = new Long(868503089567085985L);
        term1932 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term1932, term1932.getClass(), "startCreateTime", term1933);
        setField(term1932, term1932.getClass(), "endCreateTime", term1935);
        setField(term1932, term1932.getClass(), "startUpdateTime", term1937);
        setField(term1932, term1932.getClass(), "endUpdateTime", term1939);
        setField(term1932, term1932.getClass(), "startFinishTime", term1941);
        setField(term1932, term1932.getClass(), "endFinishTime", term1943);
        setField(term1932, term1932.getClass(), "pageIndex", term1981);
        setField(term1932, term1932.getClass(), "pageSize", term1983);
        setField(term1932, term1932.getClass(), "id", term1949);
        setField(term1932, term1932.getClass(), "danmuSenderTaskId", term1951);
        setField(term1932, term1932.getClass(), "senderUid", "onpbIeEKoi");
        setField(term1932, term1932.getClass(), "videoId", "YRHGsAkhxb");
        setField(term1932, term1932.getClass(), "lastVideoPartIndex", term1977);
        setField(term1932, term1932.getClass(), "lastVideoPartCid", term1979);
        setField(term1932, term1932.getClass(), "lastDanmuIndex", term1985);
        setField(term1932, term1932.getClass(), "stop", term1987);
        setField(term1932, term1932.getClass(), "createTime", term1989);
        setField(term1932, term1932.getClass(), "updateTime", term1991);
        setField(term1932, term1932.getClass(), "finishTime", term1993);
        term1995 = new Integer(767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1995;
        callMethod(klass, "setPageSize", argTypes, term1932, args);
    }

};


