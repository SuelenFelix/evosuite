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

public class UserDTO_getEmail_16092409277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2880;

    public UserDTO_getEmail_16092409277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2881 = new Long(3825396310311739952L);
        Long term2931 = new Long(-3838084482494604218L);
        Long term2966 = new Long(3892018155439224435L);
        Long term2968 = new Long(5953383087795962419L);
        Class<? extends Object> term3156 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term3155 = ((Class) term3156).getDeclaredField((String) "LOCAL");
        ((Field) term3155).setAccessible(true);
        Object enum5 = ((Field) term3155).get((Object) null);
        Long term3016 = new Long(7994303628307559416L);
        HashMap term3062 = new HashMap();
        Long term3071 = new Long(2443640364875054177L);
        Long term3073 = new Long(-1610676979013636850L);
        Long term3075 = new Long(2062173786000223358L);
        Long term3077 = new Long(-8658027316505137504L);
        Long term3079 = new Long(414749984815662075L);
        Long term3081 = new Long(463622836963501975L);
        Boolean term3103 = new Boolean(true);
        term2880 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term2945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2950 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2965 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term3003 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term3030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3070 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term3083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3088 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3098 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2880, term2880.getClass(), "id", term2881);
        setField(term2880, term2880.getClass(), "username", "ieCtQFdkii");
        setField(term2880, term2880.getClass(), "password", "dEnhdmILtU");
        setField(term2880, term2880.getClass(), "mobile", "hoicvmsovO");
        setField(term2880, term2880.getClass(), "email", "eqJfYWRaEL");
        setField(term2880, term2880.getClass(), "avatarId", term2931);
        setField(term2880, term2880.getClass(), "intro", "fhkbdRViHi");
        setIntField(term2946, term2946.getClass(), "year", 2012);
        setShortField(term2946, term2946.getClass(), "month", (short) 3);
        setShortField(term2946, term2946.getClass(), "day", (short) 27);
        setField(term2945, term2945.getClass(), "date", term2946);
        setByteField(term2950, term2950.getClass(), "hour", (byte) 17);
        setByteField(term2950, term2950.getClass(), "minute", (byte) 49);
        setByteField(term2950, term2950.getClass(), "second", (byte) 24);
        setIntField(term2950, term2950.getClass(), "nano", 530647398);
        setField(term2945, term2945.getClass(), "time", term2950);
        setField(term2880, term2880.getClass(), "createdAt", term2945);
        setIntField(term2956, term2956.getClass(), "year", 2010);
        setShortField(term2956, term2956.getClass(), "month", (short) 6);
        setShortField(term2956, term2956.getClass(), "day", (short) 14);
        setField(term2955, term2955.getClass(), "date", term2956);
        setByteField(term2960, term2960.getClass(), "hour", (byte) 6);
        setByteField(term2960, term2960.getClass(), "minute", (byte) 22);
        setByteField(term2960, term2960.getClass(), "second", (byte) 20);
        setIntField(term2960, term2960.getClass(), "nano", 25133051);
        setField(term2955, term2955.getClass(), "time", term2960);
        setField(term2880, term2880.getClass(), "updatedAt", term2955);
        setField(term2965, term2965.getClass(), "id", term2966);
        setField(term2965, term2965.getClass(), "userId", term2968);
        setField(term2965, term2965.getClass(), "region", enum5);
        setField(term2965, term2965.getClass(), "bucket", "uWHnvSvaPl");
        setField(term2965, term2965.getClass(), "path", "kBdSllIBVz");
        setField(term3003, term3003.getClass(), "name", "TJmVBGfTML");
        setField(term3003, term3003.getClass(), "size", term3016);
        setField(term3003, term3003.getClass(), "type", "tPlsykYBqO");
        setField(term2965, term2965.getClass(), "meta", term3003);
        setIntField(term3031, term3031.getClass(), "year", 2010);
        setShortField(term3031, term3031.getClass(), "month", (short) 5);
        setShortField(term3031, term3031.getClass(), "day", (short) 2);
        setField(term3030, term3030.getClass(), "date", term3031);
        setByteField(term3035, term3035.getClass(), "hour", (byte) 2);
        setByteField(term3035, term3035.getClass(), "minute", (byte) 22);
        setByteField(term3035, term3035.getClass(), "second", (byte) 33);
        setIntField(term3035, term3035.getClass(), "nano", 530835039);
        setField(term3030, term3030.getClass(), "time", term3035);
        setField(term2965, term2965.getClass(), "createdAt", term3030);
        setIntField(term3041, term3041.getClass(), "year", 2024);
        setShortField(term3041, term3041.getClass(), "month", (short) 4);
        setShortField(term3041, term3041.getClass(), "day", (short) 24);
        setField(term3040, term3040.getClass(), "date", term3041);
        setByteField(term3045, term3045.getClass(), "hour", (byte) 7);
        setByteField(term3045, term3045.getClass(), "minute", (byte) 2);
        setByteField(term3045, term3045.getClass(), "second", (byte) 51);
        setIntField(term3045, term3045.getClass(), "nano", 635502964);
        setField(term3040, term3040.getClass(), "time", term3045);
        setField(term2965, term2965.getClass(), "updatedAt", term3040);
        setField(term2965, term2965.getClass(), "url", "bLPjGVBhlX");
        setField(term2965, term2965.getClass(), "thumbs", term3062);
        setField(term2880, term2880.getClass(), "avatar", term2965);
        setField(term3070, term3070.getClass(), "id", term3071);
        setField(term3070, term3070.getClass(), "userId", term3073);
        setField(term3070, term3070.getClass(), "postCount", term3075);
        setField(term3070, term3070.getClass(), "likeCount", term3077);
        setField(term3070, term3070.getClass(), "followingCount", term3079);
        setField(term3070, term3070.getClass(), "followerCount", term3081);
        setIntField(term3084, term3084.getClass(), "year", 2010);
        setShortField(term3084, term3084.getClass(), "month", (short) 1);
        setShortField(term3084, term3084.getClass(), "day", (short) 17);
        setField(term3083, term3083.getClass(), "date", term3084);
        setByteField(term3088, term3088.getClass(), "hour", (byte) 13);
        setByteField(term3088, term3088.getClass(), "minute", (byte) 5);
        setByteField(term3088, term3088.getClass(), "second", (byte) 51);
        setIntField(term3088, term3088.getClass(), "nano", 362260580);
        setField(term3083, term3083.getClass(), "time", term3088);
        setField(term3070, term3070.getClass(), "createdAt", term3083);
        setIntField(term3094, term3094.getClass(), "year", 2010);
        setShortField(term3094, term3094.getClass(), "month", (short) 9);
        setShortField(term3094, term3094.getClass(), "day", (short) 28);
        setField(term3093, term3093.getClass(), "date", term3094);
        setByteField(term3098, term3098.getClass(), "hour", (byte) 6);
        setByteField(term3098, term3098.getClass(), "minute", (byte) 4);
        setByteField(term3098, term3098.getClass(), "second", (byte) 54);
        setIntField(term3098, term3098.getClass(), "nano", 604713782);
        setField(term3093, term3093.getClass(), "time", term3098);
        setField(term3070, term3070.getClass(), "updatedAt", term3093);
        setField(term2880, term2880.getClass(), "stat", term3070);
        setField(term2880, term2880.getClass(), "following", term3103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term2880, args);
    }

};


