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

public class UserData_getLastPlayMusicLevel_29414052560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47298;

    public UserData_getLastPlayMusicLevel_29414052560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47302 = new Long(1215116475929634177L);
        term47298 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term47300 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term47316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47331 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term47298, term47298.getClass(), "id", -413020147234344150L);
        setLongField(term47300, term47300.getClass(), "id", 472883245502777941L);
        setField(term47300, term47300.getClass(), "extId", term47302);
        setField(term47300, term47300.getClass(), "luid", "jEdjRikQtN");
        setIntField(term47317, term47317.getClass(), "year", 2018);
        setShortField(term47317, term47317.getClass(), "month", (short) 5);
        setShortField(term47317, term47317.getClass(), "day", (short) 13);
        setField(term47316, term47316.getClass(), "date", term47317);
        setByteField(term47321, term47321.getClass(), "hour", (byte) 0);
        setByteField(term47321, term47321.getClass(), "minute", (byte) 47);
        setByteField(term47321, term47321.getClass(), "second", (byte) 45);
        setIntField(term47321, term47321.getClass(), "nano", 10058361);
        setField(term47316, term47316.getClass(), "time", term47321);
        setField(term47300, term47300.getClass(), "registerTime", term47316);
        setIntField(term47327, term47327.getClass(), "year", 2014);
        setShortField(term47327, term47327.getClass(), "month", (short) 6);
        setShortField(term47327, term47327.getClass(), "day", (short) 11);
        setField(term47326, term47326.getClass(), "date", term47327);
        setByteField(term47331, term47331.getClass(), "hour", (byte) 8);
        setByteField(term47331, term47331.getClass(), "minute", (byte) 55);
        setByteField(term47331, term47331.getClass(), "second", (byte) 58);
        setIntField(term47331, term47331.getClass(), "nano", 376244535);
        setField(term47326, term47326.getClass(), "time", term47331);
        setField(term47300, term47300.getClass(), "accessTime", term47326);
        setField(term47298, term47298.getClass(), "card", term47300);
        setField(term47298, term47298.getClass(), "userName", "fSNUaokVWs");
        setIntField(term47298, term47298.getClass(), "level", 767458787);
        setIntField(term47298, term47298.getClass(), "reincarnationNum", 2103721338);
        setLongField(term47298, term47298.getClass(), "exp", -6142480959588164820L);
        setLongField(term47298, term47298.getClass(), "point", -464053943216947554L);
        setLongField(term47298, term47298.getClass(), "totalPoint", -6411942115020054409L);
        setIntField(term47298, term47298.getClass(), "playCount", 621330308);
        setIntField(term47298, term47298.getClass(), "jewelCount", -1597424060);
        setIntField(term47298, term47298.getClass(), "totalJewelCount", 243854303);
        setIntField(term47298, term47298.getClass(), "medalCount", 1754709105);
        setIntField(term47298, term47298.getClass(), "playerRating", 1523196898);
        setIntField(term47298, term47298.getClass(), "highestRating", 2061147445);
        setIntField(term47298, term47298.getClass(), "battlePoint", -531060561);
        setIntField(term47298, term47298.getClass(), "bestBattlePoint", -1974107061);
        setIntField(term47298, term47298.getClass(), "overDamageBattlePoint", -1806271948);
        setBooleanField(term47298, term47298.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term47298, term47298.getClass(), "nameplateId", 1708731871);
        setIntField(term47298, term47298.getClass(), "trophyId", 1855866160);
        setIntField(term47298, term47298.getClass(), "cardId", -1463148153);
        setIntField(term47298, term47298.getClass(), "characterId", -121679722);
        setIntField(term47298, term47298.getClass(), "characterVoiceNo", -1283714004);
        setIntField(term47298, term47298.getClass(), "tabSetting", -1085038483);
        setIntField(term47298, term47298.getClass(), "tabSortSetting", 1089796055);
        setIntField(term47298, term47298.getClass(), "cardCategorySetting", -456321892);
        setIntField(term47298, term47298.getClass(), "cardSortSetting", 1803068346);
        setIntField(term47298, term47298.getClass(), "rivalScoreCategorySetting", 1598485572);
        setIntField(term47298, term47298.getClass(), "playedTutorialBit", 1328348146);
        setIntField(term47298, term47298.getClass(), "firstTutorialCancelNum", 835037846);
        setLongField(term47298, term47298.getClass(), "sumTechHighScore", 6501798712124759765L);
        setLongField(term47298, term47298.getClass(), "sumTechBasicHighScore", -8075121428376355007L);
        setLongField(term47298, term47298.getClass(), "sumTechAdvancedHighScore", 685138334744218828L);
        setLongField(term47298, term47298.getClass(), "sumTechExpertHighScore", -2769601758499543843L);
        setLongField(term47298, term47298.getClass(), "sumTechMasterHighScore", 2429296542899066013L);
        setLongField(term47298, term47298.getClass(), "sumTechLunaticHighScore", 5867985083377188636L);
        setLongField(term47298, term47298.getClass(), "sumBattleHighScore", 3127660879530812585L);
        setLongField(term47298, term47298.getClass(), "sumBattleBasicHighScore", 8719003136272047601L);
        setLongField(term47298, term47298.getClass(), "sumBattleAdvancedHighScore", -3080436486706724387L);
        setLongField(term47298, term47298.getClass(), "sumBattleExpertHighScore", -4645138191058941101L);
        setLongField(term47298, term47298.getClass(), "sumBattleMasterHighScore", -7214804908928828361L);
        setLongField(term47298, term47298.getClass(), "sumBattleLunaticHighScore", 8330781560568888679L);
        setField(term47298, term47298.getClass(), "eventWatchedDate", "dTxnMmHoVm");
        setField(term47298, term47298.getClass(), "cmEventWatchedDate", "iswxaQUQgT");
        setField(term47298, term47298.getClass(), "firstGameId", "MxUSQqhNse");
        setField(term47298, term47298.getClass(), "firstRomVersion", "skwxdosvQV");
        setField(term47298, term47298.getClass(), "firstDataVersion", "DBYTggnCkD");
        setField(term47298, term47298.getClass(), "firstPlayDate", "RyXrJxJQiY");
        setField(term47298, term47298.getClass(), "lastGameId", "JfnQeTdzWs");
        setField(term47298, term47298.getClass(), "lastRomVersion", "HGhGqMiMOk");
        setField(term47298, term47298.getClass(), "lastDataVersion", "VtTzFdKpZI");
        setField(term47298, term47298.getClass(), "compatibleCmVersion", "yCqQIOXRXO");
        setField(term47298, term47298.getClass(), "lastPlayDate", "aevLPMVcYW");
        setIntField(term47298, term47298.getClass(), "lastPlaceId", 1151852495);
        setField(term47298, term47298.getClass(), "lastPlaceName", "orHcHVrwHz");
        setIntField(term47298, term47298.getClass(), "lastRegionId", -1258846135);
        setField(term47298, term47298.getClass(), "lastRegionName", "mkEWcQdwUn");
        setIntField(term47298, term47298.getClass(), "lastAllNetId", -2113882456);
        setField(term47298, term47298.getClass(), "lastClientId", "VRjVlzFSIx");
        setIntField(term47298, term47298.getClass(), "lastUsedDeckId", 913224981);
        setIntField(term47298, term47298.getClass(), "lastPlayMusicLevel", -2064677239);
        setIntField(term47298, term47298.getClass(), "lastEmoneyBrand", 584068841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicLevel", argTypes, term47298, args);
    }

};


