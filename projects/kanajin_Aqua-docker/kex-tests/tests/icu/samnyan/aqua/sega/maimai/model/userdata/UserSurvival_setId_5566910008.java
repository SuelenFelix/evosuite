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

public class UserSurvival_setId_5566910008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104050;
     Object term104231;

    public UserSurvival_setId_5566910008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104056 = new Long(-1279670138064751276L);
        term104050 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term104052 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term104054 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104075 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104085 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104050, term104050.getClass(), "id", 5914809586547397675L);
        setLongField(term104052, term104052.getClass(), "id", -8946539398468447729L);
        setLongField(term104054, term104054.getClass(), "id", -5919044245258983254L);
        setField(term104054, term104054.getClass(), "extId", term104056);
        setField(term104054, term104054.getClass(), "luid", "vuGxdvURpp");
        setIntField(term104071, term104071.getClass(), "year", 2015);
        setShortField(term104071, term104071.getClass(), "month", (short) 6);
        setShortField(term104071, term104071.getClass(), "day", (short) 29);
        setField(term104070, term104070.getClass(), "date", term104071);
        setByteField(term104075, term104075.getClass(), "hour", (byte) 15);
        setByteField(term104075, term104075.getClass(), "minute", (byte) 4);
        setByteField(term104075, term104075.getClass(), "second", (byte) 16);
        setIntField(term104075, term104075.getClass(), "nano", 322383816);
        setField(term104070, term104070.getClass(), "time", term104075);
        setField(term104054, term104054.getClass(), "registerTime", term104070);
        setIntField(term104081, term104081.getClass(), "year", 2029);
        setShortField(term104081, term104081.getClass(), "month", (short) 6);
        setShortField(term104081, term104081.getClass(), "day", (short) 10);
        setField(term104080, term104080.getClass(), "date", term104081);
        setByteField(term104085, term104085.getClass(), "hour", (byte) 10);
        setByteField(term104085, term104085.getClass(), "minute", (byte) 16);
        setByteField(term104085, term104085.getClass(), "second", (byte) 3);
        setIntField(term104085, term104085.getClass(), "nano", 695609423);
        setField(term104080, term104080.getClass(), "time", term104085);
        setField(term104054, term104054.getClass(), "accessTime", term104080);
        setField(term104052, term104052.getClass(), "card", term104054);
        setIntField(term104052, term104052.getClass(), "lastDataVersion", -1081841435);
        setField(term104052, term104052.getClass(), "userName", "zUgAERZZFZ");
        setIntField(term104052, term104052.getClass(), "point", 2012208998);
        setIntField(term104052, term104052.getClass(), "totalPoint", 1958631775);
        setIntField(term104052, term104052.getClass(), "iconId", -1935992165);
        setIntField(term104052, term104052.getClass(), "nameplateId", -63681126);
        setIntField(term104052, term104052.getClass(), "frameId", -1682345629);
        setIntField(term104052, term104052.getClass(), "trophyId", -1117546056);
        setIntField(term104052, term104052.getClass(), "playCount", -991844027);
        setIntField(term104052, term104052.getClass(), "playVsCount", -1027243359);
        setIntField(term104052, term104052.getClass(), "playSyncCount", 1419359154);
        setIntField(term104052, term104052.getClass(), "winCount", 1029591327);
        setIntField(term104052, term104052.getClass(), "helpCount", 649542687);
        setIntField(term104052, term104052.getClass(), "comboCount", -207146487);
        setIntField(term104052, term104052.getClass(), "feverCount", -1672295339);
        setIntField(term104052, term104052.getClass(), "totalHiScore", -1625760666);
        setIntField(term104052, term104052.getClass(), "totalEasyHighScore", 228127178);
        setIntField(term104052, term104052.getClass(), "totalBasicHighScore", -1027398473);
        setIntField(term104052, term104052.getClass(), "totalAdvancedHighScore", -1684799483);
        setIntField(term104052, term104052.getClass(), "totalExpertHighScore", -908780352);
        setIntField(term104052, term104052.getClass(), "totalMasterHighScore", 502316894);
        setIntField(term104052, term104052.getClass(), "totalReMasterHighScore", 346829197);
        setIntField(term104052, term104052.getClass(), "totalHighSync", -1144431477);
        setIntField(term104052, term104052.getClass(), "totalEasySync", -410028668);
        setIntField(term104052, term104052.getClass(), "totalBasicSync", -1620470555);
        setIntField(term104052, term104052.getClass(), "totalAdvancedSync", -1071514936);
        setIntField(term104052, term104052.getClass(), "totalExpertSync", 948646989);
        setIntField(term104052, term104052.getClass(), "totalMasterSync", -1091739087);
        setIntField(term104052, term104052.getClass(), "totalReMasterSync", -436415220);
        setIntField(term104052, term104052.getClass(), "playerRating", -733438551);
        setIntField(term104052, term104052.getClass(), "highestRating", 810630955);
        setIntField(term104052, term104052.getClass(), "rankAuthTailId", -630134606);
        setField(term104052, term104052.getClass(), "eventWatchedDate", "QhkdVFKaoy");
        setField(term104052, term104052.getClass(), "webLimitDate", "WCQDPwVjsS");
        setIntField(term104052, term104052.getClass(), "challengeTrackPhase", -1976364009);
        setIntField(term104052, term104052.getClass(), "firstPlayBits", 1488533591);
        setField(term104052, term104052.getClass(), "lastPlayDate", "XkZOYFvTGI");
        setIntField(term104052, term104052.getClass(), "lastPlaceId", 1777759371);
        setField(term104052, term104052.getClass(), "lastPlaceName", "NifhlBZIDF");
        setIntField(term104052, term104052.getClass(), "lastRegionId", 2046454754);
        setField(term104052, term104052.getClass(), "lastRegionName", "vKEgtSbaYp");
        setField(term104052, term104052.getClass(), "lastClientId", "FnjEwOlAkC");
        setField(term104052, term104052.getClass(), "lastCountryCode", "ZsGqLnRMml");
        setIntField(term104052, term104052.getClass(), "eventPoint", 1782403605);
        setIntField(term104052, term104052.getClass(), "totalLv", 796551683);
        setIntField(term104052, term104052.getClass(), "lastLoginBonusDay", 668463794);
        setIntField(term104052, term104052.getClass(), "lastSurvivalBonusDay", 1412866641);
        setIntField(term104052, term104052.getClass(), "loginBonusLv", 1177232469);
        setField(term104050, term104050.getClass(), "user", term104052);
        setIntField(term104050, term104050.getClass(), "survivalId", 272511309);
        setIntField(term104050, term104050.getClass(), "totalScore", 1932166997);
        setIntField(term104050, term104050.getClass(), "totalAchieve", -1020349112);
        setBooleanField(term104050, term104050.getClass(), "isClear", true);
        setBooleanField(term104050, term104050.getClass(), "isNoDamage", true);
        term104231 = new Long(8229243567352210338L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term104231;
        callMethod(klass, "setId", argTypes, term104050, args);
    }

};


