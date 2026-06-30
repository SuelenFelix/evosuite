package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOptionExService_save_11095314370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3821;

    public UserGameOptionExService_save_11095314370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3827 = new Long(-5476826692763582090L);
        term3821 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term3823 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term3825 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3846 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4033 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3821, term3821.getClass(), "id", 3620247240684476031L);
        setLongField(term3823, term3823.getClass(), "id", 8313800941204938919L);
        setLongField(term3825, term3825.getClass(), "id", -1214968196781083707L);
        setField(term3825, term3825.getClass(), "extId", term3827);
        setField(term3825, term3825.getClass(), "luid", "HDaezxQfQR");
        setIntField(term3842, term3842.getClass(), "year", 2019);
        setShortField(term3842, term3842.getClass(), "month", (short) 8);
        setShortField(term3842, term3842.getClass(), "day", (short) 12);
        setField(term3841, term3841.getClass(), "date", term3842);
        setByteField(term3846, term3846.getClass(), "hour", (byte) 14);
        setByteField(term3846, term3846.getClass(), "minute", (byte) 1);
        setByteField(term3846, term3846.getClass(), "second", (byte) 51);
        setIntField(term3846, term3846.getClass(), "nano", 499021786);
        setField(term3841, term3841.getClass(), "time", term3846);
        setField(term3825, term3825.getClass(), "registerTime", term3841);
        setIntField(term3852, term3852.getClass(), "year", 2014);
        setShortField(term3852, term3852.getClass(), "month", (short) 7);
        setShortField(term3852, term3852.getClass(), "day", (short) 22);
        setField(term3851, term3851.getClass(), "date", term3852);
        setByteField(term3856, term3856.getClass(), "hour", (byte) 9);
        setByteField(term3856, term3856.getClass(), "minute", (byte) 40);
        setByteField(term3856, term3856.getClass(), "second", (byte) 34);
        setIntField(term3856, term3856.getClass(), "nano", 463008257);
        setField(term3851, term3851.getClass(), "time", term3856);
        setField(term3825, term3825.getClass(), "accessTime", term3851);
        setField(term3823, term3823.getClass(), "card", term3825);
        setField(term3823, term3823.getClass(), "userName", "iikZEapDlu");
        setIntField(term3874, term3874.getClass(), "year", 2027);
        setShortField(term3874, term3874.getClass(), "month", (short) 6);
        setShortField(term3874, term3874.getClass(), "day", (short) 20);
        setField(term3873, term3873.getClass(), "date", term3874);
        setByteField(term3878, term3878.getClass(), "hour", (byte) 23);
        setByteField(term3878, term3878.getClass(), "minute", (byte) 21);
        setByteField(term3878, term3878.getClass(), "second", (byte) 6);
        setIntField(term3878, term3878.getClass(), "nano", 897776059);
        setField(term3873, term3873.getClass(), "time", term3878);
        setField(term3823, term3823.getClass(), "lastLoginDate", term3873);
        setBooleanField(term3823, term3823.getClass(), "isWebJoin", true);
        setField(term3823, term3823.getClass(), "webLimitDate", "nhoHrZfnIN");
        setIntField(term3823, term3823.getClass(), "level", 803925431);
        setIntField(term3823, term3823.getClass(), "reincarnationNum", 76929641);
        setField(term3823, term3823.getClass(), "exp", "ZkMALXpEAZ");
        setLongField(term3823, term3823.getClass(), "point", -1804015692891701666L);
        setLongField(term3823, term3823.getClass(), "totalPoint", -6432617521836576658L);
        setIntField(term3823, term3823.getClass(), "playCount", -2003192918);
        setIntField(term3823, term3823.getClass(), "multiPlayCount", -1362856620);
        setIntField(term3823, term3823.getClass(), "multiWinCount", -1835839814);
        setIntField(term3823, term3823.getClass(), "requestResCount", -1404350380);
        setIntField(term3823, term3823.getClass(), "acceptResCount", -2013924238);
        setIntField(term3823, term3823.getClass(), "successResCount", 579006268);
        setIntField(term3823, term3823.getClass(), "playerRating", -1694747156);
        setIntField(term3823, term3823.getClass(), "highestRating", 1466373988);
        setIntField(term3823, term3823.getClass(), "nameplateId", -358526505);
        setIntField(term3823, term3823.getClass(), "frameId", 1843268026);
        setIntField(term3823, term3823.getClass(), "characterId", 954660603);
        setIntField(term3823, term3823.getClass(), "trophyId", -1351605385);
        setIntField(term3823, term3823.getClass(), "playedTutorialBit", 278355793);
        setIntField(term3823, term3823.getClass(), "firstTutorialCancelNum", -310648604);
        setIntField(term3823, term3823.getClass(), "masterTutorialCancelNum", -648200466);
        setIntField(term3823, term3823.getClass(), "totalRepertoireCount", 2007134147);
        setIntField(term3823, term3823.getClass(), "totalMapNum", 993388358);
        setLongField(term3823, term3823.getClass(), "totalHiScore", -2255965562447970862L);
        setLongField(term3823, term3823.getClass(), "totalBasicHighScore", 148047808219672941L);
        setLongField(term3823, term3823.getClass(), "totalAdvancedHighScore", 7489064039921396098L);
        setLongField(term3823, term3823.getClass(), "totalExpertHighScore", 6843866297465638866L);
        setLongField(term3823, term3823.getClass(), "totalMasterHighScore", -4023935540989049732L);
        setIntField(term3935, term3935.getClass(), "year", 2016);
        setShortField(term3935, term3935.getClass(), "month", (short) 3);
        setShortField(term3935, term3935.getClass(), "day", (short) 20);
        setField(term3934, term3934.getClass(), "date", term3935);
        setByteField(term3939, term3939.getClass(), "hour", (byte) 0);
        setByteField(term3939, term3939.getClass(), "minute", (byte) 54);
        setByteField(term3939, term3939.getClass(), "second", (byte) 6);
        setIntField(term3939, term3939.getClass(), "nano", 183302469);
        setField(term3934, term3934.getClass(), "time", term3939);
        setField(term3823, term3823.getClass(), "eventWatchedDate", term3934);
        setIntField(term3823, term3823.getClass(), "friendCount", -765191335);
        setBooleanField(term3823, term3823.getClass(), "isMaimai", true);
        setField(term3823, term3823.getClass(), "firstGameId", "tXfQjSqDzN");
        setField(term3823, term3823.getClass(), "firstRomVersion", "BjugTaMcxJ");
        setField(term3823, term3823.getClass(), "firstDataVersion", "vGiuZVPJNH");
        setIntField(term3983, term3983.getClass(), "year", 2013);
        setShortField(term3983, term3983.getClass(), "month", (short) 11);
        setShortField(term3983, term3983.getClass(), "day", (short) 19);
        setField(term3982, term3982.getClass(), "date", term3983);
        setByteField(term3987, term3987.getClass(), "hour", (byte) 6);
        setByteField(term3987, term3987.getClass(), "minute", (byte) 45);
        setByteField(term3987, term3987.getClass(), "second", (byte) 10);
        setIntField(term3987, term3987.getClass(), "nano", 288981190);
        setField(term3982, term3982.getClass(), "time", term3987);
        setField(term3823, term3823.getClass(), "firstPlayDate", term3982);
        setField(term3823, term3823.getClass(), "lastGameId", "tlzpzIjMib");
        setField(term3823, term3823.getClass(), "lastRomVersion", "AZdLeSugwv");
        setField(term3823, term3823.getClass(), "lastDataVersion", "RMsXuyzKJV");
        setIntField(term4029, term4029.getClass(), "year", 2025);
        setShortField(term4029, term4029.getClass(), "month", (short) 9);
        setShortField(term4029, term4029.getClass(), "day", (short) 18);
        setField(term4028, term4028.getClass(), "date", term4029);
        setByteField(term4033, term4033.getClass(), "hour", (byte) 16);
        setByteField(term4033, term4033.getClass(), "minute", (byte) 1);
        setByteField(term4033, term4033.getClass(), "second", (byte) 23);
        setIntField(term4033, term4033.getClass(), "nano", 178285726);
        setField(term4028, term4028.getClass(), "time", term4033);
        setField(term3823, term3823.getClass(), "lastPlayDate", term4028);
        setIntField(term3823, term3823.getClass(), "lastPlaceId", -1697741155);
        setField(term3823, term3823.getClass(), "lastPlaceName", "FwPbDZcHmB");
        setField(term3823, term3823.getClass(), "lastRegionId", "hOncybyCAH");
        setField(term3823, term3823.getClass(), "lastRegionName", "QduALnDSVo");
        setField(term3823, term3823.getClass(), "lastAllNetId", "izPpKDErnQ");
        setField(term3823, term3823.getClass(), "lastClientId", "NnpwZBUTvx");
        setField(term3821, term3821.getClass(), "user", term3823);
        setIntField(term3821, term3821.getClass(), "ext1", 1295839803);
        setIntField(term3821, term3821.getClass(), "ext2", -1891015523);
        setIntField(term3821, term3821.getClass(), "ext3", -1560631747);
        setIntField(term3821, term3821.getClass(), "ext4", 1215150180);
        setIntField(term3821, term3821.getClass(), "ext5", -1422859977);
        setIntField(term3821, term3821.getClass(), "ext6", -1972436591);
        setIntField(term3821, term3821.getClass(), "ext7", 68922753);
        setIntField(term3821, term3821.getClass(), "ext8", -220791533);
        setIntField(term3821, term3821.getClass(), "ext9", 1741500243);
        setIntField(term3821, term3821.getClass(), "ext10", -2070466617);
        setIntField(term3821, term3821.getClass(), "ext11", -1127721881);
        setIntField(term3821, term3821.getClass(), "ext12", 1074848808);
        setIntField(term3821, term3821.getClass(), "ext13", -146054762);
        setIntField(term3821, term3821.getClass(), "ext14", 798043553);
        setIntField(term3821, term3821.getClass(), "ext15", 533197381);
        setIntField(term3821, term3821.getClass(), "ext16", 1048271679);
        setIntField(term3821, term3821.getClass(), "ext17", -1529797673);
        setIntField(term3821, term3821.getClass(), "ext18", -868676396);
        setIntField(term3821, term3821.getClass(), "ext19", 1922684808);
        setIntField(term3821, term3821.getClass(), "ext20", -2005784375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGameOptionExService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Object[] args = new Object[1];
        args[0] = term3821;
        callMethod(klass, "save", argTypes, null, args);
    }

};


