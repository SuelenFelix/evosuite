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

public class UserTradeItem_getTradeCount_20470022245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152404;

    public UserTradeItem_getTradeCount_20470022245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152410 = new Long(5797412846146719084L);
        term152404 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term152406 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term152408 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term152424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152439 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term152404, term152404.getClass(), "id", 8464707110276881577L);
        setLongField(term152406, term152406.getClass(), "id", -3940330606642650491L);
        setLongField(term152408, term152408.getClass(), "id", -2807569143698701278L);
        setField(term152408, term152408.getClass(), "extId", term152410);
        setField(term152408, term152408.getClass(), "luid", "IjWJbokDwC");
        setIntField(term152425, term152425.getClass(), "year", 2017);
        setShortField(term152425, term152425.getClass(), "month", (short) 2);
        setShortField(term152425, term152425.getClass(), "day", (short) 24);
        setField(term152424, term152424.getClass(), "date", term152425);
        setByteField(term152429, term152429.getClass(), "hour", (byte) 23);
        setByteField(term152429, term152429.getClass(), "minute", (byte) 46);
        setByteField(term152429, term152429.getClass(), "second", (byte) 43);
        setIntField(term152429, term152429.getClass(), "nano", 626549570);
        setField(term152424, term152424.getClass(), "time", term152429);
        setField(term152408, term152408.getClass(), "registerTime", term152424);
        setIntField(term152435, term152435.getClass(), "year", 2014);
        setShortField(term152435, term152435.getClass(), "month", (short) 4);
        setShortField(term152435, term152435.getClass(), "day", (short) 20);
        setField(term152434, term152434.getClass(), "date", term152435);
        setByteField(term152439, term152439.getClass(), "hour", (byte) 16);
        setByteField(term152439, term152439.getClass(), "minute", (byte) 19);
        setByteField(term152439, term152439.getClass(), "second", (byte) 50);
        setIntField(term152439, term152439.getClass(), "nano", 397343944);
        setField(term152434, term152434.getClass(), "time", term152439);
        setField(term152408, term152408.getClass(), "accessTime", term152434);
        setField(term152406, term152406.getClass(), "card", term152408);
        setField(term152406, term152406.getClass(), "userName", "CgjnSgLArx");
        setIntField(term152406, term152406.getClass(), "level", -589460764);
        setIntField(term152406, term152406.getClass(), "reincarnationNum", 1158956816);
        setLongField(term152406, term152406.getClass(), "exp", 7046600999249353201L);
        setLongField(term152406, term152406.getClass(), "point", -4982062716625861655L);
        setLongField(term152406, term152406.getClass(), "totalPoint", 2126814575177231106L);
        setIntField(term152406, term152406.getClass(), "playCount", -1817072774);
        setIntField(term152406, term152406.getClass(), "jewelCount", 1457278062);
        setIntField(term152406, term152406.getClass(), "totalJewelCount", 1950635891);
        setIntField(term152406, term152406.getClass(), "medalCount", 1872837544);
        setIntField(term152406, term152406.getClass(), "playerRating", 1853027403);
        setIntField(term152406, term152406.getClass(), "highestRating", 1076142687);
        setIntField(term152406, term152406.getClass(), "battlePoint", -1876139521);
        setIntField(term152406, term152406.getClass(), "bestBattlePoint", -241791599);
        setIntField(term152406, term152406.getClass(), "overDamageBattlePoint", 176773103);
        setBooleanField(term152406, term152406.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term152406, term152406.getClass(), "nameplateId", -1103469317);
        setIntField(term152406, term152406.getClass(), "trophyId", 19350338);
        setIntField(term152406, term152406.getClass(), "cardId", -1448947603);
        setIntField(term152406, term152406.getClass(), "characterId", 741952810);
        setIntField(term152406, term152406.getClass(), "characterVoiceNo", 1898180943);
        setIntField(term152406, term152406.getClass(), "tabSetting", -801187383);
        setIntField(term152406, term152406.getClass(), "tabSortSetting", -2118633501);
        setIntField(term152406, term152406.getClass(), "cardCategorySetting", 2007901309);
        setIntField(term152406, term152406.getClass(), "cardSortSetting", -287540465);
        setIntField(term152406, term152406.getClass(), "rivalScoreCategorySetting", -465195814);
        setIntField(term152406, term152406.getClass(), "playedTutorialBit", -313554253);
        setIntField(term152406, term152406.getClass(), "firstTutorialCancelNum", -934314073);
        setLongField(term152406, term152406.getClass(), "sumTechHighScore", 8926142430793076843L);
        setLongField(term152406, term152406.getClass(), "sumTechBasicHighScore", 5288301688317764685L);
        setLongField(term152406, term152406.getClass(), "sumTechAdvancedHighScore", -192549936143584170L);
        setLongField(term152406, term152406.getClass(), "sumTechExpertHighScore", -6661317679422299538L);
        setLongField(term152406, term152406.getClass(), "sumTechMasterHighScore", 2068218325920681528L);
        setLongField(term152406, term152406.getClass(), "sumTechLunaticHighScore", 3229316393582526543L);
        setLongField(term152406, term152406.getClass(), "sumBattleHighScore", 7987158063319221350L);
        setLongField(term152406, term152406.getClass(), "sumBattleBasicHighScore", -8217768358078527574L);
        setLongField(term152406, term152406.getClass(), "sumBattleAdvancedHighScore", 1833548258048611102L);
        setLongField(term152406, term152406.getClass(), "sumBattleExpertHighScore", -3911821256636668468L);
        setLongField(term152406, term152406.getClass(), "sumBattleMasterHighScore", -7705844481900898064L);
        setLongField(term152406, term152406.getClass(), "sumBattleLunaticHighScore", 5717095891175483546L);
        setField(term152406, term152406.getClass(), "eventWatchedDate", "VDsGrlxIKZ");
        setField(term152406, term152406.getClass(), "cmEventWatchedDate", "WWdkxUzoEC");
        setField(term152406, term152406.getClass(), "firstGameId", "rnkaCxMcIX");
        setField(term152406, term152406.getClass(), "firstRomVersion", "EFZQPeNhLf");
        setField(term152406, term152406.getClass(), "firstDataVersion", "XEJckhziWa");
        setField(term152406, term152406.getClass(), "firstPlayDate", "rnwvPkpKVX");
        setField(term152406, term152406.getClass(), "lastGameId", "BxSVyceqSm");
        setField(term152406, term152406.getClass(), "lastRomVersion", "wMPExrcpuS");
        setField(term152406, term152406.getClass(), "lastDataVersion", "OarbTBiJae");
        setField(term152406, term152406.getClass(), "compatibleCmVersion", "mXZKaytExY");
        setField(term152406, term152406.getClass(), "lastPlayDate", "YePrhNqEVB");
        setIntField(term152406, term152406.getClass(), "lastPlaceId", 1640531917);
        setField(term152406, term152406.getClass(), "lastPlaceName", "ItBnSfBOeK");
        setIntField(term152406, term152406.getClass(), "lastRegionId", -871360111);
        setField(term152406, term152406.getClass(), "lastRegionName", "UgJLdCLLek");
        setIntField(term152406, term152406.getClass(), "lastAllNetId", 931050250);
        setField(term152406, term152406.getClass(), "lastClientId", "lWjrRjjSxQ");
        setIntField(term152406, term152406.getClass(), "lastUsedDeckId", -1686618770);
        setIntField(term152406, term152406.getClass(), "lastPlayMusicLevel", -1592104600);
        setIntField(term152406, term152406.getClass(), "lastEmoneyBrand", -500126132);
        setField(term152404, term152404.getClass(), "user", term152406);
        setIntField(term152404, term152404.getClass(), "chapterId", -327712746);
        setIntField(term152404, term152404.getClass(), "tradeItemId", -1446388321);
        setIntField(term152404, term152404.getClass(), "tradeCount", 283077570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeCount", argTypes, term152404, args);
    }

};


