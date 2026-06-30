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

public class UserData_setTotalEasyHighScore_202808334968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18053;
     Object term18227;

    public UserData_setTotalEasyHighScore_202808334968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18057 = new Long(-8654565919063661957L);
        term18053 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term18055 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18086 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18053, term18053.getClass(), "id", 8802866251294305945L);
        setLongField(term18055, term18055.getClass(), "id", 4513004407927379358L);
        setField(term18055, term18055.getClass(), "extId", term18057);
        setField(term18055, term18055.getClass(), "luid", "gYTIkBFOoS");
        setIntField(term18072, term18072.getClass(), "year", 2010);
        setShortField(term18072, term18072.getClass(), "month", (short) 3);
        setShortField(term18072, term18072.getClass(), "day", (short) 11);
        setField(term18071, term18071.getClass(), "date", term18072);
        setByteField(term18076, term18076.getClass(), "hour", (byte) 0);
        setByteField(term18076, term18076.getClass(), "minute", (byte) 21);
        setByteField(term18076, term18076.getClass(), "second", (byte) 25);
        setIntField(term18076, term18076.getClass(), "nano", 201315999);
        setField(term18071, term18071.getClass(), "time", term18076);
        setField(term18055, term18055.getClass(), "registerTime", term18071);
        setIntField(term18082, term18082.getClass(), "year", 2016);
        setShortField(term18082, term18082.getClass(), "month", (short) 8);
        setShortField(term18082, term18082.getClass(), "day", (short) 24);
        setField(term18081, term18081.getClass(), "date", term18082);
        setByteField(term18086, term18086.getClass(), "hour", (byte) 22);
        setByteField(term18086, term18086.getClass(), "minute", (byte) 25);
        setByteField(term18086, term18086.getClass(), "second", (byte) 3);
        setIntField(term18086, term18086.getClass(), "nano", 185613519);
        setField(term18081, term18081.getClass(), "time", term18086);
        setField(term18055, term18055.getClass(), "accessTime", term18081);
        setField(term18053, term18053.getClass(), "card", term18055);
        setIntField(term18053, term18053.getClass(), "lastDataVersion", 36785954);
        setField(term18053, term18053.getClass(), "userName", "xmzSoVgiED");
        setIntField(term18053, term18053.getClass(), "point", -907057089);
        setIntField(term18053, term18053.getClass(), "totalPoint", -1740998635);
        setIntField(term18053, term18053.getClass(), "iconId", 183857482);
        setIntField(term18053, term18053.getClass(), "nameplateId", -1845135476);
        setIntField(term18053, term18053.getClass(), "frameId", -811321521);
        setIntField(term18053, term18053.getClass(), "trophyId", 449172516);
        setIntField(term18053, term18053.getClass(), "playCount", -1224535182);
        setIntField(term18053, term18053.getClass(), "playVsCount", 1181771633);
        setIntField(term18053, term18053.getClass(), "playSyncCount", -21975974);
        setIntField(term18053, term18053.getClass(), "winCount", -862969915);
        setIntField(term18053, term18053.getClass(), "helpCount", -1289681614);
        setIntField(term18053, term18053.getClass(), "comboCount", 496461454);
        setIntField(term18053, term18053.getClass(), "feverCount", -697047947);
        setIntField(term18053, term18053.getClass(), "totalHiScore", 505327656);
        setIntField(term18053, term18053.getClass(), "totalEasyHighScore", 1779734830);
        setIntField(term18053, term18053.getClass(), "totalBasicHighScore", -714618793);
        setIntField(term18053, term18053.getClass(), "totalAdvancedHighScore", 1350743761);
        setIntField(term18053, term18053.getClass(), "totalExpertHighScore", -2100246850);
        setIntField(term18053, term18053.getClass(), "totalMasterHighScore", 174682854);
        setIntField(term18053, term18053.getClass(), "totalReMasterHighScore", -1618786023);
        setIntField(term18053, term18053.getClass(), "totalHighSync", -316033780);
        setIntField(term18053, term18053.getClass(), "totalEasySync", -1242223364);
        setIntField(term18053, term18053.getClass(), "totalBasicSync", -347672279);
        setIntField(term18053, term18053.getClass(), "totalAdvancedSync", -2001561246);
        setIntField(term18053, term18053.getClass(), "totalExpertSync", -526492477);
        setIntField(term18053, term18053.getClass(), "totalMasterSync", 934758494);
        setIntField(term18053, term18053.getClass(), "totalReMasterSync", -1458746421);
        setIntField(term18053, term18053.getClass(), "playerRating", 1248508832);
        setIntField(term18053, term18053.getClass(), "highestRating", -1508290965);
        setIntField(term18053, term18053.getClass(), "rankAuthTailId", -537204050);
        setField(term18053, term18053.getClass(), "eventWatchedDate", "pdSvedKgPq");
        setField(term18053, term18053.getClass(), "webLimitDate", "epPTwvcoyb");
        setIntField(term18053, term18053.getClass(), "challengeTrackPhase", 549083285);
        setIntField(term18053, term18053.getClass(), "firstPlayBits", 110630919);
        setField(term18053, term18053.getClass(), "lastPlayDate", "UBPHmOICBs");
        setIntField(term18053, term18053.getClass(), "lastPlaceId", 2002558305);
        setField(term18053, term18053.getClass(), "lastPlaceName", "IDJUVPgUJf");
        setIntField(term18053, term18053.getClass(), "lastRegionId", -1729207675);
        setField(term18053, term18053.getClass(), "lastRegionName", "JmnWRJUxGr");
        setField(term18053, term18053.getClass(), "lastClientId", "wgRGBNrTGP");
        setField(term18053, term18053.getClass(), "lastCountryCode", "FIdNVptZpW");
        setIntField(term18053, term18053.getClass(), "eventPoint", -861852803);
        setIntField(term18053, term18053.getClass(), "totalLv", -2085852488);
        setIntField(term18053, term18053.getClass(), "lastLoginBonusDay", 600214846);
        setIntField(term18053, term18053.getClass(), "lastSurvivalBonusDay", 697208850);
        setIntField(term18053, term18053.getClass(), "loginBonusLv", -973142506);
        term18227 = new Integer(-15011809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18227;
        callMethod(klass, "setTotalEasyHighScore", argTypes, term18053, args);
    }

};


