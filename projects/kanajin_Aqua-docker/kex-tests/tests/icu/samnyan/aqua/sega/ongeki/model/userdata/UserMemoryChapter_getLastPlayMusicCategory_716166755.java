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

public class UserMemoryChapter_getLastPlayMusicCategory_716166755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391078;

    public UserMemoryChapter_getLastPlayMusicCategory_716166755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term391084 = new Long(-8854988339892073229L);
        term391078 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term391080 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term391082 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term391098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term391108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term391109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391113 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term391078, term391078.getClass(), "id", 2627936013395114275L);
        setLongField(term391080, term391080.getClass(), "id", -7299236273441286295L);
        setLongField(term391082, term391082.getClass(), "id", -4436219573642982325L);
        setField(term391082, term391082.getClass(), "extId", term391084);
        setField(term391082, term391082.getClass(), "luid", "aSLdPqjjML");
        setIntField(term391099, term391099.getClass(), "year", 2015);
        setShortField(term391099, term391099.getClass(), "month", (short) 8);
        setShortField(term391099, term391099.getClass(), "day", (short) 27);
        setField(term391098, term391098.getClass(), "date", term391099);
        setByteField(term391103, term391103.getClass(), "hour", (byte) 7);
        setByteField(term391103, term391103.getClass(), "minute", (byte) 42);
        setByteField(term391103, term391103.getClass(), "second", (byte) 59);
        setIntField(term391103, term391103.getClass(), "nano", 534792982);
        setField(term391098, term391098.getClass(), "time", term391103);
        setField(term391082, term391082.getClass(), "registerTime", term391098);
        setIntField(term391109, term391109.getClass(), "year", 2017);
        setShortField(term391109, term391109.getClass(), "month", (short) 6);
        setShortField(term391109, term391109.getClass(), "day", (short) 20);
        setField(term391108, term391108.getClass(), "date", term391109);
        setByteField(term391113, term391113.getClass(), "hour", (byte) 6);
        setByteField(term391113, term391113.getClass(), "minute", (byte) 20);
        setByteField(term391113, term391113.getClass(), "second", (byte) 39);
        setIntField(term391113, term391113.getClass(), "nano", 301313068);
        setField(term391108, term391108.getClass(), "time", term391113);
        setField(term391082, term391082.getClass(), "accessTime", term391108);
        setField(term391080, term391080.getClass(), "card", term391082);
        setField(term391080, term391080.getClass(), "userName", "DqtPTZpLGN");
        setIntField(term391080, term391080.getClass(), "level", 86180482);
        setIntField(term391080, term391080.getClass(), "reincarnationNum", -2136673066);
        setLongField(term391080, term391080.getClass(), "exp", 6378572342484772532L);
        setLongField(term391080, term391080.getClass(), "point", -8244560538480267683L);
        setLongField(term391080, term391080.getClass(), "totalPoint", 138599279036226378L);
        setIntField(term391080, term391080.getClass(), "playCount", -1057833859);
        setIntField(term391080, term391080.getClass(), "jewelCount", -905081846);
        setIntField(term391080, term391080.getClass(), "totalJewelCount", -969514244);
        setIntField(term391080, term391080.getClass(), "medalCount", 978218132);
        setIntField(term391080, term391080.getClass(), "playerRating", -2082062044);
        setIntField(term391080, term391080.getClass(), "highestRating", -279502359);
        setIntField(term391080, term391080.getClass(), "battlePoint", -1847222423);
        setIntField(term391080, term391080.getClass(), "bestBattlePoint", 617388348);
        setIntField(term391080, term391080.getClass(), "overDamageBattlePoint", 327163231);
        setBooleanField(term391080, term391080.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term391080, term391080.getClass(), "nameplateId", -204615883);
        setIntField(term391080, term391080.getClass(), "trophyId", -420355432);
        setIntField(term391080, term391080.getClass(), "cardId", 668213883);
        setIntField(term391080, term391080.getClass(), "characterId", 1378376759);
        setIntField(term391080, term391080.getClass(), "characterVoiceNo", 1681560473);
        setIntField(term391080, term391080.getClass(), "tabSetting", 2006161687);
        setIntField(term391080, term391080.getClass(), "tabSortSetting", 1247937036);
        setIntField(term391080, term391080.getClass(), "cardCategorySetting", -1923437387);
        setIntField(term391080, term391080.getClass(), "cardSortSetting", -201543810);
        setIntField(term391080, term391080.getClass(), "rivalScoreCategorySetting", -372154047);
        setIntField(term391080, term391080.getClass(), "playedTutorialBit", 1863535983);
        setIntField(term391080, term391080.getClass(), "firstTutorialCancelNum", -1741751420);
        setLongField(term391080, term391080.getClass(), "sumTechHighScore", 6263492991884156493L);
        setLongField(term391080, term391080.getClass(), "sumTechBasicHighScore", -5332451274305092019L);
        setLongField(term391080, term391080.getClass(), "sumTechAdvancedHighScore", -9204842257916119907L);
        setLongField(term391080, term391080.getClass(), "sumTechExpertHighScore", 6375094005803844278L);
        setLongField(term391080, term391080.getClass(), "sumTechMasterHighScore", 5465128087796450816L);
        setLongField(term391080, term391080.getClass(), "sumTechLunaticHighScore", -1407875883056016741L);
        setLongField(term391080, term391080.getClass(), "sumBattleHighScore", 8718220311942745153L);
        setLongField(term391080, term391080.getClass(), "sumBattleBasicHighScore", -9002339416922780492L);
        setLongField(term391080, term391080.getClass(), "sumBattleAdvancedHighScore", -6776275349293942429L);
        setLongField(term391080, term391080.getClass(), "sumBattleExpertHighScore", -1947321649183924709L);
        setLongField(term391080, term391080.getClass(), "sumBattleMasterHighScore", 3831143152556333320L);
        setLongField(term391080, term391080.getClass(), "sumBattleLunaticHighScore", 6804695143803839571L);
        setField(term391080, term391080.getClass(), "eventWatchedDate", "AOWHmtcVPA");
        setField(term391080, term391080.getClass(), "cmEventWatchedDate", "GVEqTAWbPY");
        setField(term391080, term391080.getClass(), "firstGameId", "vMkleJFnoW");
        setField(term391080, term391080.getClass(), "firstRomVersion", "iBFXhDANsx");
        setField(term391080, term391080.getClass(), "firstDataVersion", "ZSfDVythXU");
        setField(term391080, term391080.getClass(), "firstPlayDate", "fMlEZkRPye");
        setField(term391080, term391080.getClass(), "lastGameId", "LSXpihHEQv");
        setField(term391080, term391080.getClass(), "lastRomVersion", "ubquofnAJx");
        setField(term391080, term391080.getClass(), "lastDataVersion", "sJYrCpZyRO");
        setField(term391080, term391080.getClass(), "compatibleCmVersion", "wELbARRJAC");
        setField(term391080, term391080.getClass(), "lastPlayDate", "AvZujFpYwp");
        setIntField(term391080, term391080.getClass(), "lastPlaceId", 1584162532);
        setField(term391080, term391080.getClass(), "lastPlaceName", "oTOpiJPlxr");
        setIntField(term391080, term391080.getClass(), "lastRegionId", -49842309);
        setField(term391080, term391080.getClass(), "lastRegionName", "UGBZCWRmyK");
        setIntField(term391080, term391080.getClass(), "lastAllNetId", -1060935976);
        setField(term391080, term391080.getClass(), "lastClientId", "AceZiKDiGI");
        setIntField(term391080, term391080.getClass(), "lastUsedDeckId", -476085547);
        setIntField(term391080, term391080.getClass(), "lastPlayMusicLevel", 220634485);
        setIntField(term391080, term391080.getClass(), "lastEmoneyBrand", -2134695238);
        setField(term391078, term391078.getClass(), "user", term391080);
        setIntField(term391078, term391078.getClass(), "chapterId", 1931987306);
        setIntField(term391078, term391078.getClass(), "jewelCount", -767200126);
        setIntField(term391078, term391078.getClass(), "lastPlayMusicCategory", 1366138839);
        setIntField(term391078, term391078.getClass(), "lastPlayMusicId", 692708679);
        setIntField(term391078, term391078.getClass(), "lastPlayMusicLevel", -1562385244);
        setBooleanField(term391078, term391078.getClass(), "isDialogWatched", true);
        setBooleanField(term391078, term391078.getClass(), "isStoryWatched", false);
        setBooleanField(term391078, term391078.getClass(), "isBossWatched", false);
        setBooleanField(term391078, term391078.getClass(), "isClear", true);
        setIntField(term391078, term391078.getClass(), "gaugeId", 1161011830);
        setIntField(term391078, term391078.getClass(), "gaugeNum", -994267583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicCategory", argTypes, term391078, args);
    }

};


