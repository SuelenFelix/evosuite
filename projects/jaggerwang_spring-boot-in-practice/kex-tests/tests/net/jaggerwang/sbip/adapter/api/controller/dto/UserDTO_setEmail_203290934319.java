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

public class UserDTO_setEmail_203290934319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9512;

    public UserDTO_setEmail_203290934319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9513 = new Long(-1505191021111100819L);
        Long term9563 = new Long(-1000830646340880796L);
        Long term9598 = new Long(5973526439563541711L);
        Long term9600 = new Long(5246058710498845622L);
        Class<? extends Object> term9800 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term9799 = ((Class) term9800).getDeclaredField((String) "LOCAL");
        ((Field) term9799).setAccessible(true);
        Object enum17 = ((Field) term9799).get((Object) null);
        Long term9648 = new Long(4394651392080968777L);
        HashMap term9694 = new HashMap();
        Long term9703 = new Long(-7310273014364148916L);
        Long term9705 = new Long(8863790908271299748L);
        Long term9707 = new Long(9205327385733285058L);
        Long term9709 = new Long(4199886998224701110L);
        Long term9711 = new Long(8540994973773607992L);
        Long term9713 = new Long(-2338103433822116635L);
        Boolean term9735 = new Boolean(true);
        term9512 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term9577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9597 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term9635 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term9662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9667 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9677 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9702 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term9715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9730 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9512, term9512.getClass(), "id", term9513);
        setField(term9512, term9512.getClass(), "username", "PgPzMSEjjX");
        setField(term9512, term9512.getClass(), "password", "wzsPSPcRdj");
        setField(term9512, term9512.getClass(), "mobile", "kGMQdqJYyB");
        setField(term9512, term9512.getClass(), "email", "XJJNClzHRf");
        setField(term9512, term9512.getClass(), "avatarId", term9563);
        setField(term9512, term9512.getClass(), "intro", "HDaezxQfQR");
        setIntField(term9578, term9578.getClass(), "year", 2013);
        setShortField(term9578, term9578.getClass(), "month", (short) 7);
        setShortField(term9578, term9578.getClass(), "day", (short) 26);
        setField(term9577, term9577.getClass(), "date", term9578);
        setByteField(term9582, term9582.getClass(), "hour", (byte) 14);
        setByteField(term9582, term9582.getClass(), "minute", (byte) 45);
        setByteField(term9582, term9582.getClass(), "second", (byte) 33);
        setIntField(term9582, term9582.getClass(), "nano", 547995853);
        setField(term9577, term9577.getClass(), "time", term9582);
        setField(term9512, term9512.getClass(), "createdAt", term9577);
        setIntField(term9588, term9588.getClass(), "year", 2016);
        setShortField(term9588, term9588.getClass(), "month", (short) 12);
        setShortField(term9588, term9588.getClass(), "day", (short) 20);
        setField(term9587, term9587.getClass(), "date", term9588);
        setByteField(term9592, term9592.getClass(), "hour", (byte) 8);
        setByteField(term9592, term9592.getClass(), "minute", (byte) 46);
        setByteField(term9592, term9592.getClass(), "second", (byte) 16);
        setIntField(term9592, term9592.getClass(), "nano", 10071864);
        setField(term9587, term9587.getClass(), "time", term9592);
        setField(term9512, term9512.getClass(), "updatedAt", term9587);
        setField(term9597, term9597.getClass(), "id", term9598);
        setField(term9597, term9597.getClass(), "userId", term9600);
        setField(term9597, term9597.getClass(), "region", enum17);
        setField(term9597, term9597.getClass(), "bucket", "iikZEapDlu");
        setField(term9597, term9597.getClass(), "path", "nhoHrZfnIN");
        setField(term9635, term9635.getClass(), "name", "ZkMALXpEAZ");
        setField(term9635, term9635.getClass(), "size", term9648);
        setField(term9635, term9635.getClass(), "type", "tXfQjSqDzN");
        setField(term9597, term9597.getClass(), "meta", term9635);
        setIntField(term9663, term9663.getClass(), "year", 2021);
        setShortField(term9663, term9663.getClass(), "month", (short) 8);
        setShortField(term9663, term9663.getClass(), "day", (short) 27);
        setField(term9662, term9662.getClass(), "date", term9663);
        setByteField(term9667, term9667.getClass(), "hour", (byte) 20);
        setByteField(term9667, term9667.getClass(), "minute", (byte) 11);
        setByteField(term9667, term9667.getClass(), "second", (byte) 47);
        setIntField(term9667, term9667.getClass(), "nano", 116303493);
        setField(term9662, term9662.getClass(), "time", term9667);
        setField(term9597, term9597.getClass(), "createdAt", term9662);
        setIntField(term9673, term9673.getClass(), "year", 2012);
        setShortField(term9673, term9673.getClass(), "month", (short) 5);
        setShortField(term9673, term9673.getClass(), "day", (short) 17);
        setField(term9672, term9672.getClass(), "date", term9673);
        setByteField(term9677, term9677.getClass(), "hour", (byte) 19);
        setByteField(term9677, term9677.getClass(), "minute", (byte) 36);
        setByteField(term9677, term9677.getClass(), "second", (byte) 33);
        setIntField(term9677, term9677.getClass(), "nano", 46625011);
        setField(term9672, term9672.getClass(), "time", term9677);
        setField(term9597, term9597.getClass(), "updatedAt", term9672);
        setField(term9597, term9597.getClass(), "url", "BjugTaMcxJ");
        setField(term9597, term9597.getClass(), "thumbs", term9694);
        setField(term9512, term9512.getClass(), "avatar", term9597);
        setField(term9702, term9702.getClass(), "id", term9703);
        setField(term9702, term9702.getClass(), "userId", term9705);
        setField(term9702, term9702.getClass(), "postCount", term9707);
        setField(term9702, term9702.getClass(), "likeCount", term9709);
        setField(term9702, term9702.getClass(), "followingCount", term9711);
        setField(term9702, term9702.getClass(), "followerCount", term9713);
        setIntField(term9716, term9716.getClass(), "year", 2013);
        setShortField(term9716, term9716.getClass(), "month", (short) 7);
        setShortField(term9716, term9716.getClass(), "day", (short) 3);
        setField(term9715, term9715.getClass(), "date", term9716);
        setByteField(term9720, term9720.getClass(), "hour", (byte) 10);
        setByteField(term9720, term9720.getClass(), "minute", (byte) 59);
        setByteField(term9720, term9720.getClass(), "second", (byte) 22);
        setIntField(term9720, term9720.getClass(), "nano", 937921480);
        setField(term9715, term9715.getClass(), "time", term9720);
        setField(term9702, term9702.getClass(), "createdAt", term9715);
        setIntField(term9726, term9726.getClass(), "year", 2012);
        setShortField(term9726, term9726.getClass(), "month", (short) 2);
        setShortField(term9726, term9726.getClass(), "day", (short) 29);
        setField(term9725, term9725.getClass(), "date", term9726);
        setByteField(term9730, term9730.getClass(), "hour", (byte) 14);
        setByteField(term9730, term9730.getClass(), "minute", (byte) 26);
        setByteField(term9730, term9730.getClass(), "second", (byte) 20);
        setIntField(term9730, term9730.getClass(), "nano", 780823452);
        setField(term9725, term9725.getClass(), "time", term9730);
        setField(term9702, term9702.getClass(), "updatedAt", term9725);
        setField(term9512, term9512.getClass(), "stat", term9702);
        setField(term9512, term9512.getClass(), "following", term9735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tlzpzIjMib";
        callMethod(klass, "setEmail", argTypes, term9512, args);
    }

};


