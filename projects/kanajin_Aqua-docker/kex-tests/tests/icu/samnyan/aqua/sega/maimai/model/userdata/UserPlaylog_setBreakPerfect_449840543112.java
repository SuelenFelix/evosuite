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

public class UserPlaylog_setBreakPerfect_449840543112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165759;
     Object term166071;

    public UserPlaylog_setBreakPerfect_449840543112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165765 = new Long(-6237686742902369498L);
        term165759 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term165761 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term165763 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165794 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165759, term165759.getClass(), "id", 3301022507846192876L);
        setLongField(term165761, term165761.getClass(), "id", -436006713622235897L);
        setLongField(term165763, term165763.getClass(), "id", -5888397861122761293L);
        setField(term165763, term165763.getClass(), "extId", term165765);
        setField(term165763, term165763.getClass(), "luid", "lkySuzJAZx");
        setIntField(term165780, term165780.getClass(), "year", 2014);
        setShortField(term165780, term165780.getClass(), "month", (short) 1);
        setShortField(term165780, term165780.getClass(), "day", (short) 7);
        setField(term165779, term165779.getClass(), "date", term165780);
        setByteField(term165784, term165784.getClass(), "hour", (byte) 16);
        setByteField(term165784, term165784.getClass(), "minute", (byte) 12);
        setByteField(term165784, term165784.getClass(), "second", (byte) 5);
        setIntField(term165784, term165784.getClass(), "nano", 977610129);
        setField(term165779, term165779.getClass(), "time", term165784);
        setField(term165763, term165763.getClass(), "registerTime", term165779);
        setIntField(term165790, term165790.getClass(), "year", 2010);
        setShortField(term165790, term165790.getClass(), "month", (short) 7);
        setShortField(term165790, term165790.getClass(), "day", (short) 7);
        setField(term165789, term165789.getClass(), "date", term165790);
        setByteField(term165794, term165794.getClass(), "hour", (byte) 6);
        setByteField(term165794, term165794.getClass(), "minute", (byte) 57);
        setByteField(term165794, term165794.getClass(), "second", (byte) 11);
        setIntField(term165794, term165794.getClass(), "nano", 667015440);
        setField(term165789, term165789.getClass(), "time", term165794);
        setField(term165763, term165763.getClass(), "accessTime", term165789);
        setField(term165761, term165761.getClass(), "card", term165763);
        setIntField(term165761, term165761.getClass(), "lastDataVersion", 476339625);
        setField(term165761, term165761.getClass(), "userName", "SzCYINBfMP");
        setIntField(term165761, term165761.getClass(), "point", -1718005832);
        setIntField(term165761, term165761.getClass(), "totalPoint", -1734715475);
        setIntField(term165761, term165761.getClass(), "iconId", -318943110);
        setIntField(term165761, term165761.getClass(), "nameplateId", -1051838393);
        setIntField(term165761, term165761.getClass(), "frameId", 2096731713);
        setIntField(term165761, term165761.getClass(), "trophyId", -110227629);
        setIntField(term165761, term165761.getClass(), "playCount", 1070859706);
        setIntField(term165761, term165761.getClass(), "playVsCount", 315364230);
        setIntField(term165761, term165761.getClass(), "playSyncCount", -1304585103);
        setIntField(term165761, term165761.getClass(), "winCount", -27360426);
        setIntField(term165761, term165761.getClass(), "helpCount", 766689350);
        setIntField(term165761, term165761.getClass(), "comboCount", -1662533282);
        setIntField(term165761, term165761.getClass(), "feverCount", -447585151);
        setIntField(term165761, term165761.getClass(), "totalHiScore", -1030615976);
        setIntField(term165761, term165761.getClass(), "totalEasyHighScore", 506140659);
        setIntField(term165761, term165761.getClass(), "totalBasicHighScore", 493454819);
        setIntField(term165761, term165761.getClass(), "totalAdvancedHighScore", 492765636);
        setIntField(term165761, term165761.getClass(), "totalExpertHighScore", 737730732);
        setIntField(term165761, term165761.getClass(), "totalMasterHighScore", 119713499);
        setIntField(term165761, term165761.getClass(), "totalReMasterHighScore", 1401312698);
        setIntField(term165761, term165761.getClass(), "totalHighSync", -520001527);
        setIntField(term165761, term165761.getClass(), "totalEasySync", -474662427);
        setIntField(term165761, term165761.getClass(), "totalBasicSync", -1084348067);
        setIntField(term165761, term165761.getClass(), "totalAdvancedSync", 462358472);
        setIntField(term165761, term165761.getClass(), "totalExpertSync", 1350454595);
        setIntField(term165761, term165761.getClass(), "totalMasterSync", -1134051415);
        setIntField(term165761, term165761.getClass(), "totalReMasterSync", -2005589401);
        setIntField(term165761, term165761.getClass(), "playerRating", 2146725419);
        setIntField(term165761, term165761.getClass(), "highestRating", -1411710613);
        setIntField(term165761, term165761.getClass(), "rankAuthTailId", -1051243574);
        setField(term165761, term165761.getClass(), "eventWatchedDate", "SZxGdkheQC");
        setField(term165761, term165761.getClass(), "webLimitDate", "ezHsVprTGp");
        setIntField(term165761, term165761.getClass(), "challengeTrackPhase", 1465556982);
        setIntField(term165761, term165761.getClass(), "firstPlayBits", 364874349);
        setField(term165761, term165761.getClass(), "lastPlayDate", "LYGBvfTqST");
        setIntField(term165761, term165761.getClass(), "lastPlaceId", -387817307);
        setField(term165761, term165761.getClass(), "lastPlaceName", "SUHmXgYhGj");
        setIntField(term165761, term165761.getClass(), "lastRegionId", -112698474);
        setField(term165761, term165761.getClass(), "lastRegionName", "cYhJgiPexe");
        setField(term165761, term165761.getClass(), "lastClientId", "zIofafmnvq");
        setField(term165761, term165761.getClass(), "lastCountryCode", "TUlaPxQqxL");
        setIntField(term165761, term165761.getClass(), "eventPoint", -1420178466);
        setIntField(term165761, term165761.getClass(), "totalLv", -522432266);
        setIntField(term165761, term165761.getClass(), "lastLoginBonusDay", -645643359);
        setIntField(term165761, term165761.getClass(), "lastSurvivalBonusDay", -800472466);
        setIntField(term165761, term165761.getClass(), "loginBonusLv", 2065626310);
        setField(term165759, term165759.getClass(), "user", term165761);
        setIntField(term165759, term165759.getClass(), "orderId", -1081561149);
        setLongField(term165759, term165759.getClass(), "sortNumber", -2860770035477349220L);
        setIntField(term165759, term165759.getClass(), "placeId", -267316668);
        setField(term165759, term165759.getClass(), "placeName", "wJwrAJjLHN");
        setField(term165759, term165759.getClass(), "country", "gSRycxEfPs");
        setIntField(term165759, term165759.getClass(), "regionId", -1845399147);
        setField(term165759, term165759.getClass(), "playDate", "GbkbXMhBtB");
        setField(term165759, term165759.getClass(), "userPlayDate", "STgtLenzXP");
        setIntField(term165759, term165759.getClass(), "musicId", 1382095734);
        setIntField(term165759, term165759.getClass(), "level", -1826567083);
        setIntField(term165759, term165759.getClass(), "gameMode", -758555514);
        setIntField(term165759, term165759.getClass(), "rivalNum", -346199735);
        setIntField(term165759, term165759.getClass(), "track", 423661653);
        setIntField(term165759, term165759.getClass(), "eventId", -761484053);
        setBooleanField(term165759, term165759.getClass(), "isFreeToPlay", false);
        setIntField(term165759, term165759.getClass(), "playerRating", -1252811363);
        setLongField(term165759, term165759.getClass(), "playedUserId1", 1263388002539564753L);
        setField(term165759, term165759.getClass(), "playedUserName1", "pnHopfEgPj");
        setIntField(term165759, term165759.getClass(), "playedMusicLevel1", -331733225);
        setLongField(term165759, term165759.getClass(), "playedUserId2", 226144339570799839L);
        setField(term165759, term165759.getClass(), "playedUserName2", "iJGTSezGOP");
        setIntField(term165759, term165759.getClass(), "playedMusicLevel2", -592222932);
        setLongField(term165759, term165759.getClass(), "playedUserId3", 2847433178831759443L);
        setField(term165759, term165759.getClass(), "playedUserName3", "cYJhSeWnSi");
        setIntField(term165759, term165759.getClass(), "playedMusicLevel3", 664977650);
        setIntField(term165759, term165759.getClass(), "achievement", 1126731099);
        setIntField(term165759, term165759.getClass(), "score", -388946581);
        setIntField(term165759, term165759.getClass(), "tapScore", 94418736);
        setIntField(term165759, term165759.getClass(), "holdScore", 492174524);
        setIntField(term165759, term165759.getClass(), "slideScore", -601316396);
        setIntField(term165759, term165759.getClass(), "breakScore", 752304230);
        setIntField(term165759, term165759.getClass(), "syncRate", -1227352770);
        setIntField(term165759, term165759.getClass(), "vsWin", -1489142672);
        setBooleanField(term165759, term165759.getClass(), "isAllPerfect", false);
        setIntField(term165759, term165759.getClass(), "fullCombo", -225201341);
        setIntField(term165759, term165759.getClass(), "maxFever", 140252148);
        setIntField(term165759, term165759.getClass(), "maxCombo", 153257576);
        setIntField(term165759, term165759.getClass(), "tapPerfect", 2047795777);
        setIntField(term165759, term165759.getClass(), "tapGreat", -1715094483);
        setIntField(term165759, term165759.getClass(), "tapGood", 100181788);
        setIntField(term165759, term165759.getClass(), "tapBad", -729877329);
        setIntField(term165759, term165759.getClass(), "holdPerfect", 1728308194);
        setIntField(term165759, term165759.getClass(), "holdGreat", 1168793542);
        setIntField(term165759, term165759.getClass(), "holdGood", 1408039066);
        setIntField(term165759, term165759.getClass(), "holdBad", -294387694);
        setIntField(term165759, term165759.getClass(), "slidePerfect", 1744223033);
        setIntField(term165759, term165759.getClass(), "slideGreat", 2114622612);
        setIntField(term165759, term165759.getClass(), "slideGood", -1414446934);
        setIntField(term165759, term165759.getClass(), "slideBad", -880968249);
        setIntField(term165759, term165759.getClass(), "breakPerfect", 101215826);
        setIntField(term165759, term165759.getClass(), "breakGreat", -454131374);
        setIntField(term165759, term165759.getClass(), "breakGood", 1987640358);
        setIntField(term165759, term165759.getClass(), "breakBad", 1430005704);
        setBooleanField(term165759, term165759.getClass(), "isTrackSkip", false);
        setBooleanField(term165759, term165759.getClass(), "isHighScore", true);
        setBooleanField(term165759, term165759.getClass(), "isChallengeTrack", true);
        setIntField(term165759, term165759.getClass(), "challengeLife", -1454431594);
        setIntField(term165759, term165759.getClass(), "challengeRemain", -1903713770);
        setIntField(term165759, term165759.getClass(), "isAllPerfectPlus", 242422995);
        term166071 = new Integer(1550991504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166071;
        callMethod(klass, "setBreakPerfect", argTypes, term165759, args);
    }

};


