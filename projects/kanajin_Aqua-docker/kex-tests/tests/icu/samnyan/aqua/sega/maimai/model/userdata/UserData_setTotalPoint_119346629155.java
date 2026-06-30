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

public class UserData_setTotalPoint_119346629155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14595;
     Object term14769;

    public UserData_setTotalPoint_119346629155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14599 = new Long(-7738503207562305297L);
        term14595 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term14597 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14628 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14595, term14595.getClass(), "id", -6950146046121430355L);
        setLongField(term14597, term14597.getClass(), "id", 1667122142089513324L);
        setField(term14597, term14597.getClass(), "extId", term14599);
        setField(term14597, term14597.getClass(), "luid", "vLTbaoAxBm");
        setIntField(term14614, term14614.getClass(), "year", 2028);
        setShortField(term14614, term14614.getClass(), "month", (short) 4);
        setShortField(term14614, term14614.getClass(), "day", (short) 11);
        setField(term14613, term14613.getClass(), "date", term14614);
        setByteField(term14618, term14618.getClass(), "hour", (byte) 4);
        setByteField(term14618, term14618.getClass(), "minute", (byte) 45);
        setByteField(term14618, term14618.getClass(), "second", (byte) 2);
        setIntField(term14618, term14618.getClass(), "nano", 374177968);
        setField(term14613, term14613.getClass(), "time", term14618);
        setField(term14597, term14597.getClass(), "registerTime", term14613);
        setIntField(term14624, term14624.getClass(), "year", 2021);
        setShortField(term14624, term14624.getClass(), "month", (short) 4);
        setShortField(term14624, term14624.getClass(), "day", (short) 22);
        setField(term14623, term14623.getClass(), "date", term14624);
        setByteField(term14628, term14628.getClass(), "hour", (byte) 17);
        setByteField(term14628, term14628.getClass(), "minute", (byte) 6);
        setByteField(term14628, term14628.getClass(), "second", (byte) 33);
        setIntField(term14628, term14628.getClass(), "nano", 21410850);
        setField(term14623, term14623.getClass(), "time", term14628);
        setField(term14597, term14597.getClass(), "accessTime", term14623);
        setField(term14595, term14595.getClass(), "card", term14597);
        setIntField(term14595, term14595.getClass(), "lastDataVersion", 841910530);
        setField(term14595, term14595.getClass(), "userName", "BXTjEyEZxD");
        setIntField(term14595, term14595.getClass(), "point", -1415371559);
        setIntField(term14595, term14595.getClass(), "totalPoint", -2083858949);
        setIntField(term14595, term14595.getClass(), "iconId", -1878319299);
        setIntField(term14595, term14595.getClass(), "nameplateId", -690862846);
        setIntField(term14595, term14595.getClass(), "frameId", 805027262);
        setIntField(term14595, term14595.getClass(), "trophyId", 717389178);
        setIntField(term14595, term14595.getClass(), "playCount", -1265226052);
        setIntField(term14595, term14595.getClass(), "playVsCount", 1970023149);
        setIntField(term14595, term14595.getClass(), "playSyncCount", -336351735);
        setIntField(term14595, term14595.getClass(), "winCount", 1938932230);
        setIntField(term14595, term14595.getClass(), "helpCount", 1128720609);
        setIntField(term14595, term14595.getClass(), "comboCount", 216265002);
        setIntField(term14595, term14595.getClass(), "feverCount", -97405660);
        setIntField(term14595, term14595.getClass(), "totalHiScore", 872278468);
        setIntField(term14595, term14595.getClass(), "totalEasyHighScore", -1003390920);
        setIntField(term14595, term14595.getClass(), "totalBasicHighScore", -2052568448);
        setIntField(term14595, term14595.getClass(), "totalAdvancedHighScore", 664155196);
        setIntField(term14595, term14595.getClass(), "totalExpertHighScore", -1103257588);
        setIntField(term14595, term14595.getClass(), "totalMasterHighScore", 1463219831);
        setIntField(term14595, term14595.getClass(), "totalReMasterHighScore", -1516863216);
        setIntField(term14595, term14595.getClass(), "totalHighSync", 1392468004);
        setIntField(term14595, term14595.getClass(), "totalEasySync", -1568339070);
        setIntField(term14595, term14595.getClass(), "totalBasicSync", -1427059961);
        setIntField(term14595, term14595.getClass(), "totalAdvancedSync", 1120685189);
        setIntField(term14595, term14595.getClass(), "totalExpertSync", 654585209);
        setIntField(term14595, term14595.getClass(), "totalMasterSync", -1661685401);
        setIntField(term14595, term14595.getClass(), "totalReMasterSync", 1427434947);
        setIntField(term14595, term14595.getClass(), "playerRating", 2130990985);
        setIntField(term14595, term14595.getClass(), "highestRating", 523197189);
        setIntField(term14595, term14595.getClass(), "rankAuthTailId", 658684460);
        setField(term14595, term14595.getClass(), "eventWatchedDate", "oKhVzOKUFW");
        setField(term14595, term14595.getClass(), "webLimitDate", "mNHyqmOAFy");
        setIntField(term14595, term14595.getClass(), "challengeTrackPhase", 2073367039);
        setIntField(term14595, term14595.getClass(), "firstPlayBits", -365877126);
        setField(term14595, term14595.getClass(), "lastPlayDate", "UxgSdhxPCH");
        setIntField(term14595, term14595.getClass(), "lastPlaceId", 251018856);
        setField(term14595, term14595.getClass(), "lastPlaceName", "DAujxZPHJC");
        setIntField(term14595, term14595.getClass(), "lastRegionId", -1965331640);
        setField(term14595, term14595.getClass(), "lastRegionName", "IlBhdrCvHq");
        setField(term14595, term14595.getClass(), "lastClientId", "OirVUQhauU");
        setField(term14595, term14595.getClass(), "lastCountryCode", "GLbyDfbNZI");
        setIntField(term14595, term14595.getClass(), "eventPoint", -514392629);
        setIntField(term14595, term14595.getClass(), "totalLv", -166633123);
        setIntField(term14595, term14595.getClass(), "lastLoginBonusDay", 373110517);
        setIntField(term14595, term14595.getClass(), "lastSurvivalBonusDay", -1632703926);
        setIntField(term14595, term14595.getClass(), "loginBonusLv", -1031499401);
        term14769 = new Integer(280202002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14769;
        callMethod(klass, "setTotalPoint", argTypes, term14595, args);
    }

};


