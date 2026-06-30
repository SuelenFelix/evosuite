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

public class UserData_getLastCountryCode_69841529144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11617;

    public UserData_getLastCountryCode_69841529144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11621 = new Long(4784595517102746672L);
        term11617 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term11619 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11650 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11617, term11617.getClass(), "id", -8876856890348836498L);
        setLongField(term11619, term11619.getClass(), "id", 846579494941632714L);
        setField(term11619, term11619.getClass(), "extId", term11621);
        setField(term11619, term11619.getClass(), "luid", "gltJarNuUk");
        setIntField(term11636, term11636.getClass(), "year", 2023);
        setShortField(term11636, term11636.getClass(), "month", (short) 5);
        setShortField(term11636, term11636.getClass(), "day", (short) 23);
        setField(term11635, term11635.getClass(), "date", term11636);
        setByteField(term11640, term11640.getClass(), "hour", (byte) 0);
        setByteField(term11640, term11640.getClass(), "minute", (byte) 50);
        setByteField(term11640, term11640.getClass(), "second", (byte) 5);
        setIntField(term11640, term11640.getClass(), "nano", 296286825);
        setField(term11635, term11635.getClass(), "time", term11640);
        setField(term11619, term11619.getClass(), "registerTime", term11635);
        setIntField(term11646, term11646.getClass(), "year", 2015);
        setShortField(term11646, term11646.getClass(), "month", (short) 2);
        setShortField(term11646, term11646.getClass(), "day", (short) 5);
        setField(term11645, term11645.getClass(), "date", term11646);
        setByteField(term11650, term11650.getClass(), "hour", (byte) 3);
        setByteField(term11650, term11650.getClass(), "minute", (byte) 26);
        setByteField(term11650, term11650.getClass(), "second", (byte) 49);
        setIntField(term11650, term11650.getClass(), "nano", 995758570);
        setField(term11645, term11645.getClass(), "time", term11650);
        setField(term11619, term11619.getClass(), "accessTime", term11645);
        setField(term11617, term11617.getClass(), "card", term11619);
        setIntField(term11617, term11617.getClass(), "lastDataVersion", -491132382);
        setField(term11617, term11617.getClass(), "userName", "ZwZIDwYcSW");
        setIntField(term11617, term11617.getClass(), "point", 918882916);
        setIntField(term11617, term11617.getClass(), "totalPoint", 1544012770);
        setIntField(term11617, term11617.getClass(), "iconId", 1922068039);
        setIntField(term11617, term11617.getClass(), "nameplateId", -410564443);
        setIntField(term11617, term11617.getClass(), "frameId", 996017434);
        setIntField(term11617, term11617.getClass(), "trophyId", -983870300);
        setIntField(term11617, term11617.getClass(), "playCount", 360715062);
        setIntField(term11617, term11617.getClass(), "playVsCount", 1047409266);
        setIntField(term11617, term11617.getClass(), "playSyncCount", 1427248961);
        setIntField(term11617, term11617.getClass(), "winCount", 1445291866);
        setIntField(term11617, term11617.getClass(), "helpCount", -139927812);
        setIntField(term11617, term11617.getClass(), "comboCount", -2065157320);
        setIntField(term11617, term11617.getClass(), "feverCount", 1782011477);
        setIntField(term11617, term11617.getClass(), "totalHiScore", 2129957018);
        setIntField(term11617, term11617.getClass(), "totalEasyHighScore", 691663312);
        setIntField(term11617, term11617.getClass(), "totalBasicHighScore", -1236696275);
        setIntField(term11617, term11617.getClass(), "totalAdvancedHighScore", 575249858);
        setIntField(term11617, term11617.getClass(), "totalExpertHighScore", -297957951);
        setIntField(term11617, term11617.getClass(), "totalMasterHighScore", -1816920588);
        setIntField(term11617, term11617.getClass(), "totalReMasterHighScore", 1674165862);
        setIntField(term11617, term11617.getClass(), "totalHighSync", 1875252647);
        setIntField(term11617, term11617.getClass(), "totalEasySync", -1298688401);
        setIntField(term11617, term11617.getClass(), "totalBasicSync", 1907832341);
        setIntField(term11617, term11617.getClass(), "totalAdvancedSync", 932199784);
        setIntField(term11617, term11617.getClass(), "totalExpertSync", 1953620444);
        setIntField(term11617, term11617.getClass(), "totalMasterSync", -1111307978);
        setIntField(term11617, term11617.getClass(), "totalReMasterSync", 609697271);
        setIntField(term11617, term11617.getClass(), "playerRating", 1121247998);
        setIntField(term11617, term11617.getClass(), "highestRating", -710001354);
        setIntField(term11617, term11617.getClass(), "rankAuthTailId", 2007404429);
        setField(term11617, term11617.getClass(), "eventWatchedDate", "sOdkipUKRu");
        setField(term11617, term11617.getClass(), "webLimitDate", "oKwCDqywym");
        setIntField(term11617, term11617.getClass(), "challengeTrackPhase", 472580433);
        setIntField(term11617, term11617.getClass(), "firstPlayBits", 1189049164);
        setField(term11617, term11617.getClass(), "lastPlayDate", "zjZYTddemL");
        setIntField(term11617, term11617.getClass(), "lastPlaceId", -673413879);
        setField(term11617, term11617.getClass(), "lastPlaceName", "QtrylgCLiF");
        setIntField(term11617, term11617.getClass(), "lastRegionId", 1609778442);
        setField(term11617, term11617.getClass(), "lastRegionName", "orEuhCStGM");
        setField(term11617, term11617.getClass(), "lastClientId", "HhEaSXWvrY");
        setField(term11617, term11617.getClass(), "lastCountryCode", "CVRGEomOth");
        setIntField(term11617, term11617.getClass(), "eventPoint", 524850421);
        setIntField(term11617, term11617.getClass(), "totalLv", -1833121756);
        setIntField(term11617, term11617.getClass(), "lastLoginBonusDay", -1493632787);
        setIntField(term11617, term11617.getClass(), "lastSurvivalBonusDay", -1056969264);
        setIntField(term11617, term11617.getClass(), "loginBonusLv", -709130701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountryCode", argTypes, term11617, args);
    }

};


