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

public class UserPlaylog_setTapGood_357762161103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161075;
     Object term161387;

    public UserPlaylog_setTapGood_357762161103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161081 = new Long(5818741986224130131L);
        term161075 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term161077 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term161079 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161110 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161075, term161075.getClass(), "id", 4538748174903798169L);
        setLongField(term161077, term161077.getClass(), "id", 8651853359004042709L);
        setLongField(term161079, term161079.getClass(), "id", -2356268402672275562L);
        setField(term161079, term161079.getClass(), "extId", term161081);
        setField(term161079, term161079.getClass(), "luid", "AAVsuSsxLS");
        setIntField(term161096, term161096.getClass(), "year", 2014);
        setShortField(term161096, term161096.getClass(), "month", (short) 7);
        setShortField(term161096, term161096.getClass(), "day", (short) 8);
        setField(term161095, term161095.getClass(), "date", term161096);
        setByteField(term161100, term161100.getClass(), "hour", (byte) 15);
        setByteField(term161100, term161100.getClass(), "minute", (byte) 58);
        setByteField(term161100, term161100.getClass(), "second", (byte) 59);
        setIntField(term161100, term161100.getClass(), "nano", 92869125);
        setField(term161095, term161095.getClass(), "time", term161100);
        setField(term161079, term161079.getClass(), "registerTime", term161095);
        setIntField(term161106, term161106.getClass(), "year", 2015);
        setShortField(term161106, term161106.getClass(), "month", (short) 3);
        setShortField(term161106, term161106.getClass(), "day", (short) 10);
        setField(term161105, term161105.getClass(), "date", term161106);
        setByteField(term161110, term161110.getClass(), "hour", (byte) 2);
        setByteField(term161110, term161110.getClass(), "minute", (byte) 20);
        setByteField(term161110, term161110.getClass(), "second", (byte) 3);
        setIntField(term161110, term161110.getClass(), "nano", 298112800);
        setField(term161105, term161105.getClass(), "time", term161110);
        setField(term161079, term161079.getClass(), "accessTime", term161105);
        setField(term161077, term161077.getClass(), "card", term161079);
        setIntField(term161077, term161077.getClass(), "lastDataVersion", -1697913355);
        setField(term161077, term161077.getClass(), "userName", "ElCmThplmP");
        setIntField(term161077, term161077.getClass(), "point", 974358051);
        setIntField(term161077, term161077.getClass(), "totalPoint", -866480515);
        setIntField(term161077, term161077.getClass(), "iconId", -250106245);
        setIntField(term161077, term161077.getClass(), "nameplateId", 1221416715);
        setIntField(term161077, term161077.getClass(), "frameId", -758703841);
        setIntField(term161077, term161077.getClass(), "trophyId", -1977073492);
        setIntField(term161077, term161077.getClass(), "playCount", -642870222);
        setIntField(term161077, term161077.getClass(), "playVsCount", -1866246010);
        setIntField(term161077, term161077.getClass(), "playSyncCount", -1362789222);
        setIntField(term161077, term161077.getClass(), "winCount", 2122599008);
        setIntField(term161077, term161077.getClass(), "helpCount", 1702941920);
        setIntField(term161077, term161077.getClass(), "comboCount", -748655105);
        setIntField(term161077, term161077.getClass(), "feverCount", -481792623);
        setIntField(term161077, term161077.getClass(), "totalHiScore", -1085919621);
        setIntField(term161077, term161077.getClass(), "totalEasyHighScore", -1422637686);
        setIntField(term161077, term161077.getClass(), "totalBasicHighScore", -1580362300);
        setIntField(term161077, term161077.getClass(), "totalAdvancedHighScore", 1761080017);
        setIntField(term161077, term161077.getClass(), "totalExpertHighScore", -270482460);
        setIntField(term161077, term161077.getClass(), "totalMasterHighScore", -597346065);
        setIntField(term161077, term161077.getClass(), "totalReMasterHighScore", -433489718);
        setIntField(term161077, term161077.getClass(), "totalHighSync", 1813446622);
        setIntField(term161077, term161077.getClass(), "totalEasySync", 1626106011);
        setIntField(term161077, term161077.getClass(), "totalBasicSync", 1272067855);
        setIntField(term161077, term161077.getClass(), "totalAdvancedSync", 1890985441);
        setIntField(term161077, term161077.getClass(), "totalExpertSync", 723313173);
        setIntField(term161077, term161077.getClass(), "totalMasterSync", -2068262386);
        setIntField(term161077, term161077.getClass(), "totalReMasterSync", -166909712);
        setIntField(term161077, term161077.getClass(), "playerRating", -1454715863);
        setIntField(term161077, term161077.getClass(), "highestRating", 748018708);
        setIntField(term161077, term161077.getClass(), "rankAuthTailId", -1548022102);
        setField(term161077, term161077.getClass(), "eventWatchedDate", "QmHpkkQsav");
        setField(term161077, term161077.getClass(), "webLimitDate", "hMSzYZiZXX");
        setIntField(term161077, term161077.getClass(), "challengeTrackPhase", -164823905);
        setIntField(term161077, term161077.getClass(), "firstPlayBits", -2080233276);
        setField(term161077, term161077.getClass(), "lastPlayDate", "XDCvxTTtyO");
        setIntField(term161077, term161077.getClass(), "lastPlaceId", 1575457625);
        setField(term161077, term161077.getClass(), "lastPlaceName", "kOpXEPJinJ");
        setIntField(term161077, term161077.getClass(), "lastRegionId", -1142846284);
        setField(term161077, term161077.getClass(), "lastRegionName", "rttNPStAfM");
        setField(term161077, term161077.getClass(), "lastClientId", "THLYTYdxwA");
        setField(term161077, term161077.getClass(), "lastCountryCode", "nMaKkGsKjH");
        setIntField(term161077, term161077.getClass(), "eventPoint", 1042744692);
        setIntField(term161077, term161077.getClass(), "totalLv", 41262028);
        setIntField(term161077, term161077.getClass(), "lastLoginBonusDay", 389821481);
        setIntField(term161077, term161077.getClass(), "lastSurvivalBonusDay", 1008810584);
        setIntField(term161077, term161077.getClass(), "loginBonusLv", 656907418);
        setField(term161075, term161075.getClass(), "user", term161077);
        setIntField(term161075, term161075.getClass(), "orderId", -1151330169);
        setLongField(term161075, term161075.getClass(), "sortNumber", 4920060206553726462L);
        setIntField(term161075, term161075.getClass(), "placeId", -945721422);
        setField(term161075, term161075.getClass(), "placeName", "bzgnEgNnJB");
        setField(term161075, term161075.getClass(), "country", "trgyZVXoXP");
        setIntField(term161075, term161075.getClass(), "regionId", -1490283774);
        setField(term161075, term161075.getClass(), "playDate", "zggGcOxpDe");
        setField(term161075, term161075.getClass(), "userPlayDate", "XdJngfMEyc");
        setIntField(term161075, term161075.getClass(), "musicId", -575289905);
        setIntField(term161075, term161075.getClass(), "level", -930913063);
        setIntField(term161075, term161075.getClass(), "gameMode", 1301723251);
        setIntField(term161075, term161075.getClass(), "rivalNum", 1987227116);
        setIntField(term161075, term161075.getClass(), "track", 937811047);
        setIntField(term161075, term161075.getClass(), "eventId", 2036161530);
        setBooleanField(term161075, term161075.getClass(), "isFreeToPlay", false);
        setIntField(term161075, term161075.getClass(), "playerRating", 2115526875);
        setLongField(term161075, term161075.getClass(), "playedUserId1", -5089949977716478457L);
        setField(term161075, term161075.getClass(), "playedUserName1", "fBrxpovrjQ");
        setIntField(term161075, term161075.getClass(), "playedMusicLevel1", 244818423);
        setLongField(term161075, term161075.getClass(), "playedUserId2", -3603009652560084801L);
        setField(term161075, term161075.getClass(), "playedUserName2", "vWNTKunytj");
        setIntField(term161075, term161075.getClass(), "playedMusicLevel2", 1436257429);
        setLongField(term161075, term161075.getClass(), "playedUserId3", -6386251470690822466L);
        setField(term161075, term161075.getClass(), "playedUserName3", "pbUCEQENML");
        setIntField(term161075, term161075.getClass(), "playedMusicLevel3", -1746786200);
        setIntField(term161075, term161075.getClass(), "achievement", -1125416912);
        setIntField(term161075, term161075.getClass(), "score", -2120953153);
        setIntField(term161075, term161075.getClass(), "tapScore", 874224877);
        setIntField(term161075, term161075.getClass(), "holdScore", 1984669981);
        setIntField(term161075, term161075.getClass(), "slideScore", -1765228110);
        setIntField(term161075, term161075.getClass(), "breakScore", -700450071);
        setIntField(term161075, term161075.getClass(), "syncRate", -1825420252);
        setIntField(term161075, term161075.getClass(), "vsWin", 1633515012);
        setBooleanField(term161075, term161075.getClass(), "isAllPerfect", false);
        setIntField(term161075, term161075.getClass(), "fullCombo", 927105536);
        setIntField(term161075, term161075.getClass(), "maxFever", -908261442);
        setIntField(term161075, term161075.getClass(), "maxCombo", -1556396262);
        setIntField(term161075, term161075.getClass(), "tapPerfect", 612382633);
        setIntField(term161075, term161075.getClass(), "tapGreat", 723836601);
        setIntField(term161075, term161075.getClass(), "tapGood", -2076042755);
        setIntField(term161075, term161075.getClass(), "tapBad", -1398506726);
        setIntField(term161075, term161075.getClass(), "holdPerfect", -1274132944);
        setIntField(term161075, term161075.getClass(), "holdGreat", -623600539);
        setIntField(term161075, term161075.getClass(), "holdGood", -1694875668);
        setIntField(term161075, term161075.getClass(), "holdBad", 2069186656);
        setIntField(term161075, term161075.getClass(), "slidePerfect", -1453931640);
        setIntField(term161075, term161075.getClass(), "slideGreat", 1629226646);
        setIntField(term161075, term161075.getClass(), "slideGood", 1896955056);
        setIntField(term161075, term161075.getClass(), "slideBad", -688400165);
        setIntField(term161075, term161075.getClass(), "breakPerfect", 1383834848);
        setIntField(term161075, term161075.getClass(), "breakGreat", 404958794);
        setIntField(term161075, term161075.getClass(), "breakGood", -2130448162);
        setIntField(term161075, term161075.getClass(), "breakBad", -1128620237);
        setBooleanField(term161075, term161075.getClass(), "isTrackSkip", false);
        setBooleanField(term161075, term161075.getClass(), "isHighScore", true);
        setBooleanField(term161075, term161075.getClass(), "isChallengeTrack", false);
        setIntField(term161075, term161075.getClass(), "challengeLife", -1314758823);
        setIntField(term161075, term161075.getClass(), "challengeRemain", 1245915795);
        setIntField(term161075, term161075.getClass(), "isAllPerfectPlus", 1106655313);
        term161387 = new Integer(-1275313652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term161387;
        callMethod(klass, "setTapGood", argTypes, term161075, args);
    }

};


