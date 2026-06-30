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

public class UserOption_getUser_11107736112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309375;

    public UserOption_getUser_11107736112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term309381 = new Long(4777103307547199454L);
        term309375 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term309377 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term309379 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term309395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309400 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309410 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term309375, term309375.getClass(), "id", -2420503340956322947L);
        setLongField(term309377, term309377.getClass(), "id", -7146587295034279724L);
        setLongField(term309379, term309379.getClass(), "id", -631644622935724775L);
        setField(term309379, term309379.getClass(), "extId", term309381);
        setField(term309379, term309379.getClass(), "luid", "aCCYVNLwaa");
        setIntField(term309396, term309396.getClass(), "year", 2029);
        setShortField(term309396, term309396.getClass(), "month", (short) 6);
        setShortField(term309396, term309396.getClass(), "day", (short) 3);
        setField(term309395, term309395.getClass(), "date", term309396);
        setByteField(term309400, term309400.getClass(), "hour", (byte) 19);
        setByteField(term309400, term309400.getClass(), "minute", (byte) 12);
        setByteField(term309400, term309400.getClass(), "second", (byte) 52);
        setIntField(term309400, term309400.getClass(), "nano", 269583025);
        setField(term309395, term309395.getClass(), "time", term309400);
        setField(term309379, term309379.getClass(), "registerTime", term309395);
        setIntField(term309406, term309406.getClass(), "year", 2023);
        setShortField(term309406, term309406.getClass(), "month", (short) 9);
        setShortField(term309406, term309406.getClass(), "day", (short) 17);
        setField(term309405, term309405.getClass(), "date", term309406);
        setByteField(term309410, term309410.getClass(), "hour", (byte) 17);
        setByteField(term309410, term309410.getClass(), "minute", (byte) 10);
        setByteField(term309410, term309410.getClass(), "second", (byte) 24);
        setIntField(term309410, term309410.getClass(), "nano", 256215116);
        setField(term309405, term309405.getClass(), "time", term309410);
        setField(term309379, term309379.getClass(), "accessTime", term309405);
        setField(term309377, term309377.getClass(), "card", term309379);
        setField(term309377, term309377.getClass(), "userName", "dZtrEEgcVE");
        setIntField(term309377, term309377.getClass(), "level", -1825611823);
        setIntField(term309377, term309377.getClass(), "reincarnationNum", 314501541);
        setLongField(term309377, term309377.getClass(), "exp", -8371285259862513839L);
        setLongField(term309377, term309377.getClass(), "point", 2692290600675670442L);
        setLongField(term309377, term309377.getClass(), "totalPoint", 3053524610558741629L);
        setIntField(term309377, term309377.getClass(), "playCount", -376118184);
        setIntField(term309377, term309377.getClass(), "jewelCount", 521813133);
        setIntField(term309377, term309377.getClass(), "totalJewelCount", -1753819615);
        setIntField(term309377, term309377.getClass(), "medalCount", -2085081794);
        setIntField(term309377, term309377.getClass(), "playerRating", -673809311);
        setIntField(term309377, term309377.getClass(), "highestRating", 1551363819);
        setIntField(term309377, term309377.getClass(), "battlePoint", 1101906841);
        setIntField(term309377, term309377.getClass(), "bestBattlePoint", 924801484);
        setIntField(term309377, term309377.getClass(), "overDamageBattlePoint", -972621333);
        setBooleanField(term309377, term309377.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term309377, term309377.getClass(), "nameplateId", -1905669851);
        setIntField(term309377, term309377.getClass(), "trophyId", 1625299037);
        setIntField(term309377, term309377.getClass(), "cardId", -1515630842);
        setIntField(term309377, term309377.getClass(), "characterId", -705904144);
        setIntField(term309377, term309377.getClass(), "characterVoiceNo", -249148704);
        setIntField(term309377, term309377.getClass(), "tabSetting", -1398111623);
        setIntField(term309377, term309377.getClass(), "tabSortSetting", -254650250);
        setIntField(term309377, term309377.getClass(), "cardCategorySetting", 1821325974);
        setIntField(term309377, term309377.getClass(), "cardSortSetting", -1610789205);
        setIntField(term309377, term309377.getClass(), "rivalScoreCategorySetting", -711533767);
        setIntField(term309377, term309377.getClass(), "playedTutorialBit", -2048773574);
        setIntField(term309377, term309377.getClass(), "firstTutorialCancelNum", -1813714272);
        setLongField(term309377, term309377.getClass(), "sumTechHighScore", -3637201820430805238L);
        setLongField(term309377, term309377.getClass(), "sumTechBasicHighScore", 5471219841765901083L);
        setLongField(term309377, term309377.getClass(), "sumTechAdvancedHighScore", 3306783178564202723L);
        setLongField(term309377, term309377.getClass(), "sumTechExpertHighScore", 7139946144213783259L);
        setLongField(term309377, term309377.getClass(), "sumTechMasterHighScore", -1819180856396249743L);
        setLongField(term309377, term309377.getClass(), "sumTechLunaticHighScore", 5605011259612310714L);
        setLongField(term309377, term309377.getClass(), "sumBattleHighScore", -2431305475937676660L);
        setLongField(term309377, term309377.getClass(), "sumBattleBasicHighScore", -5598137355910198871L);
        setLongField(term309377, term309377.getClass(), "sumBattleAdvancedHighScore", 3810235347968560869L);
        setLongField(term309377, term309377.getClass(), "sumBattleExpertHighScore", 8277498751602691948L);
        setLongField(term309377, term309377.getClass(), "sumBattleMasterHighScore", -5523100135852985457L);
        setLongField(term309377, term309377.getClass(), "sumBattleLunaticHighScore", 3408200275444228037L);
        setField(term309377, term309377.getClass(), "eventWatchedDate", "qryyzrqVdu");
        setField(term309377, term309377.getClass(), "cmEventWatchedDate", "VmGukvnUdX");
        setField(term309377, term309377.getClass(), "firstGameId", "XfKldJGWHB");
        setField(term309377, term309377.getClass(), "firstRomVersion", "SqsYjPVugJ");
        setField(term309377, term309377.getClass(), "firstDataVersion", "nFYNkdURVQ");
        setField(term309377, term309377.getClass(), "firstPlayDate", "VaMZGFnePs");
        setField(term309377, term309377.getClass(), "lastGameId", "lfngIPCkRz");
        setField(term309377, term309377.getClass(), "lastRomVersion", "ExFqbygbTc");
        setField(term309377, term309377.getClass(), "lastDataVersion", "wzNXDSGHuN");
        setField(term309377, term309377.getClass(), "compatibleCmVersion", "ChYSlyHfwK");
        setField(term309377, term309377.getClass(), "lastPlayDate", "WONvayWNCs");
        setIntField(term309377, term309377.getClass(), "lastPlaceId", 867018340);
        setField(term309377, term309377.getClass(), "lastPlaceName", "FyzhCvaPBp");
        setIntField(term309377, term309377.getClass(), "lastRegionId", -1102998089);
        setField(term309377, term309377.getClass(), "lastRegionName", "XAyaTiPVgp");
        setIntField(term309377, term309377.getClass(), "lastAllNetId", 1554322953);
        setField(term309377, term309377.getClass(), "lastClientId", "thjLrSQRdq");
        setIntField(term309377, term309377.getClass(), "lastUsedDeckId", 1761582120);
        setIntField(term309377, term309377.getClass(), "lastPlayMusicLevel", 1749916121);
        setIntField(term309377, term309377.getClass(), "lastEmoneyBrand", -129039692);
        setField(term309375, term309375.getClass(), "user", term309377);
        setIntField(term309375, term309375.getClass(), "optionSet", -432401292);
        setIntField(term309375, term309375.getClass(), "speed", 1892382347);
        setIntField(term309375, term309375.getClass(), "mirror", 1760177073);
        setIntField(term309375, term309375.getClass(), "judgeTiming", 1230011819);
        setIntField(term309375, term309375.getClass(), "judgeAdjustment", 1872182894);
        setIntField(term309375, term309375.getClass(), "abort", 89211811);
        setIntField(term309375, term309375.getClass(), "stealthField", -1025816435);
        setIntField(term309375, term309375.getClass(), "tapSound", -1792616669);
        setIntField(term309375, term309375.getClass(), "volGuide", 912810766);
        setIntField(term309375, term309375.getClass(), "volAll", 1069241403);
        setIntField(term309375, term309375.getClass(), "volTap", -1576450967);
        setIntField(term309375, term309375.getClass(), "volCrTap", 1181782085);
        setIntField(term309375, term309375.getClass(), "volHold", 771057042);
        setIntField(term309375, term309375.getClass(), "volSide", -2090879041);
        setIntField(term309375, term309375.getClass(), "volFlick", -1539159480);
        setIntField(term309375, term309375.getClass(), "volBell", 795327405);
        setIntField(term309375, term309375.getClass(), "volEnemy", 822701990);
        setIntField(term309375, term309375.getClass(), "volSkill", -1022772429);
        setIntField(term309375, term309375.getClass(), "volDamage", 42246672);
        setIntField(term309375, term309375.getClass(), "colorField", -8611964);
        setIntField(term309375, term309375.getClass(), "colorLaneBright", 1571062758);
        setIntField(term309375, term309375.getClass(), "colorWallBright", -1628970138);
        setIntField(term309375, term309375.getClass(), "colorLane", -569577294);
        setIntField(term309375, term309375.getClass(), "colorSide", 959919310);
        setIntField(term309375, term309375.getClass(), "effectDamage", -1680526175);
        setIntField(term309375, term309375.getClass(), "effectPos", -568142234);
        setIntField(term309375, term309375.getClass(), "judgeDisp", 1782961805);
        setIntField(term309375, term309375.getClass(), "judgePos", 297517056);
        setIntField(term309375, term309375.getClass(), "judgeBreak", -491748640);
        setIntField(term309375, term309375.getClass(), "judgeHit", -1904941002);
        setIntField(term309375, term309375.getClass(), "platinumBreakDisp", 1453887508);
        setIntField(term309375, term309375.getClass(), "judgeCriticalBreak", -1527628075);
        setIntField(term309375, term309375.getClass(), "matching", -113628762);
        setIntField(term309375, term309375.getClass(), "dispPlayerLv", 895565502);
        setIntField(term309375, term309375.getClass(), "dispRating", 175406253);
        setIntField(term309375, term309375.getClass(), "dispBP", 1477171041);
        setIntField(term309375, term309375.getClass(), "headphone", 91216248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term309375, args);
    }

};


