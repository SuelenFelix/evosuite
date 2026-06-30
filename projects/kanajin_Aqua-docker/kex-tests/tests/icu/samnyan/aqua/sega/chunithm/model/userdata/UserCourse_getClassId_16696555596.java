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

public class UserCourse_getClassId_16696555596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1916260;

    public UserCourse_getClassId_16696555596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1916266 = new Long(6235472569901138913L);
        term1916260 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1916262 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1916264 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1916280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916285 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916295 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916472 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916552 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1916260, term1916260.getClass(), "id", -1474180434304243423L);
        setLongField(term1916262, term1916262.getClass(), "id", 8544072377203046174L);
        setLongField(term1916264, term1916264.getClass(), "id", -1406443196236055696L);
        setField(term1916264, term1916264.getClass(), "extId", term1916266);
        setField(term1916264, term1916264.getClass(), "luid", "PSZOAjACZF");
        setIntField(term1916281, term1916281.getClass(), "year", 2017);
        setShortField(term1916281, term1916281.getClass(), "month", (short) 1);
        setShortField(term1916281, term1916281.getClass(), "day", (short) 13);
        setField(term1916280, term1916280.getClass(), "date", term1916281);
        setByteField(term1916285, term1916285.getClass(), "hour", (byte) 13);
        setByteField(term1916285, term1916285.getClass(), "minute", (byte) 14);
        setByteField(term1916285, term1916285.getClass(), "second", (byte) 1);
        setIntField(term1916285, term1916285.getClass(), "nano", 699698980);
        setField(term1916280, term1916280.getClass(), "time", term1916285);
        setField(term1916264, term1916264.getClass(), "registerTime", term1916280);
        setIntField(term1916291, term1916291.getClass(), "year", 2010);
        setShortField(term1916291, term1916291.getClass(), "month", (short) 1);
        setShortField(term1916291, term1916291.getClass(), "day", (short) 3);
        setField(term1916290, term1916290.getClass(), "date", term1916291);
        setByteField(term1916295, term1916295.getClass(), "hour", (byte) 6);
        setByteField(term1916295, term1916295.getClass(), "minute", (byte) 30);
        setByteField(term1916295, term1916295.getClass(), "second", (byte) 12);
        setIntField(term1916295, term1916295.getClass(), "nano", 425780481);
        setField(term1916290, term1916290.getClass(), "time", term1916295);
        setField(term1916264, term1916264.getClass(), "accessTime", term1916290);
        setField(term1916262, term1916262.getClass(), "card", term1916264);
        setField(term1916262, term1916262.getClass(), "userName", "gyQaHdpXtJ");
        setIntField(term1916313, term1916313.getClass(), "year", 2013);
        setShortField(term1916313, term1916313.getClass(), "month", (short) 11);
        setShortField(term1916313, term1916313.getClass(), "day", (short) 19);
        setField(term1916312, term1916312.getClass(), "date", term1916313);
        setByteField(term1916317, term1916317.getClass(), "hour", (byte) 9);
        setByteField(term1916317, term1916317.getClass(), "minute", (byte) 1);
        setByteField(term1916317, term1916317.getClass(), "second", (byte) 2);
        setIntField(term1916317, term1916317.getClass(), "nano", 633718476);
        setField(term1916312, term1916312.getClass(), "time", term1916317);
        setField(term1916262, term1916262.getClass(), "lastLoginDate", term1916312);
        setBooleanField(term1916262, term1916262.getClass(), "isWebJoin", true);
        setField(term1916262, term1916262.getClass(), "webLimitDate", "eqzDLpafQU");
        setIntField(term1916262, term1916262.getClass(), "level", -3120009);
        setIntField(term1916262, term1916262.getClass(), "reincarnationNum", -1108690223);
        setField(term1916262, term1916262.getClass(), "exp", "nBMUYmWWbp");
        setLongField(term1916262, term1916262.getClass(), "point", 7547371251937238888L);
        setLongField(term1916262, term1916262.getClass(), "totalPoint", -7850327551924147802L);
        setIntField(term1916262, term1916262.getClass(), "playCount", -1441556969);
        setIntField(term1916262, term1916262.getClass(), "multiPlayCount", 1941235954);
        setIntField(term1916262, term1916262.getClass(), "multiWinCount", 1070280271);
        setIntField(term1916262, term1916262.getClass(), "requestResCount", 1227298541);
        setIntField(term1916262, term1916262.getClass(), "acceptResCount", -1024079239);
        setIntField(term1916262, term1916262.getClass(), "successResCount", -1528175178);
        setIntField(term1916262, term1916262.getClass(), "playerRating", 768253715);
        setIntField(term1916262, term1916262.getClass(), "highestRating", 1493975308);
        setIntField(term1916262, term1916262.getClass(), "nameplateId", 298444065);
        setIntField(term1916262, term1916262.getClass(), "frameId", -1794945526);
        setIntField(term1916262, term1916262.getClass(), "characterId", -1905572921);
        setIntField(term1916262, term1916262.getClass(), "trophyId", 2083569940);
        setIntField(term1916262, term1916262.getClass(), "playedTutorialBit", -2125241288);
        setIntField(term1916262, term1916262.getClass(), "firstTutorialCancelNum", 1878221962);
        setIntField(term1916262, term1916262.getClass(), "masterTutorialCancelNum", -1753161414);
        setIntField(term1916262, term1916262.getClass(), "totalRepertoireCount", 44923894);
        setIntField(term1916262, term1916262.getClass(), "totalMapNum", 1768003778);
        setLongField(term1916262, term1916262.getClass(), "totalHiScore", -7234284540828577155L);
        setLongField(term1916262, term1916262.getClass(), "totalBasicHighScore", 3416887718384308476L);
        setLongField(term1916262, term1916262.getClass(), "totalAdvancedHighScore", -7868762955816725858L);
        setLongField(term1916262, term1916262.getClass(), "totalExpertHighScore", -5432336414395046484L);
        setLongField(term1916262, term1916262.getClass(), "totalMasterHighScore", -8433588716951634219L);
        setIntField(term1916374, term1916374.getClass(), "year", 2024);
        setShortField(term1916374, term1916374.getClass(), "month", (short) 11);
        setShortField(term1916374, term1916374.getClass(), "day", (short) 17);
        setField(term1916373, term1916373.getClass(), "date", term1916374);
        setByteField(term1916378, term1916378.getClass(), "hour", (byte) 12);
        setByteField(term1916378, term1916378.getClass(), "minute", (byte) 1);
        setByteField(term1916378, term1916378.getClass(), "second", (byte) 6);
        setIntField(term1916378, term1916378.getClass(), "nano", 349658923);
        setField(term1916373, term1916373.getClass(), "time", term1916378);
        setField(term1916262, term1916262.getClass(), "eventWatchedDate", term1916373);
        setIntField(term1916262, term1916262.getClass(), "friendCount", -258016379);
        setBooleanField(term1916262, term1916262.getClass(), "isMaimai", true);
        setField(term1916262, term1916262.getClass(), "firstGameId", "nomlMELgJO");
        setField(term1916262, term1916262.getClass(), "firstRomVersion", "nKvLHYbYVs");
        setField(term1916262, term1916262.getClass(), "firstDataVersion", "VOidUgMZTz");
        setIntField(term1916422, term1916422.getClass(), "year", 2029);
        setShortField(term1916422, term1916422.getClass(), "month", (short) 8);
        setShortField(term1916422, term1916422.getClass(), "day", (short) 26);
        setField(term1916421, term1916421.getClass(), "date", term1916422);
        setByteField(term1916426, term1916426.getClass(), "hour", (byte) 16);
        setByteField(term1916426, term1916426.getClass(), "minute", (byte) 12);
        setByteField(term1916426, term1916426.getClass(), "second", (byte) 25);
        setIntField(term1916426, term1916426.getClass(), "nano", 259230416);
        setField(term1916421, term1916421.getClass(), "time", term1916426);
        setField(term1916262, term1916262.getClass(), "firstPlayDate", term1916421);
        setField(term1916262, term1916262.getClass(), "lastGameId", "wkRJLhmdBr");
        setField(term1916262, term1916262.getClass(), "lastRomVersion", "jQkcxhFxBg");
        setField(term1916262, term1916262.getClass(), "lastDataVersion", "OTjYowdmHD");
        setIntField(term1916468, term1916468.getClass(), "year", 2011);
        setShortField(term1916468, term1916468.getClass(), "month", (short) 10);
        setShortField(term1916468, term1916468.getClass(), "day", (short) 30);
        setField(term1916467, term1916467.getClass(), "date", term1916468);
        setByteField(term1916472, term1916472.getClass(), "hour", (byte) 0);
        setByteField(term1916472, term1916472.getClass(), "minute", (byte) 2);
        setByteField(term1916472, term1916472.getClass(), "second", (byte) 3);
        setIntField(term1916472, term1916472.getClass(), "nano", 436489320);
        setField(term1916467, term1916467.getClass(), "time", term1916472);
        setField(term1916262, term1916262.getClass(), "lastPlayDate", term1916467);
        setIntField(term1916262, term1916262.getClass(), "lastPlaceId", 1391287674);
        setField(term1916262, term1916262.getClass(), "lastPlaceName", "vWIeZNMgJm");
        setField(term1916262, term1916262.getClass(), "lastRegionId", "omPetPvrNJ");
        setField(term1916262, term1916262.getClass(), "lastRegionName", "DUQYOXJhFa");
        setField(term1916262, term1916262.getClass(), "lastAllNetId", "hBsQGzSDgc");
        setField(term1916262, term1916262.getClass(), "lastClientId", "OCtGFsjstJ");
        setField(term1916260, term1916260.getClass(), "user", term1916262);
        setIntField(term1916260, term1916260.getClass(), "courseId", -129150447);
        setIntField(term1916260, term1916260.getClass(), "classId", -1718358220);
        setIntField(term1916260, term1916260.getClass(), "playCount", -1877650428);
        setIntField(term1916260, term1916260.getClass(), "scoreMax", -76002166);
        setBooleanField(term1916260, term1916260.getClass(), "isFullCombo", false);
        setBooleanField(term1916260, term1916260.getClass(), "isAllJustice", true);
        setBooleanField(term1916260, term1916260.getClass(), "isSuccess", false);
        setIntField(term1916260, term1916260.getClass(), "scoreRank", 581812184);
        setIntField(term1916260, term1916260.getClass(), "eventId", 750890313);
        setIntField(term1916548, term1916548.getClass(), "year", 2015);
        setShortField(term1916548, term1916548.getClass(), "month", (short) 1);
        setShortField(term1916548, term1916548.getClass(), "day", (short) 19);
        setField(term1916547, term1916547.getClass(), "date", term1916548);
        setByteField(term1916552, term1916552.getClass(), "hour", (byte) 14);
        setByteField(term1916552, term1916552.getClass(), "minute", (byte) 24);
        setByteField(term1916552, term1916552.getClass(), "second", (byte) 14);
        setIntField(term1916552, term1916552.getClass(), "nano", 246702466);
        setField(term1916547, term1916547.getClass(), "time", term1916552);
        setField(term1916260, term1916260.getClass(), "lastPlayDate", term1916547);
        setIntField(term1916260, term1916260.getClass(), "param1", -1799853814);
        setIntField(term1916260, term1916260.getClass(), "param2", -12184494);
        setIntField(term1916260, term1916260.getClass(), "param3", -717855567);
        setIntField(term1916260, term1916260.getClass(), "param4", 1052719381);
        setBooleanField(term1916260, term1916260.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassId", argTypes, term1916260, args);
    }

};


