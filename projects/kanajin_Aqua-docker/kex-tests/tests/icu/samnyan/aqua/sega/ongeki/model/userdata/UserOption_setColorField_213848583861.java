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

public class UserOption_setColorField_213848583861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337096;
     Object term337398;

    public UserOption_setColorField_213848583861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term337102 = new Long(1731335447688885587L);
        term337096 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term337098 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term337100 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term337116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term337117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337121 = newInstance(Class.forName("java.time.LocalTime"));
        Object term337126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term337127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337131 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term337096, term337096.getClass(), "id", 3627593861820271632L);
        setLongField(term337098, term337098.getClass(), "id", -3359741520592028253L);
        setLongField(term337100, term337100.getClass(), "id", -8591301899679791934L);
        setField(term337100, term337100.getClass(), "extId", term337102);
        setField(term337100, term337100.getClass(), "luid", "OepGATuoHD");
        setIntField(term337117, term337117.getClass(), "year", 2018);
        setShortField(term337117, term337117.getClass(), "month", (short) 12);
        setShortField(term337117, term337117.getClass(), "day", (short) 13);
        setField(term337116, term337116.getClass(), "date", term337117);
        setByteField(term337121, term337121.getClass(), "hour", (byte) 13);
        setByteField(term337121, term337121.getClass(), "minute", (byte) 46);
        setByteField(term337121, term337121.getClass(), "second", (byte) 33);
        setIntField(term337121, term337121.getClass(), "nano", 393900866);
        setField(term337116, term337116.getClass(), "time", term337121);
        setField(term337100, term337100.getClass(), "registerTime", term337116);
        setIntField(term337127, term337127.getClass(), "year", 2016);
        setShortField(term337127, term337127.getClass(), "month", (short) 5);
        setShortField(term337127, term337127.getClass(), "day", (short) 17);
        setField(term337126, term337126.getClass(), "date", term337127);
        setByteField(term337131, term337131.getClass(), "hour", (byte) 18);
        setByteField(term337131, term337131.getClass(), "minute", (byte) 43);
        setByteField(term337131, term337131.getClass(), "second", (byte) 39);
        setIntField(term337131, term337131.getClass(), "nano", 108025449);
        setField(term337126, term337126.getClass(), "time", term337131);
        setField(term337100, term337100.getClass(), "accessTime", term337126);
        setField(term337098, term337098.getClass(), "card", term337100);
        setField(term337098, term337098.getClass(), "userName", "cvJgKbaVbO");
        setIntField(term337098, term337098.getClass(), "level", -861305943);
        setIntField(term337098, term337098.getClass(), "reincarnationNum", 123936838);
        setLongField(term337098, term337098.getClass(), "exp", -1885247205161366025L);
        setLongField(term337098, term337098.getClass(), "point", -6766794403164048157L);
        setLongField(term337098, term337098.getClass(), "totalPoint", -3621210403323359652L);
        setIntField(term337098, term337098.getClass(), "playCount", -740431646);
        setIntField(term337098, term337098.getClass(), "jewelCount", -1912280510);
        setIntField(term337098, term337098.getClass(), "totalJewelCount", 1344704410);
        setIntField(term337098, term337098.getClass(), "medalCount", -760280335);
        setIntField(term337098, term337098.getClass(), "playerRating", 1489495541);
        setIntField(term337098, term337098.getClass(), "highestRating", -1477687777);
        setIntField(term337098, term337098.getClass(), "battlePoint", -1011435714);
        setIntField(term337098, term337098.getClass(), "bestBattlePoint", -1990243436);
        setIntField(term337098, term337098.getClass(), "overDamageBattlePoint", -876281484);
        setBooleanField(term337098, term337098.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term337098, term337098.getClass(), "nameplateId", -2070941974);
        setIntField(term337098, term337098.getClass(), "trophyId", 1221136234);
        setIntField(term337098, term337098.getClass(), "cardId", -1841205035);
        setIntField(term337098, term337098.getClass(), "characterId", 167282184);
        setIntField(term337098, term337098.getClass(), "characterVoiceNo", 1896831429);
        setIntField(term337098, term337098.getClass(), "tabSetting", -839824784);
        setIntField(term337098, term337098.getClass(), "tabSortSetting", 1560898566);
        setIntField(term337098, term337098.getClass(), "cardCategorySetting", 191451147);
        setIntField(term337098, term337098.getClass(), "cardSortSetting", -415546420);
        setIntField(term337098, term337098.getClass(), "rivalScoreCategorySetting", 1883424981);
        setIntField(term337098, term337098.getClass(), "playedTutorialBit", 621372878);
        setIntField(term337098, term337098.getClass(), "firstTutorialCancelNum", 864202587);
        setLongField(term337098, term337098.getClass(), "sumTechHighScore", -2478702815424454147L);
        setLongField(term337098, term337098.getClass(), "sumTechBasicHighScore", 8370539155790698079L);
        setLongField(term337098, term337098.getClass(), "sumTechAdvancedHighScore", 3470739934405503831L);
        setLongField(term337098, term337098.getClass(), "sumTechExpertHighScore", -6329619968619114523L);
        setLongField(term337098, term337098.getClass(), "sumTechMasterHighScore", 6905935396791729598L);
        setLongField(term337098, term337098.getClass(), "sumTechLunaticHighScore", -1644028153835480429L);
        setLongField(term337098, term337098.getClass(), "sumBattleHighScore", 4263721349830721415L);
        setLongField(term337098, term337098.getClass(), "sumBattleBasicHighScore", -2111704890264436369L);
        setLongField(term337098, term337098.getClass(), "sumBattleAdvancedHighScore", 1020995191406688467L);
        setLongField(term337098, term337098.getClass(), "sumBattleExpertHighScore", -7679370864342866233L);
        setLongField(term337098, term337098.getClass(), "sumBattleMasterHighScore", -2044492976381346796L);
        setLongField(term337098, term337098.getClass(), "sumBattleLunaticHighScore", -8654357267952743855L);
        setField(term337098, term337098.getClass(), "eventWatchedDate", "dRXOjXjySg");
        setField(term337098, term337098.getClass(), "cmEventWatchedDate", "DuBopqWiMS");
        setField(term337098, term337098.getClass(), "firstGameId", "LmvIaFgTDn");
        setField(term337098, term337098.getClass(), "firstRomVersion", "SkEeHlBbvi");
        setField(term337098, term337098.getClass(), "firstDataVersion", "laibyAErBF");
        setField(term337098, term337098.getClass(), "firstPlayDate", "XXOwxAEelD");
        setField(term337098, term337098.getClass(), "lastGameId", "YqdDRsexDJ");
        setField(term337098, term337098.getClass(), "lastRomVersion", "sXIPNjhrtj");
        setField(term337098, term337098.getClass(), "lastDataVersion", "JPHrhDrjQv");
        setField(term337098, term337098.getClass(), "compatibleCmVersion", "PjqHNddvwR");
        setField(term337098, term337098.getClass(), "lastPlayDate", "PWTVrnXYmd");
        setIntField(term337098, term337098.getClass(), "lastPlaceId", -1496690343);
        setField(term337098, term337098.getClass(), "lastPlaceName", "AKChIhnukZ");
        setIntField(term337098, term337098.getClass(), "lastRegionId", 1216315719);
        setField(term337098, term337098.getClass(), "lastRegionName", "yyozroNcbU");
        setIntField(term337098, term337098.getClass(), "lastAllNetId", -545277688);
        setField(term337098, term337098.getClass(), "lastClientId", "xWEkfhhViz");
        setIntField(term337098, term337098.getClass(), "lastUsedDeckId", -639561103);
        setIntField(term337098, term337098.getClass(), "lastPlayMusicLevel", -459154046);
        setIntField(term337098, term337098.getClass(), "lastEmoneyBrand", -1120341043);
        setField(term337096, term337096.getClass(), "user", term337098);
        setIntField(term337096, term337096.getClass(), "optionSet", 437204970);
        setIntField(term337096, term337096.getClass(), "speed", 114675377);
        setIntField(term337096, term337096.getClass(), "mirror", 2052963814);
        setIntField(term337096, term337096.getClass(), "judgeTiming", 707828800);
        setIntField(term337096, term337096.getClass(), "judgeAdjustment", 9707370);
        setIntField(term337096, term337096.getClass(), "abort", 1508809219);
        setIntField(term337096, term337096.getClass(), "stealthField", 833224361);
        setIntField(term337096, term337096.getClass(), "tapSound", 1613273081);
        setIntField(term337096, term337096.getClass(), "volGuide", 399138012);
        setIntField(term337096, term337096.getClass(), "volAll", 1350732193);
        setIntField(term337096, term337096.getClass(), "volTap", 1051581116);
        setIntField(term337096, term337096.getClass(), "volCrTap", -1238601013);
        setIntField(term337096, term337096.getClass(), "volHold", -1973417505);
        setIntField(term337096, term337096.getClass(), "volSide", -1609586126);
        setIntField(term337096, term337096.getClass(), "volFlick", 1526166625);
        setIntField(term337096, term337096.getClass(), "volBell", -647672013);
        setIntField(term337096, term337096.getClass(), "volEnemy", 1784234618);
        setIntField(term337096, term337096.getClass(), "volSkill", 1632732440);
        setIntField(term337096, term337096.getClass(), "volDamage", 457970158);
        setIntField(term337096, term337096.getClass(), "colorField", 1779162574);
        setIntField(term337096, term337096.getClass(), "colorLaneBright", -1621575295);
        setIntField(term337096, term337096.getClass(), "colorWallBright", 1051338501);
        setIntField(term337096, term337096.getClass(), "colorLane", 1991828176);
        setIntField(term337096, term337096.getClass(), "colorSide", -1505896438);
        setIntField(term337096, term337096.getClass(), "effectDamage", -1515016387);
        setIntField(term337096, term337096.getClass(), "effectPos", 1878817748);
        setIntField(term337096, term337096.getClass(), "judgeDisp", -1334013742);
        setIntField(term337096, term337096.getClass(), "judgePos", -1113329120);
        setIntField(term337096, term337096.getClass(), "judgeBreak", -395956661);
        setIntField(term337096, term337096.getClass(), "judgeHit", -793767018);
        setIntField(term337096, term337096.getClass(), "platinumBreakDisp", 555884959);
        setIntField(term337096, term337096.getClass(), "judgeCriticalBreak", -164595647);
        setIntField(term337096, term337096.getClass(), "matching", -1418546492);
        setIntField(term337096, term337096.getClass(), "dispPlayerLv", -410802966);
        setIntField(term337096, term337096.getClass(), "dispRating", -1448481659);
        setIntField(term337096, term337096.getClass(), "dispBP", 168692495);
        setIntField(term337096, term337096.getClass(), "headphone", -625041506);
        term337398 = new Integer(-61546351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term337398;
        callMethod(klass, "setColorField", argTypes, term337096, args);
    }

};


