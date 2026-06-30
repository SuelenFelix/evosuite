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
import java.lang.Integer;

public class UserData_setTotalExpertSync_170327682678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20713;
     Object term20887;

    public UserData_setTotalExpertSync_170327682678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20717 = new Long(50358265865610362L);
        term20713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term20715 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term20731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20746 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term20713, term20713.getClass(), "id", -1539859611880912454L);
        setLongField(term20715, term20715.getClass(), "id", 4100236067313034103L);
        setField(term20715, term20715.getClass(), "extId", term20717);
        setField(term20715, term20715.getClass(), "luid", "mrqGHotaef");
        setIntField(term20732, term20732.getClass(), "year", 2026);
        setShortField(term20732, term20732.getClass(), "month", (short) 2);
        setShortField(term20732, term20732.getClass(), "day", (short) 5);
        setField(term20731, term20731.getClass(), "date", term20732);
        setByteField(term20736, term20736.getClass(), "hour", (byte) 1);
        setByteField(term20736, term20736.getClass(), "minute", (byte) 38);
        setByteField(term20736, term20736.getClass(), "second", (byte) 15);
        setIntField(term20736, term20736.getClass(), "nano", 167345230);
        setField(term20731, term20731.getClass(), "time", term20736);
        setField(term20715, term20715.getClass(), "registerTime", term20731);
        setIntField(term20742, term20742.getClass(), "year", 2029);
        setShortField(term20742, term20742.getClass(), "month", (short) 6);
        setShortField(term20742, term20742.getClass(), "day", (short) 4);
        setField(term20741, term20741.getClass(), "date", term20742);
        setByteField(term20746, term20746.getClass(), "hour", (byte) 22);
        setByteField(term20746, term20746.getClass(), "minute", (byte) 1);
        setByteField(term20746, term20746.getClass(), "second", (byte) 38);
        setIntField(term20746, term20746.getClass(), "nano", 329228491);
        setField(term20741, term20741.getClass(), "time", term20746);
        setField(term20715, term20715.getClass(), "accessTime", term20741);
        setField(term20713, term20713.getClass(), "card", term20715);
        setIntField(term20713, term20713.getClass(), "lastDataVersion", -1713263092);
        setField(term20713, term20713.getClass(), "userName", "UbZGBpQZQW");
        setIntField(term20713, term20713.getClass(), "point", 73609068);
        setIntField(term20713, term20713.getClass(), "totalPoint", -1150137872);
        setIntField(term20713, term20713.getClass(), "iconId", -781333853);
        setIntField(term20713, term20713.getClass(), "nameplateId", 158137467);
        setIntField(term20713, term20713.getClass(), "frameId", 1299041951);
        setIntField(term20713, term20713.getClass(), "trophyId", -1772128093);
        setIntField(term20713, term20713.getClass(), "playCount", -2057880798);
        setIntField(term20713, term20713.getClass(), "playVsCount", -2041732081);
        setIntField(term20713, term20713.getClass(), "playSyncCount", 2073870078);
        setIntField(term20713, term20713.getClass(), "winCount", 1649066040);
        setIntField(term20713, term20713.getClass(), "helpCount", -640093979);
        setIntField(term20713, term20713.getClass(), "comboCount", 1665282382);
        setIntField(term20713, term20713.getClass(), "feverCount", 1536865175);
        setIntField(term20713, term20713.getClass(), "totalHiScore", -1059947211);
        setIntField(term20713, term20713.getClass(), "totalEasyHighScore", -768583538);
        setIntField(term20713, term20713.getClass(), "totalBasicHighScore", 372329686);
        setIntField(term20713, term20713.getClass(), "totalAdvancedHighScore", -381739191);
        setIntField(term20713, term20713.getClass(), "totalExpertHighScore", -432438127);
        setIntField(term20713, term20713.getClass(), "totalMasterHighScore", 44813544);
        setIntField(term20713, term20713.getClass(), "totalReMasterHighScore", 654539936);
        setIntField(term20713, term20713.getClass(), "totalHighSync", -929524036);
        setIntField(term20713, term20713.getClass(), "totalEasySync", 1539575963);
        setIntField(term20713, term20713.getClass(), "totalBasicSync", -381662221);
        setIntField(term20713, term20713.getClass(), "totalAdvancedSync", -1367263864);
        setIntField(term20713, term20713.getClass(), "totalExpertSync", 1810292112);
        setIntField(term20713, term20713.getClass(), "totalMasterSync", 385619995);
        setIntField(term20713, term20713.getClass(), "totalReMasterSync", -920852160);
        setIntField(term20713, term20713.getClass(), "playerRating", -1975385844);
        setIntField(term20713, term20713.getClass(), "highestRating", -720629032);
        setIntField(term20713, term20713.getClass(), "rankAuthTailId", 398554038);
        setField(term20713, term20713.getClass(), "eventWatchedDate", "SvGTualQPa");
        setField(term20713, term20713.getClass(), "webLimitDate", "mdxcgZwsaP");
        setIntField(term20713, term20713.getClass(), "challengeTrackPhase", -1454206593);
        setIntField(term20713, term20713.getClass(), "firstPlayBits", 675396436);
        setField(term20713, term20713.getClass(), "lastPlayDate", "XildIRoZHG");
        setIntField(term20713, term20713.getClass(), "lastPlaceId", -41963319);
        setField(term20713, term20713.getClass(), "lastPlaceName", "lEcrFlxJXH");
        setIntField(term20713, term20713.getClass(), "lastRegionId", -831752810);
        setField(term20713, term20713.getClass(), "lastRegionName", "VNdDwXMYxR");
        setField(term20713, term20713.getClass(), "lastClientId", "bVbexZPmwW");
        setField(term20713, term20713.getClass(), "lastCountryCode", "tvxYdqiyGc");
        setIntField(term20713, term20713.getClass(), "eventPoint", -386141354);
        setIntField(term20713, term20713.getClass(), "totalLv", -226677391);
        setIntField(term20713, term20713.getClass(), "lastLoginBonusDay", -1991945298);
        setIntField(term20713, term20713.getClass(), "lastSurvivalBonusDay", 110090057);
        setIntField(term20713, term20713.getClass(), "loginBonusLv", 1975165299);
        term20887 = new Integer(-1320712215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20887;
        callMethod(klass, "setTotalExpertSync", argTypes, term20713, args);
    }

};


