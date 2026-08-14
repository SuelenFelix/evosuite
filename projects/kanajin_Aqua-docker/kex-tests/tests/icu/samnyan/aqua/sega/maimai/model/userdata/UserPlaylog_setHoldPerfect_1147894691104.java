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

public class UserPlaylog_setHoldPerfect_1147894691104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988333;
     Object term3988645;

    public UserPlaylog_setHoldPerfect_1147894691104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3988339 = new Long(8266816764113733584L);
        term3988333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3988335 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3988337 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3988353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3988354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3988358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3988363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3988364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3988368 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3988333, term3988333.getClass(), "id", -6935171944858372702L);
        setLongField(term3988335, term3988335.getClass(), "id", -8372330988811730221L);
        setLongField(term3988337, term3988337.getClass(), "id", -6571650051521587007L);
        setField(term3988337, term3988337.getClass(), "extId", term3988339);
        setField(term3988337, term3988337.getClass(), "luid", "mhneUUaLDV");
        setIntField(term3988354, term3988354.getClass(), "year", 2021);
        setShortField(term3988354, term3988354.getClass(), "month", (short) 10);
        setShortField(term3988354, term3988354.getClass(), "day", (short) 12);
        setField(term3988353, term3988353.getClass(), "date", term3988354);
        setByteField(term3988358, term3988358.getClass(), "hour", (byte) 22);
        setByteField(term3988358, term3988358.getClass(), "minute", (byte) 14);
        setByteField(term3988358, term3988358.getClass(), "second", (byte) 0);
        setIntField(term3988358, term3988358.getClass(), "nano", 312970850);
        setField(term3988353, term3988353.getClass(), "time", term3988358);
        setField(term3988337, term3988337.getClass(), "registerTime", term3988353);
        setIntField(term3988364, term3988364.getClass(), "year", 2017);
        setShortField(term3988364, term3988364.getClass(), "month", (short) 1);
        setShortField(term3988364, term3988364.getClass(), "day", (short) 17);
        setField(term3988363, term3988363.getClass(), "date", term3988364);
        setByteField(term3988368, term3988368.getClass(), "hour", (byte) 1);
        setByteField(term3988368, term3988368.getClass(), "minute", (byte) 42);
        setByteField(term3988368, term3988368.getClass(), "second", (byte) 59);
        setIntField(term3988368, term3988368.getClass(), "nano", 785819992);
        setField(term3988363, term3988363.getClass(), "time", term3988368);
        setField(term3988337, term3988337.getClass(), "accessTime", term3988363);
        setField(term3988335, term3988335.getClass(), "card", term3988337);
        setIntField(term3988335, term3988335.getClass(), "lastDataVersion", 1551744973);
        setField(term3988335, term3988335.getClass(), "userName", "ZjbFsRzbrp");
        setIntField(term3988335, term3988335.getClass(), "point", 1312554487);
        setIntField(term3988335, term3988335.getClass(), "totalPoint", -766899132);
        setIntField(term3988335, term3988335.getClass(), "iconId", -352151329);
        setIntField(term3988335, term3988335.getClass(), "nameplateId", -514499307);
        setIntField(term3988335, term3988335.getClass(), "frameId", 1861087807);
        setIntField(term3988335, term3988335.getClass(), "trophyId", -43492260);
        setIntField(term3988335, term3988335.getClass(), "playCount", -1163528676);
        setIntField(term3988335, term3988335.getClass(), "playVsCount", 1042721193);
        setIntField(term3988335, term3988335.getClass(), "playSyncCount", -761426739);
        setIntField(term3988335, term3988335.getClass(), "winCount", -465534999);
        setIntField(term3988335, term3988335.getClass(), "helpCount", -1984567990);
        setIntField(term3988335, term3988335.getClass(), "comboCount", 710343808);
        setIntField(term3988335, term3988335.getClass(), "feverCount", 2134560152);
        setIntField(term3988335, term3988335.getClass(), "totalHiScore", 827343830);
        setIntField(term3988335, term3988335.getClass(), "totalEasyHighScore", -363629551);
        setIntField(term3988335, term3988335.getClass(), "totalBasicHighScore", -602665755);
        setIntField(term3988335, term3988335.getClass(), "totalAdvancedHighScore", 2024427616);
        setIntField(term3988335, term3988335.getClass(), "totalExpertHighScore", 1946176645);
        setIntField(term3988335, term3988335.getClass(), "totalMasterHighScore", 799117661);
        setIntField(term3988335, term3988335.getClass(), "totalReMasterHighScore", 1073781389);
        setIntField(term3988335, term3988335.getClass(), "totalHighSync", -558181065);
        setIntField(term3988335, term3988335.getClass(), "totalEasySync", -863646205);
        setIntField(term3988335, term3988335.getClass(), "totalBasicSync", 1347367814);
        setIntField(term3988335, term3988335.getClass(), "totalAdvancedSync", -310705430);
        setIntField(term3988335, term3988335.getClass(), "totalExpertSync", -624145086);
        setIntField(term3988335, term3988335.getClass(), "totalMasterSync", -299166852);
        setIntField(term3988335, term3988335.getClass(), "totalReMasterSync", -2145698639);
        setIntField(term3988335, term3988335.getClass(), "playerRating", 1193760705);
        setIntField(term3988335, term3988335.getClass(), "highestRating", -1286312000);
        setIntField(term3988335, term3988335.getClass(), "rankAuthTailId", 1683261936);
        setField(term3988335, term3988335.getClass(), "eventWatchedDate", "oZjIKIUDSi");
        setField(term3988335, term3988335.getClass(), "webLimitDate", "WdDvCjkIDR");
        setIntField(term3988335, term3988335.getClass(), "challengeTrackPhase", 277332341);
        setIntField(term3988335, term3988335.getClass(), "firstPlayBits", -1880372486);
        setField(term3988335, term3988335.getClass(), "lastPlayDate", "TjbrQzgCFl");
        setIntField(term3988335, term3988335.getClass(), "lastPlaceId", -1012327604);
        setField(term3988335, term3988335.getClass(), "lastPlaceName", "txSNmsgXfA");
        setIntField(term3988335, term3988335.getClass(), "lastRegionId", -1983954394);
        setField(term3988335, term3988335.getClass(), "lastRegionName", "PxuBSlvfId");
        setField(term3988335, term3988335.getClass(), "lastClientId", "pslzLwWoRB");
        setField(term3988335, term3988335.getClass(), "lastCountryCode", "qJKaJYAvvd");
        setIntField(term3988335, term3988335.getClass(), "eventPoint", 1143510465);
        setIntField(term3988335, term3988335.getClass(), "totalLv", 271025078);
        setIntField(term3988335, term3988335.getClass(), "lastLoginBonusDay", 1580795742);
        setIntField(term3988335, term3988335.getClass(), "lastSurvivalBonusDay", -405725727);
        setIntField(term3988335, term3988335.getClass(), "loginBonusLv", -1336720388);
        setField(term3988333, term3988333.getClass(), "user", term3988335);
        setIntField(term3988333, term3988333.getClass(), "orderId", -757518169);
        setLongField(term3988333, term3988333.getClass(), "sortNumber", 4607172742735108699L);
        setIntField(term3988333, term3988333.getClass(), "placeId", -1159755241);
        setField(term3988333, term3988333.getClass(), "placeName", "eejYVICYVr");
        setField(term3988333, term3988333.getClass(), "country", "AfYkOtHStT");
        setIntField(term3988333, term3988333.getClass(), "regionId", 1017257041);
        setField(term3988333, term3988333.getClass(), "playDate", "QVqHnWPagc");
        setField(term3988333, term3988333.getClass(), "userPlayDate", "PTXYyUoCwj");
        setIntField(term3988333, term3988333.getClass(), "musicId", 1018483309);
        setIntField(term3988333, term3988333.getClass(), "level", -1209275493);
        setIntField(term3988333, term3988333.getClass(), "gameMode", -91720131);
        setIntField(term3988333, term3988333.getClass(), "rivalNum", 1693022668);
        setIntField(term3988333, term3988333.getClass(), "track", 431225564);
        setIntField(term3988333, term3988333.getClass(), "eventId", 490095192);
        setBooleanField(term3988333, term3988333.getClass(), "isFreeToPlay", true);
        setIntField(term3988333, term3988333.getClass(), "playerRating", 958748035);
        setLongField(term3988333, term3988333.getClass(), "playedUserId1", 5865911731290350434L);
        setField(term3988333, term3988333.getClass(), "playedUserName1", "eXtKrENwpJ");
        setIntField(term3988333, term3988333.getClass(), "playedMusicLevel1", 40933053);
        setLongField(term3988333, term3988333.getClass(), "playedUserId2", -8609869773874342786L);
        setField(term3988333, term3988333.getClass(), "playedUserName2", "uQAHOMtXbz");
        setIntField(term3988333, term3988333.getClass(), "playedMusicLevel2", 1540143225);
        setLongField(term3988333, term3988333.getClass(), "playedUserId3", -3149119150201648247L);
        setField(term3988333, term3988333.getClass(), "playedUserName3", "HHPQYAprCU");
        setIntField(term3988333, term3988333.getClass(), "playedMusicLevel3", -870287185);
        setIntField(term3988333, term3988333.getClass(), "achievement", 1598391054);
        setIntField(term3988333, term3988333.getClass(), "score", 1264114140);
        setIntField(term3988333, term3988333.getClass(), "tapScore", -1518579715);
        setIntField(term3988333, term3988333.getClass(), "holdScore", 463755211);
        setIntField(term3988333, term3988333.getClass(), "slideScore", 1773595188);
        setIntField(term3988333, term3988333.getClass(), "breakScore", -912195169);
        setIntField(term3988333, term3988333.getClass(), "syncRate", 690173455);
        setIntField(term3988333, term3988333.getClass(), "vsWin", -827711799);
        setBooleanField(term3988333, term3988333.getClass(), "isAllPerfect", false);
        setIntField(term3988333, term3988333.getClass(), "fullCombo", -1213371002);
        setIntField(term3988333, term3988333.getClass(), "maxFever", 2015992047);
        setIntField(term3988333, term3988333.getClass(), "maxCombo", -1296795672);
        setIntField(term3988333, term3988333.getClass(), "tapPerfect", 2062248077);
        setIntField(term3988333, term3988333.getClass(), "tapGreat", 1800092176);
        setIntField(term3988333, term3988333.getClass(), "tapGood", 306152223);
        setIntField(term3988333, term3988333.getClass(), "tapBad", -1671394759);
        setIntField(term3988333, term3988333.getClass(), "holdPerfect", -1648485677);
        setIntField(term3988333, term3988333.getClass(), "holdGreat", 1430555358);
        setIntField(term3988333, term3988333.getClass(), "holdGood", 1068421913);
        setIntField(term3988333, term3988333.getClass(), "holdBad", -68967861);
        setIntField(term3988333, term3988333.getClass(), "slidePerfect", -1346981244);
        setIntField(term3988333, term3988333.getClass(), "slideGreat", 1459462338);
        setIntField(term3988333, term3988333.getClass(), "slideGood", -1462804006);
        setIntField(term3988333, term3988333.getClass(), "slideBad", -973210264);
        setIntField(term3988333, term3988333.getClass(), "breakPerfect", -684555958);
        setIntField(term3988333, term3988333.getClass(), "breakGreat", -1221987756);
        setIntField(term3988333, term3988333.getClass(), "breakGood", -1088432097);
        setIntField(term3988333, term3988333.getClass(), "breakBad", -1927366023);
        setBooleanField(term3988333, term3988333.getClass(), "isTrackSkip", false);
        setBooleanField(term3988333, term3988333.getClass(), "isHighScore", false);
        setBooleanField(term3988333, term3988333.getClass(), "isChallengeTrack", false);
        setIntField(term3988333, term3988333.getClass(), "challengeLife", 1909436518);
        setIntField(term3988333, term3988333.getClass(), "challengeRemain", -270542790);
        setIntField(term3988333, term3988333.getClass(), "isAllPerfectPlus", -283435168);
        term3988645 = new Integer(900737520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3988645;
        callMethod(klass, "setHoldPerfect", argTypes, term3988333, args);
    }

};


