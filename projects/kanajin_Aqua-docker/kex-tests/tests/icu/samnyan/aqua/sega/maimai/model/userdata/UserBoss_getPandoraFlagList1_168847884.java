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

public class UserBoss_getPandoraFlagList1_168847884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90043;

    public UserBoss_getPandoraFlagList1_168847884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90049 = new Long(7017605765544766728L);
        term90043 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term90045 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term90047 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90068 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90078 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90043, term90043.getClass(), "id", -1234885562462779381L);
        setLongField(term90045, term90045.getClass(), "id", 2678845111978352940L);
        setLongField(term90047, term90047.getClass(), "id", 873013799050926004L);
        setField(term90047, term90047.getClass(), "extId", term90049);
        setField(term90047, term90047.getClass(), "luid", "gMFGfpbPZE");
        setIntField(term90064, term90064.getClass(), "year", 2013);
        setShortField(term90064, term90064.getClass(), "month", (short) 4);
        setShortField(term90064, term90064.getClass(), "day", (short) 26);
        setField(term90063, term90063.getClass(), "date", term90064);
        setByteField(term90068, term90068.getClass(), "hour", (byte) 11);
        setByteField(term90068, term90068.getClass(), "minute", (byte) 7);
        setByteField(term90068, term90068.getClass(), "second", (byte) 42);
        setIntField(term90068, term90068.getClass(), "nano", 202198585);
        setField(term90063, term90063.getClass(), "time", term90068);
        setField(term90047, term90047.getClass(), "registerTime", term90063);
        setIntField(term90074, term90074.getClass(), "year", 2010);
        setShortField(term90074, term90074.getClass(), "month", (short) 1);
        setShortField(term90074, term90074.getClass(), "day", (short) 11);
        setField(term90073, term90073.getClass(), "date", term90074);
        setByteField(term90078, term90078.getClass(), "hour", (byte) 23);
        setByteField(term90078, term90078.getClass(), "minute", (byte) 36);
        setByteField(term90078, term90078.getClass(), "second", (byte) 37);
        setIntField(term90078, term90078.getClass(), "nano", 947768655);
        setField(term90073, term90073.getClass(), "time", term90078);
        setField(term90047, term90047.getClass(), "accessTime", term90073);
        setField(term90045, term90045.getClass(), "card", term90047);
        setIntField(term90045, term90045.getClass(), "lastDataVersion", 567825669);
        setField(term90045, term90045.getClass(), "userName", "QcfydYbOGP");
        setIntField(term90045, term90045.getClass(), "point", -119885836);
        setIntField(term90045, term90045.getClass(), "totalPoint", 698701205);
        setIntField(term90045, term90045.getClass(), "iconId", 733986936);
        setIntField(term90045, term90045.getClass(), "nameplateId", -1752207831);
        setIntField(term90045, term90045.getClass(), "frameId", -1175000933);
        setIntField(term90045, term90045.getClass(), "trophyId", -1090683004);
        setIntField(term90045, term90045.getClass(), "playCount", 1077547795);
        setIntField(term90045, term90045.getClass(), "playVsCount", -287532994);
        setIntField(term90045, term90045.getClass(), "playSyncCount", -224320349);
        setIntField(term90045, term90045.getClass(), "winCount", -526888962);
        setIntField(term90045, term90045.getClass(), "helpCount", -23497981);
        setIntField(term90045, term90045.getClass(), "comboCount", -1204518409);
        setIntField(term90045, term90045.getClass(), "feverCount", 1564920368);
        setIntField(term90045, term90045.getClass(), "totalHiScore", 380619960);
        setIntField(term90045, term90045.getClass(), "totalEasyHighScore", 2032116097);
        setIntField(term90045, term90045.getClass(), "totalBasicHighScore", -1529610099);
        setIntField(term90045, term90045.getClass(), "totalAdvancedHighScore", 101565487);
        setIntField(term90045, term90045.getClass(), "totalExpertHighScore", -1974519039);
        setIntField(term90045, term90045.getClass(), "totalMasterHighScore", 2093268279);
        setIntField(term90045, term90045.getClass(), "totalReMasterHighScore", -197188292);
        setIntField(term90045, term90045.getClass(), "totalHighSync", 1982258363);
        setIntField(term90045, term90045.getClass(), "totalEasySync", -2134281126);
        setIntField(term90045, term90045.getClass(), "totalBasicSync", -1023001269);
        setIntField(term90045, term90045.getClass(), "totalAdvancedSync", 2123871728);
        setIntField(term90045, term90045.getClass(), "totalExpertSync", 687921602);
        setIntField(term90045, term90045.getClass(), "totalMasterSync", -848859060);
        setIntField(term90045, term90045.getClass(), "totalReMasterSync", 276568220);
        setIntField(term90045, term90045.getClass(), "playerRating", -434766528);
        setIntField(term90045, term90045.getClass(), "highestRating", 1954430952);
        setIntField(term90045, term90045.getClass(), "rankAuthTailId", 1603606390);
        setField(term90045, term90045.getClass(), "eventWatchedDate", "FdMzwKizAk");
        setField(term90045, term90045.getClass(), "webLimitDate", "jjwHVTqCkP");
        setIntField(term90045, term90045.getClass(), "challengeTrackPhase", -234709686);
        setIntField(term90045, term90045.getClass(), "firstPlayBits", -550885989);
        setField(term90045, term90045.getClass(), "lastPlayDate", "uUAkxSFPyL");
        setIntField(term90045, term90045.getClass(), "lastPlaceId", 1661591466);
        setField(term90045, term90045.getClass(), "lastPlaceName", "XfzbAdTaCO");
        setIntField(term90045, term90045.getClass(), "lastRegionId", -375409691);
        setField(term90045, term90045.getClass(), "lastRegionName", "rDcGfVDmsE");
        setField(term90045, term90045.getClass(), "lastClientId", "agspBqCjgG");
        setField(term90045, term90045.getClass(), "lastCountryCode", "HMJaeNiTNW");
        setIntField(term90045, term90045.getClass(), "eventPoint", 975944827);
        setIntField(term90045, term90045.getClass(), "totalLv", 880513984);
        setIntField(term90045, term90045.getClass(), "lastLoginBonusDay", -846950202);
        setIntField(term90045, term90045.getClass(), "lastSurvivalBonusDay", -109407576);
        setIntField(term90045, term90045.getClass(), "loginBonusLv", -2104308132);
        setField(term90043, term90043.getClass(), "user", term90045);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList0", 132446939133186077L);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList1", 4369503082568083627L);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList2", -1148001666040486410L);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList3", -2097210721190032076L);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList4", -3022442322233520981L);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList5", -8735757853649335051L);
        setLongField(term90043, term90043.getClass(), "pandoraFlagList6", 7016651719770171901L);
        setLongField(term90043, term90043.getClass(), "emblemFlagList", 7777131569376571611L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList1", argTypes, term90043, args);
    }

};


