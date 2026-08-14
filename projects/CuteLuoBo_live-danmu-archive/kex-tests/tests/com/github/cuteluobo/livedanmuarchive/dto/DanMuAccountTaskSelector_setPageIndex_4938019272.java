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

public class DanMuAccountTaskSelector_setPageIndex_4938019272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764;
     Object term1827;

    public DanMuAccountTaskSelector_setPageIndex_4938019272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1765 = new Long(6426732259596412988L);
        Long term1767 = new Long(185793058502220865L);
        Long term1769 = new Long(-7698746988132548371L);
        Long term1771 = new Long(2145420811068634601L);
        Long term1773 = new Long(2191130532479601175L);
        Long term1775 = new Long(860079646007397083L);
        Integer term1813 = new Integer(0);
        Integer term1815 = new Integer(0);
        Integer term1781 = new Integer(-1007160944);
        Integer term1783 = new Integer(1135664017);
        Integer term1809 = new Integer(590364439);
        Long term1811 = new Long(3230472384687362867L);
        Integer term1817 = new Integer(865208305);
        Boolean term1819 = new Boolean(false);
        Long term1821 = new Long(-1145146470850585022L);
        Long term1823 = new Long(1993646237353405740L);
        Long term1825 = new Long(-4043093655001688454L);
        term1764 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term1764, term1764.getClass(), "startCreateTime", term1765);
        setField(term1764, term1764.getClass(), "endCreateTime", term1767);
        setField(term1764, term1764.getClass(), "startUpdateTime", term1769);
        setField(term1764, term1764.getClass(), "endUpdateTime", term1771);
        setField(term1764, term1764.getClass(), "startFinishTime", term1773);
        setField(term1764, term1764.getClass(), "endFinishTime", term1775);
        setField(term1764, term1764.getClass(), "pageIndex", term1813);
        setField(term1764, term1764.getClass(), "pageSize", term1815);
        setField(term1764, term1764.getClass(), "id", term1781);
        setField(term1764, term1764.getClass(), "danmuSenderTaskId", term1783);
        setField(term1764, term1764.getClass(), "senderUid", "nGKItKLYNC");
        setField(term1764, term1764.getClass(), "videoId", "UiUYnPrcCi");
        setField(term1764, term1764.getClass(), "lastVideoPartIndex", term1809);
        setField(term1764, term1764.getClass(), "lastVideoPartCid", term1811);
        setField(term1764, term1764.getClass(), "lastDanmuIndex", term1817);
        setField(term1764, term1764.getClass(), "stop", term1819);
        setField(term1764, term1764.getClass(), "createTime", term1821);
        setField(term1764, term1764.getClass(), "updateTime", term1823);
        setField(term1764, term1764.getClass(), "finishTime", term1825);
        term1827 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1827;
        callMethod(klass, "setPageIndex", argTypes, term1764, args);
    }

};


