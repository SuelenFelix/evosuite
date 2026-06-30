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

public class UserPlaylog_getTrack_156631352014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118999;

    public UserPlaylog_getTrack_156631352014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119005 = new Long(-2691996476200751382L);
        term118999 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term119001 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term119003 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term119019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119024 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119034 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118999, term118999.getClass(), "id", -8385042448755891761L);
        setLongField(term119001, term119001.getClass(), "id", 3776640840397782177L);
        setLongField(term119003, term119003.getClass(), "id", -4458985981191164653L);
        setField(term119003, term119003.getClass(), "extId", term119005);
        setField(term119003, term119003.getClass(), "luid", "unTIyPhfcW");
        setIntField(term119020, term119020.getClass(), "year", 2010);
        setShortField(term119020, term119020.getClass(), "month", (short) 5);
        setShortField(term119020, term119020.getClass(), "day", (short) 27);
        setField(term119019, term119019.getClass(), "date", term119020);
        setByteField(term119024, term119024.getClass(), "hour", (byte) 20);
        setByteField(term119024, term119024.getClass(), "minute", (byte) 55);
        setByteField(term119024, term119024.getClass(), "second", (byte) 13);
        setIntField(term119024, term119024.getClass(), "nano", 375773979);
        setField(term119019, term119019.getClass(), "time", term119024);
        setField(term119003, term119003.getClass(), "registerTime", term119019);
        setIntField(term119030, term119030.getClass(), "year", 2023);
        setShortField(term119030, term119030.getClass(), "month", (short) 5);
        setShortField(term119030, term119030.getClass(), "day", (short) 21);
        setField(term119029, term119029.getClass(), "date", term119030);
        setByteField(term119034, term119034.getClass(), "hour", (byte) 7);
        setByteField(term119034, term119034.getClass(), "minute", (byte) 54);
        setByteField(term119034, term119034.getClass(), "second", (byte) 55);
        setIntField(term119034, term119034.getClass(), "nano", 241590130);
        setField(term119029, term119029.getClass(), "time", term119034);
        setField(term119003, term119003.getClass(), "accessTime", term119029);
        setField(term119001, term119001.getClass(), "card", term119003);
        setIntField(term119001, term119001.getClass(), "lastDataVersion", -801549011);
        setField(term119001, term119001.getClass(), "userName", "McPsgamHga");
        setIntField(term119001, term119001.getClass(), "point", 62132446);
        setIntField(term119001, term119001.getClass(), "totalPoint", 1637357009);
        setIntField(term119001, term119001.getClass(), "iconId", -1207052944);
        setIntField(term119001, term119001.getClass(), "nameplateId", -2019346254);
        setIntField(term119001, term119001.getClass(), "frameId", -37753692);
        setIntField(term119001, term119001.getClass(), "trophyId", -851423847);
        setIntField(term119001, term119001.getClass(), "playCount", -2078904541);
        setIntField(term119001, term119001.getClass(), "playVsCount", 1446569258);
        setIntField(term119001, term119001.getClass(), "playSyncCount", -537915293);
        setIntField(term119001, term119001.getClass(), "winCount", 709026110);
        setIntField(term119001, term119001.getClass(), "helpCount", 1292003190);
        setIntField(term119001, term119001.getClass(), "comboCount", -1604773694);
        setIntField(term119001, term119001.getClass(), "feverCount", -1181740520);
        setIntField(term119001, term119001.getClass(), "totalHiScore", 1630084052);
        setIntField(term119001, term119001.getClass(), "totalEasyHighScore", -1229483233);
        setIntField(term119001, term119001.getClass(), "totalBasicHighScore", -766646734);
        setIntField(term119001, term119001.getClass(), "totalAdvancedHighScore", -1692871251);
        setIntField(term119001, term119001.getClass(), "totalExpertHighScore", -3714758);
        setIntField(term119001, term119001.getClass(), "totalMasterHighScore", -858513186);
        setIntField(term119001, term119001.getClass(), "totalReMasterHighScore", 1203235853);
        setIntField(term119001, term119001.getClass(), "totalHighSync", 1274844099);
        setIntField(term119001, term119001.getClass(), "totalEasySync", 601872271);
        setIntField(term119001, term119001.getClass(), "totalBasicSync", -450820124);
        setIntField(term119001, term119001.getClass(), "totalAdvancedSync", 27602265);
        setIntField(term119001, term119001.getClass(), "totalExpertSync", 1499859121);
        setIntField(term119001, term119001.getClass(), "totalMasterSync", 1450681315);
        setIntField(term119001, term119001.getClass(), "totalReMasterSync", -1789757325);
        setIntField(term119001, term119001.getClass(), "playerRating", 1038376802);
        setIntField(term119001, term119001.getClass(), "highestRating", -200470581);
        setIntField(term119001, term119001.getClass(), "rankAuthTailId", 495681073);
        setField(term119001, term119001.getClass(), "eventWatchedDate", "wiqxbqDkJU");
        setField(term119001, term119001.getClass(), "webLimitDate", "psNunGzDVf");
        setIntField(term119001, term119001.getClass(), "challengeTrackPhase", 114045633);
        setIntField(term119001, term119001.getClass(), "firstPlayBits", 1507770571);
        setField(term119001, term119001.getClass(), "lastPlayDate", "YFOetAfnRt");
        setIntField(term119001, term119001.getClass(), "lastPlaceId", -593285402);
        setField(term119001, term119001.getClass(), "lastPlaceName", "VgCCefhtcT");
        setIntField(term119001, term119001.getClass(), "lastRegionId", 1095762061);
        setField(term119001, term119001.getClass(), "lastRegionName", "DEvoiMeeMr");
        setField(term119001, term119001.getClass(), "lastClientId", "CeaAfrYZQU");
        setField(term119001, term119001.getClass(), "lastCountryCode", "hLWnnngzRq");
        setIntField(term119001, term119001.getClass(), "eventPoint", 1310320674);
        setIntField(term119001, term119001.getClass(), "totalLv", -45101595);
        setIntField(term119001, term119001.getClass(), "lastLoginBonusDay", -1249978853);
        setIntField(term119001, term119001.getClass(), "lastSurvivalBonusDay", 773182873);
        setIntField(term119001, term119001.getClass(), "loginBonusLv", 1412041317);
        setField(term118999, term118999.getClass(), "user", term119001);
        setIntField(term118999, term118999.getClass(), "orderId", 651388483);
        setLongField(term118999, term118999.getClass(), "sortNumber", 3774876119567638995L);
        setIntField(term118999, term118999.getClass(), "placeId", 223631307);
        setField(term118999, term118999.getClass(), "placeName", "iLNHwyhEDE");
        setField(term118999, term118999.getClass(), "country", "duILkPooNH");
        setIntField(term118999, term118999.getClass(), "regionId", -812717507);
        setField(term118999, term118999.getClass(), "playDate", "bUJrQeiZOb");
        setField(term118999, term118999.getClass(), "userPlayDate", "mQqpexSybQ");
        setIntField(term118999, term118999.getClass(), "musicId", 1197190525);
        setIntField(term118999, term118999.getClass(), "level", 45627277);
        setIntField(term118999, term118999.getClass(), "gameMode", 909630692);
        setIntField(term118999, term118999.getClass(), "rivalNum", 80250518);
        setIntField(term118999, term118999.getClass(), "track", 1213620067);
        setIntField(term118999, term118999.getClass(), "eventId", 755859860);
        setBooleanField(term118999, term118999.getClass(), "isFreeToPlay", true);
        setIntField(term118999, term118999.getClass(), "playerRating", -569124511);
        setLongField(term118999, term118999.getClass(), "playedUserId1", -5849140391879955934L);
        setField(term118999, term118999.getClass(), "playedUserName1", "KxEBqnheIv");
        setIntField(term118999, term118999.getClass(), "playedMusicLevel1", -654736850);
        setLongField(term118999, term118999.getClass(), "playedUserId2", 5257982794400938524L);
        setField(term118999, term118999.getClass(), "playedUserName2", "ExgxdQmpcx");
        setIntField(term118999, term118999.getClass(), "playedMusicLevel2", 346888763);
        setLongField(term118999, term118999.getClass(), "playedUserId3", -5630319423499317967L);
        setField(term118999, term118999.getClass(), "playedUserName3", "SUwVfgXZzs");
        setIntField(term118999, term118999.getClass(), "playedMusicLevel3", 801146791);
        setIntField(term118999, term118999.getClass(), "achievement", -2039233257);
        setIntField(term118999, term118999.getClass(), "score", -209516690);
        setIntField(term118999, term118999.getClass(), "tapScore", 767276213);
        setIntField(term118999, term118999.getClass(), "holdScore", 1443840804);
        setIntField(term118999, term118999.getClass(), "slideScore", -1858397011);
        setIntField(term118999, term118999.getClass(), "breakScore", -730490288);
        setIntField(term118999, term118999.getClass(), "syncRate", 1732277430);
        setIntField(term118999, term118999.getClass(), "vsWin", -992269487);
        setBooleanField(term118999, term118999.getClass(), "isAllPerfect", false);
        setIntField(term118999, term118999.getClass(), "fullCombo", 182251243);
        setIntField(term118999, term118999.getClass(), "maxFever", 164845144);
        setIntField(term118999, term118999.getClass(), "maxCombo", -852907978);
        setIntField(term118999, term118999.getClass(), "tapPerfect", -1262475668);
        setIntField(term118999, term118999.getClass(), "tapGreat", -1725400520);
        setIntField(term118999, term118999.getClass(), "tapGood", 1608751044);
        setIntField(term118999, term118999.getClass(), "tapBad", 1965647979);
        setIntField(term118999, term118999.getClass(), "holdPerfect", -1937704960);
        setIntField(term118999, term118999.getClass(), "holdGreat", -1274831267);
        setIntField(term118999, term118999.getClass(), "holdGood", 1669039106);
        setIntField(term118999, term118999.getClass(), "holdBad", -2061505753);
        setIntField(term118999, term118999.getClass(), "slidePerfect", -509886343);
        setIntField(term118999, term118999.getClass(), "slideGreat", 1135879823);
        setIntField(term118999, term118999.getClass(), "slideGood", 1398941025);
        setIntField(term118999, term118999.getClass(), "slideBad", -1920006530);
        setIntField(term118999, term118999.getClass(), "breakPerfect", 1458463226);
        setIntField(term118999, term118999.getClass(), "breakGreat", -354078805);
        setIntField(term118999, term118999.getClass(), "breakGood", -1121055221);
        setIntField(term118999, term118999.getClass(), "breakBad", 1162857131);
        setBooleanField(term118999, term118999.getClass(), "isTrackSkip", false);
        setBooleanField(term118999, term118999.getClass(), "isHighScore", false);
        setBooleanField(term118999, term118999.getClass(), "isChallengeTrack", true);
        setIntField(term118999, term118999.getClass(), "challengeLife", 1199300206);
        setIntField(term118999, term118999.getClass(), "challengeRemain", 564539074);
        setIntField(term118999, term118999.getClass(), "isAllPerfectPlus", -1788496333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrack", argTypes, term118999, args);
    }

};


