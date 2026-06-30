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

public class UserGameOption_setId_43541783925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59971;
     Object term60271;

    public UserGameOption_setId_43541783925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59977 = new Long(1368340889161782793L);
        term59971 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term59973 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term59975 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60084 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60085 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60089 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60183 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59971, term59971.getClass(), "id", -3926033211239834024L);
        setLongField(term59973, term59973.getClass(), "id", 7585284844822710343L);
        setLongField(term59975, term59975.getClass(), "id", 6803750423071360242L);
        setField(term59975, term59975.getClass(), "extId", term59977);
        setField(term59975, term59975.getClass(), "luid", "YcXTXuOFYV");
        setIntField(term59992, term59992.getClass(), "year", 2022);
        setShortField(term59992, term59992.getClass(), "month", (short) 4);
        setShortField(term59992, term59992.getClass(), "day", (short) 26);
        setField(term59991, term59991.getClass(), "date", term59992);
        setByteField(term59996, term59996.getClass(), "hour", (byte) 4);
        setByteField(term59996, term59996.getClass(), "minute", (byte) 26);
        setByteField(term59996, term59996.getClass(), "second", (byte) 22);
        setIntField(term59996, term59996.getClass(), "nano", 390695663);
        setField(term59991, term59991.getClass(), "time", term59996);
        setField(term59975, term59975.getClass(), "registerTime", term59991);
        setIntField(term60002, term60002.getClass(), "year", 2019);
        setShortField(term60002, term60002.getClass(), "month", (short) 10);
        setShortField(term60002, term60002.getClass(), "day", (short) 7);
        setField(term60001, term60001.getClass(), "date", term60002);
        setByteField(term60006, term60006.getClass(), "hour", (byte) 17);
        setByteField(term60006, term60006.getClass(), "minute", (byte) 16);
        setByteField(term60006, term60006.getClass(), "second", (byte) 55);
        setIntField(term60006, term60006.getClass(), "nano", 967207750);
        setField(term60001, term60001.getClass(), "time", term60006);
        setField(term59975, term59975.getClass(), "accessTime", term60001);
        setField(term59973, term59973.getClass(), "card", term59975);
        setField(term59973, term59973.getClass(), "userName", "HGhIlMCaKM");
        setIntField(term60024, term60024.getClass(), "year", 2012);
        setShortField(term60024, term60024.getClass(), "month", (short) 6);
        setShortField(term60024, term60024.getClass(), "day", (short) 22);
        setField(term60023, term60023.getClass(), "date", term60024);
        setByteField(term60028, term60028.getClass(), "hour", (byte) 2);
        setByteField(term60028, term60028.getClass(), "minute", (byte) 38);
        setByteField(term60028, term60028.getClass(), "second", (byte) 18);
        setIntField(term60028, term60028.getClass(), "nano", 496783713);
        setField(term60023, term60023.getClass(), "time", term60028);
        setField(term59973, term59973.getClass(), "lastLoginDate", term60023);
        setBooleanField(term59973, term59973.getClass(), "isWebJoin", false);
        setField(term59973, term59973.getClass(), "webLimitDate", "pPxivEPfHY");
        setIntField(term59973, term59973.getClass(), "level", 338598562);
        setIntField(term59973, term59973.getClass(), "reincarnationNum", 1528748257);
        setField(term59973, term59973.getClass(), "exp", "BiitfiJmRW");
        setLongField(term59973, term59973.getClass(), "point", -4234850307320476025L);
        setLongField(term59973, term59973.getClass(), "totalPoint", 4525524239494718372L);
        setIntField(term59973, term59973.getClass(), "playCount", 494744342);
        setIntField(term59973, term59973.getClass(), "multiPlayCount", -1662933444);
        setIntField(term59973, term59973.getClass(), "multiWinCount", 1648583497);
        setIntField(term59973, term59973.getClass(), "requestResCount", -132156499);
        setIntField(term59973, term59973.getClass(), "acceptResCount", -1222668512);
        setIntField(term59973, term59973.getClass(), "successResCount", 1109294828);
        setIntField(term59973, term59973.getClass(), "playerRating", -596850824);
        setIntField(term59973, term59973.getClass(), "highestRating", 1619317687);
        setIntField(term59973, term59973.getClass(), "nameplateId", -1335475299);
        setIntField(term59973, term59973.getClass(), "frameId", 1764067908);
        setIntField(term59973, term59973.getClass(), "characterId", 1906236006);
        setIntField(term59973, term59973.getClass(), "trophyId", -279175941);
        setIntField(term59973, term59973.getClass(), "playedTutorialBit", -574044161);
        setIntField(term59973, term59973.getClass(), "firstTutorialCancelNum", -101199395);
        setIntField(term59973, term59973.getClass(), "masterTutorialCancelNum", 894150826);
        setIntField(term59973, term59973.getClass(), "totalRepertoireCount", -261894603);
        setIntField(term59973, term59973.getClass(), "totalMapNum", 1163902450);
        setLongField(term59973, term59973.getClass(), "totalHiScore", 5204341701727130016L);
        setLongField(term59973, term59973.getClass(), "totalBasicHighScore", -5167573302796126161L);
        setLongField(term59973, term59973.getClass(), "totalAdvancedHighScore", 199834233798511747L);
        setLongField(term59973, term59973.getClass(), "totalExpertHighScore", 3151699339436192337L);
        setLongField(term59973, term59973.getClass(), "totalMasterHighScore", 8601797948269882230L);
        setIntField(term60085, term60085.getClass(), "year", 2024);
        setShortField(term60085, term60085.getClass(), "month", (short) 11);
        setShortField(term60085, term60085.getClass(), "day", (short) 23);
        setField(term60084, term60084.getClass(), "date", term60085);
        setByteField(term60089, term60089.getClass(), "hour", (byte) 12);
        setByteField(term60089, term60089.getClass(), "minute", (byte) 39);
        setByteField(term60089, term60089.getClass(), "second", (byte) 16);
        setIntField(term60089, term60089.getClass(), "nano", 452723100);
        setField(term60084, term60084.getClass(), "time", term60089);
        setField(term59973, term59973.getClass(), "eventWatchedDate", term60084);
        setIntField(term59973, term59973.getClass(), "friendCount", 548941697);
        setBooleanField(term59973, term59973.getClass(), "isMaimai", true);
        setField(term59973, term59973.getClass(), "firstGameId", "ILHarzuGbn");
        setField(term59973, term59973.getClass(), "firstRomVersion", "uNGHHAwCFL");
        setField(term59973, term59973.getClass(), "firstDataVersion", "fbshyuUfqy");
        setIntField(term60133, term60133.getClass(), "year", 2019);
        setShortField(term60133, term60133.getClass(), "month", (short) 12);
        setShortField(term60133, term60133.getClass(), "day", (short) 8);
        setField(term60132, term60132.getClass(), "date", term60133);
        setByteField(term60137, term60137.getClass(), "hour", (byte) 20);
        setByteField(term60137, term60137.getClass(), "minute", (byte) 33);
        setByteField(term60137, term60137.getClass(), "second", (byte) 47);
        setIntField(term60137, term60137.getClass(), "nano", 329455724);
        setField(term60132, term60132.getClass(), "time", term60137);
        setField(term59973, term59973.getClass(), "firstPlayDate", term60132);
        setField(term59973, term59973.getClass(), "lastGameId", "eupNcihLEw");
        setField(term59973, term59973.getClass(), "lastRomVersion", "iFFcolxwcm");
        setField(term59973, term59973.getClass(), "lastDataVersion", "bAsZBSqnyM");
        setIntField(term60179, term60179.getClass(), "year", 2023);
        setShortField(term60179, term60179.getClass(), "month", (short) 9);
        setShortField(term60179, term60179.getClass(), "day", (short) 17);
        setField(term60178, term60178.getClass(), "date", term60179);
        setByteField(term60183, term60183.getClass(), "hour", (byte) 16);
        setByteField(term60183, term60183.getClass(), "minute", (byte) 1);
        setByteField(term60183, term60183.getClass(), "second", (byte) 2);
        setIntField(term60183, term60183.getClass(), "nano", 296390053);
        setField(term60178, term60178.getClass(), "time", term60183);
        setField(term59973, term59973.getClass(), "lastPlayDate", term60178);
        setIntField(term59973, term59973.getClass(), "lastPlaceId", 647865140);
        setField(term59973, term59973.getClass(), "lastPlaceName", "urrmpQzmTU");
        setField(term59973, term59973.getClass(), "lastRegionId", "GWoZyTTlNx");
        setField(term59973, term59973.getClass(), "lastRegionName", "ntUYcalSmz");
        setField(term59973, term59973.getClass(), "lastAllNetId", "lnZXLpyQoO");
        setField(term59973, term59973.getClass(), "lastClientId", "lOIEIGbwPj");
        setField(term59971, term59971.getClass(), "user", term59973);
        setIntField(term59971, term59971.getClass(), "bgInfo", 552764103);
        setIntField(term59971, term59971.getClass(), "fieldColor", -913811608);
        setIntField(term59971, term59971.getClass(), "guideSound", 895728550);
        setIntField(term59971, term59971.getClass(), "soundEffect", -419871359);
        setIntField(term59971, term59971.getClass(), "guideLine", 812478175);
        setIntField(term59971, term59971.getClass(), "speed", -133199375);
        setIntField(term59971, term59971.getClass(), "optionSet", -356245449);
        setIntField(term59971, term59971.getClass(), "matching", -1305056502);
        setIntField(term59971, term59971.getClass(), "judgePos", 1382545880);
        setIntField(term59971, term59971.getClass(), "rating", -1299406001);
        setIntField(term59971, term59971.getClass(), "judgeJustice", -1360145510);
        setIntField(term59971, term59971.getClass(), "judgeAttack", -1122695171);
        setIntField(term59971, term59971.getClass(), "headphone", -1304945951);
        setIntField(term59971, term59971.getClass(), "playerLevel", 1324880713);
        setIntField(term59971, term59971.getClass(), "successTap", -331841554);
        setIntField(term59971, term59971.getClass(), "successExTap", 913848623);
        setIntField(term59971, term59971.getClass(), "successSlideHold", 1449221084);
        setIntField(term59971, term59971.getClass(), "successAir", -217809217);
        setIntField(term59971, term59971.getClass(), "successFlick", -473949548);
        setIntField(term59971, term59971.getClass(), "successSkill", 1898831696);
        setIntField(term59971, term59971.getClass(), "successTapTimbre", 1811064455);
        setIntField(term59971, term59971.getClass(), "privacy", 1183674366);
        term60271 = new Long(-7129626484175473918L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term60271;
        callMethod(klass, "setId", argTypes, term59971, args);
    }

};


