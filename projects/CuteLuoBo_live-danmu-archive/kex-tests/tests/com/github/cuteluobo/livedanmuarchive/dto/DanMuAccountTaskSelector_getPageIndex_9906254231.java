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

public class DanMuAccountTaskSelector_getPageIndex_9906254231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681;

    public DanMuAccountTaskSelector_getPageIndex_9906254231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1682 = new Long(-2338103433822116635L);
        Long term1684 = new Long(-1885698929232124806L);
        Long term1686 = new Long(5731563613239387113L);
        Long term1688 = new Long(3381333711768010594L);
        Long term1690 = new Long(3580984732036213717L);
        Long term1692 = new Long(5330761990446327930L);
        Integer term1730 = new Integer(0);
        Integer term1732 = new Integer(0);
        Integer term1698 = new Integer(1622346318);
        Integer term1700 = new Integer(1048535127);
        Integer term1726 = new Integer(-655067527);
        Long term1728 = new Long(-3954795081650780841L);
        Integer term1734 = new Integer(-6029667);
        Boolean term1736 = new Boolean(false);
        Long term1738 = new Long(3288791194263207397L);
        Long term1740 = new Long(3288941170644426558L);
        Long term1742 = new Long(-8338004844694486146L);
        term1681 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term1681, term1681.getClass(), "startCreateTime", term1682);
        setField(term1681, term1681.getClass(), "endCreateTime", term1684);
        setField(term1681, term1681.getClass(), "startUpdateTime", term1686);
        setField(term1681, term1681.getClass(), "endUpdateTime", term1688);
        setField(term1681, term1681.getClass(), "startFinishTime", term1690);
        setField(term1681, term1681.getClass(), "endFinishTime", term1692);
        setField(term1681, term1681.getClass(), "pageIndex", term1730);
        setField(term1681, term1681.getClass(), "pageSize", term1732);
        setField(term1681, term1681.getClass(), "id", term1698);
        setField(term1681, term1681.getClass(), "danmuSenderTaskId", term1700);
        setField(term1681, term1681.getClass(), "senderUid", "xLbjWUgOIL");
        setField(term1681, term1681.getClass(), "videoId", "jDtqGUpnZN");
        setField(term1681, term1681.getClass(), "lastVideoPartIndex", term1726);
        setField(term1681, term1681.getClass(), "lastVideoPartCid", term1728);
        setField(term1681, term1681.getClass(), "lastDanmuIndex", term1734);
        setField(term1681, term1681.getClass(), "stop", term1736);
        setField(term1681, term1681.getClass(), "createTime", term1738);
        setField(term1681, term1681.getClass(), "updateTime", term1740);
        setField(term1681, term1681.getClass(), "finishTime", term1742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageIndex", argTypes, term1681, args);
    }

};


