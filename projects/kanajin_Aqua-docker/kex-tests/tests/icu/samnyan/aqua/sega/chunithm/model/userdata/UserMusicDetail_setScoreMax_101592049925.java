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

public class UserMusicDetail_setScoreMax_101592049925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99189;
     Object term99483;

    public UserMusicDetail_setScoreMax_101592049925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99195 = new Long(-8327432141027603933L);
        term99189 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term99191 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term99193 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99401 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99189, term99189.getClass(), "id", -572086959828885449L);
        setLongField(term99191, term99191.getClass(), "id", -5605174994139612712L);
        setLongField(term99193, term99193.getClass(), "id", -5580906279881288806L);
        setField(term99193, term99193.getClass(), "extId", term99195);
        setField(term99193, term99193.getClass(), "luid", "RqkgPxDFnv");
        setIntField(term99210, term99210.getClass(), "year", 2014);
        setShortField(term99210, term99210.getClass(), "month", (short) 8);
        setShortField(term99210, term99210.getClass(), "day", (short) 30);
        setField(term99209, term99209.getClass(), "date", term99210);
        setByteField(term99214, term99214.getClass(), "hour", (byte) 1);
        setByteField(term99214, term99214.getClass(), "minute", (byte) 25);
        setByteField(term99214, term99214.getClass(), "second", (byte) 38);
        setIntField(term99214, term99214.getClass(), "nano", 485774498);
        setField(term99209, term99209.getClass(), "time", term99214);
        setField(term99193, term99193.getClass(), "registerTime", term99209);
        setIntField(term99220, term99220.getClass(), "year", 2029);
        setShortField(term99220, term99220.getClass(), "month", (short) 12);
        setShortField(term99220, term99220.getClass(), "day", (short) 30);
        setField(term99219, term99219.getClass(), "date", term99220);
        setByteField(term99224, term99224.getClass(), "hour", (byte) 0);
        setByteField(term99224, term99224.getClass(), "minute", (byte) 26);
        setByteField(term99224, term99224.getClass(), "second", (byte) 19);
        setIntField(term99224, term99224.getClass(), "nano", 773171363);
        setField(term99219, term99219.getClass(), "time", term99224);
        setField(term99193, term99193.getClass(), "accessTime", term99219);
        setField(term99191, term99191.getClass(), "card", term99193);
        setField(term99191, term99191.getClass(), "userName", "egaLajwFgY");
        setIntField(term99242, term99242.getClass(), "year", 2026);
        setShortField(term99242, term99242.getClass(), "month", (short) 3);
        setShortField(term99242, term99242.getClass(), "day", (short) 8);
        setField(term99241, term99241.getClass(), "date", term99242);
        setByteField(term99246, term99246.getClass(), "hour", (byte) 1);
        setByteField(term99246, term99246.getClass(), "minute", (byte) 53);
        setByteField(term99246, term99246.getClass(), "second", (byte) 51);
        setIntField(term99246, term99246.getClass(), "nano", 628643371);
        setField(term99241, term99241.getClass(), "time", term99246);
        setField(term99191, term99191.getClass(), "lastLoginDate", term99241);
        setBooleanField(term99191, term99191.getClass(), "isWebJoin", true);
        setField(term99191, term99191.getClass(), "webLimitDate", "wUXTYOJezz");
        setIntField(term99191, term99191.getClass(), "level", 1942866138);
        setIntField(term99191, term99191.getClass(), "reincarnationNum", -628548003);
        setField(term99191, term99191.getClass(), "exp", "dovCZEmPER");
        setLongField(term99191, term99191.getClass(), "point", -4821939044127073567L);
        setLongField(term99191, term99191.getClass(), "totalPoint", 5690319333104320494L);
        setIntField(term99191, term99191.getClass(), "playCount", -1600050434);
        setIntField(term99191, term99191.getClass(), "multiPlayCount", 2068225629);
        setIntField(term99191, term99191.getClass(), "multiWinCount", 230619154);
        setIntField(term99191, term99191.getClass(), "requestResCount", 939877540);
        setIntField(term99191, term99191.getClass(), "acceptResCount", -1177910195);
        setIntField(term99191, term99191.getClass(), "successResCount", 2096168037);
        setIntField(term99191, term99191.getClass(), "playerRating", -681093302);
        setIntField(term99191, term99191.getClass(), "highestRating", 1008385565);
        setIntField(term99191, term99191.getClass(), "nameplateId", -1408656420);
        setIntField(term99191, term99191.getClass(), "frameId", 1356166325);
        setIntField(term99191, term99191.getClass(), "characterId", 36575353);
        setIntField(term99191, term99191.getClass(), "trophyId", 1173070286);
        setIntField(term99191, term99191.getClass(), "playedTutorialBit", -373348260);
        setIntField(term99191, term99191.getClass(), "firstTutorialCancelNum", -476546497);
        setIntField(term99191, term99191.getClass(), "masterTutorialCancelNum", 1196854753);
        setIntField(term99191, term99191.getClass(), "totalRepertoireCount", -59756804);
        setIntField(term99191, term99191.getClass(), "totalMapNum", 535818399);
        setLongField(term99191, term99191.getClass(), "totalHiScore", 3924949950728854492L);
        setLongField(term99191, term99191.getClass(), "totalBasicHighScore", -935483464256316780L);
        setLongField(term99191, term99191.getClass(), "totalAdvancedHighScore", 8155420036739278471L);
        setLongField(term99191, term99191.getClass(), "totalExpertHighScore", 5083842693203849201L);
        setLongField(term99191, term99191.getClass(), "totalMasterHighScore", -7658308085805400095L);
        setIntField(term99303, term99303.getClass(), "year", 2015);
        setShortField(term99303, term99303.getClass(), "month", (short) 10);
        setShortField(term99303, term99303.getClass(), "day", (short) 24);
        setField(term99302, term99302.getClass(), "date", term99303);
        setByteField(term99307, term99307.getClass(), "hour", (byte) 2);
        setByteField(term99307, term99307.getClass(), "minute", (byte) 33);
        setByteField(term99307, term99307.getClass(), "second", (byte) 35);
        setIntField(term99307, term99307.getClass(), "nano", 733603737);
        setField(term99302, term99302.getClass(), "time", term99307);
        setField(term99191, term99191.getClass(), "eventWatchedDate", term99302);
        setIntField(term99191, term99191.getClass(), "friendCount", 1397433354);
        setBooleanField(term99191, term99191.getClass(), "isMaimai", false);
        setField(term99191, term99191.getClass(), "firstGameId", "QIADULuFso");
        setField(term99191, term99191.getClass(), "firstRomVersion", "XWnZIYfmmD");
        setField(term99191, term99191.getClass(), "firstDataVersion", "PbkTntqZDZ");
        setIntField(term99351, term99351.getClass(), "year", 2028);
        setShortField(term99351, term99351.getClass(), "month", (short) 2);
        setShortField(term99351, term99351.getClass(), "day", (short) 9);
        setField(term99350, term99350.getClass(), "date", term99351);
        setByteField(term99355, term99355.getClass(), "hour", (byte) 1);
        setByteField(term99355, term99355.getClass(), "minute", (byte) 7);
        setByteField(term99355, term99355.getClass(), "second", (byte) 14);
        setIntField(term99355, term99355.getClass(), "nano", 262906239);
        setField(term99350, term99350.getClass(), "time", term99355);
        setField(term99191, term99191.getClass(), "firstPlayDate", term99350);
        setField(term99191, term99191.getClass(), "lastGameId", "yDWoqUswuW");
        setField(term99191, term99191.getClass(), "lastRomVersion", "mgjEDzRwET");
        setField(term99191, term99191.getClass(), "lastDataVersion", "CepeBzACyE");
        setIntField(term99397, term99397.getClass(), "year", 2023);
        setShortField(term99397, term99397.getClass(), "month", (short) 11);
        setShortField(term99397, term99397.getClass(), "day", (short) 9);
        setField(term99396, term99396.getClass(), "date", term99397);
        setByteField(term99401, term99401.getClass(), "hour", (byte) 16);
        setByteField(term99401, term99401.getClass(), "minute", (byte) 14);
        setByteField(term99401, term99401.getClass(), "second", (byte) 4);
        setIntField(term99401, term99401.getClass(), "nano", 501414424);
        setField(term99396, term99396.getClass(), "time", term99401);
        setField(term99191, term99191.getClass(), "lastPlayDate", term99396);
        setIntField(term99191, term99191.getClass(), "lastPlaceId", -135791025);
        setField(term99191, term99191.getClass(), "lastPlaceName", "WtgzEUhZIl");
        setField(term99191, term99191.getClass(), "lastRegionId", "tzigWGaijF");
        setField(term99191, term99191.getClass(), "lastRegionName", "VWFNUuzpse");
        setField(term99191, term99191.getClass(), "lastAllNetId", "XdnUnODLtI");
        setField(term99191, term99191.getClass(), "lastClientId", "blbqUBWvWn");
        setField(term99189, term99189.getClass(), "user", term99191);
        setIntField(term99189, term99189.getClass(), "musicId", 59811366);
        setIntField(term99189, term99189.getClass(), "level", 874873727);
        setIntField(term99189, term99189.getClass(), "playCount", 729829705);
        setIntField(term99189, term99189.getClass(), "scoreMax", 713554336);
        setIntField(term99189, term99189.getClass(), "resRequestCount", 196738357);
        setIntField(term99189, term99189.getClass(), "resAcceptCount", 466094589);
        setIntField(term99189, term99189.getClass(), "resSuccessCount", -1165526360);
        setIntField(term99189, term99189.getClass(), "missCount", -1358499449);
        setIntField(term99189, term99189.getClass(), "maxComboCount", -1565850896);
        setBooleanField(term99189, term99189.getClass(), "isFullCombo", true);
        setBooleanField(term99189, term99189.getClass(), "isAllJustice", false);
        setBooleanField(term99189, term99189.getClass(), "isSuccess", false);
        setIntField(term99189, term99189.getClass(), "fullChain", 1480628140);
        setIntField(term99189, term99189.getClass(), "maxChain", -1804417815);
        setIntField(term99189, term99189.getClass(), "scoreRank", -988341618);
        setBooleanField(term99189, term99189.getClass(), "isLock", true);
        term99483 = new Integer(892061109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99483;
        callMethod(klass, "setScoreMax", argTypes, term99189, args);
    }

};


