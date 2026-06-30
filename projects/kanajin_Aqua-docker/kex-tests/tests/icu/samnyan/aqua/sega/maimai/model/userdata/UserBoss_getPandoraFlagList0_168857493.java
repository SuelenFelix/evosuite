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

public class UserBoss_getPandoraFlagList0_168857493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89769;

    public UserBoss_getPandoraFlagList0_168857493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89775 = new Long(-1526729287349763895L);
        term89769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term89771 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term89773 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89794 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89804 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89769, term89769.getClass(), "id", -932981811228171529L);
        setLongField(term89771, term89771.getClass(), "id", 5817794709356277010L);
        setLongField(term89773, term89773.getClass(), "id", -205762347192500511L);
        setField(term89773, term89773.getClass(), "extId", term89775);
        setField(term89773, term89773.getClass(), "luid", "TSogTVVlxc");
        setIntField(term89790, term89790.getClass(), "year", 2019);
        setShortField(term89790, term89790.getClass(), "month", (short) 7);
        setShortField(term89790, term89790.getClass(), "day", (short) 9);
        setField(term89789, term89789.getClass(), "date", term89790);
        setByteField(term89794, term89794.getClass(), "hour", (byte) 21);
        setByteField(term89794, term89794.getClass(), "minute", (byte) 37);
        setByteField(term89794, term89794.getClass(), "second", (byte) 42);
        setIntField(term89794, term89794.getClass(), "nano", 399935883);
        setField(term89789, term89789.getClass(), "time", term89794);
        setField(term89773, term89773.getClass(), "registerTime", term89789);
        setIntField(term89800, term89800.getClass(), "year", 2013);
        setShortField(term89800, term89800.getClass(), "month", (short) 9);
        setShortField(term89800, term89800.getClass(), "day", (short) 23);
        setField(term89799, term89799.getClass(), "date", term89800);
        setByteField(term89804, term89804.getClass(), "hour", (byte) 14);
        setByteField(term89804, term89804.getClass(), "minute", (byte) 21);
        setByteField(term89804, term89804.getClass(), "second", (byte) 30);
        setIntField(term89804, term89804.getClass(), "nano", 871245576);
        setField(term89799, term89799.getClass(), "time", term89804);
        setField(term89773, term89773.getClass(), "accessTime", term89799);
        setField(term89771, term89771.getClass(), "card", term89773);
        setIntField(term89771, term89771.getClass(), "lastDataVersion", -966923623);
        setField(term89771, term89771.getClass(), "userName", "kWEJlReukq");
        setIntField(term89771, term89771.getClass(), "point", -1827280492);
        setIntField(term89771, term89771.getClass(), "totalPoint", -540366977);
        setIntField(term89771, term89771.getClass(), "iconId", -87673396);
        setIntField(term89771, term89771.getClass(), "nameplateId", 854845151);
        setIntField(term89771, term89771.getClass(), "frameId", -427113243);
        setIntField(term89771, term89771.getClass(), "trophyId", 1884007720);
        setIntField(term89771, term89771.getClass(), "playCount", 444461504);
        setIntField(term89771, term89771.getClass(), "playVsCount", -723040972);
        setIntField(term89771, term89771.getClass(), "playSyncCount", -403619714);
        setIntField(term89771, term89771.getClass(), "winCount", 1083157942);
        setIntField(term89771, term89771.getClass(), "helpCount", 1032329767);
        setIntField(term89771, term89771.getClass(), "comboCount", 1878032322);
        setIntField(term89771, term89771.getClass(), "feverCount", 1027562263);
        setIntField(term89771, term89771.getClass(), "totalHiScore", -1444808827);
        setIntField(term89771, term89771.getClass(), "totalEasyHighScore", -1120740211);
        setIntField(term89771, term89771.getClass(), "totalBasicHighScore", 654951288);
        setIntField(term89771, term89771.getClass(), "totalAdvancedHighScore", 2139003917);
        setIntField(term89771, term89771.getClass(), "totalExpertHighScore", -88880251);
        setIntField(term89771, term89771.getClass(), "totalMasterHighScore", -1157773436);
        setIntField(term89771, term89771.getClass(), "totalReMasterHighScore", 237998332);
        setIntField(term89771, term89771.getClass(), "totalHighSync", 1398526783);
        setIntField(term89771, term89771.getClass(), "totalEasySync", -1335367347);
        setIntField(term89771, term89771.getClass(), "totalBasicSync", 378431284);
        setIntField(term89771, term89771.getClass(), "totalAdvancedSync", 1775630559);
        setIntField(term89771, term89771.getClass(), "totalExpertSync", 1511551801);
        setIntField(term89771, term89771.getClass(), "totalMasterSync", 910313590);
        setIntField(term89771, term89771.getClass(), "totalReMasterSync", -877418986);
        setIntField(term89771, term89771.getClass(), "playerRating", -336009454);
        setIntField(term89771, term89771.getClass(), "highestRating", -63641196);
        setIntField(term89771, term89771.getClass(), "rankAuthTailId", 1871287078);
        setField(term89771, term89771.getClass(), "eventWatchedDate", "jkCUxevJxb");
        setField(term89771, term89771.getClass(), "webLimitDate", "WqobQIRpLc");
        setIntField(term89771, term89771.getClass(), "challengeTrackPhase", 792196604);
        setIntField(term89771, term89771.getClass(), "firstPlayBits", -1306447464);
        setField(term89771, term89771.getClass(), "lastPlayDate", "jesZbitPYU");
        setIntField(term89771, term89771.getClass(), "lastPlaceId", -1027761764);
        setField(term89771, term89771.getClass(), "lastPlaceName", "oIbEvXxpda");
        setIntField(term89771, term89771.getClass(), "lastRegionId", 766326251);
        setField(term89771, term89771.getClass(), "lastRegionName", "QyHVDeaOqb");
        setField(term89771, term89771.getClass(), "lastClientId", "ZwnEWySrcE");
        setField(term89771, term89771.getClass(), "lastCountryCode", "laQWfyDqCq");
        setIntField(term89771, term89771.getClass(), "eventPoint", -557939372);
        setIntField(term89771, term89771.getClass(), "totalLv", 924802684);
        setIntField(term89771, term89771.getClass(), "lastLoginBonusDay", 647650611);
        setIntField(term89771, term89771.getClass(), "lastSurvivalBonusDay", 1830557897);
        setIntField(term89771, term89771.getClass(), "loginBonusLv", -1998060372);
        setField(term89769, term89769.getClass(), "user", term89771);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList0", -4987344934532917085L);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList1", 4832511106024339541L);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList2", 7840243516767232066L);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList3", -4069312743655862444L);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList4", 3233502115953753827L);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList5", -308461294344616496L);
        setLongField(term89769, term89769.getClass(), "pandoraFlagList6", -6325201865655646423L);
        setLongField(term89769, term89769.getClass(), "emblemFlagList", -9093996849713569099L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList0", argTypes, term89769, args);
    }

};


