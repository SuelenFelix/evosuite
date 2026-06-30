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

public class UserPlaylog_setSortNumber_205154074264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142867;
     Object term143179;

    public UserPlaylog_setSortNumber_205154074264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142873 = new Long(3453457027014743006L);
        term142867 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term142869 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term142871 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142892 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142902 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term142867, term142867.getClass(), "id", -8364623164355526163L);
        setLongField(term142869, term142869.getClass(), "id", -4293853358216323773L);
        setLongField(term142871, term142871.getClass(), "id", -474245812336702069L);
        setField(term142871, term142871.getClass(), "extId", term142873);
        setField(term142871, term142871.getClass(), "luid", "vZxqxBKdGD");
        setIntField(term142888, term142888.getClass(), "year", 2022);
        setShortField(term142888, term142888.getClass(), "month", (short) 9);
        setShortField(term142888, term142888.getClass(), "day", (short) 29);
        setField(term142887, term142887.getClass(), "date", term142888);
        setByteField(term142892, term142892.getClass(), "hour", (byte) 15);
        setByteField(term142892, term142892.getClass(), "minute", (byte) 41);
        setByteField(term142892, term142892.getClass(), "second", (byte) 55);
        setIntField(term142892, term142892.getClass(), "nano", 811723850);
        setField(term142887, term142887.getClass(), "time", term142892);
        setField(term142871, term142871.getClass(), "registerTime", term142887);
        setIntField(term142898, term142898.getClass(), "year", 2017);
        setShortField(term142898, term142898.getClass(), "month", (short) 3);
        setShortField(term142898, term142898.getClass(), "day", (short) 7);
        setField(term142897, term142897.getClass(), "date", term142898);
        setByteField(term142902, term142902.getClass(), "hour", (byte) 17);
        setByteField(term142902, term142902.getClass(), "minute", (byte) 3);
        setByteField(term142902, term142902.getClass(), "second", (byte) 1);
        setIntField(term142902, term142902.getClass(), "nano", 107604440);
        setField(term142897, term142897.getClass(), "time", term142902);
        setField(term142871, term142871.getClass(), "accessTime", term142897);
        setField(term142869, term142869.getClass(), "card", term142871);
        setIntField(term142869, term142869.getClass(), "lastDataVersion", -1612328990);
        setField(term142869, term142869.getClass(), "userName", "ScVMeCBvvv");
        setIntField(term142869, term142869.getClass(), "point", 824967439);
        setIntField(term142869, term142869.getClass(), "totalPoint", 1484193841);
        setIntField(term142869, term142869.getClass(), "iconId", 136266266);
        setIntField(term142869, term142869.getClass(), "nameplateId", 2020115381);
        setIntField(term142869, term142869.getClass(), "frameId", 814559519);
        setIntField(term142869, term142869.getClass(), "trophyId", 1859715105);
        setIntField(term142869, term142869.getClass(), "playCount", 1029473371);
        setIntField(term142869, term142869.getClass(), "playVsCount", -834678189);
        setIntField(term142869, term142869.getClass(), "playSyncCount", 689447382);
        setIntField(term142869, term142869.getClass(), "winCount", 1745666381);
        setIntField(term142869, term142869.getClass(), "helpCount", 304073833);
        setIntField(term142869, term142869.getClass(), "comboCount", -1851662861);
        setIntField(term142869, term142869.getClass(), "feverCount", 623750096);
        setIntField(term142869, term142869.getClass(), "totalHiScore", -1486229880);
        setIntField(term142869, term142869.getClass(), "totalEasyHighScore", -602437515);
        setIntField(term142869, term142869.getClass(), "totalBasicHighScore", -1602657519);
        setIntField(term142869, term142869.getClass(), "totalAdvancedHighScore", 200439058);
        setIntField(term142869, term142869.getClass(), "totalExpertHighScore", 1555707891);
        setIntField(term142869, term142869.getClass(), "totalMasterHighScore", 733971294);
        setIntField(term142869, term142869.getClass(), "totalReMasterHighScore", -1832751468);
        setIntField(term142869, term142869.getClass(), "totalHighSync", 295491167);
        setIntField(term142869, term142869.getClass(), "totalEasySync", -1830981692);
        setIntField(term142869, term142869.getClass(), "totalBasicSync", -154584033);
        setIntField(term142869, term142869.getClass(), "totalAdvancedSync", -1099312590);
        setIntField(term142869, term142869.getClass(), "totalExpertSync", -1960099382);
        setIntField(term142869, term142869.getClass(), "totalMasterSync", 487337800);
        setIntField(term142869, term142869.getClass(), "totalReMasterSync", 359514248);
        setIntField(term142869, term142869.getClass(), "playerRating", -739968237);
        setIntField(term142869, term142869.getClass(), "highestRating", 453115532);
        setIntField(term142869, term142869.getClass(), "rankAuthTailId", 1278298154);
        setField(term142869, term142869.getClass(), "eventWatchedDate", "xysssjuOdh");
        setField(term142869, term142869.getClass(), "webLimitDate", "LQWvIhnGeL");
        setIntField(term142869, term142869.getClass(), "challengeTrackPhase", 938868528);
        setIntField(term142869, term142869.getClass(), "firstPlayBits", 120458932);
        setField(term142869, term142869.getClass(), "lastPlayDate", "fSsmODkNFb");
        setIntField(term142869, term142869.getClass(), "lastPlaceId", 76041751);
        setField(term142869, term142869.getClass(), "lastPlaceName", "jXaYbKgogd");
        setIntField(term142869, term142869.getClass(), "lastRegionId", 1049789941);
        setField(term142869, term142869.getClass(), "lastRegionName", "MxPRraPVdF");
        setField(term142869, term142869.getClass(), "lastClientId", "dnWHLTYWVU");
        setField(term142869, term142869.getClass(), "lastCountryCode", "AOSOeWGCwi");
        setIntField(term142869, term142869.getClass(), "eventPoint", 1294058665);
        setIntField(term142869, term142869.getClass(), "totalLv", -1247120882);
        setIntField(term142869, term142869.getClass(), "lastLoginBonusDay", -1245032854);
        setIntField(term142869, term142869.getClass(), "lastSurvivalBonusDay", 1753580502);
        setIntField(term142869, term142869.getClass(), "loginBonusLv", 937744373);
        setField(term142867, term142867.getClass(), "user", term142869);
        setIntField(term142867, term142867.getClass(), "orderId", -2116018442);
        setLongField(term142867, term142867.getClass(), "sortNumber", -3005158994986938727L);
        setIntField(term142867, term142867.getClass(), "placeId", -257544793);
        setField(term142867, term142867.getClass(), "placeName", "pBmevrFCmp");
        setField(term142867, term142867.getClass(), "country", "DOCvwqbYDn");
        setIntField(term142867, term142867.getClass(), "regionId", -1653237082);
        setField(term142867, term142867.getClass(), "playDate", "mnqceiHjKv");
        setField(term142867, term142867.getClass(), "userPlayDate", "AsVDXoZoBU");
        setIntField(term142867, term142867.getClass(), "musicId", -562763207);
        setIntField(term142867, term142867.getClass(), "level", 1405119430);
        setIntField(term142867, term142867.getClass(), "gameMode", -161447198);
        setIntField(term142867, term142867.getClass(), "rivalNum", -1588843736);
        setIntField(term142867, term142867.getClass(), "track", 890916272);
        setIntField(term142867, term142867.getClass(), "eventId", -1193989827);
        setBooleanField(term142867, term142867.getClass(), "isFreeToPlay", true);
        setIntField(term142867, term142867.getClass(), "playerRating", 1239736379);
        setLongField(term142867, term142867.getClass(), "playedUserId1", -7175762262426771446L);
        setField(term142867, term142867.getClass(), "playedUserName1", "cPxpxZMgIo");
        setIntField(term142867, term142867.getClass(), "playedMusicLevel1", -476264306);
        setLongField(term142867, term142867.getClass(), "playedUserId2", 337617062500822936L);
        setField(term142867, term142867.getClass(), "playedUserName2", "uWtOISrfeA");
        setIntField(term142867, term142867.getClass(), "playedMusicLevel2", 1205905378);
        setLongField(term142867, term142867.getClass(), "playedUserId3", -6622023497681653956L);
        setField(term142867, term142867.getClass(), "playedUserName3", "tYlSzqLqvb");
        setIntField(term142867, term142867.getClass(), "playedMusicLevel3", 612842147);
        setIntField(term142867, term142867.getClass(), "achievement", -206245330);
        setIntField(term142867, term142867.getClass(), "score", -66386110);
        setIntField(term142867, term142867.getClass(), "tapScore", 1046745876);
        setIntField(term142867, term142867.getClass(), "holdScore", 1232342064);
        setIntField(term142867, term142867.getClass(), "slideScore", 802799657);
        setIntField(term142867, term142867.getClass(), "breakScore", 1517810658);
        setIntField(term142867, term142867.getClass(), "syncRate", 1741316866);
        setIntField(term142867, term142867.getClass(), "vsWin", -1808168018);
        setBooleanField(term142867, term142867.getClass(), "isAllPerfect", true);
        setIntField(term142867, term142867.getClass(), "fullCombo", 1733288542);
        setIntField(term142867, term142867.getClass(), "maxFever", 702641803);
        setIntField(term142867, term142867.getClass(), "maxCombo", 29327563);
        setIntField(term142867, term142867.getClass(), "tapPerfect", -59340963);
        setIntField(term142867, term142867.getClass(), "tapGreat", -1264533286);
        setIntField(term142867, term142867.getClass(), "tapGood", -222419367);
        setIntField(term142867, term142867.getClass(), "tapBad", 1330057772);
        setIntField(term142867, term142867.getClass(), "holdPerfect", 1412929302);
        setIntField(term142867, term142867.getClass(), "holdGreat", -1276629034);
        setIntField(term142867, term142867.getClass(), "holdGood", 759451950);
        setIntField(term142867, term142867.getClass(), "holdBad", -760946704);
        setIntField(term142867, term142867.getClass(), "slidePerfect", -957942862);
        setIntField(term142867, term142867.getClass(), "slideGreat", 1386675533);
        setIntField(term142867, term142867.getClass(), "slideGood", -978109517);
        setIntField(term142867, term142867.getClass(), "slideBad", -339693657);
        setIntField(term142867, term142867.getClass(), "breakPerfect", -916987732);
        setIntField(term142867, term142867.getClass(), "breakGreat", -524794930);
        setIntField(term142867, term142867.getClass(), "breakGood", -257827428);
        setIntField(term142867, term142867.getClass(), "breakBad", -2122218347);
        setBooleanField(term142867, term142867.getClass(), "isTrackSkip", false);
        setBooleanField(term142867, term142867.getClass(), "isHighScore", true);
        setBooleanField(term142867, term142867.getClass(), "isChallengeTrack", true);
        setIntField(term142867, term142867.getClass(), "challengeLife", -1427338236);
        setIntField(term142867, term142867.getClass(), "challengeRemain", 46700178);
        setIntField(term142867, term142867.getClass(), "isAllPerfectPlus", 1942396463);
        term143179 = new Long(-6753978337878946291L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term143179;
        callMethod(klass, "setSortNumber", argTypes, term142867, args);
    }

};


