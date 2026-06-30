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

public class UserScenario_setId_13321513875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98252;
     Object term98519;

    public UserScenario_setId_13321513875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98258 = new Long(2145420811068634601L);
        term98252 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term98254 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term98256 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98287 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98252, term98252.getClass(), "id", 4330983022024825820L);
        setLongField(term98254, term98254.getClass(), "id", 5824690013848082553L);
        setLongField(term98256, term98256.getClass(), "id", 5038298513906018396L);
        setField(term98256, term98256.getClass(), "extId", term98258);
        setField(term98256, term98256.getClass(), "luid", "ROkWEBVPGe");
        setIntField(term98273, term98273.getClass(), "year", 2019);
        setShortField(term98273, term98273.getClass(), "month", (short) 2);
        setShortField(term98273, term98273.getClass(), "day", (short) 19);
        setField(term98272, term98272.getClass(), "date", term98273);
        setByteField(term98277, term98277.getClass(), "hour", (byte) 9);
        setByteField(term98277, term98277.getClass(), "minute", (byte) 3);
        setByteField(term98277, term98277.getClass(), "second", (byte) 19);
        setIntField(term98277, term98277.getClass(), "nano", 646336873);
        setField(term98272, term98272.getClass(), "time", term98277);
        setField(term98256, term98256.getClass(), "registerTime", term98272);
        setIntField(term98283, term98283.getClass(), "year", 2017);
        setShortField(term98283, term98283.getClass(), "month", (short) 2);
        setShortField(term98283, term98283.getClass(), "day", (short) 10);
        setField(term98282, term98282.getClass(), "date", term98283);
        setByteField(term98287, term98287.getClass(), "hour", (byte) 13);
        setByteField(term98287, term98287.getClass(), "minute", (byte) 52);
        setByteField(term98287, term98287.getClass(), "second", (byte) 4);
        setIntField(term98287, term98287.getClass(), "nano", 660576536);
        setField(term98282, term98282.getClass(), "time", term98287);
        setField(term98256, term98256.getClass(), "accessTime", term98282);
        setField(term98254, term98254.getClass(), "card", term98256);
        setField(term98254, term98254.getClass(), "userName", "BHWsGhxwwy");
        setIntField(term98254, term98254.getClass(), "level", -391447045);
        setIntField(term98254, term98254.getClass(), "reincarnationNum", -396759931);
        setLongField(term98254, term98254.getClass(), "exp", -2046751618441507359L);
        setLongField(term98254, term98254.getClass(), "point", -256653518357663585L);
        setLongField(term98254, term98254.getClass(), "totalPoint", 6001930553633799759L);
        setIntField(term98254, term98254.getClass(), "playCount", 85098350);
        setIntField(term98254, term98254.getClass(), "jewelCount", 1519270868);
        setIntField(term98254, term98254.getClass(), "totalJewelCount", -1307675168);
        setIntField(term98254, term98254.getClass(), "medalCount", 550509363);
        setIntField(term98254, term98254.getClass(), "playerRating", 1200406150);
        setIntField(term98254, term98254.getClass(), "highestRating", 1009657063);
        setIntField(term98254, term98254.getClass(), "battlePoint", -104420972);
        setIntField(term98254, term98254.getClass(), "bestBattlePoint", 933032980);
        setIntField(term98254, term98254.getClass(), "overDamageBattlePoint", -1426390464);
        setBooleanField(term98254, term98254.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term98254, term98254.getClass(), "nameplateId", -1709715410);
        setIntField(term98254, term98254.getClass(), "trophyId", 1221046414);
        setIntField(term98254, term98254.getClass(), "cardId", 1271215502);
        setIntField(term98254, term98254.getClass(), "characterId", 106624322);
        setIntField(term98254, term98254.getClass(), "characterVoiceNo", 1664407428);
        setIntField(term98254, term98254.getClass(), "tabSetting", 980974243);
        setIntField(term98254, term98254.getClass(), "tabSortSetting", 1940850013);
        setIntField(term98254, term98254.getClass(), "cardCategorySetting", 2014370043);
        setIntField(term98254, term98254.getClass(), "cardSortSetting", 2086898490);
        setIntField(term98254, term98254.getClass(), "rivalScoreCategorySetting", -556807183);
        setIntField(term98254, term98254.getClass(), "playedTutorialBit", 2079852711);
        setIntField(term98254, term98254.getClass(), "firstTutorialCancelNum", -1960722897);
        setLongField(term98254, term98254.getClass(), "sumTechHighScore", 256887861773960063L);
        setLongField(term98254, term98254.getClass(), "sumTechBasicHighScore", 3134594715337882016L);
        setLongField(term98254, term98254.getClass(), "sumTechAdvancedHighScore", 844984809649867261L);
        setLongField(term98254, term98254.getClass(), "sumTechExpertHighScore", -5005897600184422009L);
        setLongField(term98254, term98254.getClass(), "sumTechMasterHighScore", -6725278387251669076L);
        setLongField(term98254, term98254.getClass(), "sumTechLunaticHighScore", -7749915504733119858L);
        setLongField(term98254, term98254.getClass(), "sumBattleHighScore", 3831373290233240912L);
        setLongField(term98254, term98254.getClass(), "sumBattleBasicHighScore", -8875705710065624742L);
        setLongField(term98254, term98254.getClass(), "sumBattleAdvancedHighScore", -8194245212128058943L);
        setLongField(term98254, term98254.getClass(), "sumBattleExpertHighScore", -3211414419641712590L);
        setLongField(term98254, term98254.getClass(), "sumBattleMasterHighScore", -7151126183741184747L);
        setLongField(term98254, term98254.getClass(), "sumBattleLunaticHighScore", -5196407870377205566L);
        setField(term98254, term98254.getClass(), "eventWatchedDate", "AOwXDxldzy");
        setField(term98254, term98254.getClass(), "cmEventWatchedDate", "oPjvcZQHAL");
        setField(term98254, term98254.getClass(), "firstGameId", "uCNCXXRNau");
        setField(term98254, term98254.getClass(), "firstRomVersion", "eRcAzhxOsA");
        setField(term98254, term98254.getClass(), "firstDataVersion", "uyydsCcltT");
        setField(term98254, term98254.getClass(), "firstPlayDate", "gRGZBrxxxv");
        setField(term98254, term98254.getClass(), "lastGameId", "YvYPXzCrcU");
        setField(term98254, term98254.getClass(), "lastRomVersion", "KESrHnsKCa");
        setField(term98254, term98254.getClass(), "lastDataVersion", "PRagOHCKmN");
        setField(term98254, term98254.getClass(), "compatibleCmVersion", "lvnwgMKxXk");
        setField(term98254, term98254.getClass(), "lastPlayDate", "FiSaNxpGPk");
        setIntField(term98254, term98254.getClass(), "lastPlaceId", 2058852943);
        setField(term98254, term98254.getClass(), "lastPlaceName", "QMzQRRhneO");
        setIntField(term98254, term98254.getClass(), "lastRegionId", 1189778174);
        setField(term98254, term98254.getClass(), "lastRegionName", "VFWNaQoDnL");
        setIntField(term98254, term98254.getClass(), "lastAllNetId", 1980524877);
        setField(term98254, term98254.getClass(), "lastClientId", "BFwtIJkozx");
        setIntField(term98254, term98254.getClass(), "lastUsedDeckId", 1572487602);
        setIntField(term98254, term98254.getClass(), "lastPlayMusicLevel", 354453982);
        setIntField(term98254, term98254.getClass(), "lastEmoneyBrand", 791608608);
        setField(term98252, term98252.getClass(), "user", term98254);
        setIntField(term98252, term98252.getClass(), "scenarioId", 832068739);
        setIntField(term98252, term98252.getClass(), "playCount", -1109536397);
        term98519 = new Long(-6773944686989684227L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98519;
        callMethod(klass, "setId", argTypes, term98252, args);
    }

};


