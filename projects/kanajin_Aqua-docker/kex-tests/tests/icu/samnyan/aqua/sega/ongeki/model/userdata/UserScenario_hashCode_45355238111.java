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

public class UserScenario_hashCode_45355238111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101245;

    public UserScenario_hashCode_45355238111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101251 = new Long(-419800263764810394L);
        term101245 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term101247 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term101249 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101280 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101245, term101245.getClass(), "id", -3661358124870959771L);
        setLongField(term101247, term101247.getClass(), "id", -8120684450443636180L);
        setLongField(term101249, term101249.getClass(), "id", -1038564761233966381L);
        setField(term101249, term101249.getClass(), "extId", term101251);
        setField(term101249, term101249.getClass(), "luid", "tiGVUUaQMv");
        setIntField(term101266, term101266.getClass(), "year", 2027);
        setShortField(term101266, term101266.getClass(), "month", (short) 9);
        setShortField(term101266, term101266.getClass(), "day", (short) 19);
        setField(term101265, term101265.getClass(), "date", term101266);
        setByteField(term101270, term101270.getClass(), "hour", (byte) 13);
        setByteField(term101270, term101270.getClass(), "minute", (byte) 17);
        setByteField(term101270, term101270.getClass(), "second", (byte) 43);
        setIntField(term101270, term101270.getClass(), "nano", 359493485);
        setField(term101265, term101265.getClass(), "time", term101270);
        setField(term101249, term101249.getClass(), "registerTime", term101265);
        setIntField(term101276, term101276.getClass(), "year", 2028);
        setShortField(term101276, term101276.getClass(), "month", (short) 2);
        setShortField(term101276, term101276.getClass(), "day", (short) 3);
        setField(term101275, term101275.getClass(), "date", term101276);
        setByteField(term101280, term101280.getClass(), "hour", (byte) 14);
        setByteField(term101280, term101280.getClass(), "minute", (byte) 31);
        setByteField(term101280, term101280.getClass(), "second", (byte) 5);
        setIntField(term101280, term101280.getClass(), "nano", 770924836);
        setField(term101275, term101275.getClass(), "time", term101280);
        setField(term101249, term101249.getClass(), "accessTime", term101275);
        setField(term101247, term101247.getClass(), "card", term101249);
        setField(term101247, term101247.getClass(), "userName", "NzoNAsaJqr");
        setIntField(term101247, term101247.getClass(), "level", 1611223068);
        setIntField(term101247, term101247.getClass(), "reincarnationNum", 1902439631);
        setLongField(term101247, term101247.getClass(), "exp", 3017351470610010745L);
        setLongField(term101247, term101247.getClass(), "point", -8471313227858030061L);
        setLongField(term101247, term101247.getClass(), "totalPoint", -8456017519174078137L);
        setIntField(term101247, term101247.getClass(), "playCount", -18255187);
        setIntField(term101247, term101247.getClass(), "jewelCount", -1088335552);
        setIntField(term101247, term101247.getClass(), "totalJewelCount", -405643924);
        setIntField(term101247, term101247.getClass(), "medalCount", -312877355);
        setIntField(term101247, term101247.getClass(), "playerRating", -1575759244);
        setIntField(term101247, term101247.getClass(), "highestRating", -130757852);
        setIntField(term101247, term101247.getClass(), "battlePoint", -1578353749);
        setIntField(term101247, term101247.getClass(), "bestBattlePoint", -1729440681);
        setIntField(term101247, term101247.getClass(), "overDamageBattlePoint", -1451086024);
        setBooleanField(term101247, term101247.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term101247, term101247.getClass(), "nameplateId", -1484385005);
        setIntField(term101247, term101247.getClass(), "trophyId", 1911846407);
        setIntField(term101247, term101247.getClass(), "cardId", -1861622294);
        setIntField(term101247, term101247.getClass(), "characterId", -1348867162);
        setIntField(term101247, term101247.getClass(), "characterVoiceNo", -1365727758);
        setIntField(term101247, term101247.getClass(), "tabSetting", -1623272453);
        setIntField(term101247, term101247.getClass(), "tabSortSetting", -165330808);
        setIntField(term101247, term101247.getClass(), "cardCategorySetting", 1087515293);
        setIntField(term101247, term101247.getClass(), "cardSortSetting", 1480080450);
        setIntField(term101247, term101247.getClass(), "rivalScoreCategorySetting", -1230976797);
        setIntField(term101247, term101247.getClass(), "playedTutorialBit", 175415190);
        setIntField(term101247, term101247.getClass(), "firstTutorialCancelNum", 1375754973);
        setLongField(term101247, term101247.getClass(), "sumTechHighScore", -361646163347941624L);
        setLongField(term101247, term101247.getClass(), "sumTechBasicHighScore", -4370032684615634699L);
        setLongField(term101247, term101247.getClass(), "sumTechAdvancedHighScore", -7192603380963907943L);
        setLongField(term101247, term101247.getClass(), "sumTechExpertHighScore", 1063278168782243311L);
        setLongField(term101247, term101247.getClass(), "sumTechMasterHighScore", -393164980593030950L);
        setLongField(term101247, term101247.getClass(), "sumTechLunaticHighScore", -9067010856580120712L);
        setLongField(term101247, term101247.getClass(), "sumBattleHighScore", 4155363879463850350L);
        setLongField(term101247, term101247.getClass(), "sumBattleBasicHighScore", 6434875741131536553L);
        setLongField(term101247, term101247.getClass(), "sumBattleAdvancedHighScore", -5724018285837180378L);
        setLongField(term101247, term101247.getClass(), "sumBattleExpertHighScore", 4119682614384825784L);
        setLongField(term101247, term101247.getClass(), "sumBattleMasterHighScore", -7810027323437632531L);
        setLongField(term101247, term101247.getClass(), "sumBattleLunaticHighScore", 6282706686257533309L);
        setField(term101247, term101247.getClass(), "eventWatchedDate", "VRKEuPftph");
        setField(term101247, term101247.getClass(), "cmEventWatchedDate", "DkRegMkIWt");
        setField(term101247, term101247.getClass(), "firstGameId", "IIOFAGjcXe");
        setField(term101247, term101247.getClass(), "firstRomVersion", "XsAUdWVfqM");
        setField(term101247, term101247.getClass(), "firstDataVersion", "WRKAHqtTqT");
        setField(term101247, term101247.getClass(), "firstPlayDate", "EkgwvUqGYF");
        setField(term101247, term101247.getClass(), "lastGameId", "sbtPNrurvf");
        setField(term101247, term101247.getClass(), "lastRomVersion", "zomtOAIouP");
        setField(term101247, term101247.getClass(), "lastDataVersion", "pwHkUmkBGN");
        setField(term101247, term101247.getClass(), "compatibleCmVersion", "TZJzEpeSDz");
        setField(term101247, term101247.getClass(), "lastPlayDate", "CEVnfPOBDk");
        setIntField(term101247, term101247.getClass(), "lastPlaceId", 1585713609);
        setField(term101247, term101247.getClass(), "lastPlaceName", "JUpDTRXGtv");
        setIntField(term101247, term101247.getClass(), "lastRegionId", 13355218);
        setField(term101247, term101247.getClass(), "lastRegionName", "cKBnwzMCia");
        setIntField(term101247, term101247.getClass(), "lastAllNetId", -904535263);
        setField(term101247, term101247.getClass(), "lastClientId", "QWmZpWASOK");
        setIntField(term101247, term101247.getClass(), "lastUsedDeckId", 842353151);
        setIntField(term101247, term101247.getClass(), "lastPlayMusicLevel", -1777916559);
        setIntField(term101247, term101247.getClass(), "lastEmoneyBrand", 70751907);
        setField(term101245, term101245.getClass(), "user", term101247);
        setIntField(term101245, term101245.getClass(), "scenarioId", 275138155);
        setIntField(term101245, term101245.getClass(), "playCount", 1382281892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term101245, args);
    }

};


