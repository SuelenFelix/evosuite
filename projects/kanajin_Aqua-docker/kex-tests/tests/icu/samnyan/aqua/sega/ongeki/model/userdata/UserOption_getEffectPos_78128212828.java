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

public class UserOption_getEffectPos_78128212828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321387;

    public UserOption_getEffectPos_78128212828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term321393 = new Long(3968143267572761057L);
        term321387 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term321389 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term321391 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term321407 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321408 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321412 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321422 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term321387, term321387.getClass(), "id", 6546694826667546998L);
        setLongField(term321389, term321389.getClass(), "id", -2688323547172991959L);
        setLongField(term321391, term321391.getClass(), "id", -2314739572280308677L);
        setField(term321391, term321391.getClass(), "extId", term321393);
        setField(term321391, term321391.getClass(), "luid", "QnPYTqBVID");
        setIntField(term321408, term321408.getClass(), "year", 2015);
        setShortField(term321408, term321408.getClass(), "month", (short) 7);
        setShortField(term321408, term321408.getClass(), "day", (short) 18);
        setField(term321407, term321407.getClass(), "date", term321408);
        setByteField(term321412, term321412.getClass(), "hour", (byte) 21);
        setByteField(term321412, term321412.getClass(), "minute", (byte) 41);
        setByteField(term321412, term321412.getClass(), "second", (byte) 42);
        setIntField(term321412, term321412.getClass(), "nano", 990975020);
        setField(term321407, term321407.getClass(), "time", term321412);
        setField(term321391, term321391.getClass(), "registerTime", term321407);
        setIntField(term321418, term321418.getClass(), "year", 2024);
        setShortField(term321418, term321418.getClass(), "month", (short) 12);
        setShortField(term321418, term321418.getClass(), "day", (short) 23);
        setField(term321417, term321417.getClass(), "date", term321418);
        setByteField(term321422, term321422.getClass(), "hour", (byte) 22);
        setByteField(term321422, term321422.getClass(), "minute", (byte) 22);
        setByteField(term321422, term321422.getClass(), "second", (byte) 27);
        setIntField(term321422, term321422.getClass(), "nano", 291676322);
        setField(term321417, term321417.getClass(), "time", term321422);
        setField(term321391, term321391.getClass(), "accessTime", term321417);
        setField(term321389, term321389.getClass(), "card", term321391);
        setField(term321389, term321389.getClass(), "userName", "FtGyBwfCLB");
        setIntField(term321389, term321389.getClass(), "level", -378502409);
        setIntField(term321389, term321389.getClass(), "reincarnationNum", 1237665417);
        setLongField(term321389, term321389.getClass(), "exp", -7698825294103217585L);
        setLongField(term321389, term321389.getClass(), "point", -373752928266109795L);
        setLongField(term321389, term321389.getClass(), "totalPoint", -533276926115387427L);
        setIntField(term321389, term321389.getClass(), "playCount", -2007749012);
        setIntField(term321389, term321389.getClass(), "jewelCount", -1831523442);
        setIntField(term321389, term321389.getClass(), "totalJewelCount", -1744615813);
        setIntField(term321389, term321389.getClass(), "medalCount", 697490560);
        setIntField(term321389, term321389.getClass(), "playerRating", -1943433012);
        setIntField(term321389, term321389.getClass(), "highestRating", 1824753250);
        setIntField(term321389, term321389.getClass(), "battlePoint", -1364300929);
        setIntField(term321389, term321389.getClass(), "bestBattlePoint", -1297765151);
        setIntField(term321389, term321389.getClass(), "overDamageBattlePoint", -493427629);
        setBooleanField(term321389, term321389.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term321389, term321389.getClass(), "nameplateId", 683709231);
        setIntField(term321389, term321389.getClass(), "trophyId", 1295305054);
        setIntField(term321389, term321389.getClass(), "cardId", 1051366361);
        setIntField(term321389, term321389.getClass(), "characterId", 797415056);
        setIntField(term321389, term321389.getClass(), "characterVoiceNo", -1395794593);
        setIntField(term321389, term321389.getClass(), "tabSetting", 177293474);
        setIntField(term321389, term321389.getClass(), "tabSortSetting", -1663867560);
        setIntField(term321389, term321389.getClass(), "cardCategorySetting", 1871308062);
        setIntField(term321389, term321389.getClass(), "cardSortSetting", 716978780);
        setIntField(term321389, term321389.getClass(), "rivalScoreCategorySetting", -211894122);
        setIntField(term321389, term321389.getClass(), "playedTutorialBit", 1368603928);
        setIntField(term321389, term321389.getClass(), "firstTutorialCancelNum", -2037348518);
        setLongField(term321389, term321389.getClass(), "sumTechHighScore", 5521964504435282564L);
        setLongField(term321389, term321389.getClass(), "sumTechBasicHighScore", -1899326526926389111L);
        setLongField(term321389, term321389.getClass(), "sumTechAdvancedHighScore", 2835817348179895823L);
        setLongField(term321389, term321389.getClass(), "sumTechExpertHighScore", 1742175936873228703L);
        setLongField(term321389, term321389.getClass(), "sumTechMasterHighScore", 1385575488416015068L);
        setLongField(term321389, term321389.getClass(), "sumTechLunaticHighScore", -3478828746185924387L);
        setLongField(term321389, term321389.getClass(), "sumBattleHighScore", 7615082460382075782L);
        setLongField(term321389, term321389.getClass(), "sumBattleBasicHighScore", -8075020626643163747L);
        setLongField(term321389, term321389.getClass(), "sumBattleAdvancedHighScore", -2898218831873683089L);
        setLongField(term321389, term321389.getClass(), "sumBattleExpertHighScore", -425504848958681031L);
        setLongField(term321389, term321389.getClass(), "sumBattleMasterHighScore", 2745090845686019262L);
        setLongField(term321389, term321389.getClass(), "sumBattleLunaticHighScore", -8764742700265636950L);
        setField(term321389, term321389.getClass(), "eventWatchedDate", "EfFOUMpHqf");
        setField(term321389, term321389.getClass(), "cmEventWatchedDate", "WhoRiDStGG");
        setField(term321389, term321389.getClass(), "firstGameId", "oFRTKwDqON");
        setField(term321389, term321389.getClass(), "firstRomVersion", "xHzLXMMmWx");
        setField(term321389, term321389.getClass(), "firstDataVersion", "AQBUCJbdWn");
        setField(term321389, term321389.getClass(), "firstPlayDate", "vCDOYJbTYr");
        setField(term321389, term321389.getClass(), "lastGameId", "oJfKlhUqev");
        setField(term321389, term321389.getClass(), "lastRomVersion", "gcNegkXNXZ");
        setField(term321389, term321389.getClass(), "lastDataVersion", "ilJVJbKHpq");
        setField(term321389, term321389.getClass(), "compatibleCmVersion", "CobqdtZAgW");
        setField(term321389, term321389.getClass(), "lastPlayDate", "dOQFOLnfdk");
        setIntField(term321389, term321389.getClass(), "lastPlaceId", 1896399663);
        setField(term321389, term321389.getClass(), "lastPlaceName", "VkHSPWaJkj");
        setIntField(term321389, term321389.getClass(), "lastRegionId", -613967334);
        setField(term321389, term321389.getClass(), "lastRegionName", "xWmJSkwYQZ");
        setIntField(term321389, term321389.getClass(), "lastAllNetId", 1350650589);
        setField(term321389, term321389.getClass(), "lastClientId", "jjKfBPODKz");
        setIntField(term321389, term321389.getClass(), "lastUsedDeckId", 1874378587);
        setIntField(term321389, term321389.getClass(), "lastPlayMusicLevel", 1851606122);
        setIntField(term321389, term321389.getClass(), "lastEmoneyBrand", -1643361354);
        setField(term321387, term321387.getClass(), "user", term321389);
        setIntField(term321387, term321387.getClass(), "optionSet", 904240893);
        setIntField(term321387, term321387.getClass(), "speed", 1068238371);
        setIntField(term321387, term321387.getClass(), "mirror", -842184632);
        setIntField(term321387, term321387.getClass(), "judgeTiming", 210567920);
        setIntField(term321387, term321387.getClass(), "judgeAdjustment", -609764574);
        setIntField(term321387, term321387.getClass(), "abort", 1358153489);
        setIntField(term321387, term321387.getClass(), "stealthField", 2010586898);
        setIntField(term321387, term321387.getClass(), "tapSound", 1026821857);
        setIntField(term321387, term321387.getClass(), "volGuide", -1030821042);
        setIntField(term321387, term321387.getClass(), "volAll", 1812520602);
        setIntField(term321387, term321387.getClass(), "volTap", 1925351875);
        setIntField(term321387, term321387.getClass(), "volCrTap", -1474043899);
        setIntField(term321387, term321387.getClass(), "volHold", 423668511);
        setIntField(term321387, term321387.getClass(), "volSide", -1555050440);
        setIntField(term321387, term321387.getClass(), "volFlick", 2053958383);
        setIntField(term321387, term321387.getClass(), "volBell", 124039507);
        setIntField(term321387, term321387.getClass(), "volEnemy", -1637246125);
        setIntField(term321387, term321387.getClass(), "volSkill", 953018273);
        setIntField(term321387, term321387.getClass(), "volDamage", 1043145184);
        setIntField(term321387, term321387.getClass(), "colorField", -1527042419);
        setIntField(term321387, term321387.getClass(), "colorLaneBright", 1732365199);
        setIntField(term321387, term321387.getClass(), "colorWallBright", -143476420);
        setIntField(term321387, term321387.getClass(), "colorLane", 1903653889);
        setIntField(term321387, term321387.getClass(), "colorSide", -1802327080);
        setIntField(term321387, term321387.getClass(), "effectDamage", -278569893);
        setIntField(term321387, term321387.getClass(), "effectPos", 1737799120);
        setIntField(term321387, term321387.getClass(), "judgeDisp", 1401694335);
        setIntField(term321387, term321387.getClass(), "judgePos", 198886031);
        setIntField(term321387, term321387.getClass(), "judgeBreak", 1057406321);
        setIntField(term321387, term321387.getClass(), "judgeHit", -1795766914);
        setIntField(term321387, term321387.getClass(), "platinumBreakDisp", 2046933548);
        setIntField(term321387, term321387.getClass(), "judgeCriticalBreak", 2120312659);
        setIntField(term321387, term321387.getClass(), "matching", 1762659383);
        setIntField(term321387, term321387.getClass(), "dispPlayerLv", 1469586929);
        setIntField(term321387, term321387.getClass(), "dispRating", 463848359);
        setIntField(term321387, term321387.getClass(), "dispBP", 2091896166);
        setIntField(term321387, term321387.getClass(), "headphone", -400730488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectPos", argTypes, term321387, args);
    }

};


