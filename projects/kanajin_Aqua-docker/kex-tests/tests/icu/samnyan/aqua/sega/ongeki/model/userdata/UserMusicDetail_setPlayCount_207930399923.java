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
import java.lang.Integer;

public class UserMusicDetail_setPlayCount_207930399923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414302;
     Object term414583;

    public UserMusicDetail_setPlayCount_207930399923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term414308 = new Long(1099634235456795888L);
        term414302 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term414304 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term414306 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term414322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term414332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414337 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term414302, term414302.getClass(), "id", 3623611926868571828L);
        setLongField(term414304, term414304.getClass(), "id", -3939690111188283558L);
        setLongField(term414306, term414306.getClass(), "id", 6875600921774329932L);
        setField(term414306, term414306.getClass(), "extId", term414308);
        setField(term414306, term414306.getClass(), "luid", "gFFlDSjsFz");
        setIntField(term414323, term414323.getClass(), "year", 2017);
        setShortField(term414323, term414323.getClass(), "month", (short) 7);
        setShortField(term414323, term414323.getClass(), "day", (short) 5);
        setField(term414322, term414322.getClass(), "date", term414323);
        setByteField(term414327, term414327.getClass(), "hour", (byte) 0);
        setByteField(term414327, term414327.getClass(), "minute", (byte) 48);
        setByteField(term414327, term414327.getClass(), "second", (byte) 55);
        setIntField(term414327, term414327.getClass(), "nano", 844860119);
        setField(term414322, term414322.getClass(), "time", term414327);
        setField(term414306, term414306.getClass(), "registerTime", term414322);
        setIntField(term414333, term414333.getClass(), "year", 2019);
        setShortField(term414333, term414333.getClass(), "month", (short) 1);
        setShortField(term414333, term414333.getClass(), "day", (short) 21);
        setField(term414332, term414332.getClass(), "date", term414333);
        setByteField(term414337, term414337.getClass(), "hour", (byte) 13);
        setByteField(term414337, term414337.getClass(), "minute", (byte) 7);
        setByteField(term414337, term414337.getClass(), "second", (byte) 20);
        setIntField(term414337, term414337.getClass(), "nano", 614879984);
        setField(term414332, term414332.getClass(), "time", term414337);
        setField(term414306, term414306.getClass(), "accessTime", term414332);
        setField(term414304, term414304.getClass(), "card", term414306);
        setField(term414304, term414304.getClass(), "userName", "frOtsHCxyQ");
        setIntField(term414304, term414304.getClass(), "level", 1607957654);
        setIntField(term414304, term414304.getClass(), "reincarnationNum", -59664884);
        setLongField(term414304, term414304.getClass(), "exp", 1945786842702342816L);
        setLongField(term414304, term414304.getClass(), "point", -5856663061297395403L);
        setLongField(term414304, term414304.getClass(), "totalPoint", 342405590015060410L);
        setIntField(term414304, term414304.getClass(), "playCount", -1056818063);
        setIntField(term414304, term414304.getClass(), "jewelCount", 2004874275);
        setIntField(term414304, term414304.getClass(), "totalJewelCount", 2031158728);
        setIntField(term414304, term414304.getClass(), "medalCount", 2000485452);
        setIntField(term414304, term414304.getClass(), "playerRating", 63654074);
        setIntField(term414304, term414304.getClass(), "highestRating", 1518861614);
        setIntField(term414304, term414304.getClass(), "battlePoint", -1620760467);
        setIntField(term414304, term414304.getClass(), "bestBattlePoint", -550377019);
        setIntField(term414304, term414304.getClass(), "overDamageBattlePoint", -579868202);
        setBooleanField(term414304, term414304.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term414304, term414304.getClass(), "nameplateId", -1268844584);
        setIntField(term414304, term414304.getClass(), "trophyId", 849828222);
        setIntField(term414304, term414304.getClass(), "cardId", -1301472148);
        setIntField(term414304, term414304.getClass(), "characterId", 1650866028);
        setIntField(term414304, term414304.getClass(), "characterVoiceNo", -320484786);
        setIntField(term414304, term414304.getClass(), "tabSetting", 137982095);
        setIntField(term414304, term414304.getClass(), "tabSortSetting", -1937618451);
        setIntField(term414304, term414304.getClass(), "cardCategorySetting", 394067809);
        setIntField(term414304, term414304.getClass(), "cardSortSetting", -1230092531);
        setIntField(term414304, term414304.getClass(), "rivalScoreCategorySetting", -875148899);
        setIntField(term414304, term414304.getClass(), "playedTutorialBit", -2100750297);
        setIntField(term414304, term414304.getClass(), "firstTutorialCancelNum", 147441465);
        setLongField(term414304, term414304.getClass(), "sumTechHighScore", -7687022627215517637L);
        setLongField(term414304, term414304.getClass(), "sumTechBasicHighScore", 2107349572202884833L);
        setLongField(term414304, term414304.getClass(), "sumTechAdvancedHighScore", 8645576326471415756L);
        setLongField(term414304, term414304.getClass(), "sumTechExpertHighScore", 4923751263613469995L);
        setLongField(term414304, term414304.getClass(), "sumTechMasterHighScore", 2095193084161053695L);
        setLongField(term414304, term414304.getClass(), "sumTechLunaticHighScore", 6825054282336528432L);
        setLongField(term414304, term414304.getClass(), "sumBattleHighScore", -200831944276355880L);
        setLongField(term414304, term414304.getClass(), "sumBattleBasicHighScore", 959287416076214768L);
        setLongField(term414304, term414304.getClass(), "sumBattleAdvancedHighScore", 507666997367064778L);
        setLongField(term414304, term414304.getClass(), "sumBattleExpertHighScore", -173984731064360204L);
        setLongField(term414304, term414304.getClass(), "sumBattleMasterHighScore", -8824108742021876868L);
        setLongField(term414304, term414304.getClass(), "sumBattleLunaticHighScore", -3717127548746024782L);
        setField(term414304, term414304.getClass(), "eventWatchedDate", "nPaTcLcOOp");
        setField(term414304, term414304.getClass(), "cmEventWatchedDate", "lJfJWlpNWg");
        setField(term414304, term414304.getClass(), "firstGameId", "ZYGImtiMGs");
        setField(term414304, term414304.getClass(), "firstRomVersion", "IVkOASeTjo");
        setField(term414304, term414304.getClass(), "firstDataVersion", "iNqaAIWcwl");
        setField(term414304, term414304.getClass(), "firstPlayDate", "OjIMdLYinO");
        setField(term414304, term414304.getClass(), "lastGameId", "yBCOjimCqV");
        setField(term414304, term414304.getClass(), "lastRomVersion", "mDmoPQkbIJ");
        setField(term414304, term414304.getClass(), "lastDataVersion", "UUfFmNiyHz");
        setField(term414304, term414304.getClass(), "compatibleCmVersion", "pjCORcEkXz");
        setField(term414304, term414304.getClass(), "lastPlayDate", "kxXndZHtZQ");
        setIntField(term414304, term414304.getClass(), "lastPlaceId", -1480483727);
        setField(term414304, term414304.getClass(), "lastPlaceName", "cwFmpmjmwp");
        setIntField(term414304, term414304.getClass(), "lastRegionId", -2000797942);
        setField(term414304, term414304.getClass(), "lastRegionName", "wxhgaFkBcE");
        setIntField(term414304, term414304.getClass(), "lastAllNetId", 1973201114);
        setField(term414304, term414304.getClass(), "lastClientId", "HxKMSwsscj");
        setIntField(term414304, term414304.getClass(), "lastUsedDeckId", 1529544630);
        setIntField(term414304, term414304.getClass(), "lastPlayMusicLevel", -73029237);
        setIntField(term414304, term414304.getClass(), "lastEmoneyBrand", 463650788);
        setField(term414302, term414302.getClass(), "user", term414304);
        setIntField(term414302, term414302.getClass(), "musicId", -1185174369);
        setIntField(term414302, term414302.getClass(), "level", 1665617605);
        setIntField(term414302, term414302.getClass(), "playCount", -1868411849);
        setIntField(term414302, term414302.getClass(), "techScoreMax", -1614903699);
        setIntField(term414302, term414302.getClass(), "techScoreRank", 73543960);
        setIntField(term414302, term414302.getClass(), "battleScoreMax", -1742924902);
        setIntField(term414302, term414302.getClass(), "battleScoreRank", 683998316);
        setIntField(term414302, term414302.getClass(), "maxComboCount", 1683763927);
        setIntField(term414302, term414302.getClass(), "maxOverKill", -1927963033);
        setIntField(term414302, term414302.getClass(), "maxTeamOverKill", 1656981785);
        setBooleanField(term414302, term414302.getClass(), "isFullBell", false);
        setBooleanField(term414302, term414302.getClass(), "isFullCombo", false);
        setBooleanField(term414302, term414302.getClass(), "isAllBreake", false);
        setBooleanField(term414302, term414302.getClass(), "isLock", true);
        setIntField(term414302, term414302.getClass(), "clearStatus", -802010923);
        setBooleanField(term414302, term414302.getClass(), "isStoryWatched", false);
        term414583 = new Integer(-471511473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term414583;
        callMethod(klass, "setPlayCount", argTypes, term414302, args);
    }

};


