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

public class UserChapter_setId_39470638812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88397;
     Object term88671;

    public UserChapter_setId_39470638812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88403 = new Long(-1000830646340880796L);
        term88397 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term88399 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term88401 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term88417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88432 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88397, term88397.getClass(), "id", -5284499986511698301L);
        setLongField(term88399, term88399.getClass(), "id", -8886870795876891550L);
        setLongField(term88401, term88401.getClass(), "id", 4714001757937272987L);
        setField(term88401, term88401.getClass(), "extId", term88403);
        setField(term88401, term88401.getClass(), "luid", "MBkxidzets");
        setIntField(term88418, term88418.getClass(), "year", 2012);
        setShortField(term88418, term88418.getClass(), "month", (short) 7);
        setShortField(term88418, term88418.getClass(), "day", (short) 6);
        setField(term88417, term88417.getClass(), "date", term88418);
        setByteField(term88422, term88422.getClass(), "hour", (byte) 0);
        setByteField(term88422, term88422.getClass(), "minute", (byte) 48);
        setByteField(term88422, term88422.getClass(), "second", (byte) 16);
        setIntField(term88422, term88422.getClass(), "nano", 235139356);
        setField(term88417, term88417.getClass(), "time", term88422);
        setField(term88401, term88401.getClass(), "registerTime", term88417);
        setIntField(term88428, term88428.getClass(), "year", 2023);
        setShortField(term88428, term88428.getClass(), "month", (short) 2);
        setShortField(term88428, term88428.getClass(), "day", (short) 6);
        setField(term88427, term88427.getClass(), "date", term88428);
        setByteField(term88432, term88432.getClass(), "hour", (byte) 3);
        setByteField(term88432, term88432.getClass(), "minute", (byte) 1);
        setByteField(term88432, term88432.getClass(), "second", (byte) 52);
        setIntField(term88432, term88432.getClass(), "nano", 345404097);
        setField(term88427, term88427.getClass(), "time", term88432);
        setField(term88401, term88401.getClass(), "accessTime", term88427);
        setField(term88399, term88399.getClass(), "card", term88401);
        setField(term88399, term88399.getClass(), "userName", "PbMQbuzByL");
        setIntField(term88399, term88399.getClass(), "level", -352388461);
        setIntField(term88399, term88399.getClass(), "reincarnationNum", -476722971);
        setLongField(term88399, term88399.getClass(), "exp", 4834376760880884583L);
        setLongField(term88399, term88399.getClass(), "point", -6570219387007034075L);
        setLongField(term88399, term88399.getClass(), "totalPoint", -3413579640035550114L);
        setIntField(term88399, term88399.getClass(), "playCount", -1727779935);
        setIntField(term88399, term88399.getClass(), "jewelCount", 621731188);
        setIntField(term88399, term88399.getClass(), "totalJewelCount", 23497506);
        setIntField(term88399, term88399.getClass(), "medalCount", 1359512268);
        setIntField(term88399, term88399.getClass(), "playerRating", 738561796);
        setIntField(term88399, term88399.getClass(), "highestRating", 1485449254);
        setIntField(term88399, term88399.getClass(), "battlePoint", 477896598);
        setIntField(term88399, term88399.getClass(), "bestBattlePoint", -123400618);
        setIntField(term88399, term88399.getClass(), "overDamageBattlePoint", -1368246630);
        setBooleanField(term88399, term88399.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term88399, term88399.getClass(), "nameplateId", -217114557);
        setIntField(term88399, term88399.getClass(), "trophyId", 2000296922);
        setIntField(term88399, term88399.getClass(), "cardId", 356697128);
        setIntField(term88399, term88399.getClass(), "characterId", 393726126);
        setIntField(term88399, term88399.getClass(), "characterVoiceNo", 1781861518);
        setIntField(term88399, term88399.getClass(), "tabSetting", 1767385935);
        setIntField(term88399, term88399.getClass(), "tabSortSetting", -1208709585);
        setIntField(term88399, term88399.getClass(), "cardCategorySetting", 845734901);
        setIntField(term88399, term88399.getClass(), "cardSortSetting", 1158068248);
        setIntField(term88399, term88399.getClass(), "rivalScoreCategorySetting", -404489980);
        setIntField(term88399, term88399.getClass(), "playedTutorialBit", -1501688381);
        setIntField(term88399, term88399.getClass(), "firstTutorialCancelNum", -132991775);
        setLongField(term88399, term88399.getClass(), "sumTechHighScore", 4272894798367624363L);
        setLongField(term88399, term88399.getClass(), "sumTechBasicHighScore", -8629176539372583112L);
        setLongField(term88399, term88399.getClass(), "sumTechAdvancedHighScore", -4504123476834618959L);
        setLongField(term88399, term88399.getClass(), "sumTechExpertHighScore", 4324130988072072925L);
        setLongField(term88399, term88399.getClass(), "sumTechMasterHighScore", 1218466700428006458L);
        setLongField(term88399, term88399.getClass(), "sumTechLunaticHighScore", 2910835673340027471L);
        setLongField(term88399, term88399.getClass(), "sumBattleHighScore", 7535740177428257169L);
        setLongField(term88399, term88399.getClass(), "sumBattleBasicHighScore", -217553849551393777L);
        setLongField(term88399, term88399.getClass(), "sumBattleAdvancedHighScore", -4567914077856781243L);
        setLongField(term88399, term88399.getClass(), "sumBattleExpertHighScore", -3772628385704266817L);
        setLongField(term88399, term88399.getClass(), "sumBattleMasterHighScore", 3674075662000201844L);
        setLongField(term88399, term88399.getClass(), "sumBattleLunaticHighScore", 5265812777907707400L);
        setField(term88399, term88399.getClass(), "eventWatchedDate", "ILplPJhYrB");
        setField(term88399, term88399.getClass(), "cmEventWatchedDate", "ZLOixiOrLS");
        setField(term88399, term88399.getClass(), "firstGameId", "jyRmrZMyEy");
        setField(term88399, term88399.getClass(), "firstRomVersion", "EMhKuKuvTr");
        setField(term88399, term88399.getClass(), "firstDataVersion", "hjuOnNVIUc");
        setField(term88399, term88399.getClass(), "firstPlayDate", "MTxeYrMCEJ");
        setField(term88399, term88399.getClass(), "lastGameId", "SbPIlRKXLL");
        setField(term88399, term88399.getClass(), "lastRomVersion", "TGjqGBrVob");
        setField(term88399, term88399.getClass(), "lastDataVersion", "oOHlrJrFIp");
        setField(term88399, term88399.getClass(), "compatibleCmVersion", "vqZvnioIVM");
        setField(term88399, term88399.getClass(), "lastPlayDate", "CXNFlzEpBC");
        setIntField(term88399, term88399.getClass(), "lastPlaceId", -1962135802);
        setField(term88399, term88399.getClass(), "lastPlaceName", "qnsCYAsHRu");
        setIntField(term88399, term88399.getClass(), "lastRegionId", -1867466972);
        setField(term88399, term88399.getClass(), "lastRegionName", "qMoCYznUOe");
        setIntField(term88399, term88399.getClass(), "lastAllNetId", -462258168);
        setField(term88399, term88399.getClass(), "lastClientId", "fjOTVskUVh");
        setIntField(term88399, term88399.getClass(), "lastUsedDeckId", -163181513);
        setIntField(term88399, term88399.getClass(), "lastPlayMusicLevel", 744651672);
        setIntField(term88399, term88399.getClass(), "lastEmoneyBrand", 66267567);
        setField(term88397, term88397.getClass(), "user", term88399);
        setIntField(term88397, term88397.getClass(), "chapterId", 36897944);
        setIntField(term88397, term88397.getClass(), "jewelCount", -1128084769);
        setIntField(term88397, term88397.getClass(), "lastPlayMusicCategory", 608763750);
        setIntField(term88397, term88397.getClass(), "lastPlayMusicId", 1116153965);
        setIntField(term88397, term88397.getClass(), "lastPlayMusicLevel", 406334046);
        setBooleanField(term88397, term88397.getClass(), "isStoryWatched", false);
        setBooleanField(term88397, term88397.getClass(), "isClear", false);
        setIntField(term88397, term88397.getClass(), "skipTiming1", -1974618374);
        setIntField(term88397, term88397.getClass(), "skipTiming2", -1890769685);
        term88671 = new Long(7752215053758781516L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term88671;
        callMethod(klass, "setId", argTypes, term88397, args);
    }

};


