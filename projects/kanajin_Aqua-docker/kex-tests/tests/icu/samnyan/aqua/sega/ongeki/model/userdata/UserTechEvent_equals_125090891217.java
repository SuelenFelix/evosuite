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

public class UserTechEvent_equals_125090891217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359259;
     Object term359541;

    public UserTechEvent_equals_125090891217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term359265 = new Long(6762397834421232825L);
        term359259 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term359261 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term359263 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term359279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term359280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term359284 = newInstance(Class.forName("java.time.LocalTime"));
        Object term359289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term359290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term359294 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term359259, term359259.getClass(), "id", -6996373469440184142L);
        setLongField(term359261, term359261.getClass(), "id", 4122822041568359585L);
        setLongField(term359263, term359263.getClass(), "id", -2440152312723417459L);
        setField(term359263, term359263.getClass(), "extId", term359265);
        setField(term359263, term359263.getClass(), "luid", "KaYErWMcJS");
        setIntField(term359280, term359280.getClass(), "year", 2029);
        setShortField(term359280, term359280.getClass(), "month", (short) 8);
        setShortField(term359280, term359280.getClass(), "day", (short) 24);
        setField(term359279, term359279.getClass(), "date", term359280);
        setByteField(term359284, term359284.getClass(), "hour", (byte) 16);
        setByteField(term359284, term359284.getClass(), "minute", (byte) 57);
        setByteField(term359284, term359284.getClass(), "second", (byte) 12);
        setIntField(term359284, term359284.getClass(), "nano", 555196978);
        setField(term359279, term359279.getClass(), "time", term359284);
        setField(term359263, term359263.getClass(), "registerTime", term359279);
        setIntField(term359290, term359290.getClass(), "year", 2027);
        setShortField(term359290, term359290.getClass(), "month", (short) 6);
        setShortField(term359290, term359290.getClass(), "day", (short) 28);
        setField(term359289, term359289.getClass(), "date", term359290);
        setByteField(term359294, term359294.getClass(), "hour", (byte) 8);
        setByteField(term359294, term359294.getClass(), "minute", (byte) 14);
        setByteField(term359294, term359294.getClass(), "second", (byte) 0);
        setIntField(term359294, term359294.getClass(), "nano", 347823714);
        setField(term359289, term359289.getClass(), "time", term359294);
        setField(term359263, term359263.getClass(), "accessTime", term359289);
        setField(term359261, term359261.getClass(), "card", term359263);
        setField(term359261, term359261.getClass(), "userName", "BzVShvjOdM");
        setIntField(term359261, term359261.getClass(), "level", 618905752);
        setIntField(term359261, term359261.getClass(), "reincarnationNum", -453977448);
        setLongField(term359261, term359261.getClass(), "exp", 1277826025030451936L);
        setLongField(term359261, term359261.getClass(), "point", -8181659302945583084L);
        setLongField(term359261, term359261.getClass(), "totalPoint", -6561112622690063962L);
        setIntField(term359261, term359261.getClass(), "playCount", -2098862591);
        setIntField(term359261, term359261.getClass(), "jewelCount", -1471620493);
        setIntField(term359261, term359261.getClass(), "totalJewelCount", -484325069);
        setIntField(term359261, term359261.getClass(), "medalCount", 1614600757);
        setIntField(term359261, term359261.getClass(), "playerRating", -1745581845);
        setIntField(term359261, term359261.getClass(), "highestRating", -1928986675);
        setIntField(term359261, term359261.getClass(), "battlePoint", 360617774);
        setIntField(term359261, term359261.getClass(), "bestBattlePoint", 1610539203);
        setIntField(term359261, term359261.getClass(), "overDamageBattlePoint", 683919505);
        setBooleanField(term359261, term359261.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term359261, term359261.getClass(), "nameplateId", -1351852644);
        setIntField(term359261, term359261.getClass(), "trophyId", 1906743531);
        setIntField(term359261, term359261.getClass(), "cardId", -1493344895);
        setIntField(term359261, term359261.getClass(), "characterId", 289545927);
        setIntField(term359261, term359261.getClass(), "characterVoiceNo", 1156549512);
        setIntField(term359261, term359261.getClass(), "tabSetting", 1699580240);
        setIntField(term359261, term359261.getClass(), "tabSortSetting", -1798206453);
        setIntField(term359261, term359261.getClass(), "cardCategorySetting", -634269550);
        setIntField(term359261, term359261.getClass(), "cardSortSetting", 1164744694);
        setIntField(term359261, term359261.getClass(), "rivalScoreCategorySetting", 2005763639);
        setIntField(term359261, term359261.getClass(), "playedTutorialBit", 1706153199);
        setIntField(term359261, term359261.getClass(), "firstTutorialCancelNum", 361301301);
        setLongField(term359261, term359261.getClass(), "sumTechHighScore", 3846424542691228845L);
        setLongField(term359261, term359261.getClass(), "sumTechBasicHighScore", 6344401311784491384L);
        setLongField(term359261, term359261.getClass(), "sumTechAdvancedHighScore", 2676476292397641692L);
        setLongField(term359261, term359261.getClass(), "sumTechExpertHighScore", 6714009858289313823L);
        setLongField(term359261, term359261.getClass(), "sumTechMasterHighScore", -3284736467771789152L);
        setLongField(term359261, term359261.getClass(), "sumTechLunaticHighScore", -2331498031166375764L);
        setLongField(term359261, term359261.getClass(), "sumBattleHighScore", 5363422466673593117L);
        setLongField(term359261, term359261.getClass(), "sumBattleBasicHighScore", 1553888073073778619L);
        setLongField(term359261, term359261.getClass(), "sumBattleAdvancedHighScore", -1524170227263367046L);
        setLongField(term359261, term359261.getClass(), "sumBattleExpertHighScore", 238644453115447292L);
        setLongField(term359261, term359261.getClass(), "sumBattleMasterHighScore", -5164055518276706036L);
        setLongField(term359261, term359261.getClass(), "sumBattleLunaticHighScore", 3751915578150836975L);
        setField(term359261, term359261.getClass(), "eventWatchedDate", "lHBEPYGKgl");
        setField(term359261, term359261.getClass(), "cmEventWatchedDate", "zgIExYJcqb");
        setField(term359261, term359261.getClass(), "firstGameId", "FXlVsFVqKL");
        setField(term359261, term359261.getClass(), "firstRomVersion", "UqUmOdicPq");
        setField(term359261, term359261.getClass(), "firstDataVersion", "eKdRNVXgWK");
        setField(term359261, term359261.getClass(), "firstPlayDate", "QbxkINpIeP");
        setField(term359261, term359261.getClass(), "lastGameId", "XpibzQSlpk");
        setField(term359261, term359261.getClass(), "lastRomVersion", "cCINHKehbG");
        setField(term359261, term359261.getClass(), "lastDataVersion", "ZYmkKKSqxV");
        setField(term359261, term359261.getClass(), "compatibleCmVersion", "pJRBgCaTos");
        setField(term359261, term359261.getClass(), "lastPlayDate", "NFjBLAbwyt");
        setIntField(term359261, term359261.getClass(), "lastPlaceId", -999199550);
        setField(term359261, term359261.getClass(), "lastPlaceName", "NLuipWkkqQ");
        setIntField(term359261, term359261.getClass(), "lastRegionId", 1589029129);
        setField(term359261, term359261.getClass(), "lastRegionName", "lioOVZKDhE");
        setIntField(term359261, term359261.getClass(), "lastAllNetId", -299293824);
        setField(term359261, term359261.getClass(), "lastClientId", "sGMYhknZLN");
        setIntField(term359261, term359261.getClass(), "lastUsedDeckId", -99759765);
        setIntField(term359261, term359261.getClass(), "lastPlayMusicLevel", 1481198379);
        setIntField(term359261, term359261.getClass(), "lastEmoneyBrand", -185793115);
        setField(term359259, term359259.getClass(), "user", term359261);
        setIntField(term359259, term359259.getClass(), "eventId", 1737311465);
        setIntField(term359259, term359259.getClass(), "totalTechScore", -912751888);
        setIntField(term359259, term359259.getClass(), "totalPlatinumScore", 1304466190);
        setField(term359259, term359259.getClass(), "techRecordDate", "mLougrnVBe");
        setBooleanField(term359259, term359259.getClass(), "isRankingRewarded", true);
        setBooleanField(term359259, term359259.getClass(), "isTotalTechNewRecord", true);
        term359541 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term359541;
        callMethod(klass, "equals", argTypes, term359259, args);
    }

};


