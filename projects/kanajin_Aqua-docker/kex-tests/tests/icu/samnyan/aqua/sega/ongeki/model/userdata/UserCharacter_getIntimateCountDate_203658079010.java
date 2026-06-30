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

public class UserCharacter_getIntimateCountDate_203658079010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172259;

    public UserCharacter_getIntimateCountDate_203658079010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term172265 = new Long(7799452759993694308L);
        term172259 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term172261 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term172263 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term172279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172284 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172294 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term172259, term172259.getClass(), "id", 3361198376644316821L);
        setLongField(term172261, term172261.getClass(), "id", -2596368385325108340L);
        setLongField(term172263, term172263.getClass(), "id", -9006683565777348144L);
        setField(term172263, term172263.getClass(), "extId", term172265);
        setField(term172263, term172263.getClass(), "luid", "EAAhEIkHFA");
        setIntField(term172280, term172280.getClass(), "year", 2016);
        setShortField(term172280, term172280.getClass(), "month", (short) 12);
        setShortField(term172280, term172280.getClass(), "day", (short) 21);
        setField(term172279, term172279.getClass(), "date", term172280);
        setByteField(term172284, term172284.getClass(), "hour", (byte) 14);
        setByteField(term172284, term172284.getClass(), "minute", (byte) 3);
        setByteField(term172284, term172284.getClass(), "second", (byte) 9);
        setIntField(term172284, term172284.getClass(), "nano", 805869273);
        setField(term172279, term172279.getClass(), "time", term172284);
        setField(term172263, term172263.getClass(), "registerTime", term172279);
        setIntField(term172290, term172290.getClass(), "year", 2011);
        setShortField(term172290, term172290.getClass(), "month", (short) 12);
        setShortField(term172290, term172290.getClass(), "day", (short) 31);
        setField(term172289, term172289.getClass(), "date", term172290);
        setByteField(term172294, term172294.getClass(), "hour", (byte) 6);
        setByteField(term172294, term172294.getClass(), "minute", (byte) 27);
        setByteField(term172294, term172294.getClass(), "second", (byte) 8);
        setIntField(term172294, term172294.getClass(), "nano", 782094318);
        setField(term172289, term172289.getClass(), "time", term172294);
        setField(term172263, term172263.getClass(), "accessTime", term172289);
        setField(term172261, term172261.getClass(), "card", term172263);
        setField(term172261, term172261.getClass(), "userName", "nYZgnTFrAJ");
        setIntField(term172261, term172261.getClass(), "level", -702531240);
        setIntField(term172261, term172261.getClass(), "reincarnationNum", -1724125016);
        setLongField(term172261, term172261.getClass(), "exp", 6564495724575130929L);
        setLongField(term172261, term172261.getClass(), "point", -8620792848897119300L);
        setLongField(term172261, term172261.getClass(), "totalPoint", 9102003843549749951L);
        setIntField(term172261, term172261.getClass(), "playCount", 1092747930);
        setIntField(term172261, term172261.getClass(), "jewelCount", -1054208604);
        setIntField(term172261, term172261.getClass(), "totalJewelCount", -1676701884);
        setIntField(term172261, term172261.getClass(), "medalCount", -608378923);
        setIntField(term172261, term172261.getClass(), "playerRating", -43696626);
        setIntField(term172261, term172261.getClass(), "highestRating", -1432224922);
        setIntField(term172261, term172261.getClass(), "battlePoint", 646086802);
        setIntField(term172261, term172261.getClass(), "bestBattlePoint", 1687786689);
        setIntField(term172261, term172261.getClass(), "overDamageBattlePoint", -1847861460);
        setBooleanField(term172261, term172261.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term172261, term172261.getClass(), "nameplateId", 772896495);
        setIntField(term172261, term172261.getClass(), "trophyId", -1637788067);
        setIntField(term172261, term172261.getClass(), "cardId", 1784675310);
        setIntField(term172261, term172261.getClass(), "characterId", 87847958);
        setIntField(term172261, term172261.getClass(), "characterVoiceNo", -2087513809);
        setIntField(term172261, term172261.getClass(), "tabSetting", 107693459);
        setIntField(term172261, term172261.getClass(), "tabSortSetting", -179154974);
        setIntField(term172261, term172261.getClass(), "cardCategorySetting", 1618115246);
        setIntField(term172261, term172261.getClass(), "cardSortSetting", -465989702);
        setIntField(term172261, term172261.getClass(), "rivalScoreCategorySetting", -1643433512);
        setIntField(term172261, term172261.getClass(), "playedTutorialBit", 2101799999);
        setIntField(term172261, term172261.getClass(), "firstTutorialCancelNum", -318818284);
        setLongField(term172261, term172261.getClass(), "sumTechHighScore", 5989562756283635902L);
        setLongField(term172261, term172261.getClass(), "sumTechBasicHighScore", -4456338403298981816L);
        setLongField(term172261, term172261.getClass(), "sumTechAdvancedHighScore", 3322189457255921095L);
        setLongField(term172261, term172261.getClass(), "sumTechExpertHighScore", -7448875288248747337L);
        setLongField(term172261, term172261.getClass(), "sumTechMasterHighScore", -7493334279992579335L);
        setLongField(term172261, term172261.getClass(), "sumTechLunaticHighScore", 2722843198104900882L);
        setLongField(term172261, term172261.getClass(), "sumBattleHighScore", -8245205007746937712L);
        setLongField(term172261, term172261.getClass(), "sumBattleBasicHighScore", 1527163968002418174L);
        setLongField(term172261, term172261.getClass(), "sumBattleAdvancedHighScore", -1295904325279195649L);
        setLongField(term172261, term172261.getClass(), "sumBattleExpertHighScore", 2593739595519795592L);
        setLongField(term172261, term172261.getClass(), "sumBattleMasterHighScore", -8080309515657845927L);
        setLongField(term172261, term172261.getClass(), "sumBattleLunaticHighScore", -2970858677561070814L);
        setField(term172261, term172261.getClass(), "eventWatchedDate", "xOlkaGVEJP");
        setField(term172261, term172261.getClass(), "cmEventWatchedDate", "KYBPliuemX");
        setField(term172261, term172261.getClass(), "firstGameId", "uANahVyxgu");
        setField(term172261, term172261.getClass(), "firstRomVersion", "RtylTeQjzK");
        setField(term172261, term172261.getClass(), "firstDataVersion", "bFoZFUQjsC");
        setField(term172261, term172261.getClass(), "firstPlayDate", "ldnLrmnSsp");
        setField(term172261, term172261.getClass(), "lastGameId", "FRAcngFZcM");
        setField(term172261, term172261.getClass(), "lastRomVersion", "WpSxLBPWKZ");
        setField(term172261, term172261.getClass(), "lastDataVersion", "UxWtTYOrPR");
        setField(term172261, term172261.getClass(), "compatibleCmVersion", "UPSszOfKCC");
        setField(term172261, term172261.getClass(), "lastPlayDate", "RKArRZVCge");
        setIntField(term172261, term172261.getClass(), "lastPlaceId", 1083983871);
        setField(term172261, term172261.getClass(), "lastPlaceName", "UnZFUlWwQv");
        setIntField(term172261, term172261.getClass(), "lastRegionId", -520406359);
        setField(term172261, term172261.getClass(), "lastRegionName", "xwqrsGfuyt");
        setIntField(term172261, term172261.getClass(), "lastAllNetId", 139050513);
        setField(term172261, term172261.getClass(), "lastClientId", "CLwVHtQjBH");
        setIntField(term172261, term172261.getClass(), "lastUsedDeckId", -1340996500);
        setIntField(term172261, term172261.getClass(), "lastPlayMusicLevel", 1324448192);
        setIntField(term172261, term172261.getClass(), "lastEmoneyBrand", 816936644);
        setField(term172259, term172259.getClass(), "user", term172261);
        setIntField(term172259, term172259.getClass(), "characterId", 1987306855);
        setIntField(term172259, term172259.getClass(), "costumeId", -1124921628);
        setIntField(term172259, term172259.getClass(), "attachmentId", -1169204034);
        setIntField(term172259, term172259.getClass(), "playCount", 525500871);
        setIntField(term172259, term172259.getClass(), "intimateLevel", 564354084);
        setIntField(term172259, term172259.getClass(), "intimateCount", -645407244);
        setIntField(term172259, term172259.getClass(), "intimateCountRewarded", 1896076723);
        setField(term172259, term172259.getClass(), "intimateCountDate", "rTAzrULvmm");
        setBooleanField(term172259, term172259.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntimateCountDate", argTypes, term172259, args);
    }

};


