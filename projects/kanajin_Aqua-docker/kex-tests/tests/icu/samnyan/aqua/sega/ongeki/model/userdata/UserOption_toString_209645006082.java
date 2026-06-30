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

public class UserOption_toString_209645006082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346836;

    public UserOption_toString_209645006082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term346842 = new Long(-3189918180129674609L);
        term346836 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term346838 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term346840 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term346856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term346857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term346861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term346866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term346867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term346871 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term346836, term346836.getClass(), "id", -8731488415132336187L);
        setLongField(term346838, term346838.getClass(), "id", -6085198201598301631L);
        setLongField(term346840, term346840.getClass(), "id", 7301963313117007071L);
        setField(term346840, term346840.getClass(), "extId", term346842);
        setField(term346840, term346840.getClass(), "luid", "RNjghwhKMv");
        setIntField(term346857, term346857.getClass(), "year", 2027);
        setShortField(term346857, term346857.getClass(), "month", (short) 7);
        setShortField(term346857, term346857.getClass(), "day", (short) 11);
        setField(term346856, term346856.getClass(), "date", term346857);
        setByteField(term346861, term346861.getClass(), "hour", (byte) 7);
        setByteField(term346861, term346861.getClass(), "minute", (byte) 42);
        setByteField(term346861, term346861.getClass(), "second", (byte) 4);
        setIntField(term346861, term346861.getClass(), "nano", 413305212);
        setField(term346856, term346856.getClass(), "time", term346861);
        setField(term346840, term346840.getClass(), "registerTime", term346856);
        setIntField(term346867, term346867.getClass(), "year", 2028);
        setShortField(term346867, term346867.getClass(), "month", (short) 6);
        setShortField(term346867, term346867.getClass(), "day", (short) 1);
        setField(term346866, term346866.getClass(), "date", term346867);
        setByteField(term346871, term346871.getClass(), "hour", (byte) 17);
        setByteField(term346871, term346871.getClass(), "minute", (byte) 36);
        setByteField(term346871, term346871.getClass(), "second", (byte) 14);
        setIntField(term346871, term346871.getClass(), "nano", 720148114);
        setField(term346866, term346866.getClass(), "time", term346871);
        setField(term346840, term346840.getClass(), "accessTime", term346866);
        setField(term346838, term346838.getClass(), "card", term346840);
        setField(term346838, term346838.getClass(), "userName", "AHKPWwPudC");
        setIntField(term346838, term346838.getClass(), "level", 301052174);
        setIntField(term346838, term346838.getClass(), "reincarnationNum", 2000274401);
        setLongField(term346838, term346838.getClass(), "exp", -4714610137348988119L);
        setLongField(term346838, term346838.getClass(), "point", -5989357389217390475L);
        setLongField(term346838, term346838.getClass(), "totalPoint", 5173065035506806007L);
        setIntField(term346838, term346838.getClass(), "playCount", -183153357);
        setIntField(term346838, term346838.getClass(), "jewelCount", 668307877);
        setIntField(term346838, term346838.getClass(), "totalJewelCount", 171182801);
        setIntField(term346838, term346838.getClass(), "medalCount", 593745267);
        setIntField(term346838, term346838.getClass(), "playerRating", 541013710);
        setIntField(term346838, term346838.getClass(), "highestRating", 688722046);
        setIntField(term346838, term346838.getClass(), "battlePoint", 249793972);
        setIntField(term346838, term346838.getClass(), "bestBattlePoint", 333816720);
        setIntField(term346838, term346838.getClass(), "overDamageBattlePoint", -2051640470);
        setBooleanField(term346838, term346838.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term346838, term346838.getClass(), "nameplateId", -142464899);
        setIntField(term346838, term346838.getClass(), "trophyId", 1117462070);
        setIntField(term346838, term346838.getClass(), "cardId", -1920311829);
        setIntField(term346838, term346838.getClass(), "characterId", -1954858230);
        setIntField(term346838, term346838.getClass(), "characterVoiceNo", -439490837);
        setIntField(term346838, term346838.getClass(), "tabSetting", 685331555);
        setIntField(term346838, term346838.getClass(), "tabSortSetting", 792642048);
        setIntField(term346838, term346838.getClass(), "cardCategorySetting", 1999493710);
        setIntField(term346838, term346838.getClass(), "cardSortSetting", -290560126);
        setIntField(term346838, term346838.getClass(), "rivalScoreCategorySetting", -1970577082);
        setIntField(term346838, term346838.getClass(), "playedTutorialBit", 709559676);
        setIntField(term346838, term346838.getClass(), "firstTutorialCancelNum", 863852296);
        setLongField(term346838, term346838.getClass(), "sumTechHighScore", -8043412230775654251L);
        setLongField(term346838, term346838.getClass(), "sumTechBasicHighScore", -6326622641159071952L);
        setLongField(term346838, term346838.getClass(), "sumTechAdvancedHighScore", 4056699814096889412L);
        setLongField(term346838, term346838.getClass(), "sumTechExpertHighScore", 7316903220175356424L);
        setLongField(term346838, term346838.getClass(), "sumTechMasterHighScore", 2748124090074718333L);
        setLongField(term346838, term346838.getClass(), "sumTechLunaticHighScore", 2339074201001448197L);
        setLongField(term346838, term346838.getClass(), "sumBattleHighScore", -8612977742536801415L);
        setLongField(term346838, term346838.getClass(), "sumBattleBasicHighScore", -7286142587387916318L);
        setLongField(term346838, term346838.getClass(), "sumBattleAdvancedHighScore", 3543208172254068785L);
        setLongField(term346838, term346838.getClass(), "sumBattleExpertHighScore", 585259158038152117L);
        setLongField(term346838, term346838.getClass(), "sumBattleMasterHighScore", 3498506496610205729L);
        setLongField(term346838, term346838.getClass(), "sumBattleLunaticHighScore", 4421554459713196627L);
        setField(term346838, term346838.getClass(), "eventWatchedDate", "tfHdGSpPoN");
        setField(term346838, term346838.getClass(), "cmEventWatchedDate", "iRCkgboOiY");
        setField(term346838, term346838.getClass(), "firstGameId", "oFoQZwlVBE");
        setField(term346838, term346838.getClass(), "firstRomVersion", "yZCodaNzNC");
        setField(term346838, term346838.getClass(), "firstDataVersion", "TlcqCjHxcj");
        setField(term346838, term346838.getClass(), "firstPlayDate", "ZtPyUcWtFC");
        setField(term346838, term346838.getClass(), "lastGameId", "XowFyLxItD");
        setField(term346838, term346838.getClass(), "lastRomVersion", "mhOnFULYYA");
        setField(term346838, term346838.getClass(), "lastDataVersion", "xgwMhcXksS");
        setField(term346838, term346838.getClass(), "compatibleCmVersion", "QzNAiRwXIa");
        setField(term346838, term346838.getClass(), "lastPlayDate", "ekECwFihat");
        setIntField(term346838, term346838.getClass(), "lastPlaceId", 1030741880);
        setField(term346838, term346838.getClass(), "lastPlaceName", "sqDdAnOaqz");
        setIntField(term346838, term346838.getClass(), "lastRegionId", -1973659749);
        setField(term346838, term346838.getClass(), "lastRegionName", "DYccbStSmd");
        setIntField(term346838, term346838.getClass(), "lastAllNetId", 1096188636);
        setField(term346838, term346838.getClass(), "lastClientId", "yOMgsszETD");
        setIntField(term346838, term346838.getClass(), "lastUsedDeckId", -1862055409);
        setIntField(term346838, term346838.getClass(), "lastPlayMusicLevel", -122891076);
        setIntField(term346838, term346838.getClass(), "lastEmoneyBrand", -1797010488);
        setField(term346836, term346836.getClass(), "user", term346838);
        setIntField(term346836, term346836.getClass(), "optionSet", -51966893);
        setIntField(term346836, term346836.getClass(), "speed", 656605779);
        setIntField(term346836, term346836.getClass(), "mirror", 692323711);
        setIntField(term346836, term346836.getClass(), "judgeTiming", -1962279154);
        setIntField(term346836, term346836.getClass(), "judgeAdjustment", -1563948816);
        setIntField(term346836, term346836.getClass(), "abort", 1682916657);
        setIntField(term346836, term346836.getClass(), "stealthField", 2017903605);
        setIntField(term346836, term346836.getClass(), "tapSound", 1470564859);
        setIntField(term346836, term346836.getClass(), "volGuide", -1511800832);
        setIntField(term346836, term346836.getClass(), "volAll", -1619312632);
        setIntField(term346836, term346836.getClass(), "volTap", 562743900);
        setIntField(term346836, term346836.getClass(), "volCrTap", 667269667);
        setIntField(term346836, term346836.getClass(), "volHold", 668694192);
        setIntField(term346836, term346836.getClass(), "volSide", 2075164428);
        setIntField(term346836, term346836.getClass(), "volFlick", 2042022717);
        setIntField(term346836, term346836.getClass(), "volBell", -1102440689);
        setIntField(term346836, term346836.getClass(), "volEnemy", 1532052471);
        setIntField(term346836, term346836.getClass(), "volSkill", 604831066);
        setIntField(term346836, term346836.getClass(), "volDamage", -430882319);
        setIntField(term346836, term346836.getClass(), "colorField", 323404404);
        setIntField(term346836, term346836.getClass(), "colorLaneBright", -677331278);
        setIntField(term346836, term346836.getClass(), "colorWallBright", -1626758581);
        setIntField(term346836, term346836.getClass(), "colorLane", 147670886);
        setIntField(term346836, term346836.getClass(), "colorSide", 1280026535);
        setIntField(term346836, term346836.getClass(), "effectDamage", 1525803536);
        setIntField(term346836, term346836.getClass(), "effectPos", 354074636);
        setIntField(term346836, term346836.getClass(), "judgeDisp", 185167650);
        setIntField(term346836, term346836.getClass(), "judgePos", -2136232368);
        setIntField(term346836, term346836.getClass(), "judgeBreak", -798751697);
        setIntField(term346836, term346836.getClass(), "judgeHit", -1648269458);
        setIntField(term346836, term346836.getClass(), "platinumBreakDisp", -1603211128);
        setIntField(term346836, term346836.getClass(), "judgeCriticalBreak", 39740509);
        setIntField(term346836, term346836.getClass(), "matching", 1539578631);
        setIntField(term346836, term346836.getClass(), "dispPlayerLv", 1077781754);
        setIntField(term346836, term346836.getClass(), "dispRating", 456106074);
        setIntField(term346836, term346836.getClass(), "dispBP", -1795304646);
        setIntField(term346836, term346836.getClass(), "headphone", 1964870534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term346836, args);
    }

};


