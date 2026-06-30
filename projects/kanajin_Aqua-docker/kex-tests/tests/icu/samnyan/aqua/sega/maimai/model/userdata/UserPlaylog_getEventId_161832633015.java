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

public class UserPlaylog_getEventId_161832633015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119471;

    public UserPlaylog_getEventId_161832633015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119477 = new Long(-3806202176947356197L);
        term119471 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term119473 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term119475 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term119491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119506 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term119471, term119471.getClass(), "id", 7053349473507426657L);
        setLongField(term119473, term119473.getClass(), "id", 8761438573959719489L);
        setLongField(term119475, term119475.getClass(), "id", -6772311116874630960L);
        setField(term119475, term119475.getClass(), "extId", term119477);
        setField(term119475, term119475.getClass(), "luid", "OzwvrniiKl");
        setIntField(term119492, term119492.getClass(), "year", 2017);
        setShortField(term119492, term119492.getClass(), "month", (short) 4);
        setShortField(term119492, term119492.getClass(), "day", (short) 7);
        setField(term119491, term119491.getClass(), "date", term119492);
        setByteField(term119496, term119496.getClass(), "hour", (byte) 21);
        setByteField(term119496, term119496.getClass(), "minute", (byte) 7);
        setByteField(term119496, term119496.getClass(), "second", (byte) 57);
        setIntField(term119496, term119496.getClass(), "nano", 229024114);
        setField(term119491, term119491.getClass(), "time", term119496);
        setField(term119475, term119475.getClass(), "registerTime", term119491);
        setIntField(term119502, term119502.getClass(), "year", 2019);
        setShortField(term119502, term119502.getClass(), "month", (short) 2);
        setShortField(term119502, term119502.getClass(), "day", (short) 24);
        setField(term119501, term119501.getClass(), "date", term119502);
        setByteField(term119506, term119506.getClass(), "hour", (byte) 1);
        setByteField(term119506, term119506.getClass(), "minute", (byte) 34);
        setByteField(term119506, term119506.getClass(), "second", (byte) 39);
        setIntField(term119506, term119506.getClass(), "nano", 549100800);
        setField(term119501, term119501.getClass(), "time", term119506);
        setField(term119475, term119475.getClass(), "accessTime", term119501);
        setField(term119473, term119473.getClass(), "card", term119475);
        setIntField(term119473, term119473.getClass(), "lastDataVersion", -739420621);
        setField(term119473, term119473.getClass(), "userName", "beAkHVBeEQ");
        setIntField(term119473, term119473.getClass(), "point", -757005603);
        setIntField(term119473, term119473.getClass(), "totalPoint", 511007704);
        setIntField(term119473, term119473.getClass(), "iconId", 831195530);
        setIntField(term119473, term119473.getClass(), "nameplateId", -1466546102);
        setIntField(term119473, term119473.getClass(), "frameId", 2065167360);
        setIntField(term119473, term119473.getClass(), "trophyId", -1556118295);
        setIntField(term119473, term119473.getClass(), "playCount", 1749932022);
        setIntField(term119473, term119473.getClass(), "playVsCount", 2127066486);
        setIntField(term119473, term119473.getClass(), "playSyncCount", 621768726);
        setIntField(term119473, term119473.getClass(), "winCount", -1436840660);
        setIntField(term119473, term119473.getClass(), "helpCount", 2007506309);
        setIntField(term119473, term119473.getClass(), "comboCount", -1376730510);
        setIntField(term119473, term119473.getClass(), "feverCount", 546560504);
        setIntField(term119473, term119473.getClass(), "totalHiScore", -1289216870);
        setIntField(term119473, term119473.getClass(), "totalEasyHighScore", -1788717665);
        setIntField(term119473, term119473.getClass(), "totalBasicHighScore", 1618168148);
        setIntField(term119473, term119473.getClass(), "totalAdvancedHighScore", 1565876587);
        setIntField(term119473, term119473.getClass(), "totalExpertHighScore", -480885839);
        setIntField(term119473, term119473.getClass(), "totalMasterHighScore", 464342395);
        setIntField(term119473, term119473.getClass(), "totalReMasterHighScore", 1596861681);
        setIntField(term119473, term119473.getClass(), "totalHighSync", 867687605);
        setIntField(term119473, term119473.getClass(), "totalEasySync", 827594613);
        setIntField(term119473, term119473.getClass(), "totalBasicSync", -1402852908);
        setIntField(term119473, term119473.getClass(), "totalAdvancedSync", -221528448);
        setIntField(term119473, term119473.getClass(), "totalExpertSync", 231614322);
        setIntField(term119473, term119473.getClass(), "totalMasterSync", 1911982519);
        setIntField(term119473, term119473.getClass(), "totalReMasterSync", -246377509);
        setIntField(term119473, term119473.getClass(), "playerRating", 173988221);
        setIntField(term119473, term119473.getClass(), "highestRating", -1062462809);
        setIntField(term119473, term119473.getClass(), "rankAuthTailId", 263324057);
        setField(term119473, term119473.getClass(), "eventWatchedDate", "tiGVUUaQMv");
        setField(term119473, term119473.getClass(), "webLimitDate", "NzoNAsaJqr");
        setIntField(term119473, term119473.getClass(), "challengeTrackPhase", -1978777233);
        setIntField(term119473, term119473.getClass(), "firstPlayBits", -1727096369);
        setField(term119473, term119473.getClass(), "lastPlayDate", "VRKEuPftph");
        setIntField(term119473, term119473.getClass(), "lastPlaceId", -715689449);
        setField(term119473, term119473.getClass(), "lastPlaceName", "DkRegMkIWt");
        setIntField(term119473, term119473.getClass(), "lastRegionId", -928679856);
        setField(term119473, term119473.getClass(), "lastRegionName", "IIOFAGjcXe");
        setField(term119473, term119473.getClass(), "lastClientId", "XsAUdWVfqM");
        setField(term119473, term119473.getClass(), "lastCountryCode", "WRKAHqtTqT");
        setIntField(term119473, term119473.getClass(), "eventPoint", 1866091658);
        setIntField(term119473, term119473.getClass(), "totalLv", -1857761236);
        setIntField(term119473, term119473.getClass(), "lastLoginBonusDay", 1011954389);
        setIntField(term119473, term119473.getClass(), "lastSurvivalBonusDay", 2058624555);
        setIntField(term119473, term119473.getClass(), "loginBonusLv", 2069499390);
        setField(term119471, term119471.getClass(), "user", term119473);
        setIntField(term119471, term119471.getClass(), "orderId", 1294260412);
        setLongField(term119471, term119471.getClass(), "sortNumber", 6971596090562280868L);
        setIntField(term119471, term119471.getClass(), "placeId", -1539938534);
        setField(term119471, term119471.getClass(), "placeName", "EkgwvUqGYF");
        setField(term119471, term119471.getClass(), "country", "sbtPNrurvf");
        setIntField(term119471, term119471.getClass(), "regionId", 1847970773);
        setField(term119471, term119471.getClass(), "playDate", "zomtOAIouP");
        setField(term119471, term119471.getClass(), "userPlayDate", "pwHkUmkBGN");
        setIntField(term119471, term119471.getClass(), "musicId", -1180930206);
        setIntField(term119471, term119471.getClass(), "level", -1203324932);
        setIntField(term119471, term119471.getClass(), "gameMode", -1265613992);
        setIntField(term119471, term119471.getClass(), "rivalNum", -402209834);
        setIntField(term119471, term119471.getClass(), "track", -1641289658);
        setIntField(term119471, term119471.getClass(), "eventId", 2014093797);
        setBooleanField(term119471, term119471.getClass(), "isFreeToPlay", true);
        setIntField(term119471, term119471.getClass(), "playerRating", -556201841);
        setLongField(term119471, term119471.getClass(), "playedUserId1", 7340409588443647231L);
        setField(term119471, term119471.getClass(), "playedUserName1", "TZJzEpeSDz");
        setIntField(term119471, term119471.getClass(), "playedMusicLevel1", 168003679);
        setLongField(term119471, term119471.getClass(), "playedUserId2", 8307567070673352896L);
        setField(term119471, term119471.getClass(), "playedUserName2", "CEVnfPOBDk");
        setIntField(term119471, term119471.getClass(), "playedMusicLevel2", -511272275);
        setLongField(term119471, term119471.getClass(), "playedUserId3", 7685476896447838804L);
        setField(term119471, term119471.getClass(), "playedUserName3", "JUpDTRXGtv");
        setIntField(term119471, term119471.getClass(), "playedMusicLevel3", 1286033228);
        setIntField(term119471, term119471.getClass(), "achievement", 37500894);
        setIntField(term119471, term119471.getClass(), "score", 503695686);
        setIntField(term119471, term119471.getClass(), "tapScore", -1814609220);
        setIntField(term119471, term119471.getClass(), "holdScore", 1195361675);
        setIntField(term119471, term119471.getClass(), "slideScore", 1206774620);
        setIntField(term119471, term119471.getClass(), "breakScore", -1666994610);
        setIntField(term119471, term119471.getClass(), "syncRate", 1170271662);
        setIntField(term119471, term119471.getClass(), "vsWin", 1879274593);
        setBooleanField(term119471, term119471.getClass(), "isAllPerfect", false);
        setIntField(term119471, term119471.getClass(), "fullCombo", -10590168);
        setIntField(term119471, term119471.getClass(), "maxFever", 1187185068);
        setIntField(term119471, term119471.getClass(), "maxCombo", 884648970);
        setIntField(term119471, term119471.getClass(), "tapPerfect", 1798950422);
        setIntField(term119471, term119471.getClass(), "tapGreat", -934527554);
        setIntField(term119471, term119471.getClass(), "tapGood", 283508422);
        setIntField(term119471, term119471.getClass(), "tapBad", 288863000);
        setIntField(term119471, term119471.getClass(), "holdPerfect", 1431879138);
        setIntField(term119471, term119471.getClass(), "holdGreat", -2046261620);
        setIntField(term119471, term119471.getClass(), "holdGood", -374355651);
        setIntField(term119471, term119471.getClass(), "holdBad", -1213488752);
        setIntField(term119471, term119471.getClass(), "slidePerfect", -847273841);
        setIntField(term119471, term119471.getClass(), "slideGreat", -1067049532);
        setIntField(term119471, term119471.getClass(), "slideGood", 1636487213);
        setIntField(term119471, term119471.getClass(), "slideBad", -1975395435);
        setIntField(term119471, term119471.getClass(), "breakPerfect", 1108779869);
        setIntField(term119471, term119471.getClass(), "breakGreat", -1526342029);
        setIntField(term119471, term119471.getClass(), "breakGood", 926654899);
        setIntField(term119471, term119471.getClass(), "breakBad", -1424346655);
        setBooleanField(term119471, term119471.getClass(), "isTrackSkip", false);
        setBooleanField(term119471, term119471.getClass(), "isHighScore", false);
        setBooleanField(term119471, term119471.getClass(), "isChallengeTrack", false);
        setIntField(term119471, term119471.getClass(), "challengeLife", 1992994085);
        setIntField(term119471, term119471.getClass(), "challengeRemain", -1942011950);
        setIntField(term119471, term119471.getClass(), "isAllPerfectPlus", -523308369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term119471, args);
    }

};


