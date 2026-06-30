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

public class UserPresentEvent_canEqual_142834119114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100688;
     Object term100868;

    public UserPresentEvent_canEqual_142834119114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100694 = new Long(5797412846146719084L);
        term100688 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term100690 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term100692 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100723 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100688, term100688.getClass(), "id", 2142335215837283347L);
        setLongField(term100690, term100690.getClass(), "id", -3861643867197678062L);
        setLongField(term100692, term100692.getClass(), "id", 3378211908158042365L);
        setField(term100692, term100692.getClass(), "extId", term100694);
        setField(term100692, term100692.getClass(), "luid", "LdfzgJfEqK");
        setIntField(term100709, term100709.getClass(), "year", 2017);
        setShortField(term100709, term100709.getClass(), "month", (short) 2);
        setShortField(term100709, term100709.getClass(), "day", (short) 24);
        setField(term100708, term100708.getClass(), "date", term100709);
        setByteField(term100713, term100713.getClass(), "hour", (byte) 23);
        setByteField(term100713, term100713.getClass(), "minute", (byte) 46);
        setByteField(term100713, term100713.getClass(), "second", (byte) 43);
        setIntField(term100713, term100713.getClass(), "nano", 626549570);
        setField(term100708, term100708.getClass(), "time", term100713);
        setField(term100692, term100692.getClass(), "registerTime", term100708);
        setIntField(term100719, term100719.getClass(), "year", 2014);
        setShortField(term100719, term100719.getClass(), "month", (short) 4);
        setShortField(term100719, term100719.getClass(), "day", (short) 20);
        setField(term100718, term100718.getClass(), "date", term100719);
        setByteField(term100723, term100723.getClass(), "hour", (byte) 16);
        setByteField(term100723, term100723.getClass(), "minute", (byte) 19);
        setByteField(term100723, term100723.getClass(), "second", (byte) 50);
        setIntField(term100723, term100723.getClass(), "nano", 397343944);
        setField(term100718, term100718.getClass(), "time", term100723);
        setField(term100692, term100692.getClass(), "accessTime", term100718);
        setField(term100690, term100690.getClass(), "card", term100692);
        setIntField(term100690, term100690.getClass(), "lastDataVersion", -334809793);
        setField(term100690, term100690.getClass(), "userName", "YdzBhsGATX");
        setIntField(term100690, term100690.getClass(), "point", 1336526057);
        setIntField(term100690, term100690.getClass(), "totalPoint", -1183222215);
        setIntField(term100690, term100690.getClass(), "iconId", 280886553);
        setIntField(term100690, term100690.getClass(), "nameplateId", 1599117883);
        setIntField(term100690, term100690.getClass(), "frameId", -1690488985);
        setIntField(term100690, term100690.getClass(), "trophyId", -929504323);
        setIntField(term100690, term100690.getClass(), "playCount", 141562728);
        setIntField(term100690, term100690.getClass(), "playVsCount", -1991277407);
        setIntField(term100690, term100690.getClass(), "playSyncCount", 519516662);
        setIntField(term100690, term100690.getClass(), "winCount", 396192446);
        setIntField(term100690, term100690.getClass(), "helpCount", 1016730846);
        setIntField(term100690, term100690.getClass(), "comboCount", -1082475050);
        setIntField(term100690, term100690.getClass(), "feverCount", 1725611156);
        setIntField(term100690, term100690.getClass(), "totalHiScore", -709553672);
        setIntField(term100690, term100690.getClass(), "totalEasyHighScore", -517614001);
        setIntField(term100690, term100690.getClass(), "totalBasicHighScore", 308141202);
        setIntField(term100690, term100690.getClass(), "totalAdvancedHighScore", -1422788814);
        setIntField(term100690, term100690.getClass(), "totalExpertHighScore", 1870092235);
        setIntField(term100690, term100690.getClass(), "totalMasterHighScore", -348482192);
        setIntField(term100690, term100690.getClass(), "totalReMasterHighScore", -261423404);
        setIntField(term100690, term100690.getClass(), "totalHighSync", -64510316);
        setIntField(term100690, term100690.getClass(), "totalEasySync", -1442185390);
        setIntField(term100690, term100690.getClass(), "totalBasicSync", 379077201);
        setIntField(term100690, term100690.getClass(), "totalAdvancedSync", -1349144811);
        setIntField(term100690, term100690.getClass(), "totalExpertSync", 1721203580);
        setIntField(term100690, term100690.getClass(), "totalMasterSync", -1541596493);
        setIntField(term100690, term100690.getClass(), "totalReMasterSync", 530537769);
        setIntField(term100690, term100690.getClass(), "playerRating", -1130731328);
        setIntField(term100690, term100690.getClass(), "highestRating", 158445574);
        setIntField(term100690, term100690.getClass(), "rankAuthTailId", 1089267384);
        setField(term100690, term100690.getClass(), "eventWatchedDate", "IxrOGCWNvM");
        setField(term100690, term100690.getClass(), "webLimitDate", "ixwssTuJbB");
        setIntField(term100690, term100690.getClass(), "challengeTrackPhase", -1026397095);
        setIntField(term100690, term100690.getClass(), "firstPlayBits", -120229920);
        setField(term100690, term100690.getClass(), "lastPlayDate", "IXdiuaFyFC");
        setIntField(term100690, term100690.getClass(), "lastPlaceId", 32544597);
        setField(term100690, term100690.getClass(), "lastPlaceName", "CLVzSrhOjS");
        setIntField(term100690, term100690.getClass(), "lastRegionId", 2102217630);
        setField(term100690, term100690.getClass(), "lastRegionName", "OrrgHDCMip");
        setField(term100690, term100690.getClass(), "lastClientId", "mEYsXJvgdv");
        setField(term100690, term100690.getClass(), "lastCountryCode", "JKbmIUKwNm");
        setIntField(term100690, term100690.getClass(), "eventPoint", -471183701);
        setIntField(term100690, term100690.getClass(), "totalLv", 1854074907);
        setIntField(term100690, term100690.getClass(), "lastLoginBonusDay", -408616081);
        setIntField(term100690, term100690.getClass(), "lastSurvivalBonusDay", 179050285);
        setIntField(term100690, term100690.getClass(), "loginBonusLv", 1885793754);
        setField(term100688, term100688.getClass(), "user", term100690);
        setIntField(term100688, term100688.getClass(), "presentEventId", -764569890);
        setIntField(term100688, term100688.getClass(), "point", 575186277);
        setIntField(term100688, term100688.getClass(), "presentCount", -1254865912);
        setIntField(term100688, term100688.getClass(), "rate", 672798038);
        term100868 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100868;
        callMethod(klass, "canEqual", argTypes, term100688, args);
    }

};


