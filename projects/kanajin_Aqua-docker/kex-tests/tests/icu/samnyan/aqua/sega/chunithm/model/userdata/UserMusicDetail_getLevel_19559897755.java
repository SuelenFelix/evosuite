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

public class UserMusicDetail_getLevel_19559897755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89875;

    public UserMusicDetail_getLevel_19559897755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89881 = new Long(-948292411727204525L);
        term89875 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term89877 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term89879 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89932 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90041 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90087 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89875, term89875.getClass(), "id", -31489852380702002L);
        setLongField(term89877, term89877.getClass(), "id", -1329952027265266740L);
        setLongField(term89879, term89879.getClass(), "id", 1567925232344622144L);
        setField(term89879, term89879.getClass(), "extId", term89881);
        setField(term89879, term89879.getClass(), "luid", "FHqHhmdJat");
        setIntField(term89896, term89896.getClass(), "year", 2027);
        setShortField(term89896, term89896.getClass(), "month", (short) 7);
        setShortField(term89896, term89896.getClass(), "day", (short) 2);
        setField(term89895, term89895.getClass(), "date", term89896);
        setByteField(term89900, term89900.getClass(), "hour", (byte) 10);
        setByteField(term89900, term89900.getClass(), "minute", (byte) 18);
        setByteField(term89900, term89900.getClass(), "second", (byte) 58);
        setIntField(term89900, term89900.getClass(), "nano", 936854550);
        setField(term89895, term89895.getClass(), "time", term89900);
        setField(term89879, term89879.getClass(), "registerTime", term89895);
        setIntField(term89906, term89906.getClass(), "year", 2027);
        setShortField(term89906, term89906.getClass(), "month", (short) 10);
        setShortField(term89906, term89906.getClass(), "day", (short) 29);
        setField(term89905, term89905.getClass(), "date", term89906);
        setByteField(term89910, term89910.getClass(), "hour", (byte) 13);
        setByteField(term89910, term89910.getClass(), "minute", (byte) 15);
        setByteField(term89910, term89910.getClass(), "second", (byte) 53);
        setIntField(term89910, term89910.getClass(), "nano", 202971857);
        setField(term89905, term89905.getClass(), "time", term89910);
        setField(term89879, term89879.getClass(), "accessTime", term89905);
        setField(term89877, term89877.getClass(), "card", term89879);
        setField(term89877, term89877.getClass(), "userName", "QvpedpvzkV");
        setIntField(term89928, term89928.getClass(), "year", 2025);
        setShortField(term89928, term89928.getClass(), "month", (short) 9);
        setShortField(term89928, term89928.getClass(), "day", (short) 28);
        setField(term89927, term89927.getClass(), "date", term89928);
        setByteField(term89932, term89932.getClass(), "hour", (byte) 19);
        setByteField(term89932, term89932.getClass(), "minute", (byte) 59);
        setByteField(term89932, term89932.getClass(), "second", (byte) 17);
        setIntField(term89932, term89932.getClass(), "nano", 528282549);
        setField(term89927, term89927.getClass(), "time", term89932);
        setField(term89877, term89877.getClass(), "lastLoginDate", term89927);
        setBooleanField(term89877, term89877.getClass(), "isWebJoin", true);
        setField(term89877, term89877.getClass(), "webLimitDate", "hSWpWtRQyH");
        setIntField(term89877, term89877.getClass(), "level", 1804537299);
        setIntField(term89877, term89877.getClass(), "reincarnationNum", 1200772934);
        setField(term89877, term89877.getClass(), "exp", "DgHnOCKjBN");
        setLongField(term89877, term89877.getClass(), "point", -5505212927676546906L);
        setLongField(term89877, term89877.getClass(), "totalPoint", -2309176226516464162L);
        setIntField(term89877, term89877.getClass(), "playCount", -639549660);
        setIntField(term89877, term89877.getClass(), "multiPlayCount", -92008992);
        setIntField(term89877, term89877.getClass(), "multiWinCount", -1867096385);
        setIntField(term89877, term89877.getClass(), "requestResCount", 1228854608);
        setIntField(term89877, term89877.getClass(), "acceptResCount", -1210488188);
        setIntField(term89877, term89877.getClass(), "successResCount", -529430973);
        setIntField(term89877, term89877.getClass(), "playerRating", 1735280371);
        setIntField(term89877, term89877.getClass(), "highestRating", 2014178265);
        setIntField(term89877, term89877.getClass(), "nameplateId", 650318106);
        setIntField(term89877, term89877.getClass(), "frameId", 361184580);
        setIntField(term89877, term89877.getClass(), "characterId", -1132844305);
        setIntField(term89877, term89877.getClass(), "trophyId", -1893839838);
        setIntField(term89877, term89877.getClass(), "playedTutorialBit", -1899964739);
        setIntField(term89877, term89877.getClass(), "firstTutorialCancelNum", 1320936203);
        setIntField(term89877, term89877.getClass(), "masterTutorialCancelNum", 815999627);
        setIntField(term89877, term89877.getClass(), "totalRepertoireCount", -1361096912);
        setIntField(term89877, term89877.getClass(), "totalMapNum", -1489448292);
        setLongField(term89877, term89877.getClass(), "totalHiScore", -1164828048757086472L);
        setLongField(term89877, term89877.getClass(), "totalBasicHighScore", -2008405844948549125L);
        setLongField(term89877, term89877.getClass(), "totalAdvancedHighScore", 3744169870072117962L);
        setLongField(term89877, term89877.getClass(), "totalExpertHighScore", -3929129052663118960L);
        setLongField(term89877, term89877.getClass(), "totalMasterHighScore", -8701651184835718046L);
        setIntField(term89989, term89989.getClass(), "year", 2024);
        setShortField(term89989, term89989.getClass(), "month", (short) 9);
        setShortField(term89989, term89989.getClass(), "day", (short) 15);
        setField(term89988, term89988.getClass(), "date", term89989);
        setByteField(term89993, term89993.getClass(), "hour", (byte) 7);
        setByteField(term89993, term89993.getClass(), "minute", (byte) 33);
        setByteField(term89993, term89993.getClass(), "second", (byte) 0);
        setIntField(term89993, term89993.getClass(), "nano", 990831240);
        setField(term89988, term89988.getClass(), "time", term89993);
        setField(term89877, term89877.getClass(), "eventWatchedDate", term89988);
        setIntField(term89877, term89877.getClass(), "friendCount", -111099654);
        setBooleanField(term89877, term89877.getClass(), "isMaimai", false);
        setField(term89877, term89877.getClass(), "firstGameId", "nSSytCAuBk");
        setField(term89877, term89877.getClass(), "firstRomVersion", "XiZyOHXnNC");
        setField(term89877, term89877.getClass(), "firstDataVersion", "gQlDPvSqrX");
        setIntField(term90037, term90037.getClass(), "year", 2026);
        setShortField(term90037, term90037.getClass(), "month", (short) 9);
        setShortField(term90037, term90037.getClass(), "day", (short) 24);
        setField(term90036, term90036.getClass(), "date", term90037);
        setByteField(term90041, term90041.getClass(), "hour", (byte) 18);
        setByteField(term90041, term90041.getClass(), "minute", (byte) 13);
        setByteField(term90041, term90041.getClass(), "second", (byte) 45);
        setIntField(term90041, term90041.getClass(), "nano", 781256845);
        setField(term90036, term90036.getClass(), "time", term90041);
        setField(term89877, term89877.getClass(), "firstPlayDate", term90036);
        setField(term89877, term89877.getClass(), "lastGameId", "EnYnZHmIml");
        setField(term89877, term89877.getClass(), "lastRomVersion", "jvhvoAISsw");
        setField(term89877, term89877.getClass(), "lastDataVersion", "NkOntrweCo");
        setIntField(term90083, term90083.getClass(), "year", 2024);
        setShortField(term90083, term90083.getClass(), "month", (short) 12);
        setShortField(term90083, term90083.getClass(), "day", (short) 18);
        setField(term90082, term90082.getClass(), "date", term90083);
        setByteField(term90087, term90087.getClass(), "hour", (byte) 2);
        setByteField(term90087, term90087.getClass(), "minute", (byte) 55);
        setByteField(term90087, term90087.getClass(), "second", (byte) 45);
        setIntField(term90087, term90087.getClass(), "nano", 631411071);
        setField(term90082, term90082.getClass(), "time", term90087);
        setField(term89877, term89877.getClass(), "lastPlayDate", term90082);
        setIntField(term89877, term89877.getClass(), "lastPlaceId", 1865814659);
        setField(term89877, term89877.getClass(), "lastPlaceName", "hVtvnBKztu");
        setField(term89877, term89877.getClass(), "lastRegionId", "VOpwlWudOv");
        setField(term89877, term89877.getClass(), "lastRegionName", "eEXpzGjDgl");
        setField(term89877, term89877.getClass(), "lastAllNetId", "vGLuBgtHzA");
        setField(term89877, term89877.getClass(), "lastClientId", "iOiyjODkqg");
        setField(term89875, term89875.getClass(), "user", term89877);
        setIntField(term89875, term89875.getClass(), "musicId", -715300089);
        setIntField(term89875, term89875.getClass(), "level", 493602399);
        setIntField(term89875, term89875.getClass(), "playCount", 306088960);
        setIntField(term89875, term89875.getClass(), "scoreMax", 1739612725);
        setIntField(term89875, term89875.getClass(), "resRequestCount", 684431128);
        setIntField(term89875, term89875.getClass(), "resAcceptCount", -131718261);
        setIntField(term89875, term89875.getClass(), "resSuccessCount", 1392281647);
        setIntField(term89875, term89875.getClass(), "missCount", 1896966568);
        setIntField(term89875, term89875.getClass(), "maxComboCount", 95747063);
        setBooleanField(term89875, term89875.getClass(), "isFullCombo", true);
        setBooleanField(term89875, term89875.getClass(), "isAllJustice", true);
        setBooleanField(term89875, term89875.getClass(), "isSuccess", true);
        setIntField(term89875, term89875.getClass(), "fullChain", 1353810730);
        setIntField(term89875, term89875.getClass(), "maxChain", 1704841611);
        setIntField(term89875, term89875.getClass(), "scoreRank", -1055865904);
        setBooleanField(term89875, term89875.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term89875, args);
    }

};


