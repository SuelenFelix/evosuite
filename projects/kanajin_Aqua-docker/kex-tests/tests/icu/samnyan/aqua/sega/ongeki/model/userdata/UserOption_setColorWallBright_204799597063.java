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

public class UserOption_setColorWallBright_204799597063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338024;
     Object term338326;

    public UserOption_setColorWallBright_204799597063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338030 = new Long(-1625372334693179543L);
        term338024 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term338026 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term338028 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term338044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338049 = newInstance(Class.forName("java.time.LocalTime"));
        Object term338054 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338055 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338059 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term338024, term338024.getClass(), "id", 5344655607004488565L);
        setLongField(term338026, term338026.getClass(), "id", 5955223148999863931L);
        setLongField(term338028, term338028.getClass(), "id", -7731308664393116149L);
        setField(term338028, term338028.getClass(), "extId", term338030);
        setField(term338028, term338028.getClass(), "luid", "CjaHCFNFLy");
        setIntField(term338045, term338045.getClass(), "year", 2024);
        setShortField(term338045, term338045.getClass(), "month", (short) 5);
        setShortField(term338045, term338045.getClass(), "day", (short) 16);
        setField(term338044, term338044.getClass(), "date", term338045);
        setByteField(term338049, term338049.getClass(), "hour", (byte) 12);
        setByteField(term338049, term338049.getClass(), "minute", (byte) 27);
        setByteField(term338049, term338049.getClass(), "second", (byte) 12);
        setIntField(term338049, term338049.getClass(), "nano", 36169190);
        setField(term338044, term338044.getClass(), "time", term338049);
        setField(term338028, term338028.getClass(), "registerTime", term338044);
        setIntField(term338055, term338055.getClass(), "year", 2016);
        setShortField(term338055, term338055.getClass(), "month", (short) 12);
        setShortField(term338055, term338055.getClass(), "day", (short) 12);
        setField(term338054, term338054.getClass(), "date", term338055);
        setByteField(term338059, term338059.getClass(), "hour", (byte) 8);
        setByteField(term338059, term338059.getClass(), "minute", (byte) 56);
        setByteField(term338059, term338059.getClass(), "second", (byte) 11);
        setIntField(term338059, term338059.getClass(), "nano", 369122424);
        setField(term338054, term338054.getClass(), "time", term338059);
        setField(term338028, term338028.getClass(), "accessTime", term338054);
        setField(term338026, term338026.getClass(), "card", term338028);
        setField(term338026, term338026.getClass(), "userName", "pNEupsZuho");
        setIntField(term338026, term338026.getClass(), "level", 654939125);
        setIntField(term338026, term338026.getClass(), "reincarnationNum", -181050374);
        setLongField(term338026, term338026.getClass(), "exp", 3878847892391303071L);
        setLongField(term338026, term338026.getClass(), "point", -5805929091369712308L);
        setLongField(term338026, term338026.getClass(), "totalPoint", 732108203691517019L);
        setIntField(term338026, term338026.getClass(), "playCount", -1640593630);
        setIntField(term338026, term338026.getClass(), "jewelCount", 828229199);
        setIntField(term338026, term338026.getClass(), "totalJewelCount", -1965482311);
        setIntField(term338026, term338026.getClass(), "medalCount", 1487520341);
        setIntField(term338026, term338026.getClass(), "playerRating", -189256083);
        setIntField(term338026, term338026.getClass(), "highestRating", 900531853);
        setIntField(term338026, term338026.getClass(), "battlePoint", 1114261872);
        setIntField(term338026, term338026.getClass(), "bestBattlePoint", 178923133);
        setIntField(term338026, term338026.getClass(), "overDamageBattlePoint", -1040323884);
        setBooleanField(term338026, term338026.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term338026, term338026.getClass(), "nameplateId", -2054995443);
        setIntField(term338026, term338026.getClass(), "trophyId", -745410596);
        setIntField(term338026, term338026.getClass(), "cardId", -1659601706);
        setIntField(term338026, term338026.getClass(), "characterId", 1066593925);
        setIntField(term338026, term338026.getClass(), "characterVoiceNo", 410244603);
        setIntField(term338026, term338026.getClass(), "tabSetting", -1139740732);
        setIntField(term338026, term338026.getClass(), "tabSortSetting", -445954688);
        setIntField(term338026, term338026.getClass(), "cardCategorySetting", 31159380);
        setIntField(term338026, term338026.getClass(), "cardSortSetting", -705686980);
        setIntField(term338026, term338026.getClass(), "rivalScoreCategorySetting", 247151624);
        setIntField(term338026, term338026.getClass(), "playedTutorialBit", -267605028);
        setIntField(term338026, term338026.getClass(), "firstTutorialCancelNum", 727341812);
        setLongField(term338026, term338026.getClass(), "sumTechHighScore", 5347921545665598057L);
        setLongField(term338026, term338026.getClass(), "sumTechBasicHighScore", -1692526037724194474L);
        setLongField(term338026, term338026.getClass(), "sumTechAdvancedHighScore", -2724636603400029607L);
        setLongField(term338026, term338026.getClass(), "sumTechExpertHighScore", -794613487535721763L);
        setLongField(term338026, term338026.getClass(), "sumTechMasterHighScore", 66963313663091235L);
        setLongField(term338026, term338026.getClass(), "sumTechLunaticHighScore", 7726623334965892287L);
        setLongField(term338026, term338026.getClass(), "sumBattleHighScore", 7169734014339425117L);
        setLongField(term338026, term338026.getClass(), "sumBattleBasicHighScore", 4832825308694533240L);
        setLongField(term338026, term338026.getClass(), "sumBattleAdvancedHighScore", 6517115679393324271L);
        setLongField(term338026, term338026.getClass(), "sumBattleExpertHighScore", 1773104293982159249L);
        setLongField(term338026, term338026.getClass(), "sumBattleMasterHighScore", 4328435734236957724L);
        setLongField(term338026, term338026.getClass(), "sumBattleLunaticHighScore", -9061559629769764794L);
        setField(term338026, term338026.getClass(), "eventWatchedDate", "teEGlMyNaC");
        setField(term338026, term338026.getClass(), "cmEventWatchedDate", "NPqOGRYocv");
        setField(term338026, term338026.getClass(), "firstGameId", "rNeGdEDCLq");
        setField(term338026, term338026.getClass(), "firstRomVersion", "UoeqhZaQMO");
        setField(term338026, term338026.getClass(), "firstDataVersion", "iOneQRYqVK");
        setField(term338026, term338026.getClass(), "firstPlayDate", "QsycCnUXzs");
        setField(term338026, term338026.getClass(), "lastGameId", "OEPuJLBIAz");
        setField(term338026, term338026.getClass(), "lastRomVersion", "XrRgFENXVB");
        setField(term338026, term338026.getClass(), "lastDataVersion", "QHVfUDKndG");
        setField(term338026, term338026.getClass(), "compatibleCmVersion", "AGVCeXTWgF");
        setField(term338026, term338026.getClass(), "lastPlayDate", "XDIngRfPbj");
        setIntField(term338026, term338026.getClass(), "lastPlaceId", 525010574);
        setField(term338026, term338026.getClass(), "lastPlaceName", "VKfQkROWNq");
        setIntField(term338026, term338026.getClass(), "lastRegionId", -158036747);
        setField(term338026, term338026.getClass(), "lastRegionName", "fNYrZWbZwm");
        setIntField(term338026, term338026.getClass(), "lastAllNetId", -12250546);
        setField(term338026, term338026.getClass(), "lastClientId", "mSrKiHvgFE");
        setIntField(term338026, term338026.getClass(), "lastUsedDeckId", -2116501663);
        setIntField(term338026, term338026.getClass(), "lastPlayMusicLevel", 1632271853);
        setIntField(term338026, term338026.getClass(), "lastEmoneyBrand", 1805074906);
        setField(term338024, term338024.getClass(), "user", term338026);
        setIntField(term338024, term338024.getClass(), "optionSet", 2132284996);
        setIntField(term338024, term338024.getClass(), "speed", 4737696);
        setIntField(term338024, term338024.getClass(), "mirror", 1027722296);
        setIntField(term338024, term338024.getClass(), "judgeTiming", -1827715109);
        setIntField(term338024, term338024.getClass(), "judgeAdjustment", 1523011703);
        setIntField(term338024, term338024.getClass(), "abort", -2003818838);
        setIntField(term338024, term338024.getClass(), "stealthField", -900115948);
        setIntField(term338024, term338024.getClass(), "tapSound", 431757828);
        setIntField(term338024, term338024.getClass(), "volGuide", 1406031216);
        setIntField(term338024, term338024.getClass(), "volAll", 1191169701);
        setIntField(term338024, term338024.getClass(), "volTap", 477092624);
        setIntField(term338024, term338024.getClass(), "volCrTap", 495595169);
        setIntField(term338024, term338024.getClass(), "volHold", -1082148274);
        setIntField(term338024, term338024.getClass(), "volSide", -584962475);
        setIntField(term338024, term338024.getClass(), "volFlick", -986629622);
        setIntField(term338024, term338024.getClass(), "volBell", 1491428812);
        setIntField(term338024, term338024.getClass(), "volEnemy", 1357324741);
        setIntField(term338024, term338024.getClass(), "volSkill", -429996847);
        setIntField(term338024, term338024.getClass(), "volDamage", 667928528);
        setIntField(term338024, term338024.getClass(), "colorField", 1739279686);
        setIntField(term338024, term338024.getClass(), "colorLaneBright", 2085655914);
        setIntField(term338024, term338024.getClass(), "colorWallBright", 897433209);
        setIntField(term338024, term338024.getClass(), "colorLane", -561731575);
        setIntField(term338024, term338024.getClass(), "colorSide", 1994214794);
        setIntField(term338024, term338024.getClass(), "effectDamage", 1091940141);
        setIntField(term338024, term338024.getClass(), "effectPos", -771802585);
        setIntField(term338024, term338024.getClass(), "judgeDisp", -455804842);
        setIntField(term338024, term338024.getClass(), "judgePos", 429921311);
        setIntField(term338024, term338024.getClass(), "judgeBreak", 827676453);
        setIntField(term338024, term338024.getClass(), "judgeHit", 1048915364);
        setIntField(term338024, term338024.getClass(), "platinumBreakDisp", -388477517);
        setIntField(term338024, term338024.getClass(), "judgeCriticalBreak", -1994993875);
        setIntField(term338024, term338024.getClass(), "matching", -566027885);
        setIntField(term338024, term338024.getClass(), "dispPlayerLv", -1584226980);
        setIntField(term338024, term338024.getClass(), "dispRating", -492887005);
        setIntField(term338024, term338024.getClass(), "dispBP", 1182666323);
        setIntField(term338024, term338024.getClass(), "headphone", 520575264);
        term338326 = new Integer(-1361437867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term338326;
        callMethod(klass, "setColorWallBright", argTypes, term338024, args);
    }

};


