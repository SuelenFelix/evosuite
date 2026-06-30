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

public class UserActivity_getSortNumber_2347169915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45067;

    public UserActivity_getSortNumber_2347169915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45073 = new Long(-4360569253593381888L);
        term45067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term45069 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term45071 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45092 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45102 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45067, term45067.getClass(), "id", -6490254947459640565L);
        setLongField(term45069, term45069.getClass(), "id", -7001094993638840490L);
        setLongField(term45071, term45071.getClass(), "id", 3077284143733577490L);
        setField(term45071, term45071.getClass(), "extId", term45073);
        setField(term45071, term45071.getClass(), "luid", "HOgkhttJZS");
        setIntField(term45088, term45088.getClass(), "year", 2017);
        setShortField(term45088, term45088.getClass(), "month", (short) 1);
        setShortField(term45088, term45088.getClass(), "day", (short) 3);
        setField(term45087, term45087.getClass(), "date", term45088);
        setByteField(term45092, term45092.getClass(), "hour", (byte) 14);
        setByteField(term45092, term45092.getClass(), "minute", (byte) 1);
        setByteField(term45092, term45092.getClass(), "second", (byte) 1);
        setIntField(term45092, term45092.getClass(), "nano", 827128674);
        setField(term45087, term45087.getClass(), "time", term45092);
        setField(term45071, term45071.getClass(), "registerTime", term45087);
        setIntField(term45098, term45098.getClass(), "year", 2022);
        setShortField(term45098, term45098.getClass(), "month", (short) 9);
        setShortField(term45098, term45098.getClass(), "day", (short) 3);
        setField(term45097, term45097.getClass(), "date", term45098);
        setByteField(term45102, term45102.getClass(), "hour", (byte) 22);
        setByteField(term45102, term45102.getClass(), "minute", (byte) 31);
        setByteField(term45102, term45102.getClass(), "second", (byte) 44);
        setIntField(term45102, term45102.getClass(), "nano", 798112760);
        setField(term45097, term45097.getClass(), "time", term45102);
        setField(term45071, term45071.getClass(), "accessTime", term45097);
        setField(term45069, term45069.getClass(), "card", term45071);
        setIntField(term45069, term45069.getClass(), "lastDataVersion", -457236509);
        setField(term45069, term45069.getClass(), "userName", "goqNSmXSSS");
        setIntField(term45069, term45069.getClass(), "point", 1719352674);
        setIntField(term45069, term45069.getClass(), "totalPoint", 1551152450);
        setIntField(term45069, term45069.getClass(), "iconId", -1821029149);
        setIntField(term45069, term45069.getClass(), "nameplateId", -1120692414);
        setIntField(term45069, term45069.getClass(), "frameId", 630179419);
        setIntField(term45069, term45069.getClass(), "trophyId", -1314338966);
        setIntField(term45069, term45069.getClass(), "playCount", 632003573);
        setIntField(term45069, term45069.getClass(), "playVsCount", 253586199);
        setIntField(term45069, term45069.getClass(), "playSyncCount", 1269448265);
        setIntField(term45069, term45069.getClass(), "winCount", 1407128598);
        setIntField(term45069, term45069.getClass(), "helpCount", -799093829);
        setIntField(term45069, term45069.getClass(), "comboCount", 432526848);
        setIntField(term45069, term45069.getClass(), "feverCount", 1875904227);
        setIntField(term45069, term45069.getClass(), "totalHiScore", -273652787);
        setIntField(term45069, term45069.getClass(), "totalEasyHighScore", -20800272);
        setIntField(term45069, term45069.getClass(), "totalBasicHighScore", -2012090266);
        setIntField(term45069, term45069.getClass(), "totalAdvancedHighScore", 1298920245);
        setIntField(term45069, term45069.getClass(), "totalExpertHighScore", 1539128914);
        setIntField(term45069, term45069.getClass(), "totalMasterHighScore", 627813167);
        setIntField(term45069, term45069.getClass(), "totalReMasterHighScore", -2047312469);
        setIntField(term45069, term45069.getClass(), "totalHighSync", 38231753);
        setIntField(term45069, term45069.getClass(), "totalEasySync", 1404509429);
        setIntField(term45069, term45069.getClass(), "totalBasicSync", -438218058);
        setIntField(term45069, term45069.getClass(), "totalAdvancedSync", -1026369377);
        setIntField(term45069, term45069.getClass(), "totalExpertSync", 1373311750);
        setIntField(term45069, term45069.getClass(), "totalMasterSync", 1699366);
        setIntField(term45069, term45069.getClass(), "totalReMasterSync", 692170348);
        setIntField(term45069, term45069.getClass(), "playerRating", -1022512329);
        setIntField(term45069, term45069.getClass(), "highestRating", 201236178);
        setIntField(term45069, term45069.getClass(), "rankAuthTailId", 985775690);
        setField(term45069, term45069.getClass(), "eventWatchedDate", "AkViBLdqXM");
        setField(term45069, term45069.getClass(), "webLimitDate", "UlxGFzEifL");
        setIntField(term45069, term45069.getClass(), "challengeTrackPhase", 1159262757);
        setIntField(term45069, term45069.getClass(), "firstPlayBits", 967155072);
        setField(term45069, term45069.getClass(), "lastPlayDate", "HilHTbDKDF");
        setIntField(term45069, term45069.getClass(), "lastPlaceId", 1011025023);
        setField(term45069, term45069.getClass(), "lastPlaceName", "IaEqlVwmNS");
        setIntField(term45069, term45069.getClass(), "lastRegionId", 921803217);
        setField(term45069, term45069.getClass(), "lastRegionName", "ljNOgdPWrL");
        setField(term45069, term45069.getClass(), "lastClientId", "oBlIZiyRMS");
        setField(term45069, term45069.getClass(), "lastCountryCode", "QUYAkhtCNh");
        setIntField(term45069, term45069.getClass(), "eventPoint", 2011014435);
        setIntField(term45069, term45069.getClass(), "totalLv", 256804816);
        setIntField(term45069, term45069.getClass(), "lastLoginBonusDay", -726670877);
        setIntField(term45069, term45069.getClass(), "lastSurvivalBonusDay", 1595800712);
        setIntField(term45069, term45069.getClass(), "loginBonusLv", -1315471137);
        setField(term45067, term45067.getClass(), "user", term45069);
        setIntField(term45067, term45067.getClass(), "kind", 307541055);
        setIntField(term45067, term45067.getClass(), "activityId", -664242488);
        setLongField(term45067, term45067.getClass(), "sortNumber", 4458302820344896046L);
        setIntField(term45067, term45067.getClass(), "param1", 1562272299);
        setIntField(term45067, term45067.getClass(), "param2", 961476617);
        setIntField(term45067, term45067.getClass(), "param3", -1978217643);
        setIntField(term45067, term45067.getClass(), "param4", 53489031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term45067, args);
    }

};


