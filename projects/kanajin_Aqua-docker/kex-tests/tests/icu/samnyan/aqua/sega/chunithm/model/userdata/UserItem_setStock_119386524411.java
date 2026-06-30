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

public class UserItem_setStock_119386524411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126231;
     Object term126513;

    public UserItem_setStock_119386524411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126237 = new Long(-67485388932970712L);
        term126231 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term126233 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term126235 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126443 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126231, term126231.getClass(), "id", 1691040836532636814L);
        setLongField(term126233, term126233.getClass(), "id", 7590864789026672175L);
        setLongField(term126235, term126235.getClass(), "id", 3632403742038865944L);
        setField(term126235, term126235.getClass(), "extId", term126237);
        setField(term126235, term126235.getClass(), "luid", "INoAjOhMEq");
        setIntField(term126252, term126252.getClass(), "year", 2025);
        setShortField(term126252, term126252.getClass(), "month", (short) 6);
        setShortField(term126252, term126252.getClass(), "day", (short) 26);
        setField(term126251, term126251.getClass(), "date", term126252);
        setByteField(term126256, term126256.getClass(), "hour", (byte) 5);
        setByteField(term126256, term126256.getClass(), "minute", (byte) 5);
        setByteField(term126256, term126256.getClass(), "second", (byte) 26);
        setIntField(term126256, term126256.getClass(), "nano", 427591205);
        setField(term126251, term126251.getClass(), "time", term126256);
        setField(term126235, term126235.getClass(), "registerTime", term126251);
        setIntField(term126262, term126262.getClass(), "year", 2010);
        setShortField(term126262, term126262.getClass(), "month", (short) 6);
        setShortField(term126262, term126262.getClass(), "day", (short) 30);
        setField(term126261, term126261.getClass(), "date", term126262);
        setByteField(term126266, term126266.getClass(), "hour", (byte) 5);
        setByteField(term126266, term126266.getClass(), "minute", (byte) 19);
        setByteField(term126266, term126266.getClass(), "second", (byte) 42);
        setIntField(term126266, term126266.getClass(), "nano", 772603752);
        setField(term126261, term126261.getClass(), "time", term126266);
        setField(term126235, term126235.getClass(), "accessTime", term126261);
        setField(term126233, term126233.getClass(), "card", term126235);
        setField(term126233, term126233.getClass(), "userName", "HGacYAJJio");
        setIntField(term126284, term126284.getClass(), "year", 2018);
        setShortField(term126284, term126284.getClass(), "month", (short) 12);
        setShortField(term126284, term126284.getClass(), "day", (short) 2);
        setField(term126283, term126283.getClass(), "date", term126284);
        setByteField(term126288, term126288.getClass(), "hour", (byte) 16);
        setByteField(term126288, term126288.getClass(), "minute", (byte) 52);
        setByteField(term126288, term126288.getClass(), "second", (byte) 26);
        setIntField(term126288, term126288.getClass(), "nano", 494856202);
        setField(term126283, term126283.getClass(), "time", term126288);
        setField(term126233, term126233.getClass(), "lastLoginDate", term126283);
        setBooleanField(term126233, term126233.getClass(), "isWebJoin", true);
        setField(term126233, term126233.getClass(), "webLimitDate", "iUabaxtEPQ");
        setIntField(term126233, term126233.getClass(), "level", 140289373);
        setIntField(term126233, term126233.getClass(), "reincarnationNum", -890287718);
        setField(term126233, term126233.getClass(), "exp", "BeULrSYHKm");
        setLongField(term126233, term126233.getClass(), "point", -1737271237161382461L);
        setLongField(term126233, term126233.getClass(), "totalPoint", -571195326224126202L);
        setIntField(term126233, term126233.getClass(), "playCount", 562977586);
        setIntField(term126233, term126233.getClass(), "multiPlayCount", 877526186);
        setIntField(term126233, term126233.getClass(), "multiWinCount", 1336834066);
        setIntField(term126233, term126233.getClass(), "requestResCount", -723140798);
        setIntField(term126233, term126233.getClass(), "acceptResCount", 2071132204);
        setIntField(term126233, term126233.getClass(), "successResCount", 1174579517);
        setIntField(term126233, term126233.getClass(), "playerRating", 2068319897);
        setIntField(term126233, term126233.getClass(), "highestRating", 112739257);
        setIntField(term126233, term126233.getClass(), "nameplateId", 1199908250);
        setIntField(term126233, term126233.getClass(), "frameId", 1616884797);
        setIntField(term126233, term126233.getClass(), "characterId", 2030586700);
        setIntField(term126233, term126233.getClass(), "trophyId", -340603553);
        setIntField(term126233, term126233.getClass(), "playedTutorialBit", 225498620);
        setIntField(term126233, term126233.getClass(), "firstTutorialCancelNum", -1390906119);
        setIntField(term126233, term126233.getClass(), "masterTutorialCancelNum", 36971401);
        setIntField(term126233, term126233.getClass(), "totalRepertoireCount", 1516544818);
        setIntField(term126233, term126233.getClass(), "totalMapNum", 194365806);
        setLongField(term126233, term126233.getClass(), "totalHiScore", -8020709571562405880L);
        setLongField(term126233, term126233.getClass(), "totalBasicHighScore", -700859260902147176L);
        setLongField(term126233, term126233.getClass(), "totalAdvancedHighScore", 284617033087386776L);
        setLongField(term126233, term126233.getClass(), "totalExpertHighScore", -4845087189361950874L);
        setLongField(term126233, term126233.getClass(), "totalMasterHighScore", 4793844777382062686L);
        setIntField(term126345, term126345.getClass(), "year", 2013);
        setShortField(term126345, term126345.getClass(), "month", (short) 12);
        setShortField(term126345, term126345.getClass(), "day", (short) 12);
        setField(term126344, term126344.getClass(), "date", term126345);
        setByteField(term126349, term126349.getClass(), "hour", (byte) 2);
        setByteField(term126349, term126349.getClass(), "minute", (byte) 36);
        setByteField(term126349, term126349.getClass(), "second", (byte) 4);
        setIntField(term126349, term126349.getClass(), "nano", 161587429);
        setField(term126344, term126344.getClass(), "time", term126349);
        setField(term126233, term126233.getClass(), "eventWatchedDate", term126344);
        setIntField(term126233, term126233.getClass(), "friendCount", 953836264);
        setBooleanField(term126233, term126233.getClass(), "isMaimai", false);
        setField(term126233, term126233.getClass(), "firstGameId", "nseWRZaaYe");
        setField(term126233, term126233.getClass(), "firstRomVersion", "mCxcdmaOlh");
        setField(term126233, term126233.getClass(), "firstDataVersion", "LjgkHxxdOu");
        setIntField(term126393, term126393.getClass(), "year", 2029);
        setShortField(term126393, term126393.getClass(), "month", (short) 3);
        setShortField(term126393, term126393.getClass(), "day", (short) 22);
        setField(term126392, term126392.getClass(), "date", term126393);
        setByteField(term126397, term126397.getClass(), "hour", (byte) 22);
        setByteField(term126397, term126397.getClass(), "minute", (byte) 42);
        setByteField(term126397, term126397.getClass(), "second", (byte) 24);
        setIntField(term126397, term126397.getClass(), "nano", 58236443);
        setField(term126392, term126392.getClass(), "time", term126397);
        setField(term126233, term126233.getClass(), "firstPlayDate", term126392);
        setField(term126233, term126233.getClass(), "lastGameId", "AHOCvVqPAa");
        setField(term126233, term126233.getClass(), "lastRomVersion", "PEALeSdAvS");
        setField(term126233, term126233.getClass(), "lastDataVersion", "oryVZfLyAF");
        setIntField(term126439, term126439.getClass(), "year", 2029);
        setShortField(term126439, term126439.getClass(), "month", (short) 7);
        setShortField(term126439, term126439.getClass(), "day", (short) 27);
        setField(term126438, term126438.getClass(), "date", term126439);
        setByteField(term126443, term126443.getClass(), "hour", (byte) 17);
        setByteField(term126443, term126443.getClass(), "minute", (byte) 56);
        setByteField(term126443, term126443.getClass(), "second", (byte) 24);
        setIntField(term126443, term126443.getClass(), "nano", 713288287);
        setField(term126438, term126438.getClass(), "time", term126443);
        setField(term126233, term126233.getClass(), "lastPlayDate", term126438);
        setIntField(term126233, term126233.getClass(), "lastPlaceId", 1420814192);
        setField(term126233, term126233.getClass(), "lastPlaceName", "comITQlWZO");
        setField(term126233, term126233.getClass(), "lastRegionId", "NsaFgLGmdm");
        setField(term126233, term126233.getClass(), "lastRegionName", "NpeQNuPyKD");
        setField(term126233, term126233.getClass(), "lastAllNetId", "PWrDivLkwt");
        setField(term126233, term126233.getClass(), "lastClientId", "oyymZILKkI");
        setField(term126231, term126231.getClass(), "user", term126233);
        setIntField(term126231, term126231.getClass(), "itemKind", -382860485);
        setIntField(term126231, term126231.getClass(), "itemId", 634627334);
        setIntField(term126231, term126231.getClass(), "stock", 1);
        setBooleanField(term126231, term126231.getClass(), "isValid", true);
        term126513 = new Integer(1164370758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term126513;
        callMethod(klass, "setStock", argTypes, term126231, args);
    }

};


