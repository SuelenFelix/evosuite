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

public class DanMuAccountTaskSelector_getStartCreateTime_84832819313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2689;

    public DanMuAccountTaskSelector_getStartCreateTime_84832819313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2690 = new Long(4139034517298316285L);
        Long term2692 = new Long(5797412846146719084L);
        Long term2694 = new Long(5319740127125920367L);
        Long term2696 = new Long(6465987664600701876L);
        Long term2698 = new Long(-136372844051852955L);
        Long term2700 = new Long(-7632759764262745126L);
        Integer term2738 = new Integer(0);
        Integer term2740 = new Integer(0);
        Integer term2706 = new Integer(-505439934);
        Integer term2708 = new Integer(-344842608);
        Integer term2734 = new Integer(941650513);
        Long term2736 = new Long(3746481521207337771L);
        Integer term2742 = new Integer(444029505);
        Boolean term2744 = new Boolean(false);
        Long term2746 = new Long(4341016500855678917L);
        Long term2748 = new Long(-5871746020807491998L);
        Long term2750 = new Long(4742108233936970770L);
        term2689 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2689, term2689.getClass(), "startCreateTime", term2690);
        setField(term2689, term2689.getClass(), "endCreateTime", term2692);
        setField(term2689, term2689.getClass(), "startUpdateTime", term2694);
        setField(term2689, term2689.getClass(), "endUpdateTime", term2696);
        setField(term2689, term2689.getClass(), "startFinishTime", term2698);
        setField(term2689, term2689.getClass(), "endFinishTime", term2700);
        setField(term2689, term2689.getClass(), "pageIndex", term2738);
        setField(term2689, term2689.getClass(), "pageSize", term2740);
        setField(term2689, term2689.getClass(), "id", term2706);
        setField(term2689, term2689.getClass(), "danmuSenderTaskId", term2708);
        setField(term2689, term2689.getClass(), "senderUid", "JUmudUmaaV");
        setField(term2689, term2689.getClass(), "videoId", "KoyGrUJeJW");
        setField(term2689, term2689.getClass(), "lastVideoPartIndex", term2734);
        setField(term2689, term2689.getClass(), "lastVideoPartCid", term2736);
        setField(term2689, term2689.getClass(), "lastDanmuIndex", term2742);
        setField(term2689, term2689.getClass(), "stop", term2744);
        setField(term2689, term2689.getClass(), "createTime", term2746);
        setField(term2689, term2689.getClass(), "updateTime", term2748);
        setField(term2689, term2689.getClass(), "finishTime", term2750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCreateTime", argTypes, term2689, args);
    }

};


