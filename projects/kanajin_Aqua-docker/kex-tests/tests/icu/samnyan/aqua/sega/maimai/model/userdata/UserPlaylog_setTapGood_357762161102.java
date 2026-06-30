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

public class UserPlaylog_setTapGood_357762161102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161019;
     Object term161331;

    public UserPlaylog_setTapGood_357762161102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161025 = new Long(5818741986224130131L);
        term161019 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term161021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term161023 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161054 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161019, term161019.getClass(), "id", 4538748174903798169L);
        setLongField(term161021, term161021.getClass(), "id", 8651853359004042709L);
        setLongField(term161023, term161023.getClass(), "id", -2356268402672275562L);
        setField(term161023, term161023.getClass(), "extId", term161025);
        setField(term161023, term161023.getClass(), "luid", "AAVsuSsxLS");
        setIntField(term161040, term161040.getClass(), "year", 2014);
        setShortField(term161040, term161040.getClass(), "month", (short) 7);
        setShortField(term161040, term161040.getClass(), "day", (short) 8);
        setField(term161039, term161039.getClass(), "date", term161040);
        setByteField(term161044, term161044.getClass(), "hour", (byte) 15);
        setByteField(term161044, term161044.getClass(), "minute", (byte) 58);
        setByteField(term161044, term161044.getClass(), "second", (byte) 59);
        setIntField(term161044, term161044.getClass(), "nano", 92869125);
        setField(term161039, term161039.getClass(), "time", term161044);
        setField(term161023, term161023.getClass(), "registerTime", term161039);
        setIntField(term161050, term161050.getClass(), "year", 2015);
        setShortField(term161050, term161050.getClass(), "month", (short) 3);
        setShortField(term161050, term161050.getClass(), "day", (short) 10);
        setField(term161049, term161049.getClass(), "date", term161050);
        setByteField(term161054, term161054.getClass(), "hour", (byte) 2);
        setByteField(term161054, term161054.getClass(), "minute", (byte) 20);
        setByteField(term161054, term161054.getClass(), "second", (byte) 3);
        setIntField(term161054, term161054.getClass(), "nano", 298112800);
        setField(term161049, term161049.getClass(), "time", term161054);
        setField(term161023, term161023.getClass(), "accessTime", term161049);
        setField(term161021, term161021.getClass(), "card", term161023);
        setIntField(term161021, term161021.getClass(), "lastDataVersion", -1697913355);
        setField(term161021, term161021.getClass(), "userName", "ElCmThplmP");
        setIntField(term161021, term161021.getClass(), "point", 974358051);
        setIntField(term161021, term161021.getClass(), "totalPoint", -866480515);
        setIntField(term161021, term161021.getClass(), "iconId", -250106245);
        setIntField(term161021, term161021.getClass(), "nameplateId", 1221416715);
        setIntField(term161021, term161021.getClass(), "frameId", -758703841);
        setIntField(term161021, term161021.getClass(), "trophyId", -1977073492);
        setIntField(term161021, term161021.getClass(), "playCount", -642870222);
        setIntField(term161021, term161021.getClass(), "playVsCount", -1866246010);
        setIntField(term161021, term161021.getClass(), "playSyncCount", -1362789222);
        setIntField(term161021, term161021.getClass(), "winCount", 2122599008);
        setIntField(term161021, term161021.getClass(), "helpCount", 1702941920);
        setIntField(term161021, term161021.getClass(), "comboCount", -748655105);
        setIntField(term161021, term161021.getClass(), "feverCount", -481792623);
        setIntField(term161021, term161021.getClass(), "totalHiScore", -1085919621);
        setIntField(term161021, term161021.getClass(), "totalEasyHighScore", -1422637686);
        setIntField(term161021, term161021.getClass(), "totalBasicHighScore", -1580362300);
        setIntField(term161021, term161021.getClass(), "totalAdvancedHighScore", 1761080017);
        setIntField(term161021, term161021.getClass(), "totalExpertHighScore", -270482460);
        setIntField(term161021, term161021.getClass(), "totalMasterHighScore", -597346065);
        setIntField(term161021, term161021.getClass(), "totalReMasterHighScore", -433489718);
        setIntField(term161021, term161021.getClass(), "totalHighSync", 1813446622);
        setIntField(term161021, term161021.getClass(), "totalEasySync", 1626106011);
        setIntField(term161021, term161021.getClass(), "totalBasicSync", 1272067855);
        setIntField(term161021, term161021.getClass(), "totalAdvancedSync", 1890985441);
        setIntField(term161021, term161021.getClass(), "totalExpertSync", 723313173);
        setIntField(term161021, term161021.getClass(), "totalMasterSync", -2068262386);
        setIntField(term161021, term161021.getClass(), "totalReMasterSync", -166909712);
        setIntField(term161021, term161021.getClass(), "playerRating", -1454715863);
        setIntField(term161021, term161021.getClass(), "highestRating", 748018708);
        setIntField(term161021, term161021.getClass(), "rankAuthTailId", -1548022102);
        setField(term161021, term161021.getClass(), "eventWatchedDate", "QmHpkkQsav");
        setField(term161021, term161021.getClass(), "webLimitDate", "hMSzYZiZXX");
        setIntField(term161021, term161021.getClass(), "challengeTrackPhase", -164823905);
        setIntField(term161021, term161021.getClass(), "firstPlayBits", -2080233276);
        setField(term161021, term161021.getClass(), "lastPlayDate", "XDCvxTTtyO");
        setIntField(term161021, term161021.getClass(), "lastPlaceId", 1575457625);
        setField(term161021, term161021.getClass(), "lastPlaceName", "kOpXEPJinJ");
        setIntField(term161021, term161021.getClass(), "lastRegionId", -1142846284);
        setField(term161021, term161021.getClass(), "lastRegionName", "rttNPStAfM");
        setField(term161021, term161021.getClass(), "lastClientId", "THLYTYdxwA");
        setField(term161021, term161021.getClass(), "lastCountryCode", "nMaKkGsKjH");
        setIntField(term161021, term161021.getClass(), "eventPoint", 1042744692);
        setIntField(term161021, term161021.getClass(), "totalLv", 41262028);
        setIntField(term161021, term161021.getClass(), "lastLoginBonusDay", 389821481);
        setIntField(term161021, term161021.getClass(), "lastSurvivalBonusDay", 1008810584);
        setIntField(term161021, term161021.getClass(), "loginBonusLv", 656907418);
        setField(term161019, term161019.getClass(), "user", term161021);
        setIntField(term161019, term161019.getClass(), "orderId", -1151330169);
        setLongField(term161019, term161019.getClass(), "sortNumber", 4920060206553726462L);
        setIntField(term161019, term161019.getClass(), "placeId", -945721422);
        setField(term161019, term161019.getClass(), "placeName", "bzgnEgNnJB");
        setField(term161019, term161019.getClass(), "country", "trgyZVXoXP");
        setIntField(term161019, term161019.getClass(), "regionId", -1490283774);
        setField(term161019, term161019.getClass(), "playDate", "zggGcOxpDe");
        setField(term161019, term161019.getClass(), "userPlayDate", "XdJngfMEyc");
        setIntField(term161019, term161019.getClass(), "musicId", -575289905);
        setIntField(term161019, term161019.getClass(), "level", -930913063);
        setIntField(term161019, term161019.getClass(), "gameMode", 1301723251);
        setIntField(term161019, term161019.getClass(), "rivalNum", 1987227116);
        setIntField(term161019, term161019.getClass(), "track", 937811047);
        setIntField(term161019, term161019.getClass(), "eventId", 2036161530);
        setBooleanField(term161019, term161019.getClass(), "isFreeToPlay", false);
        setIntField(term161019, term161019.getClass(), "playerRating", 2115526875);
        setLongField(term161019, term161019.getClass(), "playedUserId1", -5089949977716478457L);
        setField(term161019, term161019.getClass(), "playedUserName1", "fBrxpovrjQ");
        setIntField(term161019, term161019.getClass(), "playedMusicLevel1", 244818423);
        setLongField(term161019, term161019.getClass(), "playedUserId2", -3603009652560084801L);
        setField(term161019, term161019.getClass(), "playedUserName2", "vWNTKunytj");
        setIntField(term161019, term161019.getClass(), "playedMusicLevel2", 1436257429);
        setLongField(term161019, term161019.getClass(), "playedUserId3", -6386251470690822466L);
        setField(term161019, term161019.getClass(), "playedUserName3", "pbUCEQENML");
        setIntField(term161019, term161019.getClass(), "playedMusicLevel3", -1746786200);
        setIntField(term161019, term161019.getClass(), "achievement", -1125416912);
        setIntField(term161019, term161019.getClass(), "score", -2120953153);
        setIntField(term161019, term161019.getClass(), "tapScore", 874224877);
        setIntField(term161019, term161019.getClass(), "holdScore", 1984669981);
        setIntField(term161019, term161019.getClass(), "slideScore", -1765228110);
        setIntField(term161019, term161019.getClass(), "breakScore", -700450071);
        setIntField(term161019, term161019.getClass(), "syncRate", -1825420252);
        setIntField(term161019, term161019.getClass(), "vsWin", 1633515012);
        setBooleanField(term161019, term161019.getClass(), "isAllPerfect", false);
        setIntField(term161019, term161019.getClass(), "fullCombo", 927105536);
        setIntField(term161019, term161019.getClass(), "maxFever", -908261442);
        setIntField(term161019, term161019.getClass(), "maxCombo", -1556396262);
        setIntField(term161019, term161019.getClass(), "tapPerfect", 612382633);
        setIntField(term161019, term161019.getClass(), "tapGreat", 723836601);
        setIntField(term161019, term161019.getClass(), "tapGood", -2076042755);
        setIntField(term161019, term161019.getClass(), "tapBad", -1398506726);
        setIntField(term161019, term161019.getClass(), "holdPerfect", -1274132944);
        setIntField(term161019, term161019.getClass(), "holdGreat", -623600539);
        setIntField(term161019, term161019.getClass(), "holdGood", -1694875668);
        setIntField(term161019, term161019.getClass(), "holdBad", 2069186656);
        setIntField(term161019, term161019.getClass(), "slidePerfect", -1453931640);
        setIntField(term161019, term161019.getClass(), "slideGreat", 1629226646);
        setIntField(term161019, term161019.getClass(), "slideGood", 1896955056);
        setIntField(term161019, term161019.getClass(), "slideBad", -688400165);
        setIntField(term161019, term161019.getClass(), "breakPerfect", 1383834848);
        setIntField(term161019, term161019.getClass(), "breakGreat", 404958794);
        setIntField(term161019, term161019.getClass(), "breakGood", -2130448162);
        setIntField(term161019, term161019.getClass(), "breakBad", -1128620237);
        setBooleanField(term161019, term161019.getClass(), "isTrackSkip", false);
        setBooleanField(term161019, term161019.getClass(), "isHighScore", true);
        setBooleanField(term161019, term161019.getClass(), "isChallengeTrack", false);
        setIntField(term161019, term161019.getClass(), "challengeLife", -1314758823);
        setIntField(term161019, term161019.getClass(), "challengeRemain", 1245915795);
        setIntField(term161019, term161019.getClass(), "isAllPerfectPlus", 1106655313);
        term161331 = new Integer(-1275313652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term161331;
        callMethod(klass, "setTapGood", argTypes, term161019, args);
    }

};


