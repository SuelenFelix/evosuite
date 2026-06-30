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

public class UserData_setTotalReMasterHighScore_25117386473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19383;
     Object term19557;

    public UserData_setTotalReMasterHighScore_25117386473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19387 = new Long(682356318767179819L);
        term19383 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term19385 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19416 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19383, term19383.getClass(), "id", 138235087558060686L);
        setLongField(term19385, term19385.getClass(), "id", 5381386339318883012L);
        setField(term19385, term19385.getClass(), "extId", term19387);
        setField(term19385, term19385.getClass(), "luid", "xypryEkUPF");
        setIntField(term19402, term19402.getClass(), "year", 2018);
        setShortField(term19402, term19402.getClass(), "month", (short) 9);
        setShortField(term19402, term19402.getClass(), "day", (short) 3);
        setField(term19401, term19401.getClass(), "date", term19402);
        setByteField(term19406, term19406.getClass(), "hour", (byte) 16);
        setByteField(term19406, term19406.getClass(), "minute", (byte) 48);
        setByteField(term19406, term19406.getClass(), "second", (byte) 45);
        setIntField(term19406, term19406.getClass(), "nano", 919694917);
        setField(term19401, term19401.getClass(), "time", term19406);
        setField(term19385, term19385.getClass(), "registerTime", term19401);
        setIntField(term19412, term19412.getClass(), "year", 2021);
        setShortField(term19412, term19412.getClass(), "month", (short) 8);
        setShortField(term19412, term19412.getClass(), "day", (short) 23);
        setField(term19411, term19411.getClass(), "date", term19412);
        setByteField(term19416, term19416.getClass(), "hour", (byte) 15);
        setByteField(term19416, term19416.getClass(), "minute", (byte) 43);
        setByteField(term19416, term19416.getClass(), "second", (byte) 10);
        setIntField(term19416, term19416.getClass(), "nano", 893504165);
        setField(term19411, term19411.getClass(), "time", term19416);
        setField(term19385, term19385.getClass(), "accessTime", term19411);
        setField(term19383, term19383.getClass(), "card", term19385);
        setIntField(term19383, term19383.getClass(), "lastDataVersion", -342719145);
        setField(term19383, term19383.getClass(), "userName", "zyZTzHNjQr");
        setIntField(term19383, term19383.getClass(), "point", 2101766592);
        setIntField(term19383, term19383.getClass(), "totalPoint", 802196878);
        setIntField(term19383, term19383.getClass(), "iconId", -174401540);
        setIntField(term19383, term19383.getClass(), "nameplateId", -1881073314);
        setIntField(term19383, term19383.getClass(), "frameId", -1902513009);
        setIntField(term19383, term19383.getClass(), "trophyId", 1810303681);
        setIntField(term19383, term19383.getClass(), "playCount", 1374798468);
        setIntField(term19383, term19383.getClass(), "playVsCount", -425364766);
        setIntField(term19383, term19383.getClass(), "playSyncCount", -240455247);
        setIntField(term19383, term19383.getClass(), "winCount", 412243891);
        setIntField(term19383, term19383.getClass(), "helpCount", -1517264869);
        setIntField(term19383, term19383.getClass(), "comboCount", 1498231709);
        setIntField(term19383, term19383.getClass(), "feverCount", -775074162);
        setIntField(term19383, term19383.getClass(), "totalHiScore", 304255923);
        setIntField(term19383, term19383.getClass(), "totalEasyHighScore", 1532668668);
        setIntField(term19383, term19383.getClass(), "totalBasicHighScore", -100547107);
        setIntField(term19383, term19383.getClass(), "totalAdvancedHighScore", 2140567451);
        setIntField(term19383, term19383.getClass(), "totalExpertHighScore", -390400057);
        setIntField(term19383, term19383.getClass(), "totalMasterHighScore", -157273113);
        setIntField(term19383, term19383.getClass(), "totalReMasterHighScore", 1497057438);
        setIntField(term19383, term19383.getClass(), "totalHighSync", 1526060255);
        setIntField(term19383, term19383.getClass(), "totalEasySync", -833785119);
        setIntField(term19383, term19383.getClass(), "totalBasicSync", -1920705464);
        setIntField(term19383, term19383.getClass(), "totalAdvancedSync", 428714196);
        setIntField(term19383, term19383.getClass(), "totalExpertSync", 934939315);
        setIntField(term19383, term19383.getClass(), "totalMasterSync", -935897776);
        setIntField(term19383, term19383.getClass(), "totalReMasterSync", 1370328728);
        setIntField(term19383, term19383.getClass(), "playerRating", 1126005767);
        setIntField(term19383, term19383.getClass(), "highestRating", -1155333431);
        setIntField(term19383, term19383.getClass(), "rankAuthTailId", -2110210183);
        setField(term19383, term19383.getClass(), "eventWatchedDate", "YSrFKQQwXE");
        setField(term19383, term19383.getClass(), "webLimitDate", "qxhOsmyyjm");
        setIntField(term19383, term19383.getClass(), "challengeTrackPhase", -687531774);
        setIntField(term19383, term19383.getClass(), "firstPlayBits", -1997574107);
        setField(term19383, term19383.getClass(), "lastPlayDate", "DuKcNfVVYR");
        setIntField(term19383, term19383.getClass(), "lastPlaceId", 748487022);
        setField(term19383, term19383.getClass(), "lastPlaceName", "fRujHWvXjJ");
        setIntField(term19383, term19383.getClass(), "lastRegionId", -706230330);
        setField(term19383, term19383.getClass(), "lastRegionName", "EAIAAStlTz");
        setField(term19383, term19383.getClass(), "lastClientId", "yIWXcOQTgy");
        setField(term19383, term19383.getClass(), "lastCountryCode", "xAWekqanqc");
        setIntField(term19383, term19383.getClass(), "eventPoint", -926446006);
        setIntField(term19383, term19383.getClass(), "totalLv", 572417171);
        setIntField(term19383, term19383.getClass(), "lastLoginBonusDay", 46222099);
        setIntField(term19383, term19383.getClass(), "lastSurvivalBonusDay", 1985711069);
        setIntField(term19383, term19383.getClass(), "loginBonusLv", -1497378582);
        term19557 = new Integer(-449740668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19557;
        callMethod(klass, "setTotalReMasterHighScore", argTypes, term19383, args);
    }

};


