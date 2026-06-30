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

public class UserData_setTotalBasicSync_117445545076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20181;
     Object term20355;

    public UserData_setTotalBasicSync_117445545076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20185 = new Long(9013624480170062917L);
        term20181 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term20183 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term20199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20204 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20214 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term20181, term20181.getClass(), "id", -8603648071751666348L);
        setLongField(term20183, term20183.getClass(), "id", -7884871963229073324L);
        setField(term20183, term20183.getClass(), "extId", term20185);
        setField(term20183, term20183.getClass(), "luid", "QgHhxMyKvr");
        setIntField(term20200, term20200.getClass(), "year", 2023);
        setShortField(term20200, term20200.getClass(), "month", (short) 7);
        setShortField(term20200, term20200.getClass(), "day", (short) 27);
        setField(term20199, term20199.getClass(), "date", term20200);
        setByteField(term20204, term20204.getClass(), "hour", (byte) 4);
        setByteField(term20204, term20204.getClass(), "minute", (byte) 25);
        setByteField(term20204, term20204.getClass(), "second", (byte) 46);
        setIntField(term20204, term20204.getClass(), "nano", 646465452);
        setField(term20199, term20199.getClass(), "time", term20204);
        setField(term20183, term20183.getClass(), "registerTime", term20199);
        setIntField(term20210, term20210.getClass(), "year", 2022);
        setShortField(term20210, term20210.getClass(), "month", (short) 11);
        setShortField(term20210, term20210.getClass(), "day", (short) 2);
        setField(term20209, term20209.getClass(), "date", term20210);
        setByteField(term20214, term20214.getClass(), "hour", (byte) 4);
        setByteField(term20214, term20214.getClass(), "minute", (byte) 14);
        setByteField(term20214, term20214.getClass(), "second", (byte) 5);
        setIntField(term20214, term20214.getClass(), "nano", 604465127);
        setField(term20209, term20209.getClass(), "time", term20214);
        setField(term20183, term20183.getClass(), "accessTime", term20209);
        setField(term20181, term20181.getClass(), "card", term20183);
        setIntField(term20181, term20181.getClass(), "lastDataVersion", 564476854);
        setField(term20181, term20181.getClass(), "userName", "VGiXZZTWRO");
        setIntField(term20181, term20181.getClass(), "point", 963238257);
        setIntField(term20181, term20181.getClass(), "totalPoint", 1819563159);
        setIntField(term20181, term20181.getClass(), "iconId", -131038479);
        setIntField(term20181, term20181.getClass(), "nameplateId", 1690337049);
        setIntField(term20181, term20181.getClass(), "frameId", 254984950);
        setIntField(term20181, term20181.getClass(), "trophyId", 491595035);
        setIntField(term20181, term20181.getClass(), "playCount", 2111929590);
        setIntField(term20181, term20181.getClass(), "playVsCount", 1984033465);
        setIntField(term20181, term20181.getClass(), "playSyncCount", 415386900);
        setIntField(term20181, term20181.getClass(), "winCount", -80119579);
        setIntField(term20181, term20181.getClass(), "helpCount", -725563031);
        setIntField(term20181, term20181.getClass(), "comboCount", 228070072);
        setIntField(term20181, term20181.getClass(), "feverCount", 1918578349);
        setIntField(term20181, term20181.getClass(), "totalHiScore", -1585377443);
        setIntField(term20181, term20181.getClass(), "totalEasyHighScore", -1293961217);
        setIntField(term20181, term20181.getClass(), "totalBasicHighScore", -1715210057);
        setIntField(term20181, term20181.getClass(), "totalAdvancedHighScore", 118463203);
        setIntField(term20181, term20181.getClass(), "totalExpertHighScore", -2062733514);
        setIntField(term20181, term20181.getClass(), "totalMasterHighScore", 901520301);
        setIntField(term20181, term20181.getClass(), "totalReMasterHighScore", -1536684680);
        setIntField(term20181, term20181.getClass(), "totalHighSync", -322159635);
        setIntField(term20181, term20181.getClass(), "totalEasySync", 366996139);
        setIntField(term20181, term20181.getClass(), "totalBasicSync", 806187937);
        setIntField(term20181, term20181.getClass(), "totalAdvancedSync", -1646415676);
        setIntField(term20181, term20181.getClass(), "totalExpertSync", 1016563502);
        setIntField(term20181, term20181.getClass(), "totalMasterSync", -1845173237);
        setIntField(term20181, term20181.getClass(), "totalReMasterSync", -326684811);
        setIntField(term20181, term20181.getClass(), "playerRating", 1260583823);
        setIntField(term20181, term20181.getClass(), "highestRating", -1368801661);
        setIntField(term20181, term20181.getClass(), "rankAuthTailId", -2094311816);
        setField(term20181, term20181.getClass(), "eventWatchedDate", "MlPtwXnJOJ");
        setField(term20181, term20181.getClass(), "webLimitDate", "DbfiyFeaTe");
        setIntField(term20181, term20181.getClass(), "challengeTrackPhase", 419332770);
        setIntField(term20181, term20181.getClass(), "firstPlayBits", 1742733401);
        setField(term20181, term20181.getClass(), "lastPlayDate", "dQxXGBtDLZ");
        setIntField(term20181, term20181.getClass(), "lastPlaceId", 1634939612);
        setField(term20181, term20181.getClass(), "lastPlaceName", "EgSgEFIyyN");
        setIntField(term20181, term20181.getClass(), "lastRegionId", -590256406);
        setField(term20181, term20181.getClass(), "lastRegionName", "iAOFcXaLSf");
        setField(term20181, term20181.getClass(), "lastClientId", "EHoNUaeyvT");
        setField(term20181, term20181.getClass(), "lastCountryCode", "ZwKmasCVIy");
        setIntField(term20181, term20181.getClass(), "eventPoint", -1319797966);
        setIntField(term20181, term20181.getClass(), "totalLv", -388682282);
        setIntField(term20181, term20181.getClass(), "lastLoginBonusDay", 2028706829);
        setIntField(term20181, term20181.getClass(), "lastSurvivalBonusDay", -656080518);
        setIntField(term20181, term20181.getClass(), "loginBonusLv", 1769230265);
        term20355 = new Integer(-1946503216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20355;
        callMethod(klass, "setTotalBasicSync", argTypes, term20181, args);
    }

};


