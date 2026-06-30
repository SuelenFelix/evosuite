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

public class UserTradeItem_getChapterId_8666705293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151548;

    public UserTradeItem_getChapterId_8666705293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151554 = new Long(468487103823886117L);
        term151548 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term151550 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term151552 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151573 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151583 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151548, term151548.getClass(), "id", 588322502759368578L);
        setLongField(term151550, term151550.getClass(), "id", -2020614193907843026L);
        setLongField(term151552, term151552.getClass(), "id", -8155160977336571516L);
        setField(term151552, term151552.getClass(), "extId", term151554);
        setField(term151552, term151552.getClass(), "luid", "FfDXECFXSk");
        setIntField(term151569, term151569.getClass(), "year", 2011);
        setShortField(term151569, term151569.getClass(), "month", (short) 4);
        setShortField(term151569, term151569.getClass(), "day", (short) 30);
        setField(term151568, term151568.getClass(), "date", term151569);
        setByteField(term151573, term151573.getClass(), "hour", (byte) 5);
        setByteField(term151573, term151573.getClass(), "minute", (byte) 2);
        setByteField(term151573, term151573.getClass(), "second", (byte) 59);
        setIntField(term151573, term151573.getClass(), "nano", 800923694);
        setField(term151568, term151568.getClass(), "time", term151573);
        setField(term151552, term151552.getClass(), "registerTime", term151568);
        setIntField(term151579, term151579.getClass(), "year", 2027);
        setShortField(term151579, term151579.getClass(), "month", (short) 5);
        setShortField(term151579, term151579.getClass(), "day", (short) 8);
        setField(term151578, term151578.getClass(), "date", term151579);
        setByteField(term151583, term151583.getClass(), "hour", (byte) 4);
        setByteField(term151583, term151583.getClass(), "minute", (byte) 0);
        setByteField(term151583, term151583.getClass(), "second", (byte) 19);
        setIntField(term151583, term151583.getClass(), "nano", 400713347);
        setField(term151578, term151578.getClass(), "time", term151583);
        setField(term151552, term151552.getClass(), "accessTime", term151578);
        setField(term151550, term151550.getClass(), "card", term151552);
        setField(term151550, term151550.getClass(), "userName", "YfMHlokFKp");
        setIntField(term151550, term151550.getClass(), "level", 1239505784);
        setIntField(term151550, term151550.getClass(), "reincarnationNum", 1973303309);
        setLongField(term151550, term151550.getClass(), "exp", 424102814393853162L);
        setLongField(term151550, term151550.getClass(), "point", -5437497412119566438L);
        setLongField(term151550, term151550.getClass(), "totalPoint", -4765892116338577977L);
        setIntField(term151550, term151550.getClass(), "playCount", 1732667310);
        setIntField(term151550, term151550.getClass(), "jewelCount", 1895584040);
        setIntField(term151550, term151550.getClass(), "totalJewelCount", -51888709);
        setIntField(term151550, term151550.getClass(), "medalCount", 1238498169);
        setIntField(term151550, term151550.getClass(), "playerRating", -1375200779);
        setIntField(term151550, term151550.getClass(), "highestRating", 1855996400);
        setIntField(term151550, term151550.getClass(), "battlePoint", 1409066038);
        setIntField(term151550, term151550.getClass(), "bestBattlePoint", 987148838);
        setIntField(term151550, term151550.getClass(), "overDamageBattlePoint", 2060323601);
        setBooleanField(term151550, term151550.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term151550, term151550.getClass(), "nameplateId", -1877309791);
        setIntField(term151550, term151550.getClass(), "trophyId", 1057601439);
        setIntField(term151550, term151550.getClass(), "cardId", 1009362436);
        setIntField(term151550, term151550.getClass(), "characterId", 465082402);
        setIntField(term151550, term151550.getClass(), "characterVoiceNo", -572966539);
        setIntField(term151550, term151550.getClass(), "tabSetting", -70620606);
        setIntField(term151550, term151550.getClass(), "tabSortSetting", -131245628);
        setIntField(term151550, term151550.getClass(), "cardCategorySetting", 1389986243);
        setIntField(term151550, term151550.getClass(), "cardSortSetting", 1400795661);
        setIntField(term151550, term151550.getClass(), "rivalScoreCategorySetting", 1870026461);
        setIntField(term151550, term151550.getClass(), "playedTutorialBit", -2127214606);
        setIntField(term151550, term151550.getClass(), "firstTutorialCancelNum", -1001373806);
        setLongField(term151550, term151550.getClass(), "sumTechHighScore", 5181335103536619869L);
        setLongField(term151550, term151550.getClass(), "sumTechBasicHighScore", 1928896533909360947L);
        setLongField(term151550, term151550.getClass(), "sumTechAdvancedHighScore", -1584438896384760865L);
        setLongField(term151550, term151550.getClass(), "sumTechExpertHighScore", 8193875437648988569L);
        setLongField(term151550, term151550.getClass(), "sumTechMasterHighScore", 4379641673357845191L);
        setLongField(term151550, term151550.getClass(), "sumTechLunaticHighScore", 448875090764705066L);
        setLongField(term151550, term151550.getClass(), "sumBattleHighScore", -3628350199087571008L);
        setLongField(term151550, term151550.getClass(), "sumBattleBasicHighScore", 1727677323845860831L);
        setLongField(term151550, term151550.getClass(), "sumBattleAdvancedHighScore", -5689485253872606188L);
        setLongField(term151550, term151550.getClass(), "sumBattleExpertHighScore", -6285237283805727297L);
        setLongField(term151550, term151550.getClass(), "sumBattleMasterHighScore", 5275929567294632083L);
        setLongField(term151550, term151550.getClass(), "sumBattleLunaticHighScore", 3887073949062468445L);
        setField(term151550, term151550.getClass(), "eventWatchedDate", "mvxWIPkluG");
        setField(term151550, term151550.getClass(), "cmEventWatchedDate", "wOkHioNorr");
        setField(term151550, term151550.getClass(), "firstGameId", "UrMOWCrQMH");
        setField(term151550, term151550.getClass(), "firstRomVersion", "WvuyCTtUTF");
        setField(term151550, term151550.getClass(), "firstDataVersion", "mSDLNUwhJE");
        setField(term151550, term151550.getClass(), "firstPlayDate", "kydwcBIblz");
        setField(term151550, term151550.getClass(), "lastGameId", "uALaoojxvW");
        setField(term151550, term151550.getClass(), "lastRomVersion", "FrsBgmvjej");
        setField(term151550, term151550.getClass(), "lastDataVersion", "OmLoZDdbMy");
        setField(term151550, term151550.getClass(), "compatibleCmVersion", "mbNJbZsitQ");
        setField(term151550, term151550.getClass(), "lastPlayDate", "VMuWmeVPqW");
        setIntField(term151550, term151550.getClass(), "lastPlaceId", -1431802716);
        setField(term151550, term151550.getClass(), "lastPlaceName", "wtmpUxaoro");
        setIntField(term151550, term151550.getClass(), "lastRegionId", -1927075382);
        setField(term151550, term151550.getClass(), "lastRegionName", "lZpqCAUiaE");
        setIntField(term151550, term151550.getClass(), "lastAllNetId", -1834614967);
        setField(term151550, term151550.getClass(), "lastClientId", "rwsydXSAIm");
        setIntField(term151550, term151550.getClass(), "lastUsedDeckId", 2144962544);
        setIntField(term151550, term151550.getClass(), "lastPlayMusicLevel", 28864647);
        setIntField(term151550, term151550.getClass(), "lastEmoneyBrand", 376502371);
        setField(term151548, term151548.getClass(), "user", term151550);
        setIntField(term151548, term151548.getClass(), "chapterId", -1190514622);
        setIntField(term151548, term151548.getClass(), "tradeItemId", -664203259);
        setIntField(term151548, term151548.getClass(), "tradeCount", 1182607812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChapterId", argTypes, term151548, args);
    }

};


