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

public class UserStory_toString_86057981020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166685;

    public UserStory_toString_86057981020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166691 = new Long(-6001151456088965547L);
        term166685 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term166687 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term166689 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166720 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166685, term166685.getClass(), "id", -3202506619411872674L);
        setLongField(term166687, term166687.getClass(), "id", -1568734926667301919L);
        setLongField(term166689, term166689.getClass(), "id", 8404979198900872572L);
        setField(term166689, term166689.getClass(), "extId", term166691);
        setField(term166689, term166689.getClass(), "luid", "ZEKHvyxbLZ");
        setIntField(term166706, term166706.getClass(), "year", 2014);
        setShortField(term166706, term166706.getClass(), "month", (short) 11);
        setShortField(term166706, term166706.getClass(), "day", (short) 28);
        setField(term166705, term166705.getClass(), "date", term166706);
        setByteField(term166710, term166710.getClass(), "hour", (byte) 8);
        setByteField(term166710, term166710.getClass(), "minute", (byte) 59);
        setByteField(term166710, term166710.getClass(), "second", (byte) 49);
        setIntField(term166710, term166710.getClass(), "nano", 282127919);
        setField(term166705, term166705.getClass(), "time", term166710);
        setField(term166689, term166689.getClass(), "registerTime", term166705);
        setIntField(term166716, term166716.getClass(), "year", 2024);
        setShortField(term166716, term166716.getClass(), "month", (short) 5);
        setShortField(term166716, term166716.getClass(), "day", (short) 26);
        setField(term166715, term166715.getClass(), "date", term166716);
        setByteField(term166720, term166720.getClass(), "hour", (byte) 8);
        setByteField(term166720, term166720.getClass(), "minute", (byte) 3);
        setByteField(term166720, term166720.getClass(), "second", (byte) 32);
        setIntField(term166720, term166720.getClass(), "nano", 10833029);
        setField(term166715, term166715.getClass(), "time", term166720);
        setField(term166689, term166689.getClass(), "accessTime", term166715);
        setField(term166687, term166687.getClass(), "card", term166689);
        setField(term166687, term166687.getClass(), "userName", "BRBhgpeeOx");
        setIntField(term166687, term166687.getClass(), "level", 284875252);
        setIntField(term166687, term166687.getClass(), "reincarnationNum", -1037642084);
        setLongField(term166687, term166687.getClass(), "exp", 3663186706641799531L);
        setLongField(term166687, term166687.getClass(), "point", 2516991685981339429L);
        setLongField(term166687, term166687.getClass(), "totalPoint", -7553534160311859168L);
        setIntField(term166687, term166687.getClass(), "playCount", -1771453281);
        setIntField(term166687, term166687.getClass(), "jewelCount", -1850267429);
        setIntField(term166687, term166687.getClass(), "totalJewelCount", 1810435844);
        setIntField(term166687, term166687.getClass(), "medalCount", 733566791);
        setIntField(term166687, term166687.getClass(), "playerRating", 1116868023);
        setIntField(term166687, term166687.getClass(), "highestRating", -880728130);
        setIntField(term166687, term166687.getClass(), "battlePoint", -931337079);
        setIntField(term166687, term166687.getClass(), "bestBattlePoint", 1123970734);
        setIntField(term166687, term166687.getClass(), "overDamageBattlePoint", -649594954);
        setBooleanField(term166687, term166687.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term166687, term166687.getClass(), "nameplateId", 70645068);
        setIntField(term166687, term166687.getClass(), "trophyId", -151223836);
        setIntField(term166687, term166687.getClass(), "cardId", 1752322336);
        setIntField(term166687, term166687.getClass(), "characterId", 173612084);
        setIntField(term166687, term166687.getClass(), "characterVoiceNo", 1186172025);
        setIntField(term166687, term166687.getClass(), "tabSetting", -323007757);
        setIntField(term166687, term166687.getClass(), "tabSortSetting", 1298918335);
        setIntField(term166687, term166687.getClass(), "cardCategorySetting", 669874346);
        setIntField(term166687, term166687.getClass(), "cardSortSetting", -547487291);
        setIntField(term166687, term166687.getClass(), "rivalScoreCategorySetting", 718172838);
        setIntField(term166687, term166687.getClass(), "playedTutorialBit", 1520055684);
        setIntField(term166687, term166687.getClass(), "firstTutorialCancelNum", -2007202523);
        setLongField(term166687, term166687.getClass(), "sumTechHighScore", 2360637695125275815L);
        setLongField(term166687, term166687.getClass(), "sumTechBasicHighScore", 4067141811082925813L);
        setLongField(term166687, term166687.getClass(), "sumTechAdvancedHighScore", -2948442217672242951L);
        setLongField(term166687, term166687.getClass(), "sumTechExpertHighScore", 5797750485291180901L);
        setLongField(term166687, term166687.getClass(), "sumTechMasterHighScore", 4303446906012330238L);
        setLongField(term166687, term166687.getClass(), "sumTechLunaticHighScore", 3830648831449737036L);
        setLongField(term166687, term166687.getClass(), "sumBattleHighScore", -8881687333773912565L);
        setLongField(term166687, term166687.getClass(), "sumBattleBasicHighScore", 5798023326474789142L);
        setLongField(term166687, term166687.getClass(), "sumBattleAdvancedHighScore", -3421826060398099290L);
        setLongField(term166687, term166687.getClass(), "sumBattleExpertHighScore", -6532658972813252072L);
        setLongField(term166687, term166687.getClass(), "sumBattleMasterHighScore", -7964720472911740015L);
        setLongField(term166687, term166687.getClass(), "sumBattleLunaticHighScore", -4050135177435410627L);
        setField(term166687, term166687.getClass(), "eventWatchedDate", "UWmJYgkKXW");
        setField(term166687, term166687.getClass(), "cmEventWatchedDate", "JCqswoYQxx");
        setField(term166687, term166687.getClass(), "firstGameId", "DbEuFCyCVD");
        setField(term166687, term166687.getClass(), "firstRomVersion", "othiXLVzxi");
        setField(term166687, term166687.getClass(), "firstDataVersion", "vOXulKGXoU");
        setField(term166687, term166687.getClass(), "firstPlayDate", "LztrXeTaAH");
        setField(term166687, term166687.getClass(), "lastGameId", "QecEdGoJpa");
        setField(term166687, term166687.getClass(), "lastRomVersion", "UgGneVxowB");
        setField(term166687, term166687.getClass(), "lastDataVersion", "wOjvNSyyFk");
        setField(term166687, term166687.getClass(), "compatibleCmVersion", "VISpVdjKtx");
        setField(term166687, term166687.getClass(), "lastPlayDate", "ztJDdQOJaI");
        setIntField(term166687, term166687.getClass(), "lastPlaceId", 2083513828);
        setField(term166687, term166687.getClass(), "lastPlaceName", "BBYhufonfC");
        setIntField(term166687, term166687.getClass(), "lastRegionId", 1152264913);
        setField(term166687, term166687.getClass(), "lastRegionName", "gONpcfzuaS");
        setIntField(term166687, term166687.getClass(), "lastAllNetId", -938013563);
        setField(term166687, term166687.getClass(), "lastClientId", "GFIAakuePk");
        setIntField(term166687, term166687.getClass(), "lastUsedDeckId", -1414495690);
        setIntField(term166687, term166687.getClass(), "lastPlayMusicLevel", -1835290975);
        setIntField(term166687, term166687.getClass(), "lastEmoneyBrand", 801385795);
        setField(term166685, term166685.getClass(), "user", term166687);
        setIntField(term166685, term166685.getClass(), "storyId", -629922950);
        setIntField(term166685, term166685.getClass(), "lastChapterId", 1161572908);
        setIntField(term166685, term166685.getClass(), "jewelCount", -861910530);
        setIntField(term166685, term166685.getClass(), "lastPlayMusicId", 243055128);
        setIntField(term166685, term166685.getClass(), "lastPlayMusicCategory", -345324675);
        setIntField(term166685, term166685.getClass(), "lastPlayMusicLevel", 1865838980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term166685, args);
    }

};


