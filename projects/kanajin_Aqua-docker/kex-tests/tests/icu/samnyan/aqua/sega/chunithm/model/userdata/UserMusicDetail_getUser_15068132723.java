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

public class UserMusicDetail_getUser_15068132723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88987;

    public UserMusicDetail_getUser_15068132723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88993 = new Long(5219030281405653303L);
        term88987 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term88989 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term88991 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89105 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89199 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88987, term88987.getClass(), "id", 828765974823196503L);
        setLongField(term88989, term88989.getClass(), "id", 2517346858311378765L);
        setLongField(term88991, term88991.getClass(), "id", 8227165037887933407L);
        setField(term88991, term88991.getClass(), "extId", term88993);
        setField(term88991, term88991.getClass(), "luid", "PadBNsKGSM");
        setIntField(term89008, term89008.getClass(), "year", 2010);
        setShortField(term89008, term89008.getClass(), "month", (short) 11);
        setShortField(term89008, term89008.getClass(), "day", (short) 25);
        setField(term89007, term89007.getClass(), "date", term89008);
        setByteField(term89012, term89012.getClass(), "hour", (byte) 5);
        setByteField(term89012, term89012.getClass(), "minute", (byte) 46);
        setByteField(term89012, term89012.getClass(), "second", (byte) 1);
        setIntField(term89012, term89012.getClass(), "nano", 136465643);
        setField(term89007, term89007.getClass(), "time", term89012);
        setField(term88991, term88991.getClass(), "registerTime", term89007);
        setIntField(term89018, term89018.getClass(), "year", 2018);
        setShortField(term89018, term89018.getClass(), "month", (short) 12);
        setShortField(term89018, term89018.getClass(), "day", (short) 3);
        setField(term89017, term89017.getClass(), "date", term89018);
        setByteField(term89022, term89022.getClass(), "hour", (byte) 10);
        setByteField(term89022, term89022.getClass(), "minute", (byte) 38);
        setByteField(term89022, term89022.getClass(), "second", (byte) 13);
        setIntField(term89022, term89022.getClass(), "nano", 962636679);
        setField(term89017, term89017.getClass(), "time", term89022);
        setField(term88991, term88991.getClass(), "accessTime", term89017);
        setField(term88989, term88989.getClass(), "card", term88991);
        setField(term88989, term88989.getClass(), "userName", "BqLgONTWcn");
        setIntField(term89040, term89040.getClass(), "year", 2019);
        setShortField(term89040, term89040.getClass(), "month", (short) 1);
        setShortField(term89040, term89040.getClass(), "day", (short) 30);
        setField(term89039, term89039.getClass(), "date", term89040);
        setByteField(term89044, term89044.getClass(), "hour", (byte) 14);
        setByteField(term89044, term89044.getClass(), "minute", (byte) 10);
        setByteField(term89044, term89044.getClass(), "second", (byte) 20);
        setIntField(term89044, term89044.getClass(), "nano", 60618008);
        setField(term89039, term89039.getClass(), "time", term89044);
        setField(term88989, term88989.getClass(), "lastLoginDate", term89039);
        setBooleanField(term88989, term88989.getClass(), "isWebJoin", true);
        setField(term88989, term88989.getClass(), "webLimitDate", "QyyvfuUsSl");
        setIntField(term88989, term88989.getClass(), "level", -1333087297);
        setIntField(term88989, term88989.getClass(), "reincarnationNum", 855437401);
        setField(term88989, term88989.getClass(), "exp", "urXLfQoyuc");
        setLongField(term88989, term88989.getClass(), "point", -689231427687092388L);
        setLongField(term88989, term88989.getClass(), "totalPoint", 8373979822629220849L);
        setIntField(term88989, term88989.getClass(), "playCount", 929964148);
        setIntField(term88989, term88989.getClass(), "multiPlayCount", 1226042578);
        setIntField(term88989, term88989.getClass(), "multiWinCount", 1894178312);
        setIntField(term88989, term88989.getClass(), "requestResCount", 1804953221);
        setIntField(term88989, term88989.getClass(), "acceptResCount", -1246078900);
        setIntField(term88989, term88989.getClass(), "successResCount", 488994033);
        setIntField(term88989, term88989.getClass(), "playerRating", 1059681981);
        setIntField(term88989, term88989.getClass(), "highestRating", 1611223068);
        setIntField(term88989, term88989.getClass(), "nameplateId", 1902439631);
        setIntField(term88989, term88989.getClass(), "frameId", -18255187);
        setIntField(term88989, term88989.getClass(), "characterId", -1088335552);
        setIntField(term88989, term88989.getClass(), "trophyId", -405643924);
        setIntField(term88989, term88989.getClass(), "playedTutorialBit", -312877355);
        setIntField(term88989, term88989.getClass(), "firstTutorialCancelNum", -1575759244);
        setIntField(term88989, term88989.getClass(), "masterTutorialCancelNum", -130757852);
        setIntField(term88989, term88989.getClass(), "totalRepertoireCount", -1578353749);
        setIntField(term88989, term88989.getClass(), "totalMapNum", -1729440681);
        setLongField(term88989, term88989.getClass(), "totalHiScore", 1118204947601768403L);
        setLongField(term88989, term88989.getClass(), "totalBasicHighScore", -59812931280292932L);
        setLongField(term88989, term88989.getClass(), "totalAdvancedHighScore", 2152337427888260081L);
        setLongField(term88989, term88989.getClass(), "totalExpertHighScore", 5626125546253518889L);
        setLongField(term88989, term88989.getClass(), "totalMasterHighScore", -9087544875525123832L);
        setIntField(term89101, term89101.getClass(), "year", 2029);
        setShortField(term89101, term89101.getClass(), "month", (short) 12);
        setShortField(term89101, term89101.getClass(), "day", (short) 9);
        setField(term89100, term89100.getClass(), "date", term89101);
        setByteField(term89105, term89105.getClass(), "hour", (byte) 7);
        setByteField(term89105, term89105.getClass(), "minute", (byte) 27);
        setByteField(term89105, term89105.getClass(), "second", (byte) 9);
        setIntField(term89105, term89105.getClass(), "nano", 116678441);
        setField(term89100, term89100.getClass(), "time", term89105);
        setField(term88989, term88989.getClass(), "eventWatchedDate", term89100);
        setIntField(term88989, term88989.getClass(), "friendCount", -1451086024);
        setBooleanField(term88989, term88989.getClass(), "isMaimai", false);
        setField(term88989, term88989.getClass(), "firstGameId", "KoWkwRBvcY");
        setField(term88989, term88989.getClass(), "firstRomVersion", "kqDHOsurKa");
        setField(term88989, term88989.getClass(), "firstDataVersion", "NCqNKzmHkE");
        setIntField(term89149, term89149.getClass(), "year", 2016);
        setShortField(term89149, term89149.getClass(), "month", (short) 2);
        setShortField(term89149, term89149.getClass(), "day", (short) 7);
        setField(term89148, term89148.getClass(), "date", term89149);
        setByteField(term89153, term89153.getClass(), "hour", (byte) 6);
        setByteField(term89153, term89153.getClass(), "minute", (byte) 40);
        setByteField(term89153, term89153.getClass(), "second", (byte) 12);
        setIntField(term89153, term89153.getClass(), "nano", 507363205);
        setField(term89148, term89148.getClass(), "time", term89153);
        setField(term88989, term88989.getClass(), "firstPlayDate", term89148);
        setField(term88989, term88989.getClass(), "lastGameId", "eFSnWGCXQK");
        setField(term88989, term88989.getClass(), "lastRomVersion", "GrrqChmbDB");
        setField(term88989, term88989.getClass(), "lastDataVersion", "AOUZgesZGu");
        setIntField(term89195, term89195.getClass(), "year", 2024);
        setShortField(term89195, term89195.getClass(), "month", (short) 3);
        setShortField(term89195, term89195.getClass(), "day", (short) 31);
        setField(term89194, term89194.getClass(), "date", term89195);
        setByteField(term89199, term89199.getClass(), "hour", (byte) 22);
        setByteField(term89199, term89199.getClass(), "minute", (byte) 44);
        setByteField(term89199, term89199.getClass(), "second", (byte) 36);
        setIntField(term89199, term89199.getClass(), "nano", 617693280);
        setField(term89194, term89194.getClass(), "time", term89199);
        setField(term88989, term88989.getClass(), "lastPlayDate", term89194);
        setIntField(term88989, term88989.getClass(), "lastPlaceId", -1484385005);
        setField(term88989, term88989.getClass(), "lastPlaceName", "RApShxzpug");
        setField(term88989, term88989.getClass(), "lastRegionId", "aygFZPbIko");
        setField(term88989, term88989.getClass(), "lastRegionName", "hUhlDCVWIF");
        setField(term88989, term88989.getClass(), "lastAllNetId", "GjzKvoPaBR");
        setField(term88989, term88989.getClass(), "lastClientId", "VZRLekBSXz");
        setField(term88987, term88987.getClass(), "user", term88989);
        setIntField(term88987, term88987.getClass(), "musicId", 1911846407);
        setIntField(term88987, term88987.getClass(), "level", -1861622294);
        setIntField(term88987, term88987.getClass(), "playCount", -1348867162);
        setIntField(term88987, term88987.getClass(), "scoreMax", -1365727758);
        setIntField(term88987, term88987.getClass(), "resRequestCount", -1623272453);
        setIntField(term88987, term88987.getClass(), "resAcceptCount", -165330808);
        setIntField(term88987, term88987.getClass(), "resSuccessCount", 1087515293);
        setIntField(term88987, term88987.getClass(), "missCount", 1480080450);
        setIntField(term88987, term88987.getClass(), "maxComboCount", -1230976797);
        setBooleanField(term88987, term88987.getClass(), "isFullCombo", true);
        setBooleanField(term88987, term88987.getClass(), "isAllJustice", false);
        setBooleanField(term88987, term88987.getClass(), "isSuccess", true);
        setIntField(term88987, term88987.getClass(), "fullChain", 175415190);
        setIntField(term88987, term88987.getClass(), "maxChain", 1375754973);
        setIntField(term88987, term88987.getClass(), "scoreRank", 1585713609);
        setBooleanField(term88987, term88987.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term88987, args);
    }

};


