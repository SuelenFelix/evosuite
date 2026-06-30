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

public class UserCard_getDigitalStock_20650414045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113435;

    public UserCard_getDigitalStock_20650414045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113441 = new Long(-67485388932970712L);
        term113435 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term113437 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term113439 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term113455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113470 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term113435, term113435.getClass(), "id", -568365245916659456L);
        setLongField(term113437, term113437.getClass(), "id", 30250178227673827L);
        setLongField(term113439, term113439.getClass(), "id", 6280571590347853801L);
        setField(term113439, term113439.getClass(), "extId", term113441);
        setField(term113439, term113439.getClass(), "luid", "uVksDvNeyo");
        setIntField(term113456, term113456.getClass(), "year", 2016);
        setShortField(term113456, term113456.getClass(), "month", (short) 1);
        setShortField(term113456, term113456.getClass(), "day", (short) 2);
        setField(term113455, term113455.getClass(), "date", term113456);
        setByteField(term113460, term113460.getClass(), "hour", (byte) 13);
        setByteField(term113460, term113460.getClass(), "minute", (byte) 24);
        setByteField(term113460, term113460.getClass(), "second", (byte) 10);
        setIntField(term113460, term113460.getClass(), "nano", 70073780);
        setField(term113455, term113455.getClass(), "time", term113460);
        setField(term113439, term113439.getClass(), "registerTime", term113455);
        setIntField(term113466, term113466.getClass(), "year", 2013);
        setShortField(term113466, term113466.getClass(), "month", (short) 2);
        setShortField(term113466, term113466.getClass(), "day", (short) 21);
        setField(term113465, term113465.getClass(), "date", term113466);
        setByteField(term113470, term113470.getClass(), "hour", (byte) 4);
        setByteField(term113470, term113470.getClass(), "minute", (byte) 18);
        setByteField(term113470, term113470.getClass(), "second", (byte) 6);
        setIntField(term113470, term113470.getClass(), "nano", 2952762);
        setField(term113465, term113465.getClass(), "time", term113470);
        setField(term113439, term113439.getClass(), "accessTime", term113465);
        setField(term113437, term113437.getClass(), "card", term113439);
        setField(term113437, term113437.getClass(), "userName", "KThgZcLeyJ");
        setIntField(term113437, term113437.getClass(), "level", -729452443);
        setIntField(term113437, term113437.getClass(), "reincarnationNum", -1036655415);
        setLongField(term113437, term113437.getClass(), "exp", -4866070034344991527L);
        setLongField(term113437, term113437.getClass(), "point", -2228962519624486593L);
        setLongField(term113437, term113437.getClass(), "totalPoint", 4518859779209729552L);
        setIntField(term113437, term113437.getClass(), "playCount", 2135681292);
        setIntField(term113437, term113437.getClass(), "jewelCount", -2013011892);
        setIntField(term113437, term113437.getClass(), "totalJewelCount", 1385680694);
        setIntField(term113437, term113437.getClass(), "medalCount", 655709162);
        setIntField(term113437, term113437.getClass(), "playerRating", -1734841021);
        setIntField(term113437, term113437.getClass(), "highestRating", 438683830);
        setIntField(term113437, term113437.getClass(), "battlePoint", -317562794);
        setIntField(term113437, term113437.getClass(), "bestBattlePoint", -34216116);
        setIntField(term113437, term113437.getClass(), "overDamageBattlePoint", -1708491247);
        setBooleanField(term113437, term113437.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term113437, term113437.getClass(), "nameplateId", -481096333);
        setIntField(term113437, term113437.getClass(), "trophyId", -1194124828);
        setIntField(term113437, term113437.getClass(), "cardId", -1785183910);
        setIntField(term113437, term113437.getClass(), "characterId", -152121998);
        setIntField(term113437, term113437.getClass(), "characterVoiceNo", 494798237);
        setIntField(term113437, term113437.getClass(), "tabSetting", -479962725);
        setIntField(term113437, term113437.getClass(), "tabSortSetting", 686601903);
        setIntField(term113437, term113437.getClass(), "cardCategorySetting", 1265406504);
        setIntField(term113437, term113437.getClass(), "cardSortSetting", 1628889441);
        setIntField(term113437, term113437.getClass(), "rivalScoreCategorySetting", 2054724659);
        setIntField(term113437, term113437.getClass(), "playedTutorialBit", -1112261724);
        setIntField(term113437, term113437.getClass(), "firstTutorialCancelNum", 439199675);
        setLongField(term113437, term113437.getClass(), "sumTechHighScore", 7883107278470712460L);
        setLongField(term113437, term113437.getClass(), "sumTechBasicHighScore", 1696856886054225175L);
        setLongField(term113437, term113437.getClass(), "sumTechAdvancedHighScore", -5501052823863346708L);
        setLongField(term113437, term113437.getClass(), "sumTechExpertHighScore", 4836835002165673931L);
        setLongField(term113437, term113437.getClass(), "sumTechMasterHighScore", 4302518070363197207L);
        setLongField(term113437, term113437.getClass(), "sumTechLunaticHighScore", -4779584185122240003L);
        setLongField(term113437, term113437.getClass(), "sumBattleHighScore", 4237219215857694878L);
        setLongField(term113437, term113437.getClass(), "sumBattleBasicHighScore", -5392111877437742511L);
        setLongField(term113437, term113437.getClass(), "sumBattleAdvancedHighScore", -1350650874602445964L);
        setLongField(term113437, term113437.getClass(), "sumBattleExpertHighScore", 3912204850954989928L);
        setLongField(term113437, term113437.getClass(), "sumBattleMasterHighScore", 6224725874862308015L);
        setLongField(term113437, term113437.getClass(), "sumBattleLunaticHighScore", 2654298695450396481L);
        setField(term113437, term113437.getClass(), "eventWatchedDate", "qTgeYJrPfV");
        setField(term113437, term113437.getClass(), "cmEventWatchedDate", "aMXuzqauuw");
        setField(term113437, term113437.getClass(), "firstGameId", "OsLyHIAMvZ");
        setField(term113437, term113437.getClass(), "firstRomVersion", "fANlppmeZc");
        setField(term113437, term113437.getClass(), "firstDataVersion", "vwXdXCgQIr");
        setField(term113437, term113437.getClass(), "firstPlayDate", "nSnrziJcBE");
        setField(term113437, term113437.getClass(), "lastGameId", "xbhJrXUuCP");
        setField(term113437, term113437.getClass(), "lastRomVersion", "bvjVBhkXQU");
        setField(term113437, term113437.getClass(), "lastDataVersion", "IrOvUMupuD");
        setField(term113437, term113437.getClass(), "compatibleCmVersion", "UgFQTaylqs");
        setField(term113437, term113437.getClass(), "lastPlayDate", "CZksebZXsC");
        setIntField(term113437, term113437.getClass(), "lastPlaceId", 1708450733);
        setField(term113437, term113437.getClass(), "lastPlaceName", "NDTlULiAEp");
        setIntField(term113437, term113437.getClass(), "lastRegionId", -1788885241);
        setField(term113437, term113437.getClass(), "lastRegionName", "KakVHGlMtc");
        setIntField(term113437, term113437.getClass(), "lastAllNetId", 1187649321);
        setField(term113437, term113437.getClass(), "lastClientId", "XQkRBflDak");
        setIntField(term113437, term113437.getClass(), "lastUsedDeckId", 1329212097);
        setIntField(term113437, term113437.getClass(), "lastPlayMusicLevel", 325911335);
        setIntField(term113437, term113437.getClass(), "lastEmoneyBrand", -2141919241);
        setField(term113435, term113435.getClass(), "user", term113437);
        setIntField(term113435, term113435.getClass(), "cardId", -1);
        setIntField(term113435, term113435.getClass(), "digitalStock", 1);
        setIntField(term113435, term113435.getClass(), "analogStock", -1932169512);
        setIntField(term113435, term113435.getClass(), "level", 1375409503);
        setIntField(term113435, term113435.getClass(), "maxLevel", 10);
        setIntField(term113435, term113435.getClass(), "exp", 2036147808);
        setIntField(term113435, term113435.getClass(), "printCount", 1846382479);
        setIntField(term113435, term113435.getClass(), "useCount", -461438905);
        setBooleanField(term113435, term113435.getClass(), "isNew", true);
        setField(term113435, term113435.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term113435, term113435.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term113435, term113435.getClass(), "skillId", -1878286321);
        setBooleanField(term113435, term113435.getClass(), "isAcquired", true);
        setField(term113435, term113435.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDigitalStock", argTypes, term113435, args);
    }

};


