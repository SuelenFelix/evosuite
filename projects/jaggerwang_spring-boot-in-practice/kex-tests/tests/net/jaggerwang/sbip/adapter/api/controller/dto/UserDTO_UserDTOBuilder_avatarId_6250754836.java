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

public class UserDTO_UserDTOBuilder_avatarId_6250754836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31770;
     Object term31995;

    public UserDTO_UserDTOBuilder_avatarId_6250754836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31771 = new Long(-8792567429538693571L);
        Long term31821 = new Long(3810487266967550400L);
        Long term31856 = new Long(8965244485590834147L);
        Long term31858 = new Long(-4825509285016265943L);
        Class<? extends Object> term32048 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term32047 = ((Class) term32048).getDeclaredField((String) "LOCAL");
        ((Field) term32047).setAccessible(true);
        Object enum62 = ((Field) term32047).get((Object) null);
        Long term31906 = new Long(-1283563319051310751L);
        HashMap term31952 = new HashMap();
        Long term31961 = new Long(-1413653349314156044L);
        Long term31963 = new Long(742593745847006219L);
        Long term31965 = new Long(6801904611028883308L);
        Long term31967 = new Long(-7717027128782374599L);
        Long term31969 = new Long(4872921045907555824L);
        Long term31971 = new Long(6921855906793748590L);
        Boolean term31993 = new Boolean(true);
        term31770 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        Object term31835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31855 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term31893 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term31920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31925 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31935 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31960 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term31973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31988 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31770, term31770.getClass(), "id", term31771);
        setField(term31770, term31770.getClass(), "username", "FvUCZgTXhq");
        setField(term31770, term31770.getClass(), "password", "wWWidPCHzx");
        setField(term31770, term31770.getClass(), "mobile", "OwPIiBRuKK");
        setField(term31770, term31770.getClass(), "email", "sgfGySMODT");
        setField(term31770, term31770.getClass(), "avatarId", term31821);
        setField(term31770, term31770.getClass(), "intro", "ndAITnOsny");
        setIntField(term31836, term31836.getClass(), "year", 2017);
        setShortField(term31836, term31836.getClass(), "month", (short) 11);
        setShortField(term31836, term31836.getClass(), "day", (short) 19);
        setField(term31835, term31835.getClass(), "date", term31836);
        setByteField(term31840, term31840.getClass(), "hour", (byte) 2);
        setByteField(term31840, term31840.getClass(), "minute", (byte) 52);
        setByteField(term31840, term31840.getClass(), "second", (byte) 15);
        setIntField(term31840, term31840.getClass(), "nano", 625778933);
        setField(term31835, term31835.getClass(), "time", term31840);
        setField(term31770, term31770.getClass(), "createdAt", term31835);
        setIntField(term31846, term31846.getClass(), "year", 2015);
        setShortField(term31846, term31846.getClass(), "month", (short) 10);
        setShortField(term31846, term31846.getClass(), "day", (short) 3);
        setField(term31845, term31845.getClass(), "date", term31846);
        setByteField(term31850, term31850.getClass(), "hour", (byte) 10);
        setByteField(term31850, term31850.getClass(), "minute", (byte) 45);
        setByteField(term31850, term31850.getClass(), "second", (byte) 18);
        setIntField(term31850, term31850.getClass(), "nano", 333457081);
        setField(term31845, term31845.getClass(), "time", term31850);
        setField(term31770, term31770.getClass(), "updatedAt", term31845);
        setField(term31855, term31855.getClass(), "id", term31856);
        setField(term31855, term31855.getClass(), "userId", term31858);
        setField(term31855, term31855.getClass(), "region", enum62);
        setField(term31855, term31855.getClass(), "bucket", "CVZnTiJucs");
        setField(term31855, term31855.getClass(), "path", "ecHEQufXoq");
        setField(term31893, term31893.getClass(), "name", "btBLMvHzJg");
        setField(term31893, term31893.getClass(), "size", term31906);
        setField(term31893, term31893.getClass(), "type", "JdOMfNWgLP");
        setField(term31855, term31855.getClass(), "meta", term31893);
        setIntField(term31921, term31921.getClass(), "year", 2013);
        setShortField(term31921, term31921.getClass(), "month", (short) 3);
        setShortField(term31921, term31921.getClass(), "day", (short) 3);
        setField(term31920, term31920.getClass(), "date", term31921);
        setByteField(term31925, term31925.getClass(), "hour", (byte) 22);
        setByteField(term31925, term31925.getClass(), "minute", (byte) 27);
        setByteField(term31925, term31925.getClass(), "second", (byte) 52);
        setIntField(term31925, term31925.getClass(), "nano", 968779154);
        setField(term31920, term31920.getClass(), "time", term31925);
        setField(term31855, term31855.getClass(), "createdAt", term31920);
        setIntField(term31931, term31931.getClass(), "year", 2019);
        setShortField(term31931, term31931.getClass(), "month", (short) 8);
        setShortField(term31931, term31931.getClass(), "day", (short) 31);
        setField(term31930, term31930.getClass(), "date", term31931);
        setByteField(term31935, term31935.getClass(), "hour", (byte) 22);
        setByteField(term31935, term31935.getClass(), "minute", (byte) 31);
        setByteField(term31935, term31935.getClass(), "second", (byte) 36);
        setIntField(term31935, term31935.getClass(), "nano", 403358328);
        setField(term31930, term31930.getClass(), "time", term31935);
        setField(term31855, term31855.getClass(), "updatedAt", term31930);
        setField(term31855, term31855.getClass(), "url", "uWqXrwAsDU");
        setField(term31855, term31855.getClass(), "thumbs", term31952);
        setField(term31770, term31770.getClass(), "avatar", term31855);
        setField(term31960, term31960.getClass(), "id", term31961);
        setField(term31960, term31960.getClass(), "userId", term31963);
        setField(term31960, term31960.getClass(), "postCount", term31965);
        setField(term31960, term31960.getClass(), "likeCount", term31967);
        setField(term31960, term31960.getClass(), "followingCount", term31969);
        setField(term31960, term31960.getClass(), "followerCount", term31971);
        setIntField(term31974, term31974.getClass(), "year", 2021);
        setShortField(term31974, term31974.getClass(), "month", (short) 11);
        setShortField(term31974, term31974.getClass(), "day", (short) 19);
        setField(term31973, term31973.getClass(), "date", term31974);
        setByteField(term31978, term31978.getClass(), "hour", (byte) 4);
        setByteField(term31978, term31978.getClass(), "minute", (byte) 39);
        setByteField(term31978, term31978.getClass(), "second", (byte) 43);
        setIntField(term31978, term31978.getClass(), "nano", 638695514);
        setField(term31973, term31973.getClass(), "time", term31978);
        setField(term31960, term31960.getClass(), "createdAt", term31973);
        setIntField(term31984, term31984.getClass(), "year", 2015);
        setShortField(term31984, term31984.getClass(), "month", (short) 10);
        setShortField(term31984, term31984.getClass(), "day", (short) 4);
        setField(term31983, term31983.getClass(), "date", term31984);
        setByteField(term31988, term31988.getClass(), "hour", (byte) 1);
        setByteField(term31988, term31988.getClass(), "minute", (byte) 29);
        setByteField(term31988, term31988.getClass(), "second", (byte) 20);
        setIntField(term31988, term31988.getClass(), "nano", 558273892);
        setField(term31983, term31983.getClass(), "time", term31988);
        setField(term31960, term31960.getClass(), "updatedAt", term31983);
        setField(term31770, term31770.getClass(), "stat", term31960);
        setField(term31770, term31770.getClass(), "following", term31993);
        term31995 = new Long(7450182989722198450L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31995;
        callMethod(klass, "avatarId", argTypes, term31770, args);
    }

};


