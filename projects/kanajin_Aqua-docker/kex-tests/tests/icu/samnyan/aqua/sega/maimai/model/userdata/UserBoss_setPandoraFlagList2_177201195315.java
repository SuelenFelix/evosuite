package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_setPandoraFlagList2_177201195315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93327;
     Object term93511;

    public UserBoss_setPandoraFlagList2_177201195315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93333 = new Long(-1964501434345816975L);
        term93327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term93329 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term93331 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93352 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93362 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term93327, term93327.getClass(), "id", -921066654455496205L);
        setLongField(term93329, term93329.getClass(), "id", 7622401904339010124L);
        setLongField(term93331, term93331.getClass(), "id", -761256632171362830L);
        setField(term93331, term93331.getClass(), "extId", term93333);
        setField(term93331, term93331.getClass(), "luid", "qDEvNqJeGg");
        setIntField(term93348, term93348.getClass(), "year", 2023);
        setShortField(term93348, term93348.getClass(), "month", (short) 7);
        setShortField(term93348, term93348.getClass(), "day", (short) 18);
        setField(term93347, term93347.getClass(), "date", term93348);
        setByteField(term93352, term93352.getClass(), "hour", (byte) 11);
        setByteField(term93352, term93352.getClass(), "minute", (byte) 33);
        setByteField(term93352, term93352.getClass(), "second", (byte) 28);
        setIntField(term93352, term93352.getClass(), "nano", 15208773);
        setField(term93347, term93347.getClass(), "time", term93352);
        setField(term93331, term93331.getClass(), "registerTime", term93347);
        setIntField(term93358, term93358.getClass(), "year", 2011);
        setShortField(term93358, term93358.getClass(), "month", (short) 11);
        setShortField(term93358, term93358.getClass(), "day", (short) 13);
        setField(term93357, term93357.getClass(), "date", term93358);
        setByteField(term93362, term93362.getClass(), "hour", (byte) 17);
        setByteField(term93362, term93362.getClass(), "minute", (byte) 43);
        setByteField(term93362, term93362.getClass(), "second", (byte) 47);
        setIntField(term93362, term93362.getClass(), "nano", 537140404);
        setField(term93357, term93357.getClass(), "time", term93362);
        setField(term93331, term93331.getClass(), "accessTime", term93357);
        setField(term93329, term93329.getClass(), "card", term93331);
        setIntField(term93329, term93329.getClass(), "lastDataVersion", 1853113749);
        setField(term93329, term93329.getClass(), "userName", "fUxWNxirZc");
        setIntField(term93329, term93329.getClass(), "point", -586438860);
        setIntField(term93329, term93329.getClass(), "totalPoint", -1602722865);
        setIntField(term93329, term93329.getClass(), "iconId", -1584130001);
        setIntField(term93329, term93329.getClass(), "nameplateId", -1669995376);
        setIntField(term93329, term93329.getClass(), "frameId", -684090418);
        setIntField(term93329, term93329.getClass(), "trophyId", 248781931);
        setIntField(term93329, term93329.getClass(), "playCount", 1444890082);
        setIntField(term93329, term93329.getClass(), "playVsCount", -463625508);
        setIntField(term93329, term93329.getClass(), "playSyncCount", 86106790);
        setIntField(term93329, term93329.getClass(), "winCount", -1239672206);
        setIntField(term93329, term93329.getClass(), "helpCount", -909873191);
        setIntField(term93329, term93329.getClass(), "comboCount", -17106495);
        setIntField(term93329, term93329.getClass(), "feverCount", -1205540932);
        setIntField(term93329, term93329.getClass(), "totalHiScore", -1477355747);
        setIntField(term93329, term93329.getClass(), "totalEasyHighScore", -1041405094);
        setIntField(term93329, term93329.getClass(), "totalBasicHighScore", -2004362129);
        setIntField(term93329, term93329.getClass(), "totalAdvancedHighScore", 1709267900);
        setIntField(term93329, term93329.getClass(), "totalExpertHighScore", -2036597343);
        setIntField(term93329, term93329.getClass(), "totalMasterHighScore", -988488193);
        setIntField(term93329, term93329.getClass(), "totalReMasterHighScore", -910318730);
        setIntField(term93329, term93329.getClass(), "totalHighSync", -1198085025);
        setIntField(term93329, term93329.getClass(), "totalEasySync", -1420655161);
        setIntField(term93329, term93329.getClass(), "totalBasicSync", 559777465);
        setIntField(term93329, term93329.getClass(), "totalAdvancedSync", 965262203);
        setIntField(term93329, term93329.getClass(), "totalExpertSync", 1569464081);
        setIntField(term93329, term93329.getClass(), "totalMasterSync", 1899979707);
        setIntField(term93329, term93329.getClass(), "totalReMasterSync", -379153640);
        setIntField(term93329, term93329.getClass(), "playerRating", 2059143976);
        setIntField(term93329, term93329.getClass(), "highestRating", -855871020);
        setIntField(term93329, term93329.getClass(), "rankAuthTailId", 294740259);
        setField(term93329, term93329.getClass(), "eventWatchedDate", "vHkrNjGRyv");
        setField(term93329, term93329.getClass(), "webLimitDate", "PxGAOnzJzj");
        setIntField(term93329, term93329.getClass(), "challengeTrackPhase", -843479862);
        setIntField(term93329, term93329.getClass(), "firstPlayBits", -1178581916);
        setField(term93329, term93329.getClass(), "lastPlayDate", "fQVSHtJlDS");
        setIntField(term93329, term93329.getClass(), "lastPlaceId", -1533008285);
        setField(term93329, term93329.getClass(), "lastPlaceName", "CGdXCWNTxp");
        setIntField(term93329, term93329.getClass(), "lastRegionId", -317721741);
        setField(term93329, term93329.getClass(), "lastRegionName", "TUBgEnrcjn");
        setField(term93329, term93329.getClass(), "lastClientId", "eUhEGNLBOk");
        setField(term93329, term93329.getClass(), "lastCountryCode", "UrLisdyvVs");
        setIntField(term93329, term93329.getClass(), "eventPoint", 603089761);
        setIntField(term93329, term93329.getClass(), "totalLv", 357209284);
        setIntField(term93329, term93329.getClass(), "lastLoginBonusDay", -1561404518);
        setIntField(term93329, term93329.getClass(), "lastSurvivalBonusDay", 1567499135);
        setIntField(term93329, term93329.getClass(), "loginBonusLv", 1468757593);
        setField(term93327, term93327.getClass(), "user", term93329);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList0", 6975846341920664143L);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList1", -7055293192926325895L);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList2", 9121171957554652661L);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList3", -2752058965354731489L);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList4", -4723024480537897669L);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList5", -8609587218393726408L);
        setLongField(term93327, term93327.getClass(), "pandoraFlagList6", 4133412897876628646L);
        setLongField(term93327, term93327.getClass(), "emblemFlagList", -4233021136506075526L);
        term93511 = new Long(9041534029896652168L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term93511;
        callMethod(klass, "setPandoraFlagList2", argTypes, term93327, args);
    }

};


