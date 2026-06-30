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

public class UserGameOptionEx_setExt17_36869648641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328411;
     Object term328709;

    public UserGameOptionEx_setExt17_36869648641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term328417 = new Long(4872921045907555824L);
        term328411 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term328413 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term328415 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term328431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328446 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328468 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328577 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328623 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term328411, term328411.getClass(), "id", -1243122150545245871L);
        setLongField(term328413, term328413.getClass(), "id", -220453106544991490L);
        setLongField(term328415, term328415.getClass(), "id", -3227110689773365428L);
        setField(term328415, term328415.getClass(), "extId", term328417);
        setField(term328415, term328415.getClass(), "luid", "PYGbHSlLQs");
        setIntField(term328432, term328432.getClass(), "year", 2011);
        setShortField(term328432, term328432.getClass(), "month", (short) 5);
        setShortField(term328432, term328432.getClass(), "day", (short) 8);
        setField(term328431, term328431.getClass(), "date", term328432);
        setByteField(term328436, term328436.getClass(), "hour", (byte) 20);
        setByteField(term328436, term328436.getClass(), "minute", (byte) 51);
        setByteField(term328436, term328436.getClass(), "second", (byte) 31);
        setIntField(term328436, term328436.getClass(), "nano", 242825444);
        setField(term328431, term328431.getClass(), "time", term328436);
        setField(term328415, term328415.getClass(), "registerTime", term328431);
        setIntField(term328442, term328442.getClass(), "year", 2021);
        setShortField(term328442, term328442.getClass(), "month", (short) 2);
        setShortField(term328442, term328442.getClass(), "day", (short) 5);
        setField(term328441, term328441.getClass(), "date", term328442);
        setByteField(term328446, term328446.getClass(), "hour", (byte) 11);
        setByteField(term328446, term328446.getClass(), "minute", (byte) 8);
        setByteField(term328446, term328446.getClass(), "second", (byte) 32);
        setIntField(term328446, term328446.getClass(), "nano", 144659221);
        setField(term328441, term328441.getClass(), "time", term328446);
        setField(term328415, term328415.getClass(), "accessTime", term328441);
        setField(term328413, term328413.getClass(), "card", term328415);
        setField(term328413, term328413.getClass(), "userName", "tKIPCrqYcE");
        setIntField(term328464, term328464.getClass(), "year", 2015);
        setShortField(term328464, term328464.getClass(), "month", (short) 12);
        setShortField(term328464, term328464.getClass(), "day", (short) 18);
        setField(term328463, term328463.getClass(), "date", term328464);
        setByteField(term328468, term328468.getClass(), "hour", (byte) 21);
        setByteField(term328468, term328468.getClass(), "minute", (byte) 25);
        setByteField(term328468, term328468.getClass(), "second", (byte) 28);
        setIntField(term328468, term328468.getClass(), "nano", 664133055);
        setField(term328463, term328463.getClass(), "time", term328468);
        setField(term328413, term328413.getClass(), "lastLoginDate", term328463);
        setBooleanField(term328413, term328413.getClass(), "isWebJoin", false);
        setField(term328413, term328413.getClass(), "webLimitDate", "epiSKrHTNO");
        setIntField(term328413, term328413.getClass(), "level", 393511944);
        setIntField(term328413, term328413.getClass(), "reincarnationNum", -829559848);
        setField(term328413, term328413.getClass(), "exp", "WFOEQjkbXp");
        setLongField(term328413, term328413.getClass(), "point", -2520438920123335755L);
        setLongField(term328413, term328413.getClass(), "totalPoint", -4660168183529399369L);
        setIntField(term328413, term328413.getClass(), "playCount", 674370223);
        setIntField(term328413, term328413.getClass(), "multiPlayCount", 1667723550);
        setIntField(term328413, term328413.getClass(), "multiWinCount", 1605590859);
        setIntField(term328413, term328413.getClass(), "requestResCount", 121161260);
        setIntField(term328413, term328413.getClass(), "acceptResCount", 117481309);
        setIntField(term328413, term328413.getClass(), "successResCount", 1993168996);
        setIntField(term328413, term328413.getClass(), "playerRating", 951239293);
        setIntField(term328413, term328413.getClass(), "highestRating", -255324540);
        setIntField(term328413, term328413.getClass(), "nameplateId", 1090348247);
        setIntField(term328413, term328413.getClass(), "frameId", 1680192191);
        setIntField(term328413, term328413.getClass(), "characterId", 295190981);
        setIntField(term328413, term328413.getClass(), "trophyId", -1492427400);
        setIntField(term328413, term328413.getClass(), "playedTutorialBit", 884288171);
        setIntField(term328413, term328413.getClass(), "firstTutorialCancelNum", 1319605673);
        setIntField(term328413, term328413.getClass(), "masterTutorialCancelNum", -1516059020);
        setIntField(term328413, term328413.getClass(), "totalRepertoireCount", 397981508);
        setIntField(term328413, term328413.getClass(), "totalMapNum", -1333512086);
        setLongField(term328413, term328413.getClass(), "totalHiScore", -6630336192289713270L);
        setLongField(term328413, term328413.getClass(), "totalBasicHighScore", 8056653133846760866L);
        setLongField(term328413, term328413.getClass(), "totalAdvancedHighScore", 3965567100905628136L);
        setLongField(term328413, term328413.getClass(), "totalExpertHighScore", -7834143844726848544L);
        setLongField(term328413, term328413.getClass(), "totalMasterHighScore", -9139306278104558329L);
        setIntField(term328525, term328525.getClass(), "year", 2010);
        setShortField(term328525, term328525.getClass(), "month", (short) 7);
        setShortField(term328525, term328525.getClass(), "day", (short) 13);
        setField(term328524, term328524.getClass(), "date", term328525);
        setByteField(term328529, term328529.getClass(), "hour", (byte) 9);
        setByteField(term328529, term328529.getClass(), "minute", (byte) 48);
        setByteField(term328529, term328529.getClass(), "second", (byte) 23);
        setIntField(term328529, term328529.getClass(), "nano", 310667587);
        setField(term328524, term328524.getClass(), "time", term328529);
        setField(term328413, term328413.getClass(), "eventWatchedDate", term328524);
        setIntField(term328413, term328413.getClass(), "friendCount", -1753703153);
        setBooleanField(term328413, term328413.getClass(), "isMaimai", true);
        setField(term328413, term328413.getClass(), "firstGameId", "BlZJucuIKY");
        setField(term328413, term328413.getClass(), "firstRomVersion", "LFHcFsKeGk");
        setField(term328413, term328413.getClass(), "firstDataVersion", "imfDJZDBWh");
        setIntField(term328573, term328573.getClass(), "year", 2023);
        setShortField(term328573, term328573.getClass(), "month", (short) 10);
        setShortField(term328573, term328573.getClass(), "day", (short) 21);
        setField(term328572, term328572.getClass(), "date", term328573);
        setByteField(term328577, term328577.getClass(), "hour", (byte) 10);
        setByteField(term328577, term328577.getClass(), "minute", (byte) 31);
        setByteField(term328577, term328577.getClass(), "second", (byte) 9);
        setIntField(term328577, term328577.getClass(), "nano", 660510518);
        setField(term328572, term328572.getClass(), "time", term328577);
        setField(term328413, term328413.getClass(), "firstPlayDate", term328572);
        setField(term328413, term328413.getClass(), "lastGameId", "QJmtwzmUnd");
        setField(term328413, term328413.getClass(), "lastRomVersion", "DCUNPyCrFE");
        setField(term328413, term328413.getClass(), "lastDataVersion", "BxbGKzqjgJ");
        setIntField(term328619, term328619.getClass(), "year", 2012);
        setShortField(term328619, term328619.getClass(), "month", (short) 1);
        setShortField(term328619, term328619.getClass(), "day", (short) 24);
        setField(term328618, term328618.getClass(), "date", term328619);
        setByteField(term328623, term328623.getClass(), "hour", (byte) 10);
        setByteField(term328623, term328623.getClass(), "minute", (byte) 42);
        setByteField(term328623, term328623.getClass(), "second", (byte) 15);
        setIntField(term328623, term328623.getClass(), "nano", 531328544);
        setField(term328618, term328618.getClass(), "time", term328623);
        setField(term328413, term328413.getClass(), "lastPlayDate", term328618);
        setIntField(term328413, term328413.getClass(), "lastPlaceId", 1023725891);
        setField(term328413, term328413.getClass(), "lastPlaceName", "xcpoffFZBm");
        setField(term328413, term328413.getClass(), "lastRegionId", "FNxQNaLXgf");
        setField(term328413, term328413.getClass(), "lastRegionName", "FuNTofkcKF");
        setField(term328413, term328413.getClass(), "lastAllNetId", "JcGIJVAGEN");
        setField(term328413, term328413.getClass(), "lastClientId", "KqIlQkMfyL");
        setField(term328411, term328411.getClass(), "user", term328413);
        setIntField(term328411, term328411.getClass(), "ext1", -980165954);
        setIntField(term328411, term328411.getClass(), "ext2", -1137562740);
        setIntField(term328411, term328411.getClass(), "ext3", -1654532760);
        setIntField(term328411, term328411.getClass(), "ext4", -106292001);
        setIntField(term328411, term328411.getClass(), "ext5", 1380387716);
        setIntField(term328411, term328411.getClass(), "ext6", -1881487472);
        setIntField(term328411, term328411.getClass(), "ext7", 572568329);
        setIntField(term328411, term328411.getClass(), "ext8", -1839831897);
        setIntField(term328411, term328411.getClass(), "ext9", 96586612);
        setIntField(term328411, term328411.getClass(), "ext10", -523164569);
        setIntField(term328411, term328411.getClass(), "ext11", -1627411785);
        setIntField(term328411, term328411.getClass(), "ext12", 1898140596);
        setIntField(term328411, term328411.getClass(), "ext13", -1102760096);
        setIntField(term328411, term328411.getClass(), "ext14", -1071849710);
        setIntField(term328411, term328411.getClass(), "ext15", -1996013699);
        setIntField(term328411, term328411.getClass(), "ext16", 1715462169);
        setIntField(term328411, term328411.getClass(), "ext17", 311229186);
        setIntField(term328411, term328411.getClass(), "ext18", 1845964937);
        setIntField(term328411, term328411.getClass(), "ext19", -120481344);
        setIntField(term328411, term328411.getClass(), "ext20", -718039445);
        term328709 = new Integer(587141165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term328709;
        callMethod(klass, "setExt17", argTypes, term328411, args);
    }

};


