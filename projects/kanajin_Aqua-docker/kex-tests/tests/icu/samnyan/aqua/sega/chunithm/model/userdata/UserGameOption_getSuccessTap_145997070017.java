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

public class UserGameOption_getSuccessTap_145997070017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56371;

    public UserGameOption_getSuccessTap_145997070017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56377 = new Long(2135754395358000892L);
        term56371 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term56373 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term56375 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56428 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56583 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56371, term56371.getClass(), "id", 5063961949952053841L);
        setLongField(term56373, term56373.getClass(), "id", 5946931662340995277L);
        setLongField(term56375, term56375.getClass(), "id", -519044061680044865L);
        setField(term56375, term56375.getClass(), "extId", term56377);
        setField(term56375, term56375.getClass(), "luid", "RSuRSjiLvm");
        setIntField(term56392, term56392.getClass(), "year", 2020);
        setShortField(term56392, term56392.getClass(), "month", (short) 8);
        setShortField(term56392, term56392.getClass(), "day", (short) 9);
        setField(term56391, term56391.getClass(), "date", term56392);
        setByteField(term56396, term56396.getClass(), "hour", (byte) 2);
        setByteField(term56396, term56396.getClass(), "minute", (byte) 25);
        setByteField(term56396, term56396.getClass(), "second", (byte) 38);
        setIntField(term56396, term56396.getClass(), "nano", 447739818);
        setField(term56391, term56391.getClass(), "time", term56396);
        setField(term56375, term56375.getClass(), "registerTime", term56391);
        setIntField(term56402, term56402.getClass(), "year", 2026);
        setShortField(term56402, term56402.getClass(), "month", (short) 2);
        setShortField(term56402, term56402.getClass(), "day", (short) 28);
        setField(term56401, term56401.getClass(), "date", term56402);
        setByteField(term56406, term56406.getClass(), "hour", (byte) 19);
        setByteField(term56406, term56406.getClass(), "minute", (byte) 20);
        setByteField(term56406, term56406.getClass(), "second", (byte) 45);
        setIntField(term56406, term56406.getClass(), "nano", 843222042);
        setField(term56401, term56401.getClass(), "time", term56406);
        setField(term56375, term56375.getClass(), "accessTime", term56401);
        setField(term56373, term56373.getClass(), "card", term56375);
        setField(term56373, term56373.getClass(), "userName", "aoeNWgMpNx");
        setIntField(term56424, term56424.getClass(), "year", 2012);
        setShortField(term56424, term56424.getClass(), "month", (short) 2);
        setShortField(term56424, term56424.getClass(), "day", (short) 24);
        setField(term56423, term56423.getClass(), "date", term56424);
        setByteField(term56428, term56428.getClass(), "hour", (byte) 7);
        setByteField(term56428, term56428.getClass(), "minute", (byte) 19);
        setByteField(term56428, term56428.getClass(), "second", (byte) 47);
        setIntField(term56428, term56428.getClass(), "nano", 173778376);
        setField(term56423, term56423.getClass(), "time", term56428);
        setField(term56373, term56373.getClass(), "lastLoginDate", term56423);
        setBooleanField(term56373, term56373.getClass(), "isWebJoin", false);
        setField(term56373, term56373.getClass(), "webLimitDate", "RQvXfSweVs");
        setIntField(term56373, term56373.getClass(), "level", 578623316);
        setIntField(term56373, term56373.getClass(), "reincarnationNum", -676216760);
        setField(term56373, term56373.getClass(), "exp", "jGxArBjtep");
        setLongField(term56373, term56373.getClass(), "point", -5615015000728170842L);
        setLongField(term56373, term56373.getClass(), "totalPoint", -8165230786269861125L);
        setIntField(term56373, term56373.getClass(), "playCount", 1859109121);
        setIntField(term56373, term56373.getClass(), "multiPlayCount", 1727853532);
        setIntField(term56373, term56373.getClass(), "multiWinCount", -54706718);
        setIntField(term56373, term56373.getClass(), "requestResCount", 461863345);
        setIntField(term56373, term56373.getClass(), "acceptResCount", 733174414);
        setIntField(term56373, term56373.getClass(), "successResCount", -1055100686);
        setIntField(term56373, term56373.getClass(), "playerRating", 1994661826);
        setIntField(term56373, term56373.getClass(), "highestRating", -2050574403);
        setIntField(term56373, term56373.getClass(), "nameplateId", 1891840747);
        setIntField(term56373, term56373.getClass(), "frameId", -118389472);
        setIntField(term56373, term56373.getClass(), "characterId", -706486666);
        setIntField(term56373, term56373.getClass(), "trophyId", 1426550776);
        setIntField(term56373, term56373.getClass(), "playedTutorialBit", 1793694701);
        setIntField(term56373, term56373.getClass(), "firstTutorialCancelNum", 1334634518);
        setIntField(term56373, term56373.getClass(), "masterTutorialCancelNum", -1358832342);
        setIntField(term56373, term56373.getClass(), "totalRepertoireCount", 330525017);
        setIntField(term56373, term56373.getClass(), "totalMapNum", -2097182938);
        setLongField(term56373, term56373.getClass(), "totalHiScore", 7818214521807331044L);
        setLongField(term56373, term56373.getClass(), "totalBasicHighScore", 7027549200302660557L);
        setLongField(term56373, term56373.getClass(), "totalAdvancedHighScore", -4623233001658453008L);
        setLongField(term56373, term56373.getClass(), "totalExpertHighScore", -2816485221625714088L);
        setLongField(term56373, term56373.getClass(), "totalMasterHighScore", 2920715047797197542L);
        setIntField(term56485, term56485.getClass(), "year", 2029);
        setShortField(term56485, term56485.getClass(), "month", (short) 3);
        setShortField(term56485, term56485.getClass(), "day", (short) 28);
        setField(term56484, term56484.getClass(), "date", term56485);
        setByteField(term56489, term56489.getClass(), "hour", (byte) 6);
        setByteField(term56489, term56489.getClass(), "minute", (byte) 43);
        setByteField(term56489, term56489.getClass(), "second", (byte) 8);
        setIntField(term56489, term56489.getClass(), "nano", 873338827);
        setField(term56484, term56484.getClass(), "time", term56489);
        setField(term56373, term56373.getClass(), "eventWatchedDate", term56484);
        setIntField(term56373, term56373.getClass(), "friendCount", -1911268197);
        setBooleanField(term56373, term56373.getClass(), "isMaimai", true);
        setField(term56373, term56373.getClass(), "firstGameId", "dUXsPNSUez");
        setField(term56373, term56373.getClass(), "firstRomVersion", "PxGDfPOAFS");
        setField(term56373, term56373.getClass(), "firstDataVersion", "dZVxzYEeZe");
        setIntField(term56533, term56533.getClass(), "year", 2023);
        setShortField(term56533, term56533.getClass(), "month", (short) 12);
        setShortField(term56533, term56533.getClass(), "day", (short) 5);
        setField(term56532, term56532.getClass(), "date", term56533);
        setByteField(term56537, term56537.getClass(), "hour", (byte) 4);
        setByteField(term56537, term56537.getClass(), "minute", (byte) 10);
        setByteField(term56537, term56537.getClass(), "second", (byte) 41);
        setIntField(term56537, term56537.getClass(), "nano", 40865943);
        setField(term56532, term56532.getClass(), "time", term56537);
        setField(term56373, term56373.getClass(), "firstPlayDate", term56532);
        setField(term56373, term56373.getClass(), "lastGameId", "TnCQRmzwPf");
        setField(term56373, term56373.getClass(), "lastRomVersion", "ZGnUKGTWCn");
        setField(term56373, term56373.getClass(), "lastDataVersion", "cHRLXsgRzr");
        setIntField(term56579, term56579.getClass(), "year", 2027);
        setShortField(term56579, term56579.getClass(), "month", (short) 10);
        setShortField(term56579, term56579.getClass(), "day", (short) 18);
        setField(term56578, term56578.getClass(), "date", term56579);
        setByteField(term56583, term56583.getClass(), "hour", (byte) 16);
        setByteField(term56583, term56583.getClass(), "minute", (byte) 8);
        setByteField(term56583, term56583.getClass(), "second", (byte) 28);
        setIntField(term56583, term56583.getClass(), "nano", 268951041);
        setField(term56578, term56578.getClass(), "time", term56583);
        setField(term56373, term56373.getClass(), "lastPlayDate", term56578);
        setIntField(term56373, term56373.getClass(), "lastPlaceId", 1989699628);
        setField(term56373, term56373.getClass(), "lastPlaceName", "QpqQKmCtoC");
        setField(term56373, term56373.getClass(), "lastRegionId", "AYRvbRJxWI");
        setField(term56373, term56373.getClass(), "lastRegionName", "MGNiaVqEDc");
        setField(term56373, term56373.getClass(), "lastAllNetId", "qeVNCFrTbT");
        setField(term56373, term56373.getClass(), "lastClientId", "sreEtRBWQl");
        setField(term56371, term56371.getClass(), "user", term56373);
        setIntField(term56371, term56371.getClass(), "bgInfo", 1406976166);
        setIntField(term56371, term56371.getClass(), "fieldColor", -683361157);
        setIntField(term56371, term56371.getClass(), "guideSound", 1735058829);
        setIntField(term56371, term56371.getClass(), "soundEffect", -1945706596);
        setIntField(term56371, term56371.getClass(), "guideLine", 13487895);
        setIntField(term56371, term56371.getClass(), "speed", 369911284);
        setIntField(term56371, term56371.getClass(), "optionSet", 1488504614);
        setIntField(term56371, term56371.getClass(), "matching", 661477727);
        setIntField(term56371, term56371.getClass(), "judgePos", 274618169);
        setIntField(term56371, term56371.getClass(), "rating", -1618606893);
        setIntField(term56371, term56371.getClass(), "judgeJustice", -560211840);
        setIntField(term56371, term56371.getClass(), "judgeAttack", 103542361);
        setIntField(term56371, term56371.getClass(), "headphone", -1737221099);
        setIntField(term56371, term56371.getClass(), "playerLevel", -1032313881);
        setIntField(term56371, term56371.getClass(), "successTap", 1246554458);
        setIntField(term56371, term56371.getClass(), "successExTap", -1913837862);
        setIntField(term56371, term56371.getClass(), "successSlideHold", -1428994415);
        setIntField(term56371, term56371.getClass(), "successAir", -1086104799);
        setIntField(term56371, term56371.getClass(), "successFlick", 1670332444);
        setIntField(term56371, term56371.getClass(), "successSkill", -1903805864);
        setIntField(term56371, term56371.getClass(), "successTapTimbre", 751123733);
        setIntField(term56371, term56371.getClass(), "privacy", -2099677081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessTap", argTypes, term56371, args);
    }

};


