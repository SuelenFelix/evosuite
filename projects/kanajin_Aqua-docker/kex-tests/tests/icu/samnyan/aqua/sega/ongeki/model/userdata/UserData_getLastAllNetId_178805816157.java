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

public class UserData_getLastAllNetId_178805816157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46029;

    public UserData_getLastAllNetId_178805816157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46033 = new Long(2354625302846375590L);
        term46029 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term46031 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term46047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46062 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term46029, term46029.getClass(), "id", 6024204865305504328L);
        setLongField(term46031, term46031.getClass(), "id", 2554027544370354047L);
        setField(term46031, term46031.getClass(), "extId", term46033);
        setField(term46031, term46031.getClass(), "luid", "uCdLbhvYeG");
        setIntField(term46048, term46048.getClass(), "year", 2028);
        setShortField(term46048, term46048.getClass(), "month", (short) 5);
        setShortField(term46048, term46048.getClass(), "day", (short) 6);
        setField(term46047, term46047.getClass(), "date", term46048);
        setByteField(term46052, term46052.getClass(), "hour", (byte) 19);
        setByteField(term46052, term46052.getClass(), "minute", (byte) 33);
        setByteField(term46052, term46052.getClass(), "second", (byte) 32);
        setIntField(term46052, term46052.getClass(), "nano", 917257563);
        setField(term46047, term46047.getClass(), "time", term46052);
        setField(term46031, term46031.getClass(), "registerTime", term46047);
        setIntField(term46058, term46058.getClass(), "year", 2029);
        setShortField(term46058, term46058.getClass(), "month", (short) 7);
        setShortField(term46058, term46058.getClass(), "day", (short) 22);
        setField(term46057, term46057.getClass(), "date", term46058);
        setByteField(term46062, term46062.getClass(), "hour", (byte) 17);
        setByteField(term46062, term46062.getClass(), "minute", (byte) 59);
        setByteField(term46062, term46062.getClass(), "second", (byte) 58);
        setIntField(term46062, term46062.getClass(), "nano", 921418702);
        setField(term46057, term46057.getClass(), "time", term46062);
        setField(term46031, term46031.getClass(), "accessTime", term46057);
        setField(term46029, term46029.getClass(), "card", term46031);
        setField(term46029, term46029.getClass(), "userName", "ipoyEHBfoG");
        setIntField(term46029, term46029.getClass(), "level", -2057880798);
        setIntField(term46029, term46029.getClass(), "reincarnationNum", -2041732081);
        setLongField(term46029, term46029.getClass(), "exp", 365411533450462757L);
        setLongField(term46029, term46029.getClass(), "point", -5876369379613954614L);
        setLongField(term46029, term46029.getClass(), "totalPoint", 9069442033463962750L);
        setIntField(term46029, term46029.getClass(), "playCount", 2073870078);
        setIntField(term46029, term46029.getClass(), "jewelCount", 1649066040);
        setIntField(term46029, term46029.getClass(), "totalJewelCount", -640093979);
        setIntField(term46029, term46029.getClass(), "medalCount", 1665282382);
        setIntField(term46029, term46029.getClass(), "playerRating", 1536865175);
        setIntField(term46029, term46029.getClass(), "highestRating", -1059947211);
        setIntField(term46029, term46029.getClass(), "battlePoint", -768583538);
        setIntField(term46029, term46029.getClass(), "bestBattlePoint", 372329686);
        setIntField(term46029, term46029.getClass(), "overDamageBattlePoint", -381739191);
        setBooleanField(term46029, term46029.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term46029, term46029.getClass(), "nameplateId", -432438127);
        setIntField(term46029, term46029.getClass(), "trophyId", 44813544);
        setIntField(term46029, term46029.getClass(), "cardId", 654539936);
        setIntField(term46029, term46029.getClass(), "characterId", -929524036);
        setIntField(term46029, term46029.getClass(), "characterVoiceNo", 1539575963);
        setIntField(term46029, term46029.getClass(), "tabSetting", -381662221);
        setIntField(term46029, term46029.getClass(), "tabSortSetting", -1367263864);
        setIntField(term46029, term46029.getClass(), "cardCategorySetting", 1810292112);
        setIntField(term46029, term46029.getClass(), "cardSortSetting", 385619995);
        setIntField(term46029, term46029.getClass(), "rivalScoreCategorySetting", -920852160);
        setIntField(term46029, term46029.getClass(), "playedTutorialBit", -1975385844);
        setIntField(term46029, term46029.getClass(), "firstTutorialCancelNum", -720629032);
        setLongField(term46029, term46029.getClass(), "sumTechHighScore", 3575561499505653094L);
        setLongField(term46029, term46029.getClass(), "sumTechBasicHighScore", -4244720445894600013L);
        setLongField(term46029, term46029.getClass(), "sumTechAdvancedHighScore", 523156443226992560L);
        setLongField(term46029, term46029.getClass(), "sumTechExpertHighScore", 2239859681808970691L);
        setLongField(term46029, term46029.getClass(), "sumTechMasterHighScore", -4502190204332677735L);
        setLongField(term46029, term46029.getClass(), "sumTechLunaticHighScore", 4165201970048882126L);
        setLongField(term46029, term46029.getClass(), "sumBattleHighScore", 1713132989163348687L);
        setLongField(term46029, term46029.getClass(), "sumBattleBasicHighScore", 4782360695691953108L);
        setLongField(term46029, term46029.getClass(), "sumBattleAdvancedHighScore", 5499210513338318618L);
        setLongField(term46029, term46029.getClass(), "sumBattleExpertHighScore", 4904841436380882882L);
        setLongField(term46029, term46029.getClass(), "sumBattleMasterHighScore", 4601901314293570056L);
        setLongField(term46029, term46029.getClass(), "sumBattleLunaticHighScore", 3811147117668167855L);
        setField(term46029, term46029.getClass(), "eventWatchedDate", "iSBTpbiteU");
        setField(term46029, term46029.getClass(), "cmEventWatchedDate", "MTwFbEoMZj");
        setField(term46029, term46029.getClass(), "firstGameId", "uEQbnHbyAn");
        setField(term46029, term46029.getClass(), "firstRomVersion", "JpFIuyNEKW");
        setField(term46029, term46029.getClass(), "firstDataVersion", "NksHsgcqDx");
        setField(term46029, term46029.getClass(), "firstPlayDate", "RjSNvOEvcT");
        setField(term46029, term46029.getClass(), "lastGameId", "HLzuMxigqS");
        setField(term46029, term46029.getClass(), "lastRomVersion", "wiBOoDCyzd");
        setField(term46029, term46029.getClass(), "lastDataVersion", "TIaFKUJELS");
        setField(term46029, term46029.getClass(), "compatibleCmVersion", "IPmndzGjtG");
        setField(term46029, term46029.getClass(), "lastPlayDate", "pkQiBgYrkQ");
        setIntField(term46029, term46029.getClass(), "lastPlaceId", 398554038);
        setField(term46029, term46029.getClass(), "lastPlaceName", "SJLRFsNagf");
        setIntField(term46029, term46029.getClass(), "lastRegionId", -1454206593);
        setField(term46029, term46029.getClass(), "lastRegionName", "UsCZaSgXzI");
        setIntField(term46029, term46029.getClass(), "lastAllNetId", 675396436);
        setField(term46029, term46029.getClass(), "lastClientId", "IXZCeVwvBM");
        setIntField(term46029, term46029.getClass(), "lastUsedDeckId", -41963319);
        setIntField(term46029, term46029.getClass(), "lastPlayMusicLevel", -831752810);
        setIntField(term46029, term46029.getClass(), "lastEmoneyBrand", -386141354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term46029, args);
    }

};


