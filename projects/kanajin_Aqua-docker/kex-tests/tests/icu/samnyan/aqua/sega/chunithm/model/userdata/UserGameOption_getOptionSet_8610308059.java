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

public class UserGameOption_getOptionSet_8610308059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52771;

    public UserGameOption_getOptionSet_8610308059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52777 = new Long(-8876856890348836498L);
        term52771 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term52773 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term52775 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52828 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52889 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52983 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52771, term52771.getClass(), "id", 3415544654174435087L);
        setLongField(term52773, term52773.getClass(), "id", -6444648462294378605L);
        setLongField(term52775, term52775.getClass(), "id", 2399163633137062666L);
        setField(term52775, term52775.getClass(), "extId", term52777);
        setField(term52775, term52775.getClass(), "luid", "JfnQeTdzWs");
        setIntField(term52792, term52792.getClass(), "year", 2024);
        setShortField(term52792, term52792.getClass(), "month", (short) 5);
        setShortField(term52792, term52792.getClass(), "day", (short) 8);
        setField(term52791, term52791.getClass(), "date", term52792);
        setByteField(term52796, term52796.getClass(), "hour", (byte) 10);
        setByteField(term52796, term52796.getClass(), "minute", (byte) 21);
        setByteField(term52796, term52796.getClass(), "second", (byte) 1);
        setIntField(term52796, term52796.getClass(), "nano", 912060546);
        setField(term52791, term52791.getClass(), "time", term52796);
        setField(term52775, term52775.getClass(), "registerTime", term52791);
        setIntField(term52802, term52802.getClass(), "year", 2016);
        setShortField(term52802, term52802.getClass(), "month", (short) 1);
        setShortField(term52802, term52802.getClass(), "day", (short) 22);
        setField(term52801, term52801.getClass(), "date", term52802);
        setByteField(term52806, term52806.getClass(), "hour", (byte) 23);
        setByteField(term52806, term52806.getClass(), "minute", (byte) 0);
        setByteField(term52806, term52806.getClass(), "second", (byte) 1);
        setIntField(term52806, term52806.getClass(), "nano", 558329369);
        setField(term52801, term52801.getClass(), "time", term52806);
        setField(term52775, term52775.getClass(), "accessTime", term52801);
        setField(term52773, term52773.getClass(), "card", term52775);
        setField(term52773, term52773.getClass(), "userName", "HGhGqMiMOk");
        setIntField(term52824, term52824.getClass(), "year", 2012);
        setShortField(term52824, term52824.getClass(), "month", (short) 5);
        setShortField(term52824, term52824.getClass(), "day", (short) 9);
        setField(term52823, term52823.getClass(), "date", term52824);
        setByteField(term52828, term52828.getClass(), "hour", (byte) 4);
        setByteField(term52828, term52828.getClass(), "minute", (byte) 24);
        setByteField(term52828, term52828.getClass(), "second", (byte) 51);
        setIntField(term52828, term52828.getClass(), "nano", 768693356);
        setField(term52823, term52823.getClass(), "time", term52828);
        setField(term52773, term52773.getClass(), "lastLoginDate", term52823);
        setBooleanField(term52773, term52773.getClass(), "isWebJoin", true);
        setField(term52773, term52773.getClass(), "webLimitDate", "VtTzFdKpZI");
        setIntField(term52773, term52773.getClass(), "level", 766065097);
        setIntField(term52773, term52773.getClass(), "reincarnationNum", 1703658250);
        setField(term52773, term52773.getClass(), "exp", "yCqQIOXRXO");
        setLongField(term52773, term52773.getClass(), "point", 4553697734347851750L);
        setLongField(term52773, term52773.getClass(), "totalPoint", 1612790513855406360L);
        setIntField(term52773, term52773.getClass(), "playCount", -942615253);
        setIntField(term52773, term52773.getClass(), "multiPlayCount", 1642227506);
        setIntField(term52773, term52773.getClass(), "multiWinCount", -1930855861);
        setIntField(term52773, term52773.getClass(), "requestResCount", -59278290);
        setIntField(term52773, term52773.getClass(), "acceptResCount", 862799975);
        setIntField(term52773, term52773.getClass(), "successResCount", 785517219);
        setIntField(term52773, term52773.getClass(), "playerRating", -96163747);
        setIntField(term52773, term52773.getClass(), "highestRating", 1191473962);
        setIntField(term52773, term52773.getClass(), "nameplateId", 110101710);
        setIntField(term52773, term52773.getClass(), "frameId", 1819101781);
        setIntField(term52773, term52773.getClass(), "characterId", -1430157795);
        setIntField(term52773, term52773.getClass(), "trophyId", -1943692500);
        setIntField(term52773, term52773.getClass(), "playedTutorialBit", -108045978);
        setIntField(term52773, term52773.getClass(), "firstTutorialCancelNum", -1242612066);
        setIntField(term52773, term52773.getClass(), "masterTutorialCancelNum", -1492896610);
        setIntField(term52773, term52773.getClass(), "totalRepertoireCount", 1239212151);
        setIntField(term52773, term52773.getClass(), "totalMapNum", 1513817979);
        setLongField(term52773, term52773.getClass(), "totalHiScore", -3628485034781450950L);
        setLongField(term52773, term52773.getClass(), "totalBasicHighScore", 2505442540861032970L);
        setLongField(term52773, term52773.getClass(), "totalAdvancedHighScore", -4215965963361389968L);
        setLongField(term52773, term52773.getClass(), "totalExpertHighScore", 2070286321904569703L);
        setLongField(term52773, term52773.getClass(), "totalMasterHighScore", -3945232339387324807L);
        setIntField(term52885, term52885.getClass(), "year", 2026);
        setShortField(term52885, term52885.getClass(), "month", (short) 3);
        setShortField(term52885, term52885.getClass(), "day", (short) 10);
        setField(term52884, term52884.getClass(), "date", term52885);
        setByteField(term52889, term52889.getClass(), "hour", (byte) 20);
        setByteField(term52889, term52889.getClass(), "minute", (byte) 16);
        setByteField(term52889, term52889.getClass(), "second", (byte) 6);
        setIntField(term52889, term52889.getClass(), "nano", 559277183);
        setField(term52884, term52884.getClass(), "time", term52889);
        setField(term52773, term52773.getClass(), "eventWatchedDate", term52884);
        setIntField(term52773, term52773.getClass(), "friendCount", 222944981);
        setBooleanField(term52773, term52773.getClass(), "isMaimai", true);
        setField(term52773, term52773.getClass(), "firstGameId", "aevLPMVcYW");
        setField(term52773, term52773.getClass(), "firstRomVersion", "orHcHVrwHz");
        setField(term52773, term52773.getClass(), "firstDataVersion", "mkEWcQdwUn");
        setIntField(term52933, term52933.getClass(), "year", 2027);
        setShortField(term52933, term52933.getClass(), "month", (short) 1);
        setShortField(term52933, term52933.getClass(), "day", (short) 12);
        setField(term52932, term52932.getClass(), "date", term52933);
        setByteField(term52937, term52937.getClass(), "hour", (byte) 12);
        setByteField(term52937, term52937.getClass(), "minute", (byte) 12);
        setByteField(term52937, term52937.getClass(), "second", (byte) 21);
        setIntField(term52937, term52937.getClass(), "nano", 77791222);
        setField(term52932, term52932.getClass(), "time", term52937);
        setField(term52773, term52773.getClass(), "firstPlayDate", term52932);
        setField(term52773, term52773.getClass(), "lastGameId", "VRjVlzFSIx");
        setField(term52773, term52773.getClass(), "lastRomVersion", "fNlDLqQZFT");
        setField(term52773, term52773.getClass(), "lastDataVersion", "szCfpoTDXX");
        setIntField(term52979, term52979.getClass(), "year", 2018);
        setShortField(term52979, term52979.getClass(), "month", (short) 8);
        setShortField(term52979, term52979.getClass(), "day", (short) 2);
        setField(term52978, term52978.getClass(), "date", term52979);
        setByteField(term52983, term52983.getClass(), "hour", (byte) 20);
        setByteField(term52983, term52983.getClass(), "minute", (byte) 18);
        setByteField(term52983, term52983.getClass(), "second", (byte) 22);
        setIntField(term52983, term52983.getClass(), "nano", 639407296);
        setField(term52978, term52978.getClass(), "time", term52983);
        setField(term52773, term52773.getClass(), "lastPlayDate", term52978);
        setIntField(term52773, term52773.getClass(), "lastPlaceId", -1880135720);
        setField(term52773, term52773.getClass(), "lastPlaceName", "blnSDUyHkS");
        setField(term52773, term52773.getClass(), "lastRegionId", "byyepwHlHN");
        setField(term52773, term52773.getClass(), "lastRegionName", "akVNsUcFra");
        setField(term52773, term52773.getClass(), "lastAllNetId", "BKiHMTzLoY");
        setField(term52773, term52773.getClass(), "lastClientId", "arrHHpXCBD");
        setField(term52771, term52771.getClass(), "user", term52773);
        setIntField(term52771, term52771.getClass(), "bgInfo", 1065058113);
        setIntField(term52771, term52771.getClass(), "fieldColor", 159521199);
        setIntField(term52771, term52771.getClass(), "guideSound", 2020510924);
        setIntField(term52771, term52771.getClass(), "soundEffect", -644848160);
        setIntField(term52771, term52771.getClass(), "guideLine", -413768483);
        setIntField(term52771, term52771.getClass(), "speed", 565614678);
        setIntField(term52771, term52771.getClass(), "optionSet", -1248504675);
        setIntField(term52771, term52771.getClass(), "matching", 1366246744);
        setIntField(term52771, term52771.getClass(), "judgePos", -369295588);
        setIntField(term52771, term52771.getClass(), "rating", 728215296);
        setIntField(term52771, term52771.getClass(), "judgeJustice", -1236147031);
        setIntField(term52771, term52771.getClass(), "judgeAttack", 2030051112);
        setIntField(term52771, term52771.getClass(), "headphone", 1023614449);
        setIntField(term52771, term52771.getClass(), "playerLevel", -717220010);
        setIntField(term52771, term52771.getClass(), "successTap", 280068573);
        setIntField(term52771, term52771.getClass(), "successExTap", -1081530515);
        setIntField(term52771, term52771.getClass(), "successSlideHold", 492096339);
        setIntField(term52771, term52771.getClass(), "successAir", -1679827671);
        setIntField(term52771, term52771.getClass(), "successFlick", 932019255);
        setIntField(term52771, term52771.getClass(), "successSkill", 1939661233);
        setIntField(term52771, term52771.getClass(), "successTapTimbre", -485147289);
        setIntField(term52771, term52771.getClass(), "privacy", -1098526777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptionSet", argTypes, term52771, args);
    }

};


