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

public class UserChapter_getSkipTiming2_2289454811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87963;

    public UserChapter_getSkipTiming2_2289454811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87969 = new Long(-1505191021111100819L);
        term87963 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term87965 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term87967 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87988 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87998 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87963, term87963.getClass(), "id", 296176504085562157L);
        setLongField(term87965, term87965.getClass(), "id", -8754845690934701873L);
        setLongField(term87967, term87967.getClass(), "id", -9130931529513264634L);
        setField(term87967, term87967.getClass(), "extId", term87969);
        setField(term87967, term87967.getClass(), "luid", "sbsbTdToVA");
        setIntField(term87984, term87984.getClass(), "year", 2013);
        setShortField(term87984, term87984.getClass(), "month", (short) 7);
        setShortField(term87984, term87984.getClass(), "day", (short) 2);
        setField(term87983, term87983.getClass(), "date", term87984);
        setByteField(term87988, term87988.getClass(), "hour", (byte) 12);
        setByteField(term87988, term87988.getClass(), "minute", (byte) 16);
        setByteField(term87988, term87988.getClass(), "second", (byte) 13);
        setIntField(term87988, term87988.getClass(), "nano", 479538808);
        setField(term87983, term87983.getClass(), "time", term87988);
        setField(term87967, term87967.getClass(), "registerTime", term87983);
        setIntField(term87994, term87994.getClass(), "year", 2012);
        setShortField(term87994, term87994.getClass(), "month", (short) 10);
        setShortField(term87994, term87994.getClass(), "day", (short) 26);
        setField(term87993, term87993.getClass(), "date", term87994);
        setByteField(term87998, term87998.getClass(), "hour", (byte) 13);
        setByteField(term87998, term87998.getClass(), "minute", (byte) 50);
        setByteField(term87998, term87998.getClass(), "second", (byte) 34);
        setIntField(term87998, term87998.getClass(), "nano", 738625041);
        setField(term87993, term87993.getClass(), "time", term87998);
        setField(term87967, term87967.getClass(), "accessTime", term87993);
        setField(term87965, term87965.getClass(), "card", term87967);
        setField(term87965, term87965.getClass(), "userName", "PTMnmtfPDP");
        setIntField(term87965, term87965.getClass(), "level", -972072842);
        setIntField(term87965, term87965.getClass(), "reincarnationNum", -1654330782);
        setLongField(term87965, term87965.getClass(), "exp", -3784941054078150666L);
        setLongField(term87965, term87965.getClass(), "point", -5473289678956769394L);
        setLongField(term87965, term87965.getClass(), "totalPoint", 1682107454655274084L);
        setIntField(term87965, term87965.getClass(), "playCount", 618840851);
        setIntField(term87965, term87965.getClass(), "jewelCount", 879137590);
        setIntField(term87965, term87965.getClass(), "totalJewelCount", 388908072);
        setIntField(term87965, term87965.getClass(), "medalCount", -605646727);
        setIntField(term87965, term87965.getClass(), "playerRating", -1938624293);
        setIntField(term87965, term87965.getClass(), "highestRating", 1289551510);
        setIntField(term87965, term87965.getClass(), "battlePoint", 1397954481);
        setIntField(term87965, term87965.getClass(), "bestBattlePoint", -394854340);
        setIntField(term87965, term87965.getClass(), "overDamageBattlePoint", -519383992);
        setBooleanField(term87965, term87965.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term87965, term87965.getClass(), "nameplateId", -1783256546);
        setIntField(term87965, term87965.getClass(), "trophyId", -19542865);
        setIntField(term87965, term87965.getClass(), "cardId", 311289836);
        setIntField(term87965, term87965.getClass(), "characterId", -1424263819);
        setIntField(term87965, term87965.getClass(), "characterVoiceNo", -620026126);
        setIntField(term87965, term87965.getClass(), "tabSetting", 489378978);
        setIntField(term87965, term87965.getClass(), "tabSortSetting", -1498567410);
        setIntField(term87965, term87965.getClass(), "cardCategorySetting", 1977510197);
        setIntField(term87965, term87965.getClass(), "cardSortSetting", 1801307871);
        setIntField(term87965, term87965.getClass(), "rivalScoreCategorySetting", -528389150);
        setIntField(term87965, term87965.getClass(), "playedTutorialBit", -1003260338);
        setIntField(term87965, term87965.getClass(), "firstTutorialCancelNum", -1745035486);
        setLongField(term87965, term87965.getClass(), "sumTechHighScore", -4816041910670569630L);
        setLongField(term87965, term87965.getClass(), "sumTechBasicHighScore", -1787967031647261832L);
        setLongField(term87965, term87965.getClass(), "sumTechAdvancedHighScore", 6923295800018827960L);
        setLongField(term87965, term87965.getClass(), "sumTechExpertHighScore", -2861825709944291199L);
        setLongField(term87965, term87965.getClass(), "sumTechMasterHighScore", 8351145561182470563L);
        setLongField(term87965, term87965.getClass(), "sumTechLunaticHighScore", -7104210321005753947L);
        setLongField(term87965, term87965.getClass(), "sumBattleHighScore", -6940797163068748652L);
        setLongField(term87965, term87965.getClass(), "sumBattleBasicHighScore", 1997269281468700420L);
        setLongField(term87965, term87965.getClass(), "sumBattleAdvancedHighScore", -7128006109272835548L);
        setLongField(term87965, term87965.getClass(), "sumBattleExpertHighScore", -1369792038073493476L);
        setLongField(term87965, term87965.getClass(), "sumBattleMasterHighScore", 5718274845956420880L);
        setLongField(term87965, term87965.getClass(), "sumBattleLunaticHighScore", 6700769086218292078L);
        setField(term87965, term87965.getClass(), "eventWatchedDate", "POLJqDqHhk");
        setField(term87965, term87965.getClass(), "cmEventWatchedDate", "eXlhmImRUd");
        setField(term87965, term87965.getClass(), "firstGameId", "pNjJQBsfBv");
        setField(term87965, term87965.getClass(), "firstRomVersion", "AeoFWTVnXE");
        setField(term87965, term87965.getClass(), "firstDataVersion", "KNodpPTOen");
        setField(term87965, term87965.getClass(), "firstPlayDate", "HLdVSdPKUm");
        setField(term87965, term87965.getClass(), "lastGameId", "cKqYMrtneQ");
        setField(term87965, term87965.getClass(), "lastRomVersion", "CgvYDHvQnF");
        setField(term87965, term87965.getClass(), "lastDataVersion", "wzvrwvpSgi");
        setField(term87965, term87965.getClass(), "compatibleCmVersion", "qwrZBRPuHr");
        setField(term87965, term87965.getClass(), "lastPlayDate", "ZlmkgzeZIu");
        setIntField(term87965, term87965.getClass(), "lastPlaceId", -271936794);
        setField(term87965, term87965.getClass(), "lastPlaceName", "SFuBQQfwki");
        setIntField(term87965, term87965.getClass(), "lastRegionId", -732944429);
        setField(term87965, term87965.getClass(), "lastRegionName", "ryTUTfVgWx");
        setIntField(term87965, term87965.getClass(), "lastAllNetId", 1929605024);
        setField(term87965, term87965.getClass(), "lastClientId", "ImdGsYOHJc");
        setIntField(term87965, term87965.getClass(), "lastUsedDeckId", 1011940597);
        setIntField(term87965, term87965.getClass(), "lastPlayMusicLevel", -404969989);
        setIntField(term87965, term87965.getClass(), "lastEmoneyBrand", 1371124822);
        setField(term87963, term87963.getClass(), "user", term87965);
        setIntField(term87963, term87963.getClass(), "chapterId", 1936895143);
        setIntField(term87963, term87963.getClass(), "jewelCount", 1980832536);
        setIntField(term87963, term87963.getClass(), "lastPlayMusicCategory", 1221783561);
        setIntField(term87963, term87963.getClass(), "lastPlayMusicId", 1025766530);
        setIntField(term87963, term87963.getClass(), "lastPlayMusicLevel", 1023561050);
        setBooleanField(term87963, term87963.getClass(), "isStoryWatched", false);
        setBooleanField(term87963, term87963.getClass(), "isClear", false);
        setIntField(term87963, term87963.getClass(), "skipTiming1", -661014919);
        setIntField(term87963, term87963.getClass(), "skipTiming2", 1431348538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipTiming2", argTypes, term87963, args);
    }

};


