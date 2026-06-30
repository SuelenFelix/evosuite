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

public class UserActivity_getParam1_10712298916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285314;

    public UserActivity_getParam1_10712298916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term285320 = new Long(-7830820957252387854L);
        term285314 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term285316 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term285318 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term285334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285339 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285349 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term285314, term285314.getClass(), "id", 773009160012759116L);
        setLongField(term285316, term285316.getClass(), "id", 884230567837123613L);
        setLongField(term285318, term285318.getClass(), "id", 834857981957718605L);
        setField(term285318, term285318.getClass(), "extId", term285320);
        setField(term285318, term285318.getClass(), "luid", "hTcLgWjgVZ");
        setIntField(term285335, term285335.getClass(), "year", 2024);
        setShortField(term285335, term285335.getClass(), "month", (short) 4);
        setShortField(term285335, term285335.getClass(), "day", (short) 7);
        setField(term285334, term285334.getClass(), "date", term285335);
        setByteField(term285339, term285339.getClass(), "hour", (byte) 15);
        setByteField(term285339, term285339.getClass(), "minute", (byte) 47);
        setByteField(term285339, term285339.getClass(), "second", (byte) 40);
        setIntField(term285339, term285339.getClass(), "nano", 993873846);
        setField(term285334, term285334.getClass(), "time", term285339);
        setField(term285318, term285318.getClass(), "registerTime", term285334);
        setIntField(term285345, term285345.getClass(), "year", 2029);
        setShortField(term285345, term285345.getClass(), "month", (short) 5);
        setShortField(term285345, term285345.getClass(), "day", (short) 2);
        setField(term285344, term285344.getClass(), "date", term285345);
        setByteField(term285349, term285349.getClass(), "hour", (byte) 19);
        setByteField(term285349, term285349.getClass(), "minute", (byte) 50);
        setByteField(term285349, term285349.getClass(), "second", (byte) 46);
        setIntField(term285349, term285349.getClass(), "nano", 326633709);
        setField(term285344, term285344.getClass(), "time", term285349);
        setField(term285318, term285318.getClass(), "accessTime", term285344);
        setField(term285316, term285316.getClass(), "card", term285318);
        setField(term285316, term285316.getClass(), "userName", "HJuxBeseep");
        setIntField(term285316, term285316.getClass(), "level", -1839831897);
        setIntField(term285316, term285316.getClass(), "reincarnationNum", 96586612);
        setLongField(term285316, term285316.getClass(), "exp", -5704638642714634680L);
        setLongField(term285316, term285316.getClass(), "point", 150178373839067885L);
        setLongField(term285316, term285316.getClass(), "totalPoint", -1025356515317759242L);
        setIntField(term285316, term285316.getClass(), "playCount", -523164569);
        setIntField(term285316, term285316.getClass(), "jewelCount", -1627411785);
        setIntField(term285316, term285316.getClass(), "totalJewelCount", 1898140596);
        setIntField(term285316, term285316.getClass(), "medalCount", -1102760096);
        setIntField(term285316, term285316.getClass(), "playerRating", -1071849710);
        setIntField(term285316, term285316.getClass(), "highestRating", -1996013699);
        setIntField(term285316, term285316.getClass(), "battlePoint", 1715462169);
        setIntField(term285316, term285316.getClass(), "bestBattlePoint", 311229186);
        setIntField(term285316, term285316.getClass(), "overDamageBattlePoint", 1845964937);
        setBooleanField(term285316, term285316.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term285316, term285316.getClass(), "nameplateId", -120481344);
        setIntField(term285316, term285316.getClass(), "trophyId", -718039445);
        setIntField(term285316, term285316.getClass(), "cardId", 587141165);
        setIntField(term285316, term285316.getClass(), "characterId", -1389883682);
        setIntField(term285316, term285316.getClass(), "characterVoiceNo", -1743258736);
        setIntField(term285316, term285316.getClass(), "tabSetting", 101489027);
        setIntField(term285316, term285316.getClass(), "tabSortSetting", 1052491077);
        setIntField(term285316, term285316.getClass(), "cardCategorySetting", -1816019806);
        setIntField(term285316, term285316.getClass(), "cardSortSetting", -256727488);
        setIntField(term285316, term285316.getClass(), "rivalScoreCategorySetting", -1392027006);
        setIntField(term285316, term285316.getClass(), "playedTutorialBit", 1896515313);
        setIntField(term285316, term285316.getClass(), "firstTutorialCancelNum", -1908708729);
        setLongField(term285316, term285316.getClass(), "sumTechHighScore", 8916994173932062843L);
        setLongField(term285316, term285316.getClass(), "sumTechBasicHighScore", 4617051557046870786L);
        setLongField(term285316, term285316.getClass(), "sumTechAdvancedHighScore", 7726224352439272895L);
        setLongField(term285316, term285316.getClass(), "sumTechExpertHighScore", -160676379034622998L);
        setLongField(term285316, term285316.getClass(), "sumTechMasterHighScore", 7154769525389700958L);
        setLongField(term285316, term285316.getClass(), "sumTechLunaticHighScore", 2469979900637988310L);
        setLongField(term285316, term285316.getClass(), "sumBattleHighScore", -168832491974435966L);
        setLongField(term285316, term285316.getClass(), "sumBattleBasicHighScore", -7240211032614423080L);
        setLongField(term285316, term285316.getClass(), "sumBattleAdvancedHighScore", 2736434540321523642L);
        setLongField(term285316, term285316.getClass(), "sumBattleExpertHighScore", -6007983606301783949L);
        setLongField(term285316, term285316.getClass(), "sumBattleMasterHighScore", -5523264187941895906L);
        setLongField(term285316, term285316.getClass(), "sumBattleLunaticHighScore", 1926973993177864289L);
        setField(term285316, term285316.getClass(), "eventWatchedDate", "pJhaEHvvEJ");
        setField(term285316, term285316.getClass(), "cmEventWatchedDate", "uUawepHlyb");
        setField(term285316, term285316.getClass(), "firstGameId", "fdERpSvfXR");
        setField(term285316, term285316.getClass(), "firstRomVersion", "hOUYxUxiHr");
        setField(term285316, term285316.getClass(), "firstDataVersion", "enxtAKeukF");
        setField(term285316, term285316.getClass(), "firstPlayDate", "BtZDkCvyCl");
        setField(term285316, term285316.getClass(), "lastGameId", "EMcBwIYzOV");
        setField(term285316, term285316.getClass(), "lastRomVersion", "IuZuqYNKVu");
        setField(term285316, term285316.getClass(), "lastDataVersion", "UhFHtcXzAx");
        setField(term285316, term285316.getClass(), "compatibleCmVersion", "cDCGHIFISc");
        setField(term285316, term285316.getClass(), "lastPlayDate", "ZRaaeHguys");
        setIntField(term285316, term285316.getClass(), "lastPlaceId", -482802376);
        setField(term285316, term285316.getClass(), "lastPlaceName", "JyyGlEhItv");
        setIntField(term285316, term285316.getClass(), "lastRegionId", -1498723051);
        setField(term285316, term285316.getClass(), "lastRegionName", "NAeiHxWYxI");
        setIntField(term285316, term285316.getClass(), "lastAllNetId", -1976039154);
        setField(term285316, term285316.getClass(), "lastClientId", "qSfOhoIMpr");
        setIntField(term285316, term285316.getClass(), "lastUsedDeckId", 259116870);
        setIntField(term285316, term285316.getClass(), "lastPlayMusicLevel", -537316856);
        setIntField(term285316, term285316.getClass(), "lastEmoneyBrand", -1270342663);
        setField(term285314, term285314.getClass(), "user", term285316);
        setIntField(term285314, term285314.getClass(), "kind", -1077679386);
        setIntField(term285314, term285314.getClass(), "activityId", 1168038339);
        setIntField(term285314, term285314.getClass(), "sortNumber", -1998903871);
        setIntField(term285314, term285314.getClass(), "param1", -646766143);
        setIntField(term285314, term285314.getClass(), "param2", -2114100575);
        setIntField(term285314, term285314.getClass(), "param3", 1929896302);
        setIntField(term285314, term285314.getClass(), "param4", 1194666880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term285314, args);
    }

};


