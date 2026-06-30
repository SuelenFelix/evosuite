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

public class UserCourse_getUser_10498496494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1915356;

    public UserCourse_getUser_10498496494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1915362 = new Long(6575164463340577898L);
        term1915356 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1915358 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1915360 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1915376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915381 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915648 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1915356, term1915356.getClass(), "id", 2680438423217653613L);
        setLongField(term1915358, term1915358.getClass(), "id", -5322476235170266858L);
        setLongField(term1915360, term1915360.getClass(), "id", 8668602737427040326L);
        setField(term1915360, term1915360.getClass(), "extId", term1915362);
        setField(term1915360, term1915360.getClass(), "luid", "fAHmVkrCYM");
        setIntField(term1915377, term1915377.getClass(), "year", 2020);
        setShortField(term1915377, term1915377.getClass(), "month", (short) 1);
        setShortField(term1915377, term1915377.getClass(), "day", (short) 25);
        setField(term1915376, term1915376.getClass(), "date", term1915377);
        setByteField(term1915381, term1915381.getClass(), "hour", (byte) 8);
        setByteField(term1915381, term1915381.getClass(), "minute", (byte) 34);
        setByteField(term1915381, term1915381.getClass(), "second", (byte) 25);
        setIntField(term1915381, term1915381.getClass(), "nano", 385591136);
        setField(term1915376, term1915376.getClass(), "time", term1915381);
        setField(term1915360, term1915360.getClass(), "registerTime", term1915376);
        setIntField(term1915387, term1915387.getClass(), "year", 2013);
        setShortField(term1915387, term1915387.getClass(), "month", (short) 5);
        setShortField(term1915387, term1915387.getClass(), "day", (short) 17);
        setField(term1915386, term1915386.getClass(), "date", term1915387);
        setByteField(term1915391, term1915391.getClass(), "hour", (byte) 18);
        setByteField(term1915391, term1915391.getClass(), "minute", (byte) 15);
        setByteField(term1915391, term1915391.getClass(), "second", (byte) 43);
        setIntField(term1915391, term1915391.getClass(), "nano", 274723613);
        setField(term1915386, term1915386.getClass(), "time", term1915391);
        setField(term1915360, term1915360.getClass(), "accessTime", term1915386);
        setField(term1915358, term1915358.getClass(), "card", term1915360);
        setField(term1915358, term1915358.getClass(), "userName", "CKICSWFNtv");
        setIntField(term1915409, term1915409.getClass(), "year", 2026);
        setShortField(term1915409, term1915409.getClass(), "month", (short) 4);
        setShortField(term1915409, term1915409.getClass(), "day", (short) 4);
        setField(term1915408, term1915408.getClass(), "date", term1915409);
        setByteField(term1915413, term1915413.getClass(), "hour", (byte) 16);
        setByteField(term1915413, term1915413.getClass(), "minute", (byte) 57);
        setByteField(term1915413, term1915413.getClass(), "second", (byte) 2);
        setIntField(term1915413, term1915413.getClass(), "nano", 172350010);
        setField(term1915408, term1915408.getClass(), "time", term1915413);
        setField(term1915358, term1915358.getClass(), "lastLoginDate", term1915408);
        setBooleanField(term1915358, term1915358.getClass(), "isWebJoin", true);
        setField(term1915358, term1915358.getClass(), "webLimitDate", "liJZkBLnSq");
        setIntField(term1915358, term1915358.getClass(), "level", 1188018668);
        setIntField(term1915358, term1915358.getClass(), "reincarnationNum", 622506573);
        setField(term1915358, term1915358.getClass(), "exp", "JGYqAOMjPT");
        setLongField(term1915358, term1915358.getClass(), "point", 6865120761749040811L);
        setLongField(term1915358, term1915358.getClass(), "totalPoint", -3339318104796355280L);
        setIntField(term1915358, term1915358.getClass(), "playCount", 912619379);
        setIntField(term1915358, term1915358.getClass(), "multiPlayCount", -2073564383);
        setIntField(term1915358, term1915358.getClass(), "multiWinCount", -1011369424);
        setIntField(term1915358, term1915358.getClass(), "requestResCount", -797253964);
        setIntField(term1915358, term1915358.getClass(), "acceptResCount", 1997070080);
        setIntField(term1915358, term1915358.getClass(), "successResCount", -445483408);
        setIntField(term1915358, term1915358.getClass(), "playerRating", -573544173);
        setIntField(term1915358, term1915358.getClass(), "highestRating", 13336821);
        setIntField(term1915358, term1915358.getClass(), "nameplateId", 2133401188);
        setIntField(term1915358, term1915358.getClass(), "frameId", -1011125913);
        setIntField(term1915358, term1915358.getClass(), "characterId", 816036234);
        setIntField(term1915358, term1915358.getClass(), "trophyId", 125689478);
        setIntField(term1915358, term1915358.getClass(), "playedTutorialBit", 51370522);
        setIntField(term1915358, term1915358.getClass(), "firstTutorialCancelNum", -1995406028);
        setIntField(term1915358, term1915358.getClass(), "masterTutorialCancelNum", 1570140708);
        setIntField(term1915358, term1915358.getClass(), "totalRepertoireCount", 12951125);
        setIntField(term1915358, term1915358.getClass(), "totalMapNum", -1778145637);
        setLongField(term1915358, term1915358.getClass(), "totalHiScore", -4009866434271027239L);
        setLongField(term1915358, term1915358.getClass(), "totalBasicHighScore", 3696918817187550386L);
        setLongField(term1915358, term1915358.getClass(), "totalAdvancedHighScore", 8174775977604873900L);
        setLongField(term1915358, term1915358.getClass(), "totalExpertHighScore", -4495203392394937430L);
        setLongField(term1915358, term1915358.getClass(), "totalMasterHighScore", -1042742260821142259L);
        setIntField(term1915470, term1915470.getClass(), "year", 2019);
        setShortField(term1915470, term1915470.getClass(), "month", (short) 1);
        setShortField(term1915470, term1915470.getClass(), "day", (short) 4);
        setField(term1915469, term1915469.getClass(), "date", term1915470);
        setByteField(term1915474, term1915474.getClass(), "hour", (byte) 7);
        setByteField(term1915474, term1915474.getClass(), "minute", (byte) 56);
        setByteField(term1915474, term1915474.getClass(), "second", (byte) 14);
        setIntField(term1915474, term1915474.getClass(), "nano", 447456029);
        setField(term1915469, term1915469.getClass(), "time", term1915474);
        setField(term1915358, term1915358.getClass(), "eventWatchedDate", term1915469);
        setIntField(term1915358, term1915358.getClass(), "friendCount", -1453334989);
        setBooleanField(term1915358, term1915358.getClass(), "isMaimai", false);
        setField(term1915358, term1915358.getClass(), "firstGameId", "PlkBaYdTZH");
        setField(term1915358, term1915358.getClass(), "firstRomVersion", "DeDnuIotgR");
        setField(term1915358, term1915358.getClass(), "firstDataVersion", "hmVaqZbdmP");
        setIntField(term1915518, term1915518.getClass(), "year", 2028);
        setShortField(term1915518, term1915518.getClass(), "month", (short) 10);
        setShortField(term1915518, term1915518.getClass(), "day", (short) 19);
        setField(term1915517, term1915517.getClass(), "date", term1915518);
        setByteField(term1915522, term1915522.getClass(), "hour", (byte) 0);
        setByteField(term1915522, term1915522.getClass(), "minute", (byte) 4);
        setByteField(term1915522, term1915522.getClass(), "second", (byte) 22);
        setIntField(term1915522, term1915522.getClass(), "nano", 540932680);
        setField(term1915517, term1915517.getClass(), "time", term1915522);
        setField(term1915358, term1915358.getClass(), "firstPlayDate", term1915517);
        setField(term1915358, term1915358.getClass(), "lastGameId", "oNHidjHQTb");
        setField(term1915358, term1915358.getClass(), "lastRomVersion", "tcxQefkzAt");
        setField(term1915358, term1915358.getClass(), "lastDataVersion", "frtzhfsIuF");
        setIntField(term1915564, term1915564.getClass(), "year", 2017);
        setShortField(term1915564, term1915564.getClass(), "month", (short) 6);
        setShortField(term1915564, term1915564.getClass(), "day", (short) 5);
        setField(term1915563, term1915563.getClass(), "date", term1915564);
        setByteField(term1915568, term1915568.getClass(), "hour", (byte) 3);
        setByteField(term1915568, term1915568.getClass(), "minute", (byte) 6);
        setByteField(term1915568, term1915568.getClass(), "second", (byte) 37);
        setIntField(term1915568, term1915568.getClass(), "nano", 201466028);
        setField(term1915563, term1915563.getClass(), "time", term1915568);
        setField(term1915358, term1915358.getClass(), "lastPlayDate", term1915563);
        setIntField(term1915358, term1915358.getClass(), "lastPlaceId", -706494045);
        setField(term1915358, term1915358.getClass(), "lastPlaceName", "KsDmcRWzpO");
        setField(term1915358, term1915358.getClass(), "lastRegionId", "mqzjcTtmEm");
        setField(term1915358, term1915358.getClass(), "lastRegionName", "wArqArVZDw");
        setField(term1915358, term1915358.getClass(), "lastAllNetId", "qWlmSxXRHt");
        setField(term1915358, term1915358.getClass(), "lastClientId", "uKMkPscwZc");
        setField(term1915356, term1915356.getClass(), "user", term1915358);
        setIntField(term1915356, term1915356.getClass(), "courseId", 732169157);
        setIntField(term1915356, term1915356.getClass(), "classId", 499499287);
        setIntField(term1915356, term1915356.getClass(), "playCount", 555845776);
        setIntField(term1915356, term1915356.getClass(), "scoreMax", -169539378);
        setBooleanField(term1915356, term1915356.getClass(), "isFullCombo", true);
        setBooleanField(term1915356, term1915356.getClass(), "isAllJustice", false);
        setBooleanField(term1915356, term1915356.getClass(), "isSuccess", false);
        setIntField(term1915356, term1915356.getClass(), "scoreRank", -297970186);
        setIntField(term1915356, term1915356.getClass(), "eventId", -1872355486);
        setIntField(term1915644, term1915644.getClass(), "year", 2023);
        setShortField(term1915644, term1915644.getClass(), "month", (short) 4);
        setShortField(term1915644, term1915644.getClass(), "day", (short) 15);
        setField(term1915643, term1915643.getClass(), "date", term1915644);
        setByteField(term1915648, term1915648.getClass(), "hour", (byte) 14);
        setByteField(term1915648, term1915648.getClass(), "minute", (byte) 17);
        setByteField(term1915648, term1915648.getClass(), "second", (byte) 37);
        setIntField(term1915648, term1915648.getClass(), "nano", 640433544);
        setField(term1915643, term1915643.getClass(), "time", term1915648);
        setField(term1915356, term1915356.getClass(), "lastPlayDate", term1915643);
        setIntField(term1915356, term1915356.getClass(), "param1", 468153136);
        setIntField(term1915356, term1915356.getClass(), "param2", -1255412347);
        setIntField(term1915356, term1915356.getClass(), "param3", 747042633);
        setIntField(term1915356, term1915356.getClass(), "param4", 1798572844);
        setBooleanField(term1915356, term1915356.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1915356, args);
    }

};


