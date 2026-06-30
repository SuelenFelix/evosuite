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

public class UserBoss_getPandoraFlagList2_168838275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90317;

    public UserBoss_getPandoraFlagList2_168838275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90323 = new Long(-6078481855513028760L);
        term90317 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term90319 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term90321 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90342 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90352 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90317, term90317.getClass(), "id", -2792969772767139843L);
        setLongField(term90319, term90319.getClass(), "id", 6313343355456678206L);
        setLongField(term90321, term90321.getClass(), "id", -8901826621860118061L);
        setField(term90321, term90321.getClass(), "extId", term90323);
        setField(term90321, term90321.getClass(), "luid", "ggcJNlLcZb");
        setIntField(term90338, term90338.getClass(), "year", 2020);
        setShortField(term90338, term90338.getClass(), "month", (short) 8);
        setShortField(term90338, term90338.getClass(), "day", (short) 9);
        setField(term90337, term90337.getClass(), "date", term90338);
        setByteField(term90342, term90342.getClass(), "hour", (byte) 2);
        setByteField(term90342, term90342.getClass(), "minute", (byte) 25);
        setByteField(term90342, term90342.getClass(), "second", (byte) 38);
        setIntField(term90342, term90342.getClass(), "nano", 447739818);
        setField(term90337, term90337.getClass(), "time", term90342);
        setField(term90321, term90321.getClass(), "registerTime", term90337);
        setIntField(term90348, term90348.getClass(), "year", 2026);
        setShortField(term90348, term90348.getClass(), "month", (short) 2);
        setShortField(term90348, term90348.getClass(), "day", (short) 28);
        setField(term90347, term90347.getClass(), "date", term90348);
        setByteField(term90352, term90352.getClass(), "hour", (byte) 19);
        setByteField(term90352, term90352.getClass(), "minute", (byte) 20);
        setByteField(term90352, term90352.getClass(), "second", (byte) 45);
        setIntField(term90352, term90352.getClass(), "nano", 843222042);
        setField(term90347, term90347.getClass(), "time", term90352);
        setField(term90321, term90321.getClass(), "accessTime", term90347);
        setField(term90319, term90319.getClass(), "card", term90321);
        setIntField(term90319, term90319.getClass(), "lastDataVersion", 1163850867);
        setField(term90319, term90319.getClass(), "userName", "EzhvjUZCQP");
        setIntField(term90319, term90319.getClass(), "point", -37175334);
        setIntField(term90319, term90319.getClass(), "totalPoint", 657697442);
        setIntField(term90319, term90319.getClass(), "iconId", 1692013158);
        setIntField(term90319, term90319.getClass(), "nameplateId", 1102246253);
        setIntField(term90319, term90319.getClass(), "frameId", -551112117);
        setIntField(term90319, term90319.getClass(), "trophyId", -1391764319);
        setIntField(term90319, term90319.getClass(), "playCount", -37130270);
        setIntField(term90319, term90319.getClass(), "playVsCount", -1868643949);
        setIntField(term90319, term90319.getClass(), "playSyncCount", -83450776);
        setIntField(term90319, term90319.getClass(), "winCount", -1598054225);
        setIntField(term90319, term90319.getClass(), "helpCount", 2121939630);
        setIntField(term90319, term90319.getClass(), "comboCount", 1336739947);
        setIntField(term90319, term90319.getClass(), "feverCount", 1393305038);
        setIntField(term90319, term90319.getClass(), "totalHiScore", 2110534824);
        setIntField(term90319, term90319.getClass(), "totalEasyHighScore", -67895231);
        setIntField(term90319, term90319.getClass(), "totalBasicHighScore", 275822795);
        setIntField(term90319, term90319.getClass(), "totalAdvancedHighScore", 1508399117);
        setIntField(term90319, term90319.getClass(), "totalExpertHighScore", -228155380);
        setIntField(term90319, term90319.getClass(), "totalMasterHighScore", -2124766997);
        setIntField(term90319, term90319.getClass(), "totalReMasterHighScore", 1133047506);
        setIntField(term90319, term90319.getClass(), "totalHighSync", 2126443403);
        setIntField(term90319, term90319.getClass(), "totalEasySync", 907419926);
        setIntField(term90319, term90319.getClass(), "totalBasicSync", 1410218337);
        setIntField(term90319, term90319.getClass(), "totalAdvancedSync", -1548487396);
        setIntField(term90319, term90319.getClass(), "totalExpertSync", -1092864344);
        setIntField(term90319, term90319.getClass(), "totalMasterSync", 909432589);
        setIntField(term90319, term90319.getClass(), "totalReMasterSync", -803102599);
        setIntField(term90319, term90319.getClass(), "playerRating", 1911613745);
        setIntField(term90319, term90319.getClass(), "highestRating", -1397218525);
        setIntField(term90319, term90319.getClass(), "rankAuthTailId", -878133799);
        setField(term90319, term90319.getClass(), "eventWatchedDate", "FTHebphiPR");
        setField(term90319, term90319.getClass(), "webLimitDate", "OQjMPmyJQz");
        setIntField(term90319, term90319.getClass(), "challengeTrackPhase", -1097564879);
        setIntField(term90319, term90319.getClass(), "firstPlayBits", 531804989);
        setField(term90319, term90319.getClass(), "lastPlayDate", "FZQimBsMNt");
        setIntField(term90319, term90319.getClass(), "lastPlaceId", 606449083);
        setField(term90319, term90319.getClass(), "lastPlaceName", "lowANLpXCV");
        setIntField(term90319, term90319.getClass(), "lastRegionId", -84390184);
        setField(term90319, term90319.getClass(), "lastRegionName", "orjiIcUIcD");
        setField(term90319, term90319.getClass(), "lastClientId", "lGzFueHQqZ");
        setField(term90319, term90319.getClass(), "lastCountryCode", "cjiDFHGGlp");
        setIntField(term90319, term90319.getClass(), "eventPoint", 1107966197);
        setIntField(term90319, term90319.getClass(), "totalLv", -987871994);
        setIntField(term90319, term90319.getClass(), "lastLoginBonusDay", 810730521);
        setIntField(term90319, term90319.getClass(), "lastSurvivalBonusDay", 231201522);
        setIntField(term90319, term90319.getClass(), "loginBonusLv", -1299754463);
        setField(term90317, term90317.getClass(), "user", term90319);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList0", 2947576061864407618L);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList1", 7265006047025305787L);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList2", -3323049156110984575L);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList3", -9079706905309751984L);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList4", -2080067238602928154L);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList5", 8202413349907503373L);
        setLongField(term90317, term90317.getClass(), "pandoraFlagList6", 4715419421865334491L);
        setLongField(term90317, term90317.getClass(), "emblemFlagList", 6320559761926095887L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList2", argTypes, term90317, args);
    }

};


