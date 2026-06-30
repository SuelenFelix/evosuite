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

public class UserItem_setId_20895669817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124071;
     Object term124353;

    public UserItem_setId_20895669817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124077 = new Long(3666226122807672448L);
        term124071 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term124073 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term124075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124237 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124283 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124071, term124071.getClass(), "id", 1482362208900211503L);
        setLongField(term124073, term124073.getClass(), "id", -1129843632528067304L);
        setLongField(term124075, term124075.getClass(), "id", -354016106743752379L);
        setField(term124075, term124075.getClass(), "extId", term124077);
        setField(term124075, term124075.getClass(), "luid", "PcRiAbKXvK");
        setIntField(term124092, term124092.getClass(), "year", 2010);
        setShortField(term124092, term124092.getClass(), "month", (short) 10);
        setShortField(term124092, term124092.getClass(), "day", (short) 6);
        setField(term124091, term124091.getClass(), "date", term124092);
        setByteField(term124096, term124096.getClass(), "hour", (byte) 14);
        setByteField(term124096, term124096.getClass(), "minute", (byte) 36);
        setByteField(term124096, term124096.getClass(), "second", (byte) 14);
        setIntField(term124096, term124096.getClass(), "nano", 964628180);
        setField(term124091, term124091.getClass(), "time", term124096);
        setField(term124075, term124075.getClass(), "registerTime", term124091);
        setIntField(term124102, term124102.getClass(), "year", 2016);
        setShortField(term124102, term124102.getClass(), "month", (short) 11);
        setShortField(term124102, term124102.getClass(), "day", (short) 14);
        setField(term124101, term124101.getClass(), "date", term124102);
        setByteField(term124106, term124106.getClass(), "hour", (byte) 10);
        setByteField(term124106, term124106.getClass(), "minute", (byte) 44);
        setByteField(term124106, term124106.getClass(), "second", (byte) 22);
        setIntField(term124106, term124106.getClass(), "nano", 303456175);
        setField(term124101, term124101.getClass(), "time", term124106);
        setField(term124075, term124075.getClass(), "accessTime", term124101);
        setField(term124073, term124073.getClass(), "card", term124075);
        setField(term124073, term124073.getClass(), "userName", "EhjpwiDlaG");
        setIntField(term124124, term124124.getClass(), "year", 2021);
        setShortField(term124124, term124124.getClass(), "month", (short) 7);
        setShortField(term124124, term124124.getClass(), "day", (short) 24);
        setField(term124123, term124123.getClass(), "date", term124124);
        setByteField(term124128, term124128.getClass(), "hour", (byte) 8);
        setByteField(term124128, term124128.getClass(), "minute", (byte) 13);
        setByteField(term124128, term124128.getClass(), "second", (byte) 23);
        setIntField(term124128, term124128.getClass(), "nano", 516398012);
        setField(term124123, term124123.getClass(), "time", term124128);
        setField(term124073, term124073.getClass(), "lastLoginDate", term124123);
        setBooleanField(term124073, term124073.getClass(), "isWebJoin", true);
        setField(term124073, term124073.getClass(), "webLimitDate", "HowhKdqLBn");
        setIntField(term124073, term124073.getClass(), "level", 613249396);
        setIntField(term124073, term124073.getClass(), "reincarnationNum", 47568249);
        setField(term124073, term124073.getClass(), "exp", "FXwdarPRcu");
        setLongField(term124073, term124073.getClass(), "point", 726307351633159651L);
        setLongField(term124073, term124073.getClass(), "totalPoint", -9018117462270242726L);
        setIntField(term124073, term124073.getClass(), "playCount", -512122488);
        setIntField(term124073, term124073.getClass(), "multiPlayCount", 1660000916);
        setIntField(term124073, term124073.getClass(), "multiWinCount", -949546282);
        setIntField(term124073, term124073.getClass(), "requestResCount", -1522246141);
        setIntField(term124073, term124073.getClass(), "acceptResCount", 2132977330);
        setIntField(term124073, term124073.getClass(), "successResCount", 352025141);
        setIntField(term124073, term124073.getClass(), "playerRating", -135640820);
        setIntField(term124073, term124073.getClass(), "highestRating", 515232963);
        setIntField(term124073, term124073.getClass(), "nameplateId", -67715099);
        setIntField(term124073, term124073.getClass(), "frameId", 1291945924);
        setIntField(term124073, term124073.getClass(), "characterId", 1997045566);
        setIntField(term124073, term124073.getClass(), "trophyId", 1476366061);
        setIntField(term124073, term124073.getClass(), "playedTutorialBit", -834804985);
        setIntField(term124073, term124073.getClass(), "firstTutorialCancelNum", -299552913);
        setIntField(term124073, term124073.getClass(), "masterTutorialCancelNum", 1340088266);
        setIntField(term124073, term124073.getClass(), "totalRepertoireCount", -1394987080);
        setIntField(term124073, term124073.getClass(), "totalMapNum", 677698603);
        setLongField(term124073, term124073.getClass(), "totalHiScore", -3250841166001991044L);
        setLongField(term124073, term124073.getClass(), "totalBasicHighScore", -8761479282111843329L);
        setLongField(term124073, term124073.getClass(), "totalAdvancedHighScore", -4801997186754480510L);
        setLongField(term124073, term124073.getClass(), "totalExpertHighScore", 4966511745890103930L);
        setLongField(term124073, term124073.getClass(), "totalMasterHighScore", -1806994155328201304L);
        setIntField(term124185, term124185.getClass(), "year", 2017);
        setShortField(term124185, term124185.getClass(), "month", (short) 2);
        setShortField(term124185, term124185.getClass(), "day", (short) 17);
        setField(term124184, term124184.getClass(), "date", term124185);
        setByteField(term124189, term124189.getClass(), "hour", (byte) 3);
        setByteField(term124189, term124189.getClass(), "minute", (byte) 40);
        setByteField(term124189, term124189.getClass(), "second", (byte) 46);
        setIntField(term124189, term124189.getClass(), "nano", 480309563);
        setField(term124184, term124184.getClass(), "time", term124189);
        setField(term124073, term124073.getClass(), "eventWatchedDate", term124184);
        setIntField(term124073, term124073.getClass(), "friendCount", -2094588812);
        setBooleanField(term124073, term124073.getClass(), "isMaimai", true);
        setField(term124073, term124073.getClass(), "firstGameId", "HzWNDDgUtc");
        setField(term124073, term124073.getClass(), "firstRomVersion", "umqvxozDpq");
        setField(term124073, term124073.getClass(), "firstDataVersion", "HieTCBVeDD");
        setIntField(term124233, term124233.getClass(), "year", 2016);
        setShortField(term124233, term124233.getClass(), "month", (short) 10);
        setShortField(term124233, term124233.getClass(), "day", (short) 5);
        setField(term124232, term124232.getClass(), "date", term124233);
        setByteField(term124237, term124237.getClass(), "hour", (byte) 14);
        setByteField(term124237, term124237.getClass(), "minute", (byte) 46);
        setByteField(term124237, term124237.getClass(), "second", (byte) 15);
        setIntField(term124237, term124237.getClass(), "nano", 906066268);
        setField(term124232, term124232.getClass(), "time", term124237);
        setField(term124073, term124073.getClass(), "firstPlayDate", term124232);
        setField(term124073, term124073.getClass(), "lastGameId", "cTSwYlchXv");
        setField(term124073, term124073.getClass(), "lastRomVersion", "QbalcMEEdv");
        setField(term124073, term124073.getClass(), "lastDataVersion", "xiYIPdzlXo");
        setIntField(term124279, term124279.getClass(), "year", 2010);
        setShortField(term124279, term124279.getClass(), "month", (short) 5);
        setShortField(term124279, term124279.getClass(), "day", (short) 30);
        setField(term124278, term124278.getClass(), "date", term124279);
        setByteField(term124283, term124283.getClass(), "hour", (byte) 3);
        setByteField(term124283, term124283.getClass(), "minute", (byte) 54);
        setByteField(term124283, term124283.getClass(), "second", (byte) 30);
        setIntField(term124283, term124283.getClass(), "nano", 431489936);
        setField(term124278, term124278.getClass(), "time", term124283);
        setField(term124073, term124073.getClass(), "lastPlayDate", term124278);
        setIntField(term124073, term124073.getClass(), "lastPlaceId", 2038499448);
        setField(term124073, term124073.getClass(), "lastPlaceName", "MYonccVvzc");
        setField(term124073, term124073.getClass(), "lastRegionId", "cxwnnBgfmJ");
        setField(term124073, term124073.getClass(), "lastRegionName", "tNXQltoRar");
        setField(term124073, term124073.getClass(), "lastAllNetId", "ALdRRCOlhZ");
        setField(term124073, term124073.getClass(), "lastClientId", "vXmDfMgmHu");
        setField(term124071, term124071.getClass(), "user", term124073);
        setIntField(term124071, term124071.getClass(), "itemKind", -2065835383);
        setIntField(term124071, term124071.getClass(), "itemId", 580583133);
        setIntField(term124071, term124071.getClass(), "stock", 1);
        setBooleanField(term124071, term124071.getClass(), "isValid", true);
        term124353 = new Long(-2991983062869407726L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term124353;
        callMethod(klass, "setId", argTypes, term124071, args);
    }

};


