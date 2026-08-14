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

public class UserDTO_getFollowing_46031154714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6709;

    public UserDTO_getFollowing_46031154714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6710 = new Long(-4023935540989049732L);
        Long term6760 = new Long(855932984568615096L);
        Long term6795 = new Long(-1616722610139554082L);
        Long term6797 = new Long(7495904023107549024L);
        Class<? extends Object> term6985 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term6984 = ((Class) term6985).getDeclaredField((String) "LOCAL");
        ((Field) term6984).setAccessible(true);
        Object enum12 = ((Field) term6984).get((Object) null);
        Long term6845 = new Long(8802866251294305945L);
        HashMap term6891 = new HashMap();
        Long term6900 = new Long(4513004407927379358L);
        Long term6902 = new Long(-7115418542247301000L);
        Long term6904 = new Long(8034714140377562739L);
        Long term6906 = new Long(-2924531382671518368L);
        Long term6908 = new Long(-3948863953565024517L);
        Long term6910 = new Long(-6587807377747738663L);
        Boolean term6932 = new Boolean(false);
        term6709 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term6774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6784 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6785 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6789 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6794 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term6832 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term6859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6864 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6899 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term6912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6927 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6709, term6709.getClass(), "id", term6710);
        setField(term6709, term6709.getClass(), "username", "VMeAzAHwZj");
        setField(term6709, term6709.getClass(), "password", "PznxWXsZME");
        setField(term6709, term6709.getClass(), "mobile", "ZzIujlwVsw");
        setField(term6709, term6709.getClass(), "email", "LWyEaeIyAo");
        setField(term6709, term6709.getClass(), "avatarId", term6760);
        setField(term6709, term6709.getClass(), "intro", "yVMkkQhvmN");
        setIntField(term6775, term6775.getClass(), "year", 2010);
        setShortField(term6775, term6775.getClass(), "month", (short) 2);
        setShortField(term6775, term6775.getClass(), "day", (short) 24);
        setField(term6774, term6774.getClass(), "date", term6775);
        setByteField(term6779, term6779.getClass(), "hour", (byte) 17);
        setByteField(term6779, term6779.getClass(), "minute", (byte) 58);
        setByteField(term6779, term6779.getClass(), "second", (byte) 56);
        setIntField(term6779, term6779.getClass(), "nano", 291725532);
        setField(term6774, term6774.getClass(), "time", term6779);
        setField(term6709, term6709.getClass(), "createdAt", term6774);
        setIntField(term6785, term6785.getClass(), "year", 2028);
        setShortField(term6785, term6785.getClass(), "month", (short) 7);
        setShortField(term6785, term6785.getClass(), "day", (short) 22);
        setField(term6784, term6784.getClass(), "date", term6785);
        setByteField(term6789, term6789.getClass(), "hour", (byte) 18);
        setByteField(term6789, term6789.getClass(), "minute", (byte) 33);
        setByteField(term6789, term6789.getClass(), "second", (byte) 7);
        setIntField(term6789, term6789.getClass(), "nano", 763613074);
        setField(term6784, term6784.getClass(), "time", term6789);
        setField(term6709, term6709.getClass(), "updatedAt", term6784);
        setField(term6794, term6794.getClass(), "id", term6795);
        setField(term6794, term6794.getClass(), "userId", term6797);
        setField(term6794, term6794.getClass(), "region", enum12);
        setField(term6794, term6794.getClass(), "bucket", "mvrkADEgpp");
        setField(term6794, term6794.getClass(), "path", "pXOkjyeIRb");
        setField(term6832, term6832.getClass(), "name", "GgZWSjxjyE");
        setField(term6832, term6832.getClass(), "size", term6845);
        setField(term6832, term6832.getClass(), "type", "EeBVbzjcCI");
        setField(term6794, term6794.getClass(), "meta", term6832);
        setIntField(term6860, term6860.getClass(), "year", 2011);
        setShortField(term6860, term6860.getClass(), "month", (short) 8);
        setShortField(term6860, term6860.getClass(), "day", (short) 1);
        setField(term6859, term6859.getClass(), "date", term6860);
        setByteField(term6864, term6864.getClass(), "hour", (byte) 7);
        setByteField(term6864, term6864.getClass(), "minute", (byte) 2);
        setByteField(term6864, term6864.getClass(), "second", (byte) 46);
        setIntField(term6864, term6864.getClass(), "nano", 187178462);
        setField(term6859, term6859.getClass(), "time", term6864);
        setField(term6794, term6794.getClass(), "createdAt", term6859);
        setIntField(term6870, term6870.getClass(), "year", 2020);
        setShortField(term6870, term6870.getClass(), "month", (short) 9);
        setShortField(term6870, term6870.getClass(), "day", (short) 3);
        setField(term6869, term6869.getClass(), "date", term6870);
        setByteField(term6874, term6874.getClass(), "hour", (byte) 10);
        setByteField(term6874, term6874.getClass(), "minute", (byte) 44);
        setByteField(term6874, term6874.getClass(), "second", (byte) 5);
        setIntField(term6874, term6874.getClass(), "nano", 572560230);
        setField(term6869, term6869.getClass(), "time", term6874);
        setField(term6794, term6794.getClass(), "updatedAt", term6869);
        setField(term6794, term6794.getClass(), "url", "UfQtPRyWRC");
        setField(term6794, term6794.getClass(), "thumbs", term6891);
        setField(term6709, term6709.getClass(), "avatar", term6794);
        setField(term6899, term6899.getClass(), "id", term6900);
        setField(term6899, term6899.getClass(), "userId", term6902);
        setField(term6899, term6899.getClass(), "postCount", term6904);
        setField(term6899, term6899.getClass(), "likeCount", term6906);
        setField(term6899, term6899.getClass(), "followingCount", term6908);
        setField(term6899, term6899.getClass(), "followerCount", term6910);
        setIntField(term6913, term6913.getClass(), "year", 2020);
        setShortField(term6913, term6913.getClass(), "month", (short) 8);
        setShortField(term6913, term6913.getClass(), "day", (short) 16);
        setField(term6912, term6912.getClass(), "date", term6913);
        setByteField(term6917, term6917.getClass(), "hour", (byte) 4);
        setByteField(term6917, term6917.getClass(), "minute", (byte) 37);
        setByteField(term6917, term6917.getClass(), "second", (byte) 19);
        setIntField(term6917, term6917.getClass(), "nano", 605410923);
        setField(term6912, term6912.getClass(), "time", term6917);
        setField(term6899, term6899.getClass(), "createdAt", term6912);
        setIntField(term6923, term6923.getClass(), "year", 2028);
        setShortField(term6923, term6923.getClass(), "month", (short) 5);
        setShortField(term6923, term6923.getClass(), "day", (short) 2);
        setField(term6922, term6922.getClass(), "date", term6923);
        setByteField(term6927, term6927.getClass(), "hour", (byte) 2);
        setByteField(term6927, term6927.getClass(), "minute", (byte) 59);
        setByteField(term6927, term6927.getClass(), "second", (byte) 30);
        setIntField(term6927, term6927.getClass(), "nano", 222274238);
        setField(term6922, term6922.getClass(), "time", term6927);
        setField(term6899, term6899.getClass(), "updatedAt", term6922);
        setField(term6709, term6709.getClass(), "stat", term6899);
        setField(term6709, term6709.getClass(), "following", term6932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowing", argTypes, term6709, args);
    }

};


