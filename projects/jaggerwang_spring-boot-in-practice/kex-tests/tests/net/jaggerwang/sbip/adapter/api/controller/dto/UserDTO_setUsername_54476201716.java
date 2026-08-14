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

public class UserDTO_setUsername_54476201716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7805;

    public UserDTO_setUsername_54476201716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7806 = new Long(-7278883608542636188L);
        Long term7856 = new Long(-1539859611880912454L);
        Long term7891 = new Long(4100236067313034103L);
        Long term7893 = new Long(1195529027276497124L);
        Class<? extends Object> term8093 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term8092 = ((Class) term8093).getDeclaredField((String) "LOCAL");
        ((Field) term8092).setAccessible(true);
        Object enum14 = ((Field) term8092).get((Object) null);
        Long term7941 = new Long(-2783999800714825789L);
        HashMap term7987 = new HashMap();
        Long term7996 = new Long(4266570509071948633L);
        Long term7998 = new Long(-7291742736502427077L);
        Long term8000 = new Long(-8121849829073967555L);
        Long term8002 = new Long(5219030281405653303L);
        Long term8004 = new Long(-8471550651709805183L);
        Long term8006 = new Long(-948292411727204525L);
        Boolean term8028 = new Boolean(false);
        term7805 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term7870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7885 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7890 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term7928 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term7955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7970 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7995 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term8008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8013 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8023 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7805, term7805.getClass(), "id", term7806);
        setField(term7805, term7805.getClass(), "username", "hMmaoREuCK");
        setField(term7805, term7805.getClass(), "password", "VeDtgDzGAN");
        setField(term7805, term7805.getClass(), "mobile", "aWYOWZFyaX");
        setField(term7805, term7805.getClass(), "email", "BRIVNtfUWU");
        setField(term7805, term7805.getClass(), "avatarId", term7856);
        setField(term7805, term7805.getClass(), "intro", "DbiCVtPPCT");
        setIntField(term7871, term7871.getClass(), "year", 2025);
        setShortField(term7871, term7871.getClass(), "month", (short) 12);
        setShortField(term7871, term7871.getClass(), "day", (short) 16);
        setField(term7870, term7870.getClass(), "date", term7871);
        setByteField(term7875, term7875.getClass(), "hour", (byte) 7);
        setByteField(term7875, term7875.getClass(), "minute", (byte) 53);
        setByteField(term7875, term7875.getClass(), "second", (byte) 23);
        setIntField(term7875, term7875.getClass(), "nano", 532991944);
        setField(term7870, term7870.getClass(), "time", term7875);
        setField(term7805, term7805.getClass(), "createdAt", term7870);
        setIntField(term7881, term7881.getClass(), "year", 2024);
        setShortField(term7881, term7881.getClass(), "month", (short) 2);
        setShortField(term7881, term7881.getClass(), "day", (short) 5);
        setField(term7880, term7880.getClass(), "date", term7881);
        setByteField(term7885, term7885.getClass(), "hour", (byte) 12);
        setByteField(term7885, term7885.getClass(), "minute", (byte) 28);
        setByteField(term7885, term7885.getClass(), "second", (byte) 37);
        setIntField(term7885, term7885.getClass(), "nano", 689695229);
        setField(term7880, term7880.getClass(), "time", term7885);
        setField(term7805, term7805.getClass(), "updatedAt", term7880);
        setField(term7890, term7890.getClass(), "id", term7891);
        setField(term7890, term7890.getClass(), "userId", term7893);
        setField(term7890, term7890.getClass(), "region", enum14);
        setField(term7890, term7890.getClass(), "bucket", "WzFopsaDuG");
        setField(term7890, term7890.getClass(), "path", "PapWxkhEWe");
        setField(term7928, term7928.getClass(), "name", "smnHEqRFRx");
        setField(term7928, term7928.getClass(), "size", term7941);
        setField(term7928, term7928.getClass(), "type", "XYtryyobou");
        setField(term7890, term7890.getClass(), "meta", term7928);
        setIntField(term7956, term7956.getClass(), "year", 2023);
        setShortField(term7956, term7956.getClass(), "month", (short) 5);
        setShortField(term7956, term7956.getClass(), "day", (short) 23);
        setField(term7955, term7955.getClass(), "date", term7956);
        setByteField(term7960, term7960.getClass(), "hour", (byte) 0);
        setByteField(term7960, term7960.getClass(), "minute", (byte) 50);
        setByteField(term7960, term7960.getClass(), "second", (byte) 5);
        setIntField(term7960, term7960.getClass(), "nano", 296286825);
        setField(term7955, term7955.getClass(), "time", term7960);
        setField(term7890, term7890.getClass(), "createdAt", term7955);
        setIntField(term7966, term7966.getClass(), "year", 2015);
        setShortField(term7966, term7966.getClass(), "month", (short) 2);
        setShortField(term7966, term7966.getClass(), "day", (short) 5);
        setField(term7965, term7965.getClass(), "date", term7966);
        setByteField(term7970, term7970.getClass(), "hour", (byte) 3);
        setByteField(term7970, term7970.getClass(), "minute", (byte) 26);
        setByteField(term7970, term7970.getClass(), "second", (byte) 49);
        setIntField(term7970, term7970.getClass(), "nano", 995758570);
        setField(term7965, term7965.getClass(), "time", term7970);
        setField(term7890, term7890.getClass(), "updatedAt", term7965);
        setField(term7890, term7890.getClass(), "url", "OYbzXylRWW");
        setField(term7890, term7890.getClass(), "thumbs", term7987);
        setField(term7805, term7805.getClass(), "avatar", term7890);
        setField(term7995, term7995.getClass(), "id", term7996);
        setField(term7995, term7995.getClass(), "userId", term7998);
        setField(term7995, term7995.getClass(), "postCount", term8000);
        setField(term7995, term7995.getClass(), "likeCount", term8002);
        setField(term7995, term7995.getClass(), "followingCount", term8004);
        setField(term7995, term7995.getClass(), "followerCount", term8006);
        setIntField(term8009, term8009.getClass(), "year", 2013);
        setShortField(term8009, term8009.getClass(), "month", (short) 5);
        setShortField(term8009, term8009.getClass(), "day", (short) 9);
        setField(term8008, term8008.getClass(), "date", term8009);
        setByteField(term8013, term8013.getClass(), "hour", (byte) 4);
        setByteField(term8013, term8013.getClass(), "minute", (byte) 18);
        setByteField(term8013, term8013.getClass(), "second", (byte) 35);
        setIntField(term8013, term8013.getClass(), "nano", 909079395);
        setField(term8008, term8008.getClass(), "time", term8013);
        setField(term7995, term7995.getClass(), "createdAt", term8008);
        setIntField(term8019, term8019.getClass(), "year", 2015);
        setShortField(term8019, term8019.getClass(), "month", (short) 3);
        setShortField(term8019, term8019.getClass(), "day", (short) 15);
        setField(term8018, term8018.getClass(), "date", term8019);
        setByteField(term8023, term8023.getClass(), "hour", (byte) 8);
        setByteField(term8023, term8023.getClass(), "minute", (byte) 45);
        setByteField(term8023, term8023.getClass(), "second", (byte) 29);
        setIntField(term8023, term8023.getClass(), "nano", 781486470);
        setField(term8018, term8018.getClass(), "time", term8023);
        setField(term7995, term7995.getClass(), "updatedAt", term8018);
        setField(term7805, term7805.getClass(), "stat", term7995);
        setField(term7805, term7805.getClass(), "following", term8028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sQvGcVjdEx";
        callMethod(klass, "setUsername", argTypes, term7805, args);
    }

};


