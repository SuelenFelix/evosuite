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

public class UserActivity_setActivityId_199131713113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288765;
     Object term289037;

    public UserActivity_setActivityId_199131713113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term288771 = new Long(-5455716707538294699L);
        term288765 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term288767 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term288769 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term288785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288790 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288800 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term288765, term288765.getClass(), "id", 6100283712098109581L);
        setLongField(term288767, term288767.getClass(), "id", 10030395830130943L);
        setLongField(term288769, term288769.getClass(), "id", 4646259887503586465L);
        setField(term288769, term288769.getClass(), "extId", term288771);
        setField(term288769, term288769.getClass(), "luid", "FvDAlgSUBA");
        setIntField(term288786, term288786.getClass(), "year", 2012);
        setShortField(term288786, term288786.getClass(), "month", (short) 4);
        setShortField(term288786, term288786.getClass(), "day", (short) 1);
        setField(term288785, term288785.getClass(), "date", term288786);
        setByteField(term288790, term288790.getClass(), "hour", (byte) 22);
        setByteField(term288790, term288790.getClass(), "minute", (byte) 13);
        setByteField(term288790, term288790.getClass(), "second", (byte) 37);
        setIntField(term288790, term288790.getClass(), "nano", 378844188);
        setField(term288785, term288785.getClass(), "time", term288790);
        setField(term288769, term288769.getClass(), "registerTime", term288785);
        setIntField(term288796, term288796.getClass(), "year", 2025);
        setShortField(term288796, term288796.getClass(), "month", (short) 2);
        setShortField(term288796, term288796.getClass(), "day", (short) 8);
        setField(term288795, term288795.getClass(), "date", term288796);
        setByteField(term288800, term288800.getClass(), "hour", (byte) 9);
        setByteField(term288800, term288800.getClass(), "minute", (byte) 56);
        setByteField(term288800, term288800.getClass(), "second", (byte) 54);
        setIntField(term288800, term288800.getClass(), "nano", 637995977);
        setField(term288795, term288795.getClass(), "time", term288800);
        setField(term288769, term288769.getClass(), "accessTime", term288795);
        setField(term288767, term288767.getClass(), "card", term288769);
        setField(term288767, term288767.getClass(), "userName", "RSpTPOOWxv");
        setIntField(term288767, term288767.getClass(), "level", -841536999);
        setIntField(term288767, term288767.getClass(), "reincarnationNum", 1407954932);
        setLongField(term288767, term288767.getClass(), "exp", 6486917670168832945L);
        setLongField(term288767, term288767.getClass(), "point", 3345235033311921203L);
        setLongField(term288767, term288767.getClass(), "totalPoint", 7496916237329438634L);
        setIntField(term288767, term288767.getClass(), "playCount", -973933888);
        setIntField(term288767, term288767.getClass(), "jewelCount", 1428792658);
        setIntField(term288767, term288767.getClass(), "totalJewelCount", -1972890664);
        setIntField(term288767, term288767.getClass(), "medalCount", 966570906);
        setIntField(term288767, term288767.getClass(), "playerRating", -785176151);
        setIntField(term288767, term288767.getClass(), "highestRating", 1314779063);
        setIntField(term288767, term288767.getClass(), "battlePoint", -264007193);
        setIntField(term288767, term288767.getClass(), "bestBattlePoint", 288344148);
        setIntField(term288767, term288767.getClass(), "overDamageBattlePoint", 1458940265);
        setBooleanField(term288767, term288767.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term288767, term288767.getClass(), "nameplateId", -1681163759);
        setIntField(term288767, term288767.getClass(), "trophyId", -2045024263);
        setIntField(term288767, term288767.getClass(), "cardId", 1341904631);
        setIntField(term288767, term288767.getClass(), "characterId", -1166656746);
        setIntField(term288767, term288767.getClass(), "characterVoiceNo", 940545009);
        setIntField(term288767, term288767.getClass(), "tabSetting", -445026599);
        setIntField(term288767, term288767.getClass(), "tabSortSetting", -1873952688);
        setIntField(term288767, term288767.getClass(), "cardCategorySetting", 398208102);
        setIntField(term288767, term288767.getClass(), "cardSortSetting", 550633126);
        setIntField(term288767, term288767.getClass(), "rivalScoreCategorySetting", -811128951);
        setIntField(term288767, term288767.getClass(), "playedTutorialBit", 1667521403);
        setIntField(term288767, term288767.getClass(), "firstTutorialCancelNum", 1607799155);
        setLongField(term288767, term288767.getClass(), "sumTechHighScore", 176732844838228069L);
        setLongField(term288767, term288767.getClass(), "sumTechBasicHighScore", -4597435189430523418L);
        setLongField(term288767, term288767.getClass(), "sumTechAdvancedHighScore", 6986863125598079471L);
        setLongField(term288767, term288767.getClass(), "sumTechExpertHighScore", 7621294783561835559L);
        setLongField(term288767, term288767.getClass(), "sumTechMasterHighScore", -6615615287453618038L);
        setLongField(term288767, term288767.getClass(), "sumTechLunaticHighScore", -8957708629724390155L);
        setLongField(term288767, term288767.getClass(), "sumBattleHighScore", 6025360403451059344L);
        setLongField(term288767, term288767.getClass(), "sumBattleBasicHighScore", -8930211785571951642L);
        setLongField(term288767, term288767.getClass(), "sumBattleAdvancedHighScore", 6214938785591607011L);
        setLongField(term288767, term288767.getClass(), "sumBattleExpertHighScore", 8829839818701993503L);
        setLongField(term288767, term288767.getClass(), "sumBattleMasterHighScore", 3883316868552080142L);
        setLongField(term288767, term288767.getClass(), "sumBattleLunaticHighScore", -5509438852933292262L);
        setField(term288767, term288767.getClass(), "eventWatchedDate", "mJAIaSwRTZ");
        setField(term288767, term288767.getClass(), "cmEventWatchedDate", "SHSHsYUaOc");
        setField(term288767, term288767.getClass(), "firstGameId", "jXMTXHvttw");
        setField(term288767, term288767.getClass(), "firstRomVersion", "WOqkLnLgei");
        setField(term288767, term288767.getClass(), "firstDataVersion", "xiCFEluOSq");
        setField(term288767, term288767.getClass(), "firstPlayDate", "EDeReFiqFY");
        setField(term288767, term288767.getClass(), "lastGameId", "uWHxeGcEwu");
        setField(term288767, term288767.getClass(), "lastRomVersion", "GVkEKlhcrr");
        setField(term288767, term288767.getClass(), "lastDataVersion", "uNKWJhnHHl");
        setField(term288767, term288767.getClass(), "compatibleCmVersion", "wjhYcpvRUu");
        setField(term288767, term288767.getClass(), "lastPlayDate", "YqeXdoWJfV");
        setIntField(term288767, term288767.getClass(), "lastPlaceId", -1097890387);
        setField(term288767, term288767.getClass(), "lastPlaceName", "qEABplGAwB");
        setIntField(term288767, term288767.getClass(), "lastRegionId", -2032608082);
        setField(term288767, term288767.getClass(), "lastRegionName", "crdvuBefUh");
        setIntField(term288767, term288767.getClass(), "lastAllNetId", -1996651147);
        setField(term288767, term288767.getClass(), "lastClientId", "DmSGIaLFxy");
        setIntField(term288767, term288767.getClass(), "lastUsedDeckId", 1884511938);
        setIntField(term288767, term288767.getClass(), "lastPlayMusicLevel", 395389544);
        setIntField(term288767, term288767.getClass(), "lastEmoneyBrand", -190908885);
        setField(term288765, term288765.getClass(), "user", term288767);
        setIntField(term288765, term288765.getClass(), "kind", 1911297520);
        setIntField(term288765, term288765.getClass(), "activityId", -225566847);
        setIntField(term288765, term288765.getClass(), "sortNumber", 444454670);
        setIntField(term288765, term288765.getClass(), "param1", -509189366);
        setIntField(term288765, term288765.getClass(), "param2", 844615014);
        setIntField(term288765, term288765.getClass(), "param3", -1020310512);
        setIntField(term288765, term288765.getClass(), "param4", -782250781);
        term289037 = new Integer(1073429923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289037;
        callMethod(klass, "setActivityId", argTypes, term288765, args);
    }

};


