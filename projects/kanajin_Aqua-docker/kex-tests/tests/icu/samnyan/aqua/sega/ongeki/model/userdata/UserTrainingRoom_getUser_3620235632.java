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

public class UserTrainingRoom_getUser_3620235632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13829;

    public UserTrainingRoom_getUser_3620235632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13835 = new Long(5262507301787091109L);
        term13829 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term13831 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term13833 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13864 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13829, term13829.getClass(), "id", 5071015720043054072L);
        setLongField(term13831, term13831.getClass(), "id", -7006877527579112761L);
        setLongField(term13833, term13833.getClass(), "id", -8699693633047465617L);
        setField(term13833, term13833.getClass(), "extId", term13835);
        setField(term13833, term13833.getClass(), "luid", "rsumfoDNHa");
        setIntField(term13850, term13850.getClass(), "year", 2028);
        setShortField(term13850, term13850.getClass(), "month", (short) 1);
        setShortField(term13850, term13850.getClass(), "day", (short) 18);
        setField(term13849, term13849.getClass(), "date", term13850);
        setByteField(term13854, term13854.getClass(), "hour", (byte) 12);
        setByteField(term13854, term13854.getClass(), "minute", (byte) 4);
        setByteField(term13854, term13854.getClass(), "second", (byte) 39);
        setIntField(term13854, term13854.getClass(), "nano", 651287093);
        setField(term13849, term13849.getClass(), "time", term13854);
        setField(term13833, term13833.getClass(), "registerTime", term13849);
        setIntField(term13860, term13860.getClass(), "year", 2027);
        setShortField(term13860, term13860.getClass(), "month", (short) 7);
        setShortField(term13860, term13860.getClass(), "day", (short) 23);
        setField(term13859, term13859.getClass(), "date", term13860);
        setByteField(term13864, term13864.getClass(), "hour", (byte) 12);
        setByteField(term13864, term13864.getClass(), "minute", (byte) 6);
        setByteField(term13864, term13864.getClass(), "second", (byte) 19);
        setIntField(term13864, term13864.getClass(), "nano", 8025683);
        setField(term13859, term13859.getClass(), "time", term13864);
        setField(term13833, term13833.getClass(), "accessTime", term13859);
        setField(term13831, term13831.getClass(), "card", term13833);
        setField(term13831, term13831.getClass(), "userName", "ceCWHUTQUM");
        setIntField(term13831, term13831.getClass(), "level", -965421502);
        setIntField(term13831, term13831.getClass(), "reincarnationNum", 1319026002);
        setLongField(term13831, term13831.getClass(), "exp", -590890905395927244L);
        setLongField(term13831, term13831.getClass(), "point", 6978548804004471804L);
        setLongField(term13831, term13831.getClass(), "totalPoint", -8957441653116712448L);
        setIntField(term13831, term13831.getClass(), "playCount", -1368173231);
        setIntField(term13831, term13831.getClass(), "jewelCount", 1956006038);
        setIntField(term13831, term13831.getClass(), "totalJewelCount", -1062304878);
        setIntField(term13831, term13831.getClass(), "medalCount", -1377876610);
        setIntField(term13831, term13831.getClass(), "playerRating", -1456184732);
        setIntField(term13831, term13831.getClass(), "highestRating", 1689228897);
        setIntField(term13831, term13831.getClass(), "battlePoint", 892205855);
        setIntField(term13831, term13831.getClass(), "bestBattlePoint", 1955560079);
        setIntField(term13831, term13831.getClass(), "overDamageBattlePoint", -1330529019);
        setBooleanField(term13831, term13831.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term13831, term13831.getClass(), "nameplateId", 237134844);
        setIntField(term13831, term13831.getClass(), "trophyId", 2076413861);
        setIntField(term13831, term13831.getClass(), "cardId", 66817373);
        setIntField(term13831, term13831.getClass(), "characterId", 1459628013);
        setIntField(term13831, term13831.getClass(), "characterVoiceNo", -1641507499);
        setIntField(term13831, term13831.getClass(), "tabSetting", -33436796);
        setIntField(term13831, term13831.getClass(), "tabSortSetting", -1527326823);
        setIntField(term13831, term13831.getClass(), "cardCategorySetting", 469871899);
        setIntField(term13831, term13831.getClass(), "cardSortSetting", -1348703436);
        setIntField(term13831, term13831.getClass(), "rivalScoreCategorySetting", -2027012650);
        setIntField(term13831, term13831.getClass(), "playedTutorialBit", 1343432022);
        setIntField(term13831, term13831.getClass(), "firstTutorialCancelNum", -1767079160);
        setLongField(term13831, term13831.getClass(), "sumTechHighScore", -5761087225966065493L);
        setLongField(term13831, term13831.getClass(), "sumTechBasicHighScore", 493557348274366095L);
        setLongField(term13831, term13831.getClass(), "sumTechAdvancedHighScore", 8699742215739444902L);
        setLongField(term13831, term13831.getClass(), "sumTechExpertHighScore", 8261619652909874476L);
        setLongField(term13831, term13831.getClass(), "sumTechMasterHighScore", -3692936312179064102L);
        setLongField(term13831, term13831.getClass(), "sumTechLunaticHighScore", 5498944509671266637L);
        setLongField(term13831, term13831.getClass(), "sumBattleHighScore", -6838909359433858599L);
        setLongField(term13831, term13831.getClass(), "sumBattleBasicHighScore", 4947643967691976731L);
        setLongField(term13831, term13831.getClass(), "sumBattleAdvancedHighScore", 4548576710115075073L);
        setLongField(term13831, term13831.getClass(), "sumBattleExpertHighScore", -1486519351300660432L);
        setLongField(term13831, term13831.getClass(), "sumBattleMasterHighScore", 4777103307547199454L);
        setLongField(term13831, term13831.getClass(), "sumBattleLunaticHighScore", 6462632207326555041L);
        setField(term13831, term13831.getClass(), "eventWatchedDate", "LrqwfrKKtS");
        setField(term13831, term13831.getClass(), "cmEventWatchedDate", "ZUdnQXfzCI");
        setField(term13831, term13831.getClass(), "firstGameId", "EULDrUNQvw");
        setField(term13831, term13831.getClass(), "firstRomVersion", "BtvAvsJSei");
        setField(term13831, term13831.getClass(), "firstDataVersion", "vqnBkkxoIa");
        setField(term13831, term13831.getClass(), "firstPlayDate", "bycpZjxXFn");
        setField(term13831, term13831.getClass(), "lastGameId", "jQWttOAiwL");
        setField(term13831, term13831.getClass(), "lastRomVersion", "DzKFxEuEEC");
        setField(term13831, term13831.getClass(), "lastDataVersion", "CAMnvfDLJL");
        setField(term13831, term13831.getClass(), "compatibleCmVersion", "mfHtgSbdjD");
        setField(term13831, term13831.getClass(), "lastPlayDate", "cmuaUiHMVL");
        setIntField(term13831, term13831.getClass(), "lastPlaceId", -201010601);
        setField(term13831, term13831.getClass(), "lastPlaceName", "xjoSGPWUgu");
        setIntField(term13831, term13831.getClass(), "lastRegionId", 2060027076);
        setField(term13831, term13831.getClass(), "lastRegionName", "uzmqjnOUXu");
        setIntField(term13831, term13831.getClass(), "lastAllNetId", 2084868811);
        setField(term13831, term13831.getClass(), "lastClientId", "xeyjTOCOJb");
        setIntField(term13831, term13831.getClass(), "lastUsedDeckId", 314478878);
        setIntField(term13831, term13831.getClass(), "lastPlayMusicLevel", 1425342686);
        setIntField(term13831, term13831.getClass(), "lastEmoneyBrand", -1042470635);
        setField(term13829, term13829.getClass(), "user", term13831);
        setField(term13829, term13829.getClass(), "authKey", "DGRqjjdhzy");
        setIntField(term13829, term13829.getClass(), "roomId", -524352937);
        setIntField(term13829, term13829.getClass(), "cardId", 1472218987);
        setField(term13829, term13829.getClass(), "valueDate", "lQFkjJUPAR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term13829, args);
    }

};


