package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getCharacterId_87291038220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8021;

    public ExternalUserData_getCharacterId_87291038220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8021 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term8046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8112 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8160 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8206 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8021, term8021.getClass(), "accessCode", "vLerpqavFM");
        setField(term8021, term8021.getClass(), "userName", "qnvxzwuGKX");
        setIntField(term8047, term8047.getClass(), "year", 2011);
        setShortField(term8047, term8047.getClass(), "month", (short) 4);
        setShortField(term8047, term8047.getClass(), "day", (short) 19);
        setField(term8046, term8046.getClass(), "date", term8047);
        setByteField(term8051, term8051.getClass(), "hour", (byte) 12);
        setByteField(term8051, term8051.getClass(), "minute", (byte) 0);
        setByteField(term8051, term8051.getClass(), "second", (byte) 14);
        setIntField(term8051, term8051.getClass(), "nano", 849079063);
        setField(term8046, term8046.getClass(), "time", term8051);
        setField(term8021, term8021.getClass(), "lastLoginDate", term8046);
        setBooleanField(term8021, term8021.getClass(), "isWebJoin", false);
        setField(term8021, term8021.getClass(), "webLimitDate", "EdPAvpluZg");
        setIntField(term8021, term8021.getClass(), "level", 1496340209);
        setIntField(term8021, term8021.getClass(), "reincarnationNum", -1748391876);
        setField(term8021, term8021.getClass(), "exp", "DzHVBMqWtE");
        setLongField(term8021, term8021.getClass(), "point", -7115418542247301000L);
        setLongField(term8021, term8021.getClass(), "totalPoint", 8034714140377562739L);
        setIntField(term8021, term8021.getClass(), "playCount", 43258317);
        setIntField(term8021, term8021.getClass(), "multiPlayCount", 1707220033);
        setIntField(term8021, term8021.getClass(), "multiWinCount", -1792504217);
        setIntField(term8021, term8021.getClass(), "requestResCount", 1824538861);
        setIntField(term8021, term8021.getClass(), "acceptResCount", 499519708);
        setIntField(term8021, term8021.getClass(), "successResCount", 1501165033);
        setIntField(term8021, term8021.getClass(), "playerRating", 510162332);
        setIntField(term8021, term8021.getClass(), "highestRating", 888506903);
        setIntField(term8021, term8021.getClass(), "nameplateId", 200252898);
        setIntField(term8021, term8021.getClass(), "frameId", -1831826725);
        setIntField(term8021, term8021.getClass(), "characterId", 752152965);
        setIntField(term8021, term8021.getClass(), "trophyId", -1577069773);
        setIntField(term8021, term8021.getClass(), "playedTutorialBit", -266625190);
        setIntField(term8021, term8021.getClass(), "firstTutorialCancelNum", 489201218);
        setIntField(term8021, term8021.getClass(), "masterTutorialCancelNum", 464181937);
        setIntField(term8021, term8021.getClass(), "totalRepertoireCount", -1455526612);
        setIntField(term8021, term8021.getClass(), "totalMapNum", -941356098);
        setLongField(term8021, term8021.getClass(), "totalHiScore", -2924531382671518368L);
        setLongField(term8021, term8021.getClass(), "totalBasicHighScore", -3948863953565024517L);
        setLongField(term8021, term8021.getClass(), "totalAdvancedHighScore", -6587807377747738663L);
        setLongField(term8021, term8021.getClass(), "totalExpertHighScore", -6301101997917060727L);
        setLongField(term8021, term8021.getClass(), "totalMasterHighScore", 8166095254618543564L);
        setIntField(term8108, term8108.getClass(), "year", 2014);
        setShortField(term8108, term8108.getClass(), "month", (short) 8);
        setShortField(term8108, term8108.getClass(), "day", (short) 17);
        setField(term8107, term8107.getClass(), "date", term8108);
        setByteField(term8112, term8112.getClass(), "hour", (byte) 19);
        setByteField(term8112, term8112.getClass(), "minute", (byte) 32);
        setByteField(term8112, term8112.getClass(), "second", (byte) 5);
        setIntField(term8112, term8112.getClass(), "nano", 604713831);
        setField(term8107, term8107.getClass(), "time", term8112);
        setField(term8021, term8021.getClass(), "eventWatchedDate", term8107);
        setIntField(term8021, term8021.getClass(), "friendCount", -201517446);
        setBooleanField(term8021, term8021.getClass(), "isMaimai", false);
        setField(term8021, term8021.getClass(), "firstGameId", "THZSpzBRYP");
        setField(term8021, term8021.getClass(), "firstRomVersion", "ZfBIVGBQOE");
        setField(term8021, term8021.getClass(), "firstDataVersion", "QSrDQfEsTR");
        setIntField(term8156, term8156.getClass(), "year", 2021);
        setShortField(term8156, term8156.getClass(), "month", (short) 3);
        setShortField(term8156, term8156.getClass(), "day", (short) 13);
        setField(term8155, term8155.getClass(), "date", term8156);
        setByteField(term8160, term8160.getClass(), "hour", (byte) 6);
        setByteField(term8160, term8160.getClass(), "minute", (byte) 25);
        setByteField(term8160, term8160.getClass(), "second", (byte) 42);
        setIntField(term8160, term8160.getClass(), "nano", 282924199);
        setField(term8155, term8155.getClass(), "time", term8160);
        setField(term8021, term8021.getClass(), "firstPlayDate", term8155);
        setField(term8021, term8021.getClass(), "lastGameId", "PsqusYmejD");
        setField(term8021, term8021.getClass(), "lastRomVersion", "NTWMiBEaDF");
        setField(term8021, term8021.getClass(), "lastDataVersion", "SPBstwKFVr");
        setIntField(term8202, term8202.getClass(), "year", 2020);
        setShortField(term8202, term8202.getClass(), "month", (short) 10);
        setShortField(term8202, term8202.getClass(), "day", (short) 25);
        setField(term8201, term8201.getClass(), "date", term8202);
        setByteField(term8206, term8206.getClass(), "hour", (byte) 18);
        setByteField(term8206, term8206.getClass(), "minute", (byte) 22);
        setByteField(term8206, term8206.getClass(), "second", (byte) 30);
        setIntField(term8206, term8206.getClass(), "nano", 948592965);
        setField(term8201, term8201.getClass(), "time", term8206);
        setField(term8021, term8021.getClass(), "lastPlayDate", term8201);
        setIntField(term8021, term8021.getClass(), "lastPlaceId", -97742366);
        setField(term8021, term8021.getClass(), "lastPlaceName", "WxYUTuqmIq");
        setField(term8021, term8021.getClass(), "lastRegionId", "OeQLvhVERT");
        setField(term8021, term8021.getClass(), "lastRegionName", "IlvgFINwIa");
        setField(term8021, term8021.getClass(), "lastAllNetId", "GEJABPlHSI");
        setField(term8021, term8021.getClass(), "lastClientId", "aQFUvuaYxd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term8021, args);
    }

};


