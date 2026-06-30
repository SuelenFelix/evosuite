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

public class UserActivity_getId_423689391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43975;

    public UserActivity_getId_423689391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43981 = new Long(-4598158870068953328L);
        term43975 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term43977 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term43979 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44010 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43975, term43975.getClass(), "id", -5871746020807491998L);
        setLongField(term43977, term43977.getClass(), "id", 4742108233936970770L);
        setLongField(term43979, term43979.getClass(), "id", 2722004046017350471L);
        setField(term43979, term43979.getClass(), "extId", term43981);
        setField(term43979, term43979.getClass(), "luid", "lGVACSQceQ");
        setIntField(term43996, term43996.getClass(), "year", 2022);
        setShortField(term43996, term43996.getClass(), "month", (short) 5);
        setShortField(term43996, term43996.getClass(), "day", (short) 28);
        setField(term43995, term43995.getClass(), "date", term43996);
        setByteField(term44000, term44000.getClass(), "hour", (byte) 20);
        setByteField(term44000, term44000.getClass(), "minute", (byte) 42);
        setByteField(term44000, term44000.getClass(), "second", (byte) 20);
        setIntField(term44000, term44000.getClass(), "nano", 528388661);
        setField(term43995, term43995.getClass(), "time", term44000);
        setField(term43979, term43979.getClass(), "registerTime", term43995);
        setIntField(term44006, term44006.getClass(), "year", 2029);
        setShortField(term44006, term44006.getClass(), "month", (short) 5);
        setShortField(term44006, term44006.getClass(), "day", (short) 12);
        setField(term44005, term44005.getClass(), "date", term44006);
        setByteField(term44010, term44010.getClass(), "hour", (byte) 23);
        setByteField(term44010, term44010.getClass(), "minute", (byte) 20);
        setByteField(term44010, term44010.getClass(), "second", (byte) 4);
        setIntField(term44010, term44010.getClass(), "nano", 378307890);
        setField(term44005, term44005.getClass(), "time", term44010);
        setField(term43979, term43979.getClass(), "accessTime", term44005);
        setField(term43977, term43977.getClass(), "card", term43979);
        setIntField(term43977, term43977.getClass(), "lastDataVersion", 1385418235);
        setField(term43977, term43977.getClass(), "userName", "jpgWRbSvyQ");
        setIntField(term43977, term43977.getClass(), "point", 928651112);
        setIntField(term43977, term43977.getClass(), "totalPoint", -970446181);
        setIntField(term43977, term43977.getClass(), "iconId", 484689354);
        setIntField(term43977, term43977.getClass(), "nameplateId", 1836490268);
        setIntField(term43977, term43977.getClass(), "frameId", 388735696);
        setIntField(term43977, term43977.getClass(), "trophyId", 105946838);
        setIntField(term43977, term43977.getClass(), "playCount", -2076570725);
        setIntField(term43977, term43977.getClass(), "playVsCount", -976659428);
        setIntField(term43977, term43977.getClass(), "playSyncCount", 974582816);
        setIntField(term43977, term43977.getClass(), "winCount", 1915101054);
        setIntField(term43977, term43977.getClass(), "helpCount", -956240810);
        setIntField(term43977, term43977.getClass(), "comboCount", 2125391204);
        setIntField(term43977, term43977.getClass(), "feverCount", -1473375595);
        setIntField(term43977, term43977.getClass(), "totalHiScore", 847182213);
        setIntField(term43977, term43977.getClass(), "totalEasyHighScore", 1757624590);
        setIntField(term43977, term43977.getClass(), "totalBasicHighScore", 694012679);
        setIntField(term43977, term43977.getClass(), "totalAdvancedHighScore", -630916471);
        setIntField(term43977, term43977.getClass(), "totalExpertHighScore", -167574207);
        setIntField(term43977, term43977.getClass(), "totalMasterHighScore", 1034189504);
        setIntField(term43977, term43977.getClass(), "totalReMasterHighScore", 250123647);
        setIntField(term43977, term43977.getClass(), "totalHighSync", -1818613479);
        setIntField(term43977, term43977.getClass(), "totalEasySync", -93031622);
        setIntField(term43977, term43977.getClass(), "totalBasicSync", 1909891216);
        setIntField(term43977, term43977.getClass(), "totalAdvancedSync", -1231417445);
        setIntField(term43977, term43977.getClass(), "totalExpertSync", -1305887225);
        setIntField(term43977, term43977.getClass(), "totalMasterSync", 1861751365);
        setIntField(term43977, term43977.getClass(), "totalReMasterSync", 1137036889);
        setIntField(term43977, term43977.getClass(), "playerRating", 1607912632);
        setIntField(term43977, term43977.getClass(), "highestRating", -2089396254);
        setIntField(term43977, term43977.getClass(), "rankAuthTailId", 609444561);
        setField(term43977, term43977.getClass(), "eventWatchedDate", "tFMlYmPEBX");
        setField(term43977, term43977.getClass(), "webLimitDate", "ljkZxGNgjZ");
        setIntField(term43977, term43977.getClass(), "challengeTrackPhase", 2102660964);
        setIntField(term43977, term43977.getClass(), "firstPlayBits", 131358254);
        setField(term43977, term43977.getClass(), "lastPlayDate", "hrFtgdcZKS");
        setIntField(term43977, term43977.getClass(), "lastPlaceId", -1411314076);
        setField(term43977, term43977.getClass(), "lastPlaceName", "ZhZJvpPaTU");
        setIntField(term43977, term43977.getClass(), "lastRegionId", -1465382016);
        setField(term43977, term43977.getClass(), "lastRegionName", "NZwUsJxDLI");
        setField(term43977, term43977.getClass(), "lastClientId", "wlusYBOfXW");
        setField(term43977, term43977.getClass(), "lastCountryCode", "HEWWLhfKIa");
        setIntField(term43977, term43977.getClass(), "eventPoint", 2111238518);
        setIntField(term43977, term43977.getClass(), "totalLv", -477500403);
        setIntField(term43977, term43977.getClass(), "lastLoginBonusDay", 425471770);
        setIntField(term43977, term43977.getClass(), "lastSurvivalBonusDay", -2070314247);
        setIntField(term43977, term43977.getClass(), "loginBonusLv", -2128262129);
        setField(term43975, term43975.getClass(), "user", term43977);
        setIntField(term43975, term43975.getClass(), "kind", -1404754679);
        setIntField(term43975, term43975.getClass(), "activityId", 995795018);
        setLongField(term43975, term43975.getClass(), "sortNumber", 6636235983121346803L);
        setIntField(term43975, term43975.getClass(), "param1", 21168892);
        setIntField(term43975, term43975.getClass(), "param2", 1344518129);
        setIntField(term43975, term43975.getClass(), "param3", -1534477902);
        setIntField(term43975, term43975.getClass(), "param4", -1969746416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term43975, args);
    }

};


