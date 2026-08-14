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

public class UserDTO_toString_76685456730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15781;

    public UserDTO_toString_76685456730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15782 = new Long(7800835025296877231L);
        Long term15832 = new Long(-187772971269812453L);
        Long term15867 = new Long(468487103823886117L);
        Long term15869 = new Long(4139034517298316285L);
        Class<? extends Object> term16057 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term16056 = ((Class) term16057).getDeclaredField((String) "LOCAL");
        ((Field) term16056).setAccessible(true);
        Object enum28 = ((Field) term16056).get((Object) null);
        Long term15917 = new Long(5797412846146719084L);
        HashMap term15963 = new HashMap();
        Long term15972 = new Long(5319740127125920367L);
        Long term15974 = new Long(6465987664600701876L);
        Long term15976 = new Long(-136372844051852955L);
        Long term15978 = new Long(-7632759764262745126L);
        Long term15980 = new Long(3746481521207337771L);
        Long term15982 = new Long(4341016500855678917L);
        Boolean term16004 = new Boolean(true);
        term15781 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term15846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15866 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term15904 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term15931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15946 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15971 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term15984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15999 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15781, term15781.getClass(), "id", term15782);
        setField(term15781, term15781.getClass(), "username", "pumvwBWvpy");
        setField(term15781, term15781.getClass(), "password", "HwLHeGLyhe");
        setField(term15781, term15781.getClass(), "mobile", "RDnkgWkcbz");
        setField(term15781, term15781.getClass(), "email", "IBpaxltauX");
        setField(term15781, term15781.getClass(), "avatarId", term15832);
        setField(term15781, term15781.getClass(), "intro", "hePqROaplw");
        setIntField(term15847, term15847.getClass(), "year", 2029);
        setShortField(term15847, term15847.getClass(), "month", (short) 7);
        setShortField(term15847, term15847.getClass(), "day", (short) 14);
        setField(term15846, term15846.getClass(), "date", term15847);
        setByteField(term15851, term15851.getClass(), "hour", (byte) 17);
        setByteField(term15851, term15851.getClass(), "minute", (byte) 37);
        setByteField(term15851, term15851.getClass(), "second", (byte) 39);
        setIntField(term15851, term15851.getClass(), "nano", 333402299);
        setField(term15846, term15846.getClass(), "time", term15851);
        setField(term15781, term15781.getClass(), "createdAt", term15846);
        setIntField(term15857, term15857.getClass(), "year", 2025);
        setShortField(term15857, term15857.getClass(), "month", (short) 10);
        setShortField(term15857, term15857.getClass(), "day", (short) 30);
        setField(term15856, term15856.getClass(), "date", term15857);
        setByteField(term15861, term15861.getClass(), "hour", (byte) 1);
        setByteField(term15861, term15861.getClass(), "minute", (byte) 4);
        setByteField(term15861, term15861.getClass(), "second", (byte) 18);
        setIntField(term15861, term15861.getClass(), "nano", 717716253);
        setField(term15856, term15856.getClass(), "time", term15861);
        setField(term15781, term15781.getClass(), "updatedAt", term15856);
        setField(term15866, term15866.getClass(), "id", term15867);
        setField(term15866, term15866.getClass(), "userId", term15869);
        setField(term15866, term15866.getClass(), "region", enum28);
        setField(term15866, term15866.getClass(), "bucket", "PJcSNDruWd");
        setField(term15866, term15866.getClass(), "path", "VVNNlAePXF");
        setField(term15904, term15904.getClass(), "name", "jnwVnmKAFv");
        setField(term15904, term15904.getClass(), "size", term15917);
        setField(term15904, term15904.getClass(), "type", "TXyHhqeCjR");
        setField(term15866, term15866.getClass(), "meta", term15904);
        setIntField(term15932, term15932.getClass(), "year", 2019);
        setShortField(term15932, term15932.getClass(), "month", (short) 7);
        setShortField(term15932, term15932.getClass(), "day", (short) 4);
        setField(term15931, term15931.getClass(), "date", term15932);
        setByteField(term15936, term15936.getClass(), "hour", (byte) 19);
        setByteField(term15936, term15936.getClass(), "minute", (byte) 20);
        setByteField(term15936, term15936.getClass(), "second", (byte) 59);
        setIntField(term15936, term15936.getClass(), "nano", 246784352);
        setField(term15931, term15931.getClass(), "time", term15936);
        setField(term15866, term15866.getClass(), "createdAt", term15931);
        setIntField(term15942, term15942.getClass(), "year", 2023);
        setShortField(term15942, term15942.getClass(), "month", (short) 7);
        setShortField(term15942, term15942.getClass(), "day", (short) 1);
        setField(term15941, term15941.getClass(), "date", term15942);
        setByteField(term15946, term15946.getClass(), "hour", (byte) 4);
        setByteField(term15946, term15946.getClass(), "minute", (byte) 33);
        setByteField(term15946, term15946.getClass(), "second", (byte) 9);
        setIntField(term15946, term15946.getClass(), "nano", 94365310);
        setField(term15941, term15941.getClass(), "time", term15946);
        setField(term15866, term15866.getClass(), "updatedAt", term15941);
        setField(term15866, term15866.getClass(), "url", "lZIgPZPgTu");
        setField(term15866, term15866.getClass(), "thumbs", term15963);
        setField(term15781, term15781.getClass(), "avatar", term15866);
        setField(term15971, term15971.getClass(), "id", term15972);
        setField(term15971, term15971.getClass(), "userId", term15974);
        setField(term15971, term15971.getClass(), "postCount", term15976);
        setField(term15971, term15971.getClass(), "likeCount", term15978);
        setField(term15971, term15971.getClass(), "followingCount", term15980);
        setField(term15971, term15971.getClass(), "followerCount", term15982);
        setIntField(term15985, term15985.getClass(), "year", 2013);
        setShortField(term15985, term15985.getClass(), "month", (short) 10);
        setShortField(term15985, term15985.getClass(), "day", (short) 7);
        setField(term15984, term15984.getClass(), "date", term15985);
        setByteField(term15989, term15989.getClass(), "hour", (byte) 12);
        setByteField(term15989, term15989.getClass(), "minute", (byte) 2);
        setByteField(term15989, term15989.getClass(), "second", (byte) 42);
        setIntField(term15989, term15989.getClass(), "nano", 202308437);
        setField(term15984, term15984.getClass(), "time", term15989);
        setField(term15971, term15971.getClass(), "createdAt", term15984);
        setIntField(term15995, term15995.getClass(), "year", 2019);
        setShortField(term15995, term15995.getClass(), "month", (short) 12);
        setShortField(term15995, term15995.getClass(), "day", (short) 29);
        setField(term15994, term15994.getClass(), "date", term15995);
        setByteField(term15999, term15999.getClass(), "hour", (byte) 16);
        setByteField(term15999, term15999.getClass(), "minute", (byte) 10);
        setByteField(term15999, term15999.getClass(), "second", (byte) 1);
        setIntField(term15999, term15999.getClass(), "nano", 198559584);
        setField(term15994, term15994.getClass(), "time", term15999);
        setField(term15971, term15971.getClass(), "updatedAt", term15994);
        setField(term15781, term15781.getClass(), "stat", term15971);
        setField(term15781, term15781.getClass(), "following", term16004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15781, args);
    }

};


