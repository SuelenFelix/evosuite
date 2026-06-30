package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserData_setPlayCount_193122885461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155501;
     Object term155777;

    public UserData_setPlayCount_193122885461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155505 = new Long(-3602825674339018793L);
        term155501 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term155503 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term155519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155665 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155711 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term155501, term155501.getClass(), "id", -3023642624075318286L);
        setLongField(term155503, term155503.getClass(), "id", 5754464717374858428L);
        setField(term155503, term155503.getClass(), "extId", term155505);
        setField(term155503, term155503.getClass(), "luid", "WTJsUQWrPu");
        setIntField(term155520, term155520.getClass(), "year", 2013);
        setShortField(term155520, term155520.getClass(), "month", (short) 4);
        setShortField(term155520, term155520.getClass(), "day", (short) 10);
        setField(term155519, term155519.getClass(), "date", term155520);
        setByteField(term155524, term155524.getClass(), "hour", (byte) 1);
        setByteField(term155524, term155524.getClass(), "minute", (byte) 10);
        setByteField(term155524, term155524.getClass(), "second", (byte) 58);
        setIntField(term155524, term155524.getClass(), "nano", 540769197);
        setField(term155519, term155519.getClass(), "time", term155524);
        setField(term155503, term155503.getClass(), "registerTime", term155519);
        setIntField(term155530, term155530.getClass(), "year", 2020);
        setShortField(term155530, term155530.getClass(), "month", (short) 10);
        setShortField(term155530, term155530.getClass(), "day", (short) 31);
        setField(term155529, term155529.getClass(), "date", term155530);
        setByteField(term155534, term155534.getClass(), "hour", (byte) 22);
        setByteField(term155534, term155534.getClass(), "minute", (byte) 1);
        setByteField(term155534, term155534.getClass(), "second", (byte) 27);
        setIntField(term155534, term155534.getClass(), "nano", 980395107);
        setField(term155529, term155529.getClass(), "time", term155534);
        setField(term155503, term155503.getClass(), "accessTime", term155529);
        setField(term155501, term155501.getClass(), "card", term155503);
        setField(term155501, term155501.getClass(), "userName", "IwDJSFYrvd");
        setIntField(term155552, term155552.getClass(), "year", 2025);
        setShortField(term155552, term155552.getClass(), "month", (short) 4);
        setShortField(term155552, term155552.getClass(), "day", (short) 7);
        setField(term155551, term155551.getClass(), "date", term155552);
        setByteField(term155556, term155556.getClass(), "hour", (byte) 5);
        setByteField(term155556, term155556.getClass(), "minute", (byte) 0);
        setByteField(term155556, term155556.getClass(), "second", (byte) 51);
        setIntField(term155556, term155556.getClass(), "nano", 610088187);
        setField(term155551, term155551.getClass(), "time", term155556);
        setField(term155501, term155501.getClass(), "lastLoginDate", term155551);
        setBooleanField(term155501, term155501.getClass(), "isWebJoin", false);
        setField(term155501, term155501.getClass(), "webLimitDate", "zIcvqyfLta");
        setIntField(term155501, term155501.getClass(), "level", 314054661);
        setIntField(term155501, term155501.getClass(), "reincarnationNum", 766314597);
        setField(term155501, term155501.getClass(), "exp", "HAReZkXopn");
        setLongField(term155501, term155501.getClass(), "point", 1769538929299224531L);
        setLongField(term155501, term155501.getClass(), "totalPoint", 2744046861965577334L);
        setIntField(term155501, term155501.getClass(), "playCount", -826100649);
        setIntField(term155501, term155501.getClass(), "multiPlayCount", 213829504);
        setIntField(term155501, term155501.getClass(), "multiWinCount", -1256059099);
        setIntField(term155501, term155501.getClass(), "requestResCount", -1820372279);
        setIntField(term155501, term155501.getClass(), "acceptResCount", 720068302);
        setIntField(term155501, term155501.getClass(), "successResCount", 1790767972);
        setIntField(term155501, term155501.getClass(), "playerRating", 780675103);
        setIntField(term155501, term155501.getClass(), "highestRating", 714917997);
        setIntField(term155501, term155501.getClass(), "nameplateId", 713279805);
        setIntField(term155501, term155501.getClass(), "frameId", -374549938);
        setIntField(term155501, term155501.getClass(), "characterId", 1430439880);
        setIntField(term155501, term155501.getClass(), "trophyId", 1074274300);
        setIntField(term155501, term155501.getClass(), "playedTutorialBit", -1533339633);
        setIntField(term155501, term155501.getClass(), "firstTutorialCancelNum", -1306689076);
        setIntField(term155501, term155501.getClass(), "masterTutorialCancelNum", 801999249);
        setIntField(term155501, term155501.getClass(), "totalRepertoireCount", 406290178);
        setIntField(term155501, term155501.getClass(), "totalMapNum", 1328284951);
        setLongField(term155501, term155501.getClass(), "totalHiScore", 5536006113004390813L);
        setLongField(term155501, term155501.getClass(), "totalBasicHighScore", 7613276437096698267L);
        setLongField(term155501, term155501.getClass(), "totalAdvancedHighScore", -15012344473260735L);
        setLongField(term155501, term155501.getClass(), "totalExpertHighScore", -7302717476024398618L);
        setLongField(term155501, term155501.getClass(), "totalMasterHighScore", 6708116358743842821L);
        setIntField(term155613, term155613.getClass(), "year", 2011);
        setShortField(term155613, term155613.getClass(), "month", (short) 2);
        setShortField(term155613, term155613.getClass(), "day", (short) 26);
        setField(term155612, term155612.getClass(), "date", term155613);
        setByteField(term155617, term155617.getClass(), "hour", (byte) 2);
        setByteField(term155617, term155617.getClass(), "minute", (byte) 54);
        setByteField(term155617, term155617.getClass(), "second", (byte) 9);
        setIntField(term155617, term155617.getClass(), "nano", 978686488);
        setField(term155612, term155612.getClass(), "time", term155617);
        setField(term155501, term155501.getClass(), "eventWatchedDate", term155612);
        setIntField(term155501, term155501.getClass(), "friendCount", -490510770);
        setBooleanField(term155501, term155501.getClass(), "isMaimai", false);
        setField(term155501, term155501.getClass(), "firstGameId", "clSasMmBlm");
        setField(term155501, term155501.getClass(), "firstRomVersion", "BVIBVYApBG");
        setField(term155501, term155501.getClass(), "firstDataVersion", "rDMARKSlyU");
        setIntField(term155661, term155661.getClass(), "year", 2020);
        setShortField(term155661, term155661.getClass(), "month", (short) 3);
        setShortField(term155661, term155661.getClass(), "day", (short) 3);
        setField(term155660, term155660.getClass(), "date", term155661);
        setByteField(term155665, term155665.getClass(), "hour", (byte) 22);
        setByteField(term155665, term155665.getClass(), "minute", (byte) 16);
        setByteField(term155665, term155665.getClass(), "second", (byte) 37);
        setIntField(term155665, term155665.getClass(), "nano", 225262726);
        setField(term155660, term155660.getClass(), "time", term155665);
        setField(term155501, term155501.getClass(), "firstPlayDate", term155660);
        setField(term155501, term155501.getClass(), "lastGameId", "pdwBEXDsZz");
        setField(term155501, term155501.getClass(), "lastRomVersion", "ODCEExTkfn");
        setField(term155501, term155501.getClass(), "lastDataVersion", "WGInnBoBXb");
        setIntField(term155707, term155707.getClass(), "year", 2016);
        setShortField(term155707, term155707.getClass(), "month", (short) 12);
        setShortField(term155707, term155707.getClass(), "day", (short) 23);
        setField(term155706, term155706.getClass(), "date", term155707);
        setByteField(term155711, term155711.getClass(), "hour", (byte) 14);
        setByteField(term155711, term155711.getClass(), "minute", (byte) 10);
        setByteField(term155711, term155711.getClass(), "second", (byte) 45);
        setIntField(term155711, term155711.getClass(), "nano", 689700337);
        setField(term155706, term155706.getClass(), "time", term155711);
        setField(term155501, term155501.getClass(), "lastPlayDate", term155706);
        setIntField(term155501, term155501.getClass(), "lastPlaceId", -1154325713);
        setField(term155501, term155501.getClass(), "lastPlaceName", "zRdVDyYqUh");
        setField(term155501, term155501.getClass(), "lastRegionId", "hsHZkWJHpU");
        setField(term155501, term155501.getClass(), "lastRegionName", "jACNZKsTgs");
        setField(term155501, term155501.getClass(), "lastAllNetId", "gdXejOZMlf");
        setField(term155501, term155501.getClass(), "lastClientId", "FfDXECFXSk");
        term155777 = new Integer(-1075315005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term155777;
        callMethod(klass, "setPlayCount", argTypes, term155501, args);
    }

};


