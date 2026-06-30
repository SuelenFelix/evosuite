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

public class UserCharacter_setParam2_61152955522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118092;
     Object term118379;

    public UserCharacter_setParam2_61152955522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118098 = new Long(329213208496958131L);
        term118092 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term118094 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term118096 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118117 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118258 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118304 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118092, term118092.getClass(), "id", 1860828043112015415L);
        setLongField(term118094, term118094.getClass(), "id", -5221172945585313119L);
        setLongField(term118096, term118096.getClass(), "id", -4331547344847792516L);
        setField(term118096, term118096.getClass(), "extId", term118098);
        setField(term118096, term118096.getClass(), "luid", "EYQnrjiZfX");
        setIntField(term118113, term118113.getClass(), "year", 2011);
        setShortField(term118113, term118113.getClass(), "month", (short) 8);
        setShortField(term118113, term118113.getClass(), "day", (short) 11);
        setField(term118112, term118112.getClass(), "date", term118113);
        setByteField(term118117, term118117.getClass(), "hour", (byte) 2);
        setByteField(term118117, term118117.getClass(), "minute", (byte) 28);
        setByteField(term118117, term118117.getClass(), "second", (byte) 16);
        setIntField(term118117, term118117.getClass(), "nano", 938751053);
        setField(term118112, term118112.getClass(), "time", term118117);
        setField(term118096, term118096.getClass(), "registerTime", term118112);
        setIntField(term118123, term118123.getClass(), "year", 2029);
        setShortField(term118123, term118123.getClass(), "month", (short) 8);
        setShortField(term118123, term118123.getClass(), "day", (short) 14);
        setField(term118122, term118122.getClass(), "date", term118123);
        setByteField(term118127, term118127.getClass(), "hour", (byte) 18);
        setByteField(term118127, term118127.getClass(), "minute", (byte) 55);
        setByteField(term118127, term118127.getClass(), "second", (byte) 35);
        setIntField(term118127, term118127.getClass(), "nano", 39373191);
        setField(term118122, term118122.getClass(), "time", term118127);
        setField(term118096, term118096.getClass(), "accessTime", term118122);
        setField(term118094, term118094.getClass(), "card", term118096);
        setField(term118094, term118094.getClass(), "userName", "xydFPTvtMs");
        setIntField(term118145, term118145.getClass(), "year", 2020);
        setShortField(term118145, term118145.getClass(), "month", (short) 3);
        setShortField(term118145, term118145.getClass(), "day", (short) 23);
        setField(term118144, term118144.getClass(), "date", term118145);
        setByteField(term118149, term118149.getClass(), "hour", (byte) 7);
        setByteField(term118149, term118149.getClass(), "minute", (byte) 1);
        setByteField(term118149, term118149.getClass(), "second", (byte) 48);
        setIntField(term118149, term118149.getClass(), "nano", 823771548);
        setField(term118144, term118144.getClass(), "time", term118149);
        setField(term118094, term118094.getClass(), "lastLoginDate", term118144);
        setBooleanField(term118094, term118094.getClass(), "isWebJoin", false);
        setField(term118094, term118094.getClass(), "webLimitDate", "lopARHjeMT");
        setIntField(term118094, term118094.getClass(), "level", 55918608);
        setIntField(term118094, term118094.getClass(), "reincarnationNum", 1863053491);
        setField(term118094, term118094.getClass(), "exp", "wizysRLgRr");
        setLongField(term118094, term118094.getClass(), "point", -677383924825139585L);
        setLongField(term118094, term118094.getClass(), "totalPoint", 3676304089995045597L);
        setIntField(term118094, term118094.getClass(), "playCount", 1569101532);
        setIntField(term118094, term118094.getClass(), "multiPlayCount", -1825428555);
        setIntField(term118094, term118094.getClass(), "multiWinCount", 2124679916);
        setIntField(term118094, term118094.getClass(), "requestResCount", -1587529994);
        setIntField(term118094, term118094.getClass(), "acceptResCount", -214529845);
        setIntField(term118094, term118094.getClass(), "successResCount", 684495339);
        setIntField(term118094, term118094.getClass(), "playerRating", 361364617);
        setIntField(term118094, term118094.getClass(), "highestRating", -132332846);
        setIntField(term118094, term118094.getClass(), "nameplateId", -160055040);
        setIntField(term118094, term118094.getClass(), "frameId", 7043168);
        setIntField(term118094, term118094.getClass(), "characterId", 2007440099);
        setIntField(term118094, term118094.getClass(), "trophyId", 1462309526);
        setIntField(term118094, term118094.getClass(), "playedTutorialBit", -451407895);
        setIntField(term118094, term118094.getClass(), "firstTutorialCancelNum", -1132970218);
        setIntField(term118094, term118094.getClass(), "masterTutorialCancelNum", -693000999);
        setIntField(term118094, term118094.getClass(), "totalRepertoireCount", -518970778);
        setIntField(term118094, term118094.getClass(), "totalMapNum", -534810305);
        setLongField(term118094, term118094.getClass(), "totalHiScore", 9176995849424666996L);
        setLongField(term118094, term118094.getClass(), "totalBasicHighScore", -3212680229932754821L);
        setLongField(term118094, term118094.getClass(), "totalAdvancedHighScore", -8974514191774285441L);
        setLongField(term118094, term118094.getClass(), "totalExpertHighScore", -4546853968080919834L);
        setLongField(term118094, term118094.getClass(), "totalMasterHighScore", 1281872419462997592L);
        setIntField(term118206, term118206.getClass(), "year", 2020);
        setShortField(term118206, term118206.getClass(), "month", (short) 7);
        setShortField(term118206, term118206.getClass(), "day", (short) 2);
        setField(term118205, term118205.getClass(), "date", term118206);
        setByteField(term118210, term118210.getClass(), "hour", (byte) 22);
        setByteField(term118210, term118210.getClass(), "minute", (byte) 29);
        setByteField(term118210, term118210.getClass(), "second", (byte) 2);
        setIntField(term118210, term118210.getClass(), "nano", 739683212);
        setField(term118205, term118205.getClass(), "time", term118210);
        setField(term118094, term118094.getClass(), "eventWatchedDate", term118205);
        setIntField(term118094, term118094.getClass(), "friendCount", 1052129031);
        setBooleanField(term118094, term118094.getClass(), "isMaimai", false);
        setField(term118094, term118094.getClass(), "firstGameId", "VbDDltcmiT");
        setField(term118094, term118094.getClass(), "firstRomVersion", "VWIEojCQCj");
        setField(term118094, term118094.getClass(), "firstDataVersion", "jbeRMWjQTQ");
        setIntField(term118254, term118254.getClass(), "year", 2015);
        setShortField(term118254, term118254.getClass(), "month", (short) 5);
        setShortField(term118254, term118254.getClass(), "day", (short) 22);
        setField(term118253, term118253.getClass(), "date", term118254);
        setByteField(term118258, term118258.getClass(), "hour", (byte) 0);
        setByteField(term118258, term118258.getClass(), "minute", (byte) 45);
        setByteField(term118258, term118258.getClass(), "second", (byte) 59);
        setIntField(term118258, term118258.getClass(), "nano", 902042652);
        setField(term118253, term118253.getClass(), "time", term118258);
        setField(term118094, term118094.getClass(), "firstPlayDate", term118253);
        setField(term118094, term118094.getClass(), "lastGameId", "YOjmohMpFb");
        setField(term118094, term118094.getClass(), "lastRomVersion", "WCRWOgfbRC");
        setField(term118094, term118094.getClass(), "lastDataVersion", "MeiYkUfwEV");
        setIntField(term118300, term118300.getClass(), "year", 2026);
        setShortField(term118300, term118300.getClass(), "month", (short) 10);
        setShortField(term118300, term118300.getClass(), "day", (short) 4);
        setField(term118299, term118299.getClass(), "date", term118300);
        setByteField(term118304, term118304.getClass(), "hour", (byte) 23);
        setByteField(term118304, term118304.getClass(), "minute", (byte) 57);
        setByteField(term118304, term118304.getClass(), "second", (byte) 14);
        setIntField(term118304, term118304.getClass(), "nano", 415970419);
        setField(term118299, term118299.getClass(), "time", term118304);
        setField(term118094, term118094.getClass(), "lastPlayDate", term118299);
        setIntField(term118094, term118094.getClass(), "lastPlaceId", -107440624);
        setField(term118094, term118094.getClass(), "lastPlaceName", "YOelMtNboh");
        setField(term118094, term118094.getClass(), "lastRegionId", "ngShbLrxUt");
        setField(term118094, term118094.getClass(), "lastRegionName", "tyyoVDzJBp");
        setField(term118094, term118094.getClass(), "lastAllNetId", "tbFDmscmBa");
        setField(term118094, term118094.getClass(), "lastClientId", "iwNiuIUhrn");
        setField(term118092, term118092.getClass(), "user", term118094);
        setIntField(term118092, term118092.getClass(), "characterId", 1835428942);
        setIntField(term118092, term118092.getClass(), "playCount", -1551168372);
        setIntField(term118092, term118092.getClass(), "level", 1);
        setIntField(term118092, term118092.getClass(), "skillId", 395080281);
        setIntField(term118092, term118092.getClass(), "friendshipExp", -135265001);
        setBooleanField(term118092, term118092.getClass(), "isValid", true);
        setBooleanField(term118092, term118092.getClass(), "isNewMark", true);
        setIntField(term118092, term118092.getClass(), "param1", -1280813670);
        setIntField(term118092, term118092.getClass(), "param2", 1056389612);
        term118379 = new Integer(1126163407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term118379;
        callMethod(klass, "setParam2", argTypes, term118092, args);
    }

};


