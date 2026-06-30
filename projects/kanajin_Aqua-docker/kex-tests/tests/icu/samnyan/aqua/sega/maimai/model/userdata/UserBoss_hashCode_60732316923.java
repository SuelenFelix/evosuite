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

public class UserBoss_hashCode_60732316923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95533;

    public UserBoss_hashCode_60732316923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95539 = new Long(-3718250311794019732L);
        term95533 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term95535 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term95537 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95568 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95533, term95533.getClass(), "id", -5796564556566273156L);
        setLongField(term95535, term95535.getClass(), "id", 4376251358600000238L);
        setLongField(term95537, term95537.getClass(), "id", -3708632729138387526L);
        setField(term95537, term95537.getClass(), "extId", term95539);
        setField(term95537, term95537.getClass(), "luid", "IWCccrYFQd");
        setIntField(term95554, term95554.getClass(), "year", 2014);
        setShortField(term95554, term95554.getClass(), "month", (short) 7);
        setShortField(term95554, term95554.getClass(), "day", (short) 5);
        setField(term95553, term95553.getClass(), "date", term95554);
        setByteField(term95558, term95558.getClass(), "hour", (byte) 16);
        setByteField(term95558, term95558.getClass(), "minute", (byte) 28);
        setByteField(term95558, term95558.getClass(), "second", (byte) 51);
        setIntField(term95558, term95558.getClass(), "nano", 627591414);
        setField(term95553, term95553.getClass(), "time", term95558);
        setField(term95537, term95537.getClass(), "registerTime", term95553);
        setIntField(term95564, term95564.getClass(), "year", 2028);
        setShortField(term95564, term95564.getClass(), "month", (short) 7);
        setShortField(term95564, term95564.getClass(), "day", (short) 20);
        setField(term95563, term95563.getClass(), "date", term95564);
        setByteField(term95568, term95568.getClass(), "hour", (byte) 23);
        setByteField(term95568, term95568.getClass(), "minute", (byte) 53);
        setByteField(term95568, term95568.getClass(), "second", (byte) 34);
        setIntField(term95568, term95568.getClass(), "nano", 196205860);
        setField(term95563, term95563.getClass(), "time", term95568);
        setField(term95537, term95537.getClass(), "accessTime", term95563);
        setField(term95535, term95535.getClass(), "card", term95537);
        setIntField(term95535, term95535.getClass(), "lastDataVersion", 1106745170);
        setField(term95535, term95535.getClass(), "userName", "zpkdYKWkCa");
        setIntField(term95535, term95535.getClass(), "point", 1163945085);
        setIntField(term95535, term95535.getClass(), "totalPoint", -1127473353);
        setIntField(term95535, term95535.getClass(), "iconId", 1804045488);
        setIntField(term95535, term95535.getClass(), "nameplateId", 557148522);
        setIntField(term95535, term95535.getClass(), "frameId", 1264789417);
        setIntField(term95535, term95535.getClass(), "trophyId", -430081538);
        setIntField(term95535, term95535.getClass(), "playCount", -146495211);
        setIntField(term95535, term95535.getClass(), "playVsCount", 2134103119);
        setIntField(term95535, term95535.getClass(), "playSyncCount", -8598624);
        setIntField(term95535, term95535.getClass(), "winCount", -1307724844);
        setIntField(term95535, term95535.getClass(), "helpCount", -711213523);
        setIntField(term95535, term95535.getClass(), "comboCount", -364820822);
        setIntField(term95535, term95535.getClass(), "feverCount", -1698426889);
        setIntField(term95535, term95535.getClass(), "totalHiScore", 229004277);
        setIntField(term95535, term95535.getClass(), "totalEasyHighScore", 1552068851);
        setIntField(term95535, term95535.getClass(), "totalBasicHighScore", -230286512);
        setIntField(term95535, term95535.getClass(), "totalAdvancedHighScore", -932766163);
        setIntField(term95535, term95535.getClass(), "totalExpertHighScore", -1954254883);
        setIntField(term95535, term95535.getClass(), "totalMasterHighScore", 75824628);
        setIntField(term95535, term95535.getClass(), "totalReMasterHighScore", -751408969);
        setIntField(term95535, term95535.getClass(), "totalHighSync", 1332942351);
        setIntField(term95535, term95535.getClass(), "totalEasySync", 417417686);
        setIntField(term95535, term95535.getClass(), "totalBasicSync", -862439850);
        setIntField(term95535, term95535.getClass(), "totalAdvancedSync", -1769155675);
        setIntField(term95535, term95535.getClass(), "totalExpertSync", 56458333);
        setIntField(term95535, term95535.getClass(), "totalMasterSync", 418235602);
        setIntField(term95535, term95535.getClass(), "totalReMasterSync", 239913244);
        setIntField(term95535, term95535.getClass(), "playerRating", -1013753559);
        setIntField(term95535, term95535.getClass(), "highestRating", -43814994);
        setIntField(term95535, term95535.getClass(), "rankAuthTailId", -703544966);
        setField(term95535, term95535.getClass(), "eventWatchedDate", "mvOJAtEcWR");
        setField(term95535, term95535.getClass(), "webLimitDate", "QybezBkmJu");
        setIntField(term95535, term95535.getClass(), "challengeTrackPhase", -479486809);
        setIntField(term95535, term95535.getClass(), "firstPlayBits", 958022606);
        setField(term95535, term95535.getClass(), "lastPlayDate", "uWIrREgpjs");
        setIntField(term95535, term95535.getClass(), "lastPlaceId", -743651440);
        setField(term95535, term95535.getClass(), "lastPlaceName", "TmEdDFXkTZ");
        setIntField(term95535, term95535.getClass(), "lastRegionId", 1996863622);
        setField(term95535, term95535.getClass(), "lastRegionName", "DjjdYbIhNY");
        setField(term95535, term95535.getClass(), "lastClientId", "AGaeaoutjJ");
        setField(term95535, term95535.getClass(), "lastCountryCode", "oHWSUbpGiK");
        setIntField(term95535, term95535.getClass(), "eventPoint", 538262655);
        setIntField(term95535, term95535.getClass(), "totalLv", -661864434);
        setIntField(term95535, term95535.getClass(), "lastLoginBonusDay", 1633649139);
        setIntField(term95535, term95535.getClass(), "lastSurvivalBonusDay", 865740366);
        setIntField(term95535, term95535.getClass(), "loginBonusLv", 2055184211);
        setField(term95533, term95533.getClass(), "user", term95535);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList0", 2359134970522271046L);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList1", -6198150397627694231L);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList2", 7725924092701084764L);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList3", -3646702249834556847L);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList4", 2701558556303760915L);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList5", 4187385369384657492L);
        setLongField(term95533, term95533.getClass(), "pandoraFlagList6", -8947510185810654315L);
        setLongField(term95533, term95533.getClass(), "emblemFlagList", -2356977949142999853L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term95533, args);
    }

};


