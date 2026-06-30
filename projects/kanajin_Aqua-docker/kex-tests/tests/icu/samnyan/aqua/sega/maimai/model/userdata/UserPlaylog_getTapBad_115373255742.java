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

public class UserPlaylog_getTapBad_115373255742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132215;

    public UserPlaylog_getTapBad_115373255742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132221 = new Long(6077991958696417121L);
        term132215 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term132217 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term132219 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132250 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132215, term132215.getClass(), "id", -3940823299046887533L);
        setLongField(term132217, term132217.getClass(), "id", 1916346681449508616L);
        setLongField(term132219, term132219.getClass(), "id", 8115348150286567116L);
        setField(term132219, term132219.getClass(), "extId", term132221);
        setField(term132219, term132219.getClass(), "luid", "bZOShgQvtT");
        setIntField(term132236, term132236.getClass(), "year", 2015);
        setShortField(term132236, term132236.getClass(), "month", (short) 1);
        setShortField(term132236, term132236.getClass(), "day", (short) 28);
        setField(term132235, term132235.getClass(), "date", term132236);
        setByteField(term132240, term132240.getClass(), "hour", (byte) 19);
        setByteField(term132240, term132240.getClass(), "minute", (byte) 25);
        setByteField(term132240, term132240.getClass(), "second", (byte) 21);
        setIntField(term132240, term132240.getClass(), "nano", 419809555);
        setField(term132235, term132235.getClass(), "time", term132240);
        setField(term132219, term132219.getClass(), "registerTime", term132235);
        setIntField(term132246, term132246.getClass(), "year", 2016);
        setShortField(term132246, term132246.getClass(), "month", (short) 3);
        setShortField(term132246, term132246.getClass(), "day", (short) 9);
        setField(term132245, term132245.getClass(), "date", term132246);
        setByteField(term132250, term132250.getClass(), "hour", (byte) 14);
        setByteField(term132250, term132250.getClass(), "minute", (byte) 25);
        setByteField(term132250, term132250.getClass(), "second", (byte) 3);
        setIntField(term132250, term132250.getClass(), "nano", 268186564);
        setField(term132245, term132245.getClass(), "time", term132250);
        setField(term132219, term132219.getClass(), "accessTime", term132245);
        setField(term132217, term132217.getClass(), "card", term132219);
        setIntField(term132217, term132217.getClass(), "lastDataVersion", 189925564);
        setField(term132217, term132217.getClass(), "userName", "SrodJwobhd");
        setIntField(term132217, term132217.getClass(), "point", -1624176648);
        setIntField(term132217, term132217.getClass(), "totalPoint", -1110552515);
        setIntField(term132217, term132217.getClass(), "iconId", 1693657312);
        setIntField(term132217, term132217.getClass(), "nameplateId", -1593288718);
        setIntField(term132217, term132217.getClass(), "frameId", -1708472547);
        setIntField(term132217, term132217.getClass(), "trophyId", 874901091);
        setIntField(term132217, term132217.getClass(), "playCount", -1273024348);
        setIntField(term132217, term132217.getClass(), "playVsCount", 1511312168);
        setIntField(term132217, term132217.getClass(), "playSyncCount", -1864897841);
        setIntField(term132217, term132217.getClass(), "winCount", 831738832);
        setIntField(term132217, term132217.getClass(), "helpCount", -981559823);
        setIntField(term132217, term132217.getClass(), "comboCount", 369520724);
        setIntField(term132217, term132217.getClass(), "feverCount", 604315124);
        setIntField(term132217, term132217.getClass(), "totalHiScore", 1474708071);
        setIntField(term132217, term132217.getClass(), "totalEasyHighScore", -835592791);
        setIntField(term132217, term132217.getClass(), "totalBasicHighScore", -87410665);
        setIntField(term132217, term132217.getClass(), "totalAdvancedHighScore", -1185466701);
        setIntField(term132217, term132217.getClass(), "totalExpertHighScore", -1572652644);
        setIntField(term132217, term132217.getClass(), "totalMasterHighScore", 1749808685);
        setIntField(term132217, term132217.getClass(), "totalReMasterHighScore", -265393325);
        setIntField(term132217, term132217.getClass(), "totalHighSync", -363381122);
        setIntField(term132217, term132217.getClass(), "totalEasySync", 1478916134);
        setIntField(term132217, term132217.getClass(), "totalBasicSync", 1754376447);
        setIntField(term132217, term132217.getClass(), "totalAdvancedSync", -1649449473);
        setIntField(term132217, term132217.getClass(), "totalExpertSync", -1746373038);
        setIntField(term132217, term132217.getClass(), "totalMasterSync", 1160307954);
        setIntField(term132217, term132217.getClass(), "totalReMasterSync", -544472408);
        setIntField(term132217, term132217.getClass(), "playerRating", -422270147);
        setIntField(term132217, term132217.getClass(), "highestRating", 1482939197);
        setIntField(term132217, term132217.getClass(), "rankAuthTailId", -176811174);
        setField(term132217, term132217.getClass(), "eventWatchedDate", "aEKxCMZaAl");
        setField(term132217, term132217.getClass(), "webLimitDate", "uVksDvNeyo");
        setIntField(term132217, term132217.getClass(), "challengeTrackPhase", -679553829);
        setIntField(term132217, term132217.getClass(), "firstPlayBits", 2000856748);
        setField(term132217, term132217.getClass(), "lastPlayDate", "KThgZcLeyJ");
        setIntField(term132217, term132217.getClass(), "lastPlaceId", 541650721);
        setField(term132217, term132217.getClass(), "lastPlaceName", "qTgeYJrPfV");
        setIntField(term132217, term132217.getClass(), "lastRegionId", 1780602518);
        setField(term132217, term132217.getClass(), "lastRegionName", "aMXuzqauuw");
        setField(term132217, term132217.getClass(), "lastClientId", "OsLyHIAMvZ");
        setField(term132217, term132217.getClass(), "lastCountryCode", "fANlppmeZc");
        setIntField(term132217, term132217.getClass(), "eventPoint", -2042448166);
        setIntField(term132217, term132217.getClass(), "totalLv", -317280517);
        setIntField(term132217, term132217.getClass(), "lastLoginBonusDay", -1372862026);
        setIntField(term132217, term132217.getClass(), "lastSurvivalBonusDay", 410982514);
        setIntField(term132217, term132217.getClass(), "loginBonusLv", 269756440);
        setField(term132215, term132215.getClass(), "user", term132217);
        setIntField(term132215, term132215.getClass(), "orderId", 191372734);
        setLongField(term132215, term132215.getClass(), "sortNumber", 6549453781602844135L);
        setIntField(term132215, term132215.getClass(), "placeId", -695945772);
        setField(term132215, term132215.getClass(), "placeName", "vwXdXCgQIr");
        setField(term132215, term132215.getClass(), "country", "nSnrziJcBE");
        setIntField(term132215, term132215.getClass(), "regionId", -1417615551);
        setField(term132215, term132215.getClass(), "playDate", "xbhJrXUuCP");
        setField(term132215, term132215.getClass(), "userPlayDate", "bvjVBhkXQU");
        setIntField(term132215, term132215.getClass(), "musicId", -2057324257);
        setIntField(term132215, term132215.getClass(), "level", -1591570300);
        setIntField(term132215, term132215.getClass(), "gameMode", 998629106);
        setIntField(term132215, term132215.getClass(), "rivalNum", -1320554735);
        setIntField(term132215, term132215.getClass(), "track", -2085790029);
        setIntField(term132215, term132215.getClass(), "eventId", 1461364520);
        setBooleanField(term132215, term132215.getClass(), "isFreeToPlay", false);
        setIntField(term132215, term132215.getClass(), "playerRating", -60828951);
        setLongField(term132215, term132215.getClass(), "playedUserId1", -7858384696957926965L);
        setField(term132215, term132215.getClass(), "playedUserName1", "IrOvUMupuD");
        setIntField(term132215, term132215.getClass(), "playedMusicLevel1", 1620955679);
        setLongField(term132215, term132215.getClass(), "playedUserId2", -7639406314873940496L);
        setField(term132215, term132215.getClass(), "playedUserName2", "UgFQTaylqs");
        setIntField(term132215, term132215.getClass(), "playedMusicLevel2", 1061901111);
        setLongField(term132215, term132215.getClass(), "playedUserId3", -5550345592284314693L);
        setField(term132215, term132215.getClass(), "playedUserName3", "CZksebZXsC");
        setIntField(term132215, term132215.getClass(), "playedMusicLevel3", -729820313);
        setIntField(term132215, term132215.getClass(), "achievement", 782621694);
        setIntField(term132215, term132215.getClass(), "score", -450161523);
        setIntField(term132215, term132215.getClass(), "tapScore", -897897904);
        setIntField(term132215, term132215.getClass(), "holdScore", -538767949);
        setIntField(term132215, term132215.getClass(), "slideScore", -2146470114);
        setIntField(term132215, term132215.getClass(), "breakScore", 232492882);
        setIntField(term132215, term132215.getClass(), "syncRate", 636091079);
        setIntField(term132215, term132215.getClass(), "vsWin", -1372355770);
        setBooleanField(term132215, term132215.getClass(), "isAllPerfect", false);
        setIntField(term132215, term132215.getClass(), "fullCombo", -1360762261);
        setIntField(term132215, term132215.getClass(), "maxFever", -389767567);
        setIntField(term132215, term132215.getClass(), "maxCombo", 526828211);
        setIntField(term132215, term132215.getClass(), "tapPerfect", 495948153);
        setIntField(term132215, term132215.getClass(), "tapGreat", -533381129);
        setIntField(term132215, term132215.getClass(), "tapGood", 1546616429);
        setIntField(term132215, term132215.getClass(), "tapBad", -1118279209);
        setIntField(term132215, term132215.getClass(), "holdPerfect", 1759093333);
        setIntField(term132215, term132215.getClass(), "holdGreat", -2066077490);
        setIntField(term132215, term132215.getClass(), "holdGood", 1724222715);
        setIntField(term132215, term132215.getClass(), "holdBad", 296158792);
        setIntField(term132215, term132215.getClass(), "slidePerfect", 132497002);
        setIntField(term132215, term132215.getClass(), "slideGreat", 89033786);
        setIntField(term132215, term132215.getClass(), "slideGood", -1720491783);
        setIntField(term132215, term132215.getClass(), "slideBad", -740145325);
        setIntField(term132215, term132215.getClass(), "breakPerfect", 403564511);
        setIntField(term132215, term132215.getClass(), "breakGreat", -518011071);
        setIntField(term132215, term132215.getClass(), "breakGood", -11473506);
        setIntField(term132215, term132215.getClass(), "breakBad", 984165021);
        setBooleanField(term132215, term132215.getClass(), "isTrackSkip", true);
        setBooleanField(term132215, term132215.getClass(), "isHighScore", true);
        setBooleanField(term132215, term132215.getClass(), "isChallengeTrack", true);
        setIntField(term132215, term132215.getClass(), "challengeLife", 1330156234);
        setIntField(term132215, term132215.getClass(), "challengeRemain", 621404274);
        setIntField(term132215, term132215.getClass(), "isAllPerfectPlus", -502520589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapBad", argTypes, term132215, args);
    }

};


