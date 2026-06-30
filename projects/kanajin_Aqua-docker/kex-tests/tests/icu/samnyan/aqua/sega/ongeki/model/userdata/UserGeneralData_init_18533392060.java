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

public class UserGeneralData_init_18533392060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293768;

    public UserGeneralData_init_18533392060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term293772 = new Long(-6983938899150831997L);
        term293768 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term293770 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term293786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293791 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293801 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term293768, term293768.getClass(), "id", 2128933997895234241L);
        setLongField(term293770, term293770.getClass(), "id", 6475825291722960614L);
        setField(term293770, term293770.getClass(), "extId", term293772);
        setField(term293770, term293770.getClass(), "luid", "tvvzjEdEMh");
        setIntField(term293787, term293787.getClass(), "year", 2024);
        setShortField(term293787, term293787.getClass(), "month", (short) 8);
        setShortField(term293787, term293787.getClass(), "day", (short) 6);
        setField(term293786, term293786.getClass(), "date", term293787);
        setByteField(term293791, term293791.getClass(), "hour", (byte) 11);
        setByteField(term293791, term293791.getClass(), "minute", (byte) 28);
        setByteField(term293791, term293791.getClass(), "second", (byte) 28);
        setIntField(term293791, term293791.getClass(), "nano", 722445627);
        setField(term293786, term293786.getClass(), "time", term293791);
        setField(term293770, term293770.getClass(), "registerTime", term293786);
        setIntField(term293797, term293797.getClass(), "year", 2028);
        setShortField(term293797, term293797.getClass(), "month", (short) 12);
        setShortField(term293797, term293797.getClass(), "day", (short) 8);
        setField(term293796, term293796.getClass(), "date", term293797);
        setByteField(term293801, term293801.getClass(), "hour", (byte) 8);
        setByteField(term293801, term293801.getClass(), "minute", (byte) 34);
        setByteField(term293801, term293801.getClass(), "second", (byte) 7);
        setIntField(term293801, term293801.getClass(), "nano", 362279321);
        setField(term293796, term293796.getClass(), "time", term293801);
        setField(term293770, term293770.getClass(), "accessTime", term293796);
        setField(term293768, term293768.getClass(), "card", term293770);
        setField(term293768, term293768.getClass(), "userName", "MxEEwZkyaW");
        setIntField(term293768, term293768.getClass(), "level", 1412892169);
        setIntField(term293768, term293768.getClass(), "reincarnationNum", 1364137068);
        setLongField(term293768, term293768.getClass(), "exp", 4706262217502877730L);
        setLongField(term293768, term293768.getClass(), "point", -193709876772415973L);
        setLongField(term293768, term293768.getClass(), "totalPoint", 3320795154774362725L);
        setIntField(term293768, term293768.getClass(), "playCount", 1874584166);
        setIntField(term293768, term293768.getClass(), "jewelCount", 869259501);
        setIntField(term293768, term293768.getClass(), "totalJewelCount", -480123256);
        setIntField(term293768, term293768.getClass(), "medalCount", 1232910681);
        setIntField(term293768, term293768.getClass(), "playerRating", 1226906639);
        setIntField(term293768, term293768.getClass(), "highestRating", 1627208885);
        setIntField(term293768, term293768.getClass(), "battlePoint", -1869105420);
        setIntField(term293768, term293768.getClass(), "bestBattlePoint", 893460953);
        setIntField(term293768, term293768.getClass(), "overDamageBattlePoint", 1348216633);
        setBooleanField(term293768, term293768.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term293768, term293768.getClass(), "nameplateId", -5190998);
        setIntField(term293768, term293768.getClass(), "trophyId", 1160994774);
        setIntField(term293768, term293768.getClass(), "cardId", 451249819);
        setIntField(term293768, term293768.getClass(), "characterId", -1756025848);
        setIntField(term293768, term293768.getClass(), "characterVoiceNo", -105569667);
        setIntField(term293768, term293768.getClass(), "tabSetting", -2140916634);
        setIntField(term293768, term293768.getClass(), "tabSortSetting", 368699100);
        setIntField(term293768, term293768.getClass(), "cardCategorySetting", -547948695);
        setIntField(term293768, term293768.getClass(), "cardSortSetting", 332776320);
        setIntField(term293768, term293768.getClass(), "rivalScoreCategorySetting", -1944648370);
        setIntField(term293768, term293768.getClass(), "playedTutorialBit", -1977737772);
        setIntField(term293768, term293768.getClass(), "firstTutorialCancelNum", 1088640375);
        setLongField(term293768, term293768.getClass(), "sumTechHighScore", 2797692231699683275L);
        setLongField(term293768, term293768.getClass(), "sumTechBasicHighScore", -3490595112254460547L);
        setLongField(term293768, term293768.getClass(), "sumTechAdvancedHighScore", 195967663430163684L);
        setLongField(term293768, term293768.getClass(), "sumTechExpertHighScore", 344673351510679395L);
        setLongField(term293768, term293768.getClass(), "sumTechMasterHighScore", 3246393378490014049L);
        setLongField(term293768, term293768.getClass(), "sumTechLunaticHighScore", -2812073357889168837L);
        setLongField(term293768, term293768.getClass(), "sumBattleHighScore", 3440899264601113879L);
        setLongField(term293768, term293768.getClass(), "sumBattleBasicHighScore", -899867330748894027L);
        setLongField(term293768, term293768.getClass(), "sumBattleAdvancedHighScore", 6201249031951948973L);
        setLongField(term293768, term293768.getClass(), "sumBattleExpertHighScore", -3137431895273343818L);
        setLongField(term293768, term293768.getClass(), "sumBattleMasterHighScore", -4261764995301445909L);
        setLongField(term293768, term293768.getClass(), "sumBattleLunaticHighScore", 708004501531502646L);
        setField(term293768, term293768.getClass(), "eventWatchedDate", "lOGWYEqHxj");
        setField(term293768, term293768.getClass(), "cmEventWatchedDate", "bfmcuNDfeS");
        setField(term293768, term293768.getClass(), "firstGameId", "oNwwaNwhoB");
        setField(term293768, term293768.getClass(), "firstRomVersion", "YVrwLJWJoI");
        setField(term293768, term293768.getClass(), "firstDataVersion", "IDBsGgnCMF");
        setField(term293768, term293768.getClass(), "firstPlayDate", "zogoMEslwR");
        setField(term293768, term293768.getClass(), "lastGameId", "SfWNBumWCS");
        setField(term293768, term293768.getClass(), "lastRomVersion", "fHJImkGpKa");
        setField(term293768, term293768.getClass(), "lastDataVersion", "FFuRCJTPFU");
        setField(term293768, term293768.getClass(), "compatibleCmVersion", "TFqQgSYtAg");
        setField(term293768, term293768.getClass(), "lastPlayDate", "qIbUvSzenQ");
        setIntField(term293768, term293768.getClass(), "lastPlaceId", 951017780);
        setField(term293768, term293768.getClass(), "lastPlaceName", "syLbtpcFxr");
        setIntField(term293768, term293768.getClass(), "lastRegionId", -736683084);
        setField(term293768, term293768.getClass(), "lastRegionName", "FKHboGOFMY");
        setIntField(term293768, term293768.getClass(), "lastAllNetId", -1119724685);
        setField(term293768, term293768.getClass(), "lastClientId", "JAYIoLDVzT");
        setIntField(term293768, term293768.getClass(), "lastUsedDeckId", 596127264);
        setIntField(term293768, term293768.getClass(), "lastPlayMusicLevel", 358116640);
        setIntField(term293768, term293768.getClass(), "lastEmoneyBrand", -317366153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term293768;
        args[1] = "nxzYMTIyjg";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


