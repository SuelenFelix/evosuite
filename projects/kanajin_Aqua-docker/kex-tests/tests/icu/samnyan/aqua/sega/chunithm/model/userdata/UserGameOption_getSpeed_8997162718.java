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

public class UserGameOption_getSpeed_8997162718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52321;

    public UserGameOption_getSpeed_8997162718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52327 = new Long(2848819812340321742L);
        term52321 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term52323 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term52325 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52346 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52487 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52533 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52321, term52321.getClass(), "id", -5803004674995774129L);
        setLongField(term52323, term52323.getClass(), "id", 5467431248910278098L);
        setLongField(term52325, term52325.getClass(), "id", -6624097117784103684L);
        setField(term52325, term52325.getClass(), "extId", term52327);
        setField(term52325, term52325.getClass(), "luid", "FzJhDecyvI");
        setIntField(term52342, term52342.getClass(), "year", 2027);
        setShortField(term52342, term52342.getClass(), "month", (short) 11);
        setShortField(term52342, term52342.getClass(), "day", (short) 17);
        setField(term52341, term52341.getClass(), "date", term52342);
        setByteField(term52346, term52346.getClass(), "hour", (byte) 8);
        setByteField(term52346, term52346.getClass(), "minute", (byte) 27);
        setByteField(term52346, term52346.getClass(), "second", (byte) 41);
        setIntField(term52346, term52346.getClass(), "nano", 737345800);
        setField(term52341, term52341.getClass(), "time", term52346);
        setField(term52325, term52325.getClass(), "registerTime", term52341);
        setIntField(term52352, term52352.getClass(), "year", 2028);
        setShortField(term52352, term52352.getClass(), "month", (short) 9);
        setShortField(term52352, term52352.getClass(), "day", (short) 4);
        setField(term52351, term52351.getClass(), "date", term52352);
        setByteField(term52356, term52356.getClass(), "hour", (byte) 2);
        setByteField(term52356, term52356.getClass(), "minute", (byte) 4);
        setByteField(term52356, term52356.getClass(), "second", (byte) 33);
        setIntField(term52356, term52356.getClass(), "nano", 927519741);
        setField(term52351, term52351.getClass(), "time", term52356);
        setField(term52325, term52325.getClass(), "accessTime", term52351);
        setField(term52323, term52323.getClass(), "card", term52325);
        setField(term52323, term52323.getClass(), "userName", "zOxseYMSdY");
        setIntField(term52374, term52374.getClass(), "year", 2015);
        setShortField(term52374, term52374.getClass(), "month", (short) 11);
        setShortField(term52374, term52374.getClass(), "day", (short) 12);
        setField(term52373, term52373.getClass(), "date", term52374);
        setByteField(term52378, term52378.getClass(), "hour", (byte) 8);
        setByteField(term52378, term52378.getClass(), "minute", (byte) 57);
        setByteField(term52378, term52378.getClass(), "second", (byte) 39);
        setIntField(term52378, term52378.getClass(), "nano", 144990931);
        setField(term52373, term52373.getClass(), "time", term52378);
        setField(term52323, term52323.getClass(), "lastLoginDate", term52373);
        setBooleanField(term52323, term52323.getClass(), "isWebJoin", false);
        setField(term52323, term52323.getClass(), "webLimitDate", "jEKlkqpHMQ");
        setIntField(term52323, term52323.getClass(), "level", 1618278091);
        setIntField(term52323, term52323.getClass(), "reincarnationNum", -548967985);
        setField(term52323, term52323.getClass(), "exp", "QpEVWispEh");
        setLongField(term52323, term52323.getClass(), "point", 4418899868035922058L);
        setLongField(term52323, term52323.getClass(), "totalPoint", 4663932691158406829L);
        setIntField(term52323, term52323.getClass(), "playCount", -1923425156);
        setIntField(term52323, term52323.getClass(), "multiPlayCount", 1237861885);
        setIntField(term52323, term52323.getClass(), "multiWinCount", 1433214025);
        setIntField(term52323, term52323.getClass(), "requestResCount", 1424797105);
        setIntField(term52323, term52323.getClass(), "acceptResCount", 386281072);
        setIntField(term52323, term52323.getClass(), "successResCount", -782180775);
        setIntField(term52323, term52323.getClass(), "playerRating", -1971308334);
        setIntField(term52323, term52323.getClass(), "highestRating", -2070149565);
        setIntField(term52323, term52323.getClass(), "nameplateId", 1682543276);
        setIntField(term52323, term52323.getClass(), "frameId", 156914536);
        setIntField(term52323, term52323.getClass(), "characterId", -1745894636);
        setIntField(term52323, term52323.getClass(), "trophyId", 571282234);
        setIntField(term52323, term52323.getClass(), "playedTutorialBit", 1131350330);
        setIntField(term52323, term52323.getClass(), "firstTutorialCancelNum", -1463702476);
        setIntField(term52323, term52323.getClass(), "masterTutorialCancelNum", 90151812);
        setIntField(term52323, term52323.getClass(), "totalRepertoireCount", -416703693);
        setIntField(term52323, term52323.getClass(), "totalMapNum", -1718111500);
        setLongField(term52323, term52323.getClass(), "totalHiScore", -5802364286448544947L);
        setLongField(term52323, term52323.getClass(), "totalBasicHighScore", 7633060281229939158L);
        setLongField(term52323, term52323.getClass(), "totalAdvancedHighScore", 4171742078739516731L);
        setLongField(term52323, term52323.getClass(), "totalExpertHighScore", 4391974157316283404L);
        setLongField(term52323, term52323.getClass(), "totalMasterHighScore", -8447404910321380142L);
        setIntField(term52435, term52435.getClass(), "year", 2015);
        setShortField(term52435, term52435.getClass(), "month", (short) 3);
        setShortField(term52435, term52435.getClass(), "day", (short) 10);
        setField(term52434, term52434.getClass(), "date", term52435);
        setByteField(term52439, term52439.getClass(), "hour", (byte) 6);
        setByteField(term52439, term52439.getClass(), "minute", (byte) 11);
        setByteField(term52439, term52439.getClass(), "second", (byte) 21);
        setIntField(term52439, term52439.getClass(), "nano", 925797004);
        setField(term52434, term52434.getClass(), "time", term52439);
        setField(term52323, term52323.getClass(), "eventWatchedDate", term52434);
        setIntField(term52323, term52323.getClass(), "friendCount", 2134049264);
        setBooleanField(term52323, term52323.getClass(), "isMaimai", true);
        setField(term52323, term52323.getClass(), "firstGameId", "STofGrqXqL");
        setField(term52323, term52323.getClass(), "firstRomVersion", "IoRhBfdSuN");
        setField(term52323, term52323.getClass(), "firstDataVersion", "JGdxVjQzts");
        setIntField(term52483, term52483.getClass(), "year", 2028);
        setShortField(term52483, term52483.getClass(), "month", (short) 4);
        setShortField(term52483, term52483.getClass(), "day", (short) 9);
        setField(term52482, term52482.getClass(), "date", term52483);
        setByteField(term52487, term52487.getClass(), "hour", (byte) 16);
        setByteField(term52487, term52487.getClass(), "minute", (byte) 26);
        setByteField(term52487, term52487.getClass(), "second", (byte) 35);
        setIntField(term52487, term52487.getClass(), "nano", 546233932);
        setField(term52482, term52482.getClass(), "time", term52487);
        setField(term52323, term52323.getClass(), "firstPlayDate", term52482);
        setField(term52323, term52323.getClass(), "lastGameId", "jEdjRikQtN");
        setField(term52323, term52323.getClass(), "lastRomVersion", "fSNUaokVWs");
        setField(term52323, term52323.getClass(), "lastDataVersion", "dTxnMmHoVm");
        setIntField(term52529, term52529.getClass(), "year", 2022);
        setShortField(term52529, term52529.getClass(), "month", (short) 3);
        setShortField(term52529, term52529.getClass(), "day", (short) 19);
        setField(term52528, term52528.getClass(), "date", term52529);
        setByteField(term52533, term52533.getClass(), "hour", (byte) 6);
        setByteField(term52533, term52533.getClass(), "minute", (byte) 55);
        setByteField(term52533, term52533.getClass(), "second", (byte) 49);
        setIntField(term52533, term52533.getClass(), "nano", 478088059);
        setField(term52528, term52528.getClass(), "time", term52533);
        setField(term52323, term52323.getClass(), "lastPlayDate", term52528);
        setIntField(term52323, term52323.getClass(), "lastPlaceId", -619693439);
        setField(term52323, term52323.getClass(), "lastPlaceName", "iswxaQUQgT");
        setField(term52323, term52323.getClass(), "lastRegionId", "MxUSQqhNse");
        setField(term52323, term52323.getClass(), "lastRegionName", "skwxdosvQV");
        setField(term52323, term52323.getClass(), "lastAllNetId", "DBYTggnCkD");
        setField(term52323, term52323.getClass(), "lastClientId", "RyXrJxJQiY");
        setField(term52321, term52321.getClass(), "user", term52323);
        setIntField(term52321, term52321.getClass(), "bgInfo", 1886882056);
        setIntField(term52321, term52321.getClass(), "fieldColor", -689559993);
        setIntField(term52321, term52321.getClass(), "guideSound", 263696243);
        setIntField(term52321, term52321.getClass(), "soundEffect", -2012537672);
        setIntField(term52321, term52321.getClass(), "guideLine", -879433115);
        setIntField(term52321, term52321.getClass(), "speed", 275958841);
        setIntField(term52321, term52321.getClass(), "optionSet", 1628668899);
        setIntField(term52321, term52321.getClass(), "matching", -998305335);
        setIntField(term52321, term52321.getClass(), "judgePos", 2120008602);
        setIntField(term52321, term52321.getClass(), "rating", 1085966764);
        setIntField(term52321, term52321.getClass(), "judgeJustice", -609882960);
        setIntField(term52321, term52321.getClass(), "judgeAttack", -1690283734);
        setIntField(term52321, term52321.getClass(), "headphone", -1620783951);
        setIntField(term52321, term52321.getClass(), "playerLevel", 1400387811);
        setIntField(term52321, term52321.getClass(), "successTap", 903826116);
        setIntField(term52321, term52321.getClass(), "successExTap", 641366348);
        setIntField(term52321, term52321.getClass(), "successSlideHold", -353276989);
        setIntField(term52321, term52321.getClass(), "successAir", -505563323);
        setIntField(term52321, term52321.getClass(), "successFlick", -2087065864);
        setIntField(term52321, term52321.getClass(), "successSkill", -169812741);
        setIntField(term52321, term52321.getClass(), "successTapTimbre", -1015119737);
        setIntField(term52321, term52321.getClass(), "privacy", 1479117665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpeed", argTypes, term52321, args);
    }

};


