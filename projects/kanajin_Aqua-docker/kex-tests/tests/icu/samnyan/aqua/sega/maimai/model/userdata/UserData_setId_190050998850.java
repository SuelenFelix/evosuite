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

public class UserData_setId_190050998850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13201;
     Object term13375;

    public UserData_setId_190050998850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13205 = new Long(-5788180182343976541L);
        term13201 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term13203 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13234 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13201, term13201.getClass(), "id", -5216789073301458893L);
        setLongField(term13203, term13203.getClass(), "id", -1832940336320585644L);
        setField(term13203, term13203.getClass(), "extId", term13205);
        setField(term13203, term13203.getClass(), "luid", "yevIIoVYHq");
        setIntField(term13220, term13220.getClass(), "year", 2027);
        setShortField(term13220, term13220.getClass(), "month", (short) 6);
        setShortField(term13220, term13220.getClass(), "day", (short) 20);
        setField(term13219, term13219.getClass(), "date", term13220);
        setByteField(term13224, term13224.getClass(), "hour", (byte) 23);
        setByteField(term13224, term13224.getClass(), "minute", (byte) 21);
        setByteField(term13224, term13224.getClass(), "second", (byte) 6);
        setIntField(term13224, term13224.getClass(), "nano", 897776059);
        setField(term13219, term13219.getClass(), "time", term13224);
        setField(term13203, term13203.getClass(), "registerTime", term13219);
        setIntField(term13230, term13230.getClass(), "year", 2016);
        setShortField(term13230, term13230.getClass(), "month", (short) 3);
        setShortField(term13230, term13230.getClass(), "day", (short) 20);
        setField(term13229, term13229.getClass(), "date", term13230);
        setByteField(term13234, term13234.getClass(), "hour", (byte) 0);
        setByteField(term13234, term13234.getClass(), "minute", (byte) 54);
        setByteField(term13234, term13234.getClass(), "second", (byte) 6);
        setIntField(term13234, term13234.getClass(), "nano", 183302469);
        setField(term13229, term13229.getClass(), "time", term13234);
        setField(term13203, term13203.getClass(), "accessTime", term13229);
        setField(term13201, term13201.getClass(), "card", term13203);
        setIntField(term13201, term13201.getClass(), "lastDataVersion", -111931851);
        setField(term13201, term13201.getClass(), "userName", "UuYWMTqWTV");
        setIntField(term13201, term13201.getClass(), "point", -251696516);
        setIntField(term13201, term13201.getClass(), "totalPoint", 1075321384);
        setIntField(term13201, term13201.getClass(), "iconId", -1726073541);
        setIntField(term13201, term13201.getClass(), "nameplateId", 406945977);
        setIntField(term13201, term13201.getClass(), "frameId", 493657684);
        setIntField(term13201, term13201.getClass(), "trophyId", 1882655922);
        setIntField(term13201, term13201.getClass(), "playCount", 1314996390);
        setIntField(term13201, term13201.getClass(), "playVsCount", 1367703658);
        setIntField(term13201, term13201.getClass(), "playSyncCount", 1120153100);
        setIntField(term13201, term13201.getClass(), "winCount", 158801111);
        setIntField(term13201, term13201.getClass(), "helpCount", 464966803);
        setIntField(term13201, term13201.getClass(), "comboCount", -246618392);
        setIntField(term13201, term13201.getClass(), "feverCount", 1472246167);
        setIntField(term13201, term13201.getClass(), "totalHiScore", 1008555478);
        setIntField(term13201, term13201.getClass(), "totalEasyHighScore", 1346386442);
        setIntField(term13201, term13201.getClass(), "totalBasicHighScore", 1904559758);
        setIntField(term13201, term13201.getClass(), "totalAdvancedHighScore", 610850630);
        setIntField(term13201, term13201.getClass(), "totalExpertHighScore", 170509161);
        setIntField(term13201, term13201.getClass(), "totalMasterHighScore", 491497994);
        setIntField(term13201, term13201.getClass(), "totalReMasterHighScore", 1997288643);
        setIntField(term13201, term13201.getClass(), "totalHighSync", -378961519);
        setIntField(term13201, term13201.getClass(), "totalEasySync", -400280008);
        setIntField(term13201, term13201.getClass(), "totalBasicSync", -1191957775);
        setIntField(term13201, term13201.getClass(), "totalAdvancedSync", 14181775);
        setIntField(term13201, term13201.getClass(), "totalExpertSync", 667778327);
        setIntField(term13201, term13201.getClass(), "totalMasterSync", 395074450);
        setIntField(term13201, term13201.getClass(), "totalReMasterSync", -2028511200);
        setIntField(term13201, term13201.getClass(), "playerRating", 1415605360);
        setIntField(term13201, term13201.getClass(), "highestRating", 896275171);
        setIntField(term13201, term13201.getClass(), "rankAuthTailId", 466010);
        setField(term13201, term13201.getClass(), "eventWatchedDate", "DSFGlcaXUb");
        setField(term13201, term13201.getClass(), "webLimitDate", "sHMXNUzNeM");
        setIntField(term13201, term13201.getClass(), "challengeTrackPhase", -169463842);
        setIntField(term13201, term13201.getClass(), "firstPlayBits", -2106837394);
        setField(term13201, term13201.getClass(), "lastPlayDate", "gPzGDOEPPw");
        setIntField(term13201, term13201.getClass(), "lastPlaceId", -533202192);
        setField(term13201, term13201.getClass(), "lastPlaceName", "rwKoAngzCu");
        setIntField(term13201, term13201.getClass(), "lastRegionId", -1349617857);
        setField(term13201, term13201.getClass(), "lastRegionName", "VUkRVwROTl");
        setField(term13201, term13201.getClass(), "lastClientId", "UDlkdccCRn");
        setField(term13201, term13201.getClass(), "lastCountryCode", "McpzErOcYb");
        setIntField(term13201, term13201.getClass(), "eventPoint", 1346331516);
        setIntField(term13201, term13201.getClass(), "totalLv", 1018925421);
        setIntField(term13201, term13201.getClass(), "lastLoginBonusDay", -1658031378);
        setIntField(term13201, term13201.getClass(), "lastSurvivalBonusDay", -863483345);
        setIntField(term13201, term13201.getClass(), "loginBonusLv", -1722702406);
        term13375 = new Long(-8033714905181142681L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term13375;
        callMethod(klass, "setId", argTypes, term13201, args);
    }

};


