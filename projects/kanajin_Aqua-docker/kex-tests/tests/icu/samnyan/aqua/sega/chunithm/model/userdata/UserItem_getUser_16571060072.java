package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserItem_getUser_16571060072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121911;

    public UserItem_getUser_16571060072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term121917 = new Long(1044883697493326351L);
        term121911 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term121913 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term121915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term121931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121946 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122123 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term121911, term121911.getClass(), "id", 8871323174678446760L);
        setLongField(term121913, term121913.getClass(), "id", 3223972915053331194L);
        setLongField(term121915, term121915.getClass(), "id", 2718592162673693959L);
        setField(term121915, term121915.getClass(), "extId", term121917);
        setField(term121915, term121915.getClass(), "luid", "SzvLbLIVwG");
        setIntField(term121932, term121932.getClass(), "year", 2029);
        setShortField(term121932, term121932.getClass(), "month", (short) 9);
        setShortField(term121932, term121932.getClass(), "day", (short) 15);
        setField(term121931, term121931.getClass(), "date", term121932);
        setByteField(term121936, term121936.getClass(), "hour", (byte) 8);
        setByteField(term121936, term121936.getClass(), "minute", (byte) 38);
        setByteField(term121936, term121936.getClass(), "second", (byte) 35);
        setIntField(term121936, term121936.getClass(), "nano", 900863726);
        setField(term121931, term121931.getClass(), "time", term121936);
        setField(term121915, term121915.getClass(), "registerTime", term121931);
        setIntField(term121942, term121942.getClass(), "year", 2020);
        setShortField(term121942, term121942.getClass(), "month", (short) 12);
        setShortField(term121942, term121942.getClass(), "day", (short) 28);
        setField(term121941, term121941.getClass(), "date", term121942);
        setByteField(term121946, term121946.getClass(), "hour", (byte) 9);
        setByteField(term121946, term121946.getClass(), "minute", (byte) 30);
        setByteField(term121946, term121946.getClass(), "second", (byte) 17);
        setIntField(term121946, term121946.getClass(), "nano", 277857354);
        setField(term121941, term121941.getClass(), "time", term121946);
        setField(term121915, term121915.getClass(), "accessTime", term121941);
        setField(term121913, term121913.getClass(), "card", term121915);
        setField(term121913, term121913.getClass(), "userName", "mKnmYOhILq");
        setIntField(term121964, term121964.getClass(), "year", 2017);
        setShortField(term121964, term121964.getClass(), "month", (short) 4);
        setShortField(term121964, term121964.getClass(), "day", (short) 18);
        setField(term121963, term121963.getClass(), "date", term121964);
        setByteField(term121968, term121968.getClass(), "hour", (byte) 19);
        setByteField(term121968, term121968.getClass(), "minute", (byte) 26);
        setByteField(term121968, term121968.getClass(), "second", (byte) 1);
        setIntField(term121968, term121968.getClass(), "nano", 504673119);
        setField(term121963, term121963.getClass(), "time", term121968);
        setField(term121913, term121913.getClass(), "lastLoginDate", term121963);
        setBooleanField(term121913, term121913.getClass(), "isWebJoin", true);
        setField(term121913, term121913.getClass(), "webLimitDate", "YXXfMygQcG");
        setIntField(term121913, term121913.getClass(), "level", -1846882062);
        setIntField(term121913, term121913.getClass(), "reincarnationNum", 1727415377);
        setField(term121913, term121913.getClass(), "exp", "sQAHuaiApa");
        setLongField(term121913, term121913.getClass(), "point", -5221197842613792699L);
        setLongField(term121913, term121913.getClass(), "totalPoint", 8797226144896755216L);
        setIntField(term121913, term121913.getClass(), "playCount", -553367118);
        setIntField(term121913, term121913.getClass(), "multiPlayCount", 1734441946);
        setIntField(term121913, term121913.getClass(), "multiWinCount", -1316758147);
        setIntField(term121913, term121913.getClass(), "requestResCount", -266645356);
        setIntField(term121913, term121913.getClass(), "acceptResCount", -1168974406);
        setIntField(term121913, term121913.getClass(), "successResCount", 649099374);
        setIntField(term121913, term121913.getClass(), "playerRating", -1673318908);
        setIntField(term121913, term121913.getClass(), "highestRating", -748711480);
        setIntField(term121913, term121913.getClass(), "nameplateId", -1598682190);
        setIntField(term121913, term121913.getClass(), "frameId", -1485075510);
        setIntField(term121913, term121913.getClass(), "characterId", -628388239);
        setIntField(term121913, term121913.getClass(), "trophyId", 971487780);
        setIntField(term121913, term121913.getClass(), "playedTutorialBit", 1887441979);
        setIntField(term121913, term121913.getClass(), "firstTutorialCancelNum", -1582466429);
        setIntField(term121913, term121913.getClass(), "masterTutorialCancelNum", 2050053472);
        setIntField(term121913, term121913.getClass(), "totalRepertoireCount", -794841275);
        setIntField(term121913, term121913.getClass(), "totalMapNum", -1965551214);
        setLongField(term121913, term121913.getClass(), "totalHiScore", -4524622074523380827L);
        setLongField(term121913, term121913.getClass(), "totalBasicHighScore", 3094101285402200938L);
        setLongField(term121913, term121913.getClass(), "totalAdvancedHighScore", -1691547788317547227L);
        setLongField(term121913, term121913.getClass(), "totalExpertHighScore", 5409837706558296333L);
        setLongField(term121913, term121913.getClass(), "totalMasterHighScore", -6838907525371973667L);
        setIntField(term122025, term122025.getClass(), "year", 2018);
        setShortField(term122025, term122025.getClass(), "month", (short) 5);
        setShortField(term122025, term122025.getClass(), "day", (short) 12);
        setField(term122024, term122024.getClass(), "date", term122025);
        setByteField(term122029, term122029.getClass(), "hour", (byte) 3);
        setByteField(term122029, term122029.getClass(), "minute", (byte) 9);
        setByteField(term122029, term122029.getClass(), "second", (byte) 25);
        setIntField(term122029, term122029.getClass(), "nano", 472452160);
        setField(term122024, term122024.getClass(), "time", term122029);
        setField(term121913, term121913.getClass(), "eventWatchedDate", term122024);
        setIntField(term121913, term121913.getClass(), "friendCount", 417272371);
        setBooleanField(term121913, term121913.getClass(), "isMaimai", false);
        setField(term121913, term121913.getClass(), "firstGameId", "xDMxegGKqV");
        setField(term121913, term121913.getClass(), "firstRomVersion", "zPKOGLLGZN");
        setField(term121913, term121913.getClass(), "firstDataVersion", "lajHHsoSDZ");
        setIntField(term122073, term122073.getClass(), "year", 2021);
        setShortField(term122073, term122073.getClass(), "month", (short) 10);
        setShortField(term122073, term122073.getClass(), "day", (short) 21);
        setField(term122072, term122072.getClass(), "date", term122073);
        setByteField(term122077, term122077.getClass(), "hour", (byte) 18);
        setByteField(term122077, term122077.getClass(), "minute", (byte) 13);
        setByteField(term122077, term122077.getClass(), "second", (byte) 5);
        setIntField(term122077, term122077.getClass(), "nano", 498696785);
        setField(term122072, term122072.getClass(), "time", term122077);
        setField(term121913, term121913.getClass(), "firstPlayDate", term122072);
        setField(term121913, term121913.getClass(), "lastGameId", "YdUxGeeDjc");
        setField(term121913, term121913.getClass(), "lastRomVersion", "TbgzoLhCKy");
        setField(term121913, term121913.getClass(), "lastDataVersion", "MXAuemWmBo");
        setIntField(term122119, term122119.getClass(), "year", 2023);
        setShortField(term122119, term122119.getClass(), "month", (short) 10);
        setShortField(term122119, term122119.getClass(), "day", (short) 7);
        setField(term122118, term122118.getClass(), "date", term122119);
        setByteField(term122123, term122123.getClass(), "hour", (byte) 5);
        setByteField(term122123, term122123.getClass(), "minute", (byte) 55);
        setByteField(term122123, term122123.getClass(), "second", (byte) 51);
        setIntField(term122123, term122123.getClass(), "nano", 618539758);
        setField(term122118, term122118.getClass(), "time", term122123);
        setField(term121913, term121913.getClass(), "lastPlayDate", term122118);
        setIntField(term121913, term121913.getClass(), "lastPlaceId", -93440765);
        setField(term121913, term121913.getClass(), "lastPlaceName", "IEbHsgLKBk");
        setField(term121913, term121913.getClass(), "lastRegionId", "uFZktToTuS");
        setField(term121913, term121913.getClass(), "lastRegionName", "pVpSARCHtf");
        setField(term121913, term121913.getClass(), "lastAllNetId", "wnvCIiaAYo");
        setField(term121913, term121913.getClass(), "lastClientId", "waPCjDLHIu");
        setField(term121911, term121911.getClass(), "user", term121913);
        setIntField(term121911, term121911.getClass(), "itemKind", -1763224766);
        setIntField(term121911, term121911.getClass(), "itemId", -966554344);
        setIntField(term121911, term121911.getClass(), "stock", 1);
        setBooleanField(term121911, term121911.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term121911, args);
    }

};


