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

public class UserPlaylog_setBreakPerfect_449840543113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165815;
     Object term166127;

    public UserPlaylog_setBreakPerfect_449840543113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165821 = new Long(-6237686742902369498L);
        term165815 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term165817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term165819 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165850 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165815, term165815.getClass(), "id", 3301022507846192876L);
        setLongField(term165817, term165817.getClass(), "id", -436006713622235897L);
        setLongField(term165819, term165819.getClass(), "id", -5888397861122761293L);
        setField(term165819, term165819.getClass(), "extId", term165821);
        setField(term165819, term165819.getClass(), "luid", "lkySuzJAZx");
        setIntField(term165836, term165836.getClass(), "year", 2014);
        setShortField(term165836, term165836.getClass(), "month", (short) 1);
        setShortField(term165836, term165836.getClass(), "day", (short) 7);
        setField(term165835, term165835.getClass(), "date", term165836);
        setByteField(term165840, term165840.getClass(), "hour", (byte) 16);
        setByteField(term165840, term165840.getClass(), "minute", (byte) 12);
        setByteField(term165840, term165840.getClass(), "second", (byte) 5);
        setIntField(term165840, term165840.getClass(), "nano", 977610129);
        setField(term165835, term165835.getClass(), "time", term165840);
        setField(term165819, term165819.getClass(), "registerTime", term165835);
        setIntField(term165846, term165846.getClass(), "year", 2010);
        setShortField(term165846, term165846.getClass(), "month", (short) 7);
        setShortField(term165846, term165846.getClass(), "day", (short) 7);
        setField(term165845, term165845.getClass(), "date", term165846);
        setByteField(term165850, term165850.getClass(), "hour", (byte) 6);
        setByteField(term165850, term165850.getClass(), "minute", (byte) 57);
        setByteField(term165850, term165850.getClass(), "second", (byte) 11);
        setIntField(term165850, term165850.getClass(), "nano", 667015440);
        setField(term165845, term165845.getClass(), "time", term165850);
        setField(term165819, term165819.getClass(), "accessTime", term165845);
        setField(term165817, term165817.getClass(), "card", term165819);
        setIntField(term165817, term165817.getClass(), "lastDataVersion", 476339625);
        setField(term165817, term165817.getClass(), "userName", "SzCYINBfMP");
        setIntField(term165817, term165817.getClass(), "point", -1718005832);
        setIntField(term165817, term165817.getClass(), "totalPoint", -1734715475);
        setIntField(term165817, term165817.getClass(), "iconId", -318943110);
        setIntField(term165817, term165817.getClass(), "nameplateId", -1051838393);
        setIntField(term165817, term165817.getClass(), "frameId", 2096731713);
        setIntField(term165817, term165817.getClass(), "trophyId", -110227629);
        setIntField(term165817, term165817.getClass(), "playCount", 1070859706);
        setIntField(term165817, term165817.getClass(), "playVsCount", 315364230);
        setIntField(term165817, term165817.getClass(), "playSyncCount", -1304585103);
        setIntField(term165817, term165817.getClass(), "winCount", -27360426);
        setIntField(term165817, term165817.getClass(), "helpCount", 766689350);
        setIntField(term165817, term165817.getClass(), "comboCount", -1662533282);
        setIntField(term165817, term165817.getClass(), "feverCount", -447585151);
        setIntField(term165817, term165817.getClass(), "totalHiScore", -1030615976);
        setIntField(term165817, term165817.getClass(), "totalEasyHighScore", 506140659);
        setIntField(term165817, term165817.getClass(), "totalBasicHighScore", 493454819);
        setIntField(term165817, term165817.getClass(), "totalAdvancedHighScore", 492765636);
        setIntField(term165817, term165817.getClass(), "totalExpertHighScore", 737730732);
        setIntField(term165817, term165817.getClass(), "totalMasterHighScore", 119713499);
        setIntField(term165817, term165817.getClass(), "totalReMasterHighScore", 1401312698);
        setIntField(term165817, term165817.getClass(), "totalHighSync", -520001527);
        setIntField(term165817, term165817.getClass(), "totalEasySync", -474662427);
        setIntField(term165817, term165817.getClass(), "totalBasicSync", -1084348067);
        setIntField(term165817, term165817.getClass(), "totalAdvancedSync", 462358472);
        setIntField(term165817, term165817.getClass(), "totalExpertSync", 1350454595);
        setIntField(term165817, term165817.getClass(), "totalMasterSync", -1134051415);
        setIntField(term165817, term165817.getClass(), "totalReMasterSync", -2005589401);
        setIntField(term165817, term165817.getClass(), "playerRating", 2146725419);
        setIntField(term165817, term165817.getClass(), "highestRating", -1411710613);
        setIntField(term165817, term165817.getClass(), "rankAuthTailId", -1051243574);
        setField(term165817, term165817.getClass(), "eventWatchedDate", "SZxGdkheQC");
        setField(term165817, term165817.getClass(), "webLimitDate", "ezHsVprTGp");
        setIntField(term165817, term165817.getClass(), "challengeTrackPhase", 1465556982);
        setIntField(term165817, term165817.getClass(), "firstPlayBits", 364874349);
        setField(term165817, term165817.getClass(), "lastPlayDate", "LYGBvfTqST");
        setIntField(term165817, term165817.getClass(), "lastPlaceId", -387817307);
        setField(term165817, term165817.getClass(), "lastPlaceName", "SUHmXgYhGj");
        setIntField(term165817, term165817.getClass(), "lastRegionId", -112698474);
        setField(term165817, term165817.getClass(), "lastRegionName", "cYhJgiPexe");
        setField(term165817, term165817.getClass(), "lastClientId", "zIofafmnvq");
        setField(term165817, term165817.getClass(), "lastCountryCode", "TUlaPxQqxL");
        setIntField(term165817, term165817.getClass(), "eventPoint", -1420178466);
        setIntField(term165817, term165817.getClass(), "totalLv", -522432266);
        setIntField(term165817, term165817.getClass(), "lastLoginBonusDay", -645643359);
        setIntField(term165817, term165817.getClass(), "lastSurvivalBonusDay", -800472466);
        setIntField(term165817, term165817.getClass(), "loginBonusLv", 2065626310);
        setField(term165815, term165815.getClass(), "user", term165817);
        setIntField(term165815, term165815.getClass(), "orderId", -1081561149);
        setLongField(term165815, term165815.getClass(), "sortNumber", -2860770035477349220L);
        setIntField(term165815, term165815.getClass(), "placeId", -267316668);
        setField(term165815, term165815.getClass(), "placeName", "wJwrAJjLHN");
        setField(term165815, term165815.getClass(), "country", "gSRycxEfPs");
        setIntField(term165815, term165815.getClass(), "regionId", -1845399147);
        setField(term165815, term165815.getClass(), "playDate", "GbkbXMhBtB");
        setField(term165815, term165815.getClass(), "userPlayDate", "STgtLenzXP");
        setIntField(term165815, term165815.getClass(), "musicId", 1382095734);
        setIntField(term165815, term165815.getClass(), "level", -1826567083);
        setIntField(term165815, term165815.getClass(), "gameMode", -758555514);
        setIntField(term165815, term165815.getClass(), "rivalNum", -346199735);
        setIntField(term165815, term165815.getClass(), "track", 423661653);
        setIntField(term165815, term165815.getClass(), "eventId", -761484053);
        setBooleanField(term165815, term165815.getClass(), "isFreeToPlay", false);
        setIntField(term165815, term165815.getClass(), "playerRating", -1252811363);
        setLongField(term165815, term165815.getClass(), "playedUserId1", 1263388002539564753L);
        setField(term165815, term165815.getClass(), "playedUserName1", "pnHopfEgPj");
        setIntField(term165815, term165815.getClass(), "playedMusicLevel1", -331733225);
        setLongField(term165815, term165815.getClass(), "playedUserId2", 226144339570799839L);
        setField(term165815, term165815.getClass(), "playedUserName2", "iJGTSezGOP");
        setIntField(term165815, term165815.getClass(), "playedMusicLevel2", -592222932);
        setLongField(term165815, term165815.getClass(), "playedUserId3", 2847433178831759443L);
        setField(term165815, term165815.getClass(), "playedUserName3", "cYJhSeWnSi");
        setIntField(term165815, term165815.getClass(), "playedMusicLevel3", 664977650);
        setIntField(term165815, term165815.getClass(), "achievement", 1126731099);
        setIntField(term165815, term165815.getClass(), "score", -388946581);
        setIntField(term165815, term165815.getClass(), "tapScore", 94418736);
        setIntField(term165815, term165815.getClass(), "holdScore", 492174524);
        setIntField(term165815, term165815.getClass(), "slideScore", -601316396);
        setIntField(term165815, term165815.getClass(), "breakScore", 752304230);
        setIntField(term165815, term165815.getClass(), "syncRate", -1227352770);
        setIntField(term165815, term165815.getClass(), "vsWin", -1489142672);
        setBooleanField(term165815, term165815.getClass(), "isAllPerfect", false);
        setIntField(term165815, term165815.getClass(), "fullCombo", -225201341);
        setIntField(term165815, term165815.getClass(), "maxFever", 140252148);
        setIntField(term165815, term165815.getClass(), "maxCombo", 153257576);
        setIntField(term165815, term165815.getClass(), "tapPerfect", 2047795777);
        setIntField(term165815, term165815.getClass(), "tapGreat", -1715094483);
        setIntField(term165815, term165815.getClass(), "tapGood", 100181788);
        setIntField(term165815, term165815.getClass(), "tapBad", -729877329);
        setIntField(term165815, term165815.getClass(), "holdPerfect", 1728308194);
        setIntField(term165815, term165815.getClass(), "holdGreat", 1168793542);
        setIntField(term165815, term165815.getClass(), "holdGood", 1408039066);
        setIntField(term165815, term165815.getClass(), "holdBad", -294387694);
        setIntField(term165815, term165815.getClass(), "slidePerfect", 1744223033);
        setIntField(term165815, term165815.getClass(), "slideGreat", 2114622612);
        setIntField(term165815, term165815.getClass(), "slideGood", -1414446934);
        setIntField(term165815, term165815.getClass(), "slideBad", -880968249);
        setIntField(term165815, term165815.getClass(), "breakPerfect", 101215826);
        setIntField(term165815, term165815.getClass(), "breakGreat", -454131374);
        setIntField(term165815, term165815.getClass(), "breakGood", 1987640358);
        setIntField(term165815, term165815.getClass(), "breakBad", 1430005704);
        setBooleanField(term165815, term165815.getClass(), "isTrackSkip", false);
        setBooleanField(term165815, term165815.getClass(), "isHighScore", true);
        setBooleanField(term165815, term165815.getClass(), "isChallengeTrack", true);
        setIntField(term165815, term165815.getClass(), "challengeLife", -1454431594);
        setIntField(term165815, term165815.getClass(), "challengeRemain", -1903713770);
        setIntField(term165815, term165815.getClass(), "isAllPerfectPlus", 242422995);
        term166127 = new Integer(1550991504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166127;
        callMethod(klass, "setBreakPerfect", argTypes, term165815, args);
    }

};


