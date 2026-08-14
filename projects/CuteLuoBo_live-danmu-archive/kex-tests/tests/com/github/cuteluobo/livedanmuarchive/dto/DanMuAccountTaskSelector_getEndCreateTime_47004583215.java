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

public class DanMuAccountTaskSelector_getEndCreateTime_47004583215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2857;

    public DanMuAccountTaskSelector_getEndCreateTime_47004583215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2858 = new Long(-1164342036939643746L);
        Long term2860 = new Long(-7013378340043571457L);
        Long term2862 = new Long(-3279534582096707294L);
        Long term2864 = new Long(-6490254947459640565L);
        Long term2866 = new Long(-7001094993638840490L);
        Long term2868 = new Long(3077284143733577490L);
        Integer term2906 = new Integer(0);
        Integer term2908 = new Integer(0);
        Integer term2874 = new Integer(-268815336);
        Integer term2876 = new Integer(-1210583429);
        Integer term2902 = new Integer(-663691365);
        Long term2904 = new Long(4458302820344896046L);
        Integer term2910 = new Integer(339854490);
        Boolean term2912 = new Boolean(false);
        Long term2914 = new Long(-432424084523104253L);
        Long term2916 = new Long(6150186973473930616L);
        Long term2918 = new Long(-3850323135468805420L);
        term2857 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2857, term2857.getClass(), "startCreateTime", term2858);
        setField(term2857, term2857.getClass(), "endCreateTime", term2860);
        setField(term2857, term2857.getClass(), "startUpdateTime", term2862);
        setField(term2857, term2857.getClass(), "endUpdateTime", term2864);
        setField(term2857, term2857.getClass(), "startFinishTime", term2866);
        setField(term2857, term2857.getClass(), "endFinishTime", term2868);
        setField(term2857, term2857.getClass(), "pageIndex", term2906);
        setField(term2857, term2857.getClass(), "pageSize", term2908);
        setField(term2857, term2857.getClass(), "id", term2874);
        setField(term2857, term2857.getClass(), "danmuSenderTaskId", term2876);
        setField(term2857, term2857.getClass(), "senderUid", "oVgzLbrsFr");
        setField(term2857, term2857.getClass(), "videoId", "vQVyKLdtaz");
        setField(term2857, term2857.getClass(), "lastVideoPartIndex", term2902);
        setField(term2857, term2857.getClass(), "lastVideoPartCid", term2904);
        setField(term2857, term2857.getClass(), "lastDanmuIndex", term2910);
        setField(term2857, term2857.getClass(), "stop", term2912);
        setField(term2857, term2857.getClass(), "createTime", term2914);
        setField(term2857, term2857.getClass(), "updateTime", term2916);
        setField(term2857, term2857.getClass(), "finishTime", term2918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndCreateTime", argTypes, term2857, args);
    }

};


