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

public class UserLoginBonus_setBonusId_10200424168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304800;
     Object term305079;

    public UserLoginBonus_setBonusId_10200424168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term304806 = new Long(-5761087225966065493L);
        term304800 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term304802 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term304804 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term304820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304825 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304835 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term304800, term304800.getClass(), "id", 3048734233778296078L);
        setLongField(term304802, term304802.getClass(), "id", -7296094478420320041L);
        setLongField(term304804, term304804.getClass(), "id", -5532994154910905792L);
        setField(term304804, term304804.getClass(), "extId", term304806);
        setField(term304804, term304804.getClass(), "luid", "TEcCIAqJQZ");
        setIntField(term304821, term304821.getClass(), "year", 2012);
        setShortField(term304821, term304821.getClass(), "month", (short) 3);
        setShortField(term304821, term304821.getClass(), "day", (short) 30);
        setField(term304820, term304820.getClass(), "date", term304821);
        setByteField(term304825, term304825.getClass(), "hour", (byte) 5);
        setByteField(term304825, term304825.getClass(), "minute", (byte) 33);
        setByteField(term304825, term304825.getClass(), "second", (byte) 41);
        setIntField(term304825, term304825.getClass(), "nano", 821095361);
        setField(term304820, term304820.getClass(), "time", term304825);
        setField(term304804, term304804.getClass(), "registerTime", term304820);
        setIntField(term304831, term304831.getClass(), "year", 2029);
        setShortField(term304831, term304831.getClass(), "month", (short) 12);
        setShortField(term304831, term304831.getClass(), "day", (short) 1);
        setField(term304830, term304830.getClass(), "date", term304831);
        setByteField(term304835, term304835.getClass(), "hour", (byte) 9);
        setByteField(term304835, term304835.getClass(), "minute", (byte) 45);
        setByteField(term304835, term304835.getClass(), "second", (byte) 17);
        setIntField(term304835, term304835.getClass(), "nano", 906437550);
        setField(term304830, term304830.getClass(), "time", term304835);
        setField(term304804, term304804.getClass(), "accessTime", term304830);
        setField(term304802, term304802.getClass(), "card", term304804);
        setField(term304802, term304802.getClass(), "userName", "xmIiNFcOaN");
        setIntField(term304802, term304802.getClass(), "level", -481667037);
        setIntField(term304802, term304802.getClass(), "reincarnationNum", 1744898637);
        setLongField(term304802, term304802.getClass(), "exp", -2276116380993564914L);
        setLongField(term304802, term304802.getClass(), "point", 4242572282315606286L);
        setLongField(term304802, term304802.getClass(), "totalPoint", 8854481634776226167L);
        setIntField(term304802, term304802.getClass(), "playCount", -1439486914);
        setIntField(term304802, term304802.getClass(), "jewelCount", -655307765);
        setIntField(term304802, term304802.getClass(), "totalJewelCount", -1802996868);
        setIntField(term304802, term304802.getClass(), "medalCount", 1651913796);
        setIntField(term304802, term304802.getClass(), "playerRating", -935670376);
        setIntField(term304802, term304802.getClass(), "highestRating", -1321941334);
        setIntField(term304802, term304802.getClass(), "battlePoint", -2072279811);
        setIntField(term304802, term304802.getClass(), "bestBattlePoint", 424420422);
        setIntField(term304802, term304802.getClass(), "overDamageBattlePoint", 1175078847);
        setBooleanField(term304802, term304802.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term304802, term304802.getClass(), "nameplateId", 1639505977);
        setIntField(term304802, term304802.getClass(), "trophyId", 2035001086);
        setIntField(term304802, term304802.getClass(), "cardId", 1051154591);
        setIntField(term304802, term304802.getClass(), "characterId", 165242027);
        setIntField(term304802, term304802.getClass(), "characterVoiceNo", -267165362);
        setIntField(term304802, term304802.getClass(), "tabSetting", -2139628089);
        setIntField(term304802, term304802.getClass(), "tabSortSetting", 2113730444);
        setIntField(term304802, term304802.getClass(), "cardCategorySetting", -536793202);
        setIntField(term304802, term304802.getClass(), "cardSortSetting", 1710678259);
        setIntField(term304802, term304802.getClass(), "rivalScoreCategorySetting", 1506222130);
        setIntField(term304802, term304802.getClass(), "playedTutorialBit", -1046031086);
        setIntField(term304802, term304802.getClass(), "firstTutorialCancelNum", 1336862739);
        setLongField(term304802, term304802.getClass(), "sumTechHighScore", 7990923085744203390L);
        setLongField(term304802, term304802.getClass(), "sumTechBasicHighScore", 3898197591238205338L);
        setLongField(term304802, term304802.getClass(), "sumTechAdvancedHighScore", 3341874114437437208L);
        setLongField(term304802, term304802.getClass(), "sumTechExpertHighScore", 8991339345200514025L);
        setLongField(term304802, term304802.getClass(), "sumTechMasterHighScore", -8233399287554622260L);
        setLongField(term304802, term304802.getClass(), "sumTechLunaticHighScore", 1251402582291940936L);
        setLongField(term304802, term304802.getClass(), "sumBattleHighScore", 2823789046007951123L);
        setLongField(term304802, term304802.getClass(), "sumBattleBasicHighScore", 5229414245057692367L);
        setLongField(term304802, term304802.getClass(), "sumBattleAdvancedHighScore", 6994454851415499091L);
        setLongField(term304802, term304802.getClass(), "sumBattleExpertHighScore", 7297823656447695054L);
        setLongField(term304802, term304802.getClass(), "sumBattleMasterHighScore", 6128355654405049223L);
        setLongField(term304802, term304802.getClass(), "sumBattleLunaticHighScore", -5355460714352394735L);
        setField(term304802, term304802.getClass(), "eventWatchedDate", "wckDOvwjxa");
        setField(term304802, term304802.getClass(), "cmEventWatchedDate", "nURdupsOyS");
        setField(term304802, term304802.getClass(), "firstGameId", "VWjUkRBRfp");
        setField(term304802, term304802.getClass(), "firstRomVersion", "HgEbIAfQHC");
        setField(term304802, term304802.getClass(), "firstDataVersion", "OOqAMsnNEY");
        setField(term304802, term304802.getClass(), "firstPlayDate", "EbBIyYIcdK");
        setField(term304802, term304802.getClass(), "lastGameId", "gtWJVwJMfO");
        setField(term304802, term304802.getClass(), "lastRomVersion", "dzaFbbcFgB");
        setField(term304802, term304802.getClass(), "lastDataVersion", "XxkSKRIccb");
        setField(term304802, term304802.getClass(), "compatibleCmVersion", "rVoqxsvuEO");
        setField(term304802, term304802.getClass(), "lastPlayDate", "fvlPYWsfNi");
        setIntField(term304802, term304802.getClass(), "lastPlaceId", 1654845592);
        setField(term304802, term304802.getClass(), "lastPlaceName", "HguRJwSWml");
        setIntField(term304802, term304802.getClass(), "lastRegionId", -1146173809);
        setField(term304802, term304802.getClass(), "lastRegionName", "cjzZzvSdbp");
        setIntField(term304802, term304802.getClass(), "lastAllNetId", 1280410123);
        setField(term304802, term304802.getClass(), "lastClientId", "IySBbmolVR");
        setIntField(term304802, term304802.getClass(), "lastUsedDeckId", -1900255770);
        setIntField(term304802, term304802.getClass(), "lastPlayMusicLevel", -1927343285);
        setIntField(term304802, term304802.getClass(), "lastEmoneyBrand", -327777337);
        setField(term304800, term304800.getClass(), "user", term304802);
        setIntField(term304800, term304800.getClass(), "bonusId", 609466496);
        setIntField(term304800, term304800.getClass(), "bonusCount", 1991028856);
        setField(term304800, term304800.getClass(), "lastUpdateDate", "TZacooIYfu");
        term305079 = new Integer(-1261341659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term305079;
        callMethod(klass, "setBonusId", argTypes, term304800, args);
    }

};


