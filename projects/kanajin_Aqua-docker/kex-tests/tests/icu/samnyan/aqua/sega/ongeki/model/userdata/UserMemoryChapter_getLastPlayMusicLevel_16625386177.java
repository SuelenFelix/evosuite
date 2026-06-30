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

public class UserMemoryChapter_getLastPlayMusicLevel_16625386177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391950;

    public UserMemoryChapter_getLastPlayMusicLevel_16625386177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term391956 = new Long(-6339531459447942677L);
        term391950 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term391952 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term391954 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term391970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term391980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391985 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term391950, term391950.getClass(), "id", -5881864128557828709L);
        setLongField(term391952, term391952.getClass(), "id", -6537019787724760657L);
        setLongField(term391954, term391954.getClass(), "id", 1817418065261000790L);
        setField(term391954, term391954.getClass(), "extId", term391956);
        setField(term391954, term391954.getClass(), "luid", "zMgfHIpwBi");
        setIntField(term391971, term391971.getClass(), "year", 2012);
        setShortField(term391971, term391971.getClass(), "month", (short) 7);
        setShortField(term391971, term391971.getClass(), "day", (short) 9);
        setField(term391970, term391970.getClass(), "date", term391971);
        setByteField(term391975, term391975.getClass(), "hour", (byte) 5);
        setByteField(term391975, term391975.getClass(), "minute", (byte) 16);
        setByteField(term391975, term391975.getClass(), "second", (byte) 26);
        setIntField(term391975, term391975.getClass(), "nano", 245766052);
        setField(term391970, term391970.getClass(), "time", term391975);
        setField(term391954, term391954.getClass(), "registerTime", term391970);
        setIntField(term391981, term391981.getClass(), "year", 2012);
        setShortField(term391981, term391981.getClass(), "month", (short) 8);
        setShortField(term391981, term391981.getClass(), "day", (short) 14);
        setField(term391980, term391980.getClass(), "date", term391981);
        setByteField(term391985, term391985.getClass(), "hour", (byte) 7);
        setByteField(term391985, term391985.getClass(), "minute", (byte) 45);
        setByteField(term391985, term391985.getClass(), "second", (byte) 8);
        setIntField(term391985, term391985.getClass(), "nano", 893541326);
        setField(term391980, term391980.getClass(), "time", term391985);
        setField(term391954, term391954.getClass(), "accessTime", term391980);
        setField(term391952, term391952.getClass(), "card", term391954);
        setField(term391952, term391952.getClass(), "userName", "mTDjHwvtPw");
        setIntField(term391952, term391952.getClass(), "level", 1137483902);
        setIntField(term391952, term391952.getClass(), "reincarnationNum", 933662973);
        setLongField(term391952, term391952.getClass(), "exp", 1945027355281057156L);
        setLongField(term391952, term391952.getClass(), "point", 3370630482381339865L);
        setLongField(term391952, term391952.getClass(), "totalPoint", 8672067880957285121L);
        setIntField(term391952, term391952.getClass(), "playCount", 2057811119);
        setIntField(term391952, term391952.getClass(), "jewelCount", 212890700);
        setIntField(term391952, term391952.getClass(), "totalJewelCount", -1630458952);
        setIntField(term391952, term391952.getClass(), "medalCount", -1650722477);
        setIntField(term391952, term391952.getClass(), "playerRating", 947089281);
        setIntField(term391952, term391952.getClass(), "highestRating", 919869472);
        setIntField(term391952, term391952.getClass(), "battlePoint", 1397882193);
        setIntField(term391952, term391952.getClass(), "bestBattlePoint", 1822515851);
        setIntField(term391952, term391952.getClass(), "overDamageBattlePoint", 1695308625);
        setBooleanField(term391952, term391952.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term391952, term391952.getClass(), "nameplateId", 568702345);
        setIntField(term391952, term391952.getClass(), "trophyId", 877145670);
        setIntField(term391952, term391952.getClass(), "cardId", -873369093);
        setIntField(term391952, term391952.getClass(), "characterId", 155785743);
        setIntField(term391952, term391952.getClass(), "characterVoiceNo", -721693062);
        setIntField(term391952, term391952.getClass(), "tabSetting", 1222441954);
        setIntField(term391952, term391952.getClass(), "tabSortSetting", 833471210);
        setIntField(term391952, term391952.getClass(), "cardCategorySetting", -1329452178);
        setIntField(term391952, term391952.getClass(), "cardSortSetting", -818180142);
        setIntField(term391952, term391952.getClass(), "rivalScoreCategorySetting", 1539266621);
        setIntField(term391952, term391952.getClass(), "playedTutorialBit", -69990705);
        setIntField(term391952, term391952.getClass(), "firstTutorialCancelNum", -1928373490);
        setLongField(term391952, term391952.getClass(), "sumTechHighScore", 3364039392435306012L);
        setLongField(term391952, term391952.getClass(), "sumTechBasicHighScore", 8046629692203974178L);
        setLongField(term391952, term391952.getClass(), "sumTechAdvancedHighScore", 7977342867375651948L);
        setLongField(term391952, term391952.getClass(), "sumTechExpertHighScore", -6127875256888913472L);
        setLongField(term391952, term391952.getClass(), "sumTechMasterHighScore", 3256068873615938705L);
        setLongField(term391952, term391952.getClass(), "sumTechLunaticHighScore", 5992533975673253210L);
        setLongField(term391952, term391952.getClass(), "sumBattleHighScore", -8585140677504195278L);
        setLongField(term391952, term391952.getClass(), "sumBattleBasicHighScore", 531813655363085079L);
        setLongField(term391952, term391952.getClass(), "sumBattleAdvancedHighScore", 7424508585687574136L);
        setLongField(term391952, term391952.getClass(), "sumBattleExpertHighScore", -6597239125670473205L);
        setLongField(term391952, term391952.getClass(), "sumBattleMasterHighScore", -8452072070590375950L);
        setLongField(term391952, term391952.getClass(), "sumBattleLunaticHighScore", -5208220124363333447L);
        setField(term391952, term391952.getClass(), "eventWatchedDate", "gjVjAtcLvg");
        setField(term391952, term391952.getClass(), "cmEventWatchedDate", "tUHDMNldyJ");
        setField(term391952, term391952.getClass(), "firstGameId", "sDtrZfNIDv");
        setField(term391952, term391952.getClass(), "firstRomVersion", "saEbSbqZDI");
        setField(term391952, term391952.getClass(), "firstDataVersion", "dIlcBUmBkG");
        setField(term391952, term391952.getClass(), "firstPlayDate", "DZFsoTUvVY");
        setField(term391952, term391952.getClass(), "lastGameId", "QtwpfBlEts");
        setField(term391952, term391952.getClass(), "lastRomVersion", "rbqBNaWBib");
        setField(term391952, term391952.getClass(), "lastDataVersion", "cmhkSlCxpr");
        setField(term391952, term391952.getClass(), "compatibleCmVersion", "WYFpWkRgrZ");
        setField(term391952, term391952.getClass(), "lastPlayDate", "JAEfUKpRUJ");
        setIntField(term391952, term391952.getClass(), "lastPlaceId", -81477975);
        setField(term391952, term391952.getClass(), "lastPlaceName", "lwdpctzKMD");
        setIntField(term391952, term391952.getClass(), "lastRegionId", 1931706117);
        setField(term391952, term391952.getClass(), "lastRegionName", "YsqsSJHMZV");
        setIntField(term391952, term391952.getClass(), "lastAllNetId", 1147696318);
        setField(term391952, term391952.getClass(), "lastClientId", "gfaLLgdUFm");
        setIntField(term391952, term391952.getClass(), "lastUsedDeckId", 1122725084);
        setIntField(term391952, term391952.getClass(), "lastPlayMusicLevel", -1210824980);
        setIntField(term391952, term391952.getClass(), "lastEmoneyBrand", 1319146112);
        setField(term391950, term391950.getClass(), "user", term391952);
        setIntField(term391950, term391950.getClass(), "chapterId", -879543265);
        setIntField(term391950, term391950.getClass(), "jewelCount", -474240071);
        setIntField(term391950, term391950.getClass(), "lastPlayMusicCategory", -1726798037);
        setIntField(term391950, term391950.getClass(), "lastPlayMusicId", -656636720);
        setIntField(term391950, term391950.getClass(), "lastPlayMusicLevel", -736760160);
        setBooleanField(term391950, term391950.getClass(), "isDialogWatched", false);
        setBooleanField(term391950, term391950.getClass(), "isStoryWatched", false);
        setBooleanField(term391950, term391950.getClass(), "isBossWatched", true);
        setBooleanField(term391950, term391950.getClass(), "isClear", false);
        setIntField(term391950, term391950.getClass(), "gaugeId", -1917895079);
        setIntField(term391950, term391950.getClass(), "gaugeNum", -1256032847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicLevel", argTypes, term391950, args);
    }

};


