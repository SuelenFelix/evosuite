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

public class UserBoss_setEmblemFlagList_135273612620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94707;
     Object term94891;

    public UserBoss_setEmblemFlagList_135273612620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94713 = new Long(-3033337370154155851L);
        term94707 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term94709 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term94711 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94742 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94707, term94707.getClass(), "id", -6893173979797141349L);
        setLongField(term94709, term94709.getClass(), "id", 8849217995403029606L);
        setLongField(term94711, term94711.getClass(), "id", 2179437725582700997L);
        setField(term94711, term94711.getClass(), "extId", term94713);
        setField(term94711, term94711.getClass(), "luid", "hpvoFaAyIu");
        setIntField(term94728, term94728.getClass(), "year", 2011);
        setShortField(term94728, term94728.getClass(), "month", (short) 12);
        setShortField(term94728, term94728.getClass(), "day", (short) 10);
        setField(term94727, term94727.getClass(), "date", term94728);
        setByteField(term94732, term94732.getClass(), "hour", (byte) 13);
        setByteField(term94732, term94732.getClass(), "minute", (byte) 50);
        setByteField(term94732, term94732.getClass(), "second", (byte) 43);
        setIntField(term94732, term94732.getClass(), "nano", 632619706);
        setField(term94727, term94727.getClass(), "time", term94732);
        setField(term94711, term94711.getClass(), "registerTime", term94727);
        setIntField(term94738, term94738.getClass(), "year", 2016);
        setShortField(term94738, term94738.getClass(), "month", (short) 9);
        setShortField(term94738, term94738.getClass(), "day", (short) 16);
        setField(term94737, term94737.getClass(), "date", term94738);
        setByteField(term94742, term94742.getClass(), "hour", (byte) 16);
        setByteField(term94742, term94742.getClass(), "minute", (byte) 33);
        setByteField(term94742, term94742.getClass(), "second", (byte) 2);
        setIntField(term94742, term94742.getClass(), "nano", 767888558);
        setField(term94737, term94737.getClass(), "time", term94742);
        setField(term94711, term94711.getClass(), "accessTime", term94737);
        setField(term94709, term94709.getClass(), "card", term94711);
        setIntField(term94709, term94709.getClass(), "lastDataVersion", 1102379330);
        setField(term94709, term94709.getClass(), "userName", "dyqukIBJxC");
        setIntField(term94709, term94709.getClass(), "point", -1473411882);
        setIntField(term94709, term94709.getClass(), "totalPoint", 1302685636);
        setIntField(term94709, term94709.getClass(), "iconId", -1202675628);
        setIntField(term94709, term94709.getClass(), "nameplateId", -117044732);
        setIntField(term94709, term94709.getClass(), "frameId", -912545932);
        setIntField(term94709, term94709.getClass(), "trophyId", -323859);
        setIntField(term94709, term94709.getClass(), "playCount", 181699558);
        setIntField(term94709, term94709.getClass(), "playVsCount", -258863944);
        setIntField(term94709, term94709.getClass(), "playSyncCount", 634023528);
        setIntField(term94709, term94709.getClass(), "winCount", -1426549826);
        setIntField(term94709, term94709.getClass(), "helpCount", 1932134326);
        setIntField(term94709, term94709.getClass(), "comboCount", -909738839);
        setIntField(term94709, term94709.getClass(), "feverCount", 271645048);
        setIntField(term94709, term94709.getClass(), "totalHiScore", 1234306330);
        setIntField(term94709, term94709.getClass(), "totalEasyHighScore", 146827683);
        setIntField(term94709, term94709.getClass(), "totalBasicHighScore", 347724024);
        setIntField(term94709, term94709.getClass(), "totalAdvancedHighScore", 1273746652);
        setIntField(term94709, term94709.getClass(), "totalExpertHighScore", 1282163721);
        setIntField(term94709, term94709.getClass(), "totalMasterHighScore", 603248870);
        setIntField(term94709, term94709.getClass(), "totalReMasterHighScore", -1909045622);
        setIntField(term94709, term94709.getClass(), "totalHighSync", -390781407);
        setIntField(term94709, term94709.getClass(), "totalEasySync", -1039337265);
        setIntField(term94709, term94709.getClass(), "totalBasicSync", -685914213);
        setIntField(term94709, term94709.getClass(), "totalAdvancedSync", 1920458051);
        setIntField(term94709, term94709.getClass(), "totalExpertSync", -1153940656);
        setIntField(term94709, term94709.getClass(), "totalMasterSync", 963396922);
        setIntField(term94709, term94709.getClass(), "totalReMasterSync", -1975824255);
        setIntField(term94709, term94709.getClass(), "playerRating", 191239283);
        setIntField(term94709, term94709.getClass(), "highestRating", 367335503);
        setIntField(term94709, term94709.getClass(), "rankAuthTailId", -1858156484);
        setField(term94709, term94709.getClass(), "eventWatchedDate", "MVMiGQdgnX");
        setField(term94709, term94709.getClass(), "webLimitDate", "cQnJIENJHe");
        setIntField(term94709, term94709.getClass(), "challengeTrackPhase", 1629598973);
        setIntField(term94709, term94709.getClass(), "firstPlayBits", 26411664);
        setField(term94709, term94709.getClass(), "lastPlayDate", "ExjdCvAxlG");
        setIntField(term94709, term94709.getClass(), "lastPlaceId", 1791622790);
        setField(term94709, term94709.getClass(), "lastPlaceName", "moMySSiBuB");
        setIntField(term94709, term94709.getClass(), "lastRegionId", -1666988360);
        setField(term94709, term94709.getClass(), "lastRegionName", "iuuazALDWB");
        setField(term94709, term94709.getClass(), "lastClientId", "GqehccUels");
        setField(term94709, term94709.getClass(), "lastCountryCode", "llbDGujrPe");
        setIntField(term94709, term94709.getClass(), "eventPoint", 1304377188);
        setIntField(term94709, term94709.getClass(), "totalLv", 348283942);
        setIntField(term94709, term94709.getClass(), "lastLoginBonusDay", 776006341);
        setIntField(term94709, term94709.getClass(), "lastSurvivalBonusDay", 1145867680);
        setIntField(term94709, term94709.getClass(), "loginBonusLv", 1382995321);
        setField(term94707, term94707.getClass(), "user", term94709);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList0", 808761243947256536L);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList1", 5841040494527118725L);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList2", 5535938323123427777L);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList3", 1292632924316952683L);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList4", 2896485328388781986L);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList5", 54468717425932218L);
        setLongField(term94707, term94707.getClass(), "pandoraFlagList6", 5860114696949347386L);
        setLongField(term94707, term94707.getClass(), "emblemFlagList", 3415381732664403599L);
        term94891 = new Long(3853271903861685327L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term94891;
        callMethod(klass, "setEmblemFlagList", argTypes, term94707, args);
    }

};


