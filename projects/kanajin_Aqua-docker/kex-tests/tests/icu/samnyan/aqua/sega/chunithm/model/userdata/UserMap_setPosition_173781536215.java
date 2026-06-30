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

public class UserMap_setPosition_173781536215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285373;
     Object term285660;

    public UserMap_setPosition_173781536215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term285379 = new Long(3951346165629352117L);
        term285373 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term285375 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term285377 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term285393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285398 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285585 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term285373, term285373.getClass(), "id", 1455676383387654807L);
        setLongField(term285375, term285375.getClass(), "id", -6746436482856660533L);
        setLongField(term285377, term285377.getClass(), "id", 4540774872514545895L);
        setField(term285377, term285377.getClass(), "extId", term285379);
        setField(term285377, term285377.getClass(), "luid", "NzhnvXaHzq");
        setIntField(term285394, term285394.getClass(), "year", 2015);
        setShortField(term285394, term285394.getClass(), "month", (short) 3);
        setShortField(term285394, term285394.getClass(), "day", (short) 18);
        setField(term285393, term285393.getClass(), "date", term285394);
        setByteField(term285398, term285398.getClass(), "hour", (byte) 17);
        setByteField(term285398, term285398.getClass(), "minute", (byte) 26);
        setByteField(term285398, term285398.getClass(), "second", (byte) 37);
        setIntField(term285398, term285398.getClass(), "nano", 961306380);
        setField(term285393, term285393.getClass(), "time", term285398);
        setField(term285377, term285377.getClass(), "registerTime", term285393);
        setIntField(term285404, term285404.getClass(), "year", 2014);
        setShortField(term285404, term285404.getClass(), "month", (short) 1);
        setShortField(term285404, term285404.getClass(), "day", (short) 26);
        setField(term285403, term285403.getClass(), "date", term285404);
        setByteField(term285408, term285408.getClass(), "hour", (byte) 17);
        setByteField(term285408, term285408.getClass(), "minute", (byte) 42);
        setByteField(term285408, term285408.getClass(), "second", (byte) 23);
        setIntField(term285408, term285408.getClass(), "nano", 121259475);
        setField(term285403, term285403.getClass(), "time", term285408);
        setField(term285377, term285377.getClass(), "accessTime", term285403);
        setField(term285375, term285375.getClass(), "card", term285377);
        setField(term285375, term285375.getClass(), "userName", "JkfLtSQjWq");
        setIntField(term285426, term285426.getClass(), "year", 2013);
        setShortField(term285426, term285426.getClass(), "month", (short) 4);
        setShortField(term285426, term285426.getClass(), "day", (short) 17);
        setField(term285425, term285425.getClass(), "date", term285426);
        setByteField(term285430, term285430.getClass(), "hour", (byte) 19);
        setByteField(term285430, term285430.getClass(), "minute", (byte) 13);
        setByteField(term285430, term285430.getClass(), "second", (byte) 15);
        setIntField(term285430, term285430.getClass(), "nano", 544457908);
        setField(term285425, term285425.getClass(), "time", term285430);
        setField(term285375, term285375.getClass(), "lastLoginDate", term285425);
        setBooleanField(term285375, term285375.getClass(), "isWebJoin", false);
        setField(term285375, term285375.getClass(), "webLimitDate", "JpZUfTkpjW");
        setIntField(term285375, term285375.getClass(), "level", 746023829);
        setIntField(term285375, term285375.getClass(), "reincarnationNum", 41516868);
        setField(term285375, term285375.getClass(), "exp", "SbMMeUExqe");
        setLongField(term285375, term285375.getClass(), "point", -1463127326798939587L);
        setLongField(term285375, term285375.getClass(), "totalPoint", 8817459190616045853L);
        setIntField(term285375, term285375.getClass(), "playCount", 1336776784);
        setIntField(term285375, term285375.getClass(), "multiPlayCount", -22457416);
        setIntField(term285375, term285375.getClass(), "multiWinCount", -1325174741);
        setIntField(term285375, term285375.getClass(), "requestResCount", 684193673);
        setIntField(term285375, term285375.getClass(), "acceptResCount", 370263718);
        setIntField(term285375, term285375.getClass(), "successResCount", 48015073);
        setIntField(term285375, term285375.getClass(), "playerRating", 546263682);
        setIntField(term285375, term285375.getClass(), "highestRating", -2035094166);
        setIntField(term285375, term285375.getClass(), "nameplateId", -1363734645);
        setIntField(term285375, term285375.getClass(), "frameId", -801549011);
        setIntField(term285375, term285375.getClass(), "characterId", 62132446);
        setIntField(term285375, term285375.getClass(), "trophyId", 1637357009);
        setIntField(term285375, term285375.getClass(), "playedTutorialBit", -1207052944);
        setIntField(term285375, term285375.getClass(), "firstTutorialCancelNum", -2019346254);
        setIntField(term285375, term285375.getClass(), "masterTutorialCancelNum", -37753692);
        setIntField(term285375, term285375.getClass(), "totalRepertoireCount", -851423847);
        setIntField(term285375, term285375.getClass(), "totalMapNum", -2078904541);
        setLongField(term285375, term285375.getClass(), "totalHiScore", 8440192221331571349L);
        setLongField(term285375, term285375.getClass(), "totalBasicHighScore", 5709410403788658761L);
        setLongField(term285375, term285375.getClass(), "totalAdvancedHighScore", 310032710294616459L);
        setLongField(term285375, term285375.getClass(), "totalExpertHighScore", 5200635552107859745L);
        setLongField(term285375, term285375.getClass(), "totalMasterHighScore", 8433973234615859286L);
        setIntField(term285487, term285487.getClass(), "year", 2012);
        setShortField(term285487, term285487.getClass(), "month", (short) 10);
        setShortField(term285487, term285487.getClass(), "day", (short) 19);
        setField(term285486, term285486.getClass(), "date", term285487);
        setByteField(term285491, term285491.getClass(), "hour", (byte) 19);
        setByteField(term285491, term285491.getClass(), "minute", (byte) 39);
        setByteField(term285491, term285491.getClass(), "second", (byte) 31);
        setIntField(term285491, term285491.getClass(), "nano", 46719585);
        setField(term285486, term285486.getClass(), "time", term285491);
        setField(term285375, term285375.getClass(), "eventWatchedDate", term285486);
        setIntField(term285375, term285375.getClass(), "friendCount", 1446569258);
        setBooleanField(term285375, term285375.getClass(), "isMaimai", true);
        setField(term285375, term285375.getClass(), "firstGameId", "CKFhbAWYOu");
        setField(term285375, term285375.getClass(), "firstRomVersion", "cjASmDMJyf");
        setField(term285375, term285375.getClass(), "firstDataVersion", "ALbKTRphvX");
        setIntField(term285535, term285535.getClass(), "year", 2023);
        setShortField(term285535, term285535.getClass(), "month", (short) 8);
        setShortField(term285535, term285535.getClass(), "day", (short) 24);
        setField(term285534, term285534.getClass(), "date", term285535);
        setByteField(term285539, term285539.getClass(), "hour", (byte) 17);
        setByteField(term285539, term285539.getClass(), "minute", (byte) 36);
        setByteField(term285539, term285539.getClass(), "second", (byte) 41);
        setIntField(term285539, term285539.getClass(), "nano", 529347790);
        setField(term285534, term285534.getClass(), "time", term285539);
        setField(term285375, term285375.getClass(), "firstPlayDate", term285534);
        setField(term285375, term285375.getClass(), "lastGameId", "vWbSXhWaUM");
        setField(term285375, term285375.getClass(), "lastRomVersion", "xGZegFGFwp");
        setField(term285375, term285375.getClass(), "lastDataVersion", "mcyLkkYdqH");
        setIntField(term285581, term285581.getClass(), "year", 2029);
        setShortField(term285581, term285581.getClass(), "month", (short) 9);
        setShortField(term285581, term285581.getClass(), "day", (short) 2);
        setField(term285580, term285580.getClass(), "date", term285581);
        setByteField(term285585, term285585.getClass(), "hour", (byte) 6);
        setByteField(term285585, term285585.getClass(), "minute", (byte) 11);
        setByteField(term285585, term285585.getClass(), "second", (byte) 43);
        setIntField(term285585, term285585.getClass(), "nano", 149531829);
        setField(term285580, term285580.getClass(), "time", term285585);
        setField(term285375, term285375.getClass(), "lastPlayDate", term285580);
        setIntField(term285375, term285375.getClass(), "lastPlaceId", -537915293);
        setField(term285375, term285375.getClass(), "lastPlaceName", "NgPHLrUVTl");
        setField(term285375, term285375.getClass(), "lastRegionId", "cGSjeMMyEG");
        setField(term285375, term285375.getClass(), "lastRegionName", "zDxtwCfvRN");
        setField(term285375, term285375.getClass(), "lastAllNetId", "cBntwyxQws");
        setField(term285375, term285375.getClass(), "lastClientId", "ctJmoieYHE");
        setField(term285373, term285373.getClass(), "user", term285375);
        setIntField(term285373, term285373.getClass(), "mapId", 709026110);
        setIntField(term285373, term285373.getClass(), "position", 1292003190);
        setBooleanField(term285373, term285373.getClass(), "isClear", true);
        setIntField(term285373, term285373.getClass(), "areaId", -1604773694);
        setIntField(term285373, term285373.getClass(), "routeNumber", -1181740520);
        setIntField(term285373, term285373.getClass(), "eventId", 1630084052);
        setIntField(term285373, term285373.getClass(), "rate", -1229483233);
        setIntField(term285373, term285373.getClass(), "statusCount", -766646734);
        setBooleanField(term285373, term285373.getClass(), "isValid", false);
        term285660 = new Integer(-1692871251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285660;
        callMethod(klass, "setPosition", argTypes, term285373, args);
    }

};


