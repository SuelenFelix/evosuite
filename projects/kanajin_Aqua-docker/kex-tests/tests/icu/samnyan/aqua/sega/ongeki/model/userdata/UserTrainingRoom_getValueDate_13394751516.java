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

public class UserTrainingRoom_getValueDate_13394751516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15713;

    public UserTrainingRoom_getValueDate_13394751516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15719 = new Long(6617340557564669657L);
        term15713 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term15715 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term15717 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15738 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15748 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15713, term15713.getClass(), "id", -3243599172737171562L);
        setLongField(term15715, term15715.getClass(), "id", 3221586604131689186L);
        setLongField(term15717, term15717.getClass(), "id", -1283936527800858962L);
        setField(term15717, term15717.getClass(), "extId", term15719);
        setField(term15717, term15717.getClass(), "luid", "EMiMtYgfvr");
        setIntField(term15734, term15734.getClass(), "year", 2022);
        setShortField(term15734, term15734.getClass(), "month", (short) 11);
        setShortField(term15734, term15734.getClass(), "day", (short) 10);
        setField(term15733, term15733.getClass(), "date", term15734);
        setByteField(term15738, term15738.getClass(), "hour", (byte) 20);
        setByteField(term15738, term15738.getClass(), "minute", (byte) 8);
        setByteField(term15738, term15738.getClass(), "second", (byte) 35);
        setIntField(term15738, term15738.getClass(), "nano", 658416570);
        setField(term15733, term15733.getClass(), "time", term15738);
        setField(term15717, term15717.getClass(), "registerTime", term15733);
        setIntField(term15744, term15744.getClass(), "year", 2018);
        setShortField(term15744, term15744.getClass(), "month", (short) 11);
        setShortField(term15744, term15744.getClass(), "day", (short) 9);
        setField(term15743, term15743.getClass(), "date", term15744);
        setByteField(term15748, term15748.getClass(), "hour", (byte) 6);
        setByteField(term15748, term15748.getClass(), "minute", (byte) 8);
        setByteField(term15748, term15748.getClass(), "second", (byte) 32);
        setIntField(term15748, term15748.getClass(), "nano", 750733310);
        setField(term15743, term15743.getClass(), "time", term15748);
        setField(term15717, term15717.getClass(), "accessTime", term15743);
        setField(term15715, term15715.getClass(), "card", term15717);
        setField(term15715, term15715.getClass(), "userName", "OyYyYYnJuF");
        setIntField(term15715, term15715.getClass(), "level", -2058884635);
        setIntField(term15715, term15715.getClass(), "reincarnationNum", 1064185088);
        setLongField(term15715, term15715.getClass(), "exp", -8901189796092679153L);
        setLongField(term15715, term15715.getClass(), "point", 1731335447688885587L);
        setLongField(term15715, term15715.getClass(), "totalPoint", -6206610574921547811L);
        setIntField(term15715, term15715.getClass(), "playCount", -1249782654);
        setIntField(term15715, term15715.getClass(), "jewelCount", 399302934);
        setIntField(term15715, term15715.getClass(), "totalJewelCount", -1823255084);
        setIntField(term15715, term15715.getClass(), "medalCount", 793345010);
        setIntField(term15715, term15715.getClass(), "playerRating", -2092117838);
        setIntField(term15715, term15715.getClass(), "highestRating", 1524590776);
        setIntField(term15715, term15715.getClass(), "battlePoint", 1523896653);
        setIntField(term15715, term15715.getClass(), "bestBattlePoint", -1731921726);
        setIntField(term15715, term15715.getClass(), "overDamageBattlePoint", 919994471);
        setBooleanField(term15715, term15715.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term15715, term15715.getClass(), "nameplateId", 183531701);
        setIntField(term15715, term15715.getClass(), "trophyId", -974923743);
        setIntField(term15715, term15715.getClass(), "cardId", 1876738932);
        setIntField(term15715, term15715.getClass(), "characterId", -1870339027);
        setIntField(term15715, term15715.getClass(), "characterVoiceNo", -1549603566);
        setIntField(term15715, term15715.getClass(), "tabSetting", 1077223540);
        setIntField(term15715, term15715.getClass(), "tabSortSetting", -1823813592);
        setIntField(term15715, term15715.getClass(), "cardCategorySetting", -1644358555);
        setIntField(term15715, term15715.getClass(), "cardSortSetting", -388591034);
        setIntField(term15715, term15715.getClass(), "rivalScoreCategorySetting", -1270258033);
        setIntField(term15715, term15715.getClass(), "playedTutorialBit", 1677994069);
        setIntField(term15715, term15715.getClass(), "firstTutorialCancelNum", -439999692);
        setLongField(term15715, term15715.getClass(), "sumTechHighScore", -1625372334693179543L);
        setLongField(term15715, term15715.getClass(), "sumTechBasicHighScore", 3778691000276335279L);
        setLongField(term15715, term15715.getClass(), "sumTechAdvancedHighScore", 8453730687540121475L);
        setLongField(term15715, term15715.getClass(), "sumTechExpertHighScore", 8505184530074334434L);
        setLongField(term15715, term15715.getClass(), "sumTechMasterHighScore", -1610129689783641208L);
        setLongField(term15715, term15715.getClass(), "sumTechLunaticHighScore", -2613029888948149747L);
        setLongField(term15715, term15715.getClass(), "sumBattleHighScore", -6418282217428803693L);
        setLongField(term15715, term15715.getClass(), "sumBattleBasicHighScore", -5608790408657117046L);
        setLongField(term15715, term15715.getClass(), "sumBattleAdvancedHighScore", -6265886087280835813L);
        setLongField(term15715, term15715.getClass(), "sumBattleExpertHighScore", 8408467837292297525L);
        setLongField(term15715, term15715.getClass(), "sumBattleMasterHighScore", -5157976075409724332L);
        setLongField(term15715, term15715.getClass(), "sumBattleLunaticHighScore", 5638814204437933939L);
        setField(term15715, term15715.getClass(), "eventWatchedDate", "aYLvcxZohT");
        setField(term15715, term15715.getClass(), "cmEventWatchedDate", "mnHyQbMyld");
        setField(term15715, term15715.getClass(), "firstGameId", "KHtaDOIcJZ");
        setField(term15715, term15715.getClass(), "firstRomVersion", "vgdwrCZczl");
        setField(term15715, term15715.getClass(), "firstDataVersion", "gKMNrpKBpu");
        setField(term15715, term15715.getClass(), "firstPlayDate", "ZbHJVEqcoa");
        setField(term15715, term15715.getClass(), "lastGameId", "awDQVEVIKi");
        setField(term15715, term15715.getClass(), "lastRomVersion", "HJwNgUzZZR");
        setField(term15715, term15715.getClass(), "lastDataVersion", "FvUCZgTXhq");
        setField(term15715, term15715.getClass(), "compatibleCmVersion", "wWWidPCHzx");
        setField(term15715, term15715.getClass(), "lastPlayDate", "OwPIiBRuKK");
        setIntField(term15715, term15715.getClass(), "lastPlaceId", 924095007);
        setField(term15715, term15715.getClass(), "lastPlaceName", "sgfGySMODT");
        setIntField(term15715, term15715.getClass(), "lastRegionId", 1302110708);
        setField(term15715, term15715.getClass(), "lastRegionName", "ndAITnOsny");
        setIntField(term15715, term15715.getClass(), "lastAllNetId", 594705497);
        setField(term15715, term15715.getClass(), "lastClientId", "CVZnTiJucs");
        setIntField(term15715, term15715.getClass(), "lastUsedDeckId", -600102466);
        setIntField(term15715, term15715.getClass(), "lastPlayMusicLevel", -899986714);
        setIntField(term15715, term15715.getClass(), "lastEmoneyBrand", 1307244466);
        setField(term15713, term15713.getClass(), "user", term15715);
        setField(term15713, term15713.getClass(), "authKey", "ecHEQufXoq");
        setIntField(term15713, term15713.getClass(), "roomId", -252262096);
        setIntField(term15713, term15713.getClass(), "cardId", -37129068);
        setField(term15713, term15713.getClass(), "valueDate", "btBLMvHzJg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValueDate", argTypes, term15713, args);
    }

};


