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

public class UserWebOption_isNetMember_10658749933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38069;

    public UserWebOption_isNetMember_10658749933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38075 = new Long(8313800941204938919L);
        term38069 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term38071 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term38073 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38094 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38104 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38069, term38069.getClass(), "id", -6969704322644192945L);
        setLongField(term38071, term38071.getClass(), "id", -6685235643232255177L);
        setLongField(term38073, term38073.getClass(), "id", -5656664340499957324L);
        setField(term38073, term38073.getClass(), "extId", term38075);
        setField(term38073, term38073.getClass(), "luid", "vjaZIyixCm");
        setIntField(term38090, term38090.getClass(), "year", 2011);
        setShortField(term38090, term38090.getClass(), "month", (short) 9);
        setShortField(term38090, term38090.getClass(), "day", (short) 7);
        setField(term38089, term38089.getClass(), "date", term38090);
        setByteField(term38094, term38094.getClass(), "hour", (byte) 0);
        setByteField(term38094, term38094.getClass(), "minute", (byte) 51);
        setByteField(term38094, term38094.getClass(), "second", (byte) 44);
        setIntField(term38094, term38094.getClass(), "nano", 245610060);
        setField(term38089, term38089.getClass(), "time", term38094);
        setField(term38073, term38073.getClass(), "registerTime", term38089);
        setIntField(term38100, term38100.getClass(), "year", 2018);
        setShortField(term38100, term38100.getClass(), "month", (short) 1);
        setShortField(term38100, term38100.getClass(), "day", (short) 29);
        setField(term38099, term38099.getClass(), "date", term38100);
        setByteField(term38104, term38104.getClass(), "hour", (byte) 22);
        setByteField(term38104, term38104.getClass(), "minute", (byte) 20);
        setByteField(term38104, term38104.getClass(), "second", (byte) 36);
        setIntField(term38104, term38104.getClass(), "nano", 74678080);
        setField(term38099, term38099.getClass(), "time", term38104);
        setField(term38073, term38073.getClass(), "accessTime", term38099);
        setField(term38071, term38071.getClass(), "card", term38073);
        setIntField(term38071, term38071.getClass(), "lastDataVersion", -1750178936);
        setField(term38071, term38071.getClass(), "userName", "gAAPyftlIR");
        setIntField(term38071, term38071.getClass(), "point", 1007162436);
        setIntField(term38071, term38071.getClass(), "totalPoint", -1475097555);
        setIntField(term38071, term38071.getClass(), "iconId", 1715200190);
        setIntField(term38071, term38071.getClass(), "nameplateId", 766065716);
        setIntField(term38071, term38071.getClass(), "frameId", -431182213);
        setIntField(term38071, term38071.getClass(), "trophyId", 419448852);
        setIntField(term38071, term38071.getClass(), "playCount", -494367790);
        setIntField(term38071, term38071.getClass(), "playVsCount", 620015992);
        setIntField(term38071, term38071.getClass(), "playSyncCount", 396108638);
        setIntField(term38071, term38071.getClass(), "winCount", 581841369);
        setIntField(term38071, term38071.getClass(), "helpCount", 970094723);
        setIntField(term38071, term38071.getClass(), "comboCount", 376622340);
        setIntField(term38071, term38071.getClass(), "feverCount", 1985101421);
        setIntField(term38071, term38071.getClass(), "totalHiScore", 422564495);
        setIntField(term38071, term38071.getClass(), "totalEasyHighScore", -1614243846);
        setIntField(term38071, term38071.getClass(), "totalBasicHighScore", 1218830458);
        setIntField(term38071, term38071.getClass(), "totalAdvancedHighScore", 476903736);
        setIntField(term38071, term38071.getClass(), "totalExpertHighScore", -832801133);
        setIntField(term38071, term38071.getClass(), "totalMasterHighScore", 658732890);
        setIntField(term38071, term38071.getClass(), "totalReMasterHighScore", 888621409);
        setIntField(term38071, term38071.getClass(), "totalHighSync", 665526857);
        setIntField(term38071, term38071.getClass(), "totalEasySync", 184439959);
        setIntField(term38071, term38071.getClass(), "totalBasicSync", -153314488);
        setIntField(term38071, term38071.getClass(), "totalAdvancedSync", -1106116513);
        setIntField(term38071, term38071.getClass(), "totalExpertSync", 1454640705);
        setIntField(term38071, term38071.getClass(), "totalMasterSync", -1492168193);
        setIntField(term38071, term38071.getClass(), "totalReMasterSync", 144805805);
        setIntField(term38071, term38071.getClass(), "playerRating", 804939687);
        setIntField(term38071, term38071.getClass(), "highestRating", 1638315840);
        setIntField(term38071, term38071.getClass(), "rankAuthTailId", 2098018411);
        setField(term38071, term38071.getClass(), "eventWatchedDate", "kevWstoxwq");
        setField(term38071, term38071.getClass(), "webLimitDate", "aSYOhFwzSm");
        setIntField(term38071, term38071.getClass(), "challengeTrackPhase", 696364986);
        setIntField(term38071, term38071.getClass(), "firstPlayBits", 2133855407);
        setField(term38071, term38071.getClass(), "lastPlayDate", "pVZlzrBeDB");
        setIntField(term38071, term38071.getClass(), "lastPlaceId", -646910326);
        setField(term38071, term38071.getClass(), "lastPlaceName", "EfSUvjuZAA");
        setIntField(term38071, term38071.getClass(), "lastRegionId", -740085612);
        setField(term38071, term38071.getClass(), "lastRegionName", "PrHWfHydsG");
        setField(term38071, term38071.getClass(), "lastClientId", "igruEzTbBE");
        setField(term38071, term38071.getClass(), "lastCountryCode", "LFjgROsRUV");
        setIntField(term38071, term38071.getClass(), "eventPoint", -377361876);
        setIntField(term38071, term38071.getClass(), "totalLv", -138587866);
        setIntField(term38071, term38071.getClass(), "lastLoginBonusDay", 473269350);
        setIntField(term38071, term38071.getClass(), "lastSurvivalBonusDay", -1267755429);
        setIntField(term38071, term38071.getClass(), "loginBonusLv", 481428944);
        setField(term38069, term38069.getClass(), "user", term38071);
        setBooleanField(term38069, term38069.getClass(), "isNetMember", true);
        setIntField(term38069, term38069.getClass(), "dispRate", 585379621);
        setIntField(term38069, term38069.getClass(), "dispJudgeStyle", 1343392329);
        setIntField(term38069, term38069.getClass(), "dispRank", 9075231);
        setIntField(term38069, term38069.getClass(), "dispHomeRanker", -1835849143);
        setIntField(term38069, term38069.getClass(), "dispTotalLv", 156667044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNetMember", argTypes, term38069, args);
    }

};


