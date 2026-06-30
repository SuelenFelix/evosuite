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

public class UserData_getHighestRating_176665747913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27417;

    public UserData_getHighestRating_176665747913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27421 = new Long(2443640364875054177L);
        term27417 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term27419 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term27435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27450 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term27417, term27417.getClass(), "id", -7136884452108210749L);
        setLongField(term27419, term27419.getClass(), "id", 9152536589169023749L);
        setField(term27419, term27419.getClass(), "extId", term27421);
        setField(term27419, term27419.getClass(), "luid", "muefchpJiZ");
        setIntField(term27436, term27436.getClass(), "year", 2016);
        setShortField(term27436, term27436.getClass(), "month", (short) 4);
        setShortField(term27436, term27436.getClass(), "day", (short) 18);
        setField(term27435, term27435.getClass(), "date", term27436);
        setByteField(term27440, term27440.getClass(), "hour", (byte) 15);
        setByteField(term27440, term27440.getClass(), "minute", (byte) 56);
        setByteField(term27440, term27440.getClass(), "second", (byte) 45);
        setIntField(term27440, term27440.getClass(), "nano", 248103350);
        setField(term27435, term27435.getClass(), "time", term27440);
        setField(term27419, term27419.getClass(), "registerTime", term27435);
        setIntField(term27446, term27446.getClass(), "year", 2028);
        setShortField(term27446, term27446.getClass(), "month", (short) 3);
        setShortField(term27446, term27446.getClass(), "day", (short) 25);
        setField(term27445, term27445.getClass(), "date", term27446);
        setByteField(term27450, term27450.getClass(), "hour", (byte) 6);
        setByteField(term27450, term27450.getClass(), "minute", (byte) 9);
        setByteField(term27450, term27450.getClass(), "second", (byte) 35);
        setIntField(term27450, term27450.getClass(), "nano", 744453524);
        setField(term27445, term27445.getClass(), "time", term27450);
        setField(term27419, term27419.getClass(), "accessTime", term27445);
        setField(term27417, term27417.getClass(), "card", term27419);
        setField(term27417, term27417.getClass(), "userName", "tuYaAqvYrh");
        setIntField(term27417, term27417.getClass(), "level", -1632221612);
        setIntField(term27417, term27417.getClass(), "reincarnationNum", 1545314376);
        setLongField(term27417, term27417.getClass(), "exp", 2829028216156787199L);
        setLongField(term27417, term27417.getClass(), "point", -1571430290273452440L);
        setLongField(term27417, term27417.getClass(), "totalPoint", -8441035120108438069L);
        setIntField(term27417, term27417.getClass(), "playCount", 437959151);
        setIntField(term27417, term27417.getClass(), "jewelCount", 27780241);
        setIntField(term27417, term27417.getClass(), "totalJewelCount", -683868408);
        setIntField(term27417, term27417.getClass(), "medalCount", -381130069);
        setIntField(term27417, term27417.getClass(), "playerRating", 885769749);
        setIntField(term27417, term27417.getClass(), "highestRating", -1021168716);
        setIntField(term27417, term27417.getClass(), "battlePoint", -1238055654);
        setIntField(term27417, term27417.getClass(), "bestBattlePoint", 1561513428);
        setIntField(term27417, term27417.getClass(), "overDamageBattlePoint", 778959809);
        setBooleanField(term27417, term27417.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term27417, term27417.getClass(), "nameplateId", -7504064);
        setIntField(term27417, term27417.getClass(), "trophyId", -1464364418);
        setIntField(term27417, term27417.getClass(), "cardId", 1050420173);
        setIntField(term27417, term27417.getClass(), "characterId", 994300935);
        setIntField(term27417, term27417.getClass(), "characterVoiceNo", 433954476);
        setIntField(term27417, term27417.getClass(), "tabSetting", 1780958641);
        setIntField(term27417, term27417.getClass(), "tabSortSetting", 1890582085);
        setIntField(term27417, term27417.getClass(), "cardCategorySetting", 2146568808);
        setIntField(term27417, term27417.getClass(), "cardSortSetting", 245081679);
        setIntField(term27417, term27417.getClass(), "rivalScoreCategorySetting", 1199789398);
        setIntField(term27417, term27417.getClass(), "playedTutorialBit", -1056402285);
        setIntField(term27417, term27417.getClass(), "firstTutorialCancelNum", 1881803912);
        setLongField(term27417, term27417.getClass(), "sumTechHighScore", -715683813342234891L);
        setLongField(term27417, term27417.getClass(), "sumTechBasicHighScore", -7012409967252303497L);
        setLongField(term27417, term27417.getClass(), "sumTechAdvancedHighScore", 1203458433789323993L);
        setLongField(term27417, term27417.getClass(), "sumTechExpertHighScore", -8021019578361035942L);
        setLongField(term27417, term27417.getClass(), "sumTechMasterHighScore", 7534205281044116098L);
        setLongField(term27417, term27417.getClass(), "sumTechLunaticHighScore", -4078647199307459633L);
        setLongField(term27417, term27417.getClass(), "sumBattleHighScore", -2505751043723962819L);
        setLongField(term27417, term27417.getClass(), "sumBattleBasicHighScore", 8156554915757243776L);
        setLongField(term27417, term27417.getClass(), "sumBattleAdvancedHighScore", -351840430901591519L);
        setLongField(term27417, term27417.getClass(), "sumBattleExpertHighScore", 3900637824492447206L);
        setLongField(term27417, term27417.getClass(), "sumBattleMasterHighScore", 5914809586547397675L);
        setLongField(term27417, term27417.getClass(), "sumBattleLunaticHighScore", -8946539398468447729L);
        setField(term27417, term27417.getClass(), "eventWatchedDate", "CIbhheukbR");
        setField(term27417, term27417.getClass(), "cmEventWatchedDate", "VOHPpErtan");
        setField(term27417, term27417.getClass(), "firstGameId", "GDMUlolTNs");
        setField(term27417, term27417.getClass(), "firstRomVersion", "xpLvWisjzN");
        setField(term27417, term27417.getClass(), "firstDataVersion", "IKfozyyKEj");
        setField(term27417, term27417.getClass(), "firstPlayDate", "thCjwQjRBL");
        setField(term27417, term27417.getClass(), "lastGameId", "ojLrjltndD");
        setField(term27417, term27417.getClass(), "lastRomVersion", "VJtFSexKat");
        setField(term27417, term27417.getClass(), "lastDataVersion", "xPVddlPSQR");
        setField(term27417, term27417.getClass(), "compatibleCmVersion", "MxrhCLTMTH");
        setField(term27417, term27417.getClass(), "lastPlayDate", "kEehLMZcOU");
        setIntField(term27417, term27417.getClass(), "lastPlaceId", -188535038);
        setField(term27417, term27417.getClass(), "lastPlaceName", "RhLliqMiOF");
        setIntField(term27417, term27417.getClass(), "lastRegionId", 254650626);
        setField(term27417, term27417.getClass(), "lastRegionName", "jlhonEGrJH");
        setIntField(term27417, term27417.getClass(), "lastAllNetId", -1789030917);
        setField(term27417, term27417.getClass(), "lastClientId", "RKcKwlEYZb");
        setIntField(term27417, term27417.getClass(), "lastUsedDeckId", 912208163);
        setIntField(term27417, term27417.getClass(), "lastPlayMusicLevel", 909767683);
        setIntField(term27417, term27417.getClass(), "lastEmoneyBrand", -639390893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term27417, args);
    }

};


