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

public class UserPlaylog_setTapGreat_1101221629101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986911;
     Object term3987223;

    public UserPlaylog_setTapGreat_1101221629101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3986917 = new Long(-473264001124726243L);
        term3986911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3986913 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3986915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3986931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3986932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3986936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3986941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3986942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3986946 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3986911, term3986911.getClass(), "id", -2995126261603841314L);
        setLongField(term3986913, term3986913.getClass(), "id", -18078825383307630L);
        setLongField(term3986915, term3986915.getClass(), "id", -678843619977818306L);
        setField(term3986915, term3986915.getClass(), "extId", term3986917);
        setField(term3986915, term3986915.getClass(), "luid", "WcvndEqelk");
        setIntField(term3986932, term3986932.getClass(), "year", 2023);
        setShortField(term3986932, term3986932.getClass(), "month", (short) 6);
        setShortField(term3986932, term3986932.getClass(), "day", (short) 24);
        setField(term3986931, term3986931.getClass(), "date", term3986932);
        setByteField(term3986936, term3986936.getClass(), "hour", (byte) 12);
        setByteField(term3986936, term3986936.getClass(), "minute", (byte) 41);
        setByteField(term3986936, term3986936.getClass(), "second", (byte) 5);
        setIntField(term3986936, term3986936.getClass(), "nano", 114722951);
        setField(term3986931, term3986931.getClass(), "time", term3986936);
        setField(term3986915, term3986915.getClass(), "registerTime", term3986931);
        setIntField(term3986942, term3986942.getClass(), "year", 2015);
        setShortField(term3986942, term3986942.getClass(), "month", (short) 7);
        setShortField(term3986942, term3986942.getClass(), "day", (short) 9);
        setField(term3986941, term3986941.getClass(), "date", term3986942);
        setByteField(term3986946, term3986946.getClass(), "hour", (byte) 14);
        setByteField(term3986946, term3986946.getClass(), "minute", (byte) 23);
        setByteField(term3986946, term3986946.getClass(), "second", (byte) 33);
        setIntField(term3986946, term3986946.getClass(), "nano", 425342672);
        setField(term3986941, term3986941.getClass(), "time", term3986946);
        setField(term3986915, term3986915.getClass(), "accessTime", term3986941);
        setField(term3986913, term3986913.getClass(), "card", term3986915);
        setIntField(term3986913, term3986913.getClass(), "lastDataVersion", 1415138466);
        setField(term3986913, term3986913.getClass(), "userName", "KPeBDoGOif");
        setIntField(term3986913, term3986913.getClass(), "point", -1931165397);
        setIntField(term3986913, term3986913.getClass(), "totalPoint", 1567898307);
        setIntField(term3986913, term3986913.getClass(), "iconId", 2077930252);
        setIntField(term3986913, term3986913.getClass(), "nameplateId", -858980212);
        setIntField(term3986913, term3986913.getClass(), "frameId", -1901720948);
        setIntField(term3986913, term3986913.getClass(), "trophyId", 1275338377);
        setIntField(term3986913, term3986913.getClass(), "playCount", 1453952746);
        setIntField(term3986913, term3986913.getClass(), "playVsCount", -1237357588);
        setIntField(term3986913, term3986913.getClass(), "playSyncCount", -125092128);
        setIntField(term3986913, term3986913.getClass(), "winCount", -1219015013);
        setIntField(term3986913, term3986913.getClass(), "helpCount", 530014064);
        setIntField(term3986913, term3986913.getClass(), "comboCount", -849394115);
        setIntField(term3986913, term3986913.getClass(), "feverCount", -976146855);
        setIntField(term3986913, term3986913.getClass(), "totalHiScore", 901866249);
        setIntField(term3986913, term3986913.getClass(), "totalEasyHighScore", 2030105978);
        setIntField(term3986913, term3986913.getClass(), "totalBasicHighScore", 615653988);
        setIntField(term3986913, term3986913.getClass(), "totalAdvancedHighScore", 1373086839);
        setIntField(term3986913, term3986913.getClass(), "totalExpertHighScore", 1069551250);
        setIntField(term3986913, term3986913.getClass(), "totalMasterHighScore", 2089113680);
        setIntField(term3986913, term3986913.getClass(), "totalReMasterHighScore", -1606077436);
        setIntField(term3986913, term3986913.getClass(), "totalHighSync", -1793137455);
        setIntField(term3986913, term3986913.getClass(), "totalEasySync", -491694576);
        setIntField(term3986913, term3986913.getClass(), "totalBasicSync", 1063098886);
        setIntField(term3986913, term3986913.getClass(), "totalAdvancedSync", -1139501552);
        setIntField(term3986913, term3986913.getClass(), "totalExpertSync", -786845675);
        setIntField(term3986913, term3986913.getClass(), "totalMasterSync", -1317975243);
        setIntField(term3986913, term3986913.getClass(), "totalReMasterSync", 825429542);
        setIntField(term3986913, term3986913.getClass(), "playerRating", -108534111);
        setIntField(term3986913, term3986913.getClass(), "highestRating", -1582557876);
        setIntField(term3986913, term3986913.getClass(), "rankAuthTailId", 168574583);
        setField(term3986913, term3986913.getClass(), "eventWatchedDate", "iUdSJjHhAG");
        setField(term3986913, term3986913.getClass(), "webLimitDate", "pgWyNvrQdI");
        setIntField(term3986913, term3986913.getClass(), "challengeTrackPhase", -2033203573);
        setIntField(term3986913, term3986913.getClass(), "firstPlayBits", -1224979447);
        setField(term3986913, term3986913.getClass(), "lastPlayDate", "lUMHOdGypZ");
        setIntField(term3986913, term3986913.getClass(), "lastPlaceId", -907046046);
        setField(term3986913, term3986913.getClass(), "lastPlaceName", "dEzfNRGlYD");
        setIntField(term3986913, term3986913.getClass(), "lastRegionId", -653419447);
        setField(term3986913, term3986913.getClass(), "lastRegionName", "KhiaMAhzNt");
        setField(term3986913, term3986913.getClass(), "lastClientId", "JbTNtMvvSN");
        setField(term3986913, term3986913.getClass(), "lastCountryCode", "PXQPOoOtPy");
        setIntField(term3986913, term3986913.getClass(), "eventPoint", 1096776335);
        setIntField(term3986913, term3986913.getClass(), "totalLv", -482265305);
        setIntField(term3986913, term3986913.getClass(), "lastLoginBonusDay", -1269215515);
        setIntField(term3986913, term3986913.getClass(), "lastSurvivalBonusDay", 113437067);
        setIntField(term3986913, term3986913.getClass(), "loginBonusLv", 901069928);
        setField(term3986911, term3986911.getClass(), "user", term3986913);
        setIntField(term3986911, term3986911.getClass(), "orderId", -1485932804);
        setLongField(term3986911, term3986911.getClass(), "sortNumber", -1309821550153208381L);
        setIntField(term3986911, term3986911.getClass(), "placeId", 2095538189);
        setField(term3986911, term3986911.getClass(), "placeName", "uIPETQgDjC");
        setField(term3986911, term3986911.getClass(), "country", "CIiucvtupT");
        setIntField(term3986911, term3986911.getClass(), "regionId", -464678078);
        setField(term3986911, term3986911.getClass(), "playDate", "rWZYPscdGc");
        setField(term3986911, term3986911.getClass(), "userPlayDate", "JTMIHLuhxu");
        setIntField(term3986911, term3986911.getClass(), "musicId", 258777295);
        setIntField(term3986911, term3986911.getClass(), "level", 1221554558);
        setIntField(term3986911, term3986911.getClass(), "gameMode", -1295614724);
        setIntField(term3986911, term3986911.getClass(), "rivalNum", 1691714955);
        setIntField(term3986911, term3986911.getClass(), "track", -536658718);
        setIntField(term3986911, term3986911.getClass(), "eventId", -1006070356);
        setBooleanField(term3986911, term3986911.getClass(), "isFreeToPlay", true);
        setIntField(term3986911, term3986911.getClass(), "playerRating", -1909357499);
        setLongField(term3986911, term3986911.getClass(), "playedUserId1", -8712510541824046478L);
        setField(term3986911, term3986911.getClass(), "playedUserName1", "IhsXGWIXPl");
        setIntField(term3986911, term3986911.getClass(), "playedMusicLevel1", 232373708);
        setLongField(term3986911, term3986911.getClass(), "playedUserId2", 8249316411988206788L);
        setField(term3986911, term3986911.getClass(), "playedUserName2", "kKCZuDNzzg");
        setIntField(term3986911, term3986911.getClass(), "playedMusicLevel2", -1267622326);
        setLongField(term3986911, term3986911.getClass(), "playedUserId3", 2713604258120008400L);
        setField(term3986911, term3986911.getClass(), "playedUserName3", "NBnnkjWVep");
        setIntField(term3986911, term3986911.getClass(), "playedMusicLevel3", -413574430);
        setIntField(term3986911, term3986911.getClass(), "achievement", -1553945678);
        setIntField(term3986911, term3986911.getClass(), "score", 532368429);
        setIntField(term3986911, term3986911.getClass(), "tapScore", -1432804960);
        setIntField(term3986911, term3986911.getClass(), "holdScore", 2100191597);
        setIntField(term3986911, term3986911.getClass(), "slideScore", -1401530559);
        setIntField(term3986911, term3986911.getClass(), "breakScore", 141719622);
        setIntField(term3986911, term3986911.getClass(), "syncRate", 1968065292);
        setIntField(term3986911, term3986911.getClass(), "vsWin", -1084454814);
        setBooleanField(term3986911, term3986911.getClass(), "isAllPerfect", false);
        setIntField(term3986911, term3986911.getClass(), "fullCombo", -1498162064);
        setIntField(term3986911, term3986911.getClass(), "maxFever", 891616537);
        setIntField(term3986911, term3986911.getClass(), "maxCombo", 1880982831);
        setIntField(term3986911, term3986911.getClass(), "tapPerfect", 932646059);
        setIntField(term3986911, term3986911.getClass(), "tapGreat", -2095008326);
        setIntField(term3986911, term3986911.getClass(), "tapGood", 2001702978);
        setIntField(term3986911, term3986911.getClass(), "tapBad", -1117623742);
        setIntField(term3986911, term3986911.getClass(), "holdPerfect", 541066594);
        setIntField(term3986911, term3986911.getClass(), "holdGreat", 611510880);
        setIntField(term3986911, term3986911.getClass(), "holdGood", -1901844371);
        setIntField(term3986911, term3986911.getClass(), "holdBad", 942144383);
        setIntField(term3986911, term3986911.getClass(), "slidePerfect", -1697394335);
        setIntField(term3986911, term3986911.getClass(), "slideGreat", 1806675564);
        setIntField(term3986911, term3986911.getClass(), "slideGood", -723405049);
        setIntField(term3986911, term3986911.getClass(), "slideBad", -1177916737);
        setIntField(term3986911, term3986911.getClass(), "breakPerfect", -869971431);
        setIntField(term3986911, term3986911.getClass(), "breakGreat", 115834610);
        setIntField(term3986911, term3986911.getClass(), "breakGood", 1275152695);
        setIntField(term3986911, term3986911.getClass(), "breakBad", -1481024924);
        setBooleanField(term3986911, term3986911.getClass(), "isTrackSkip", true);
        setBooleanField(term3986911, term3986911.getClass(), "isHighScore", false);
        setBooleanField(term3986911, term3986911.getClass(), "isChallengeTrack", false);
        setIntField(term3986911, term3986911.getClass(), "challengeLife", 1537855395);
        setIntField(term3986911, term3986911.getClass(), "challengeRemain", 1910587033);
        setIntField(term3986911, term3986911.getClass(), "isAllPerfectPlus", 1683997711);
        term3987223 = new Integer(1782822776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3987223;
        callMethod(klass, "setTapGreat", argTypes, term3986911, args);
    }

};


