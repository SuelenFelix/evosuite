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
import java.lang.Boolean;

public class UserData_setDialogWatchedSuggestMemory_62511919579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55433;
     Object term55696;

    public UserData_setDialogWatchedSuggestMemory_62511919579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55437 = new Long(-6432617521836576658L);
        term55433 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term55435 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55466 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55433, term55433.getClass(), "id", -6952791032114194905L);
        setLongField(term55435, term55435.getClass(), "id", -2341380687381948599L);
        setField(term55435, term55435.getClass(), "extId", term55437);
        setField(term55435, term55435.getClass(), "luid", "DwpOIkpRFT");
        setIntField(term55452, term55452.getClass(), "year", 2013);
        setShortField(term55452, term55452.getClass(), "month", (short) 9);
        setShortField(term55452, term55452.getClass(), "day", (short) 27);
        setField(term55451, term55451.getClass(), "date", term55452);
        setByteField(term55456, term55456.getClass(), "hour", (byte) 9);
        setByteField(term55456, term55456.getClass(), "minute", (byte) 30);
        setByteField(term55456, term55456.getClass(), "second", (byte) 6);
        setIntField(term55456, term55456.getClass(), "nano", 647438502);
        setField(term55451, term55451.getClass(), "time", term55456);
        setField(term55435, term55435.getClass(), "registerTime", term55451);
        setIntField(term55462, term55462.getClass(), "year", 2021);
        setShortField(term55462, term55462.getClass(), "month", (short) 10);
        setShortField(term55462, term55462.getClass(), "day", (short) 16);
        setField(term55461, term55461.getClass(), "date", term55462);
        setByteField(term55466, term55466.getClass(), "hour", (byte) 5);
        setByteField(term55466, term55466.getClass(), "minute", (byte) 6);
        setByteField(term55466, term55466.getClass(), "second", (byte) 17);
        setIntField(term55466, term55466.getClass(), "nano", 631786532);
        setField(term55461, term55461.getClass(), "time", term55466);
        setField(term55435, term55435.getClass(), "accessTime", term55461);
        setField(term55433, term55433.getClass(), "card", term55435);
        setField(term55433, term55433.getClass(), "userName", "LPlTDoLrUy");
        setIntField(term55433, term55433.getClass(), "level", 275958841);
        setIntField(term55433, term55433.getClass(), "reincarnationNum", 1628668899);
        setLongField(term55433, term55433.getClass(), "exp", -7871012741246584386L);
        setLongField(term55433, term55433.getClass(), "point", 4814035531351879181L);
        setLongField(term55433, term55433.getClass(), "totalPoint", 1939660974143295045L);
        setIntField(term55433, term55433.getClass(), "playCount", -998305335);
        setIntField(term55433, term55433.getClass(), "jewelCount", 2120008602);
        setIntField(term55433, term55433.getClass(), "totalJewelCount", 1085966764);
        setIntField(term55433, term55433.getClass(), "medalCount", -609882960);
        setIntField(term55433, term55433.getClass(), "playerRating", -1690283734);
        setIntField(term55433, term55433.getClass(), "highestRating", -1620783951);
        setIntField(term55433, term55433.getClass(), "battlePoint", 1400387811);
        setIntField(term55433, term55433.getClass(), "bestBattlePoint", 903826116);
        setIntField(term55433, term55433.getClass(), "overDamageBattlePoint", 641366348);
        setBooleanField(term55433, term55433.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term55433, term55433.getClass(), "nameplateId", -353276989);
        setIntField(term55433, term55433.getClass(), "trophyId", -505563323);
        setIntField(term55433, term55433.getClass(), "cardId", -2087065864);
        setIntField(term55433, term55433.getClass(), "characterId", -169812741);
        setIntField(term55433, term55433.getClass(), "characterVoiceNo", -1015119737);
        setIntField(term55433, term55433.getClass(), "tabSetting", 1479117665);
        setIntField(term55433, term55433.getClass(), "tabSortSetting", 766065097);
        setIntField(term55433, term55433.getClass(), "cardCategorySetting", 1703658250);
        setIntField(term55433, term55433.getClass(), "cardSortSetting", -942615253);
        setIntField(term55433, term55433.getClass(), "rivalScoreCategorySetting", 1642227506);
        setIntField(term55433, term55433.getClass(), "playedTutorialBit", -1930855861);
        setIntField(term55433, term55433.getClass(), "firstTutorialCancelNum", -59278290);
        setLongField(term55433, term55433.getClass(), "sumTechHighScore", -2240386714187527144L);
        setLongField(term55433, term55433.getClass(), "sumTechBasicHighScore", 3524743556565317852L);
        setLongField(term55433, term55433.getClass(), "sumTechAdvancedHighScore", -6550059544186211121L);
        setLongField(term55433, term55433.getClass(), "sumTechExpertHighScore", -3035941748055157425L);
        setLongField(term55433, term55433.getClass(), "sumTechMasterHighScore", 4511007950410890732L);
        setLongField(term55433, term55433.getClass(), "sumTechLunaticHighScore", 4662333912633380472L);
        setLongField(term55433, term55433.getClass(), "sumBattleHighScore", 6951012907724798081L);
        setLongField(term55433, term55433.getClass(), "sumBattleBasicHighScore", 1454269751791376609L);
        setLongField(term55433, term55433.getClass(), "sumBattleAdvancedHighScore", 2124910767108105788L);
        setLongField(term55433, term55433.getClass(), "sumBattleExpertHighScore", 7080612204208157613L);
        setLongField(term55433, term55433.getClass(), "sumBattleMasterHighScore", -5251321271779688724L);
        setLongField(term55433, term55433.getClass(), "sumBattleLunaticHighScore", -2563454768051334217L);
        setField(term55433, term55433.getClass(), "eventWatchedDate", "XETimBHIKG");
        setField(term55433, term55433.getClass(), "cmEventWatchedDate", "nOKVZSyfbZ");
        setField(term55433, term55433.getClass(), "firstGameId", "adHZFgDoEH");
        setField(term55433, term55433.getClass(), "firstRomVersion", "vjNETNMDhQ");
        setField(term55433, term55433.getClass(), "firstDataVersion", "pexqQqwSNj");
        setField(term55433, term55433.getClass(), "firstPlayDate", "myfXkIEBSV");
        setField(term55433, term55433.getClass(), "lastGameId", "LSrqDVjzEP");
        setField(term55433, term55433.getClass(), "lastRomVersion", "CPZCLJxTuA");
        setField(term55433, term55433.getClass(), "lastDataVersion", "ivAOXnVjmg");
        setField(term55433, term55433.getClass(), "compatibleCmVersion", "FivesaUeHG");
        setField(term55433, term55433.getClass(), "lastPlayDate", "TnpXhZmCRY");
        setIntField(term55433, term55433.getClass(), "lastPlaceId", 862799975);
        setField(term55433, term55433.getClass(), "lastPlaceName", "ECVAXFhrTP");
        setIntField(term55433, term55433.getClass(), "lastRegionId", 785517219);
        setField(term55433, term55433.getClass(), "lastRegionName", "ypytdNbrBc");
        setIntField(term55433, term55433.getClass(), "lastAllNetId", -96163747);
        setField(term55433, term55433.getClass(), "lastClientId", "XvrJCOSYei");
        setIntField(term55433, term55433.getClass(), "lastUsedDeckId", 1191473962);
        setIntField(term55433, term55433.getClass(), "lastPlayMusicLevel", 110101710);
        setIntField(term55433, term55433.getClass(), "lastEmoneyBrand", 1819101781);
        term55696 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term55696;
        callMethod(klass, "setDialogWatchedSuggestMemory", argTypes, term55433, args);
    }

};


