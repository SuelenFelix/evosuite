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

public class UserGeneralData_canEqual_70224687310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298904;
     Object term299193;

    public UserGeneralData_canEqual_70224687310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term298910 = new Long(-2413135395771470086L);
        term298904 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term298906 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term298908 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term298924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298939 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term298904, term298904.getClass(), "id", -3625070539524536869L);
        setLongField(term298906, term298906.getClass(), "id", 3144137483163646667L);
        setLongField(term298908, term298908.getClass(), "id", 5275552126159154090L);
        setField(term298908, term298908.getClass(), "extId", term298910);
        setField(term298908, term298908.getClass(), "luid", "wPRvAQKTop");
        setIntField(term298925, term298925.getClass(), "year", 2028);
        setShortField(term298925, term298925.getClass(), "month", (short) 2);
        setShortField(term298925, term298925.getClass(), "day", (short) 9);
        setField(term298924, term298924.getClass(), "date", term298925);
        setByteField(term298929, term298929.getClass(), "hour", (byte) 1);
        setByteField(term298929, term298929.getClass(), "minute", (byte) 7);
        setByteField(term298929, term298929.getClass(), "second", (byte) 14);
        setIntField(term298929, term298929.getClass(), "nano", 262906239);
        setField(term298924, term298924.getClass(), "time", term298929);
        setField(term298908, term298908.getClass(), "registerTime", term298924);
        setIntField(term298935, term298935.getClass(), "year", 2023);
        setShortField(term298935, term298935.getClass(), "month", (short) 11);
        setShortField(term298935, term298935.getClass(), "day", (short) 9);
        setField(term298934, term298934.getClass(), "date", term298935);
        setByteField(term298939, term298939.getClass(), "hour", (byte) 16);
        setByteField(term298939, term298939.getClass(), "minute", (byte) 14);
        setByteField(term298939, term298939.getClass(), "second", (byte) 4);
        setIntField(term298939, term298939.getClass(), "nano", 501414424);
        setField(term298934, term298934.getClass(), "time", term298939);
        setField(term298908, term298908.getClass(), "accessTime", term298934);
        setField(term298906, term298906.getClass(), "card", term298908);
        setField(term298906, term298906.getClass(), "userName", "OhnhYqFRhK");
        setIntField(term298906, term298906.getClass(), "level", -505444020);
        setIntField(term298906, term298906.getClass(), "reincarnationNum", -1357664036);
        setLongField(term298906, term298906.getClass(), "exp", 8624635024908108116L);
        setLongField(term298906, term298906.getClass(), "point", -6647311140624695811L);
        setLongField(term298906, term298906.getClass(), "totalPoint", 6271540812311478504L);
        setIntField(term298906, term298906.getClass(), "playCount", 1385867925);
        setIntField(term298906, term298906.getClass(), "jewelCount", -1153669511);
        setIntField(term298906, term298906.getClass(), "totalJewelCount", -1728061970);
        setIntField(term298906, term298906.getClass(), "medalCount", -534133765);
        setIntField(term298906, term298906.getClass(), "playerRating", -1889375934);
        setIntField(term298906, term298906.getClass(), "highestRating", -704696915);
        setIntField(term298906, term298906.getClass(), "battlePoint", 44617811);
        setIntField(term298906, term298906.getClass(), "bestBattlePoint", 383622052);
        setIntField(term298906, term298906.getClass(), "overDamageBattlePoint", 619179292);
        setBooleanField(term298906, term298906.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term298906, term298906.getClass(), "nameplateId", -1185477999);
        setIntField(term298906, term298906.getClass(), "trophyId", -272655448);
        setIntField(term298906, term298906.getClass(), "cardId", -1475606830);
        setIntField(term298906, term298906.getClass(), "characterId", -1614821834);
        setIntField(term298906, term298906.getClass(), "characterVoiceNo", -1644940581);
        setIntField(term298906, term298906.getClass(), "tabSetting", 1709154213);
        setIntField(term298906, term298906.getClass(), "tabSortSetting", -218516880);
        setIntField(term298906, term298906.getClass(), "cardCategorySetting", 2098781553);
        setIntField(term298906, term298906.getClass(), "cardSortSetting", 920929867);
        setIntField(term298906, term298906.getClass(), "rivalScoreCategorySetting", 1453496285);
        setIntField(term298906, term298906.getClass(), "playedTutorialBit", 641216542);
        setIntField(term298906, term298906.getClass(), "firstTutorialCancelNum", -117150229);
        setLongField(term298906, term298906.getClass(), "sumTechHighScore", -7109111594210985732L);
        setLongField(term298906, term298906.getClass(), "sumTechBasicHighScore", -6580058006684202927L);
        setLongField(term298906, term298906.getClass(), "sumTechAdvancedHighScore", -304763622354744533L);
        setLongField(term298906, term298906.getClass(), "sumTechExpertHighScore", -4355964129190101239L);
        setLongField(term298906, term298906.getClass(), "sumTechMasterHighScore", 2946420695885626022L);
        setLongField(term298906, term298906.getClass(), "sumTechLunaticHighScore", -4123698661856111070L);
        setLongField(term298906, term298906.getClass(), "sumBattleHighScore", -2884387485740344658L);
        setLongField(term298906, term298906.getClass(), "sumBattleBasicHighScore", 4669741282360238954L);
        setLongField(term298906, term298906.getClass(), "sumBattleAdvancedHighScore", -3359667820596374173L);
        setLongField(term298906, term298906.getClass(), "sumBattleExpertHighScore", -1469343671451268406L);
        setLongField(term298906, term298906.getClass(), "sumBattleMasterHighScore", -7019986111631340077L);
        setLongField(term298906, term298906.getClass(), "sumBattleLunaticHighScore", 7066978477458348526L);
        setField(term298906, term298906.getClass(), "eventWatchedDate", "muqzcvKPzU");
        setField(term298906, term298906.getClass(), "cmEventWatchedDate", "LIfRcijYBP");
        setField(term298906, term298906.getClass(), "firstGameId", "UWfjAouyWX");
        setField(term298906, term298906.getClass(), "firstRomVersion", "lXEruUZEjX");
        setField(term298906, term298906.getClass(), "firstDataVersion", "BMZYmMvpIa");
        setField(term298906, term298906.getClass(), "firstPlayDate", "vpVENawnlE");
        setField(term298906, term298906.getClass(), "lastGameId", "dgciCbbLcm");
        setField(term298906, term298906.getClass(), "lastRomVersion", "MaoZhZpQjB");
        setField(term298906, term298906.getClass(), "lastDataVersion", "geQbYhZCon");
        setField(term298906, term298906.getClass(), "compatibleCmVersion", "csWAyLZbkB");
        setField(term298906, term298906.getClass(), "lastPlayDate", "LLoBZeTRNx");
        setIntField(term298906, term298906.getClass(), "lastPlaceId", -1085948653);
        setField(term298906, term298906.getClass(), "lastPlaceName", "LZXzTxEMXE");
        setIntField(term298906, term298906.getClass(), "lastRegionId", 644117590);
        setField(term298906, term298906.getClass(), "lastRegionName", "DTixVvtuBb");
        setIntField(term298906, term298906.getClass(), "lastAllNetId", -1777457867);
        setField(term298906, term298906.getClass(), "lastClientId", "HZRpEXkRHd");
        setIntField(term298906, term298906.getClass(), "lastUsedDeckId", 1119855029);
        setIntField(term298906, term298906.getClass(), "lastPlayMusicLevel", -296134542);
        setIntField(term298906, term298906.getClass(), "lastEmoneyBrand", 1377019740);
        setField(term298904, term298904.getClass(), "user", term298906);
        setField(term298904, term298904.getClass(), "propertyKey", "xbjtwqetFF");
        setField(term298904, term298904.getClass(), "propertyValue", "lPeJoACpkg");
        term299193 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term299193;
        callMethod(klass, "canEqual", argTypes, term298904, args);
    }

};


