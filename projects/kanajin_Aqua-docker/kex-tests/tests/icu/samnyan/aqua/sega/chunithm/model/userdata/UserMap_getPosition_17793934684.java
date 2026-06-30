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

public class UserMap_getPosition_17793934684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280136;

    public UserMap_getPosition_17793934684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term280142 = new Long(-3271370917942710167L);
        term280136 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term280138 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term280140 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term280156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280348 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term280136, term280136.getClass(), "id", 5783239372469450901L);
        setLongField(term280138, term280138.getClass(), "id", 4405936896727212172L);
        setLongField(term280140, term280140.getClass(), "id", 9201873154937989540L);
        setField(term280140, term280140.getClass(), "extId", term280142);
        setField(term280140, term280140.getClass(), "luid", "psEjMhzuKg");
        setIntField(term280157, term280157.getClass(), "year", 2011);
        setShortField(term280157, term280157.getClass(), "month", (short) 7);
        setShortField(term280157, term280157.getClass(), "day", (short) 25);
        setField(term280156, term280156.getClass(), "date", term280157);
        setByteField(term280161, term280161.getClass(), "hour", (byte) 11);
        setByteField(term280161, term280161.getClass(), "minute", (byte) 26);
        setByteField(term280161, term280161.getClass(), "second", (byte) 12);
        setIntField(term280161, term280161.getClass(), "nano", 500638100);
        setField(term280156, term280156.getClass(), "time", term280161);
        setField(term280140, term280140.getClass(), "registerTime", term280156);
        setIntField(term280167, term280167.getClass(), "year", 2013);
        setShortField(term280167, term280167.getClass(), "month", (short) 11);
        setShortField(term280167, term280167.getClass(), "day", (short) 4);
        setField(term280166, term280166.getClass(), "date", term280167);
        setByteField(term280171, term280171.getClass(), "hour", (byte) 19);
        setByteField(term280171, term280171.getClass(), "minute", (byte) 10);
        setByteField(term280171, term280171.getClass(), "second", (byte) 9);
        setIntField(term280171, term280171.getClass(), "nano", 962929638);
        setField(term280166, term280166.getClass(), "time", term280171);
        setField(term280140, term280140.getClass(), "accessTime", term280166);
        setField(term280138, term280138.getClass(), "card", term280140);
        setField(term280138, term280138.getClass(), "userName", "gPwMKIBKVa");
        setIntField(term280189, term280189.getClass(), "year", 2019);
        setShortField(term280189, term280189.getClass(), "month", (short) 6);
        setShortField(term280189, term280189.getClass(), "day", (short) 25);
        setField(term280188, term280188.getClass(), "date", term280189);
        setByteField(term280193, term280193.getClass(), "hour", (byte) 22);
        setByteField(term280193, term280193.getClass(), "minute", (byte) 46);
        setByteField(term280193, term280193.getClass(), "second", (byte) 41);
        setIntField(term280193, term280193.getClass(), "nano", 5540665);
        setField(term280188, term280188.getClass(), "time", term280193);
        setField(term280138, term280138.getClass(), "lastLoginDate", term280188);
        setBooleanField(term280138, term280138.getClass(), "isWebJoin", true);
        setField(term280138, term280138.getClass(), "webLimitDate", "KPgCBUCwkT");
        setIntField(term280138, term280138.getClass(), "level", -77095792);
        setIntField(term280138, term280138.getClass(), "reincarnationNum", -2079226958);
        setField(term280138, term280138.getClass(), "exp", "oIuYGsJcJK");
        setLongField(term280138, term280138.getClass(), "point", 588322502759368578L);
        setLongField(term280138, term280138.getClass(), "totalPoint", -2020614193907843026L);
        setIntField(term280138, term280138.getClass(), "playCount", -386074);
        setIntField(term280138, term280138.getClass(), "multiPlayCount", 1447028198);
        setIntField(term280138, term280138.getClass(), "multiWinCount", -1208205597);
        setIntField(term280138, term280138.getClass(), "requestResCount", 2055857288);
        setIntField(term280138, term280138.getClass(), "acceptResCount", 1498740255);
        setIntField(term280138, term280138.getClass(), "successResCount", 904155166);
        setIntField(term280138, term280138.getClass(), "playerRating", 72629006);
        setIntField(term280138, term280138.getClass(), "highestRating", -1282766194);
        setIntField(term280138, term280138.getClass(), "nameplateId", -1288900838);
        setIntField(term280138, term280138.getClass(), "frameId", -1470172938);
        setIntField(term280138, term280138.getClass(), "characterId", -1939603541);
        setIntField(term280138, term280138.getClass(), "trophyId", -274428693);
        setIntField(term280138, term280138.getClass(), "playedTutorialBit", -185933400);
        setIntField(term280138, term280138.getClass(), "firstTutorialCancelNum", 1459704689);
        setIntField(term280138, term280138.getClass(), "masterTutorialCancelNum", -1941241597);
        setIntField(term280138, term280138.getClass(), "totalRepertoireCount", 212571436);
        setIntField(term280138, term280138.getClass(), "totalMapNum", 1303246137);
        setLongField(term280138, term280138.getClass(), "totalHiScore", -8155160977336571516L);
        setLongField(term280138, term280138.getClass(), "totalBasicHighScore", 424102814393853162L);
        setLongField(term280138, term280138.getClass(), "totalAdvancedHighScore", -5437497412119566438L);
        setLongField(term280138, term280138.getClass(), "totalExpertHighScore", -4765892116338577977L);
        setLongField(term280138, term280138.getClass(), "totalMasterHighScore", 5181335103536619869L);
        setIntField(term280250, term280250.getClass(), "year", 2026);
        setShortField(term280250, term280250.getClass(), "month", (short) 6);
        setShortField(term280250, term280250.getClass(), "day", (short) 25);
        setField(term280249, term280249.getClass(), "date", term280250);
        setByteField(term280254, term280254.getClass(), "hour", (byte) 20);
        setByteField(term280254, term280254.getClass(), "minute", (byte) 51);
        setByteField(term280254, term280254.getClass(), "second", (byte) 42);
        setIntField(term280254, term280254.getClass(), "nano", 574434371);
        setField(term280249, term280249.getClass(), "time", term280254);
        setField(term280138, term280138.getClass(), "eventWatchedDate", term280249);
        setIntField(term280138, term280138.getClass(), "friendCount", -1675951461);
        setBooleanField(term280138, term280138.getClass(), "isMaimai", true);
        setField(term280138, term280138.getClass(), "firstGameId", "zekWayuKWe");
        setField(term280138, term280138.getClass(), "firstRomVersion", "ECrlgCZHjb");
        setField(term280138, term280138.getClass(), "firstDataVersion", "xYtFJCbsbO");
        setIntField(term280298, term280298.getClass(), "year", 2026);
        setShortField(term280298, term280298.getClass(), "month", (short) 4);
        setShortField(term280298, term280298.getClass(), "day", (short) 3);
        setField(term280297, term280297.getClass(), "date", term280298);
        setByteField(term280302, term280302.getClass(), "hour", (byte) 7);
        setByteField(term280302, term280302.getClass(), "minute", (byte) 8);
        setByteField(term280302, term280302.getClass(), "second", (byte) 27);
        setIntField(term280302, term280302.getClass(), "nano", 751315631);
        setField(term280297, term280297.getClass(), "time", term280302);
        setField(term280138, term280138.getClass(), "firstPlayDate", term280297);
        setField(term280138, term280138.getClass(), "lastGameId", "ZPCvymeQVU");
        setField(term280138, term280138.getClass(), "lastRomVersion", "sLCvnzKIFo");
        setField(term280138, term280138.getClass(), "lastDataVersion", "goGIsaCumE");
        setIntField(term280344, term280344.getClass(), "year", 2014);
        setShortField(term280344, term280344.getClass(), "month", (short) 6);
        setShortField(term280344, term280344.getClass(), "day", (short) 21);
        setField(term280343, term280343.getClass(), "date", term280344);
        setByteField(term280348, term280348.getClass(), "hour", (byte) 10);
        setByteField(term280348, term280348.getClass(), "minute", (byte) 38);
        setByteField(term280348, term280348.getClass(), "second", (byte) 28);
        setIntField(term280348, term280348.getClass(), "nano", 775184399);
        setField(term280343, term280343.getClass(), "time", term280348);
        setField(term280138, term280138.getClass(), "lastPlayDate", term280343);
        setIntField(term280138, term280138.getClass(), "lastPlaceId", 1619278331);
        setField(term280138, term280138.getClass(), "lastPlaceName", "GiVMlvuShR");
        setField(term280138, term280138.getClass(), "lastRegionId", "ZPGcWKWutp");
        setField(term280138, term280138.getClass(), "lastRegionName", "gFgcyNetpo");
        setField(term280138, term280138.getClass(), "lastAllNetId", "hHOpAcIbrX");
        setField(term280138, term280138.getClass(), "lastClientId", "tTVkENlDIG");
        setField(term280136, term280136.getClass(), "user", term280138);
        setIntField(term280136, term280136.getClass(), "mapId", -2007394216);
        setIntField(term280136, term280136.getClass(), "position", -491166885);
        setBooleanField(term280136, term280136.getClass(), "isClear", false);
        setIntField(term280136, term280136.getClass(), "areaId", -186959175);
        setIntField(term280136, term280136.getClass(), "routeNumber", 1008949037);
        setIntField(term280136, term280136.getClass(), "eventId", 172789057);
        setIntField(term280136, term280136.getClass(), "rate", 1874497920);
        setIntField(term280136, term280136.getClass(), "statusCount", -218105407);
        setBooleanField(term280136, term280136.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term280136, args);
    }

};


