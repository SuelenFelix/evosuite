package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_getAvatar_66480396512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5615;

    public UserDTO_getAvatar_66480396512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5616 = new Long(-6950146046121430355L);
        Long term5666 = new Long(1667122142089513324L);
        Long term5701 = new Long(-6342139649364011743L);
        Long term5703 = new Long(-4924950707540628022L);
        Class<? extends Object> term5891 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term5890 = ((Class) term5891).getDeclaredField((String) "LOCAL");
        ((Field) term5890).setAccessible(true);
        Object enum10 = ((Field) term5890).get((Object) null);
        Long term5751 = new Long(-4393710401270724527L);
        HashMap term5797 = new HashMap();
        Long term5806 = new Long(-4822736661741380518L);
        Long term5808 = new Long(-5386201758403679145L);
        Long term5810 = new Long(-7268507582722666254L);
        Long term5812 = new Long(5671808784468963649L);
        Long term5814 = new Long(2297097306706899827L);
        Long term5816 = new Long(-900457279156388404L);
        Boolean term5838 = new Boolean(false);
        term5615 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term5680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5685 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5695 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5700 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term5738 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term5765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5780 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5805 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term5818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5823 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5833 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5615, term5615.getClass(), "id", term5616);
        setField(term5615, term5615.getClass(), "username", "MvRIxilFMJ");
        setField(term5615, term5615.getClass(), "password", "iNwOJRBEjp");
        setField(term5615, term5615.getClass(), "mobile", "XylxrMBraH");
        setField(term5615, term5615.getClass(), "email", "pORebkoRdD");
        setField(term5615, term5615.getClass(), "avatarId", term5666);
        setField(term5615, term5615.getClass(), "intro", "mXGCWJDOqA");
        setIntField(term5681, term5681.getClass(), "year", 2016);
        setShortField(term5681, term5681.getClass(), "month", (short) 10);
        setShortField(term5681, term5681.getClass(), "day", (short) 20);
        setField(term5680, term5680.getClass(), "date", term5681);
        setByteField(term5685, term5685.getClass(), "hour", (byte) 18);
        setByteField(term5685, term5685.getClass(), "minute", (byte) 39);
        setByteField(term5685, term5685.getClass(), "second", (byte) 1);
        setIntField(term5685, term5685.getClass(), "nano", 196253988);
        setField(term5680, term5680.getClass(), "time", term5685);
        setField(term5615, term5615.getClass(), "createdAt", term5680);
        setIntField(term5691, term5691.getClass(), "year", 2019);
        setShortField(term5691, term5691.getClass(), "month", (short) 1);
        setShortField(term5691, term5691.getClass(), "day", (short) 6);
        setField(term5690, term5690.getClass(), "date", term5691);
        setByteField(term5695, term5695.getClass(), "hour", (byte) 18);
        setByteField(term5695, term5695.getClass(), "minute", (byte) 8);
        setByteField(term5695, term5695.getClass(), "second", (byte) 46);
        setIntField(term5695, term5695.getClass(), "nano", 934136445);
        setField(term5690, term5690.getClass(), "time", term5695);
        setField(term5615, term5615.getClass(), "updatedAt", term5690);
        setField(term5700, term5700.getClass(), "id", term5701);
        setField(term5700, term5700.getClass(), "userId", term5703);
        setField(term5700, term5700.getClass(), "region", enum10);
        setField(term5700, term5700.getClass(), "bucket", "dpNsDgfPso");
        setField(term5700, term5700.getClass(), "path", "hCWPJQKpdc");
        setField(term5738, term5738.getClass(), "name", "WzMEhMXkKx");
        setField(term5738, term5738.getClass(), "size", term5751);
        setField(term5738, term5738.getClass(), "type", "XOiDvlDhdc");
        setField(term5700, term5700.getClass(), "meta", term5738);
        setIntField(term5766, term5766.getClass(), "year", 2028);
        setShortField(term5766, term5766.getClass(), "month", (short) 1);
        setShortField(term5766, term5766.getClass(), "day", (short) 18);
        setField(term5765, term5765.getClass(), "date", term5766);
        setByteField(term5770, term5770.getClass(), "hour", (byte) 12);
        setByteField(term5770, term5770.getClass(), "minute", (byte) 4);
        setByteField(term5770, term5770.getClass(), "second", (byte) 39);
        setIntField(term5770, term5770.getClass(), "nano", 651287093);
        setField(term5765, term5765.getClass(), "time", term5770);
        setField(term5700, term5700.getClass(), "createdAt", term5765);
        setIntField(term5776, term5776.getClass(), "year", 2027);
        setShortField(term5776, term5776.getClass(), "month", (short) 7);
        setShortField(term5776, term5776.getClass(), "day", (short) 23);
        setField(term5775, term5775.getClass(), "date", term5776);
        setByteField(term5780, term5780.getClass(), "hour", (byte) 12);
        setByteField(term5780, term5780.getClass(), "minute", (byte) 6);
        setByteField(term5780, term5780.getClass(), "second", (byte) 19);
        setIntField(term5780, term5780.getClass(), "nano", 8025683);
        setField(term5775, term5775.getClass(), "time", term5780);
        setField(term5700, term5700.getClass(), "updatedAt", term5775);
        setField(term5700, term5700.getClass(), "url", "AdxvLJhNLe");
        setField(term5700, term5700.getClass(), "thumbs", term5797);
        setField(term5615, term5615.getClass(), "avatar", term5700);
        setField(term5805, term5805.getClass(), "id", term5806);
        setField(term5805, term5805.getClass(), "userId", term5808);
        setField(term5805, term5805.getClass(), "postCount", term5810);
        setField(term5805, term5805.getClass(), "likeCount", term5812);
        setField(term5805, term5805.getClass(), "followingCount", term5814);
        setField(term5805, term5805.getClass(), "followerCount", term5816);
        setIntField(term5819, term5819.getClass(), "year", 2018);
        setShortField(term5819, term5819.getClass(), "month", (short) 2);
        setShortField(term5819, term5819.getClass(), "day", (short) 14);
        setField(term5818, term5818.getClass(), "date", term5819);
        setByteField(term5823, term5823.getClass(), "hour", (byte) 2);
        setByteField(term5823, term5823.getClass(), "minute", (byte) 40);
        setByteField(term5823, term5823.getClass(), "second", (byte) 48);
        setIntField(term5823, term5823.getClass(), "nano", 371006728);
        setField(term5818, term5818.getClass(), "time", term5823);
        setField(term5805, term5805.getClass(), "createdAt", term5818);
        setIntField(term5829, term5829.getClass(), "year", 2025);
        setShortField(term5829, term5829.getClass(), "month", (short) 8);
        setShortField(term5829, term5829.getClass(), "day", (short) 22);
        setField(term5828, term5828.getClass(), "date", term5829);
        setByteField(term5833, term5833.getClass(), "hour", (byte) 6);
        setByteField(term5833, term5833.getClass(), "minute", (byte) 48);
        setByteField(term5833, term5833.getClass(), "second", (byte) 49);
        setIntField(term5833, term5833.getClass(), "nano", 46400229);
        setField(term5828, term5828.getClass(), "time", term5833);
        setField(term5805, term5805.getClass(), "updatedAt", term5828);
        setField(term5615, term5615.getClass(), "stat", term5805);
        setField(term5615, term5615.getClass(), "following", term5838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatar", argTypes, term5615, args);
    }

};


