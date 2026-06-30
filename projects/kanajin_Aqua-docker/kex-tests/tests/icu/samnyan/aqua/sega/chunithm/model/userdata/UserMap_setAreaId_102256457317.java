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

public class UserMap_setAreaId_102256457317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286251;
     Object term286538;

    public UserMap_setAreaId_102256457317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term286257 = new Long(-8033044954947064558L);
        term286251 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term286253 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term286255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term286271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286417 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286463 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term286251, term286251.getClass(), "id", 8533632177187405209L);
        setLongField(term286253, term286253.getClass(), "id", 7691914418659253004L);
        setLongField(term286255, term286255.getClass(), "id", -8890905894692514776L);
        setField(term286255, term286255.getClass(), "extId", term286257);
        setField(term286255, term286255.getClass(), "luid", "SMGxdSkULI");
        setIntField(term286272, term286272.getClass(), "year", 2020);
        setShortField(term286272, term286272.getClass(), "month", (short) 12);
        setShortField(term286272, term286272.getClass(), "day", (short) 7);
        setField(term286271, term286271.getClass(), "date", term286272);
        setByteField(term286276, term286276.getClass(), "hour", (byte) 0);
        setByteField(term286276, term286276.getClass(), "minute", (byte) 47);
        setByteField(term286276, term286276.getClass(), "second", (byte) 59);
        setIntField(term286276, term286276.getClass(), "nano", 357814760);
        setField(term286271, term286271.getClass(), "time", term286276);
        setField(term286255, term286255.getClass(), "registerTime", term286271);
        setIntField(term286282, term286282.getClass(), "year", 2021);
        setShortField(term286282, term286282.getClass(), "month", (short) 3);
        setShortField(term286282, term286282.getClass(), "day", (short) 16);
        setField(term286281, term286281.getClass(), "date", term286282);
        setByteField(term286286, term286286.getClass(), "hour", (byte) 16);
        setByteField(term286286, term286286.getClass(), "minute", (byte) 55);
        setByteField(term286286, term286286.getClass(), "second", (byte) 42);
        setIntField(term286286, term286286.getClass(), "nano", 316513306);
        setField(term286281, term286281.getClass(), "time", term286286);
        setField(term286255, term286255.getClass(), "accessTime", term286281);
        setField(term286253, term286253.getClass(), "card", term286255);
        setField(term286253, term286253.getClass(), "userName", "RMIhjBTBMG");
        setIntField(term286304, term286304.getClass(), "year", 2015);
        setShortField(term286304, term286304.getClass(), "month", (short) 10);
        setShortField(term286304, term286304.getClass(), "day", (short) 23);
        setField(term286303, term286303.getClass(), "date", term286304);
        setByteField(term286308, term286308.getClass(), "hour", (byte) 6);
        setByteField(term286308, term286308.getClass(), "minute", (byte) 20);
        setByteField(term286308, term286308.getClass(), "second", (byte) 44);
        setIntField(term286308, term286308.getClass(), "nano", 711844459);
        setField(term286303, term286303.getClass(), "time", term286308);
        setField(term286253, term286253.getClass(), "lastLoginDate", term286303);
        setBooleanField(term286253, term286253.getClass(), "isWebJoin", true);
        setField(term286253, term286253.getClass(), "webLimitDate", "YHgYdYacoD");
        setIntField(term286253, term286253.getClass(), "level", 80250518);
        setIntField(term286253, term286253.getClass(), "reincarnationNum", 1213620067);
        setField(term286253, term286253.getClass(), "exp", "eNokNpUJyH");
        setLongField(term286253, term286253.getClass(), "point", 2347103903798520229L);
        setLongField(term286253, term286253.getClass(), "totalPoint", 496363067304632356L);
        setIntField(term286253, term286253.getClass(), "playCount", 755859860);
        setIntField(term286253, term286253.getClass(), "multiPlayCount", -569124511);
        setIntField(term286253, term286253.getClass(), "multiWinCount", -654736850);
        setIntField(term286253, term286253.getClass(), "requestResCount", 346888763);
        setIntField(term286253, term286253.getClass(), "acceptResCount", 801146791);
        setIntField(term286253, term286253.getClass(), "successResCount", -2039233257);
        setIntField(term286253, term286253.getClass(), "playerRating", -209516690);
        setIntField(term286253, term286253.getClass(), "highestRating", 767276213);
        setIntField(term286253, term286253.getClass(), "nameplateId", 1443840804);
        setIntField(term286253, term286253.getClass(), "frameId", -1858397011);
        setIntField(term286253, term286253.getClass(), "characterId", -730490288);
        setIntField(term286253, term286253.getClass(), "trophyId", 1732277430);
        setIntField(term286253, term286253.getClass(), "playedTutorialBit", -992269487);
        setIntField(term286253, term286253.getClass(), "firstTutorialCancelNum", 182251243);
        setIntField(term286253, term286253.getClass(), "masterTutorialCancelNum", 164845144);
        setIntField(term286253, term286253.getClass(), "totalRepertoireCount", -852907978);
        setIntField(term286253, term286253.getClass(), "totalMapNum", -1262475668);
        setLongField(term286253, term286253.getClass(), "totalHiScore", 1064707213332578186L);
        setLongField(term286253, term286253.getClass(), "totalBasicHighScore", 8450625741710194467L);
        setLongField(term286253, term286253.getClass(), "totalAdvancedHighScore", 5301845140827278235L);
        setLongField(term286253, term286253.getClass(), "totalExpertHighScore", -2293526197698880438L);
        setLongField(term286253, term286253.getClass(), "totalMasterHighScore", -7542520442432811164L);
        setIntField(term286365, term286365.getClass(), "year", 2024);
        setShortField(term286365, term286365.getClass(), "month", (short) 12);
        setShortField(term286365, term286365.getClass(), "day", (short) 14);
        setField(term286364, term286364.getClass(), "date", term286365);
        setByteField(term286369, term286369.getClass(), "hour", (byte) 2);
        setByteField(term286369, term286369.getClass(), "minute", (byte) 26);
        setByteField(term286369, term286369.getClass(), "second", (byte) 56);
        setIntField(term286369, term286369.getClass(), "nano", 663598831);
        setField(term286364, term286364.getClass(), "time", term286369);
        setField(term286253, term286253.getClass(), "eventWatchedDate", term286364);
        setIntField(term286253, term286253.getClass(), "friendCount", -1725400520);
        setBooleanField(term286253, term286253.getClass(), "isMaimai", false);
        setField(term286253, term286253.getClass(), "firstGameId", "VVCfLfrbwI");
        setField(term286253, term286253.getClass(), "firstRomVersion", "pJBxuaCMAx");
        setField(term286253, term286253.getClass(), "firstDataVersion", "oucuJZavwE");
        setIntField(term286413, term286413.getClass(), "year", 2025);
        setShortField(term286413, term286413.getClass(), "month", (short) 4);
        setShortField(term286413, term286413.getClass(), "day", (short) 22);
        setField(term286412, term286412.getClass(), "date", term286413);
        setByteField(term286417, term286417.getClass(), "hour", (byte) 3);
        setByteField(term286417, term286417.getClass(), "minute", (byte) 27);
        setByteField(term286417, term286417.getClass(), "second", (byte) 11);
        setIntField(term286417, term286417.getClass(), "nano", 541679490);
        setField(term286412, term286412.getClass(), "time", term286417);
        setField(term286253, term286253.getClass(), "firstPlayDate", term286412);
        setField(term286253, term286253.getClass(), "lastGameId", "wZoQWYVMQg");
        setField(term286253, term286253.getClass(), "lastRomVersion", "WFCgxTJVwD");
        setField(term286253, term286253.getClass(), "lastDataVersion", "KUUxlthDsn");
        setIntField(term286459, term286459.getClass(), "year", 2010);
        setShortField(term286459, term286459.getClass(), "month", (short) 6);
        setShortField(term286459, term286459.getClass(), "day", (short) 29);
        setField(term286458, term286458.getClass(), "date", term286459);
        setByteField(term286463, term286463.getClass(), "hour", (byte) 22);
        setByteField(term286463, term286463.getClass(), "minute", (byte) 10);
        setByteField(term286463, term286463.getClass(), "second", (byte) 30);
        setIntField(term286463, term286463.getClass(), "nano", 399323037);
        setField(term286458, term286458.getClass(), "time", term286463);
        setField(term286253, term286253.getClass(), "lastPlayDate", term286458);
        setIntField(term286253, term286253.getClass(), "lastPlaceId", 1608751044);
        setField(term286253, term286253.getClass(), "lastPlaceName", "almiLtzMxP");
        setField(term286253, term286253.getClass(), "lastRegionId", "qJJVKWtQic");
        setField(term286253, term286253.getClass(), "lastRegionName", "kugTVFFpsO");
        setField(term286253, term286253.getClass(), "lastAllNetId", "DWtHUNpDzA");
        setField(term286253, term286253.getClass(), "lastClientId", "rcBporRNoY");
        setField(term286251, term286251.getClass(), "user", term286253);
        setIntField(term286251, term286251.getClass(), "mapId", 1965647979);
        setIntField(term286251, term286251.getClass(), "position", -1937704960);
        setBooleanField(term286251, term286251.getClass(), "isClear", true);
        setIntField(term286251, term286251.getClass(), "areaId", -1274831267);
        setIntField(term286251, term286251.getClass(), "routeNumber", 1669039106);
        setIntField(term286251, term286251.getClass(), "eventId", -2061505753);
        setIntField(term286251, term286251.getClass(), "rate", -509886343);
        setIntField(term286251, term286251.getClass(), "statusCount", 1135879823);
        setBooleanField(term286251, term286251.getClass(), "isValid", true);
        term286538 = new Integer(1398941025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286538;
        callMethod(klass, "setAreaId", argTypes, term286251, args);
    }

};


