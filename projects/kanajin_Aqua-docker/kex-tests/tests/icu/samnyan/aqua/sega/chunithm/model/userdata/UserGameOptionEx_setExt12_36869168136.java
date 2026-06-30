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
import java.lang.Integer;

public class UserGameOptionEx_setExt12_36869168136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326161;
     Object term326459;

    public UserGameOptionEx_setExt12_36869168136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term326167 = new Long(-1283563319051310751L);
        term326161 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term326163 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term326165 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term326181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term326161, term326161.getClass(), "id", -6654481035819419893L);
        setLongField(term326163, term326163.getClass(), "id", -1400699043856699114L);
        setLongField(term326165, term326165.getClass(), "id", 3788155517212733447L);
        setField(term326165, term326165.getClass(), "extId", term326167);
        setField(term326165, term326165.getClass(), "luid", "dPenXKHvpD");
        setIntField(term326182, term326182.getClass(), "year", 2026);
        setShortField(term326182, term326182.getClass(), "month", (short) 12);
        setShortField(term326182, term326182.getClass(), "day", (short) 26);
        setField(term326181, term326181.getClass(), "date", term326182);
        setByteField(term326186, term326186.getClass(), "hour", (byte) 5);
        setByteField(term326186, term326186.getClass(), "minute", (byte) 44);
        setByteField(term326186, term326186.getClass(), "second", (byte) 15);
        setIntField(term326186, term326186.getClass(), "nano", 897587342);
        setField(term326181, term326181.getClass(), "time", term326186);
        setField(term326165, term326165.getClass(), "registerTime", term326181);
        setIntField(term326192, term326192.getClass(), "year", 2024);
        setShortField(term326192, term326192.getClass(), "month", (short) 1);
        setShortField(term326192, term326192.getClass(), "day", (short) 9);
        setField(term326191, term326191.getClass(), "date", term326192);
        setByteField(term326196, term326196.getClass(), "hour", (byte) 17);
        setByteField(term326196, term326196.getClass(), "minute", (byte) 43);
        setByteField(term326196, term326196.getClass(), "second", (byte) 24);
        setIntField(term326196, term326196.getClass(), "nano", 856461941);
        setField(term326191, term326191.getClass(), "time", term326196);
        setField(term326165, term326165.getClass(), "accessTime", term326191);
        setField(term326163, term326163.getClass(), "card", term326165);
        setField(term326163, term326163.getClass(), "userName", "FdDLKyiSTJ");
        setIntField(term326214, term326214.getClass(), "year", 2014);
        setShortField(term326214, term326214.getClass(), "month", (short) 10);
        setShortField(term326214, term326214.getClass(), "day", (short) 23);
        setField(term326213, term326213.getClass(), "date", term326214);
        setByteField(term326218, term326218.getClass(), "hour", (byte) 7);
        setByteField(term326218, term326218.getClass(), "minute", (byte) 50);
        setByteField(term326218, term326218.getClass(), "second", (byte) 43);
        setIntField(term326218, term326218.getClass(), "nano", 763488974);
        setField(term326213, term326213.getClass(), "time", term326218);
        setField(term326163, term326163.getClass(), "lastLoginDate", term326213);
        setBooleanField(term326163, term326163.getClass(), "isWebJoin", false);
        setField(term326163, term326163.getClass(), "webLimitDate", "kicHqYxIOg");
        setIntField(term326163, term326163.getClass(), "level", -676341161);
        setIntField(term326163, term326163.getClass(), "reincarnationNum", 1659199645);
        setField(term326163, term326163.getClass(), "exp", "XYrfZHToau");
        setLongField(term326163, term326163.getClass(), "point", -2801739313642089867L);
        setLongField(term326163, term326163.getClass(), "totalPoint", 4733832587986907425L);
        setIntField(term326163, term326163.getClass(), "playCount", 125450855);
        setIntField(term326163, term326163.getClass(), "multiPlayCount", -522733425);
        setIntField(term326163, term326163.getClass(), "multiWinCount", 1372640843);
        setIntField(term326163, term326163.getClass(), "requestResCount", -1716607087);
        setIntField(term326163, term326163.getClass(), "acceptResCount", -1406941573);
        setIntField(term326163, term326163.getClass(), "successResCount", -422036741);
        setIntField(term326163, term326163.getClass(), "playerRating", 255603992);
        setIntField(term326163, term326163.getClass(), "highestRating", 480186865);
        setIntField(term326163, term326163.getClass(), "nameplateId", 255438967);
        setIntField(term326163, term326163.getClass(), "frameId", -871959442);
        setIntField(term326163, term326163.getClass(), "characterId", -1297201519);
        setIntField(term326163, term326163.getClass(), "trophyId", -914784517);
        setIntField(term326163, term326163.getClass(), "playedTutorialBit", 798258525);
        setIntField(term326163, term326163.getClass(), "firstTutorialCancelNum", 746153151);
        setIntField(term326163, term326163.getClass(), "masterTutorialCancelNum", -699538920);
        setIntField(term326163, term326163.getClass(), "totalRepertoireCount", 516510463);
        setIntField(term326163, term326163.getClass(), "totalMapNum", -1973306872);
        setLongField(term326163, term326163.getClass(), "totalHiScore", -4323196132938348713L);
        setLongField(term326163, term326163.getClass(), "totalBasicHighScore", -7899334444959009409L);
        setLongField(term326163, term326163.getClass(), "totalAdvancedHighScore", 1416784594638459493L);
        setLongField(term326163, term326163.getClass(), "totalExpertHighScore", 3864377246512683466L);
        setLongField(term326163, term326163.getClass(), "totalMasterHighScore", 3755340473882774321L);
        setIntField(term326275, term326275.getClass(), "year", 2028);
        setShortField(term326275, term326275.getClass(), "month", (short) 8);
        setShortField(term326275, term326275.getClass(), "day", (short) 5);
        setField(term326274, term326274.getClass(), "date", term326275);
        setByteField(term326279, term326279.getClass(), "hour", (byte) 1);
        setByteField(term326279, term326279.getClass(), "minute", (byte) 47);
        setByteField(term326279, term326279.getClass(), "second", (byte) 42);
        setIntField(term326279, term326279.getClass(), "nano", 7628090);
        setField(term326274, term326274.getClass(), "time", term326279);
        setField(term326163, term326163.getClass(), "eventWatchedDate", term326274);
        setIntField(term326163, term326163.getClass(), "friendCount", 1932414041);
        setBooleanField(term326163, term326163.getClass(), "isMaimai", true);
        setField(term326163, term326163.getClass(), "firstGameId", "BXQOPEyMOL");
        setField(term326163, term326163.getClass(), "firstRomVersion", "fwFmEEZWcB");
        setField(term326163, term326163.getClass(), "firstDataVersion", "AICUpHDOzG");
        setIntField(term326323, term326323.getClass(), "year", 2020);
        setShortField(term326323, term326323.getClass(), "month", (short) 8);
        setShortField(term326323, term326323.getClass(), "day", (short) 3);
        setField(term326322, term326322.getClass(), "date", term326323);
        setByteField(term326327, term326327.getClass(), "hour", (byte) 18);
        setByteField(term326327, term326327.getClass(), "minute", (byte) 49);
        setByteField(term326327, term326327.getClass(), "second", (byte) 30);
        setIntField(term326327, term326327.getClass(), "nano", 724894823);
        setField(term326322, term326322.getClass(), "time", term326327);
        setField(term326163, term326163.getClass(), "firstPlayDate", term326322);
        setField(term326163, term326163.getClass(), "lastGameId", "DmkTfwDLZj");
        setField(term326163, term326163.getClass(), "lastRomVersion", "bHRIWgbDGz");
        setField(term326163, term326163.getClass(), "lastDataVersion", "twivmCinJk");
        setIntField(term326369, term326369.getClass(), "year", 2029);
        setShortField(term326369, term326369.getClass(), "month", (short) 6);
        setShortField(term326369, term326369.getClass(), "day", (short) 7);
        setField(term326368, term326368.getClass(), "date", term326369);
        setByteField(term326373, term326373.getClass(), "hour", (byte) 7);
        setByteField(term326373, term326373.getClass(), "minute", (byte) 10);
        setByteField(term326373, term326373.getClass(), "second", (byte) 45);
        setIntField(term326373, term326373.getClass(), "nano", 371315014);
        setField(term326368, term326368.getClass(), "time", term326373);
        setField(term326163, term326163.getClass(), "lastPlayDate", term326368);
        setIntField(term326163, term326163.getClass(), "lastPlaceId", 919972160);
        setField(term326163, term326163.getClass(), "lastPlaceName", "eJyhQVneUo");
        setField(term326163, term326163.getClass(), "lastRegionId", "oPFkgizJGX");
        setField(term326163, term326163.getClass(), "lastRegionName", "ZyJFJOIYqn");
        setField(term326163, term326163.getClass(), "lastAllNetId", "KuaRCYIXDE");
        setField(term326163, term326163.getClass(), "lastClientId", "FidXoPwlYA");
        setField(term326161, term326161.getClass(), "user", term326163);
        setIntField(term326161, term326161.getClass(), "ext1", 1434660658);
        setIntField(term326161, term326161.getClass(), "ext2", -1188362131);
        setIntField(term326161, term326161.getClass(), "ext3", -1549313487);
        setIntField(term326161, term326161.getClass(), "ext4", -1858318156);
        setIntField(term326161, term326161.getClass(), "ext5", -581381438);
        setIntField(term326161, term326161.getClass(), "ext6", -1808491228);
        setIntField(term326161, term326161.getClass(), "ext7", 379274483);
        setIntField(term326161, term326161.getClass(), "ext8", 1360925526);
        setIntField(term326161, term326161.getClass(), "ext9", -1170114262);
        setIntField(term326161, term326161.getClass(), "ext10", 1472006438);
        setIntField(term326161, term326161.getClass(), "ext11", -1709980802);
        setIntField(term326161, term326161.getClass(), "ext12", -844647509);
        setIntField(term326161, term326161.getClass(), "ext13", -1745270330);
        setIntField(term326161, term326161.getClass(), "ext14", -1544639528);
        setIntField(term326161, term326161.getClass(), "ext15", 1385044115);
        setIntField(term326161, term326161.getClass(), "ext16", 1139126133);
        setIntField(term326161, term326161.getClass(), "ext17", 1498393769);
        setIntField(term326161, term326161.getClass(), "ext18", -320845496);
        setIntField(term326161, term326161.getClass(), "ext19", 1894524360);
        setIntField(term326161, term326161.getClass(), "ext20", -161445471);
        term326459 = new Integer(-834299730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term326459;
        callMethod(klass, "setExt12", argTypes, term326161, args);
    }

};


