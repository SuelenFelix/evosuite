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

public class UserOption_getVolFlick_186888616117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316305;

    public UserOption_getVolFlick_186888616117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316311 = new Long(-8211240904293846981L);
        term316305 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term316307 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term316309 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term316325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316330 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316340 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term316305, term316305.getClass(), "id", -1233894044519344548L);
        setLongField(term316307, term316307.getClass(), "id", -3612099416420138481L);
        setLongField(term316309, term316309.getClass(), "id", -6842976761965242753L);
        setField(term316309, term316309.getClass(), "extId", term316311);
        setField(term316309, term316309.getClass(), "luid", "aOBDaNLItJ");
        setIntField(term316326, term316326.getClass(), "year", 2022);
        setShortField(term316326, term316326.getClass(), "month", (short) 12);
        setShortField(term316326, term316326.getClass(), "day", (short) 25);
        setField(term316325, term316325.getClass(), "date", term316326);
        setByteField(term316330, term316330.getClass(), "hour", (byte) 14);
        setByteField(term316330, term316330.getClass(), "minute", (byte) 46);
        setByteField(term316330, term316330.getClass(), "second", (byte) 54);
        setIntField(term316330, term316330.getClass(), "nano", 646863896);
        setField(term316325, term316325.getClass(), "time", term316330);
        setField(term316309, term316309.getClass(), "registerTime", term316325);
        setIntField(term316336, term316336.getClass(), "year", 2024);
        setShortField(term316336, term316336.getClass(), "month", (short) 11);
        setShortField(term316336, term316336.getClass(), "day", (short) 30);
        setField(term316335, term316335.getClass(), "date", term316336);
        setByteField(term316340, term316340.getClass(), "hour", (byte) 21);
        setByteField(term316340, term316340.getClass(), "minute", (byte) 11);
        setByteField(term316340, term316340.getClass(), "second", (byte) 39);
        setIntField(term316340, term316340.getClass(), "nano", 160428117);
        setField(term316335, term316335.getClass(), "time", term316340);
        setField(term316309, term316309.getClass(), "accessTime", term316335);
        setField(term316307, term316307.getClass(), "card", term316309);
        setField(term316307, term316307.getClass(), "userName", "fYmQdhvGZn");
        setIntField(term316307, term316307.getClass(), "level", 542550600);
        setIntField(term316307, term316307.getClass(), "reincarnationNum", -1601496921);
        setLongField(term316307, term316307.getClass(), "exp", 7588014383811990102L);
        setLongField(term316307, term316307.getClass(), "point", -1189382933622324580L);
        setLongField(term316307, term316307.getClass(), "totalPoint", -5448489901085932270L);
        setIntField(term316307, term316307.getClass(), "playCount", -221567698);
        setIntField(term316307, term316307.getClass(), "jewelCount", -341413663);
        setIntField(term316307, term316307.getClass(), "totalJewelCount", 2091080902);
        setIntField(term316307, term316307.getClass(), "medalCount", 1442192771);
        setIntField(term316307, term316307.getClass(), "playerRating", 1878263363);
        setIntField(term316307, term316307.getClass(), "highestRating", -773438837);
        setIntField(term316307, term316307.getClass(), "battlePoint", -982537051);
        setIntField(term316307, term316307.getClass(), "bestBattlePoint", 1930297196);
        setIntField(term316307, term316307.getClass(), "overDamageBattlePoint", 2110980226);
        setBooleanField(term316307, term316307.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term316307, term316307.getClass(), "nameplateId", -1339712916);
        setIntField(term316307, term316307.getClass(), "trophyId", -2007274304);
        setIntField(term316307, term316307.getClass(), "cardId", -1406392737);
        setIntField(term316307, term316307.getClass(), "characterId", 1627751893);
        setIntField(term316307, term316307.getClass(), "characterVoiceNo", 523074955);
        setIntField(term316307, term316307.getClass(), "tabSetting", -1322452923);
        setIntField(term316307, term316307.getClass(), "tabSortSetting", 75459326);
        setIntField(term316307, term316307.getClass(), "cardCategorySetting", -150840209);
        setIntField(term316307, term316307.getClass(), "cardSortSetting", -2028952673);
        setIntField(term316307, term316307.getClass(), "rivalScoreCategorySetting", 1989220591);
        setIntField(term316307, term316307.getClass(), "playedTutorialBit", 1417925303);
        setIntField(term316307, term316307.getClass(), "firstTutorialCancelNum", 860688928);
        setLongField(term316307, term316307.getClass(), "sumTechHighScore", 5849648382489837362L);
        setLongField(term316307, term316307.getClass(), "sumTechBasicHighScore", -8677117443451139964L);
        setLongField(term316307, term316307.getClass(), "sumTechAdvancedHighScore", -188571945524786389L);
        setLongField(term316307, term316307.getClass(), "sumTechExpertHighScore", -4421768228659717165L);
        setLongField(term316307, term316307.getClass(), "sumTechMasterHighScore", -481174058973556124L);
        setLongField(term316307, term316307.getClass(), "sumTechLunaticHighScore", 6702698799741947696L);
        setLongField(term316307, term316307.getClass(), "sumBattleHighScore", -8709465514998930323L);
        setLongField(term316307, term316307.getClass(), "sumBattleBasicHighScore", -7942857221056306629L);
        setLongField(term316307, term316307.getClass(), "sumBattleAdvancedHighScore", -3612310134730878067L);
        setLongField(term316307, term316307.getClass(), "sumBattleExpertHighScore", 2981803694222189732L);
        setLongField(term316307, term316307.getClass(), "sumBattleMasterHighScore", 4021136299416272904L);
        setLongField(term316307, term316307.getClass(), "sumBattleLunaticHighScore", 5299781135276539157L);
        setField(term316307, term316307.getClass(), "eventWatchedDate", "xFvvZSNmxh");
        setField(term316307, term316307.getClass(), "cmEventWatchedDate", "GtsxIRZWSg");
        setField(term316307, term316307.getClass(), "firstGameId", "vwUmiVnrFE");
        setField(term316307, term316307.getClass(), "firstRomVersion", "IKOFlbGhll");
        setField(term316307, term316307.getClass(), "firstDataVersion", "yeeqvDtZdy");
        setField(term316307, term316307.getClass(), "firstPlayDate", "FbIMzQADuo");
        setField(term316307, term316307.getClass(), "lastGameId", "gPAlFOOqoy");
        setField(term316307, term316307.getClass(), "lastRomVersion", "KqSJGtJNwI");
        setField(term316307, term316307.getClass(), "lastDataVersion", "dmFNVnvVrt");
        setField(term316307, term316307.getClass(), "compatibleCmVersion", "odeMwcTlrz");
        setField(term316307, term316307.getClass(), "lastPlayDate", "IRokafCxJt");
        setIntField(term316307, term316307.getClass(), "lastPlaceId", -786363948);
        setField(term316307, term316307.getClass(), "lastPlaceName", "OxqZiRAHZd");
        setIntField(term316307, term316307.getClass(), "lastRegionId", 104242299);
        setField(term316307, term316307.getClass(), "lastRegionName", "IcjSkxkIom");
        setIntField(term316307, term316307.getClass(), "lastAllNetId", -1191744986);
        setField(term316307, term316307.getClass(), "lastClientId", "uVNmcfpHuM");
        setIntField(term316307, term316307.getClass(), "lastUsedDeckId", 1713164522);
        setIntField(term316307, term316307.getClass(), "lastPlayMusicLevel", -1335530034);
        setIntField(term316307, term316307.getClass(), "lastEmoneyBrand", -888582828);
        setField(term316305, term316305.getClass(), "user", term316307);
        setIntField(term316305, term316305.getClass(), "optionSet", -749215304);
        setIntField(term316305, term316305.getClass(), "speed", 734226645);
        setIntField(term316305, term316305.getClass(), "mirror", 180155629);
        setIntField(term316305, term316305.getClass(), "judgeTiming", 1683440272);
        setIntField(term316305, term316305.getClass(), "judgeAdjustment", -678768496);
        setIntField(term316305, term316305.getClass(), "abort", -879058177);
        setIntField(term316305, term316305.getClass(), "stealthField", -1962966061);
        setIntField(term316305, term316305.getClass(), "tapSound", 300333855);
        setIntField(term316305, term316305.getClass(), "volGuide", 1611448749);
        setIntField(term316305, term316305.getClass(), "volAll", 722153974);
        setIntField(term316305, term316305.getClass(), "volTap", -1135769054);
        setIntField(term316305, term316305.getClass(), "volCrTap", -692979647);
        setIntField(term316305, term316305.getClass(), "volHold", -115249332);
        setIntField(term316305, term316305.getClass(), "volSide", -559819958);
        setIntField(term316305, term316305.getClass(), "volFlick", -1733671286);
        setIntField(term316305, term316305.getClass(), "volBell", -178140360);
        setIntField(term316305, term316305.getClass(), "volEnemy", -163458934);
        setIntField(term316305, term316305.getClass(), "volSkill", -1252231588);
        setIntField(term316305, term316305.getClass(), "volDamage", -853031166);
        setIntField(term316305, term316305.getClass(), "colorField", -1242117569);
        setIntField(term316305, term316305.getClass(), "colorLaneBright", 162192717);
        setIntField(term316305, term316305.getClass(), "colorWallBright", -761103236);
        setIntField(term316305, term316305.getClass(), "colorLane", 1016867156);
        setIntField(term316305, term316305.getClass(), "colorSide", -694394694);
        setIntField(term316305, term316305.getClass(), "effectDamage", -155571099);
        setIntField(term316305, term316305.getClass(), "effectPos", -688363981);
        setIntField(term316305, term316305.getClass(), "judgeDisp", 1665916895);
        setIntField(term316305, term316305.getClass(), "judgePos", 1369452206);
        setIntField(term316305, term316305.getClass(), "judgeBreak", -1292644371);
        setIntField(term316305, term316305.getClass(), "judgeHit", 397443548);
        setIntField(term316305, term316305.getClass(), "platinumBreakDisp", 309132952);
        setIntField(term316305, term316305.getClass(), "judgeCriticalBreak", -1556386958);
        setIntField(term316305, term316305.getClass(), "matching", 559879159);
        setIntField(term316305, term316305.getClass(), "dispPlayerLv", -1344311431);
        setIntField(term316305, term316305.getClass(), "dispRating", -1239165871);
        setIntField(term316305, term316305.getClass(), "dispBP", -897368154);
        setIntField(term316305, term316305.getClass(), "headphone", -291634329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolFlick", argTypes, term316305, args);
    }

};


