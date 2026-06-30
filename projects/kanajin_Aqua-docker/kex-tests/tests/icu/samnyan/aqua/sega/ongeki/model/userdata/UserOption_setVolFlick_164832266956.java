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

public class UserOption_setVolFlick_164832266956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334776;
     Object term335078;

    public UserOption_setVolFlick_164832266956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334782 = new Long(9173715346996433126L);
        term334776 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term334778 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term334780 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term334796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term334797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term334801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term334806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term334807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term334811 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term334776, term334776.getClass(), "id", 7080533104767925395L);
        setLongField(term334778, term334778.getClass(), "id", -4341436380184291587L);
        setLongField(term334780, term334780.getClass(), "id", -1160745216060748080L);
        setField(term334780, term334780.getClass(), "extId", term334782);
        setField(term334780, term334780.getClass(), "luid", "GJbyRkEXOg");
        setIntField(term334797, term334797.getClass(), "year", 2025);
        setShortField(term334797, term334797.getClass(), "month", (short) 2);
        setShortField(term334797, term334797.getClass(), "day", (short) 6);
        setField(term334796, term334796.getClass(), "date", term334797);
        setByteField(term334801, term334801.getClass(), "hour", (byte) 15);
        setByteField(term334801, term334801.getClass(), "minute", (byte) 17);
        setByteField(term334801, term334801.getClass(), "second", (byte) 14);
        setIntField(term334801, term334801.getClass(), "nano", 517876656);
        setField(term334796, term334796.getClass(), "time", term334801);
        setField(term334780, term334780.getClass(), "registerTime", term334796);
        setIntField(term334807, term334807.getClass(), "year", 2025);
        setShortField(term334807, term334807.getClass(), "month", (short) 10);
        setShortField(term334807, term334807.getClass(), "day", (short) 12);
        setField(term334806, term334806.getClass(), "date", term334807);
        setByteField(term334811, term334811.getClass(), "hour", (byte) 21);
        setByteField(term334811, term334811.getClass(), "minute", (byte) 43);
        setByteField(term334811, term334811.getClass(), "second", (byte) 56);
        setIntField(term334811, term334811.getClass(), "nano", 106716069);
        setField(term334806, term334806.getClass(), "time", term334811);
        setField(term334780, term334780.getClass(), "accessTime", term334806);
        setField(term334778, term334778.getClass(), "card", term334780);
        setField(term334778, term334778.getClass(), "userName", "euDJxwTEvm");
        setIntField(term334778, term334778.getClass(), "level", 1857875869);
        setIntField(term334778, term334778.getClass(), "reincarnationNum", 1476732721);
        setLongField(term334778, term334778.getClass(), "exp", -9205019844926894279L);
        setLongField(term334778, term334778.getClass(), "point", -5212140358780355281L);
        setLongField(term334778, term334778.getClass(), "totalPoint", 1674359551818367189L);
        setIntField(term334778, term334778.getClass(), "playCount", -1357145194);
        setIntField(term334778, term334778.getClass(), "jewelCount", 1504791908);
        setIntField(term334778, term334778.getClass(), "totalJewelCount", -744938855);
        setIntField(term334778, term334778.getClass(), "medalCount", 593710556);
        setIntField(term334778, term334778.getClass(), "playerRating", 66448659);
        setIntField(term334778, term334778.getClass(), "highestRating", -1419897437);
        setIntField(term334778, term334778.getClass(), "battlePoint", -1592297082);
        setIntField(term334778, term334778.getClass(), "bestBattlePoint", -1324026890);
        setIntField(term334778, term334778.getClass(), "overDamageBattlePoint", -51135139);
        setBooleanField(term334778, term334778.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term334778, term334778.getClass(), "nameplateId", 312014334);
        setIntField(term334778, term334778.getClass(), "trophyId", -1847596059);
        setIntField(term334778, term334778.getClass(), "cardId", 1616169832);
        setIntField(term334778, term334778.getClass(), "characterId", 570560874);
        setIntField(term334778, term334778.getClass(), "characterVoiceNo", -952668257);
        setIntField(term334778, term334778.getClass(), "tabSetting", -2034981230);
        setIntField(term334778, term334778.getClass(), "tabSortSetting", -2082739016);
        setIntField(term334778, term334778.getClass(), "cardCategorySetting", -365199269);
        setIntField(term334778, term334778.getClass(), "cardSortSetting", -1386125231);
        setIntField(term334778, term334778.getClass(), "rivalScoreCategorySetting", 1574329200);
        setIntField(term334778, term334778.getClass(), "playedTutorialBit", -631957530);
        setIntField(term334778, term334778.getClass(), "firstTutorialCancelNum", 749290937);
        setLongField(term334778, term334778.getClass(), "sumTechHighScore", 6248259397704352281L);
        setLongField(term334778, term334778.getClass(), "sumTechBasicHighScore", -1458747718981534965L);
        setLongField(term334778, term334778.getClass(), "sumTechAdvancedHighScore", -252449786946738429L);
        setLongField(term334778, term334778.getClass(), "sumTechExpertHighScore", 629989218578314139L);
        setLongField(term334778, term334778.getClass(), "sumTechMasterHighScore", -2077733635012935436L);
        setLongField(term334778, term334778.getClass(), "sumTechLunaticHighScore", 6495293049745015025L);
        setLongField(term334778, term334778.getClass(), "sumBattleHighScore", 5847962370033758533L);
        setLongField(term334778, term334778.getClass(), "sumBattleBasicHighScore", 1386266758121099910L);
        setLongField(term334778, term334778.getClass(), "sumBattleAdvancedHighScore", -4140773577740128601L);
        setLongField(term334778, term334778.getClass(), "sumBattleExpertHighScore", -6274327683615650938L);
        setLongField(term334778, term334778.getClass(), "sumBattleMasterHighScore", 4124993718046825066L);
        setLongField(term334778, term334778.getClass(), "sumBattleLunaticHighScore", 863960902719415218L);
        setField(term334778, term334778.getClass(), "eventWatchedDate", "iVvgpgRIUb");
        setField(term334778, term334778.getClass(), "cmEventWatchedDate", "saXyCdEHoT");
        setField(term334778, term334778.getClass(), "firstGameId", "LeEhysbWwR");
        setField(term334778, term334778.getClass(), "firstRomVersion", "PdiDOQaWmU");
        setField(term334778, term334778.getClass(), "firstDataVersion", "wCVEKHtduy");
        setField(term334778, term334778.getClass(), "firstPlayDate", "EWMwNnHkAU");
        setField(term334778, term334778.getClass(), "lastGameId", "muUpMPhQLl");
        setField(term334778, term334778.getClass(), "lastRomVersion", "otHrnazqNk");
        setField(term334778, term334778.getClass(), "lastDataVersion", "GgmInmZUeY");
        setField(term334778, term334778.getClass(), "compatibleCmVersion", "PNflaQmUeF");
        setField(term334778, term334778.getClass(), "lastPlayDate", "uurMCvIzyt");
        setIntField(term334778, term334778.getClass(), "lastPlaceId", -1663104647);
        setField(term334778, term334778.getClass(), "lastPlaceName", "wtiNUxyUhI");
        setIntField(term334778, term334778.getClass(), "lastRegionId", 1718314820);
        setField(term334778, term334778.getClass(), "lastRegionName", "KNsGFUokFb");
        setIntField(term334778, term334778.getClass(), "lastAllNetId", 58895993);
        setField(term334778, term334778.getClass(), "lastClientId", "KGKCNDROpC");
        setIntField(term334778, term334778.getClass(), "lastUsedDeckId", 42775553);
        setIntField(term334778, term334778.getClass(), "lastPlayMusicLevel", -1057940922);
        setIntField(term334778, term334778.getClass(), "lastEmoneyBrand", -795282975);
        setField(term334776, term334776.getClass(), "user", term334778);
        setIntField(term334776, term334776.getClass(), "optionSet", -1493058860);
        setIntField(term334776, term334776.getClass(), "speed", 443468642);
        setIntField(term334776, term334776.getClass(), "mirror", -333952729);
        setIntField(term334776, term334776.getClass(), "judgeTiming", -1270125435);
        setIntField(term334776, term334776.getClass(), "judgeAdjustment", -1251632947);
        setIntField(term334776, term334776.getClass(), "abort", 181139652);
        setIntField(term334776, term334776.getClass(), "stealthField", -1467803523);
        setIntField(term334776, term334776.getClass(), "tapSound", 547230339);
        setIntField(term334776, term334776.getClass(), "volGuide", -1005776001);
        setIntField(term334776, term334776.getClass(), "volAll", 1007567116);
        setIntField(term334776, term334776.getClass(), "volTap", 1965122193);
        setIntField(term334776, term334776.getClass(), "volCrTap", -492351455);
        setIntField(term334776, term334776.getClass(), "volHold", -389346209);
        setIntField(term334776, term334776.getClass(), "volSide", 1407736990);
        setIntField(term334776, term334776.getClass(), "volFlick", 735553736);
        setIntField(term334776, term334776.getClass(), "volBell", 1047147459);
        setIntField(term334776, term334776.getClass(), "volEnemy", -376832115);
        setIntField(term334776, term334776.getClass(), "volSkill", 1011386146);
        setIntField(term334776, term334776.getClass(), "volDamage", -1640259051);
        setIntField(term334776, term334776.getClass(), "colorField", -32813752);
        setIntField(term334776, term334776.getClass(), "colorLaneBright", -558696084);
        setIntField(term334776, term334776.getClass(), "colorWallBright", -2042493045);
        setIntField(term334776, term334776.getClass(), "colorLane", 1592179886);
        setIntField(term334776, term334776.getClass(), "colorSide", -194404429);
        setIntField(term334776, term334776.getClass(), "effectDamage", 848679284);
        setIntField(term334776, term334776.getClass(), "effectPos", -507988907);
        setIntField(term334776, term334776.getClass(), "judgeDisp", -1258125566);
        setIntField(term334776, term334776.getClass(), "judgePos", 790792462);
        setIntField(term334776, term334776.getClass(), "judgeBreak", -308691386);
        setIntField(term334776, term334776.getClass(), "judgeHit", 227145741);
        setIntField(term334776, term334776.getClass(), "platinumBreakDisp", 1501443049);
        setIntField(term334776, term334776.getClass(), "judgeCriticalBreak", -1827552118);
        setIntField(term334776, term334776.getClass(), "matching", -1948608768);
        setIntField(term334776, term334776.getClass(), "dispPlayerLv", 631446038);
        setIntField(term334776, term334776.getClass(), "dispRating", -929321443);
        setIntField(term334776, term334776.getClass(), "dispBP", -607327509);
        setIntField(term334776, term334776.getClass(), "headphone", -834120238);
        term335078 = new Integer(-1255354455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term335078;
        callMethod(klass, "setVolFlick", argTypes, term334776, args);
    }

};


