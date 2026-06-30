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

public class UserMissionPoint_setId_7222511295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8599;
     Object term8866;

    public UserMissionPoint_setId_7222511295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8605 = new Long(8428634514691209827L);
        term8599 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term8601 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term8603 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8634 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8599, term8599.getClass(), "id", 9214973322210954344L);
        setLongField(term8601, term8601.getClass(), "id", 3662777917800385964L);
        setLongField(term8603, term8603.getClass(), "id", -7005300544167632229L);
        setField(term8603, term8603.getClass(), "extId", term8605);
        setField(term8603, term8603.getClass(), "luid", "nRvKihUSPj");
        setIntField(term8620, term8620.getClass(), "year", 2015);
        setShortField(term8620, term8620.getClass(), "month", (short) 12);
        setShortField(term8620, term8620.getClass(), "day", (short) 23);
        setField(term8619, term8619.getClass(), "date", term8620);
        setByteField(term8624, term8624.getClass(), "hour", (byte) 14);
        setByteField(term8624, term8624.getClass(), "minute", (byte) 17);
        setByteField(term8624, term8624.getClass(), "second", (byte) 50);
        setIntField(term8624, term8624.getClass(), "nano", 325544804);
        setField(term8619, term8619.getClass(), "time", term8624);
        setField(term8603, term8603.getClass(), "registerTime", term8619);
        setIntField(term8630, term8630.getClass(), "year", 2027);
        setShortField(term8630, term8630.getClass(), "month", (short) 11);
        setShortField(term8630, term8630.getClass(), "day", (short) 8);
        setField(term8629, term8629.getClass(), "date", term8630);
        setByteField(term8634, term8634.getClass(), "hour", (byte) 11);
        setByteField(term8634, term8634.getClass(), "minute", (byte) 59);
        setByteField(term8634, term8634.getClass(), "second", (byte) 14);
        setIntField(term8634, term8634.getClass(), "nano", 322375591);
        setField(term8629, term8629.getClass(), "time", term8634);
        setField(term8603, term8603.getClass(), "accessTime", term8629);
        setField(term8601, term8601.getClass(), "card", term8603);
        setField(term8601, term8601.getClass(), "userName", "BbNeQJpYPr");
        setIntField(term8601, term8601.getClass(), "level", -1244386281);
        setIntField(term8601, term8601.getClass(), "reincarnationNum", -885788574);
        setLongField(term8601, term8601.getClass(), "exp", -278716491237139968L);
        setLongField(term8601, term8601.getClass(), "point", -629491722907628764L);
        setLongField(term8601, term8601.getClass(), "totalPoint", -5552123402871285352L);
        setIntField(term8601, term8601.getClass(), "playCount", -865722613);
        setIntField(term8601, term8601.getClass(), "jewelCount", -1551355284);
        setIntField(term8601, term8601.getClass(), "totalJewelCount", -1381970335);
        setIntField(term8601, term8601.getClass(), "medalCount", 1213549815);
        setIntField(term8601, term8601.getClass(), "playerRating", -1518419301);
        setIntField(term8601, term8601.getClass(), "highestRating", 674879025);
        setIntField(term8601, term8601.getClass(), "battlePoint", -1538936030);
        setIntField(term8601, term8601.getClass(), "bestBattlePoint", -752870423);
        setIntField(term8601, term8601.getClass(), "overDamageBattlePoint", -1698809299);
        setBooleanField(term8601, term8601.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term8601, term8601.getClass(), "nameplateId", 401512128);
        setIntField(term8601, term8601.getClass(), "trophyId", -2069930777);
        setIntField(term8601, term8601.getClass(), "cardId", 1543696412);
        setIntField(term8601, term8601.getClass(), "characterId", -1385748168);
        setIntField(term8601, term8601.getClass(), "characterVoiceNo", -270592367);
        setIntField(term8601, term8601.getClass(), "tabSetting", 178847646);
        setIntField(term8601, term8601.getClass(), "tabSortSetting", 273590437);
        setIntField(term8601, term8601.getClass(), "cardCategorySetting", -348612876);
        setIntField(term8601, term8601.getClass(), "cardSortSetting", 1302807565);
        setIntField(term8601, term8601.getClass(), "rivalScoreCategorySetting", -838848221);
        setIntField(term8601, term8601.getClass(), "playedTutorialBit", 1163761623);
        setIntField(term8601, term8601.getClass(), "firstTutorialCancelNum", 718742281);
        setLongField(term8601, term8601.getClass(), "sumTechHighScore", -5587528177305224828L);
        setLongField(term8601, term8601.getClass(), "sumTechBasicHighScore", 7950532649535587877L);
        setLongField(term8601, term8601.getClass(), "sumTechAdvancedHighScore", 7799452759993694308L);
        setLongField(term8601, term8601.getClass(), "sumTechExpertHighScore", -1571034605670661708L);
        setLongField(term8601, term8601.getClass(), "sumTechMasterHighScore", -7983954942068142191L);
        setLongField(term8601, term8601.getClass(), "sumTechLunaticHighScore", 2274723545906746965L);
        setLongField(term8601, term8601.getClass(), "sumBattleHighScore", 1353683663053784647L);
        setLongField(term8601, term8601.getClass(), "sumBattleBasicHighScore", -1465819833800717311L);
        setLongField(term8601, term8601.getClass(), "sumBattleAdvancedHighScore", -8306611953768020559L);
        setLongField(term8601, term8601.getClass(), "sumBattleExpertHighScore", -8692119547314358088L);
        setLongField(term8601, term8601.getClass(), "sumBattleMasterHighScore", -2083524977884307536L);
        setLongField(term8601, term8601.getClass(), "sumBattleLunaticHighScore", -2691996476200751382L);
        setField(term8601, term8601.getClass(), "eventWatchedDate", "riMtzCoxNj");
        setField(term8601, term8601.getClass(), "cmEventWatchedDate", "YAXkVjQZcV");
        setField(term8601, term8601.getClass(), "firstGameId", "pumvwBWvpy");
        setField(term8601, term8601.getClass(), "firstRomVersion", "HwLHeGLyhe");
        setField(term8601, term8601.getClass(), "firstDataVersion", "RDnkgWkcbz");
        setField(term8601, term8601.getClass(), "firstPlayDate", "IBpaxltauX");
        setField(term8601, term8601.getClass(), "lastGameId", "hePqROaplw");
        setField(term8601, term8601.getClass(), "lastRomVersion", "PJcSNDruWd");
        setField(term8601, term8601.getClass(), "lastDataVersion", "VVNNlAePXF");
        setField(term8601, term8601.getClass(), "compatibleCmVersion", "jnwVnmKAFv");
        setField(term8601, term8601.getClass(), "lastPlayDate", "TXyHhqeCjR");
        setIntField(term8601, term8601.getClass(), "lastPlaceId", 1532723756);
        setField(term8601, term8601.getClass(), "lastPlaceName", "lZIgPZPgTu");
        setIntField(term8601, term8601.getClass(), "lastRegionId", -124088550);
        setField(term8601, term8601.getClass(), "lastRegionName", "iuCxnHGMoW");
        setIntField(term8601, term8601.getClass(), "lastAllNetId", 777492093);
        setField(term8601, term8601.getClass(), "lastClientId", "GPSEWEDSTo");
        setIntField(term8601, term8601.getClass(), "lastUsedDeckId", 1414025609);
        setIntField(term8601, term8601.getClass(), "lastPlayMusicLevel", 255145822);
        setIntField(term8601, term8601.getClass(), "lastEmoneyBrand", -573608449);
        setField(term8599, term8599.getClass(), "user", term8601);
        setIntField(term8599, term8599.getClass(), "eventId", -1660057757);
        setLongField(term8599, term8599.getClass(), "point", -3806202176947356197L);
        term8866 = new Long(-5534222035915952617L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8866;
        callMethod(klass, "setId", argTypes, term8599, args);
    }

};


