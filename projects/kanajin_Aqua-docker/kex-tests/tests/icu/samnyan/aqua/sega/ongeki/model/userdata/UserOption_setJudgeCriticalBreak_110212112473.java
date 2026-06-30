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

public class UserOption_setJudgeCriticalBreak_110212112473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342664;
     Object term342966;

    public UserOption_setJudgeCriticalBreak_110212112473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term342670 = new Long(-5157976075409724332L);
        term342664 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term342666 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term342668 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term342684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term342685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term342689 = newInstance(Class.forName("java.time.LocalTime"));
        Object term342694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term342695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term342699 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term342664, term342664.getClass(), "id", -1134947977538687778L);
        setLongField(term342666, term342666.getClass(), "id", -7228686276086859718L);
        setLongField(term342668, term342668.getClass(), "id", 62781030713637544L);
        setField(term342668, term342668.getClass(), "extId", term342670);
        setField(term342668, term342668.getClass(), "luid", "fpGBNFgWeC");
        setIntField(term342685, term342685.getClass(), "year", 2028);
        setShortField(term342685, term342685.getClass(), "month", (short) 5);
        setShortField(term342685, term342685.getClass(), "day", (short) 28);
        setField(term342684, term342684.getClass(), "date", term342685);
        setByteField(term342689, term342689.getClass(), "hour", (byte) 8);
        setByteField(term342689, term342689.getClass(), "minute", (byte) 31);
        setByteField(term342689, term342689.getClass(), "second", (byte) 33);
        setIntField(term342689, term342689.getClass(), "nano", 973352322);
        setField(term342684, term342684.getClass(), "time", term342689);
        setField(term342668, term342668.getClass(), "registerTime", term342684);
        setIntField(term342695, term342695.getClass(), "year", 2029);
        setShortField(term342695, term342695.getClass(), "month", (short) 8);
        setShortField(term342695, term342695.getClass(), "day", (short) 16);
        setField(term342694, term342694.getClass(), "date", term342695);
        setByteField(term342699, term342699.getClass(), "hour", (byte) 23);
        setByteField(term342699, term342699.getClass(), "minute", (byte) 7);
        setByteField(term342699, term342699.getClass(), "second", (byte) 48);
        setIntField(term342699, term342699.getClass(), "nano", 408928727);
        setField(term342694, term342694.getClass(), "time", term342699);
        setField(term342668, term342668.getClass(), "accessTime", term342694);
        setField(term342666, term342666.getClass(), "card", term342668);
        setField(term342666, term342666.getClass(), "userName", "DUuyXeZcGI");
        setIntField(term342666, term342666.getClass(), "level", 2039405655);
        setIntField(term342666, term342666.getClass(), "reincarnationNum", 1317732348);
        setLongField(term342666, term342666.getClass(), "exp", -3376602403097495625L);
        setLongField(term342666, term342666.getClass(), "point", 6065950305449097010L);
        setLongField(term342666, term342666.getClass(), "totalPoint", -6043152883940850831L);
        setIntField(term342666, term342666.getClass(), "playCount", 1420550181);
        setIntField(term342666, term342666.getClass(), "jewelCount", -113041811);
        setIntField(term342666, term342666.getClass(), "totalJewelCount", -536431958);
        setIntField(term342666, term342666.getClass(), "medalCount", 1366678149);
        setIntField(term342666, term342666.getClass(), "playerRating", -457690632);
        setIntField(term342666, term342666.getClass(), "highestRating", 139829756);
        setIntField(term342666, term342666.getClass(), "battlePoint", -1627300942);
        setIntField(term342666, term342666.getClass(), "bestBattlePoint", -1503910695);
        setIntField(term342666, term342666.getClass(), "overDamageBattlePoint", 1261386199);
        setBooleanField(term342666, term342666.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term342666, term342666.getClass(), "nameplateId", -607535011);
        setIntField(term342666, term342666.getClass(), "trophyId", 1182997243);
        setIntField(term342666, term342666.getClass(), "cardId", -909000196);
        setIntField(term342666, term342666.getClass(), "characterId", 1521461477);
        setIntField(term342666, term342666.getClass(), "characterVoiceNo", -1082438481);
        setIntField(term342666, term342666.getClass(), "tabSetting", 1576369126);
        setIntField(term342666, term342666.getClass(), "tabSortSetting", 894498151);
        setIntField(term342666, term342666.getClass(), "cardCategorySetting", -882317717);
        setIntField(term342666, term342666.getClass(), "cardSortSetting", 962600812);
        setIntField(term342666, term342666.getClass(), "rivalScoreCategorySetting", -1154337895);
        setIntField(term342666, term342666.getClass(), "playedTutorialBit", 449695720);
        setIntField(term342666, term342666.getClass(), "firstTutorialCancelNum", -1494924053);
        setLongField(term342666, term342666.getClass(), "sumTechHighScore", 2331156122409401832L);
        setLongField(term342666, term342666.getClass(), "sumTechBasicHighScore", -3225264208352212207L);
        setLongField(term342666, term342666.getClass(), "sumTechAdvancedHighScore", 3152519014187638566L);
        setLongField(term342666, term342666.getClass(), "sumTechExpertHighScore", 7586377378114312007L);
        setLongField(term342666, term342666.getClass(), "sumTechMasterHighScore", 134425233726134011L);
        setLongField(term342666, term342666.getClass(), "sumTechLunaticHighScore", -5115432223675193294L);
        setLongField(term342666, term342666.getClass(), "sumBattleHighScore", 4730567896709311535L);
        setLongField(term342666, term342666.getClass(), "sumBattleBasicHighScore", 1833853944515401220L);
        setLongField(term342666, term342666.getClass(), "sumBattleAdvancedHighScore", 2381678549237758855L);
        setLongField(term342666, term342666.getClass(), "sumBattleExpertHighScore", 8453036083130718181L);
        setLongField(term342666, term342666.getClass(), "sumBattleMasterHighScore", -272667206933810362L);
        setLongField(term342666, term342666.getClass(), "sumBattleLunaticHighScore", -5601364651538590440L);
        setField(term342666, term342666.getClass(), "eventWatchedDate", "hrLxXpabnc");
        setField(term342666, term342666.getClass(), "cmEventWatchedDate", "fArMXZDwVr");
        setField(term342666, term342666.getClass(), "firstGameId", "zniBanMVgE");
        setField(term342666, term342666.getClass(), "firstRomVersion", "qmbrRrCbij");
        setField(term342666, term342666.getClass(), "firstDataVersion", "ZPFdqWuEGy");
        setField(term342666, term342666.getClass(), "firstPlayDate", "CzojwasoDI");
        setField(term342666, term342666.getClass(), "lastGameId", "zNlajtjapf");
        setField(term342666, term342666.getClass(), "lastRomVersion", "ktovijmbfl");
        setField(term342666, term342666.getClass(), "lastDataVersion", "pIBdwAuavp");
        setField(term342666, term342666.getClass(), "compatibleCmVersion", "obGntpSVjl");
        setField(term342666, term342666.getClass(), "lastPlayDate", "WxnoufTTUT");
        setIntField(term342666, term342666.getClass(), "lastPlaceId", -524245009);
        setField(term342666, term342666.getClass(), "lastPlaceName", "yMBiAGDoMF");
        setIntField(term342666, term342666.getClass(), "lastRegionId", -1778012618);
        setField(term342666, term342666.getClass(), "lastRegionName", "dkbFZbFdEZ");
        setIntField(term342666, term342666.getClass(), "lastAllNetId", 1108936390);
        setField(term342666, term342666.getClass(), "lastClientId", "uRhJjJvVcp");
        setIntField(term342666, term342666.getClass(), "lastUsedDeckId", -442895243);
        setIntField(term342666, term342666.getClass(), "lastPlayMusicLevel", 94999093);
        setIntField(term342666, term342666.getClass(), "lastEmoneyBrand", -1221543090);
        setField(term342664, term342664.getClass(), "user", term342666);
        setIntField(term342664, term342664.getClass(), "optionSet", 544643367);
        setIntField(term342664, term342664.getClass(), "speed", 47400504);
        setIntField(term342664, term342664.getClass(), "mirror", -1783921433);
        setIntField(term342664, term342664.getClass(), "judgeTiming", -965472872);
        setIntField(term342664, term342664.getClass(), "judgeAdjustment", 976152502);
        setIntField(term342664, term342664.getClass(), "abort", -437709477);
        setIntField(term342664, term342664.getClass(), "stealthField", -120964201);
        setIntField(term342664, term342664.getClass(), "tapSound", 1554481629);
        setIntField(term342664, term342664.getClass(), "volGuide", -1054399872);
        setIntField(term342664, term342664.getClass(), "volAll", 1645242637);
        setIntField(term342664, term342664.getClass(), "volTap", -1748205238);
        setIntField(term342664, term342664.getClass(), "volCrTap", 2022334774);
        setIntField(term342664, term342664.getClass(), "volHold", -1929891554);
        setIntField(term342664, term342664.getClass(), "volSide", -1512266789);
        setIntField(term342664, term342664.getClass(), "volFlick", -533541066);
        setIntField(term342664, term342664.getClass(), "volBell", 370741881);
        setIntField(term342664, term342664.getClass(), "volEnemy", -1228310247);
        setIntField(term342664, term342664.getClass(), "volSkill", -1043082176);
        setIntField(term342664, term342664.getClass(), "volDamage", 1915917260);
        setIntField(term342664, term342664.getClass(), "colorField", 1946676976);
        setIntField(term342664, term342664.getClass(), "colorLaneBright", -1213782391);
        setIntField(term342664, term342664.getClass(), "colorWallBright", 1201601154);
        setIntField(term342664, term342664.getClass(), "colorLane", 2121295352);
        setIntField(term342664, term342664.getClass(), "colorSide", -2134233524);
        setIntField(term342664, term342664.getClass(), "effectDamage", 694278911);
        setIntField(term342664, term342664.getClass(), "effectPos", 1385715643);
        setIntField(term342664, term342664.getClass(), "judgeDisp", -2079086426);
        setIntField(term342664, term342664.getClass(), "judgePos", -1551426087);
        setIntField(term342664, term342664.getClass(), "judgeBreak", -1568676188);
        setIntField(term342664, term342664.getClass(), "judgeHit", -871949771);
        setIntField(term342664, term342664.getClass(), "platinumBreakDisp", -1334680952);
        setIntField(term342664, term342664.getClass(), "judgeCriticalBreak", -1127278862);
        setIntField(term342664, term342664.getClass(), "matching", 1671851938);
        setIntField(term342664, term342664.getClass(), "dispPlayerLv", -1032258821);
        setIntField(term342664, term342664.getClass(), "dispRating", 809258518);
        setIntField(term342664, term342664.getClass(), "dispBP", -1576736586);
        setIntField(term342664, term342664.getClass(), "headphone", 576924610);
        term342966 = new Integer(1503633580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term342966;
        callMethod(klass, "setJudgeCriticalBreak", argTypes, term342664, args);
    }

};


