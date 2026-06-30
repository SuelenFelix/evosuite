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

public class UserWebOption_equals_73927979217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42155;
     Object term42337;

    public UserWebOption_equals_73927979217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42161 = new Long(8034714140377562739L);
        term42155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term42157 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term42159 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42180 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42190 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42155, term42155.getClass(), "id", -1497280900081695731L);
        setLongField(term42157, term42157.getClass(), "id", -3602825674339018793L);
        setLongField(term42159, term42159.getClass(), "id", 3086974592680165932L);
        setField(term42159, term42159.getClass(), "extId", term42161);
        setField(term42159, term42159.getClass(), "luid", "jlyFvaZlmv");
        setIntField(term42176, term42176.getClass(), "year", 2019);
        setShortField(term42176, term42176.getClass(), "month", (short) 12);
        setShortField(term42176, term42176.getClass(), "day", (short) 8);
        setField(term42175, term42175.getClass(), "date", term42176);
        setByteField(term42180, term42180.getClass(), "hour", (byte) 6);
        setByteField(term42180, term42180.getClass(), "minute", (byte) 0);
        setByteField(term42180, term42180.getClass(), "second", (byte) 32);
        setIntField(term42180, term42180.getClass(), "nano", 371231280);
        setField(term42175, term42175.getClass(), "time", term42180);
        setField(term42159, term42159.getClass(), "registerTime", term42175);
        setIntField(term42186, term42186.getClass(), "year", 2024);
        setShortField(term42186, term42186.getClass(), "month", (short) 3);
        setShortField(term42186, term42186.getClass(), "day", (short) 19);
        setField(term42185, term42185.getClass(), "date", term42186);
        setByteField(term42190, term42190.getClass(), "hour", (byte) 16);
        setByteField(term42190, term42190.getClass(), "minute", (byte) 8);
        setByteField(term42190, term42190.getClass(), "second", (byte) 55);
        setIntField(term42190, term42190.getClass(), "nano", 955822950);
        setField(term42185, term42185.getClass(), "time", term42190);
        setField(term42159, term42159.getClass(), "accessTime", term42185);
        setField(term42157, term42157.getClass(), "card", term42159);
        setIntField(term42157, term42157.getClass(), "lastDataVersion", -912972263);
        setField(term42157, term42157.getClass(), "userName", "sofyLEfomV");
        setIntField(term42157, term42157.getClass(), "point", -340318694);
        setIntField(term42157, term42157.getClass(), "totalPoint", 53069810);
        setIntField(term42157, term42157.getClass(), "iconId", 399386520);
        setIntField(term42157, term42157.getClass(), "nameplateId", 1509169467);
        setIntField(term42157, term42157.getClass(), "frameId", 1228296174);
        setIntField(term42157, term42157.getClass(), "trophyId", 1070536276);
        setIntField(term42157, term42157.getClass(), "playCount", -474907994);
        setIntField(term42157, term42157.getClass(), "playVsCount", 785315487);
        setIntField(term42157, term42157.getClass(), "playSyncCount", -1865794481);
        setIntField(term42157, term42157.getClass(), "winCount", -1811894511);
        setIntField(term42157, term42157.getClass(), "helpCount", 162320449);
        setIntField(term42157, term42157.getClass(), "comboCount", -299093975);
        setIntField(term42157, term42157.getClass(), "feverCount", 1297491984);
        setIntField(term42157, term42157.getClass(), "totalHiScore", 2020056067);
        setIntField(term42157, term42157.getClass(), "totalEasyHighScore", -1958223804);
        setIntField(term42157, term42157.getClass(), "totalBasicHighScore", 1366353238);
        setIntField(term42157, term42157.getClass(), "totalAdvancedHighScore", 613588236);
        setIntField(term42157, term42157.getClass(), "totalExpertHighScore", 31602333);
        setIntField(term42157, term42157.getClass(), "totalMasterHighScore", -1136573689);
        setIntField(term42157, term42157.getClass(), "totalReMasterHighScore", -1236027195);
        setIntField(term42157, term42157.getClass(), "totalHighSync", 133624666);
        setIntField(term42157, term42157.getClass(), "totalEasySync", -1292573941);
        setIntField(term42157, term42157.getClass(), "totalBasicSync", 1960867757);
        setIntField(term42157, term42157.getClass(), "totalAdvancedSync", -353830408);
        setIntField(term42157, term42157.getClass(), "totalExpertSync", 2082288063);
        setIntField(term42157, term42157.getClass(), "totalMasterSync", 535353751);
        setIntField(term42157, term42157.getClass(), "totalReMasterSync", -63865927);
        setIntField(term42157, term42157.getClass(), "playerRating", -2019481765);
        setIntField(term42157, term42157.getClass(), "highestRating", -425787036);
        setIntField(term42157, term42157.getClass(), "rankAuthTailId", 1522770510);
        setField(term42157, term42157.getClass(), "eventWatchedDate", "zHcDSJHKAb");
        setField(term42157, term42157.getClass(), "webLimitDate", "WRIQkTdeMl");
        setIntField(term42157, term42157.getClass(), "challengeTrackPhase", -1935030297);
        setIntField(term42157, term42157.getClass(), "firstPlayBits", -1877013372);
        setField(term42157, term42157.getClass(), "lastPlayDate", "rLSEheWsHd");
        setIntField(term42157, term42157.getClass(), "lastPlaceId", 1193388232);
        setField(term42157, term42157.getClass(), "lastPlaceName", "DoUKDhlGCY");
        setIntField(term42157, term42157.getClass(), "lastRegionId", 1908942563);
        setField(term42157, term42157.getClass(), "lastRegionName", "IeoToWsQWU");
        setField(term42157, term42157.getClass(), "lastClientId", "QxiiHtQAzN");
        setField(term42157, term42157.getClass(), "lastCountryCode", "gQgTBlRIvX");
        setIntField(term42157, term42157.getClass(), "eventPoint", 1566557753);
        setIntField(term42157, term42157.getClass(), "totalLv", 1717239995);
        setIntField(term42157, term42157.getClass(), "lastLoginBonusDay", -2127412745);
        setIntField(term42157, term42157.getClass(), "lastSurvivalBonusDay", -891519278);
        setIntField(term42157, term42157.getClass(), "loginBonusLv", 1794839887);
        setField(term42155, term42155.getClass(), "user", term42157);
        setBooleanField(term42155, term42155.getClass(), "isNetMember", true);
        setIntField(term42155, term42155.getClass(), "dispRate", 517802429);
        setIntField(term42155, term42155.getClass(), "dispJudgeStyle", 2029166588);
        setIntField(term42155, term42155.getClass(), "dispRank", -834807352);
        setIntField(term42155, term42155.getClass(), "dispHomeRanker", -1760219909);
        setIntField(term42155, term42155.getClass(), "dispTotalLv", -1053825347);
        term42337 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42337;
        callMethod(klass, "equals", argTypes, term42155, args);
    }

};


