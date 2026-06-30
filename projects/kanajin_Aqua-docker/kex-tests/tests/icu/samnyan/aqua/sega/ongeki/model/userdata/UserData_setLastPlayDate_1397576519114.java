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

public class UserData_setLastPlayDate_1397576519114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70508;

    public UserData_setLastPlayDate_1397576519114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70512 = new Long(-8121849829073967555L);
        term70508 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term70510 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70531 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70541 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70508, term70508.getClass(), "id", -7420758314888274572L);
        setLongField(term70510, term70510.getClass(), "id", 100921021167076044L);
        setField(term70510, term70510.getClass(), "extId", term70512);
        setField(term70510, term70510.getClass(), "luid", "vUVScKcyFY");
        setIntField(term70527, term70527.getClass(), "year", 2023);
        setShortField(term70527, term70527.getClass(), "month", (short) 5);
        setShortField(term70527, term70527.getClass(), "day", (short) 8);
        setField(term70526, term70526.getClass(), "date", term70527);
        setByteField(term70531, term70531.getClass(), "hour", (byte) 6);
        setByteField(term70531, term70531.getClass(), "minute", (byte) 35);
        setByteField(term70531, term70531.getClass(), "second", (byte) 9);
        setIntField(term70531, term70531.getClass(), "nano", 577816079);
        setField(term70526, term70526.getClass(), "time", term70531);
        setField(term70510, term70510.getClass(), "registerTime", term70526);
        setIntField(term70537, term70537.getClass(), "year", 2019);
        setShortField(term70537, term70537.getClass(), "month", (short) 12);
        setShortField(term70537, term70537.getClass(), "day", (short) 13);
        setField(term70536, term70536.getClass(), "date", term70537);
        setByteField(term70541, term70541.getClass(), "hour", (byte) 7);
        setByteField(term70541, term70541.getClass(), "minute", (byte) 59);
        setByteField(term70541, term70541.getClass(), "second", (byte) 40);
        setIntField(term70541, term70541.getClass(), "nano", 824164134);
        setField(term70536, term70536.getClass(), "time", term70541);
        setField(term70510, term70510.getClass(), "accessTime", term70536);
        setField(term70508, term70508.getClass(), "card", term70510);
        setField(term70508, term70508.getClass(), "userName", "DCSMbuGiaM");
        setIntField(term70508, term70508.getClass(), "level", -1351089042);
        setIntField(term70508, term70508.getClass(), "reincarnationNum", -368642982);
        setLongField(term70508, term70508.getClass(), "exp", 3172098761380472870L);
        setLongField(term70508, term70508.getClass(), "point", 2052550259156258390L);
        setLongField(term70508, term70508.getClass(), "totalPoint", -5876574528929327037L);
        setIntField(term70508, term70508.getClass(), "playCount", 1100435548);
        setIntField(term70508, term70508.getClass(), "jewelCount", 1930975280);
        setIntField(term70508, term70508.getClass(), "totalJewelCount", 1639113177);
        setIntField(term70508, term70508.getClass(), "medalCount", -1469393277);
        setIntField(term70508, term70508.getClass(), "playerRating", 1311573269);
        setIntField(term70508, term70508.getClass(), "highestRating", 1393744942);
        setIntField(term70508, term70508.getClass(), "battlePoint", 528056114);
        setIntField(term70508, term70508.getClass(), "bestBattlePoint", 1730452667);
        setIntField(term70508, term70508.getClass(), "overDamageBattlePoint", 760722690);
        setBooleanField(term70508, term70508.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term70508, term70508.getClass(), "nameplateId", -714009282);
        setIntField(term70508, term70508.getClass(), "trophyId", -1506023567);
        setIntField(term70508, term70508.getClass(), "cardId", 172275665);
        setIntField(term70508, term70508.getClass(), "characterId", 1472271840);
        setIntField(term70508, term70508.getClass(), "characterVoiceNo", -2050302351);
        setIntField(term70508, term70508.getClass(), "tabSetting", 1778549764);
        setIntField(term70508, term70508.getClass(), "tabSortSetting", 456140800);
        setIntField(term70508, term70508.getClass(), "cardCategorySetting", -80072701);
        setIntField(term70508, term70508.getClass(), "cardSortSetting", -224845635);
        setIntField(term70508, term70508.getClass(), "rivalScoreCategorySetting", 115902179);
        setIntField(term70508, term70508.getClass(), "playedTutorialBit", 930979700);
        setIntField(term70508, term70508.getClass(), "firstTutorialCancelNum", 630565003);
        setLongField(term70508, term70508.getClass(), "sumTechHighScore", 8591209862636160040L);
        setLongField(term70508, term70508.getClass(), "sumTechBasicHighScore", 1691040836532636814L);
        setLongField(term70508, term70508.getClass(), "sumTechAdvancedHighScore", 7590864789026672175L);
        setLongField(term70508, term70508.getClass(), "sumTechExpertHighScore", 3632403742038865944L);
        setLongField(term70508, term70508.getClass(), "sumTechMasterHighScore", -1737271237161382461L);
        setLongField(term70508, term70508.getClass(), "sumTechLunaticHighScore", -571195326224126202L);
        setLongField(term70508, term70508.getClass(), "sumBattleHighScore", -8020709571562405880L);
        setLongField(term70508, term70508.getClass(), "sumBattleBasicHighScore", -700859260902147176L);
        setLongField(term70508, term70508.getClass(), "sumBattleAdvancedHighScore", 284617033087386776L);
        setLongField(term70508, term70508.getClass(), "sumBattleExpertHighScore", -4845087189361950874L);
        setLongField(term70508, term70508.getClass(), "sumBattleMasterHighScore", 4793844777382062686L);
        setLongField(term70508, term70508.getClass(), "sumBattleLunaticHighScore", -8480921340301466389L);
        setField(term70508, term70508.getClass(), "eventWatchedDate", "wtOVzMPrFU");
        setField(term70508, term70508.getClass(), "cmEventWatchedDate", "CBnamgJrJS");
        setField(term70508, term70508.getClass(), "firstGameId", "uJhRRqAnDP");
        setField(term70508, term70508.getClass(), "firstRomVersion", "hJCqADrhuV");
        setField(term70508, term70508.getClass(), "firstDataVersion", "RyPUBlRpNZ");
        setField(term70508, term70508.getClass(), "firstPlayDate", "ardfVpCueq");
        setField(term70508, term70508.getClass(), "lastGameId", "wEYAmGJIEF");
        setField(term70508, term70508.getClass(), "lastRomVersion", "iXEhfXJomO");
        setField(term70508, term70508.getClass(), "lastDataVersion", "KEoUMzNdMA");
        setField(term70508, term70508.getClass(), "compatibleCmVersion", "SOsGYAgpgW");
        setField(term70508, term70508.getClass(), "lastPlayDate", "ZBafuLDRDM");
        setIntField(term70508, term70508.getClass(), "lastPlaceId", -1966988507);
        setField(term70508, term70508.getClass(), "lastPlaceName", "VDnsNuhEvG");
        setIntField(term70508, term70508.getClass(), "lastRegionId", -1089838622);
        setField(term70508, term70508.getClass(), "lastRegionName", "DMrfMwXyYT");
        setIntField(term70508, term70508.getClass(), "lastAllNetId", -937178869);
        setField(term70508, term70508.getClass(), "lastClientId", "GAzZvzjuXP");
        setIntField(term70508, term70508.getClass(), "lastUsedDeckId", -1952449836);
        setIntField(term70508, term70508.getClass(), "lastPlayMusicLevel", -405260008);
        setIntField(term70508, term70508.getClass(), "lastEmoneyBrand", -468459707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WoFrMqAUlT";
        callMethod(klass, "setLastPlayDate", argTypes, term70508, args);
    }

};


