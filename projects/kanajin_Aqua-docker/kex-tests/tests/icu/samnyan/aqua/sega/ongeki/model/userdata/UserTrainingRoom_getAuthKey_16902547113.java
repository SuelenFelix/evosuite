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

public class UserTrainingRoom_getAuthKey_16902547113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14300;

    public UserTrainingRoom_getAuthKey_16902547113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14306 = new Long(-6823727938421990489L);
        term14300 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term14302 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term14304 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14300, term14300.getClass(), "id", -3188913050877092148L);
        setLongField(term14302, term14302.getClass(), "id", -6759247883224780481L);
        setLongField(term14304, term14304.getClass(), "id", -3724162247917461536L);
        setField(term14304, term14304.getClass(), "extId", term14306);
        setField(term14304, term14304.getClass(), "luid", "BsuVlGUUjV");
        setIntField(term14321, term14321.getClass(), "year", 2018);
        setShortField(term14321, term14321.getClass(), "month", (short) 2);
        setShortField(term14321, term14321.getClass(), "day", (short) 14);
        setField(term14320, term14320.getClass(), "date", term14321);
        setByteField(term14325, term14325.getClass(), "hour", (byte) 2);
        setByteField(term14325, term14325.getClass(), "minute", (byte) 40);
        setByteField(term14325, term14325.getClass(), "second", (byte) 48);
        setIntField(term14325, term14325.getClass(), "nano", 371006728);
        setField(term14320, term14320.getClass(), "time", term14325);
        setField(term14304, term14304.getClass(), "registerTime", term14320);
        setIntField(term14331, term14331.getClass(), "year", 2025);
        setShortField(term14331, term14331.getClass(), "month", (short) 8);
        setShortField(term14331, term14331.getClass(), "day", (short) 22);
        setField(term14330, term14330.getClass(), "date", term14331);
        setByteField(term14335, term14335.getClass(), "hour", (byte) 6);
        setByteField(term14335, term14335.getClass(), "minute", (byte) 48);
        setByteField(term14335, term14335.getClass(), "second", (byte) 49);
        setIntField(term14335, term14335.getClass(), "nano", 46400229);
        setField(term14330, term14330.getClass(), "time", term14335);
        setField(term14304, term14304.getClass(), "accessTime", term14330);
        setField(term14302, term14302.getClass(), "card", term14304);
        setField(term14302, term14302.getClass(), "userName", "bHHjfDCntT");
        setIntField(term14302, term14302.getClass(), "level", 805176809);
        setIntField(term14302, term14302.getClass(), "reincarnationNum", -82632953);
        setLongField(term14302, term14302.getClass(), "exp", 7893661350133453338L);
        setLongField(term14302, term14302.getClass(), "point", 9056245012917372169L);
        setLongField(term14302, term14302.getClass(), "totalPoint", 7848004402682338886L);
        setIntField(term14302, term14302.getClass(), "playCount", -1473876284);
        setIntField(term14302, term14302.getClass(), "jewelCount", -1389314671);
        setIntField(term14302, term14302.getClass(), "totalJewelCount", -499699841);
        setIntField(term14302, term14302.getClass(), "medalCount", 360972386);
        setIntField(term14302, term14302.getClass(), "playerRating", -2063884849);
        setIntField(term14302, term14302.getClass(), "highestRating", 1054887169);
        setIntField(term14302, term14302.getClass(), "battlePoint", 692873905);
        setIntField(term14302, term14302.getClass(), "bestBattlePoint", 1734759369);
        setIntField(term14302, term14302.getClass(), "overDamageBattlePoint", 1841493736);
        setBooleanField(term14302, term14302.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term14302, term14302.getClass(), "nameplateId", 320739944);
        setIntField(term14302, term14302.getClass(), "trophyId", 760218111);
        setIntField(term14302, term14302.getClass(), "cardId", -1986366126);
        setIntField(term14302, term14302.getClass(), "characterId", -1963228619);
        setIntField(term14302, term14302.getClass(), "characterVoiceNo", -709868952);
        setIntField(term14302, term14302.getClass(), "tabSetting", 847207929);
        setIntField(term14302, term14302.getClass(), "tabSortSetting", -1665928103);
        setIntField(term14302, term14302.getClass(), "cardCategorySetting", 1574458332);
        setIntField(term14302, term14302.getClass(), "cardSortSetting", -975856245);
        setIntField(term14302, term14302.getClass(), "rivalScoreCategorySetting", -1023366103);
        setIntField(term14302, term14302.getClass(), "playedTutorialBit", 81427089);
        setIntField(term14302, term14302.getClass(), "firstTutorialCancelNum", 755951489);
        setLongField(term14302, term14302.getClass(), "sumTechHighScore", 8931772176819893873L);
        setLongField(term14302, term14302.getClass(), "sumTechBasicHighScore", -4370635295110591519L);
        setLongField(term14302, term14302.getClass(), "sumTechAdvancedHighScore", -1325109462577461208L);
        setLongField(term14302, term14302.getClass(), "sumTechExpertHighScore", -7181112149072926893L);
        setLongField(term14302, term14302.getClass(), "sumTechMasterHighScore", -5850316381591949820L);
        setLongField(term14302, term14302.getClass(), "sumTechLunaticHighScore", 5857854340777182167L);
        setLongField(term14302, term14302.getClass(), "sumBattleHighScore", 3660520943100987842L);
        setLongField(term14302, term14302.getClass(), "sumBattleBasicHighScore", -8211240904293846981L);
        setLongField(term14302, term14302.getClass(), "sumBattleAdvancedHighScore", 3535528164828723056L);
        setLongField(term14302, term14302.getClass(), "sumBattleExpertHighScore", 4036794646678680547L);
        setLongField(term14302, term14302.getClass(), "sumBattleMasterHighScore", 4006388896509492239L);
        setLongField(term14302, term14302.getClass(), "sumBattleLunaticHighScore", -6314099457945626605L);
        setField(term14302, term14302.getClass(), "eventWatchedDate", "sEphiduvkv");
        setField(term14302, term14302.getClass(), "cmEventWatchedDate", "PbLgCSAHce");
        setField(term14302, term14302.getClass(), "firstGameId", "NWldOLAbqk");
        setField(term14302, term14302.getClass(), "firstRomVersion", "qnYaYSpDwO");
        setField(term14302, term14302.getClass(), "firstDataVersion", "dgbFDCdHtj");
        setField(term14302, term14302.getClass(), "firstPlayDate", "EKpdCBubDE");
        setField(term14302, term14302.getClass(), "lastGameId", "zMsSLTfGhl");
        setField(term14302, term14302.getClass(), "lastRomVersion", "bEmHScVZaQ");
        setField(term14302, term14302.getClass(), "lastDataVersion", "TcuXODkzBV");
        setField(term14302, term14302.getClass(), "compatibleCmVersion", "coJPjrBZNe");
        setField(term14302, term14302.getClass(), "lastPlayDate", "vMsWjuPTnO");
        setIntField(term14302, term14302.getClass(), "lastPlaceId", 1175146356);
        setField(term14302, term14302.getClass(), "lastPlaceName", "zHvfKaOstO");
        setIntField(term14302, term14302.getClass(), "lastRegionId", -2137419728);
        setField(term14302, term14302.getClass(), "lastRegionName", "tOszriqETr");
        setIntField(term14302, term14302.getClass(), "lastAllNetId", 1558810715);
        setField(term14302, term14302.getClass(), "lastClientId", "ncSPTkhKjO");
        setIntField(term14302, term14302.getClass(), "lastUsedDeckId", -382652403);
        setIntField(term14302, term14302.getClass(), "lastPlayMusicLevel", -2126539433);
        setIntField(term14302, term14302.getClass(), "lastEmoneyBrand", 196952878);
        setField(term14300, term14300.getClass(), "user", term14302);
        setField(term14300, term14300.getClass(), "authKey", "jcWKHRWhyj");
        setIntField(term14300, term14300.getClass(), "roomId", 802673242);
        setIntField(term14300, term14300.getClass(), "cardId", -1808638031);
        setField(term14300, term14300.getClass(), "valueDate", "nrQjODRMLD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthKey", argTypes, term14300, args);
    }

};


