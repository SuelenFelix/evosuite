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

public class UserDataExService_getByUser_7105937031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8271;

    public UserDataExService_getByUser_7105937031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8275 = new Long(2120084523938730454L);
        term8271 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term8273 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8326 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8481 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8271, term8271.getClass(), "id", 174253963298276221L);
        setLongField(term8273, term8273.getClass(), "id", 3713624957161771816L);
        setField(term8273, term8273.getClass(), "extId", term8275);
        setField(term8273, term8273.getClass(), "luid", "NxgmYPzWCI");
        setIntField(term8290, term8290.getClass(), "year", 2027);
        setShortField(term8290, term8290.getClass(), "month", (short) 9);
        setShortField(term8290, term8290.getClass(), "day", (short) 29);
        setField(term8289, term8289.getClass(), "date", term8290);
        setByteField(term8294, term8294.getClass(), "hour", (byte) 19);
        setByteField(term8294, term8294.getClass(), "minute", (byte) 13);
        setByteField(term8294, term8294.getClass(), "second", (byte) 31);
        setIntField(term8294, term8294.getClass(), "nano", 854066575);
        setField(term8289, term8289.getClass(), "time", term8294);
        setField(term8273, term8273.getClass(), "registerTime", term8289);
        setIntField(term8300, term8300.getClass(), "year", 2025);
        setShortField(term8300, term8300.getClass(), "month", (short) 11);
        setShortField(term8300, term8300.getClass(), "day", (short) 16);
        setField(term8299, term8299.getClass(), "date", term8300);
        setByteField(term8304, term8304.getClass(), "hour", (byte) 12);
        setByteField(term8304, term8304.getClass(), "minute", (byte) 27);
        setByteField(term8304, term8304.getClass(), "second", (byte) 36);
        setIntField(term8304, term8304.getClass(), "nano", 699989217);
        setField(term8299, term8299.getClass(), "time", term8304);
        setField(term8273, term8273.getClass(), "accessTime", term8299);
        setField(term8271, term8271.getClass(), "card", term8273);
        setField(term8271, term8271.getClass(), "userName", "SqjyKmayBx");
        setIntField(term8322, term8322.getClass(), "year", 2018);
        setShortField(term8322, term8322.getClass(), "month", (short) 10);
        setShortField(term8322, term8322.getClass(), "day", (short) 3);
        setField(term8321, term8321.getClass(), "date", term8322);
        setByteField(term8326, term8326.getClass(), "hour", (byte) 12);
        setByteField(term8326, term8326.getClass(), "minute", (byte) 49);
        setByteField(term8326, term8326.getClass(), "second", (byte) 38);
        setIntField(term8326, term8326.getClass(), "nano", 549840711);
        setField(term8321, term8321.getClass(), "time", term8326);
        setField(term8271, term8271.getClass(), "lastLoginDate", term8321);
        setBooleanField(term8271, term8271.getClass(), "isWebJoin", false);
        setField(term8271, term8271.getClass(), "webLimitDate", "XjDhvToxJy");
        setIntField(term8271, term8271.getClass(), "level", -280113263);
        setIntField(term8271, term8271.getClass(), "reincarnationNum", 529625347);
        setField(term8271, term8271.getClass(), "exp", "nxSTJflLQy");
        setLongField(term8271, term8271.getClass(), "point", 6130232388739280211L);
        setLongField(term8271, term8271.getClass(), "totalPoint", 3423965054378869855L);
        setIntField(term8271, term8271.getClass(), "playCount", 1409095253);
        setIntField(term8271, term8271.getClass(), "multiPlayCount", 315179039);
        setIntField(term8271, term8271.getClass(), "multiWinCount", -1835923897);
        setIntField(term8271, term8271.getClass(), "requestResCount", -341287775);
        setIntField(term8271, term8271.getClass(), "acceptResCount", -1651110911);
        setIntField(term8271, term8271.getClass(), "successResCount", -1934033808);
        setIntField(term8271, term8271.getClass(), "playerRating", 950322609);
        setIntField(term8271, term8271.getClass(), "highestRating", -2023791789);
        setIntField(term8271, term8271.getClass(), "nameplateId", 353974456);
        setIntField(term8271, term8271.getClass(), "frameId", -485108462);
        setIntField(term8271, term8271.getClass(), "characterId", 1418551216);
        setIntField(term8271, term8271.getClass(), "trophyId", -626779272);
        setIntField(term8271, term8271.getClass(), "playedTutorialBit", -1150062870);
        setIntField(term8271, term8271.getClass(), "firstTutorialCancelNum", -886200503);
        setIntField(term8271, term8271.getClass(), "masterTutorialCancelNum", 1136393691);
        setIntField(term8271, term8271.getClass(), "totalRepertoireCount", -1288536479);
        setIntField(term8271, term8271.getClass(), "totalMapNum", 1092038167);
        setLongField(term8271, term8271.getClass(), "totalHiScore", -593735869267672817L);
        setLongField(term8271, term8271.getClass(), "totalBasicHighScore", 6041374912351843923L);
        setLongField(term8271, term8271.getClass(), "totalAdvancedHighScore", 2535970782317488741L);
        setLongField(term8271, term8271.getClass(), "totalExpertHighScore", -5258945362776941718L);
        setLongField(term8271, term8271.getClass(), "totalMasterHighScore", 24067105862153728L);
        setIntField(term8383, term8383.getClass(), "year", 2017);
        setShortField(term8383, term8383.getClass(), "month", (short) 6);
        setShortField(term8383, term8383.getClass(), "day", (short) 7);
        setField(term8382, term8382.getClass(), "date", term8383);
        setByteField(term8387, term8387.getClass(), "hour", (byte) 13);
        setByteField(term8387, term8387.getClass(), "minute", (byte) 52);
        setByteField(term8387, term8387.getClass(), "second", (byte) 17);
        setIntField(term8387, term8387.getClass(), "nano", 78180039);
        setField(term8382, term8382.getClass(), "time", term8387);
        setField(term8271, term8271.getClass(), "eventWatchedDate", term8382);
        setIntField(term8271, term8271.getClass(), "friendCount", 1879729823);
        setBooleanField(term8271, term8271.getClass(), "isMaimai", false);
        setField(term8271, term8271.getClass(), "firstGameId", "FlHzxEfFzI");
        setField(term8271, term8271.getClass(), "firstRomVersion", "aSATgQUpoe");
        setField(term8271, term8271.getClass(), "firstDataVersion", "VkPSXewZfB");
        setIntField(term8431, term8431.getClass(), "year", 2017);
        setShortField(term8431, term8431.getClass(), "month", (short) 6);
        setShortField(term8431, term8431.getClass(), "day", (short) 23);
        setField(term8430, term8430.getClass(), "date", term8431);
        setByteField(term8435, term8435.getClass(), "hour", (byte) 23);
        setByteField(term8435, term8435.getClass(), "minute", (byte) 29);
        setByteField(term8435, term8435.getClass(), "second", (byte) 17);
        setIntField(term8435, term8435.getClass(), "nano", 491252353);
        setField(term8430, term8430.getClass(), "time", term8435);
        setField(term8271, term8271.getClass(), "firstPlayDate", term8430);
        setField(term8271, term8271.getClass(), "lastGameId", "ubodzJoMGW");
        setField(term8271, term8271.getClass(), "lastRomVersion", "weddIktxOA");
        setField(term8271, term8271.getClass(), "lastDataVersion", "uSlMeISsDD");
        setIntField(term8477, term8477.getClass(), "year", 2021);
        setShortField(term8477, term8477.getClass(), "month", (short) 12);
        setShortField(term8477, term8477.getClass(), "day", (short) 23);
        setField(term8476, term8476.getClass(), "date", term8477);
        setByteField(term8481, term8481.getClass(), "hour", (byte) 18);
        setByteField(term8481, term8481.getClass(), "minute", (byte) 52);
        setByteField(term8481, term8481.getClass(), "second", (byte) 27);
        setIntField(term8481, term8481.getClass(), "nano", 512484524);
        setField(term8476, term8476.getClass(), "time", term8481);
        setField(term8271, term8271.getClass(), "lastPlayDate", term8476);
        setIntField(term8271, term8271.getClass(), "lastPlaceId", 1443855558);
        setField(term8271, term8271.getClass(), "lastPlaceName", "WdCiTDUKqn");
        setField(term8271, term8271.getClass(), "lastRegionId", "PSizQDoxxe");
        setField(term8271, term8271.getClass(), "lastRegionName", "mKaHyMybrK");
        setField(term8271, term8271.getClass(), "lastAllNetId", "AyrEXuGrEj");
        setField(term8271, term8271.getClass(), "lastClientId", "yevIIoVYHq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDataExService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term8271;
        callMethod(klass, "getByUser", argTypes, null, args);
    }

};


