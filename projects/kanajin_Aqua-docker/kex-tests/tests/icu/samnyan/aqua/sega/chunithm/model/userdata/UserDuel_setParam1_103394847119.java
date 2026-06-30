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

public class UserDuel_setParam1_103394847119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83757;
     Object term84053;

    public UserDuel_setParam1_103394847119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term83763 = new Long(-8603648071751666348L);
        term83757 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term83759 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term83761 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term83777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83814 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83969 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84044 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term83757, term83757.getClass(), "id", -4645138191058941101L);
        setLongField(term83759, term83759.getClass(), "id", -7214804908928828361L);
        setLongField(term83761, term83761.getClass(), "id", 8330781560568888679L);
        setField(term83761, term83761.getClass(), "extId", term83763);
        setField(term83761, term83761.getClass(), "luid", "hIBYlJpYye");
        setIntField(term83778, term83778.getClass(), "year", 2019);
        setShortField(term83778, term83778.getClass(), "month", (short) 1);
        setShortField(term83778, term83778.getClass(), "day", (short) 31);
        setField(term83777, term83777.getClass(), "date", term83778);
        setByteField(term83782, term83782.getClass(), "hour", (byte) 8);
        setByteField(term83782, term83782.getClass(), "minute", (byte) 28);
        setByteField(term83782, term83782.getClass(), "second", (byte) 32);
        setIntField(term83782, term83782.getClass(), "nano", 828700368);
        setField(term83777, term83777.getClass(), "time", term83782);
        setField(term83761, term83761.getClass(), "registerTime", term83777);
        setIntField(term83788, term83788.getClass(), "year", 2027);
        setShortField(term83788, term83788.getClass(), "month", (short) 6);
        setShortField(term83788, term83788.getClass(), "day", (short) 13);
        setField(term83787, term83787.getClass(), "date", term83788);
        setByteField(term83792, term83792.getClass(), "hour", (byte) 4);
        setByteField(term83792, term83792.getClass(), "minute", (byte) 7);
        setByteField(term83792, term83792.getClass(), "second", (byte) 55);
        setIntField(term83792, term83792.getClass(), "nano", 288212169);
        setField(term83787, term83787.getClass(), "time", term83792);
        setField(term83761, term83761.getClass(), "accessTime", term83787);
        setField(term83759, term83759.getClass(), "card", term83761);
        setField(term83759, term83759.getClass(), "userName", "LNendOzJhj");
        setIntField(term83810, term83810.getClass(), "year", 2016);
        setShortField(term83810, term83810.getClass(), "month", (short) 8);
        setShortField(term83810, term83810.getClass(), "day", (short) 20);
        setField(term83809, term83809.getClass(), "date", term83810);
        setByteField(term83814, term83814.getClass(), "hour", (byte) 15);
        setByteField(term83814, term83814.getClass(), "minute", (byte) 59);
        setByteField(term83814, term83814.getClass(), "second", (byte) 24);
        setIntField(term83814, term83814.getClass(), "nano", 817884348);
        setField(term83809, term83809.getClass(), "time", term83814);
        setField(term83759, term83759.getClass(), "lastLoginDate", term83809);
        setBooleanField(term83759, term83759.getClass(), "isWebJoin", false);
        setField(term83759, term83759.getClass(), "webLimitDate", "ZwcevQDgzv");
        setIntField(term83759, term83759.getClass(), "level", -1366102520);
        setIntField(term83759, term83759.getClass(), "reincarnationNum", -991083478);
        setField(term83759, term83759.getClass(), "exp", "rzkENrHYBI");
        setLongField(term83759, term83759.getClass(), "point", -4718136580123793528L);
        setLongField(term83759, term83759.getClass(), "totalPoint", 5370230694464734941L);
        setIntField(term83759, term83759.getClass(), "playCount", -1423864560);
        setIntField(term83759, term83759.getClass(), "multiPlayCount", 1155538873);
        setIntField(term83759, term83759.getClass(), "multiWinCount", 868120753);
        setIntField(term83759, term83759.getClass(), "requestResCount", 691240568);
        setIntField(term83759, term83759.getClass(), "acceptResCount", 1689565461);
        setIntField(term83759, term83759.getClass(), "successResCount", 1105348026);
        setIntField(term83759, term83759.getClass(), "playerRating", -35374943);
        setIntField(term83759, term83759.getClass(), "highestRating", -561318198);
        setIntField(term83759, term83759.getClass(), "nameplateId", -1196585904);
        setIntField(term83759, term83759.getClass(), "frameId", 123352569);
        setIntField(term83759, term83759.getClass(), "characterId", 2027326435);
        setIntField(term83759, term83759.getClass(), "trophyId", 1185859348);
        setIntField(term83759, term83759.getClass(), "playedTutorialBit", -1963285488);
        setIntField(term83759, term83759.getClass(), "firstTutorialCancelNum", 390373954);
        setIntField(term83759, term83759.getClass(), "masterTutorialCancelNum", 1525579039);
        setIntField(term83759, term83759.getClass(), "totalRepertoireCount", -509784163);
        setIntField(term83759, term83759.getClass(), "totalMapNum", 1503484564);
        setLongField(term83759, term83759.getClass(), "totalHiScore", -1887513396695229317L);
        setLongField(term83759, term83759.getClass(), "totalBasicHighScore", 4538748174903798169L);
        setLongField(term83759, term83759.getClass(), "totalAdvancedHighScore", 8651853359004042709L);
        setLongField(term83759, term83759.getClass(), "totalExpertHighScore", -2356268402672275562L);
        setLongField(term83759, term83759.getClass(), "totalMasterHighScore", 4920060206553726462L);
        setIntField(term83871, term83871.getClass(), "year", 2020);
        setShortField(term83871, term83871.getClass(), "month", (short) 5);
        setShortField(term83871, term83871.getClass(), "day", (short) 12);
        setField(term83870, term83870.getClass(), "date", term83871);
        setByteField(term83875, term83875.getClass(), "hour", (byte) 13);
        setByteField(term83875, term83875.getClass(), "minute", (byte) 11);
        setByteField(term83875, term83875.getClass(), "second", (byte) 59);
        setIntField(term83875, term83875.getClass(), "nano", 36534511);
        setField(term83870, term83870.getClass(), "time", term83875);
        setField(term83759, term83759.getClass(), "eventWatchedDate", term83870);
        setIntField(term83759, term83759.getClass(), "friendCount", -433236731);
        setBooleanField(term83759, term83759.getClass(), "isMaimai", true);
        setField(term83759, term83759.getClass(), "firstGameId", "ylJjmNVzzt");
        setField(term83759, term83759.getClass(), "firstRomVersion", "nwKTRDmHWk");
        setField(term83759, term83759.getClass(), "firstDataVersion", "UueEixdrss");
        setIntField(term83919, term83919.getClass(), "year", 2012);
        setShortField(term83919, term83919.getClass(), "month", (short) 8);
        setShortField(term83919, term83919.getClass(), "day", (short) 29);
        setField(term83918, term83918.getClass(), "date", term83919);
        setByteField(term83923, term83923.getClass(), "hour", (byte) 18);
        setByteField(term83923, term83923.getClass(), "minute", (byte) 51);
        setByteField(term83923, term83923.getClass(), "second", (byte) 22);
        setIntField(term83923, term83923.getClass(), "nano", 659205197);
        setField(term83918, term83918.getClass(), "time", term83923);
        setField(term83759, term83759.getClass(), "firstPlayDate", term83918);
        setField(term83759, term83759.getClass(), "lastGameId", "ceafBXJyBB");
        setField(term83759, term83759.getClass(), "lastRomVersion", "VNHIbCXqhH");
        setField(term83759, term83759.getClass(), "lastDataVersion", "csnhUIxUaP");
        setIntField(term83965, term83965.getClass(), "year", 2028);
        setShortField(term83965, term83965.getClass(), "month", (short) 1);
        setShortField(term83965, term83965.getClass(), "day", (short) 24);
        setField(term83964, term83964.getClass(), "date", term83965);
        setByteField(term83969, term83969.getClass(), "hour", (byte) 3);
        setByteField(term83969, term83969.getClass(), "minute", (byte) 52);
        setByteField(term83969, term83969.getClass(), "second", (byte) 50);
        setIntField(term83969, term83969.getClass(), "nano", 496872064);
        setField(term83964, term83964.getClass(), "time", term83969);
        setField(term83759, term83759.getClass(), "lastPlayDate", term83964);
        setIntField(term83759, term83759.getClass(), "lastPlaceId", 2003700950);
        setField(term83759, term83759.getClass(), "lastPlaceName", "fmWYICGnwt");
        setField(term83759, term83759.getClass(), "lastRegionId", "FlZbOFNISk");
        setField(term83759, term83759.getClass(), "lastRegionName", "zDtePZrZQH");
        setField(term83759, term83759.getClass(), "lastAllNetId", "YPVZjrbvVl");
        setField(term83759, term83759.getClass(), "lastClientId", "TWsXTUTREq");
        setField(term83757, term83757.getClass(), "user", term83759);
        setIntField(term83757, term83757.getClass(), "duelId", -1309376267);
        setIntField(term83757, term83757.getClass(), "progress", -1487504399);
        setIntField(term83757, term83757.getClass(), "point", -345174419);
        setBooleanField(term83757, term83757.getClass(), "isClear", true);
        setIntField(term84040, term84040.getClass(), "year", 2018);
        setShortField(term84040, term84040.getClass(), "month", (short) 10);
        setShortField(term84040, term84040.getClass(), "day", (short) 15);
        setField(term84039, term84039.getClass(), "date", term84040);
        setByteField(term84044, term84044.getClass(), "hour", (byte) 16);
        setByteField(term84044, term84044.getClass(), "minute", (byte) 49);
        setByteField(term84044, term84044.getClass(), "second", (byte) 22);
        setIntField(term84044, term84044.getClass(), "nano", 61396561);
        setField(term84039, term84039.getClass(), "time", term84044);
        setField(term83757, term83757.getClass(), "lastPlayDate", term84039);
        setIntField(term83757, term83757.getClass(), "param1", 1676102379);
        setIntField(term83757, term83757.getClass(), "param2", 1215582502);
        setIntField(term83757, term83757.getClass(), "param3", 997123385);
        setIntField(term83757, term83757.getClass(), "param4", -171991376);
        term84053 = new Integer(1966933092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term84053;
        callMethod(klass, "setParam1", argTypes, term83757, args);
    }

};


