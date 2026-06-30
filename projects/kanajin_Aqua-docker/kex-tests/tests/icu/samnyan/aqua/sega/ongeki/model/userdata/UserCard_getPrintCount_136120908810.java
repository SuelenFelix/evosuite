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

public class UserCard_getPrintCount_136120908810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116275;

    public UserCard_getPrintCount_136120908810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116281 = new Long(6906379511067694917L);
        term116275 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term116277 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term116279 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116300 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116310 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116275, term116275.getClass(), "id", -6253934328283057504L);
        setLongField(term116277, term116277.getClass(), "id", 3713848376567912938L);
        setLongField(term116279, term116279.getClass(), "id", -4137616400402939720L);
        setField(term116279, term116279.getClass(), "extId", term116281);
        setField(term116279, term116279.getClass(), "luid", "TwSWGxsbpT");
        setIntField(term116296, term116296.getClass(), "year", 2018);
        setShortField(term116296, term116296.getClass(), "month", (short) 11);
        setShortField(term116296, term116296.getClass(), "day", (short) 14);
        setField(term116295, term116295.getClass(), "date", term116296);
        setByteField(term116300, term116300.getClass(), "hour", (byte) 18);
        setByteField(term116300, term116300.getClass(), "minute", (byte) 31);
        setByteField(term116300, term116300.getClass(), "second", (byte) 15);
        setIntField(term116300, term116300.getClass(), "nano", 39699749);
        setField(term116295, term116295.getClass(), "time", term116300);
        setField(term116279, term116279.getClass(), "registerTime", term116295);
        setIntField(term116306, term116306.getClass(), "year", 2019);
        setShortField(term116306, term116306.getClass(), "month", (short) 4);
        setShortField(term116306, term116306.getClass(), "day", (short) 21);
        setField(term116305, term116305.getClass(), "date", term116306);
        setByteField(term116310, term116310.getClass(), "hour", (byte) 12);
        setByteField(term116310, term116310.getClass(), "minute", (byte) 13);
        setByteField(term116310, term116310.getClass(), "second", (byte) 21);
        setIntField(term116310, term116310.getClass(), "nano", 906802544);
        setField(term116305, term116305.getClass(), "time", term116310);
        setField(term116279, term116279.getClass(), "accessTime", term116305);
        setField(term116277, term116277.getClass(), "card", term116279);
        setField(term116277, term116277.getClass(), "userName", "hfUAGLGTYY");
        setIntField(term116277, term116277.getClass(), "level", 842419931);
        setIntField(term116277, term116277.getClass(), "reincarnationNum", 886819304);
        setLongField(term116277, term116277.getClass(), "exp", -6896370617690744610L);
        setLongField(term116277, term116277.getClass(), "point", 4664056082590139952L);
        setLongField(term116277, term116277.getClass(), "totalPoint", -2712035353119298543L);
        setIntField(term116277, term116277.getClass(), "playCount", 639833326);
        setIntField(term116277, term116277.getClass(), "jewelCount", -884990158);
        setIntField(term116277, term116277.getClass(), "totalJewelCount", 765840331);
        setIntField(term116277, term116277.getClass(), "medalCount", 1089843929);
        setIntField(term116277, term116277.getClass(), "playerRating", 1964061073);
        setIntField(term116277, term116277.getClass(), "highestRating", -1274174342);
        setIntField(term116277, term116277.getClass(), "battlePoint", 269850713);
        setIntField(term116277, term116277.getClass(), "bestBattlePoint", -1487569724);
        setIntField(term116277, term116277.getClass(), "overDamageBattlePoint", 288903600);
        setBooleanField(term116277, term116277.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term116277, term116277.getClass(), "nameplateId", -972943452);
        setIntField(term116277, term116277.getClass(), "trophyId", -1263692965);
        setIntField(term116277, term116277.getClass(), "cardId", 47709908);
        setIntField(term116277, term116277.getClass(), "characterId", 1429392228);
        setIntField(term116277, term116277.getClass(), "characterVoiceNo", 2122239536);
        setIntField(term116277, term116277.getClass(), "tabSetting", 542088374);
        setIntField(term116277, term116277.getClass(), "tabSortSetting", -950297218);
        setIntField(term116277, term116277.getClass(), "cardCategorySetting", 1244123877);
        setIntField(term116277, term116277.getClass(), "cardSortSetting", -1662703727);
        setIntField(term116277, term116277.getClass(), "rivalScoreCategorySetting", 1279906508);
        setIntField(term116277, term116277.getClass(), "playedTutorialBit", -238375706);
        setIntField(term116277, term116277.getClass(), "firstTutorialCancelNum", 1556952863);
        setLongField(term116277, term116277.getClass(), "sumTechHighScore", 2534920768365402522L);
        setLongField(term116277, term116277.getClass(), "sumTechBasicHighScore", 1066110019893361801L);
        setLongField(term116277, term116277.getClass(), "sumTechAdvancedHighScore", 1501895881804735310L);
        setLongField(term116277, term116277.getClass(), "sumTechExpertHighScore", 2077149601016238322L);
        setLongField(term116277, term116277.getClass(), "sumTechMasterHighScore", 7419192550269143474L);
        setLongField(term116277, term116277.getClass(), "sumTechLunaticHighScore", 7449371433563839869L);
        setLongField(term116277, term116277.getClass(), "sumBattleHighScore", -1145233084819251782L);
        setLongField(term116277, term116277.getClass(), "sumBattleBasicHighScore", 2787860581510753796L);
        setLongField(term116277, term116277.getClass(), "sumBattleAdvancedHighScore", -3215691322338440270L);
        setLongField(term116277, term116277.getClass(), "sumBattleExpertHighScore", -6378350748168909199L);
        setLongField(term116277, term116277.getClass(), "sumBattleMasterHighScore", 4172508245451084859L);
        setLongField(term116277, term116277.getClass(), "sumBattleLunaticHighScore", -6796641557522852512L);
        setField(term116277, term116277.getClass(), "eventWatchedDate", "pjXjkGlBZo");
        setField(term116277, term116277.getClass(), "cmEventWatchedDate", "pHNOfQlhKa");
        setField(term116277, term116277.getClass(), "firstGameId", "rsZnYHnYCE");
        setField(term116277, term116277.getClass(), "firstRomVersion", "xVlcioeikJ");
        setField(term116277, term116277.getClass(), "firstDataVersion", "nDWnDqypnc");
        setField(term116277, term116277.getClass(), "firstPlayDate", "YUysoEeBVh");
        setField(term116277, term116277.getClass(), "lastGameId", "UALDaFojXX");
        setField(term116277, term116277.getClass(), "lastRomVersion", "zfXUaOpwPJ");
        setField(term116277, term116277.getClass(), "lastDataVersion", "AdOVSTNkEG");
        setField(term116277, term116277.getClass(), "compatibleCmVersion", "BTnZZOfDVg");
        setField(term116277, term116277.getClass(), "lastPlayDate", "ntMbgqrkHY");
        setIntField(term116277, term116277.getClass(), "lastPlaceId", -198148044);
        setField(term116277, term116277.getClass(), "lastPlaceName", "ysjcSaLtGI");
        setIntField(term116277, term116277.getClass(), "lastRegionId", 1022014258);
        setField(term116277, term116277.getClass(), "lastRegionName", "OqSicVymRV");
        setIntField(term116277, term116277.getClass(), "lastAllNetId", -125889150);
        setField(term116277, term116277.getClass(), "lastClientId", "wiCYSRXKPQ");
        setIntField(term116277, term116277.getClass(), "lastUsedDeckId", 1022350206);
        setIntField(term116277, term116277.getClass(), "lastPlayMusicLevel", -171751232);
        setIntField(term116277, term116277.getClass(), "lastEmoneyBrand", -999681370);
        setField(term116275, term116275.getClass(), "user", term116277);
        setIntField(term116275, term116275.getClass(), "cardId", -1);
        setIntField(term116275, term116275.getClass(), "digitalStock", 1);
        setIntField(term116275, term116275.getClass(), "analogStock", 1143545597);
        setIntField(term116275, term116275.getClass(), "level", 1949354764);
        setIntField(term116275, term116275.getClass(), "maxLevel", 10);
        setIntField(term116275, term116275.getClass(), "exp", -1317200481);
        setIntField(term116275, term116275.getClass(), "printCount", -229302209);
        setIntField(term116275, term116275.getClass(), "useCount", -1214413475);
        setBooleanField(term116275, term116275.getClass(), "isNew", true);
        setField(term116275, term116275.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term116275, term116275.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term116275, term116275.getClass(), "skillId", 351461566);
        setBooleanField(term116275, term116275.getClass(), "isAcquired", true);
        setField(term116275, term116275.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintCount", argTypes, term116275, args);
    }

};


