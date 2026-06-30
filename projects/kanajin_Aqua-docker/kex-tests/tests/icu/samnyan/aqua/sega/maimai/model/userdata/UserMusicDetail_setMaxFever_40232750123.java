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

public class UserMusicDetail_setMaxFever_40232750123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186547;
     Object term186733;

    public UserMusicDetail_setMaxFever_40232750123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186553 = new Long(-6503611645609982617L);
        term186547 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term186549 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term186551 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186572 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186582 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186547, term186547.getClass(), "id", 6425336229882388159L);
        setLongField(term186549, term186549.getClass(), "id", -616423180949048118L);
        setLongField(term186551, term186551.getClass(), "id", -8090281978105887179L);
        setField(term186551, term186551.getClass(), "extId", term186553);
        setField(term186551, term186551.getClass(), "luid", "GDxmXDNVsL");
        setIntField(term186568, term186568.getClass(), "year", 2026);
        setShortField(term186568, term186568.getClass(), "month", (short) 9);
        setShortField(term186568, term186568.getClass(), "day", (short) 24);
        setField(term186567, term186567.getClass(), "date", term186568);
        setByteField(term186572, term186572.getClass(), "hour", (byte) 18);
        setByteField(term186572, term186572.getClass(), "minute", (byte) 13);
        setByteField(term186572, term186572.getClass(), "second", (byte) 45);
        setIntField(term186572, term186572.getClass(), "nano", 781256845);
        setField(term186567, term186567.getClass(), "time", term186572);
        setField(term186551, term186551.getClass(), "registerTime", term186567);
        setIntField(term186578, term186578.getClass(), "year", 2024);
        setShortField(term186578, term186578.getClass(), "month", (short) 12);
        setShortField(term186578, term186578.getClass(), "day", (short) 18);
        setField(term186577, term186577.getClass(), "date", term186578);
        setByteField(term186582, term186582.getClass(), "hour", (byte) 2);
        setByteField(term186582, term186582.getClass(), "minute", (byte) 55);
        setByteField(term186582, term186582.getClass(), "second", (byte) 45);
        setIntField(term186582, term186582.getClass(), "nano", 631411071);
        setField(term186577, term186577.getClass(), "time", term186582);
        setField(term186551, term186551.getClass(), "accessTime", term186577);
        setField(term186549, term186549.getClass(), "card", term186551);
        setIntField(term186549, term186549.getClass(), "lastDataVersion", 1012817216);
        setField(term186549, term186549.getClass(), "userName", "ipYdeymslj");
        setIntField(term186549, term186549.getClass(), "point", -729788516);
        setIntField(term186549, term186549.getClass(), "totalPoint", 1193562371);
        setIntField(term186549, term186549.getClass(), "iconId", -983096368);
        setIntField(term186549, term186549.getClass(), "nameplateId", -1731697022);
        setIntField(term186549, term186549.getClass(), "frameId", 504412250);
        setIntField(term186549, term186549.getClass(), "trophyId", 1207945263);
        setIntField(term186549, term186549.getClass(), "playCount", -1300188249);
        setIntField(term186549, term186549.getClass(), "playVsCount", 498913717);
        setIntField(term186549, term186549.getClass(), "playSyncCount", -1033549075);
        setIntField(term186549, term186549.getClass(), "winCount", 981248190);
        setIntField(term186549, term186549.getClass(), "helpCount", -2117293810);
        setIntField(term186549, term186549.getClass(), "comboCount", 407824167);
        setIntField(term186549, term186549.getClass(), "feverCount", 1813832130);
        setIntField(term186549, term186549.getClass(), "totalHiScore", -1841549326);
        setIntField(term186549, term186549.getClass(), "totalEasyHighScore", -424512932);
        setIntField(term186549, term186549.getClass(), "totalBasicHighScore", 874965682);
        setIntField(term186549, term186549.getClass(), "totalAdvancedHighScore", -331962714);
        setIntField(term186549, term186549.getClass(), "totalExpertHighScore", -391762619);
        setIntField(term186549, term186549.getClass(), "totalMasterHighScore", 1764470697);
        setIntField(term186549, term186549.getClass(), "totalReMasterHighScore", -307420644);
        setIntField(term186549, term186549.getClass(), "totalHighSync", 441557848);
        setIntField(term186549, term186549.getClass(), "totalEasySync", 877562213);
        setIntField(term186549, term186549.getClass(), "totalBasicSync", 586958717);
        setIntField(term186549, term186549.getClass(), "totalAdvancedSync", -1284219455);
        setIntField(term186549, term186549.getClass(), "totalExpertSync", -184793256);
        setIntField(term186549, term186549.getClass(), "totalMasterSync", 880654719);
        setIntField(term186549, term186549.getClass(), "totalReMasterSync", 1527419594);
        setIntField(term186549, term186549.getClass(), "playerRating", 1597106031);
        setIntField(term186549, term186549.getClass(), "highestRating", -703203579);
        setIntField(term186549, term186549.getClass(), "rankAuthTailId", -1548311872);
        setField(term186549, term186549.getClass(), "eventWatchedDate", "QFMCLCOTms");
        setField(term186549, term186549.getClass(), "webLimitDate", "jCtiggtCcS");
        setIntField(term186549, term186549.getClass(), "challengeTrackPhase", -2005281764);
        setIntField(term186549, term186549.getClass(), "firstPlayBits", 1259010960);
        setField(term186549, term186549.getClass(), "lastPlayDate", "HTPoLdgdlc");
        setIntField(term186549, term186549.getClass(), "lastPlaceId", 80869350);
        setField(term186549, term186549.getClass(), "lastPlaceName", "gQbWOQsNZq");
        setIntField(term186549, term186549.getClass(), "lastRegionId", -1195855336);
        setField(term186549, term186549.getClass(), "lastRegionName", "gwXrkdkdqW");
        setField(term186549, term186549.getClass(), "lastClientId", "ePMStkWVSW");
        setField(term186549, term186549.getClass(), "lastCountryCode", "lYCXiqdVVs");
        setIntField(term186549, term186549.getClass(), "eventPoint", 43544078);
        setIntField(term186549, term186549.getClass(), "totalLv", 165556366);
        setIntField(term186549, term186549.getClass(), "lastLoginBonusDay", 671895111);
        setIntField(term186549, term186549.getClass(), "lastSurvivalBonusDay", -1339741120);
        setIntField(term186549, term186549.getClass(), "loginBonusLv", 1574341887);
        setField(term186547, term186547.getClass(), "user", term186549);
        setIntField(term186547, term186547.getClass(), "musicId", 582054002);
        setIntField(term186547, term186547.getClass(), "level", 1033265160);
        setIntField(term186547, term186547.getClass(), "playCount", -438633986);
        setIntField(term186547, term186547.getClass(), "scoreMax", -133089274);
        setIntField(term186547, term186547.getClass(), "syncRateMax", 1993566414);
        setBooleanField(term186547, term186547.getClass(), "isAllPerfect", false);
        setIntField(term186547, term186547.getClass(), "isAllPerfectPlus", -13995856);
        setIntField(term186547, term186547.getClass(), "fullCombo", 1284273319);
        setIntField(term186547, term186547.getClass(), "maxFever", 2059992354);
        setIntField(term186547, term186547.getClass(), "achievement", -1446406947);
        term186733 = new Integer(-1861072184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term186733;
        callMethod(klass, "setMaxFever", argTypes, term186547, args);
    }

};


