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

public class UserTradeItem_getId_9314282561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150692;

    public UserTradeItem_getId_9314282561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150698 = new Long(7800835025296877231L);
        term150692 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term150694 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term150696 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term150712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150727 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term150692, term150692.getClass(), "id", 8013717398432595872L);
        setLongField(term150694, term150694.getClass(), "id", 3067135285195138576L);
        setLongField(term150696, term150696.getClass(), "id", -751429747053624215L);
        setField(term150696, term150696.getClass(), "extId", term150698);
        setField(term150696, term150696.getClass(), "luid", "nozhcagtoi");
        setIntField(term150713, term150713.getClass(), "year", 2028);
        setShortField(term150713, term150713.getClass(), "month", (short) 2);
        setShortField(term150713, term150713.getClass(), "day", (short) 8);
        setField(term150712, term150712.getClass(), "date", term150713);
        setByteField(term150717, term150717.getClass(), "hour", (byte) 12);
        setByteField(term150717, term150717.getClass(), "minute", (byte) 27);
        setByteField(term150717, term150717.getClass(), "second", (byte) 18);
        setIntField(term150717, term150717.getClass(), "nano", 853147382);
        setField(term150712, term150712.getClass(), "time", term150717);
        setField(term150696, term150696.getClass(), "registerTime", term150712);
        setIntField(term150723, term150723.getClass(), "year", 2028);
        setShortField(term150723, term150723.getClass(), "month", (short) 10);
        setShortField(term150723, term150723.getClass(), "day", (short) 3);
        setField(term150722, term150722.getClass(), "date", term150723);
        setByteField(term150727, term150727.getClass(), "hour", (byte) 22);
        setByteField(term150727, term150727.getClass(), "minute", (byte) 20);
        setByteField(term150727, term150727.getClass(), "second", (byte) 16);
        setIntField(term150727, term150727.getClass(), "nano", 358560291);
        setField(term150722, term150722.getClass(), "time", term150727);
        setField(term150696, term150696.getClass(), "accessTime", term150722);
        setField(term150694, term150694.getClass(), "card", term150696);
        setField(term150694, term150694.getClass(), "userName", "UAotjofyqR");
        setIntField(term150694, term150694.getClass(), "level", -1128188846);
        setIntField(term150694, term150694.getClass(), "reincarnationNum", -1601581964);
        setLongField(term150694, term150694.getClass(), "exp", 928961495519619940L);
        setLongField(term150694, term150694.getClass(), "point", -5367691837393705882L);
        setLongField(term150694, term150694.getClass(), "totalPoint", 8115660654398370008L);
        setIntField(term150694, term150694.getClass(), "playCount", -1178253517);
        setIntField(term150694, term150694.getClass(), "jewelCount", 1443002510);
        setIntField(term150694, term150694.getClass(), "totalJewelCount", 1678623341);
        setIntField(term150694, term150694.getClass(), "medalCount", -1023826937);
        setIntField(term150694, term150694.getClass(), "playerRating", 1573871540);
        setIntField(term150694, term150694.getClass(), "highestRating", -848249952);
        setIntField(term150694, term150694.getClass(), "battlePoint", 1446304058);
        setIntField(term150694, term150694.getClass(), "bestBattlePoint", 1814136333);
        setIntField(term150694, term150694.getClass(), "overDamageBattlePoint", -1517722805);
        setBooleanField(term150694, term150694.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term150694, term150694.getClass(), "nameplateId", -659702501);
        setIntField(term150694, term150694.getClass(), "trophyId", -1876896401);
        setIntField(term150694, term150694.getClass(), "cardId", -718518592);
        setIntField(term150694, term150694.getClass(), "characterId", -632825483);
        setIntField(term150694, term150694.getClass(), "characterVoiceNo", 675039331);
        setIntField(term150694, term150694.getClass(), "tabSetting", -199646960);
        setIntField(term150694, term150694.getClass(), "tabSortSetting", -932918306);
        setIntField(term150694, term150694.getClass(), "cardCategorySetting", -736397590);
        setIntField(term150694, term150694.getClass(), "cardSortSetting", 1986891014);
        setIntField(term150694, term150694.getClass(), "rivalScoreCategorySetting", -1661858214);
        setIntField(term150694, term150694.getClass(), "playedTutorialBit", 1298044863);
        setIntField(term150694, term150694.getClass(), "firstTutorialCancelNum", 1115180322);
        setLongField(term150694, term150694.getClass(), "sumTechHighScore", -6666121238048397588L);
        setLongField(term150694, term150694.getClass(), "sumTechBasicHighScore", -2331721865328784449L);
        setLongField(term150694, term150694.getClass(), "sumTechAdvancedHighScore", -5655657591052152579L);
        setLongField(term150694, term150694.getClass(), "sumTechExpertHighScore", 6448036126646529126L);
        setLongField(term150694, term150694.getClass(), "sumTechMasterHighScore", -3610243477790348817L);
        setLongField(term150694, term150694.getClass(), "sumTechLunaticHighScore", -7999935213344871084L);
        setLongField(term150694, term150694.getClass(), "sumBattleHighScore", -4652386572157557169L);
        setLongField(term150694, term150694.getClass(), "sumBattleBasicHighScore", 4068660933771121363L);
        setLongField(term150694, term150694.getClass(), "sumBattleAdvancedHighScore", 2985864539120934146L);
        setLongField(term150694, term150694.getClass(), "sumBattleExpertHighScore", -66419523700932945L);
        setLongField(term150694, term150694.getClass(), "sumBattleMasterHighScore", 6949812586987088557L);
        setLongField(term150694, term150694.getClass(), "sumBattleLunaticHighScore", 6578303124806212669L);
        setField(term150694, term150694.getClass(), "eventWatchedDate", "ZVxspVELsB");
        setField(term150694, term150694.getClass(), "cmEventWatchedDate", "lwBTtSWyCb");
        setField(term150694, term150694.getClass(), "firstGameId", "jalAJUuHgn");
        setField(term150694, term150694.getClass(), "firstRomVersion", "KqPWpTvDAg");
        setField(term150694, term150694.getClass(), "firstDataVersion", "zhxNzTDkbQ");
        setField(term150694, term150694.getClass(), "firstPlayDate", "JwcYvvKRwe");
        setField(term150694, term150694.getClass(), "lastGameId", "okLcKGoawO");
        setField(term150694, term150694.getClass(), "lastRomVersion", "wuJRunvJUq");
        setField(term150694, term150694.getClass(), "lastDataVersion", "lkSPvxhaVR");
        setField(term150694, term150694.getClass(), "compatibleCmVersion", "hVlTtmyLIH");
        setField(term150694, term150694.getClass(), "lastPlayDate", "utKaBGMcsA");
        setIntField(term150694, term150694.getClass(), "lastPlaceId", -252644885);
        setField(term150694, term150694.getClass(), "lastPlaceName", "lmuWGCZjgE");
        setIntField(term150694, term150694.getClass(), "lastRegionId", -738886431);
        setField(term150694, term150694.getClass(), "lastRegionName", "cEZMciSNtX");
        setIntField(term150694, term150694.getClass(), "lastAllNetId", 1454600617);
        setField(term150694, term150694.getClass(), "lastClientId", "xRVYXsEcrn");
        setIntField(term150694, term150694.getClass(), "lastUsedDeckId", 279047706);
        setIntField(term150694, term150694.getClass(), "lastPlayMusicLevel", 330393546);
        setIntField(term150694, term150694.getClass(), "lastEmoneyBrand", -1272435460);
        setField(term150692, term150692.getClass(), "user", term150694);
        setIntField(term150692, term150692.getClass(), "chapterId", -1484603549);
        setIntField(term150692, term150692.getClass(), "tradeItemId", 1942980695);
        setIntField(term150692, term150692.getClass(), "tradeCount", 1796271838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term150692, args);
    }

};


