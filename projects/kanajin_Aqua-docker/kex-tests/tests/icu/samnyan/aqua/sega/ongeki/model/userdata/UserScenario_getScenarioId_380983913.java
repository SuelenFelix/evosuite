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

public class UserScenario_getScenarioId_380983913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97398;

    public UserScenario_getScenarioId_380983913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97404 = new Long(185793058502220865L);
        term97398 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term97400 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term97402 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97423 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97433 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97398, term97398.getClass(), "id", -6018822049134958029L);
        setLongField(term97400, term97400.getClass(), "id", -641768322605539260L);
        setLongField(term97402, term97402.getClass(), "id", 7489532448652137497L);
        setField(term97402, term97402.getClass(), "extId", term97404);
        setField(term97402, term97402.getClass(), "luid", "ucSaPNSgwx");
        setIntField(term97419, term97419.getClass(), "year", 2021);
        setShortField(term97419, term97419.getClass(), "month", (short) 9);
        setShortField(term97419, term97419.getClass(), "day", (short) 7);
        setField(term97418, term97418.getClass(), "date", term97419);
        setByteField(term97423, term97423.getClass(), "hour", (byte) 16);
        setByteField(term97423, term97423.getClass(), "minute", (byte) 9);
        setByteField(term97423, term97423.getClass(), "second", (byte) 0);
        setIntField(term97423, term97423.getClass(), "nano", 530894568);
        setField(term97418, term97418.getClass(), "time", term97423);
        setField(term97402, term97402.getClass(), "registerTime", term97418);
        setIntField(term97429, term97429.getClass(), "year", 2016);
        setShortField(term97429, term97429.getClass(), "month", (short) 8);
        setShortField(term97429, term97429.getClass(), "day", (short) 27);
        setField(term97428, term97428.getClass(), "date", term97429);
        setByteField(term97433, term97433.getClass(), "hour", (byte) 3);
        setByteField(term97433, term97433.getClass(), "minute", (byte) 10);
        setByteField(term97433, term97433.getClass(), "second", (byte) 27);
        setIntField(term97433, term97433.getClass(), "nano", 429898470);
        setField(term97428, term97428.getClass(), "time", term97433);
        setField(term97402, term97402.getClass(), "accessTime", term97428);
        setField(term97400, term97400.getClass(), "card", term97402);
        setField(term97400, term97400.getClass(), "userName", "rsRvTIjmLJ");
        setIntField(term97400, term97400.getClass(), "level", 665331267);
        setIntField(term97400, term97400.getClass(), "reincarnationNum", -2014999682);
        setLongField(term97400, term97400.getClass(), "exp", 1741745847767936524L);
        setLongField(term97400, term97400.getClass(), "point", -7813097860460548694L);
        setLongField(term97400, term97400.getClass(), "totalPoint", -2180637454140991363L);
        setIntField(term97400, term97400.getClass(), "playCount", 1982258261);
        setIntField(term97400, term97400.getClass(), "jewelCount", -1489112012);
        setIntField(term97400, term97400.getClass(), "totalJewelCount", -723107224);
        setIntField(term97400, term97400.getClass(), "medalCount", 304541875);
        setIntField(term97400, term97400.getClass(), "playerRating", -1638286616);
        setIntField(term97400, term97400.getClass(), "highestRating", -256866404);
        setIntField(term97400, term97400.getClass(), "battlePoint", -354956895);
        setIntField(term97400, term97400.getClass(), "bestBattlePoint", 1889003786);
        setIntField(term97400, term97400.getClass(), "overDamageBattlePoint", 452911848);
        setBooleanField(term97400, term97400.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term97400, term97400.getClass(), "nameplateId", 2003994890);
        setIntField(term97400, term97400.getClass(), "trophyId", 2135032815);
        setIntField(term97400, term97400.getClass(), "cardId", 2102441611);
        setIntField(term97400, term97400.getClass(), "characterId", -972921113);
        setIntField(term97400, term97400.getClass(), "characterVoiceNo", -1692479417);
        setIntField(term97400, term97400.getClass(), "tabSetting", -1090532898);
        setIntField(term97400, term97400.getClass(), "tabSortSetting", 1732323444);
        setIntField(term97400, term97400.getClass(), "cardCategorySetting", -1704583810);
        setIntField(term97400, term97400.getClass(), "cardSortSetting", -1057666750);
        setIntField(term97400, term97400.getClass(), "rivalScoreCategorySetting", 702126350);
        setIntField(term97400, term97400.getClass(), "playedTutorialBit", -1320161427);
        setIntField(term97400, term97400.getClass(), "firstTutorialCancelNum", 841954160);
        setLongField(term97400, term97400.getClass(), "sumTechHighScore", -3593615111110492012L);
        setLongField(term97400, term97400.getClass(), "sumTechBasicHighScore", 659947615533781814L);
        setLongField(term97400, term97400.getClass(), "sumTechAdvancedHighScore", -4752004427270923675L);
        setLongField(term97400, term97400.getClass(), "sumTechExpertHighScore", -5521161457467523042L);
        setLongField(term97400, term97400.getClass(), "sumTechMasterHighScore", 5986332249270190194L);
        setLongField(term97400, term97400.getClass(), "sumTechLunaticHighScore", -3409249187038060561L);
        setLongField(term97400, term97400.getClass(), "sumBattleHighScore", 3666152876006735353L);
        setLongField(term97400, term97400.getClass(), "sumBattleBasicHighScore", -2786639501005568264L);
        setLongField(term97400, term97400.getClass(), "sumBattleAdvancedHighScore", 3887138438306476169L);
        setLongField(term97400, term97400.getClass(), "sumBattleExpertHighScore", 1288678855951342110L);
        setLongField(term97400, term97400.getClass(), "sumBattleMasterHighScore", -2483785120171854174L);
        setLongField(term97400, term97400.getClass(), "sumBattleLunaticHighScore", 246102557771929635L);
        setField(term97400, term97400.getClass(), "eventWatchedDate", "VOBEeWmzSF");
        setField(term97400, term97400.getClass(), "cmEventWatchedDate", "cVeaNxcyvs");
        setField(term97400, term97400.getClass(), "firstGameId", "fIMpTnCtOM");
        setField(term97400, term97400.getClass(), "firstRomVersion", "zsVQmqfyvx");
        setField(term97400, term97400.getClass(), "firstDataVersion", "DKFEMZUVhd");
        setField(term97400, term97400.getClass(), "firstPlayDate", "xhjqWwsjmc");
        setField(term97400, term97400.getClass(), "lastGameId", "GmFORCKDuz");
        setField(term97400, term97400.getClass(), "lastRomVersion", "uiZFXEVOdS");
        setField(term97400, term97400.getClass(), "lastDataVersion", "kLUzmGfJsV");
        setField(term97400, term97400.getClass(), "compatibleCmVersion", "NtSnrngAmM");
        setField(term97400, term97400.getClass(), "lastPlayDate", "OYnrHBNcZV");
        setIntField(term97400, term97400.getClass(), "lastPlaceId", 1417577834);
        setField(term97400, term97400.getClass(), "lastPlaceName", "pwkepWBxgL");
        setIntField(term97400, term97400.getClass(), "lastRegionId", -1641288466);
        setField(term97400, term97400.getClass(), "lastRegionName", "RDXQLsyKOu");
        setIntField(term97400, term97400.getClass(), "lastAllNetId", 1755218175);
        setField(term97400, term97400.getClass(), "lastClientId", "ZnIRhQxVXw");
        setIntField(term97400, term97400.getClass(), "lastUsedDeckId", 647511055);
        setIntField(term97400, term97400.getClass(), "lastPlayMusicLevel", -1949921728);
        setIntField(term97400, term97400.getClass(), "lastEmoneyBrand", 932437963);
        setField(term97398, term97398.getClass(), "user", term97400);
        setIntField(term97398, term97398.getClass(), "scenarioId", -194822585);
        setIntField(term97398, term97398.getClass(), "playCount", 1420387294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScenarioId", argTypes, term97398, args);
    }

};


