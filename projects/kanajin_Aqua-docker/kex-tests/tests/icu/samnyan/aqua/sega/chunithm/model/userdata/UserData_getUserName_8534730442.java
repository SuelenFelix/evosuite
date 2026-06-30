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

public class UserData_getUserName_8534730442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130233;

    public UserData_getUserName_8534730442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130237 = new Long(4069264186851023313L);
        term130233 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term130235 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term130251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130443 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130233, term130233.getClass(), "id", 1110155966563942771L);
        setLongField(term130235, term130235.getClass(), "id", 269702656736355889L);
        setField(term130235, term130235.getClass(), "extId", term130237);
        setField(term130235, term130235.getClass(), "luid", "mpuBHnTLtZ");
        setIntField(term130252, term130252.getClass(), "year", 2014);
        setShortField(term130252, term130252.getClass(), "month", (short) 4);
        setShortField(term130252, term130252.getClass(), "day", (short) 18);
        setField(term130251, term130251.getClass(), "date", term130252);
        setByteField(term130256, term130256.getClass(), "hour", (byte) 1);
        setByteField(term130256, term130256.getClass(), "minute", (byte) 2);
        setByteField(term130256, term130256.getClass(), "second", (byte) 14);
        setIntField(term130256, term130256.getClass(), "nano", 59792039);
        setField(term130251, term130251.getClass(), "time", term130256);
        setField(term130235, term130235.getClass(), "registerTime", term130251);
        setIntField(term130262, term130262.getClass(), "year", 2017);
        setShortField(term130262, term130262.getClass(), "month", (short) 6);
        setShortField(term130262, term130262.getClass(), "day", (short) 7);
        setField(term130261, term130261.getClass(), "date", term130262);
        setByteField(term130266, term130266.getClass(), "hour", (byte) 13);
        setByteField(term130266, term130266.getClass(), "minute", (byte) 17);
        setByteField(term130266, term130266.getClass(), "second", (byte) 37);
        setIntField(term130266, term130266.getClass(), "nano", 71604979);
        setField(term130261, term130261.getClass(), "time", term130266);
        setField(term130235, term130235.getClass(), "accessTime", term130261);
        setField(term130233, term130233.getClass(), "card", term130235);
        setField(term130233, term130233.getClass(), "userName", "mwseGQwGCJ");
        setIntField(term130284, term130284.getClass(), "year", 2017);
        setShortField(term130284, term130284.getClass(), "month", (short) 4);
        setShortField(term130284, term130284.getClass(), "day", (short) 11);
        setField(term130283, term130283.getClass(), "date", term130284);
        setByteField(term130288, term130288.getClass(), "hour", (byte) 12);
        setByteField(term130288, term130288.getClass(), "minute", (byte) 28);
        setByteField(term130288, term130288.getClass(), "second", (byte) 41);
        setIntField(term130288, term130288.getClass(), "nano", 539410307);
        setField(term130283, term130283.getClass(), "time", term130288);
        setField(term130233, term130233.getClass(), "lastLoginDate", term130283);
        setBooleanField(term130233, term130233.getClass(), "isWebJoin", false);
        setField(term130233, term130233.getClass(), "webLimitDate", "GFnDQFsVrR");
        setIntField(term130233, term130233.getClass(), "level", 1130836028);
        setIntField(term130233, term130233.getClass(), "reincarnationNum", 1084651639);
        setField(term130233, term130233.getClass(), "exp", "UQmUTrbRaN");
        setLongField(term130233, term130233.getClass(), "point", 8166421484573894031L);
        setLongField(term130233, term130233.getClass(), "totalPoint", -3024937128077447738L);
        setIntField(term130233, term130233.getClass(), "playCount", -5960347);
        setIntField(term130233, term130233.getClass(), "multiPlayCount", 1080022248);
        setIntField(term130233, term130233.getClass(), "multiWinCount", -1800860642);
        setIntField(term130233, term130233.getClass(), "requestResCount", -1679309135);
        setIntField(term130233, term130233.getClass(), "acceptResCount", 1736740178);
        setIntField(term130233, term130233.getClass(), "successResCount", -202034601);
        setIntField(term130233, term130233.getClass(), "playerRating", -151407958);
        setIntField(term130233, term130233.getClass(), "highestRating", 1537567964);
        setIntField(term130233, term130233.getClass(), "nameplateId", 1552192679);
        setIntField(term130233, term130233.getClass(), "frameId", -655599823);
        setIntField(term130233, term130233.getClass(), "characterId", -1993642452);
        setIntField(term130233, term130233.getClass(), "trophyId", 1461590652);
        setIntField(term130233, term130233.getClass(), "playedTutorialBit", -1671428336);
        setIntField(term130233, term130233.getClass(), "firstTutorialCancelNum", -1465646058);
        setIntField(term130233, term130233.getClass(), "masterTutorialCancelNum", 457823846);
        setIntField(term130233, term130233.getClass(), "totalRepertoireCount", 1778294369);
        setIntField(term130233, term130233.getClass(), "totalMapNum", -1206831454);
        setLongField(term130233, term130233.getClass(), "totalHiScore", -6300837665282567859L);
        setLongField(term130233, term130233.getClass(), "totalBasicHighScore", 2113641641337585926L);
        setLongField(term130233, term130233.getClass(), "totalAdvancedHighScore", 3949301078476867469L);
        setLongField(term130233, term130233.getClass(), "totalExpertHighScore", -7128719881532368798L);
        setLongField(term130233, term130233.getClass(), "totalMasterHighScore", 2547799188192307646L);
        setIntField(term130345, term130345.getClass(), "year", 2023);
        setShortField(term130345, term130345.getClass(), "month", (short) 9);
        setShortField(term130345, term130345.getClass(), "day", (short) 20);
        setField(term130344, term130344.getClass(), "date", term130345);
        setByteField(term130349, term130349.getClass(), "hour", (byte) 6);
        setByteField(term130349, term130349.getClass(), "minute", (byte) 7);
        setByteField(term130349, term130349.getClass(), "second", (byte) 15);
        setIntField(term130349, term130349.getClass(), "nano", 541992675);
        setField(term130344, term130344.getClass(), "time", term130349);
        setField(term130233, term130233.getClass(), "eventWatchedDate", term130344);
        setIntField(term130233, term130233.getClass(), "friendCount", 1513524215);
        setBooleanField(term130233, term130233.getClass(), "isMaimai", true);
        setField(term130233, term130233.getClass(), "firstGameId", "pJVgbTDDrd");
        setField(term130233, term130233.getClass(), "firstRomVersion", "UzXAOjUtTa");
        setField(term130233, term130233.getClass(), "firstDataVersion", "NjTyNZneQx");
        setIntField(term130393, term130393.getClass(), "year", 2016);
        setShortField(term130393, term130393.getClass(), "month", (short) 6);
        setShortField(term130393, term130393.getClass(), "day", (short) 9);
        setField(term130392, term130392.getClass(), "date", term130393);
        setByteField(term130397, term130397.getClass(), "hour", (byte) 6);
        setByteField(term130397, term130397.getClass(), "minute", (byte) 36);
        setByteField(term130397, term130397.getClass(), "second", (byte) 6);
        setIntField(term130397, term130397.getClass(), "nano", 581614434);
        setField(term130392, term130392.getClass(), "time", term130397);
        setField(term130233, term130233.getClass(), "firstPlayDate", term130392);
        setField(term130233, term130233.getClass(), "lastGameId", "WZgjoyroht");
        setField(term130233, term130233.getClass(), "lastRomVersion", "WsLIuqMrjH");
        setField(term130233, term130233.getClass(), "lastDataVersion", "bSGeeoWHWd");
        setIntField(term130439, term130439.getClass(), "year", 2021);
        setShortField(term130439, term130439.getClass(), "month", (short) 9);
        setShortField(term130439, term130439.getClass(), "day", (short) 27);
        setField(term130438, term130438.getClass(), "date", term130439);
        setByteField(term130443, term130443.getClass(), "hour", (byte) 15);
        setByteField(term130443, term130443.getClass(), "minute", (byte) 55);
        setByteField(term130443, term130443.getClass(), "second", (byte) 14);
        setIntField(term130443, term130443.getClass(), "nano", 906528726);
        setField(term130438, term130438.getClass(), "time", term130443);
        setField(term130233, term130233.getClass(), "lastPlayDate", term130438);
        setIntField(term130233, term130233.getClass(), "lastPlaceId", 86829253);
        setField(term130233, term130233.getClass(), "lastPlaceName", "zrXiLofNaH");
        setField(term130233, term130233.getClass(), "lastRegionId", "qNyGHnJtiu");
        setField(term130233, term130233.getClass(), "lastRegionName", "TEpyPHqnFK");
        setField(term130233, term130233.getClass(), "lastAllNetId", "IuajqwVUGv");
        setField(term130233, term130233.getClass(), "lastClientId", "XpFjyIwJKk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term130233, args);
    }

};


