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

public class UserCourse_getScoreMax_13367153428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1917164;

    public UserCourse_getScoreMax_13367153428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1917170 = new Long(376617836260009696L);
        term1917164 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1917166 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1917168 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1917184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917221 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917277 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917278 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917282 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917330 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917456 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1917164, term1917164.getClass(), "id", 3705330580528362880L);
        setLongField(term1917166, term1917166.getClass(), "id", -6312482314893360683L);
        setLongField(term1917168, term1917168.getClass(), "id", 9034971908548501695L);
        setField(term1917168, term1917168.getClass(), "extId", term1917170);
        setField(term1917168, term1917168.getClass(), "luid", "FuKaTzWcEY");
        setIntField(term1917185, term1917185.getClass(), "year", 2024);
        setShortField(term1917185, term1917185.getClass(), "month", (short) 12);
        setShortField(term1917185, term1917185.getClass(), "day", (short) 20);
        setField(term1917184, term1917184.getClass(), "date", term1917185);
        setByteField(term1917189, term1917189.getClass(), "hour", (byte) 5);
        setByteField(term1917189, term1917189.getClass(), "minute", (byte) 17);
        setByteField(term1917189, term1917189.getClass(), "second", (byte) 5);
        setIntField(term1917189, term1917189.getClass(), "nano", 519175178);
        setField(term1917184, term1917184.getClass(), "time", term1917189);
        setField(term1917168, term1917168.getClass(), "registerTime", term1917184);
        setIntField(term1917195, term1917195.getClass(), "year", 2023);
        setShortField(term1917195, term1917195.getClass(), "month", (short) 12);
        setShortField(term1917195, term1917195.getClass(), "day", (short) 12);
        setField(term1917194, term1917194.getClass(), "date", term1917195);
        setByteField(term1917199, term1917199.getClass(), "hour", (byte) 8);
        setByteField(term1917199, term1917199.getClass(), "minute", (byte) 4);
        setByteField(term1917199, term1917199.getClass(), "second", (byte) 39);
        setIntField(term1917199, term1917199.getClass(), "nano", 588943860);
        setField(term1917194, term1917194.getClass(), "time", term1917199);
        setField(term1917168, term1917168.getClass(), "accessTime", term1917194);
        setField(term1917166, term1917166.getClass(), "card", term1917168);
        setField(term1917166, term1917166.getClass(), "userName", "msdpKBwEjy");
        setIntField(term1917217, term1917217.getClass(), "year", 2028);
        setShortField(term1917217, term1917217.getClass(), "month", (short) 5);
        setShortField(term1917217, term1917217.getClass(), "day", (short) 10);
        setField(term1917216, term1917216.getClass(), "date", term1917217);
        setByteField(term1917221, term1917221.getClass(), "hour", (byte) 21);
        setByteField(term1917221, term1917221.getClass(), "minute", (byte) 32);
        setByteField(term1917221, term1917221.getClass(), "second", (byte) 57);
        setIntField(term1917221, term1917221.getClass(), "nano", 689747237);
        setField(term1917216, term1917216.getClass(), "time", term1917221);
        setField(term1917166, term1917166.getClass(), "lastLoginDate", term1917216);
        setBooleanField(term1917166, term1917166.getClass(), "isWebJoin", true);
        setField(term1917166, term1917166.getClass(), "webLimitDate", "SoBfetBuIG");
        setIntField(term1917166, term1917166.getClass(), "level", 805296269);
        setIntField(term1917166, term1917166.getClass(), "reincarnationNum", -1740983249);
        setField(term1917166, term1917166.getClass(), "exp", "xqTdZKQkxG");
        setLongField(term1917166, term1917166.getClass(), "point", 1572945952931737627L);
        setLongField(term1917166, term1917166.getClass(), "totalPoint", 5139850666552216635L);
        setIntField(term1917166, term1917166.getClass(), "playCount", -1262643343);
        setIntField(term1917166, term1917166.getClass(), "multiPlayCount", -950077497);
        setIntField(term1917166, term1917166.getClass(), "multiWinCount", 919418692);
        setIntField(term1917166, term1917166.getClass(), "requestResCount", 723132574);
        setIntField(term1917166, term1917166.getClass(), "acceptResCount", -1515667665);
        setIntField(term1917166, term1917166.getClass(), "successResCount", 659292572);
        setIntField(term1917166, term1917166.getClass(), "playerRating", 1746429591);
        setIntField(term1917166, term1917166.getClass(), "highestRating", -2023682556);
        setIntField(term1917166, term1917166.getClass(), "nameplateId", 1035472413);
        setIntField(term1917166, term1917166.getClass(), "frameId", -119493009);
        setIntField(term1917166, term1917166.getClass(), "characterId", 54250776);
        setIntField(term1917166, term1917166.getClass(), "trophyId", 117153008);
        setIntField(term1917166, term1917166.getClass(), "playedTutorialBit", -2134849451);
        setIntField(term1917166, term1917166.getClass(), "firstTutorialCancelNum", -926584405);
        setIntField(term1917166, term1917166.getClass(), "masterTutorialCancelNum", -807090140);
        setIntField(term1917166, term1917166.getClass(), "totalRepertoireCount", -538390238);
        setIntField(term1917166, term1917166.getClass(), "totalMapNum", -1497676039);
        setLongField(term1917166, term1917166.getClass(), "totalHiScore", -2445989127249775801L);
        setLongField(term1917166, term1917166.getClass(), "totalBasicHighScore", 5413392709919859441L);
        setLongField(term1917166, term1917166.getClass(), "totalAdvancedHighScore", -8975419850707956895L);
        setLongField(term1917166, term1917166.getClass(), "totalExpertHighScore", -1499812610267680637L);
        setLongField(term1917166, term1917166.getClass(), "totalMasterHighScore", -8389890254185129184L);
        setIntField(term1917278, term1917278.getClass(), "year", 2018);
        setShortField(term1917278, term1917278.getClass(), "month", (short) 4);
        setShortField(term1917278, term1917278.getClass(), "day", (short) 30);
        setField(term1917277, term1917277.getClass(), "date", term1917278);
        setByteField(term1917282, term1917282.getClass(), "hour", (byte) 2);
        setByteField(term1917282, term1917282.getClass(), "minute", (byte) 9);
        setByteField(term1917282, term1917282.getClass(), "second", (byte) 23);
        setIntField(term1917282, term1917282.getClass(), "nano", 860334658);
        setField(term1917277, term1917277.getClass(), "time", term1917282);
        setField(term1917166, term1917166.getClass(), "eventWatchedDate", term1917277);
        setIntField(term1917166, term1917166.getClass(), "friendCount", 1129959430);
        setBooleanField(term1917166, term1917166.getClass(), "isMaimai", true);
        setField(term1917166, term1917166.getClass(), "firstGameId", "tcpiLHkoJp");
        setField(term1917166, term1917166.getClass(), "firstRomVersion", "WdeVFNornh");
        setField(term1917166, term1917166.getClass(), "firstDataVersion", "XEXlEkpxQA");
        setIntField(term1917326, term1917326.getClass(), "year", 2021);
        setShortField(term1917326, term1917326.getClass(), "month", (short) 3);
        setShortField(term1917326, term1917326.getClass(), "day", (short) 25);
        setField(term1917325, term1917325.getClass(), "date", term1917326);
        setByteField(term1917330, term1917330.getClass(), "hour", (byte) 7);
        setByteField(term1917330, term1917330.getClass(), "minute", (byte) 19);
        setByteField(term1917330, term1917330.getClass(), "second", (byte) 8);
        setIntField(term1917330, term1917330.getClass(), "nano", 372360878);
        setField(term1917325, term1917325.getClass(), "time", term1917330);
        setField(term1917166, term1917166.getClass(), "firstPlayDate", term1917325);
        setField(term1917166, term1917166.getClass(), "lastGameId", "YROMDCImLB");
        setField(term1917166, term1917166.getClass(), "lastRomVersion", "rDdvJyHfKm");
        setField(term1917166, term1917166.getClass(), "lastDataVersion", "KWKFIpFGXe");
        setIntField(term1917372, term1917372.getClass(), "year", 2016);
        setShortField(term1917372, term1917372.getClass(), "month", (short) 10);
        setShortField(term1917372, term1917372.getClass(), "day", (short) 14);
        setField(term1917371, term1917371.getClass(), "date", term1917372);
        setByteField(term1917376, term1917376.getClass(), "hour", (byte) 13);
        setByteField(term1917376, term1917376.getClass(), "minute", (byte) 3);
        setByteField(term1917376, term1917376.getClass(), "second", (byte) 28);
        setIntField(term1917376, term1917376.getClass(), "nano", 470099103);
        setField(term1917371, term1917371.getClass(), "time", term1917376);
        setField(term1917166, term1917166.getClass(), "lastPlayDate", term1917371);
        setIntField(term1917166, term1917166.getClass(), "lastPlaceId", 607045425);
        setField(term1917166, term1917166.getClass(), "lastPlaceName", "RAbWkBcnMW");
        setField(term1917166, term1917166.getClass(), "lastRegionId", "fhranrtqYv");
        setField(term1917166, term1917166.getClass(), "lastRegionName", "pkegjsEpln");
        setField(term1917166, term1917166.getClass(), "lastAllNetId", "DyAYePOivR");
        setField(term1917166, term1917166.getClass(), "lastClientId", "SDpORCthMD");
        setField(term1917164, term1917164.getClass(), "user", term1917166);
        setIntField(term1917164, term1917164.getClass(), "courseId", 566406222);
        setIntField(term1917164, term1917164.getClass(), "classId", -76384852);
        setIntField(term1917164, term1917164.getClass(), "playCount", 1544749538);
        setIntField(term1917164, term1917164.getClass(), "scoreMax", 436488297);
        setBooleanField(term1917164, term1917164.getClass(), "isFullCombo", false);
        setBooleanField(term1917164, term1917164.getClass(), "isAllJustice", true);
        setBooleanField(term1917164, term1917164.getClass(), "isSuccess", false);
        setIntField(term1917164, term1917164.getClass(), "scoreRank", -1016680161);
        setIntField(term1917164, term1917164.getClass(), "eventId", 1420374852);
        setIntField(term1917452, term1917452.getClass(), "year", 2025);
        setShortField(term1917452, term1917452.getClass(), "month", (short) 4);
        setShortField(term1917452, term1917452.getClass(), "day", (short) 22);
        setField(term1917451, term1917451.getClass(), "date", term1917452);
        setByteField(term1917456, term1917456.getClass(), "hour", (byte) 17);
        setByteField(term1917456, term1917456.getClass(), "minute", (byte) 32);
        setByteField(term1917456, term1917456.getClass(), "second", (byte) 10);
        setIntField(term1917456, term1917456.getClass(), "nano", 342487802);
        setField(term1917451, term1917451.getClass(), "time", term1917456);
        setField(term1917164, term1917164.getClass(), "lastPlayDate", term1917451);
        setIntField(term1917164, term1917164.getClass(), "param1", 1849153526);
        setIntField(term1917164, term1917164.getClass(), "param2", 1304070780);
        setIntField(term1917164, term1917164.getClass(), "param3", 1953829502);
        setIntField(term1917164, term1917164.getClass(), "param4", 342395325);
        setBooleanField(term1917164, term1917164.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term1917164, args);
    }

};


