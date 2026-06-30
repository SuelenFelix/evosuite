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

public class UserPlaylog_setHoldGood_5062673106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162915;
     Object term163227;

    public UserPlaylog_setHoldGood_5062673106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162921 = new Long(-5903549884298836343L);
        term162915 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term162917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term162919 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term162935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162950 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term162915, term162915.getClass(), "id", 3042394513611697851L);
        setLongField(term162917, term162917.getClass(), "id", 4021900249730695810L);
        setLongField(term162919, term162919.getClass(), "id", 3053042769254952980L);
        setField(term162919, term162919.getClass(), "extId", term162921);
        setField(term162919, term162919.getClass(), "luid", "nHkhqzmpyo");
        setIntField(term162936, term162936.getClass(), "year", 2027);
        setShortField(term162936, term162936.getClass(), "month", (short) 6);
        setShortField(term162936, term162936.getClass(), "day", (short) 13);
        setField(term162935, term162935.getClass(), "date", term162936);
        setByteField(term162940, term162940.getClass(), "hour", (byte) 4);
        setByteField(term162940, term162940.getClass(), "minute", (byte) 7);
        setByteField(term162940, term162940.getClass(), "second", (byte) 55);
        setIntField(term162940, term162940.getClass(), "nano", 288212169);
        setField(term162935, term162935.getClass(), "time", term162940);
        setField(term162919, term162919.getClass(), "registerTime", term162935);
        setIntField(term162946, term162946.getClass(), "year", 2016);
        setShortField(term162946, term162946.getClass(), "month", (short) 8);
        setShortField(term162946, term162946.getClass(), "day", (short) 20);
        setField(term162945, term162945.getClass(), "date", term162946);
        setByteField(term162950, term162950.getClass(), "hour", (byte) 15);
        setByteField(term162950, term162950.getClass(), "minute", (byte) 59);
        setByteField(term162950, term162950.getClass(), "second", (byte) 24);
        setIntField(term162950, term162950.getClass(), "nano", 817884348);
        setField(term162945, term162945.getClass(), "time", term162950);
        setField(term162919, term162919.getClass(), "accessTime", term162945);
        setField(term162917, term162917.getClass(), "card", term162919);
        setIntField(term162917, term162917.getClass(), "lastDataVersion", 56755956);
        setField(term162917, term162917.getClass(), "userName", "UsfMPJEJAN");
        setIntField(term162917, term162917.getClass(), "point", -1314899847);
        setIntField(term162917, term162917.getClass(), "totalPoint", -888543810);
        setIntField(term162917, term162917.getClass(), "iconId", -1084206906);
        setIntField(term162917, term162917.getClass(), "nameplateId", -1819445741);
        setIntField(term162917, term162917.getClass(), "frameId", -1810043859);
        setIntField(term162917, term162917.getClass(), "trophyId", 1401192135);
        setIntField(term162917, term162917.getClass(), "playCount", 1201714538);
        setIntField(term162917, term162917.getClass(), "playVsCount", -642183946);
        setIntField(term162917, term162917.getClass(), "playSyncCount", 1338802034);
        setIntField(term162917, term162917.getClass(), "winCount", -61980376);
        setIntField(term162917, term162917.getClass(), "helpCount", 507463127);
        setIntField(term162917, term162917.getClass(), "comboCount", -455476320);
        setIntField(term162917, term162917.getClass(), "feverCount", 301886967);
        setIntField(term162917, term162917.getClass(), "totalHiScore", 1790148819);
        setIntField(term162917, term162917.getClass(), "totalEasyHighScore", -601874101);
        setIntField(term162917, term162917.getClass(), "totalBasicHighScore", 126724695);
        setIntField(term162917, term162917.getClass(), "totalAdvancedHighScore", 1756205967);
        setIntField(term162917, term162917.getClass(), "totalExpertHighScore", -127253041);
        setIntField(term162917, term162917.getClass(), "totalMasterHighScore", -1811207274);
        setIntField(term162917, term162917.getClass(), "totalReMasterHighScore", 768422554);
        setIntField(term162917, term162917.getClass(), "totalHighSync", 394650643);
        setIntField(term162917, term162917.getClass(), "totalEasySync", -932679601);
        setIntField(term162917, term162917.getClass(), "totalBasicSync", -1330421355);
        setIntField(term162917, term162917.getClass(), "totalAdvancedSync", 1571484497);
        setIntField(term162917, term162917.getClass(), "totalExpertSync", -206357114);
        setIntField(term162917, term162917.getClass(), "totalMasterSync", 535792127);
        setIntField(term162917, term162917.getClass(), "totalReMasterSync", 1312846329);
        setIntField(term162917, term162917.getClass(), "playerRating", 1121498182);
        setIntField(term162917, term162917.getClass(), "highestRating", 382253178);
        setIntField(term162917, term162917.getClass(), "rankAuthTailId", -1183590239);
        setField(term162917, term162917.getClass(), "eventWatchedDate", "WlleIjkKZP");
        setField(term162917, term162917.getClass(), "webLimitDate", "psVYDPctDq");
        setIntField(term162917, term162917.getClass(), "challengeTrackPhase", -1714250163);
        setIntField(term162917, term162917.getClass(), "firstPlayBits", 1034423507);
        setField(term162917, term162917.getClass(), "lastPlayDate", "JlSzeHQccT");
        setIntField(term162917, term162917.getClass(), "lastPlaceId", 1679956659);
        setField(term162917, term162917.getClass(), "lastPlaceName", "RGbggEITDh");
        setIntField(term162917, term162917.getClass(), "lastRegionId", 55150040);
        setField(term162917, term162917.getClass(), "lastRegionName", "QUvccjNkOP");
        setField(term162917, term162917.getClass(), "lastClientId", "tSAXbiQHko");
        setField(term162917, term162917.getClass(), "lastCountryCode", "YVEDjJuvaY");
        setIntField(term162917, term162917.getClass(), "eventPoint", -1569380298);
        setIntField(term162917, term162917.getClass(), "totalLv", -618790435);
        setIntField(term162917, term162917.getClass(), "lastLoginBonusDay", 2115457033);
        setIntField(term162917, term162917.getClass(), "lastSurvivalBonusDay", -279187388);
        setIntField(term162917, term162917.getClass(), "loginBonusLv", -1821126917);
        setField(term162915, term162915.getClass(), "user", term162917);
        setIntField(term162915, term162915.getClass(), "orderId", -1479667968);
        setLongField(term162915, term162915.getClass(), "sortNumber", -1613345286663863879L);
        setIntField(term162915, term162915.getClass(), "placeId", -344715886);
        setField(term162915, term162915.getClass(), "placeName", "zVFIRDapJz");
        setField(term162915, term162915.getClass(), "country", "loIwFxbUPE");
        setIntField(term162915, term162915.getClass(), "regionId", 14711246);
        setField(term162915, term162915.getClass(), "playDate", "VqpICJekjO");
        setField(term162915, term162915.getClass(), "userPlayDate", "MflCXDvTuO");
        setIntField(term162915, term162915.getClass(), "musicId", 1011622215);
        setIntField(term162915, term162915.getClass(), "level", 968888075);
        setIntField(term162915, term162915.getClass(), "gameMode", -1071381760);
        setIntField(term162915, term162915.getClass(), "rivalNum", 305620804);
        setIntField(term162915, term162915.getClass(), "track", -826562770);
        setIntField(term162915, term162915.getClass(), "eventId", 166180782);
        setBooleanField(term162915, term162915.getClass(), "isFreeToPlay", false);
        setIntField(term162915, term162915.getClass(), "playerRating", -1339670970);
        setLongField(term162915, term162915.getClass(), "playedUserId1", -8834993911974447264L);
        setField(term162915, term162915.getClass(), "playedUserName1", "XQFFoiySPq");
        setIntField(term162915, term162915.getClass(), "playedMusicLevel1", 625124647);
        setLongField(term162915, term162915.getClass(), "playedUserId2", 2641309860463903358L);
        setField(term162915, term162915.getClass(), "playedUserName2", "IRtNRIRHTg");
        setIntField(term162915, term162915.getClass(), "playedMusicLevel2", -738711443);
        setLongField(term162915, term162915.getClass(), "playedUserId3", -7886022676278295268L);
        setField(term162915, term162915.getClass(), "playedUserName3", "fHocghEAVR");
        setIntField(term162915, term162915.getClass(), "playedMusicLevel3", 720084082);
        setIntField(term162915, term162915.getClass(), "achievement", -2054783);
        setIntField(term162915, term162915.getClass(), "score", -861698621);
        setIntField(term162915, term162915.getClass(), "tapScore", 120558325);
        setIntField(term162915, term162915.getClass(), "holdScore", 879029480);
        setIntField(term162915, term162915.getClass(), "slideScore", 1662429974);
        setIntField(term162915, term162915.getClass(), "breakScore", 164482176);
        setIntField(term162915, term162915.getClass(), "syncRate", 1229014442);
        setIntField(term162915, term162915.getClass(), "vsWin", 1721786917);
        setBooleanField(term162915, term162915.getClass(), "isAllPerfect", false);
        setIntField(term162915, term162915.getClass(), "fullCombo", 173318167);
        setIntField(term162915, term162915.getClass(), "maxFever", 468687480);
        setIntField(term162915, term162915.getClass(), "maxCombo", -2005220505);
        setIntField(term162915, term162915.getClass(), "tapPerfect", 1585188717);
        setIntField(term162915, term162915.getClass(), "tapGreat", -2930454);
        setIntField(term162915, term162915.getClass(), "tapGood", -1013772215);
        setIntField(term162915, term162915.getClass(), "tapBad", -885124539);
        setIntField(term162915, term162915.getClass(), "holdPerfect", -494597587);
        setIntField(term162915, term162915.getClass(), "holdGreat", -1897031636);
        setIntField(term162915, term162915.getClass(), "holdGood", 400013611);
        setIntField(term162915, term162915.getClass(), "holdBad", -1642575075);
        setIntField(term162915, term162915.getClass(), "slidePerfect", -852288210);
        setIntField(term162915, term162915.getClass(), "slideGreat", -293817390);
        setIntField(term162915, term162915.getClass(), "slideGood", -1318120636);
        setIntField(term162915, term162915.getClass(), "slideBad", -919397046);
        setIntField(term162915, term162915.getClass(), "breakPerfect", -1152386296);
        setIntField(term162915, term162915.getClass(), "breakGreat", 1426892945);
        setIntField(term162915, term162915.getClass(), "breakGood", -1234646726);
        setIntField(term162915, term162915.getClass(), "breakBad", 1047808691);
        setBooleanField(term162915, term162915.getClass(), "isTrackSkip", true);
        setBooleanField(term162915, term162915.getClass(), "isHighScore", false);
        setBooleanField(term162915, term162915.getClass(), "isChallengeTrack", true);
        setIntField(term162915, term162915.getClass(), "challengeLife", -2072337452);
        setIntField(term162915, term162915.getClass(), "challengeRemain", 807300991);
        setIntField(term162915, term162915.getClass(), "isAllPerfectPlus", 496005386);
        term163227 = new Integer(-984981496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term163227;
        callMethod(klass, "setHoldGood", argTypes, term162915, args);
    }

};


