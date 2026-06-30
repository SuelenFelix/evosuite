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

public class UserDetail_getPlayerOldRating_139643630974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236916;

    public UserDetail_getPlayerOldRating_139643630974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236920 = new Long(-1750555031444556464L);
        Integer term236983 = new Integer(1949719112);
        Integer term236985 = new Integer(203059697);
        ArrayList term236981 = new ArrayList();
        ((ArrayList) term236981).add(term236983);
        ((ArrayList) term236981).add(term236985);
        Integer term236991 = new Integer(260352378);
        Integer term236993 = new Integer(-1344061485);
        Integer term236995 = new Integer(-13926283);
        Integer term236997 = new Integer(-1240452164);
        Integer term236999 = new Integer(501130109);
        ArrayList term236989 = new ArrayList();
        ((ArrayList) term236989).add(term236991);
        ((ArrayList) term236989).add(term236993);
        ((ArrayList) term236989).add(term236995);
        ((ArrayList) term236989).add(term236997);
        ((ArrayList) term236989).add(term236999);
        term236916 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term236918 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term236934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term236944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236949 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term236916, term236916.getClass(), "id", 3451656753795950729L);
        setLongField(term236918, term236918.getClass(), "id", -2025271947530583319L);
        setField(term236918, term236918.getClass(), "extId", term236920);
        setField(term236918, term236918.getClass(), "luid", "hLGgJdPgBD");
        setIntField(term236935, term236935.getClass(), "year", 2024);
        setShortField(term236935, term236935.getClass(), "month", (short) 9);
        setShortField(term236935, term236935.getClass(), "day", (short) 8);
        setField(term236934, term236934.getClass(), "date", term236935);
        setByteField(term236939, term236939.getClass(), "hour", (byte) 6);
        setByteField(term236939, term236939.getClass(), "minute", (byte) 3);
        setByteField(term236939, term236939.getClass(), "second", (byte) 52);
        setIntField(term236939, term236939.getClass(), "nano", 511733450);
        setField(term236934, term236934.getClass(), "time", term236939);
        setField(term236918, term236918.getClass(), "registerTime", term236934);
        setIntField(term236945, term236945.getClass(), "year", 2015);
        setShortField(term236945, term236945.getClass(), "month", (short) 1);
        setShortField(term236945, term236945.getClass(), "day", (short) 25);
        setField(term236944, term236944.getClass(), "date", term236945);
        setByteField(term236949, term236949.getClass(), "hour", (byte) 16);
        setByteField(term236949, term236949.getClass(), "minute", (byte) 22);
        setByteField(term236949, term236949.getClass(), "second", (byte) 44);
        setIntField(term236949, term236949.getClass(), "nano", 980528775);
        setField(term236944, term236944.getClass(), "time", term236949);
        setField(term236918, term236918.getClass(), "accessTime", term236944);
        setField(term236916, term236916.getClass(), "card", term236918);
        setField(term236916, term236916.getClass(), "userName", "PEgWPuGHaR");
        setIntField(term236916, term236916.getClass(), "isNetMember", 1900299259);
        setIntField(term236916, term236916.getClass(), "iconId", 1790715750);
        setIntField(term236916, term236916.getClass(), "plateId", -2067996812);
        setIntField(term236916, term236916.getClass(), "titleId", -1904003203);
        setIntField(term236916, term236916.getClass(), "partnerId", -1001590126);
        setIntField(term236916, term236916.getClass(), "frameId", 610795811);
        setIntField(term236916, term236916.getClass(), "selectMapId", 234814998);
        setIntField(term236916, term236916.getClass(), "totalAwake", -656923286);
        setIntField(term236916, term236916.getClass(), "gradeRating", 1926273657);
        setIntField(term236916, term236916.getClass(), "musicRating", -630929648);
        setIntField(term236916, term236916.getClass(), "playerRating", -1137920676);
        setIntField(term236916, term236916.getClass(), "highestRating", -1645894833);
        setIntField(term236916, term236916.getClass(), "gradeRank", -283032317);
        setIntField(term236916, term236916.getClass(), "classRank", 974252215);
        setIntField(term236916, term236916.getClass(), "courseRank", -101411371);
        setField(term236916, term236916.getClass(), "charaSlot", term236981);
        setField(term236916, term236916.getClass(), "charaLockSlot", term236989);
        setLongField(term236916, term236916.getClass(), "contentBit", 4989432436602612061L);
        setIntField(term236916, term236916.getClass(), "playCount", -63876189);
        setField(term236916, term236916.getClass(), "eventWatchedDate", "eIRVRaUyle");
        setField(term236916, term236916.getClass(), "lastGameId", "biqUFWRvGE");
        setField(term236916, term236916.getClass(), "lastRomVersion", "iYCqUzLrAo");
        setField(term236916, term236916.getClass(), "lastDataVersion", "ZvqsamWXxh");
        setField(term236916, term236916.getClass(), "lastLoginDate", "byjpWhwFin");
        setField(term236916, term236916.getClass(), "lastPlayDate", "gGzrIgBnsE");
        setIntField(term236916, term236916.getClass(), "lastPlayCredit", 1742031166);
        setIntField(term236916, term236916.getClass(), "lastPlayMode", -1042732582);
        setIntField(term236916, term236916.getClass(), "lastPlaceId", -464887203);
        setField(term236916, term236916.getClass(), "lastPlaceName", "rATFFkwzYs");
        setIntField(term236916, term236916.getClass(), "lastAllNetId", -1046500542);
        setIntField(term236916, term236916.getClass(), "lastRegionId", 198419559);
        setField(term236916, term236916.getClass(), "lastRegionName", "jGxWetlEmL");
        setField(term236916, term236916.getClass(), "lastClientId", "cYTQwXvMdt");
        setField(term236916, term236916.getClass(), "lastCountryCode", "eVHqQrwHDN");
        setIntField(term236916, term236916.getClass(), "lastSelectEMoney", -187137059);
        setIntField(term236916, term236916.getClass(), "lastSelectTicket", 1785454510);
        setIntField(term236916, term236916.getClass(), "lastSelectCourse", 342838125);
        setIntField(term236916, term236916.getClass(), "lastCountCourse", 1139336608);
        setField(term236916, term236916.getClass(), "firstGameId", "ZMpwUjTPUn");
        setField(term236916, term236916.getClass(), "firstRomVersion", "kaMCFAtRdw");
        setField(term236916, term236916.getClass(), "firstDataVersion", "TNgREfoJmh");
        setField(term236916, term236916.getClass(), "firstPlayDate", "dwrZEejrHC");
        setField(term236916, term236916.getClass(), "compatibleCmVersion", "lzTUhpiGql");
        setField(term236916, term236916.getClass(), "dailyBonusDate", "BfYbWESTcb");
        setField(term236916, term236916.getClass(), "dailyCourseBonusDate", "zLcrvdaGyU");
        setField(term236916, term236916.getClass(), "lastPairLoginDate", "NrEYUPcqwP");
        setField(term236916, term236916.getClass(), "lastTrialPlayDate", "TGeszwaHRe");
        setIntField(term236916, term236916.getClass(), "playVsCount", 217987429);
        setIntField(term236916, term236916.getClass(), "playSyncCount", -1331001027);
        setIntField(term236916, term236916.getClass(), "winCount", 1191278613);
        setIntField(term236916, term236916.getClass(), "helpCount", -132996897);
        setIntField(term236916, term236916.getClass(), "comboCount", -698351557);
        setLongField(term236916, term236916.getClass(), "totalDeluxscore", 5187526989196108434L);
        setLongField(term236916, term236916.getClass(), "totalBasicDeluxscore", 8469386823554309861L);
        setLongField(term236916, term236916.getClass(), "totalAdvancedDeluxscore", 2664350413971897761L);
        setLongField(term236916, term236916.getClass(), "totalExpertDeluxscore", -5995726659766729424L);
        setLongField(term236916, term236916.getClass(), "totalMasterDeluxscore", 2739403678151874256L);
        setLongField(term236916, term236916.getClass(), "totalReMasterDeluxscore", 1240724700809231052L);
        setIntField(term236916, term236916.getClass(), "totalSync", 442187587);
        setIntField(term236916, term236916.getClass(), "totalBasicSync", 1002253912);
        setIntField(term236916, term236916.getClass(), "totalAdvancedSync", 1461361961);
        setIntField(term236916, term236916.getClass(), "totalExpertSync", -943692426);
        setIntField(term236916, term236916.getClass(), "totalMasterSync", 466240025);
        setIntField(term236916, term236916.getClass(), "totalReMasterSync", -2026987701);
        setLongField(term236916, term236916.getClass(), "totalAchievement", -1414076659621334961L);
        setLongField(term236916, term236916.getClass(), "totalBasicAchievement", 6458955920598156356L);
        setLongField(term236916, term236916.getClass(), "totalAdvancedAchievement", 6981892149075125479L);
        setLongField(term236916, term236916.getClass(), "totalExpertAchievement", 7869195612574467049L);
        setLongField(term236916, term236916.getClass(), "totalMasterAchievement", 2931307961626881889L);
        setLongField(term236916, term236916.getClass(), "totalReMasterAchievement", 2020069278494124501L);
        setLongField(term236916, term236916.getClass(), "playerOldRating", -8857346335490456537L);
        setLongField(term236916, term236916.getClass(), "playerNewRating", -3447344224257007572L);
        setIntField(term236916, term236916.getClass(), "banState", -889572864);
        setLongField(term236916, term236916.getClass(), "dateTime", 510000788174840108L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerOldRating", argTypes, term236916, args);
    }

};


