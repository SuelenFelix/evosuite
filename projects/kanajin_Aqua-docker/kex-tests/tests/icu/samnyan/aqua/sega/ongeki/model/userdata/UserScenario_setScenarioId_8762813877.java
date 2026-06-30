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
import java.lang.Integer;

public class UserScenario_setScenarioId_8762813877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99531;
     Object term99798;

    public UserScenario_setScenarioId_8762813877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99537 = new Long(3230472384687362867L);
        term99531 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term99533 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term99535 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99566 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99531, term99531.getClass(), "id", 3498203783805987897L);
        setLongField(term99533, term99533.getClass(), "id", 1448097862876060784L);
        setLongField(term99535, term99535.getClass(), "id", 8557138019134828645L);
        setField(term99535, term99535.getClass(), "extId", term99537);
        setField(term99535, term99535.getClass(), "luid", "FcaMVDYJay");
        setIntField(term99552, term99552.getClass(), "year", 2026);
        setShortField(term99552, term99552.getClass(), "month", (short) 8);
        setShortField(term99552, term99552.getClass(), "day", (short) 6);
        setField(term99551, term99551.getClass(), "date", term99552);
        setByteField(term99556, term99556.getClass(), "hour", (byte) 17);
        setByteField(term99556, term99556.getClass(), "minute", (byte) 50);
        setByteField(term99556, term99556.getClass(), "second", (byte) 27);
        setIntField(term99556, term99556.getClass(), "nano", 8961627);
        setField(term99551, term99551.getClass(), "time", term99556);
        setField(term99535, term99535.getClass(), "registerTime", term99551);
        setIntField(term99562, term99562.getClass(), "year", 2018);
        setShortField(term99562, term99562.getClass(), "month", (short) 7);
        setShortField(term99562, term99562.getClass(), "day", (short) 30);
        setField(term99561, term99561.getClass(), "date", term99562);
        setByteField(term99566, term99566.getClass(), "hour", (byte) 22);
        setByteField(term99566, term99566.getClass(), "minute", (byte) 55);
        setByteField(term99566, term99566.getClass(), "second", (byte) 39);
        setIntField(term99566, term99566.getClass(), "nano", 564474532);
        setField(term99561, term99561.getClass(), "time", term99566);
        setField(term99535, term99535.getClass(), "accessTime", term99561);
        setField(term99533, term99533.getClass(), "card", term99535);
        setField(term99533, term99533.getClass(), "userName", "pLLUuhaofY");
        setIntField(term99533, term99533.getClass(), "level", -1320147216);
        setIntField(term99533, term99533.getClass(), "reincarnationNum", -2003639421);
        setLongField(term99533, term99533.getClass(), "exp", -4452401102510626548L);
        setLongField(term99533, term99533.getClass(), "point", -8645820241213403338L);
        setLongField(term99533, term99533.getClass(), "totalPoint", 2816249404742724931L);
        setIntField(term99533, term99533.getClass(), "playCount", -1986137013);
        setIntField(term99533, term99533.getClass(), "jewelCount", 1067010136);
        setIntField(term99533, term99533.getClass(), "totalJewelCount", 1093205391);
        setIntField(term99533, term99533.getClass(), "medalCount", 712406676);
        setIntField(term99533, term99533.getClass(), "playerRating", -689175370);
        setIntField(term99533, term99533.getClass(), "highestRating", 1928157231);
        setIntField(term99533, term99533.getClass(), "battlePoint", -2074171560);
        setIntField(term99533, term99533.getClass(), "bestBattlePoint", -1484133359);
        setIntField(term99533, term99533.getClass(), "overDamageBattlePoint", -221900568);
        setBooleanField(term99533, term99533.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term99533, term99533.getClass(), "nameplateId", -660551612);
        setIntField(term99533, term99533.getClass(), "trophyId", -1263481774);
        setIntField(term99533, term99533.getClass(), "cardId", 304959828);
        setIntField(term99533, term99533.getClass(), "characterId", -398737037);
        setIntField(term99533, term99533.getClass(), "characterVoiceNo", 108801223);
        setIntField(term99533, term99533.getClass(), "tabSetting", 1181798962);
        setIntField(term99533, term99533.getClass(), "tabSortSetting", 1950935768);
        setIntField(term99533, term99533.getClass(), "cardCategorySetting", -733715380);
        setIntField(term99533, term99533.getClass(), "cardSortSetting", 1537598422);
        setIntField(term99533, term99533.getClass(), "rivalScoreCategorySetting", 2011217936);
        setIntField(term99533, term99533.getClass(), "playedTutorialBit", 490201050);
        setIntField(term99533, term99533.getClass(), "firstTutorialCancelNum", 1544509853);
        setLongField(term99533, term99533.getClass(), "sumTechHighScore", 1884132702816460886L);
        setLongField(term99533, term99533.getClass(), "sumTechBasicHighScore", -146957100924633583L);
        setLongField(term99533, term99533.getClass(), "sumTechAdvancedHighScore", -2066293017654650396L);
        setLongField(term99533, term99533.getClass(), "sumTechExpertHighScore", -7667306510947529358L);
        setLongField(term99533, term99533.getClass(), "sumTechMasterHighScore", 2125142245553494427L);
        setLongField(term99533, term99533.getClass(), "sumTechLunaticHighScore", 2948932720021770792L);
        setLongField(term99533, term99533.getClass(), "sumBattleHighScore", 6996026879949446195L);
        setLongField(term99533, term99533.getClass(), "sumBattleBasicHighScore", -4777127728733378629L);
        setLongField(term99533, term99533.getClass(), "sumBattleAdvancedHighScore", 7337740023273342727L);
        setLongField(term99533, term99533.getClass(), "sumBattleExpertHighScore", 5100914994140818113L);
        setLongField(term99533, term99533.getClass(), "sumBattleMasterHighScore", 1399778523078780919L);
        setLongField(term99533, term99533.getClass(), "sumBattleLunaticHighScore", -8298604862992870049L);
        setField(term99533, term99533.getClass(), "eventWatchedDate", "dCIHiLfkJL");
        setField(term99533, term99533.getClass(), "cmEventWatchedDate", "bMYsCPikwh");
        setField(term99533, term99533.getClass(), "firstGameId", "hZENcMRjJX");
        setField(term99533, term99533.getClass(), "firstRomVersion", "iUsNqPEgsp");
        setField(term99533, term99533.getClass(), "firstDataVersion", "ODyqlitqRS");
        setField(term99533, term99533.getClass(), "firstPlayDate", "BKEyXkrXND");
        setField(term99533, term99533.getClass(), "lastGameId", "xpmkTXUaIW");
        setField(term99533, term99533.getClass(), "lastRomVersion", "mkwXyNcVfj");
        setField(term99533, term99533.getClass(), "lastDataVersion", "JaYInVuGAK");
        setField(term99533, term99533.getClass(), "compatibleCmVersion", "BhaPbaZeBl");
        setField(term99533, term99533.getClass(), "lastPlayDate", "GYqwdcmcTy");
        setIntField(term99533, term99533.getClass(), "lastPlaceId", -837360714);
        setField(term99533, term99533.getClass(), "lastPlaceName", "gUVQwUdnBZ");
        setIntField(term99533, term99533.getClass(), "lastRegionId", -605017762);
        setField(term99533, term99533.getClass(), "lastRegionName", "DbGJbEhLhl");
        setIntField(term99533, term99533.getClass(), "lastAllNetId", -1606452163);
        setField(term99533, term99533.getClass(), "lastClientId", "BGxrtAjHqX");
        setIntField(term99533, term99533.getClass(), "lastUsedDeckId", -1590822439);
        setIntField(term99533, term99533.getClass(), "lastPlayMusicLevel", -141055649);
        setIntField(term99533, term99533.getClass(), "lastEmoneyBrand", 2045269013);
        setField(term99531, term99531.getClass(), "user", term99533);
        setIntField(term99531, term99531.getClass(), "scenarioId", 1260268717);
        setIntField(term99531, term99531.getClass(), "playCount", -601011951);
        term99798 = new Integer(700386109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99798;
        callMethod(klass, "setScenarioId", argTypes, term99531, args);
    }

};


