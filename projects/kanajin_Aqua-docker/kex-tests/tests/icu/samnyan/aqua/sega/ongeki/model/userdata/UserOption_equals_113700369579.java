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

public class UserOption_equals_113700369579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345448;
     Object term345750;

    public UserOption_equals_113700369579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term345454 = new Long(-4944032768681866361L);
        term345448 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term345450 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term345452 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term345468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term345473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term345478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term345483 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term345448, term345448.getClass(), "id", -8390222579034690615L);
        setLongField(term345450, term345450.getClass(), "id", -2347395644606727243L);
        setLongField(term345452, term345452.getClass(), "id", -2175605790258781192L);
        setField(term345452, term345452.getClass(), "extId", term345454);
        setField(term345452, term345452.getClass(), "luid", "dolywHlSIi");
        setIntField(term345469, term345469.getClass(), "year", 2018);
        setShortField(term345469, term345469.getClass(), "month", (short) 5);
        setShortField(term345469, term345469.getClass(), "day", (short) 14);
        setField(term345468, term345468.getClass(), "date", term345469);
        setByteField(term345473, term345473.getClass(), "hour", (byte) 13);
        setByteField(term345473, term345473.getClass(), "minute", (byte) 42);
        setByteField(term345473, term345473.getClass(), "second", (byte) 58);
        setIntField(term345473, term345473.getClass(), "nano", 934560950);
        setField(term345468, term345468.getClass(), "time", term345473);
        setField(term345452, term345452.getClass(), "registerTime", term345468);
        setIntField(term345479, term345479.getClass(), "year", 2026);
        setShortField(term345479, term345479.getClass(), "month", (short) 4);
        setShortField(term345479, term345479.getClass(), "day", (short) 14);
        setField(term345478, term345478.getClass(), "date", term345479);
        setByteField(term345483, term345483.getClass(), "hour", (byte) 7);
        setByteField(term345483, term345483.getClass(), "minute", (byte) 8);
        setByteField(term345483, term345483.getClass(), "second", (byte) 29);
        setIntField(term345483, term345483.getClass(), "nano", 688827647);
        setField(term345478, term345478.getClass(), "time", term345483);
        setField(term345452, term345452.getClass(), "accessTime", term345478);
        setField(term345450, term345450.getClass(), "card", term345452);
        setField(term345450, term345450.getClass(), "userName", "nnMRBuOUoG");
        setIntField(term345450, term345450.getClass(), "level", -867164405);
        setIntField(term345450, term345450.getClass(), "reincarnationNum", 1822905927);
        setLongField(term345450, term345450.getClass(), "exp", -7963348072655921061L);
        setLongField(term345450, term345450.getClass(), "point", -8003525315079189555L);
        setLongField(term345450, term345450.getClass(), "totalPoint", 4075905293315632271L);
        setIntField(term345450, term345450.getClass(), "playCount", 948237461);
        setIntField(term345450, term345450.getClass(), "jewelCount", 1391978687);
        setIntField(term345450, term345450.getClass(), "totalJewelCount", 727126690);
        setIntField(term345450, term345450.getClass(), "medalCount", 1140053500);
        setIntField(term345450, term345450.getClass(), "playerRating", -1390969369);
        setIntField(term345450, term345450.getClass(), "highestRating", -861634584);
        setIntField(term345450, term345450.getClass(), "battlePoint", 1721296510);
        setIntField(term345450, term345450.getClass(), "bestBattlePoint", -1888933685);
        setIntField(term345450, term345450.getClass(), "overDamageBattlePoint", -1342788578);
        setBooleanField(term345450, term345450.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term345450, term345450.getClass(), "nameplateId", 128927142);
        setIntField(term345450, term345450.getClass(), "trophyId", 1131148296);
        setIntField(term345450, term345450.getClass(), "cardId", -371210957);
        setIntField(term345450, term345450.getClass(), "characterId", 542294244);
        setIntField(term345450, term345450.getClass(), "characterVoiceNo", 972245562);
        setIntField(term345450, term345450.getClass(), "tabSetting", -1098946020);
        setIntField(term345450, term345450.getClass(), "tabSortSetting", 73489438);
        setIntField(term345450, term345450.getClass(), "cardCategorySetting", -2045108354);
        setIntField(term345450, term345450.getClass(), "cardSortSetting", -1520644405);
        setIntField(term345450, term345450.getClass(), "rivalScoreCategorySetting", 1770399524);
        setIntField(term345450, term345450.getClass(), "playedTutorialBit", 1782950762);
        setIntField(term345450, term345450.getClass(), "firstTutorialCancelNum", 17925883);
        setLongField(term345450, term345450.getClass(), "sumTechHighScore", 4037443066187534334L);
        setLongField(term345450, term345450.getClass(), "sumTechBasicHighScore", -868965365743221219L);
        setLongField(term345450, term345450.getClass(), "sumTechAdvancedHighScore", 4824185089114615111L);
        setLongField(term345450, term345450.getClass(), "sumTechExpertHighScore", 938013379731306676L);
        setLongField(term345450, term345450.getClass(), "sumTechMasterHighScore", -4487122419739524942L);
        setLongField(term345450, term345450.getClass(), "sumTechLunaticHighScore", -4562024279934645816L);
        setLongField(term345450, term345450.getClass(), "sumBattleHighScore", 2470908469831620633L);
        setLongField(term345450, term345450.getClass(), "sumBattleBasicHighScore", 2840968159584216762L);
        setLongField(term345450, term345450.getClass(), "sumBattleAdvancedHighScore", -2330160568766920983L);
        setLongField(term345450, term345450.getClass(), "sumBattleExpertHighScore", 8204983722005958966L);
        setLongField(term345450, term345450.getClass(), "sumBattleMasterHighScore", -6965027874798238936L);
        setLongField(term345450, term345450.getClass(), "sumBattleLunaticHighScore", 2118722013808487901L);
        setField(term345450, term345450.getClass(), "eventWatchedDate", "cBguIVnfJC");
        setField(term345450, term345450.getClass(), "cmEventWatchedDate", "pciCOjaINO");
        setField(term345450, term345450.getClass(), "firstGameId", "IYwvalYGmX");
        setField(term345450, term345450.getClass(), "firstRomVersion", "kdycGrdEWG");
        setField(term345450, term345450.getClass(), "firstDataVersion", "NAESUvpOAY");
        setField(term345450, term345450.getClass(), "firstPlayDate", "ptEVZPyKgD");
        setField(term345450, term345450.getClass(), "lastGameId", "RnnxeTWRAN");
        setField(term345450, term345450.getClass(), "lastRomVersion", "WOpZuqVHKD");
        setField(term345450, term345450.getClass(), "lastDataVersion", "nMjXaLZtfE");
        setField(term345450, term345450.getClass(), "compatibleCmVersion", "SvwgIBVhCT");
        setField(term345450, term345450.getClass(), "lastPlayDate", "zYXwtgtXdm");
        setIntField(term345450, term345450.getClass(), "lastPlaceId", -378223222);
        setField(term345450, term345450.getClass(), "lastPlaceName", "ePSUVTQQcH");
        setIntField(term345450, term345450.getClass(), "lastRegionId", -773021599);
        setField(term345450, term345450.getClass(), "lastRegionName", "emyvAyIZir");
        setIntField(term345450, term345450.getClass(), "lastAllNetId", -1007979356);
        setField(term345450, term345450.getClass(), "lastClientId", "YzIhGzsuTf");
        setIntField(term345450, term345450.getClass(), "lastUsedDeckId", 1408842666);
        setIntField(term345450, term345450.getClass(), "lastPlayMusicLevel", -194924521);
        setIntField(term345450, term345450.getClass(), "lastEmoneyBrand", -1573557620);
        setField(term345448, term345448.getClass(), "user", term345450);
        setIntField(term345448, term345448.getClass(), "optionSet", 1849924630);
        setIntField(term345448, term345448.getClass(), "speed", 2018956236);
        setIntField(term345448, term345448.getClass(), "mirror", 195919907);
        setIntField(term345448, term345448.getClass(), "judgeTiming", 1966946205);
        setIntField(term345448, term345448.getClass(), "judgeAdjustment", 1547744259);
        setIntField(term345448, term345448.getClass(), "abort", 750951306);
        setIntField(term345448, term345448.getClass(), "stealthField", -1477026219);
        setIntField(term345448, term345448.getClass(), "tapSound", 1163943401);
        setIntField(term345448, term345448.getClass(), "volGuide", -6457296);
        setIntField(term345448, term345448.getClass(), "volAll", -1173175256);
        setIntField(term345448, term345448.getClass(), "volTap", -794133647);
        setIntField(term345448, term345448.getClass(), "volCrTap", 1049181298);
        setIntField(term345448, term345448.getClass(), "volHold", -57606746);
        setIntField(term345448, term345448.getClass(), "volSide", 1521341051);
        setIntField(term345448, term345448.getClass(), "volFlick", -1806872649);
        setIntField(term345448, term345448.getClass(), "volBell", 1389367418);
        setIntField(term345448, term345448.getClass(), "volEnemy", 1211079350);
        setIntField(term345448, term345448.getClass(), "volSkill", -1779367784);
        setIntField(term345448, term345448.getClass(), "volDamage", 415689864);
        setIntField(term345448, term345448.getClass(), "colorField", -355856295);
        setIntField(term345448, term345448.getClass(), "colorLaneBright", -542913731);
        setIntField(term345448, term345448.getClass(), "colorWallBright", -953252147);
        setIntField(term345448, term345448.getClass(), "colorLane", 1680098383);
        setIntField(term345448, term345448.getClass(), "colorSide", 506388368);
        setIntField(term345448, term345448.getClass(), "effectDamage", -413493975);
        setIntField(term345448, term345448.getClass(), "effectPos", 1737686997);
        setIntField(term345448, term345448.getClass(), "judgeDisp", 1664715934);
        setIntField(term345448, term345448.getClass(), "judgePos", 475574301);
        setIntField(term345448, term345448.getClass(), "judgeBreak", -655150789);
        setIntField(term345448, term345448.getClass(), "judgeHit", 2072009798);
        setIntField(term345448, term345448.getClass(), "platinumBreakDisp", 923147927);
        setIntField(term345448, term345448.getClass(), "judgeCriticalBreak", 1872012560);
        setIntField(term345448, term345448.getClass(), "matching", -1652950002);
        setIntField(term345448, term345448.getClass(), "dispPlayerLv", 1507858766);
        setIntField(term345448, term345448.getClass(), "dispRating", 1976269197);
        setIntField(term345448, term345448.getClass(), "dispBP", 125717085);
        setIntField(term345448, term345448.getClass(), "headphone", 1936913239);
        term345750 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term345750;
        callMethod(klass, "equals", argTypes, term345448, args);
    }

};


