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

public class UserOption_getJudgeAdjustment_4761277917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311685;

    public UserOption_getJudgeAdjustment_4761277917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term311691 = new Long(7893661350133453338L);
        term311685 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term311687 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term311689 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term311705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311720 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term311685, term311685.getClass(), "id", -4996749854388303937L);
        setLongField(term311687, term311687.getClass(), "id", -3565199434620583427L);
        setLongField(term311689, term311689.getClass(), "id", 2930322213281980419L);
        setField(term311689, term311689.getClass(), "extId", term311691);
        setField(term311689, term311689.getClass(), "luid", "nIGJbiiUvW");
        setIntField(term311706, term311706.getClass(), "year", 2013);
        setShortField(term311706, term311706.getClass(), "month", (short) 8);
        setShortField(term311706, term311706.getClass(), "day", (short) 14);
        setField(term311705, term311705.getClass(), "date", term311706);
        setByteField(term311710, term311710.getClass(), "hour", (byte) 5);
        setByteField(term311710, term311710.getClass(), "minute", (byte) 8);
        setByteField(term311710, term311710.getClass(), "second", (byte) 18);
        setIntField(term311710, term311710.getClass(), "nano", 403898061);
        setField(term311705, term311705.getClass(), "time", term311710);
        setField(term311689, term311689.getClass(), "registerTime", term311705);
        setIntField(term311716, term311716.getClass(), "year", 2019);
        setShortField(term311716, term311716.getClass(), "month", (short) 11);
        setShortField(term311716, term311716.getClass(), "day", (short) 7);
        setField(term311715, term311715.getClass(), "date", term311716);
        setByteField(term311720, term311720.getClass(), "hour", (byte) 8);
        setByteField(term311720, term311720.getClass(), "minute", (byte) 45);
        setByteField(term311720, term311720.getClass(), "second", (byte) 49);
        setIntField(term311720, term311720.getClass(), "nano", 848776212);
        setField(term311715, term311715.getClass(), "time", term311720);
        setField(term311689, term311689.getClass(), "accessTime", term311715);
        setField(term311687, term311687.getClass(), "card", term311689);
        setField(term311687, term311687.getClass(), "userName", "JzhWLyxXkj");
        setIntField(term311687, term311687.getClass(), "level", -1423536556);
        setIntField(term311687, term311687.getClass(), "reincarnationNum", 527438457);
        setLongField(term311687, term311687.getClass(), "exp", 1994302498997112267L);
        setLongField(term311687, term311687.getClass(), "point", 7021288626797761212L);
        setLongField(term311687, term311687.getClass(), "totalPoint", 6371009487981684863L);
        setIntField(term311687, term311687.getClass(), "playCount", -199170242);
        setIntField(term311687, term311687.getClass(), "jewelCount", 302423670);
        setIntField(term311687, term311687.getClass(), "totalJewelCount", 635372275);
        setIntField(term311687, term311687.getClass(), "medalCount", 973010888);
        setIntField(term311687, term311687.getClass(), "playerRating", 323462294);
        setIntField(term311687, term311687.getClass(), "highestRating", 1243991455);
        setIntField(term311687, term311687.getClass(), "battlePoint", 1032940790);
        setIntField(term311687, term311687.getClass(), "bestBattlePoint", 991439709);
        setIntField(term311687, term311687.getClass(), "overDamageBattlePoint", -247915844);
        setBooleanField(term311687, term311687.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term311687, term311687.getClass(), "nameplateId", -2030525581);
        setIntField(term311687, term311687.getClass(), "trophyId", -105925373);
        setIntField(term311687, term311687.getClass(), "cardId", 2032534825);
        setIntField(term311687, term311687.getClass(), "characterId", 1065339730);
        setIntField(term311687, term311687.getClass(), "characterVoiceNo", -1771954211);
        setIntField(term311687, term311687.getClass(), "tabSetting", -452935336);
        setIntField(term311687, term311687.getClass(), "tabSortSetting", 1188307022);
        setIntField(term311687, term311687.getClass(), "cardCategorySetting", 2141321691);
        setIntField(term311687, term311687.getClass(), "cardSortSetting", -780023582);
        setIntField(term311687, term311687.getClass(), "rivalScoreCategorySetting", -1793526858);
        setIntField(term311687, term311687.getClass(), "playedTutorialBit", -1753861112);
        setIntField(term311687, term311687.getClass(), "firstTutorialCancelNum", 335076566);
        setLongField(term311687, term311687.getClass(), "sumTechHighScore", 863347992701890777L);
        setLongField(term311687, term311687.getClass(), "sumTechBasicHighScore", -552516954027294654L);
        setLongField(term311687, term311687.getClass(), "sumTechAdvancedHighScore", -3530582766023897335L);
        setLongField(term311687, term311687.getClass(), "sumTechExpertHighScore", 2836514673034443069L);
        setLongField(term311687, term311687.getClass(), "sumTechMasterHighScore", -6886886081226172987L);
        setLongField(term311687, term311687.getClass(), "sumTechLunaticHighScore", -8589759311962216644L);
        setLongField(term311687, term311687.getClass(), "sumBattleHighScore", 5315077486669172115L);
        setLongField(term311687, term311687.getClass(), "sumBattleBasicHighScore", -8836689575384564339L);
        setLongField(term311687, term311687.getClass(), "sumBattleAdvancedHighScore", -7145717701531423865L);
        setLongField(term311687, term311687.getClass(), "sumBattleExpertHighScore", -6925374576596199122L);
        setLongField(term311687, term311687.getClass(), "sumBattleMasterHighScore", 3718316611681722893L);
        setLongField(term311687, term311687.getClass(), "sumBattleLunaticHighScore", 675901840092825894L);
        setField(term311687, term311687.getClass(), "eventWatchedDate", "AAidHZAyKB");
        setField(term311687, term311687.getClass(), "cmEventWatchedDate", "krYrsxROnJ");
        setField(term311687, term311687.getClass(), "firstGameId", "QUrFaZSXXZ");
        setField(term311687, term311687.getClass(), "firstRomVersion", "fzsErxnPmd");
        setField(term311687, term311687.getClass(), "firstDataVersion", "sDIrgCFfkO");
        setField(term311687, term311687.getClass(), "firstPlayDate", "hNDigjtAOH");
        setField(term311687, term311687.getClass(), "lastGameId", "KRnwDMPCbm");
        setField(term311687, term311687.getClass(), "lastRomVersion", "YWxoRQOEME");
        setField(term311687, term311687.getClass(), "lastDataVersion", "rdsQSkVsuL");
        setField(term311687, term311687.getClass(), "compatibleCmVersion", "EfwSeKErKM");
        setField(term311687, term311687.getClass(), "lastPlayDate", "ZgIkmfugqQ");
        setIntField(term311687, term311687.getClass(), "lastPlaceId", 886802474);
        setField(term311687, term311687.getClass(), "lastPlaceName", "NrbDMhIaRg");
        setIntField(term311687, term311687.getClass(), "lastRegionId", 1913131676);
        setField(term311687, term311687.getClass(), "lastRegionName", "ccILjTbPMz");
        setIntField(term311687, term311687.getClass(), "lastAllNetId", 1468602058);
        setField(term311687, term311687.getClass(), "lastClientId", "IuQgeDfBad");
        setIntField(term311687, term311687.getClass(), "lastUsedDeckId", -190755825);
        setIntField(term311687, term311687.getClass(), "lastPlayMusicLevel", 887184575);
        setIntField(term311687, term311687.getClass(), "lastEmoneyBrand", -1017114184);
        setField(term311685, term311685.getClass(), "user", term311687);
        setIntField(term311685, term311685.getClass(), "optionSet", 1939754919);
        setIntField(term311685, term311685.getClass(), "speed", 110657584);
        setIntField(term311685, term311685.getClass(), "mirror", -1648368365);
        setIntField(term311685, term311685.getClass(), "judgeTiming", 1912303002);
        setIntField(term311685, term311685.getClass(), "judgeAdjustment", 841275891);
        setIntField(term311685, term311685.getClass(), "abort", 1227667358);
        setIntField(term311685, term311685.getClass(), "stealthField", -337967801);
        setIntField(term311685, term311685.getClass(), "tapSound", -249491798);
        setIntField(term311685, term311685.getClass(), "volGuide", -2037907670);
        setIntField(term311685, term311685.getClass(), "volAll", -2012031870);
        setIntField(term311685, term311685.getClass(), "volTap", -1653068374);
        setIntField(term311685, term311685.getClass(), "volCrTap", 2031019868);
        setIntField(term311685, term311685.getClass(), "volHold", 2017946383);
        setIntField(term311685, term311685.getClass(), "volSide", -1410381787);
        setIntField(term311685, term311685.getClass(), "volFlick", 1239942527);
        setIntField(term311685, term311685.getClass(), "volBell", -1210859103);
        setIntField(term311685, term311685.getClass(), "volEnemy", 490331672);
        setIntField(term311685, term311685.getClass(), "volSkill", 1630658432);
        setIntField(term311685, term311685.getClass(), "volDamage", 391740930);
        setIntField(term311685, term311685.getClass(), "colorField", -1628180576);
        setIntField(term311685, term311685.getClass(), "colorLaneBright", 492708361);
        setIntField(term311685, term311685.getClass(), "colorWallBright", -1291238125);
        setIntField(term311685, term311685.getClass(), "colorLane", 43815341);
        setIntField(term311685, term311685.getClass(), "colorSide", 870044581);
        setIntField(term311685, term311685.getClass(), "effectDamage", 1186211038);
        setIntField(term311685, term311685.getClass(), "effectPos", -1892922379);
        setIntField(term311685, term311685.getClass(), "judgeDisp", 1673212855);
        setIntField(term311685, term311685.getClass(), "judgePos", -1310821543);
        setIntField(term311685, term311685.getClass(), "judgeBreak", -1965924883);
        setIntField(term311685, term311685.getClass(), "judgeHit", 1820612652);
        setIntField(term311685, term311685.getClass(), "platinumBreakDisp", 62075868);
        setIntField(term311685, term311685.getClass(), "judgeCriticalBreak", -1112700365);
        setIntField(term311685, term311685.getClass(), "matching", 1686757708);
        setIntField(term311685, term311685.getClass(), "dispPlayerLv", -1817872322);
        setIntField(term311685, term311685.getClass(), "dispRating", -888923549);
        setIntField(term311685, term311685.getClass(), "dispBP", 1998311214);
        setIntField(term311685, term311685.getClass(), "headphone", 1278068079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeAdjustment", argTypes, term311685, args);
    }

};


