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

public class UserData_setFeverCount_198147348466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17521;
     Object term17695;

    public UserData_setFeverCount_198147348466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17525 = new Long(463622836963501975L);
        term17521 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term17523 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17544 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17554 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17521, term17521.getClass(), "id", -4023935540989049732L);
        setLongField(term17523, term17523.getClass(), "id", 855932984568615096L);
        setField(term17523, term17523.getClass(), "extId", term17525);
        setField(term17523, term17523.getClass(), "luid", "FvUCZgTXhq");
        setIntField(term17540, term17540.getClass(), "year", 2020);
        setShortField(term17540, term17540.getClass(), "month", (short) 10);
        setShortField(term17540, term17540.getClass(), "day", (short) 8);
        setField(term17539, term17539.getClass(), "date", term17540);
        setByteField(term17544, term17544.getClass(), "hour", (byte) 15);
        setByteField(term17544, term17544.getClass(), "minute", (byte) 57);
        setByteField(term17544, term17544.getClass(), "second", (byte) 17);
        setIntField(term17544, term17544.getClass(), "nano", 288139529);
        setField(term17539, term17539.getClass(), "time", term17544);
        setField(term17523, term17523.getClass(), "registerTime", term17539);
        setIntField(term17550, term17550.getClass(), "year", 2022);
        setShortField(term17550, term17550.getClass(), "month", (short) 6);
        setShortField(term17550, term17550.getClass(), "day", (short) 12);
        setField(term17549, term17549.getClass(), "date", term17550);
        setByteField(term17554, term17554.getClass(), "hour", (byte) 14);
        setByteField(term17554, term17554.getClass(), "minute", (byte) 3);
        setByteField(term17554, term17554.getClass(), "second", (byte) 7);
        setIntField(term17554, term17554.getClass(), "nano", 637592645);
        setField(term17549, term17549.getClass(), "time", term17554);
        setField(term17523, term17523.getClass(), "accessTime", term17549);
        setField(term17521, term17521.getClass(), "card", term17523);
        setIntField(term17521, term17521.getClass(), "lastDataVersion", -1889206410);
        setField(term17521, term17521.getClass(), "userName", "wWWidPCHzx");
        setIntField(term17521, term17521.getClass(), "point", -235874398);
        setIntField(term17521, term17521.getClass(), "totalPoint", -978039004);
        setIntField(term17521, term17521.getClass(), "iconId", 1162356859);
        setIntField(term17521, term17521.getClass(), "nameplateId", 175338916);
        setIntField(term17521, term17521.getClass(), "frameId", -1484528924);
        setIntField(term17521, term17521.getClass(), "trophyId", -557662858);
        setIntField(term17521, term17521.getClass(), "playCount", -477520795);
        setIntField(term17521, term17521.getClass(), "playVsCount", -480468995);
        setIntField(term17521, term17521.getClass(), "playSyncCount", -2037695985);
        setIntField(term17521, term17521.getClass(), "winCount", -2044768479);
        setIntField(term17521, term17521.getClass(), "helpCount", -2020209498);
        setIntField(term17521, term17521.getClass(), "comboCount", 754066823);
        setIntField(term17521, term17521.getClass(), "feverCount", 306903225);
        setIntField(term17521, term17521.getClass(), "totalHiScore", -1245754321);
        setIntField(term17521, term17521.getClass(), "totalEasyHighScore", 398727237);
        setIntField(term17521, term17521.getClass(), "totalBasicHighScore", -1741920202);
        setIntField(term17521, term17521.getClass(), "totalAdvancedHighScore", 1639977614);
        setIntField(term17521, term17521.getClass(), "totalExpertHighScore", -27270642);
        setIntField(term17521, term17521.getClass(), "totalMasterHighScore", -1419515823);
        setIntField(term17521, term17521.getClass(), "totalReMasterHighScore", 1749999469);
        setIntField(term17521, term17521.getClass(), "totalHighSync", -1508018812);
        setIntField(term17521, term17521.getClass(), "totalEasySync", -679973960);
        setIntField(term17521, term17521.getClass(), "totalBasicSync", -85442762);
        setIntField(term17521, term17521.getClass(), "totalAdvancedSync", 295245507);
        setIntField(term17521, term17521.getClass(), "totalExpertSync", -1782801582);
        setIntField(term17521, term17521.getClass(), "totalMasterSync", -112814060);
        setIntField(term17521, term17521.getClass(), "totalReMasterSync", -1111447214);
        setIntField(term17521, term17521.getClass(), "playerRating", 1463964937);
        setIntField(term17521, term17521.getClass(), "highestRating", -1207878110);
        setIntField(term17521, term17521.getClass(), "rankAuthTailId", -284421477);
        setField(term17521, term17521.getClass(), "eventWatchedDate", "OwPIiBRuKK");
        setField(term17521, term17521.getClass(), "webLimitDate", "sgfGySMODT");
        setIntField(term17521, term17521.getClass(), "challengeTrackPhase", 55419591);
        setIntField(term17521, term17521.getClass(), "firstPlayBits", 1020931980);
        setField(term17521, term17521.getClass(), "lastPlayDate", "ndAITnOsny");
        setIntField(term17521, term17521.getClass(), "lastPlaceId", -1435032444);
        setField(term17521, term17521.getClass(), "lastPlaceName", "CVZnTiJucs");
        setIntField(term17521, term17521.getClass(), "lastRegionId", -420769218);
        setField(term17521, term17521.getClass(), "lastRegionName", "ecHEQufXoq");
        setField(term17521, term17521.getClass(), "lastClientId", "btBLMvHzJg");
        setField(term17521, term17521.getClass(), "lastCountryCode", "JdOMfNWgLP");
        setIntField(term17521, term17521.getClass(), "eventPoint", -1047476590);
        setIntField(term17521, term17521.getClass(), "totalLv", -804745833);
        setIntField(term17521, term17521.getClass(), "lastLoginBonusDay", 1080834214);
        setIntField(term17521, term17521.getClass(), "lastSurvivalBonusDay", 323842695);
        setIntField(term17521, term17521.getClass(), "loginBonusLv", 331897564);
        term17695 = new Integer(-968105925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17695;
        callMethod(klass, "setFeverCount", argTypes, term17521, args);
    }

};


