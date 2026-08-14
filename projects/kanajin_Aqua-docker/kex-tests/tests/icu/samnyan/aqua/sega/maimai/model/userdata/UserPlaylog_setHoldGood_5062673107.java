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

public class UserPlaylog_setHoldGood_5062673107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162971;
     Object term163283;

    public UserPlaylog_setHoldGood_5062673107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162977 = new Long(-5903549884298836343L);
        term162971 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term162973 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term162975 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term162991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163006 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term162971, term162971.getClass(), "id", 3042394513611697851L);
        setLongField(term162973, term162973.getClass(), "id", 4021900249730695810L);
        setLongField(term162975, term162975.getClass(), "id", 3053042769254952980L);
        setField(term162975, term162975.getClass(), "extId", term162977);
        setField(term162975, term162975.getClass(), "luid", "nHkhqzmpyo");
        setIntField(term162992, term162992.getClass(), "year", 2027);
        setShortField(term162992, term162992.getClass(), "month", (short) 6);
        setShortField(term162992, term162992.getClass(), "day", (short) 13);
        setField(term162991, term162991.getClass(), "date", term162992);
        setByteField(term162996, term162996.getClass(), "hour", (byte) 4);
        setByteField(term162996, term162996.getClass(), "minute", (byte) 7);
        setByteField(term162996, term162996.getClass(), "second", (byte) 55);
        setIntField(term162996, term162996.getClass(), "nano", 288212169);
        setField(term162991, term162991.getClass(), "time", term162996);
        setField(term162975, term162975.getClass(), "registerTime", term162991);
        setIntField(term163002, term163002.getClass(), "year", 2016);
        setShortField(term163002, term163002.getClass(), "month", (short) 8);
        setShortField(term163002, term163002.getClass(), "day", (short) 20);
        setField(term163001, term163001.getClass(), "date", term163002);
        setByteField(term163006, term163006.getClass(), "hour", (byte) 15);
        setByteField(term163006, term163006.getClass(), "minute", (byte) 59);
        setByteField(term163006, term163006.getClass(), "second", (byte) 24);
        setIntField(term163006, term163006.getClass(), "nano", 817884348);
        setField(term163001, term163001.getClass(), "time", term163006);
        setField(term162975, term162975.getClass(), "accessTime", term163001);
        setField(term162973, term162973.getClass(), "card", term162975);
        setIntField(term162973, term162973.getClass(), "lastDataVersion", 56755956);
        setField(term162973, term162973.getClass(), "userName", "UsfMPJEJAN");
        setIntField(term162973, term162973.getClass(), "point", -1314899847);
        setIntField(term162973, term162973.getClass(), "totalPoint", -888543810);
        setIntField(term162973, term162973.getClass(), "iconId", -1084206906);
        setIntField(term162973, term162973.getClass(), "nameplateId", -1819445741);
        setIntField(term162973, term162973.getClass(), "frameId", -1810043859);
        setIntField(term162973, term162973.getClass(), "trophyId", 1401192135);
        setIntField(term162973, term162973.getClass(), "playCount", 1201714538);
        setIntField(term162973, term162973.getClass(), "playVsCount", -642183946);
        setIntField(term162973, term162973.getClass(), "playSyncCount", 1338802034);
        setIntField(term162973, term162973.getClass(), "winCount", -61980376);
        setIntField(term162973, term162973.getClass(), "helpCount", 507463127);
        setIntField(term162973, term162973.getClass(), "comboCount", -455476320);
        setIntField(term162973, term162973.getClass(), "feverCount", 301886967);
        setIntField(term162973, term162973.getClass(), "totalHiScore", 1790148819);
        setIntField(term162973, term162973.getClass(), "totalEasyHighScore", -601874101);
        setIntField(term162973, term162973.getClass(), "totalBasicHighScore", 126724695);
        setIntField(term162973, term162973.getClass(), "totalAdvancedHighScore", 1756205967);
        setIntField(term162973, term162973.getClass(), "totalExpertHighScore", -127253041);
        setIntField(term162973, term162973.getClass(), "totalMasterHighScore", -1811207274);
        setIntField(term162973, term162973.getClass(), "totalReMasterHighScore", 768422554);
        setIntField(term162973, term162973.getClass(), "totalHighSync", 394650643);
        setIntField(term162973, term162973.getClass(), "totalEasySync", -932679601);
        setIntField(term162973, term162973.getClass(), "totalBasicSync", -1330421355);
        setIntField(term162973, term162973.getClass(), "totalAdvancedSync", 1571484497);
        setIntField(term162973, term162973.getClass(), "totalExpertSync", -206357114);
        setIntField(term162973, term162973.getClass(), "totalMasterSync", 535792127);
        setIntField(term162973, term162973.getClass(), "totalReMasterSync", 1312846329);
        setIntField(term162973, term162973.getClass(), "playerRating", 1121498182);
        setIntField(term162973, term162973.getClass(), "highestRating", 382253178);
        setIntField(term162973, term162973.getClass(), "rankAuthTailId", -1183590239);
        setField(term162973, term162973.getClass(), "eventWatchedDate", "WlleIjkKZP");
        setField(term162973, term162973.getClass(), "webLimitDate", "psVYDPctDq");
        setIntField(term162973, term162973.getClass(), "challengeTrackPhase", -1714250163);
        setIntField(term162973, term162973.getClass(), "firstPlayBits", 1034423507);
        setField(term162973, term162973.getClass(), "lastPlayDate", "JlSzeHQccT");
        setIntField(term162973, term162973.getClass(), "lastPlaceId", 1679956659);
        setField(term162973, term162973.getClass(), "lastPlaceName", "RGbggEITDh");
        setIntField(term162973, term162973.getClass(), "lastRegionId", 55150040);
        setField(term162973, term162973.getClass(), "lastRegionName", "QUvccjNkOP");
        setField(term162973, term162973.getClass(), "lastClientId", "tSAXbiQHko");
        setField(term162973, term162973.getClass(), "lastCountryCode", "YVEDjJuvaY");
        setIntField(term162973, term162973.getClass(), "eventPoint", -1569380298);
        setIntField(term162973, term162973.getClass(), "totalLv", -618790435);
        setIntField(term162973, term162973.getClass(), "lastLoginBonusDay", 2115457033);
        setIntField(term162973, term162973.getClass(), "lastSurvivalBonusDay", -279187388);
        setIntField(term162973, term162973.getClass(), "loginBonusLv", -1821126917);
        setField(term162971, term162971.getClass(), "user", term162973);
        setIntField(term162971, term162971.getClass(), "orderId", -1479667968);
        setLongField(term162971, term162971.getClass(), "sortNumber", -1613345286663863879L);
        setIntField(term162971, term162971.getClass(), "placeId", -344715886);
        setField(term162971, term162971.getClass(), "placeName", "zVFIRDapJz");
        setField(term162971, term162971.getClass(), "country", "loIwFxbUPE");
        setIntField(term162971, term162971.getClass(), "regionId", 14711246);
        setField(term162971, term162971.getClass(), "playDate", "VqpICJekjO");
        setField(term162971, term162971.getClass(), "userPlayDate", "MflCXDvTuO");
        setIntField(term162971, term162971.getClass(), "musicId", 1011622215);
        setIntField(term162971, term162971.getClass(), "level", 968888075);
        setIntField(term162971, term162971.getClass(), "gameMode", -1071381760);
        setIntField(term162971, term162971.getClass(), "rivalNum", 305620804);
        setIntField(term162971, term162971.getClass(), "track", -826562770);
        setIntField(term162971, term162971.getClass(), "eventId", 166180782);
        setBooleanField(term162971, term162971.getClass(), "isFreeToPlay", false);
        setIntField(term162971, term162971.getClass(), "playerRating", -1339670970);
        setLongField(term162971, term162971.getClass(), "playedUserId1", -8834993911974447264L);
        setField(term162971, term162971.getClass(), "playedUserName1", "XQFFoiySPq");
        setIntField(term162971, term162971.getClass(), "playedMusicLevel1", 625124647);
        setLongField(term162971, term162971.getClass(), "playedUserId2", 2641309860463903358L);
        setField(term162971, term162971.getClass(), "playedUserName2", "IRtNRIRHTg");
        setIntField(term162971, term162971.getClass(), "playedMusicLevel2", -738711443);
        setLongField(term162971, term162971.getClass(), "playedUserId3", -7886022676278295268L);
        setField(term162971, term162971.getClass(), "playedUserName3", "fHocghEAVR");
        setIntField(term162971, term162971.getClass(), "playedMusicLevel3", 720084082);
        setIntField(term162971, term162971.getClass(), "achievement", -2054783);
        setIntField(term162971, term162971.getClass(), "score", -861698621);
        setIntField(term162971, term162971.getClass(), "tapScore", 120558325);
        setIntField(term162971, term162971.getClass(), "holdScore", 879029480);
        setIntField(term162971, term162971.getClass(), "slideScore", 1662429974);
        setIntField(term162971, term162971.getClass(), "breakScore", 164482176);
        setIntField(term162971, term162971.getClass(), "syncRate", 1229014442);
        setIntField(term162971, term162971.getClass(), "vsWin", 1721786917);
        setBooleanField(term162971, term162971.getClass(), "isAllPerfect", false);
        setIntField(term162971, term162971.getClass(), "fullCombo", 173318167);
        setIntField(term162971, term162971.getClass(), "maxFever", 468687480);
        setIntField(term162971, term162971.getClass(), "maxCombo", -2005220505);
        setIntField(term162971, term162971.getClass(), "tapPerfect", 1585188717);
        setIntField(term162971, term162971.getClass(), "tapGreat", -2930454);
        setIntField(term162971, term162971.getClass(), "tapGood", -1013772215);
        setIntField(term162971, term162971.getClass(), "tapBad", -885124539);
        setIntField(term162971, term162971.getClass(), "holdPerfect", -494597587);
        setIntField(term162971, term162971.getClass(), "holdGreat", -1897031636);
        setIntField(term162971, term162971.getClass(), "holdGood", 400013611);
        setIntField(term162971, term162971.getClass(), "holdBad", -1642575075);
        setIntField(term162971, term162971.getClass(), "slidePerfect", -852288210);
        setIntField(term162971, term162971.getClass(), "slideGreat", -293817390);
        setIntField(term162971, term162971.getClass(), "slideGood", -1318120636);
        setIntField(term162971, term162971.getClass(), "slideBad", -919397046);
        setIntField(term162971, term162971.getClass(), "breakPerfect", -1152386296);
        setIntField(term162971, term162971.getClass(), "breakGreat", 1426892945);
        setIntField(term162971, term162971.getClass(), "breakGood", -1234646726);
        setIntField(term162971, term162971.getClass(), "breakBad", 1047808691);
        setBooleanField(term162971, term162971.getClass(), "isTrackSkip", true);
        setBooleanField(term162971, term162971.getClass(), "isHighScore", false);
        setBooleanField(term162971, term162971.getClass(), "isChallengeTrack", true);
        setIntField(term162971, term162971.getClass(), "challengeLife", -2072337452);
        setIntField(term162971, term162971.getClass(), "challengeRemain", 807300991);
        setIntField(term162971, term162971.getClass(), "isAllPerfectPlus", 496005386);
        term163283 = new Integer(-984981496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term163283;
        callMethod(klass, "setHoldGood", argTypes, term162971, args);
    }

};


