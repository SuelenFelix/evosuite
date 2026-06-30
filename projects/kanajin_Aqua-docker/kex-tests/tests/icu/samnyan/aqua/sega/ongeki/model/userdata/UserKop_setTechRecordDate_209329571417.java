package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserKop_setTechRecordDate_209329571417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279204;

    public UserKop_setTechRecordDate_209329571417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279210 = new Long(-955253666696787757L);
        term279204 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term279206 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term279208 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279239 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279204, term279204.getClass(), "id", 2340463523923829553L);
        setLongField(term279206, term279206.getClass(), "id", -5193916100063079093L);
        setLongField(term279208, term279208.getClass(), "id", -1024927446470685383L);
        setField(term279208, term279208.getClass(), "extId", term279210);
        setField(term279208, term279208.getClass(), "luid", "aTdFvWUkRg");
        setIntField(term279225, term279225.getClass(), "year", 2027);
        setShortField(term279225, term279225.getClass(), "month", (short) 12);
        setShortField(term279225, term279225.getClass(), "day", (short) 28);
        setField(term279224, term279224.getClass(), "date", term279225);
        setByteField(term279229, term279229.getClass(), "hour", (byte) 21);
        setByteField(term279229, term279229.getClass(), "minute", (byte) 39);
        setByteField(term279229, term279229.getClass(), "second", (byte) 50);
        setIntField(term279229, term279229.getClass(), "nano", 376843919);
        setField(term279224, term279224.getClass(), "time", term279229);
        setField(term279208, term279208.getClass(), "registerTime", term279224);
        setIntField(term279235, term279235.getClass(), "year", 2023);
        setShortField(term279235, term279235.getClass(), "month", (short) 10);
        setShortField(term279235, term279235.getClass(), "day", (short) 24);
        setField(term279234, term279234.getClass(), "date", term279235);
        setByteField(term279239, term279239.getClass(), "hour", (byte) 23);
        setByteField(term279239, term279239.getClass(), "minute", (byte) 56);
        setByteField(term279239, term279239.getClass(), "second", (byte) 20);
        setIntField(term279239, term279239.getClass(), "nano", 199732424);
        setField(term279234, term279234.getClass(), "time", term279239);
        setField(term279208, term279208.getClass(), "accessTime", term279234);
        setField(term279206, term279206.getClass(), "card", term279208);
        setField(term279206, term279206.getClass(), "userName", "EvatbEpuBU");
        setIntField(term279206, term279206.getClass(), "level", -1081656668);
        setIntField(term279206, term279206.getClass(), "reincarnationNum", 2146938733);
        setLongField(term279206, term279206.getClass(), "exp", 5727440195482787270L);
        setLongField(term279206, term279206.getClass(), "point", -7579339011878426380L);
        setLongField(term279206, term279206.getClass(), "totalPoint", 5840719480958654426L);
        setIntField(term279206, term279206.getClass(), "playCount", 345464224);
        setIntField(term279206, term279206.getClass(), "jewelCount", -1307803249);
        setIntField(term279206, term279206.getClass(), "totalJewelCount", 534335201);
        setIntField(term279206, term279206.getClass(), "medalCount", -1255427884);
        setIntField(term279206, term279206.getClass(), "playerRating", 1168729369);
        setIntField(term279206, term279206.getClass(), "highestRating", 151690467);
        setIntField(term279206, term279206.getClass(), "battlePoint", -186313217);
        setIntField(term279206, term279206.getClass(), "bestBattlePoint", -815651409);
        setIntField(term279206, term279206.getClass(), "overDamageBattlePoint", -353945578);
        setBooleanField(term279206, term279206.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term279206, term279206.getClass(), "nameplateId", 1135633);
        setIntField(term279206, term279206.getClass(), "trophyId", 1621941924);
        setIntField(term279206, term279206.getClass(), "cardId", 165051353);
        setIntField(term279206, term279206.getClass(), "characterId", 319228528);
        setIntField(term279206, term279206.getClass(), "characterVoiceNo", -1386299179);
        setIntField(term279206, term279206.getClass(), "tabSetting", 1707068994);
        setIntField(term279206, term279206.getClass(), "tabSortSetting", 679614372);
        setIntField(term279206, term279206.getClass(), "cardCategorySetting", -1870715839);
        setIntField(term279206, term279206.getClass(), "cardSortSetting", -294405038);
        setIntField(term279206, term279206.getClass(), "rivalScoreCategorySetting", -795338343);
        setIntField(term279206, term279206.getClass(), "playedTutorialBit", 229702668);
        setIntField(term279206, term279206.getClass(), "firstTutorialCancelNum", 1625307154);
        setLongField(term279206, term279206.getClass(), "sumTechHighScore", -3921239016516293818L);
        setLongField(term279206, term279206.getClass(), "sumTechBasicHighScore", -6054233987804763593L);
        setLongField(term279206, term279206.getClass(), "sumTechAdvancedHighScore", -2670111455424586843L);
        setLongField(term279206, term279206.getClass(), "sumTechExpertHighScore", -1233266479543289031L);
        setLongField(term279206, term279206.getClass(), "sumTechMasterHighScore", 487549999169553627L);
        setLongField(term279206, term279206.getClass(), "sumTechLunaticHighScore", 7438964329969195336L);
        setLongField(term279206, term279206.getClass(), "sumBattleHighScore", -3432721826426262006L);
        setLongField(term279206, term279206.getClass(), "sumBattleBasicHighScore", -5644295377176967806L);
        setLongField(term279206, term279206.getClass(), "sumBattleAdvancedHighScore", -7947856592867074064L);
        setLongField(term279206, term279206.getClass(), "sumBattleExpertHighScore", 8784181594428408983L);
        setLongField(term279206, term279206.getClass(), "sumBattleMasterHighScore", 3068835116346931820L);
        setLongField(term279206, term279206.getClass(), "sumBattleLunaticHighScore", -8021705809587447307L);
        setField(term279206, term279206.getClass(), "eventWatchedDate", "HKZGEhlODe");
        setField(term279206, term279206.getClass(), "cmEventWatchedDate", "Brehxsxqlu");
        setField(term279206, term279206.getClass(), "firstGameId", "YJjLEIFIXz");
        setField(term279206, term279206.getClass(), "firstRomVersion", "EUOVVchCuH");
        setField(term279206, term279206.getClass(), "firstDataVersion", "YBEjtwoXAa");
        setField(term279206, term279206.getClass(), "firstPlayDate", "hcUrfXxUyU");
        setField(term279206, term279206.getClass(), "lastGameId", "EbtBgsMrVm");
        setField(term279206, term279206.getClass(), "lastRomVersion", "ReSzglHqbI");
        setField(term279206, term279206.getClass(), "lastDataVersion", "CfqOwyPntO");
        setField(term279206, term279206.getClass(), "compatibleCmVersion", "aGJpzsREQk");
        setField(term279206, term279206.getClass(), "lastPlayDate", "yNmAFVlbsd");
        setIntField(term279206, term279206.getClass(), "lastPlaceId", 874439788);
        setField(term279206, term279206.getClass(), "lastPlaceName", "OdpsFXVyHb");
        setIntField(term279206, term279206.getClass(), "lastRegionId", -1064976000);
        setField(term279206, term279206.getClass(), "lastRegionName", "nJYYTNCMan");
        setIntField(term279206, term279206.getClass(), "lastAllNetId", -398704081);
        setField(term279206, term279206.getClass(), "lastClientId", "kfOHuUkyPD");
        setIntField(term279206, term279206.getClass(), "lastUsedDeckId", -1711507656);
        setIntField(term279206, term279206.getClass(), "lastPlayMusicLevel", 480387670);
        setIntField(term279206, term279206.getClass(), "lastEmoneyBrand", 1761728485);
        setField(term279204, term279204.getClass(), "user", term279206);
        setField(term279204, term279204.getClass(), "authKey", "dPfJJGqFNX");
        setIntField(term279204, term279204.getClass(), "kopId", 1806701564);
        setIntField(term279204, term279204.getClass(), "areaId", -1488910214);
        setIntField(term279204, term279204.getClass(), "totalTechScore", -1970174359);
        setIntField(term279204, term279204.getClass(), "totalPlatinumScore", -2021486318);
        setField(term279204, term279204.getClass(), "techRecordDate", "AcpKKvffPO");
        setBooleanField(term279204, term279204.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nxXgwkBjIn";
        callMethod(klass, "setTechRecordDate", argTypes, term279204, args);
    }

};


