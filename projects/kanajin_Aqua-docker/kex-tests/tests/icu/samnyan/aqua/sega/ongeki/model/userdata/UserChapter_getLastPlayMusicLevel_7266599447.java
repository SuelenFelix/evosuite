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

public class UserChapter_getLastPlayMusicLevel_7266599447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86227;

    public UserChapter_getLastPlayMusicLevel_7266599447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86233 = new Long(3412644969878030772L);
        term86227 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term86229 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term86231 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86262 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86227, term86227.getClass(), "id", 6492381027575773403L);
        setLongField(term86229, term86229.getClass(), "id", 6221129827146726907L);
        setLongField(term86231, term86231.getClass(), "id", -1704070927923118226L);
        setField(term86231, term86231.getClass(), "extId", term86233);
        setField(term86231, term86231.getClass(), "luid", "lWuRJaTZQB");
        setIntField(term86248, term86248.getClass(), "year", 2026);
        setShortField(term86248, term86248.getClass(), "month", (short) 2);
        setShortField(term86248, term86248.getClass(), "day", (short) 26);
        setField(term86247, term86247.getClass(), "date", term86248);
        setByteField(term86252, term86252.getClass(), "hour", (byte) 12);
        setByteField(term86252, term86252.getClass(), "minute", (byte) 23);
        setByteField(term86252, term86252.getClass(), "second", (byte) 14);
        setIntField(term86252, term86252.getClass(), "nano", 86303611);
        setField(term86247, term86247.getClass(), "time", term86252);
        setField(term86231, term86231.getClass(), "registerTime", term86247);
        setIntField(term86258, term86258.getClass(), "year", 2014);
        setShortField(term86258, term86258.getClass(), "month", (short) 6);
        setShortField(term86258, term86258.getClass(), "day", (short) 12);
        setField(term86257, term86257.getClass(), "date", term86258);
        setByteField(term86262, term86262.getClass(), "hour", (byte) 5);
        setByteField(term86262, term86262.getClass(), "minute", (byte) 4);
        setByteField(term86262, term86262.getClass(), "second", (byte) 20);
        setIntField(term86262, term86262.getClass(), "nano", 169602296);
        setField(term86257, term86257.getClass(), "time", term86262);
        setField(term86231, term86231.getClass(), "accessTime", term86257);
        setField(term86229, term86229.getClass(), "card", term86231);
        setField(term86229, term86229.getClass(), "userName", "jiQYzmbdOz");
        setIntField(term86229, term86229.getClass(), "level", -1215654854);
        setIntField(term86229, term86229.getClass(), "reincarnationNum", -1460137915);
        setLongField(term86229, term86229.getClass(), "exp", 6525218690517857760L);
        setLongField(term86229, term86229.getClass(), "point", 2364419711427198598L);
        setLongField(term86229, term86229.getClass(), "totalPoint", 4336444065655990676L);
        setIntField(term86229, term86229.getClass(), "playCount", 2048263826);
        setIntField(term86229, term86229.getClass(), "jewelCount", -1353079280);
        setIntField(term86229, term86229.getClass(), "totalJewelCount", -1053470670);
        setIntField(term86229, term86229.getClass(), "medalCount", 421827493);
        setIntField(term86229, term86229.getClass(), "playerRating", 720401594);
        setIntField(term86229, term86229.getClass(), "highestRating", -814068886);
        setIntField(term86229, term86229.getClass(), "battlePoint", -393844160);
        setIntField(term86229, term86229.getClass(), "bestBattlePoint", -1396955867);
        setIntField(term86229, term86229.getClass(), "overDamageBattlePoint", 1259575995);
        setBooleanField(term86229, term86229.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term86229, term86229.getClass(), "nameplateId", 1206636813);
        setIntField(term86229, term86229.getClass(), "trophyId", -1592307241);
        setIntField(term86229, term86229.getClass(), "cardId", -92983331);
        setIntField(term86229, term86229.getClass(), "characterId", -1635511750);
        setIntField(term86229, term86229.getClass(), "characterVoiceNo", -1920687540);
        setIntField(term86229, term86229.getClass(), "tabSetting", 1907562616);
        setIntField(term86229, term86229.getClass(), "tabSortSetting", -1207669605);
        setIntField(term86229, term86229.getClass(), "cardCategorySetting", 154054470);
        setIntField(term86229, term86229.getClass(), "cardSortSetting", 843710230);
        setIntField(term86229, term86229.getClass(), "rivalScoreCategorySetting", 547665841);
        setIntField(term86229, term86229.getClass(), "playedTutorialBit", -12983617);
        setIntField(term86229, term86229.getClass(), "firstTutorialCancelNum", -1791051420);
        setLongField(term86229, term86229.getClass(), "sumTechHighScore", 4007346133763031616L);
        setLongField(term86229, term86229.getClass(), "sumTechBasicHighScore", -7343171770196184946L);
        setLongField(term86229, term86229.getClass(), "sumTechAdvancedHighScore", 5459829007364846914L);
        setLongField(term86229, term86229.getClass(), "sumTechExpertHighScore", 7148575471460448931L);
        setLongField(term86229, term86229.getClass(), "sumTechMasterHighScore", 8335887334290544891L);
        setLongField(term86229, term86229.getClass(), "sumTechLunaticHighScore", 8963160764064975857L);
        setLongField(term86229, term86229.getClass(), "sumBattleHighScore", 8932899372281216559L);
        setLongField(term86229, term86229.getClass(), "sumBattleBasicHighScore", 8842706058648130302L);
        setLongField(term86229, term86229.getClass(), "sumBattleAdvancedHighScore", 8506289577201910194L);
        setLongField(term86229, term86229.getClass(), "sumBattleExpertHighScore", 1522368261418581280L);
        setLongField(term86229, term86229.getClass(), "sumBattleMasterHighScore", 3573708020919423347L);
        setLongField(term86229, term86229.getClass(), "sumBattleLunaticHighScore", -1532437908938429154L);
        setField(term86229, term86229.getClass(), "eventWatchedDate", "HBnovMFfRR");
        setField(term86229, term86229.getClass(), "cmEventWatchedDate", "kvBRGWtVMY");
        setField(term86229, term86229.getClass(), "firstGameId", "nnkddhphsi");
        setField(term86229, term86229.getClass(), "firstRomVersion", "VPJfuXpuzc");
        setField(term86229, term86229.getClass(), "firstDataVersion", "zdrDwRmBqL");
        setField(term86229, term86229.getClass(), "firstPlayDate", "DhSRNlYOFL");
        setField(term86229, term86229.getClass(), "lastGameId", "mrmNORhOYE");
        setField(term86229, term86229.getClass(), "lastRomVersion", "IAlXRzFnsw");
        setField(term86229, term86229.getClass(), "lastDataVersion", "QGWHwsqzqh");
        setField(term86229, term86229.getClass(), "compatibleCmVersion", "HToXzWGnjh");
        setField(term86229, term86229.getClass(), "lastPlayDate", "ymGhnCkAFG");
        setIntField(term86229, term86229.getClass(), "lastPlaceId", 98451832);
        setField(term86229, term86229.getClass(), "lastPlaceName", "JYQEoThPjD");
        setIntField(term86229, term86229.getClass(), "lastRegionId", 584008261);
        setField(term86229, term86229.getClass(), "lastRegionName", "uUYeaeRaCx");
        setIntField(term86229, term86229.getClass(), "lastAllNetId", -881683610);
        setField(term86229, term86229.getClass(), "lastClientId", "oCpxzVdxcV");
        setIntField(term86229, term86229.getClass(), "lastUsedDeckId", -109698584);
        setIntField(term86229, term86229.getClass(), "lastPlayMusicLevel", 2001696613);
        setIntField(term86229, term86229.getClass(), "lastEmoneyBrand", -1753516884);
        setField(term86227, term86227.getClass(), "user", term86229);
        setIntField(term86227, term86227.getClass(), "chapterId", -1562955063);
        setIntField(term86227, term86227.getClass(), "jewelCount", -1549644922);
        setIntField(term86227, term86227.getClass(), "lastPlayMusicCategory", 1217352889);
        setIntField(term86227, term86227.getClass(), "lastPlayMusicId", 159996093);
        setIntField(term86227, term86227.getClass(), "lastPlayMusicLevel", 1937937383);
        setBooleanField(term86227, term86227.getClass(), "isStoryWatched", true);
        setBooleanField(term86227, term86227.getClass(), "isClear", true);
        setIntField(term86227, term86227.getClass(), "skipTiming1", -639813848);
        setIntField(term86227, term86227.getClass(), "skipTiming2", 1894367611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicLevel", argTypes, term86227, args);
    }

};


