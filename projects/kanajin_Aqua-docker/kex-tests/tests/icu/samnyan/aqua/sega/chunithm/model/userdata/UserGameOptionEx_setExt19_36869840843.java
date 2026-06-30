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

public class UserGameOptionEx_setExt19_36869840843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329311;
     Object term329609;

    public UserGameOptionEx_setExt19_36869840843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term329317 = new Long(7450182989722198450L);
        term329311 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term329313 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term329315 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term329331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329346 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329523 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term329311, term329311.getClass(), "id", 3404140293557584459L);
        setLongField(term329313, term329313.getClass(), "id", 4367141646424029218L);
        setLongField(term329315, term329315.getClass(), "id", -2295495097049715790L);
        setField(term329315, term329315.getClass(), "extId", term329317);
        setField(term329315, term329315.getClass(), "luid", "dFmJxbLTYH");
        setIntField(term329332, term329332.getClass(), "year", 2029);
        setShortField(term329332, term329332.getClass(), "month", (short) 11);
        setShortField(term329332, term329332.getClass(), "day", (short) 4);
        setField(term329331, term329331.getClass(), "date", term329332);
        setByteField(term329336, term329336.getClass(), "hour", (byte) 9);
        setByteField(term329336, term329336.getClass(), "minute", (byte) 50);
        setByteField(term329336, term329336.getClass(), "second", (byte) 2);
        setIntField(term329336, term329336.getClass(), "nano", 545864308);
        setField(term329331, term329331.getClass(), "time", term329336);
        setField(term329315, term329315.getClass(), "registerTime", term329331);
        setIntField(term329342, term329342.getClass(), "year", 2028);
        setShortField(term329342, term329342.getClass(), "month", (short) 12);
        setShortField(term329342, term329342.getClass(), "day", (short) 19);
        setField(term329341, term329341.getClass(), "date", term329342);
        setByteField(term329346, term329346.getClass(), "hour", (byte) 13);
        setByteField(term329346, term329346.getClass(), "minute", (byte) 17);
        setByteField(term329346, term329346.getClass(), "second", (byte) 9);
        setIntField(term329346, term329346.getClass(), "nano", 423179871);
        setField(term329341, term329341.getClass(), "time", term329346);
        setField(term329315, term329315.getClass(), "accessTime", term329341);
        setField(term329313, term329313.getClass(), "card", term329315);
        setField(term329313, term329313.getClass(), "userName", "XFMEZbiUJt");
        setIntField(term329364, term329364.getClass(), "year", 2023);
        setShortField(term329364, term329364.getClass(), "month", (short) 1);
        setShortField(term329364, term329364.getClass(), "day", (short) 11);
        setField(term329363, term329363.getClass(), "date", term329364);
        setByteField(term329368, term329368.getClass(), "hour", (byte) 14);
        setByteField(term329368, term329368.getClass(), "minute", (byte) 22);
        setByteField(term329368, term329368.getClass(), "second", (byte) 10);
        setIntField(term329368, term329368.getClass(), "nano", 899008434);
        setField(term329363, term329363.getClass(), "time", term329368);
        setField(term329313, term329313.getClass(), "lastLoginDate", term329363);
        setBooleanField(term329313, term329313.getClass(), "isWebJoin", true);
        setField(term329313, term329313.getClass(), "webLimitDate", "bMUTgRJrfr");
        setIntField(term329313, term329313.getClass(), "level", 1276267490);
        setIntField(term329313, term329313.getClass(), "reincarnationNum", 1539388177);
        setField(term329313, term329313.getClass(), "exp", "AiITUhJkJU");
        setLongField(term329313, term329313.getClass(), "point", 6561564014211458803L);
        setLongField(term329313, term329313.getClass(), "totalPoint", 8887091749598931285L);
        setIntField(term329313, term329313.getClass(), "playCount", -1014299388);
        setIntField(term329313, term329313.getClass(), "multiPlayCount", 2074003232);
        setIntField(term329313, term329313.getClass(), "multiWinCount", 906827712);
        setIntField(term329313, term329313.getClass(), "requestResCount", 1397267544);
        setIntField(term329313, term329313.getClass(), "acceptResCount", -1603972719);
        setIntField(term329313, term329313.getClass(), "successResCount", -1154654443);
        setIntField(term329313, term329313.getClass(), "playerRating", 1645846345);
        setIntField(term329313, term329313.getClass(), "highestRating", -803632373);
        setIntField(term329313, term329313.getClass(), "nameplateId", -725034951);
        setIntField(term329313, term329313.getClass(), "frameId", 54566490);
        setIntField(term329313, term329313.getClass(), "characterId", -243245256);
        setIntField(term329313, term329313.getClass(), "trophyId", 988657359);
        setIntField(term329313, term329313.getClass(), "playedTutorialBit", 1436654145);
        setIntField(term329313, term329313.getClass(), "firstTutorialCancelNum", 1776603374);
        setIntField(term329313, term329313.getClass(), "masterTutorialCancelNum", -2105010810);
        setIntField(term329313, term329313.getClass(), "totalRepertoireCount", 1181204338);
        setIntField(term329313, term329313.getClass(), "totalMapNum", 508081446);
        setLongField(term329313, term329313.getClass(), "totalHiScore", 8571127439910031865L);
        setLongField(term329313, term329313.getClass(), "totalBasicHighScore", -691540277685530027L);
        setLongField(term329313, term329313.getClass(), "totalAdvancedHighScore", -3455464316097576650L);
        setLongField(term329313, term329313.getClass(), "totalExpertHighScore", 5727167095354223682L);
        setLongField(term329313, term329313.getClass(), "totalMasterHighScore", 1228393249690916449L);
        setIntField(term329425, term329425.getClass(), "year", 2015);
        setShortField(term329425, term329425.getClass(), "month", (short) 1);
        setShortField(term329425, term329425.getClass(), "day", (short) 21);
        setField(term329424, term329424.getClass(), "date", term329425);
        setByteField(term329429, term329429.getClass(), "hour", (byte) 0);
        setByteField(term329429, term329429.getClass(), "minute", (byte) 42);
        setByteField(term329429, term329429.getClass(), "second", (byte) 13);
        setIntField(term329429, term329429.getClass(), "nano", 843937809);
        setField(term329424, term329424.getClass(), "time", term329429);
        setField(term329313, term329313.getClass(), "eventWatchedDate", term329424);
        setIntField(term329313, term329313.getClass(), "friendCount", 376898409);
        setBooleanField(term329313, term329313.getClass(), "isMaimai", true);
        setField(term329313, term329313.getClass(), "firstGameId", "vrdcxFmoiP");
        setField(term329313, term329313.getClass(), "firstRomVersion", "GtvElQvKPH");
        setField(term329313, term329313.getClass(), "firstDataVersion", "cOSgncciPE");
        setIntField(term329473, term329473.getClass(), "year", 2013);
        setShortField(term329473, term329473.getClass(), "month", (short) 6);
        setShortField(term329473, term329473.getClass(), "day", (short) 11);
        setField(term329472, term329472.getClass(), "date", term329473);
        setByteField(term329477, term329477.getClass(), "hour", (byte) 13);
        setByteField(term329477, term329477.getClass(), "minute", (byte) 40);
        setByteField(term329477, term329477.getClass(), "second", (byte) 35);
        setIntField(term329477, term329477.getClass(), "nano", 823836483);
        setField(term329472, term329472.getClass(), "time", term329477);
        setField(term329313, term329313.getClass(), "firstPlayDate", term329472);
        setField(term329313, term329313.getClass(), "lastGameId", "DsuqUYdhHr");
        setField(term329313, term329313.getClass(), "lastRomVersion", "zydfWNkGTk");
        setField(term329313, term329313.getClass(), "lastDataVersion", "JQUYGZnGvW");
        setIntField(term329519, term329519.getClass(), "year", 2014);
        setShortField(term329519, term329519.getClass(), "month", (short) 12);
        setShortField(term329519, term329519.getClass(), "day", (short) 29);
        setField(term329518, term329518.getClass(), "date", term329519);
        setByteField(term329523, term329523.getClass(), "hour", (byte) 6);
        setByteField(term329523, term329523.getClass(), "minute", (byte) 31);
        setByteField(term329523, term329523.getClass(), "second", (byte) 26);
        setIntField(term329523, term329523.getClass(), "nano", 1123560);
        setField(term329518, term329518.getClass(), "time", term329523);
        setField(term329313, term329313.getClass(), "lastPlayDate", term329518);
        setIntField(term329313, term329313.getClass(), "lastPlaceId", 1386885355);
        setField(term329313, term329313.getClass(), "lastPlaceName", "tnkxAtWMbF");
        setField(term329313, term329313.getClass(), "lastRegionId", "XKUBaukekX");
        setField(term329313, term329313.getClass(), "lastRegionName", "IYWVYrRcKf");
        setField(term329313, term329313.getClass(), "lastAllNetId", "gVkscSyrAF");
        setField(term329313, term329313.getClass(), "lastClientId", "iEhjaMuTSF");
        setField(term329311, term329311.getClass(), "user", term329313);
        setIntField(term329311, term329311.getClass(), "ext1", -515424228);
        setIntField(term329311, term329311.getClass(), "ext2", -438220867);
        setIntField(term329311, term329311.getClass(), "ext3", 1698753362);
        setIntField(term329311, term329311.getClass(), "ext4", -2145373019);
        setIntField(term329311, term329311.getClass(), "ext5", 401498563);
        setIntField(term329311, term329311.getClass(), "ext6", -1044642405);
        setIntField(term329311, term329311.getClass(), "ext7", 444235950);
        setIntField(term329311, term329311.getClass(), "ext8", 503125111);
        setIntField(term329311, term329311.getClass(), "ext9", -1215717148);
        setIntField(term329311, term329311.getClass(), "ext10", -1294590794);
        setIntField(term329311, term329311.getClass(), "ext11", -1898767144);
        setIntField(term329311, term329311.getClass(), "ext12", -1615737612);
        setIntField(term329311, term329311.getClass(), "ext13", -1929266577);
        setIntField(term329311, term329311.getClass(), "ext14", -693218996);
        setIntField(term329311, term329311.getClass(), "ext15", 1600991895);
        setIntField(term329311, term329311.getClass(), "ext16", -116605955);
        setIntField(term329311, term329311.getClass(), "ext17", 2146104322);
        setIntField(term329311, term329311.getClass(), "ext18", -2114620413);
        setIntField(term329311, term329311.getClass(), "ext19", 1985278829);
        setIntField(term329311, term329311.getClass(), "ext20", 314015111);
        term329609 = new Integer(-1121701030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term329609;
        callMethod(klass, "setExt19", argTypes, term329311, args);
    }

};


