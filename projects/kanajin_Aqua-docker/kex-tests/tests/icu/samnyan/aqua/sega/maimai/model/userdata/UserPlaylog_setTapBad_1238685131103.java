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

public class UserPlaylog_setTapBad_1238685131103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3987859;
     Object term3988171;

    public UserPlaylog_setTapBad_1238685131103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3987865 = new Long(1902439295569540465L);
        term3987859 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3987861 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3987863 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3987879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3987880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3987884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3987889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3987890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3987894 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3987859, term3987859.getClass(), "id", 1483811688288778980L);
        setLongField(term3987861, term3987861.getClass(), "id", 3435704719801392817L);
        setLongField(term3987863, term3987863.getClass(), "id", 8996327987947591378L);
        setField(term3987863, term3987863.getClass(), "extId", term3987865);
        setField(term3987863, term3987863.getClass(), "luid", "SZAsHhMNBA");
        setIntField(term3987880, term3987880.getClass(), "year", 2019);
        setShortField(term3987880, term3987880.getClass(), "month", (short) 12);
        setShortField(term3987880, term3987880.getClass(), "day", (short) 11);
        setField(term3987879, term3987879.getClass(), "date", term3987880);
        setByteField(term3987884, term3987884.getClass(), "hour", (byte) 20);
        setByteField(term3987884, term3987884.getClass(), "minute", (byte) 35);
        setByteField(term3987884, term3987884.getClass(), "second", (byte) 32);
        setIntField(term3987884, term3987884.getClass(), "nano", 224552112);
        setField(term3987879, term3987879.getClass(), "time", term3987884);
        setField(term3987863, term3987863.getClass(), "registerTime", term3987879);
        setIntField(term3987890, term3987890.getClass(), "year", 2025);
        setShortField(term3987890, term3987890.getClass(), "month", (short) 5);
        setShortField(term3987890, term3987890.getClass(), "day", (short) 21);
        setField(term3987889, term3987889.getClass(), "date", term3987890);
        setByteField(term3987894, term3987894.getClass(), "hour", (byte) 3);
        setByteField(term3987894, term3987894.getClass(), "minute", (byte) 25);
        setByteField(term3987894, term3987894.getClass(), "second", (byte) 37);
        setIntField(term3987894, term3987894.getClass(), "nano", 147537500);
        setField(term3987889, term3987889.getClass(), "time", term3987894);
        setField(term3987863, term3987863.getClass(), "accessTime", term3987889);
        setField(term3987861, term3987861.getClass(), "card", term3987863);
        setIntField(term3987861, term3987861.getClass(), "lastDataVersion", -1282895455);
        setField(term3987861, term3987861.getClass(), "userName", "tqbOWcUSXY");
        setIntField(term3987861, term3987861.getClass(), "point", 1820246156);
        setIntField(term3987861, term3987861.getClass(), "totalPoint", 157900952);
        setIntField(term3987861, term3987861.getClass(), "iconId", 658759753);
        setIntField(term3987861, term3987861.getClass(), "nameplateId", 713423385);
        setIntField(term3987861, term3987861.getClass(), "frameId", 1185250719);
        setIntField(term3987861, term3987861.getClass(), "trophyId", 1723664333);
        setIntField(term3987861, term3987861.getClass(), "playCount", 1535611097);
        setIntField(term3987861, term3987861.getClass(), "playVsCount", 252480691);
        setIntField(term3987861, term3987861.getClass(), "playSyncCount", 1599983233);
        setIntField(term3987861, term3987861.getClass(), "winCount", -392509802);
        setIntField(term3987861, term3987861.getClass(), "helpCount", 88347783);
        setIntField(term3987861, term3987861.getClass(), "comboCount", -1015692876);
        setIntField(term3987861, term3987861.getClass(), "feverCount", -1130185790);
        setIntField(term3987861, term3987861.getClass(), "totalHiScore", 152509503);
        setIntField(term3987861, term3987861.getClass(), "totalEasyHighScore", 847186931);
        setIntField(term3987861, term3987861.getClass(), "totalBasicHighScore", -1910611759);
        setIntField(term3987861, term3987861.getClass(), "totalAdvancedHighScore", 622780587);
        setIntField(term3987861, term3987861.getClass(), "totalExpertHighScore", 1412729356);
        setIntField(term3987861, term3987861.getClass(), "totalMasterHighScore", 1729394637);
        setIntField(term3987861, term3987861.getClass(), "totalReMasterHighScore", 541949701);
        setIntField(term3987861, term3987861.getClass(), "totalHighSync", -268241281);
        setIntField(term3987861, term3987861.getClass(), "totalEasySync", 34338597);
        setIntField(term3987861, term3987861.getClass(), "totalBasicSync", 1185316799);
        setIntField(term3987861, term3987861.getClass(), "totalAdvancedSync", 1881998756);
        setIntField(term3987861, term3987861.getClass(), "totalExpertSync", -73183228);
        setIntField(term3987861, term3987861.getClass(), "totalMasterSync", -897392689);
        setIntField(term3987861, term3987861.getClass(), "totalReMasterSync", 59261834);
        setIntField(term3987861, term3987861.getClass(), "playerRating", -270854480);
        setIntField(term3987861, term3987861.getClass(), "highestRating", 359860545);
        setIntField(term3987861, term3987861.getClass(), "rankAuthTailId", -656882723);
        setField(term3987861, term3987861.getClass(), "eventWatchedDate", "uUCDIDRBIv");
        setField(term3987861, term3987861.getClass(), "webLimitDate", "wIfQOmGUfa");
        setIntField(term3987861, term3987861.getClass(), "challengeTrackPhase", -1910367633);
        setIntField(term3987861, term3987861.getClass(), "firstPlayBits", -197336469);
        setField(term3987861, term3987861.getClass(), "lastPlayDate", "gqMGyiDrHn");
        setIntField(term3987861, term3987861.getClass(), "lastPlaceId", 1780215688);
        setField(term3987861, term3987861.getClass(), "lastPlaceName", "pvcddhHpPH");
        setIntField(term3987861, term3987861.getClass(), "lastRegionId", 1543014501);
        setField(term3987861, term3987861.getClass(), "lastRegionName", "VKXflYZTGn");
        setField(term3987861, term3987861.getClass(), "lastClientId", "jwwLqXDtpc");
        setField(term3987861, term3987861.getClass(), "lastCountryCode", "dqOfVsbovR");
        setIntField(term3987861, term3987861.getClass(), "eventPoint", 1330635983);
        setIntField(term3987861, term3987861.getClass(), "totalLv", 1202766381);
        setIntField(term3987861, term3987861.getClass(), "lastLoginBonusDay", -1830918730);
        setIntField(term3987861, term3987861.getClass(), "lastSurvivalBonusDay", -971915083);
        setIntField(term3987861, term3987861.getClass(), "loginBonusLv", -853519339);
        setField(term3987859, term3987859.getClass(), "user", term3987861);
        setIntField(term3987859, term3987859.getClass(), "orderId", 675720311);
        setLongField(term3987859, term3987859.getClass(), "sortNumber", -5417570978310959305L);
        setIntField(term3987859, term3987859.getClass(), "placeId", -430651207);
        setField(term3987859, term3987859.getClass(), "placeName", "KktlimtQuA");
        setField(term3987859, term3987859.getClass(), "country", "VEcOcoHdAO");
        setIntField(term3987859, term3987859.getClass(), "regionId", -574025081);
        setField(term3987859, term3987859.getClass(), "playDate", "pKEskiYHDG");
        setField(term3987859, term3987859.getClass(), "userPlayDate", "ndWANcAsPI");
        setIntField(term3987859, term3987859.getClass(), "musicId", -295285549);
        setIntField(term3987859, term3987859.getClass(), "level", 1543722567);
        setIntField(term3987859, term3987859.getClass(), "gameMode", -93710254);
        setIntField(term3987859, term3987859.getClass(), "rivalNum", 1015949684);
        setIntField(term3987859, term3987859.getClass(), "track", 83609387);
        setIntField(term3987859, term3987859.getClass(), "eventId", 958633389);
        setBooleanField(term3987859, term3987859.getClass(), "isFreeToPlay", false);
        setIntField(term3987859, term3987859.getClass(), "playerRating", -334764005);
        setLongField(term3987859, term3987859.getClass(), "playedUserId1", -2018982533966600778L);
        setField(term3987859, term3987859.getClass(), "playedUserName1", "ihBiYEukyc");
        setIntField(term3987859, term3987859.getClass(), "playedMusicLevel1", 1536748966);
        setLongField(term3987859, term3987859.getClass(), "playedUserId2", -7746187464073715730L);
        setField(term3987859, term3987859.getClass(), "playedUserName2", "XEuJqQemBR");
        setIntField(term3987859, term3987859.getClass(), "playedMusicLevel2", 1520947568);
        setLongField(term3987859, term3987859.getClass(), "playedUserId3", 7180283757933425742L);
        setField(term3987859, term3987859.getClass(), "playedUserName3", "KNEBTygjVd");
        setIntField(term3987859, term3987859.getClass(), "playedMusicLevel3", -241509986);
        setIntField(term3987859, term3987859.getClass(), "achievement", 1931205835);
        setIntField(term3987859, term3987859.getClass(), "score", 2063004114);
        setIntField(term3987859, term3987859.getClass(), "tapScore", -1752196852);
        setIntField(term3987859, term3987859.getClass(), "holdScore", -1453274361);
        setIntField(term3987859, term3987859.getClass(), "slideScore", -156943943);
        setIntField(term3987859, term3987859.getClass(), "breakScore", 1194151012);
        setIntField(term3987859, term3987859.getClass(), "syncRate", 87334307);
        setIntField(term3987859, term3987859.getClass(), "vsWin", -1144034523);
        setBooleanField(term3987859, term3987859.getClass(), "isAllPerfect", true);
        setIntField(term3987859, term3987859.getClass(), "fullCombo", 1923039902);
        setIntField(term3987859, term3987859.getClass(), "maxFever", 1770147835);
        setIntField(term3987859, term3987859.getClass(), "maxCombo", -595561864);
        setIntField(term3987859, term3987859.getClass(), "tapPerfect", -2037103853);
        setIntField(term3987859, term3987859.getClass(), "tapGreat", -976390754);
        setIntField(term3987859, term3987859.getClass(), "tapGood", 407230231);
        setIntField(term3987859, term3987859.getClass(), "tapBad", -1971277297);
        setIntField(term3987859, term3987859.getClass(), "holdPerfect", 1573681316);
        setIntField(term3987859, term3987859.getClass(), "holdGreat", -405085815);
        setIntField(term3987859, term3987859.getClass(), "holdGood", 782636816);
        setIntField(term3987859, term3987859.getClass(), "holdBad", 477890580);
        setIntField(term3987859, term3987859.getClass(), "slidePerfect", 1309465714);
        setIntField(term3987859, term3987859.getClass(), "slideGreat", 366877789);
        setIntField(term3987859, term3987859.getClass(), "slideGood", 1779052105);
        setIntField(term3987859, term3987859.getClass(), "slideBad", -348949125);
        setIntField(term3987859, term3987859.getClass(), "breakPerfect", -1282128585);
        setIntField(term3987859, term3987859.getClass(), "breakGreat", 2051513871);
        setIntField(term3987859, term3987859.getClass(), "breakGood", -1261772379);
        setIntField(term3987859, term3987859.getClass(), "breakBad", -1531890968);
        setBooleanField(term3987859, term3987859.getClass(), "isTrackSkip", true);
        setBooleanField(term3987859, term3987859.getClass(), "isHighScore", false);
        setBooleanField(term3987859, term3987859.getClass(), "isChallengeTrack", false);
        setIntField(term3987859, term3987859.getClass(), "challengeLife", -1292383142);
        setIntField(term3987859, term3987859.getClass(), "challengeRemain", 2098496394);
        setIntField(term3987859, term3987859.getClass(), "isAllPerfectPlus", 649411898);
        term3988171 = new Integer(507041104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3988171;
        callMethod(klass, "setTapBad", argTypes, term3987859, args);
    }

};


