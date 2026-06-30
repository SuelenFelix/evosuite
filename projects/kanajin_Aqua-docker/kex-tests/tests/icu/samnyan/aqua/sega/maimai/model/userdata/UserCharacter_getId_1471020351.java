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

public class UserCharacter_getId_1471020351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32863;

    public UserCharacter_getId_1471020351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32869 = new Long(7276637106827860087L);
        term32863 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term32865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term32867 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term32883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32898 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term32863, term32863.getClass(), "id", 2191130532479601175L);
        setLongField(term32865, term32865.getClass(), "id", 860079646007397083L);
        setLongField(term32867, term32867.getClass(), "id", 3230472384687362867L);
        setField(term32867, term32867.getClass(), "extId", term32869);
        setField(term32867, term32867.getClass(), "luid", "vjNPcTSqmS");
        setIntField(term32884, term32884.getClass(), "year", 2012);
        setShortField(term32884, term32884.getClass(), "month", (short) 6);
        setShortField(term32884, term32884.getClass(), "day", (short) 24);
        setField(term32883, term32883.getClass(), "date", term32884);
        setByteField(term32888, term32888.getClass(), "hour", (byte) 23);
        setByteField(term32888, term32888.getClass(), "minute", (byte) 9);
        setByteField(term32888, term32888.getClass(), "second", (byte) 32);
        setIntField(term32888, term32888.getClass(), "nano", 933669930);
        setField(term32883, term32883.getClass(), "time", term32888);
        setField(term32867, term32867.getClass(), "registerTime", term32883);
        setIntField(term32894, term32894.getClass(), "year", 2013);
        setShortField(term32894, term32894.getClass(), "month", (short) 9);
        setShortField(term32894, term32894.getClass(), "day", (short) 29);
        setField(term32893, term32893.getClass(), "date", term32894);
        setByteField(term32898, term32898.getClass(), "hour", (byte) 18);
        setByteField(term32898, term32898.getClass(), "minute", (byte) 32);
        setByteField(term32898, term32898.getClass(), "second", (byte) 59);
        setIntField(term32898, term32898.getClass(), "nano", 213125607);
        setField(term32893, term32893.getClass(), "time", term32898);
        setField(term32867, term32867.getClass(), "accessTime", term32893);
        setField(term32865, term32865.getClass(), "card", term32867);
        setIntField(term32865, term32865.getClass(), "lastDataVersion", -583361854);
        setField(term32865, term32865.getClass(), "userName", "fFhdWuJbdC");
        setIntField(term32865, term32865.getClass(), "point", 717140857);
        setIntField(term32865, term32865.getClass(), "totalPoint", 891889211);
        setIntField(term32865, term32865.getClass(), "iconId", 265502816);
        setIntField(term32865, term32865.getClass(), "nameplateId", -1730476579);
        setIntField(term32865, term32865.getClass(), "frameId", -1501333599);
        setIntField(term32865, term32865.getClass(), "trophyId", 1525193088);
        setIntField(term32865, term32865.getClass(), "playCount", 1734906845);
        setIntField(term32865, term32865.getClass(), "playVsCount", 678776902);
        setIntField(term32865, term32865.getClass(), "playSyncCount", -1148076813);
        setIntField(term32865, term32865.getClass(), "winCount", 1450586432);
        setIntField(term32865, term32865.getClass(), "helpCount", 1726648633);
        setIntField(term32865, term32865.getClass(), "comboCount", 859999867);
        setIntField(term32865, term32865.getClass(), "feverCount", 469845570);
        setIntField(term32865, term32865.getClass(), "totalHiScore", 1192737321);
        setIntField(term32865, term32865.getClass(), "totalEasyHighScore", 827191651);
        setIntField(term32865, term32865.getClass(), "totalBasicHighScore", -432140549);
        setIntField(term32865, term32865.getClass(), "totalAdvancedHighScore", -1134516117);
        setIntField(term32865, term32865.getClass(), "totalExpertHighScore", 1618532335);
        setIntField(term32865, term32865.getClass(), "totalMasterHighScore", 1620043047);
        setIntField(term32865, term32865.getClass(), "totalReMasterHighScore", -1329172198);
        setIntField(term32865, term32865.getClass(), "totalHighSync", -1036092775);
        setIntField(term32865, term32865.getClass(), "totalEasySync", 857844283);
        setIntField(term32865, term32865.getClass(), "totalBasicSync", 559778075);
        setIntField(term32865, term32865.getClass(), "totalAdvancedSync", 188273941);
        setIntField(term32865, term32865.getClass(), "totalExpertSync", 736020163);
        setIntField(term32865, term32865.getClass(), "totalMasterSync", 1233013986);
        setIntField(term32865, term32865.getClass(), "totalReMasterSync", 342111166);
        setIntField(term32865, term32865.getClass(), "playerRating", -846825115);
        setIntField(term32865, term32865.getClass(), "highestRating", -88572295);
        setIntField(term32865, term32865.getClass(), "rankAuthTailId", -1830705318);
        setField(term32865, term32865.getClass(), "eventWatchedDate", "JlgLIHPabR");
        setField(term32865, term32865.getClass(), "webLimitDate", "LHnkeoNwHq");
        setIntField(term32865, term32865.getClass(), "challengeTrackPhase", 1003880925);
        setIntField(term32865, term32865.getClass(), "firstPlayBits", -1963566761);
        setField(term32865, term32865.getClass(), "lastPlayDate", "gVnDVbSyKa");
        setIntField(term32865, term32865.getClass(), "lastPlaceId", -1043400736);
        setField(term32865, term32865.getClass(), "lastPlaceName", "kdCYNMSuoD");
        setIntField(term32865, term32865.getClass(), "lastRegionId", 497106793);
        setField(term32865, term32865.getClass(), "lastRegionName", "eRYlSLwtvV");
        setField(term32865, term32865.getClass(), "lastClientId", "duOyJsARTD");
        setField(term32865, term32865.getClass(), "lastCountryCode", "xPnOHsNlyc");
        setIntField(term32865, term32865.getClass(), "eventPoint", -1904196296);
        setIntField(term32865, term32865.getClass(), "totalLv", -1857445668);
        setIntField(term32865, term32865.getClass(), "lastLoginBonusDay", -1481132293);
        setIntField(term32865, term32865.getClass(), "lastSurvivalBonusDay", -1458633954);
        setIntField(term32865, term32865.getClass(), "loginBonusLv", 1334294885);
        setField(term32863, term32863.getClass(), "user", term32865);
        setIntField(term32863, term32863.getClass(), "characterId", -711784035);
        setIntField(term32863, term32863.getClass(), "point", -497219797);
        setIntField(term32863, term32863.getClass(), "level", 720453125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term32863, args);
    }

};


