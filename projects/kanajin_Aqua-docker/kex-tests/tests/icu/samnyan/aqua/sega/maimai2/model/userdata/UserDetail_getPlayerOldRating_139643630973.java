package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getPlayerOldRating_139643630973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236861;

    public UserDetail_getPlayerOldRating_139643630973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236865 = new Long(-1750555031444556464L);
        Integer term236928 = new Integer(1949719112);
        Integer term236930 = new Integer(203059697);
        ArrayList term236926 = new ArrayList();
        ((ArrayList) term236926).add(term236928);
        ((ArrayList) term236926).add(term236930);
        Integer term236936 = new Integer(260352378);
        Integer term236938 = new Integer(-1344061485);
        Integer term236940 = new Integer(-13926283);
        Integer term236942 = new Integer(-1240452164);
        Integer term236944 = new Integer(501130109);
        ArrayList term236934 = new ArrayList();
        ((ArrayList) term236934).add(term236936);
        ((ArrayList) term236934).add(term236938);
        ((ArrayList) term236934).add(term236940);
        ((ArrayList) term236934).add(term236942);
        ((ArrayList) term236934).add(term236944);
        term236861 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term236863 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term236879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term236889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236894 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term236861, term236861.getClass(), "id", 3451656753795950729L);
        setLongField(term236863, term236863.getClass(), "id", -2025271947530583319L);
        setField(term236863, term236863.getClass(), "extId", term236865);
        setField(term236863, term236863.getClass(), "luid", "hLGgJdPgBD");
        setIntField(term236880, term236880.getClass(), "year", 2024);
        setShortField(term236880, term236880.getClass(), "month", (short) 9);
        setShortField(term236880, term236880.getClass(), "day", (short) 8);
        setField(term236879, term236879.getClass(), "date", term236880);
        setByteField(term236884, term236884.getClass(), "hour", (byte) 6);
        setByteField(term236884, term236884.getClass(), "minute", (byte) 3);
        setByteField(term236884, term236884.getClass(), "second", (byte) 52);
        setIntField(term236884, term236884.getClass(), "nano", 511733450);
        setField(term236879, term236879.getClass(), "time", term236884);
        setField(term236863, term236863.getClass(), "registerTime", term236879);
        setIntField(term236890, term236890.getClass(), "year", 2015);
        setShortField(term236890, term236890.getClass(), "month", (short) 1);
        setShortField(term236890, term236890.getClass(), "day", (short) 25);
        setField(term236889, term236889.getClass(), "date", term236890);
        setByteField(term236894, term236894.getClass(), "hour", (byte) 16);
        setByteField(term236894, term236894.getClass(), "minute", (byte) 22);
        setByteField(term236894, term236894.getClass(), "second", (byte) 44);
        setIntField(term236894, term236894.getClass(), "nano", 980528775);
        setField(term236889, term236889.getClass(), "time", term236894);
        setField(term236863, term236863.getClass(), "accessTime", term236889);
        setField(term236861, term236861.getClass(), "card", term236863);
        setField(term236861, term236861.getClass(), "userName", "PEgWPuGHaR");
        setIntField(term236861, term236861.getClass(), "isNetMember", 1900299259);
        setIntField(term236861, term236861.getClass(), "iconId", 1790715750);
        setIntField(term236861, term236861.getClass(), "plateId", -2067996812);
        setIntField(term236861, term236861.getClass(), "titleId", -1904003203);
        setIntField(term236861, term236861.getClass(), "partnerId", -1001590126);
        setIntField(term236861, term236861.getClass(), "frameId", 610795811);
        setIntField(term236861, term236861.getClass(), "selectMapId", 234814998);
        setIntField(term236861, term236861.getClass(), "totalAwake", -656923286);
        setIntField(term236861, term236861.getClass(), "gradeRating", 1926273657);
        setIntField(term236861, term236861.getClass(), "musicRating", -630929648);
        setIntField(term236861, term236861.getClass(), "playerRating", -1137920676);
        setIntField(term236861, term236861.getClass(), "highestRating", -1645894833);
        setIntField(term236861, term236861.getClass(), "gradeRank", -283032317);
        setIntField(term236861, term236861.getClass(), "classRank", 974252215);
        setIntField(term236861, term236861.getClass(), "courseRank", -101411371);
        setField(term236861, term236861.getClass(), "charaSlot", term236926);
        setField(term236861, term236861.getClass(), "charaLockSlot", term236934);
        setLongField(term236861, term236861.getClass(), "contentBit", 4989432436602612061L);
        setIntField(term236861, term236861.getClass(), "playCount", -63876189);
        setField(term236861, term236861.getClass(), "eventWatchedDate", "eIRVRaUyle");
        setField(term236861, term236861.getClass(), "lastGameId", "biqUFWRvGE");
        setField(term236861, term236861.getClass(), "lastRomVersion", "iYCqUzLrAo");
        setField(term236861, term236861.getClass(), "lastDataVersion", "ZvqsamWXxh");
        setField(term236861, term236861.getClass(), "lastLoginDate", "byjpWhwFin");
        setField(term236861, term236861.getClass(), "lastPlayDate", "gGzrIgBnsE");
        setIntField(term236861, term236861.getClass(), "lastPlayCredit", 1742031166);
        setIntField(term236861, term236861.getClass(), "lastPlayMode", -1042732582);
        setIntField(term236861, term236861.getClass(), "lastPlaceId", -464887203);
        setField(term236861, term236861.getClass(), "lastPlaceName", "rATFFkwzYs");
        setIntField(term236861, term236861.getClass(), "lastAllNetId", -1046500542);
        setIntField(term236861, term236861.getClass(), "lastRegionId", 198419559);
        setField(term236861, term236861.getClass(), "lastRegionName", "jGxWetlEmL");
        setField(term236861, term236861.getClass(), "lastClientId", "cYTQwXvMdt");
        setField(term236861, term236861.getClass(), "lastCountryCode", "eVHqQrwHDN");
        setIntField(term236861, term236861.getClass(), "lastSelectEMoney", -187137059);
        setIntField(term236861, term236861.getClass(), "lastSelectTicket", 1785454510);
        setIntField(term236861, term236861.getClass(), "lastSelectCourse", 342838125);
        setIntField(term236861, term236861.getClass(), "lastCountCourse", 1139336608);
        setField(term236861, term236861.getClass(), "firstGameId", "ZMpwUjTPUn");
        setField(term236861, term236861.getClass(), "firstRomVersion", "kaMCFAtRdw");
        setField(term236861, term236861.getClass(), "firstDataVersion", "TNgREfoJmh");
        setField(term236861, term236861.getClass(), "firstPlayDate", "dwrZEejrHC");
        setField(term236861, term236861.getClass(), "compatibleCmVersion", "lzTUhpiGql");
        setField(term236861, term236861.getClass(), "dailyBonusDate", "BfYbWESTcb");
        setField(term236861, term236861.getClass(), "dailyCourseBonusDate", "zLcrvdaGyU");
        setField(term236861, term236861.getClass(), "lastPairLoginDate", "NrEYUPcqwP");
        setField(term236861, term236861.getClass(), "lastTrialPlayDate", "TGeszwaHRe");
        setIntField(term236861, term236861.getClass(), "playVsCount", 217987429);
        setIntField(term236861, term236861.getClass(), "playSyncCount", -1331001027);
        setIntField(term236861, term236861.getClass(), "winCount", 1191278613);
        setIntField(term236861, term236861.getClass(), "helpCount", -132996897);
        setIntField(term236861, term236861.getClass(), "comboCount", -698351557);
        setLongField(term236861, term236861.getClass(), "totalDeluxscore", 5187526989196108434L);
        setLongField(term236861, term236861.getClass(), "totalBasicDeluxscore", 8469386823554309861L);
        setLongField(term236861, term236861.getClass(), "totalAdvancedDeluxscore", 2664350413971897761L);
        setLongField(term236861, term236861.getClass(), "totalExpertDeluxscore", -5995726659766729424L);
        setLongField(term236861, term236861.getClass(), "totalMasterDeluxscore", 2739403678151874256L);
        setLongField(term236861, term236861.getClass(), "totalReMasterDeluxscore", 1240724700809231052L);
        setIntField(term236861, term236861.getClass(), "totalSync", 442187587);
        setIntField(term236861, term236861.getClass(), "totalBasicSync", 1002253912);
        setIntField(term236861, term236861.getClass(), "totalAdvancedSync", 1461361961);
        setIntField(term236861, term236861.getClass(), "totalExpertSync", -943692426);
        setIntField(term236861, term236861.getClass(), "totalMasterSync", 466240025);
        setIntField(term236861, term236861.getClass(), "totalReMasterSync", -2026987701);
        setLongField(term236861, term236861.getClass(), "totalAchievement", -1414076659621334961L);
        setLongField(term236861, term236861.getClass(), "totalBasicAchievement", 6458955920598156356L);
        setLongField(term236861, term236861.getClass(), "totalAdvancedAchievement", 6981892149075125479L);
        setLongField(term236861, term236861.getClass(), "totalExpertAchievement", 7869195612574467049L);
        setLongField(term236861, term236861.getClass(), "totalMasterAchievement", 2931307961626881889L);
        setLongField(term236861, term236861.getClass(), "totalReMasterAchievement", 2020069278494124501L);
        setLongField(term236861, term236861.getClass(), "playerOldRating", -8857346335490456537L);
        setLongField(term236861, term236861.getClass(), "playerNewRating", -3447344224257007572L);
        setIntField(term236861, term236861.getClass(), "banState", -889572864);
        setLongField(term236861, term236861.getClass(), "dateTime", 510000788174840108L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerOldRating", argTypes, term236861, args);
    }

};


