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

public class UserBoss_setPandoraFlagList1_177201291414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93051;
     Object term93235;

    public UserBoss_setPandoraFlagList1_177201291414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93057 = new Long(-7709317346333670618L);
        term93051 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term93053 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term93055 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93086 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term93051, term93051.getClass(), "id", 8542753860527083778L);
        setLongField(term93053, term93053.getClass(), "id", -7981877752051488010L);
        setLongField(term93055, term93055.getClass(), "id", 4486175312218543930L);
        setField(term93055, term93055.getClass(), "extId", term93057);
        setField(term93055, term93055.getClass(), "luid", "IvxbsFCczM");
        setIntField(term93072, term93072.getClass(), "year", 2016);
        setShortField(term93072, term93072.getClass(), "month", (short) 9);
        setShortField(term93072, term93072.getClass(), "day", (short) 8);
        setField(term93071, term93071.getClass(), "date", term93072);
        setByteField(term93076, term93076.getClass(), "hour", (byte) 12);
        setByteField(term93076, term93076.getClass(), "minute", (byte) 9);
        setByteField(term93076, term93076.getClass(), "second", (byte) 23);
        setIntField(term93076, term93076.getClass(), "nano", 697344055);
        setField(term93071, term93071.getClass(), "time", term93076);
        setField(term93055, term93055.getClass(), "registerTime", term93071);
        setIntField(term93082, term93082.getClass(), "year", 2023);
        setShortField(term93082, term93082.getClass(), "month", (short) 12);
        setShortField(term93082, term93082.getClass(), "day", (short) 19);
        setField(term93081, term93081.getClass(), "date", term93082);
        setByteField(term93086, term93086.getClass(), "hour", (byte) 20);
        setByteField(term93086, term93086.getClass(), "minute", (byte) 30);
        setByteField(term93086, term93086.getClass(), "second", (byte) 13);
        setIntField(term93086, term93086.getClass(), "nano", 525415298);
        setField(term93081, term93081.getClass(), "time", term93086);
        setField(term93055, term93055.getClass(), "accessTime", term93081);
        setField(term93053, term93053.getClass(), "card", term93055);
        setIntField(term93053, term93053.getClass(), "lastDataVersion", -2065117323);
        setField(term93053, term93053.getClass(), "userName", "GkAaLUoaoL");
        setIntField(term93053, term93053.getClass(), "point", 1455954533);
        setIntField(term93053, term93053.getClass(), "totalPoint", 596927400);
        setIntField(term93053, term93053.getClass(), "iconId", 717640575);
        setIntField(term93053, term93053.getClass(), "nameplateId", 1377342355);
        setIntField(term93053, term93053.getClass(), "frameId", 303367492);
        setIntField(term93053, term93053.getClass(), "trophyId", -1689842535);
        setIntField(term93053, term93053.getClass(), "playCount", 1550009784);
        setIntField(term93053, term93053.getClass(), "playVsCount", -1322057757);
        setIntField(term93053, term93053.getClass(), "playSyncCount", 106608060);
        setIntField(term93053, term93053.getClass(), "winCount", -97528141);
        setIntField(term93053, term93053.getClass(), "helpCount", 103420135);
        setIntField(term93053, term93053.getClass(), "comboCount", 998281573);
        setIntField(term93053, term93053.getClass(), "feverCount", 1538565026);
        setIntField(term93053, term93053.getClass(), "totalHiScore", 1510446613);
        setIntField(term93053, term93053.getClass(), "totalEasyHighScore", -591217691);
        setIntField(term93053, term93053.getClass(), "totalBasicHighScore", -1436479682);
        setIntField(term93053, term93053.getClass(), "totalAdvancedHighScore", -87850160);
        setIntField(term93053, term93053.getClass(), "totalExpertHighScore", 2100422614);
        setIntField(term93053, term93053.getClass(), "totalMasterHighScore", 95434101);
        setIntField(term93053, term93053.getClass(), "totalReMasterHighScore", 1578254763);
        setIntField(term93053, term93053.getClass(), "totalHighSync", -1197972603);
        setIntField(term93053, term93053.getClass(), "totalEasySync", 82035733);
        setIntField(term93053, term93053.getClass(), "totalBasicSync", -815104311);
        setIntField(term93053, term93053.getClass(), "totalAdvancedSync", -323574733);
        setIntField(term93053, term93053.getClass(), "totalExpertSync", -1600567927);
        setIntField(term93053, term93053.getClass(), "totalMasterSync", -1051157170);
        setIntField(term93053, term93053.getClass(), "totalReMasterSync", 1267890763);
        setIntField(term93053, term93053.getClass(), "playerRating", -354908388);
        setIntField(term93053, term93053.getClass(), "highestRating", -1823173740);
        setIntField(term93053, term93053.getClass(), "rankAuthTailId", 711565551);
        setField(term93053, term93053.getClass(), "eventWatchedDate", "VSmPzUiFzd");
        setField(term93053, term93053.getClass(), "webLimitDate", "bLpZNCaWDB");
        setIntField(term93053, term93053.getClass(), "challengeTrackPhase", 1808622233);
        setIntField(term93053, term93053.getClass(), "firstPlayBits", -1854319585);
        setField(term93053, term93053.getClass(), "lastPlayDate", "knmwCEeMTY");
        setIntField(term93053, term93053.getClass(), "lastPlaceId", 548084080);
        setField(term93053, term93053.getClass(), "lastPlaceName", "qTiIgMQXbW");
        setIntField(term93053, term93053.getClass(), "lastRegionId", 1744825642);
        setField(term93053, term93053.getClass(), "lastRegionName", "rARmHDyRHE");
        setField(term93053, term93053.getClass(), "lastClientId", "bvybTJUNMY");
        setField(term93053, term93053.getClass(), "lastCountryCode", "MoGyMoOkMi");
        setIntField(term93053, term93053.getClass(), "eventPoint", -1372443184);
        setIntField(term93053, term93053.getClass(), "totalLv", -360453538);
        setIntField(term93053, term93053.getClass(), "lastLoginBonusDay", -1878105251);
        setIntField(term93053, term93053.getClass(), "lastSurvivalBonusDay", 269733901);
        setIntField(term93053, term93053.getClass(), "loginBonusLv", -736927476);
        setField(term93051, term93051.getClass(), "user", term93053);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList0", -5866516262253090421L);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList1", -4336769198128902991L);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList2", -3441020756295150684L);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList3", -2938034344303060228L);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList4", -758819117507836512L);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList5", -1855660992126411308L);
        setLongField(term93051, term93051.getClass(), "pandoraFlagList6", -6435676296015352817L);
        setLongField(term93051, term93051.getClass(), "emblemFlagList", -3817606000638396608L);
        term93235 = new Long(-1435639144971145612L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term93235;
        callMethod(klass, "setPandoraFlagList1", argTypes, term93051, args);
    }

};


