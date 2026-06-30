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

public class UserCourse_getScoreRank_177987073412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1918972;

    public UserCourse_getScoreRank_177987073412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1918978 = new Long(-6200837024273756516L);
        term1918972 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1918974 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1918976 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1918992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918997 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919007 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919264 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1918972, term1918972.getClass(), "id", -7137281925038642812L);
        setLongField(term1918974, term1918974.getClass(), "id", -5744382322791129960L);
        setLongField(term1918976, term1918976.getClass(), "id", 505503075796991669L);
        setField(term1918976, term1918976.getClass(), "extId", term1918978);
        setField(term1918976, term1918976.getClass(), "luid", "WOMfOBKZtQ");
        setIntField(term1918993, term1918993.getClass(), "year", 2024);
        setShortField(term1918993, term1918993.getClass(), "month", (short) 10);
        setShortField(term1918993, term1918993.getClass(), "day", (short) 2);
        setField(term1918992, term1918992.getClass(), "date", term1918993);
        setByteField(term1918997, term1918997.getClass(), "hour", (byte) 19);
        setByteField(term1918997, term1918997.getClass(), "minute", (byte) 14);
        setByteField(term1918997, term1918997.getClass(), "second", (byte) 21);
        setIntField(term1918997, term1918997.getClass(), "nano", 563985750);
        setField(term1918992, term1918992.getClass(), "time", term1918997);
        setField(term1918976, term1918976.getClass(), "registerTime", term1918992);
        setIntField(term1919003, term1919003.getClass(), "year", 2022);
        setShortField(term1919003, term1919003.getClass(), "month", (short) 5);
        setShortField(term1919003, term1919003.getClass(), "day", (short) 6);
        setField(term1919002, term1919002.getClass(), "date", term1919003);
        setByteField(term1919007, term1919007.getClass(), "hour", (byte) 16);
        setByteField(term1919007, term1919007.getClass(), "minute", (byte) 32);
        setByteField(term1919007, term1919007.getClass(), "second", (byte) 4);
        setIntField(term1919007, term1919007.getClass(), "nano", 21562084);
        setField(term1919002, term1919002.getClass(), "time", term1919007);
        setField(term1918976, term1918976.getClass(), "accessTime", term1919002);
        setField(term1918974, term1918974.getClass(), "card", term1918976);
        setField(term1918974, term1918974.getClass(), "userName", "mniurgUHLo");
        setIntField(term1919025, term1919025.getClass(), "year", 2017);
        setShortField(term1919025, term1919025.getClass(), "month", (short) 3);
        setShortField(term1919025, term1919025.getClass(), "day", (short) 8);
        setField(term1919024, term1919024.getClass(), "date", term1919025);
        setByteField(term1919029, term1919029.getClass(), "hour", (byte) 3);
        setByteField(term1919029, term1919029.getClass(), "minute", (byte) 27);
        setByteField(term1919029, term1919029.getClass(), "second", (byte) 11);
        setIntField(term1919029, term1919029.getClass(), "nano", 700658371);
        setField(term1919024, term1919024.getClass(), "time", term1919029);
        setField(term1918974, term1918974.getClass(), "lastLoginDate", term1919024);
        setBooleanField(term1918974, term1918974.getClass(), "isWebJoin", false);
        setField(term1918974, term1918974.getClass(), "webLimitDate", "LJnVvbschC");
        setIntField(term1918974, term1918974.getClass(), "level", -961290815);
        setIntField(term1918974, term1918974.getClass(), "reincarnationNum", 1850840973);
        setField(term1918974, term1918974.getClass(), "exp", "ymwkmJptxC");
        setLongField(term1918974, term1918974.getClass(), "point", 5476507429982099092L);
        setLongField(term1918974, term1918974.getClass(), "totalPoint", -7515052407146660652L);
        setIntField(term1918974, term1918974.getClass(), "playCount", -399576256);
        setIntField(term1918974, term1918974.getClass(), "multiPlayCount", 962195240);
        setIntField(term1918974, term1918974.getClass(), "multiWinCount", 1936533041);
        setIntField(term1918974, term1918974.getClass(), "requestResCount", 351293558);
        setIntField(term1918974, term1918974.getClass(), "acceptResCount", 1483294546);
        setIntField(term1918974, term1918974.getClass(), "successResCount", -1803778450);
        setIntField(term1918974, term1918974.getClass(), "playerRating", 404952481);
        setIntField(term1918974, term1918974.getClass(), "highestRating", 562125840);
        setIntField(term1918974, term1918974.getClass(), "nameplateId", 1809187831);
        setIntField(term1918974, term1918974.getClass(), "frameId", -1826192225);
        setIntField(term1918974, term1918974.getClass(), "characterId", -550215853);
        setIntField(term1918974, term1918974.getClass(), "trophyId", 1391926149);
        setIntField(term1918974, term1918974.getClass(), "playedTutorialBit", 672456215);
        setIntField(term1918974, term1918974.getClass(), "firstTutorialCancelNum", 763294343);
        setIntField(term1918974, term1918974.getClass(), "masterTutorialCancelNum", 1241959875);
        setIntField(term1918974, term1918974.getClass(), "totalRepertoireCount", -1481004755);
        setIntField(term1918974, term1918974.getClass(), "totalMapNum", -1332861965);
        setLongField(term1918974, term1918974.getClass(), "totalHiScore", 1533125830130710760L);
        setLongField(term1918974, term1918974.getClass(), "totalBasicHighScore", -4983125221677168750L);
        setLongField(term1918974, term1918974.getClass(), "totalAdvancedHighScore", 4416545438598502359L);
        setLongField(term1918974, term1918974.getClass(), "totalExpertHighScore", -2876901196225209962L);
        setLongField(term1918974, term1918974.getClass(), "totalMasterHighScore", 6514064763533480230L);
        setIntField(term1919086, term1919086.getClass(), "year", 2016);
        setShortField(term1919086, term1919086.getClass(), "month", (short) 11);
        setShortField(term1919086, term1919086.getClass(), "day", (short) 9);
        setField(term1919085, term1919085.getClass(), "date", term1919086);
        setByteField(term1919090, term1919090.getClass(), "hour", (byte) 1);
        setByteField(term1919090, term1919090.getClass(), "minute", (byte) 28);
        setByteField(term1919090, term1919090.getClass(), "second", (byte) 28);
        setIntField(term1919090, term1919090.getClass(), "nano", 454206586);
        setField(term1919085, term1919085.getClass(), "time", term1919090);
        setField(term1918974, term1918974.getClass(), "eventWatchedDate", term1919085);
        setIntField(term1918974, term1918974.getClass(), "friendCount", -1983281512);
        setBooleanField(term1918974, term1918974.getClass(), "isMaimai", true);
        setField(term1918974, term1918974.getClass(), "firstGameId", "wyRgTWpSoo");
        setField(term1918974, term1918974.getClass(), "firstRomVersion", "RfYmWjrnMz");
        setField(term1918974, term1918974.getClass(), "firstDataVersion", "TwPeINhmNk");
        setIntField(term1919134, term1919134.getClass(), "year", 2020);
        setShortField(term1919134, term1919134.getClass(), "month", (short) 11);
        setShortField(term1919134, term1919134.getClass(), "day", (short) 7);
        setField(term1919133, term1919133.getClass(), "date", term1919134);
        setByteField(term1919138, term1919138.getClass(), "hour", (byte) 23);
        setByteField(term1919138, term1919138.getClass(), "minute", (byte) 48);
        setByteField(term1919138, term1919138.getClass(), "second", (byte) 1);
        setIntField(term1919138, term1919138.getClass(), "nano", 916235129);
        setField(term1919133, term1919133.getClass(), "time", term1919138);
        setField(term1918974, term1918974.getClass(), "firstPlayDate", term1919133);
        setField(term1918974, term1918974.getClass(), "lastGameId", "PeeDFKLiHx");
        setField(term1918974, term1918974.getClass(), "lastRomVersion", "WFBIQETHES");
        setField(term1918974, term1918974.getClass(), "lastDataVersion", "YVlLaFLMgv");
        setIntField(term1919180, term1919180.getClass(), "year", 2016);
        setShortField(term1919180, term1919180.getClass(), "month", (short) 1);
        setShortField(term1919180, term1919180.getClass(), "day", (short) 1);
        setField(term1919179, term1919179.getClass(), "date", term1919180);
        setByteField(term1919184, term1919184.getClass(), "hour", (byte) 6);
        setByteField(term1919184, term1919184.getClass(), "minute", (byte) 29);
        setByteField(term1919184, term1919184.getClass(), "second", (byte) 52);
        setIntField(term1919184, term1919184.getClass(), "nano", 364473575);
        setField(term1919179, term1919179.getClass(), "time", term1919184);
        setField(term1918974, term1918974.getClass(), "lastPlayDate", term1919179);
        setIntField(term1918974, term1918974.getClass(), "lastPlaceId", -1057195854);
        setField(term1918974, term1918974.getClass(), "lastPlaceName", "qqQiPUiwcb");
        setField(term1918974, term1918974.getClass(), "lastRegionId", "NNjvYWDWVh");
        setField(term1918974, term1918974.getClass(), "lastRegionName", "XlApXdQDwC");
        setField(term1918974, term1918974.getClass(), "lastAllNetId", "MYcygTYXhH");
        setField(term1918974, term1918974.getClass(), "lastClientId", "gaHWZNONRm");
        setField(term1918972, term1918972.getClass(), "user", term1918974);
        setIntField(term1918972, term1918972.getClass(), "courseId", 706008848);
        setIntField(term1918972, term1918972.getClass(), "classId", 1034072918);
        setIntField(term1918972, term1918972.getClass(), "playCount", 1660236048);
        setIntField(term1918972, term1918972.getClass(), "scoreMax", -1187133310);
        setBooleanField(term1918972, term1918972.getClass(), "isFullCombo", false);
        setBooleanField(term1918972, term1918972.getClass(), "isAllJustice", true);
        setBooleanField(term1918972, term1918972.getClass(), "isSuccess", false);
        setIntField(term1918972, term1918972.getClass(), "scoreRank", 1873351080);
        setIntField(term1918972, term1918972.getClass(), "eventId", -802644214);
        setIntField(term1919260, term1919260.getClass(), "year", 2017);
        setShortField(term1919260, term1919260.getClass(), "month", (short) 4);
        setShortField(term1919260, term1919260.getClass(), "day", (short) 28);
        setField(term1919259, term1919259.getClass(), "date", term1919260);
        setByteField(term1919264, term1919264.getClass(), "hour", (byte) 8);
        setByteField(term1919264, term1919264.getClass(), "minute", (byte) 23);
        setByteField(term1919264, term1919264.getClass(), "second", (byte) 41);
        setIntField(term1919264, term1919264.getClass(), "nano", 771012905);
        setField(term1919259, term1919259.getClass(), "time", term1919264);
        setField(term1918972, term1918972.getClass(), "lastPlayDate", term1919259);
        setIntField(term1918972, term1918972.getClass(), "param1", -1874540966);
        setIntField(term1918972, term1918972.getClass(), "param2", -858793276);
        setIntField(term1918972, term1918972.getClass(), "param3", 163654378);
        setIntField(term1918972, term1918972.getClass(), "param4", -1173866611);
        setBooleanField(term1918972, term1918972.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term1918972, args);
    }

};


