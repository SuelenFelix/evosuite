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

public class UserOption_setTapSound_29452626549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331528;
     Object term331830;

    public UserOption_setTapSound_29452626549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331534 = new Long(675601558105654203L);
        term331528 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term331530 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term331532 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term331548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331563 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term331528, term331528.getClass(), "id", -2687629368420470121L);
        setLongField(term331530, term331530.getClass(), "id", -6326232711974754308L);
        setLongField(term331532, term331532.getClass(), "id", -3147026927988202887L);
        setField(term331532, term331532.getClass(), "extId", term331534);
        setField(term331532, term331532.getClass(), "luid", "oITckSmPus");
        setIntField(term331549, term331549.getClass(), "year", 2011);
        setShortField(term331549, term331549.getClass(), "month", (short) 3);
        setShortField(term331549, term331549.getClass(), "day", (short) 24);
        setField(term331548, term331548.getClass(), "date", term331549);
        setByteField(term331553, term331553.getClass(), "hour", (byte) 10);
        setByteField(term331553, term331553.getClass(), "minute", (byte) 39);
        setByteField(term331553, term331553.getClass(), "second", (byte) 44);
        setIntField(term331553, term331553.getClass(), "nano", 506557889);
        setField(term331548, term331548.getClass(), "time", term331553);
        setField(term331532, term331532.getClass(), "registerTime", term331548);
        setIntField(term331559, term331559.getClass(), "year", 2021);
        setShortField(term331559, term331559.getClass(), "month", (short) 10);
        setShortField(term331559, term331559.getClass(), "day", (short) 4);
        setField(term331558, term331558.getClass(), "date", term331559);
        setByteField(term331563, term331563.getClass(), "hour", (byte) 17);
        setByteField(term331563, term331563.getClass(), "minute", (byte) 59);
        setByteField(term331563, term331563.getClass(), "second", (byte) 4);
        setIntField(term331563, term331563.getClass(), "nano", 334540799);
        setField(term331558, term331558.getClass(), "time", term331563);
        setField(term331532, term331532.getClass(), "accessTime", term331558);
        setField(term331530, term331530.getClass(), "card", term331532);
        setField(term331530, term331530.getClass(), "userName", "ATWqPYwarC");
        setIntField(term331530, term331530.getClass(), "level", 1611973107);
        setIntField(term331530, term331530.getClass(), "reincarnationNum", 1885369769);
        setLongField(term331530, term331530.getClass(), "exp", 1353995737721360504L);
        setLongField(term331530, term331530.getClass(), "point", -8907671994908137316L);
        setLongField(term331530, term331530.getClass(), "totalPoint", -3592830643811169891L);
        setIntField(term331530, term331530.getClass(), "playCount", -620413984);
        setIntField(term331530, term331530.getClass(), "jewelCount", 1864878359);
        setIntField(term331530, term331530.getClass(), "totalJewelCount", -1817386093);
        setIntField(term331530, term331530.getClass(), "medalCount", -1450302738);
        setIntField(term331530, term331530.getClass(), "playerRating", -689307214);
        setIntField(term331530, term331530.getClass(), "highestRating", 1661166066);
        setIntField(term331530, term331530.getClass(), "battlePoint", 1404705877);
        setIntField(term331530, term331530.getClass(), "bestBattlePoint", 321976631);
        setIntField(term331530, term331530.getClass(), "overDamageBattlePoint", 641521266);
        setBooleanField(term331530, term331530.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term331530, term331530.getClass(), "nameplateId", 661573501);
        setIntField(term331530, term331530.getClass(), "trophyId", -1824013816);
        setIntField(term331530, term331530.getClass(), "cardId", -811042195);
        setIntField(term331530, term331530.getClass(), "characterId", 1724479266);
        setIntField(term331530, term331530.getClass(), "characterVoiceNo", -2008091868);
        setIntField(term331530, term331530.getClass(), "tabSetting", 583001317);
        setIntField(term331530, term331530.getClass(), "tabSortSetting", 2055529380);
        setIntField(term331530, term331530.getClass(), "cardCategorySetting", 112609089);
        setIntField(term331530, term331530.getClass(), "cardSortSetting", -760407767);
        setIntField(term331530, term331530.getClass(), "rivalScoreCategorySetting", 1379123972);
        setIntField(term331530, term331530.getClass(), "playedTutorialBit", 1611304316);
        setIntField(term331530, term331530.getClass(), "firstTutorialCancelNum", -2076298403);
        setLongField(term331530, term331530.getClass(), "sumTechHighScore", -5293798492449967385L);
        setLongField(term331530, term331530.getClass(), "sumTechBasicHighScore", -4593476532369433829L);
        setLongField(term331530, term331530.getClass(), "sumTechAdvancedHighScore", 6064399548001423823L);
        setLongField(term331530, term331530.getClass(), "sumTechExpertHighScore", -648205899981300658L);
        setLongField(term331530, term331530.getClass(), "sumTechMasterHighScore", 2364709192192157983L);
        setLongField(term331530, term331530.getClass(), "sumTechLunaticHighScore", 4023938542464507038L);
        setLongField(term331530, term331530.getClass(), "sumBattleHighScore", -8655914406369646345L);
        setLongField(term331530, term331530.getClass(), "sumBattleBasicHighScore", -4786113248469406167L);
        setLongField(term331530, term331530.getClass(), "sumBattleAdvancedHighScore", 7112998059368272662L);
        setLongField(term331530, term331530.getClass(), "sumBattleExpertHighScore", 7498973853207312031L);
        setLongField(term331530, term331530.getClass(), "sumBattleMasterHighScore", 3580639976191184987L);
        setLongField(term331530, term331530.getClass(), "sumBattleLunaticHighScore", 6429549293687827054L);
        setField(term331530, term331530.getClass(), "eventWatchedDate", "JIusqtXOss");
        setField(term331530, term331530.getClass(), "cmEventWatchedDate", "cQlAWLkNee");
        setField(term331530, term331530.getClass(), "firstGameId", "FBOfAPLuIC");
        setField(term331530, term331530.getClass(), "firstRomVersion", "xbYgogKAOs");
        setField(term331530, term331530.getClass(), "firstDataVersion", "UnZDIuIXHA");
        setField(term331530, term331530.getClass(), "firstPlayDate", "eMDKISPEZX");
        setField(term331530, term331530.getClass(), "lastGameId", "MIEslfcwLI");
        setField(term331530, term331530.getClass(), "lastRomVersion", "rRfAmPuglL");
        setField(term331530, term331530.getClass(), "lastDataVersion", "sGsdsrdUQi");
        setField(term331530, term331530.getClass(), "compatibleCmVersion", "xQUKLmOGgW");
        setField(term331530, term331530.getClass(), "lastPlayDate", "BWKCyjKemE");
        setIntField(term331530, term331530.getClass(), "lastPlaceId", 819816871);
        setField(term331530, term331530.getClass(), "lastPlaceName", "AolcbUFPmi");
        setIntField(term331530, term331530.getClass(), "lastRegionId", 1593016081);
        setField(term331530, term331530.getClass(), "lastRegionName", "WYnZFamUFf");
        setIntField(term331530, term331530.getClass(), "lastAllNetId", -85954871);
        setField(term331530, term331530.getClass(), "lastClientId", "vkVfZBdxeS");
        setIntField(term331530, term331530.getClass(), "lastUsedDeckId", 1636673773);
        setIntField(term331530, term331530.getClass(), "lastPlayMusicLevel", 1437394388);
        setIntField(term331530, term331530.getClass(), "lastEmoneyBrand", 442371647);
        setField(term331528, term331528.getClass(), "user", term331530);
        setIntField(term331528, term331528.getClass(), "optionSet", -1085168266);
        setIntField(term331528, term331528.getClass(), "speed", 2060891997);
        setIntField(term331528, term331528.getClass(), "mirror", 253457798);
        setIntField(term331528, term331528.getClass(), "judgeTiming", 2028835195);
        setIntField(term331528, term331528.getClass(), "judgeAdjustment", 1873029542);
        setIntField(term331528, term331528.getClass(), "abort", 828223081);
        setIntField(term331528, term331528.getClass(), "stealthField", -1100297992);
        setIntField(term331528, term331528.getClass(), "tapSound", 672370149);
        setIntField(term331528, term331528.getClass(), "volGuide", 1753550619);
        setIntField(term331528, term331528.getClass(), "volAll", 947965357);
        setIntField(term331528, term331528.getClass(), "volTap", -1064103219);
        setIntField(term331528, term331528.getClass(), "volCrTap", -625231749);
        setIntField(term331528, term331528.getClass(), "volHold", -1716717349);
        setIntField(term331528, term331528.getClass(), "volSide", 114481533);
        setIntField(term331528, term331528.getClass(), "volFlick", -2084905388);
        setIntField(term331528, term331528.getClass(), "volBell", -1769780969);
        setIntField(term331528, term331528.getClass(), "volEnemy", 736469776);
        setIntField(term331528, term331528.getClass(), "volSkill", 1451862258);
        setIntField(term331528, term331528.getClass(), "volDamage", -597719540);
        setIntField(term331528, term331528.getClass(), "colorField", 169740443);
        setIntField(term331528, term331528.getClass(), "colorLaneBright", 1153673007);
        setIntField(term331528, term331528.getClass(), "colorWallBright", 1795096900);
        setIntField(term331528, term331528.getClass(), "colorLane", 1806700139);
        setIntField(term331528, term331528.getClass(), "colorSide", 1732349546);
        setIntField(term331528, term331528.getClass(), "effectDamage", 1744166493);
        setIntField(term331528, term331528.getClass(), "effectPos", 1041453663);
        setIntField(term331528, term331528.getClass(), "judgeDisp", -663459621);
        setIntField(term331528, term331528.getClass(), "judgePos", -1560125159);
        setIntField(term331528, term331528.getClass(), "judgeBreak", -935459315);
        setIntField(term331528, term331528.getClass(), "judgeHit", 1562847407);
        setIntField(term331528, term331528.getClass(), "platinumBreakDisp", -923311356);
        setIntField(term331528, term331528.getClass(), "judgeCriticalBreak", -1776947610);
        setIntField(term331528, term331528.getClass(), "matching", 1966901997);
        setIntField(term331528, term331528.getClass(), "dispPlayerLv", 1129932863);
        setIntField(term331528, term331528.getClass(), "dispRating", 118081104);
        setIntField(term331528, term331528.getClass(), "dispBP", -1507357080);
        setIntField(term331528, term331528.getClass(), "headphone", -512516606);
        term331830 = new Integer(-486169343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term331830;
        callMethod(klass, "setTapSound", argTypes, term331528, args);
    }

};


