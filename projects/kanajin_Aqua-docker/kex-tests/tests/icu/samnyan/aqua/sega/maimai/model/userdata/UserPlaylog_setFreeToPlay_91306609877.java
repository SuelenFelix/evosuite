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
import java.lang.Boolean;

public class UserPlaylog_setFreeToPlay_91306609877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149109;
     Object term149421;

    public UserPlaylog_setFreeToPlay_91306609877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149115 = new Long(-1365372122034008688L);
        term149109 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term149111 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term149113 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149144 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149109, term149109.getClass(), "id", 4772045766380729761L);
        setLongField(term149111, term149111.getClass(), "id", -5215160586515108435L);
        setLongField(term149113, term149113.getClass(), "id", -2509873143781504715L);
        setField(term149113, term149113.getClass(), "extId", term149115);
        setField(term149113, term149113.getClass(), "luid", "zxdSWLKWYw");
        setIntField(term149130, term149130.getClass(), "year", 2020);
        setShortField(term149130, term149130.getClass(), "month", (short) 5);
        setShortField(term149130, term149130.getClass(), "day", (short) 18);
        setField(term149129, term149129.getClass(), "date", term149130);
        setByteField(term149134, term149134.getClass(), "hour", (byte) 0);
        setByteField(term149134, term149134.getClass(), "minute", (byte) 6);
        setByteField(term149134, term149134.getClass(), "second", (byte) 7);
        setIntField(term149134, term149134.getClass(), "nano", 597786302);
        setField(term149129, term149129.getClass(), "time", term149134);
        setField(term149113, term149113.getClass(), "registerTime", term149129);
        setIntField(term149140, term149140.getClass(), "year", 2022);
        setShortField(term149140, term149140.getClass(), "month", (short) 10);
        setShortField(term149140, term149140.getClass(), "day", (short) 9);
        setField(term149139, term149139.getClass(), "date", term149140);
        setByteField(term149144, term149144.getClass(), "hour", (byte) 13);
        setByteField(term149144, term149144.getClass(), "minute", (byte) 29);
        setByteField(term149144, term149144.getClass(), "second", (byte) 0);
        setIntField(term149144, term149144.getClass(), "nano", 479809645);
        setField(term149139, term149139.getClass(), "time", term149144);
        setField(term149113, term149113.getClass(), "accessTime", term149139);
        setField(term149111, term149111.getClass(), "card", term149113);
        setIntField(term149111, term149111.getClass(), "lastDataVersion", -1467294152);
        setField(term149111, term149111.getClass(), "userName", "VurQtsudbR");
        setIntField(term149111, term149111.getClass(), "point", -1034276355);
        setIntField(term149111, term149111.getClass(), "totalPoint", -1529357676);
        setIntField(term149111, term149111.getClass(), "iconId", 10150435);
        setIntField(term149111, term149111.getClass(), "nameplateId", -1256890273);
        setIntField(term149111, term149111.getClass(), "frameId", 1443102002);
        setIntField(term149111, term149111.getClass(), "trophyId", 347324151);
        setIntField(term149111, term149111.getClass(), "playCount", -1870606994);
        setIntField(term149111, term149111.getClass(), "playVsCount", -777691652);
        setIntField(term149111, term149111.getClass(), "playSyncCount", -606738226);
        setIntField(term149111, term149111.getClass(), "winCount", 828287241);
        setIntField(term149111, term149111.getClass(), "helpCount", 684351885);
        setIntField(term149111, term149111.getClass(), "comboCount", -1393624608);
        setIntField(term149111, term149111.getClass(), "feverCount", 1752067212);
        setIntField(term149111, term149111.getClass(), "totalHiScore", -1876266343);
        setIntField(term149111, term149111.getClass(), "totalEasyHighScore", 275874932);
        setIntField(term149111, term149111.getClass(), "totalBasicHighScore", 117844112);
        setIntField(term149111, term149111.getClass(), "totalAdvancedHighScore", 185724589);
        setIntField(term149111, term149111.getClass(), "totalExpertHighScore", 580854305);
        setIntField(term149111, term149111.getClass(), "totalMasterHighScore", -1356320855);
        setIntField(term149111, term149111.getClass(), "totalReMasterHighScore", 1349373053);
        setIntField(term149111, term149111.getClass(), "totalHighSync", 845184539);
        setIntField(term149111, term149111.getClass(), "totalEasySync", 776438807);
        setIntField(term149111, term149111.getClass(), "totalBasicSync", 312946951);
        setIntField(term149111, term149111.getClass(), "totalAdvancedSync", -629153416);
        setIntField(term149111, term149111.getClass(), "totalExpertSync", -2035643695);
        setIntField(term149111, term149111.getClass(), "totalMasterSync", 345867650);
        setIntField(term149111, term149111.getClass(), "totalReMasterSync", 1075950526);
        setIntField(term149111, term149111.getClass(), "playerRating", 443050852);
        setIntField(term149111, term149111.getClass(), "highestRating", 120471673);
        setIntField(term149111, term149111.getClass(), "rankAuthTailId", -1396104241);
        setField(term149111, term149111.getClass(), "eventWatchedDate", "KdIGyBXZVB");
        setField(term149111, term149111.getClass(), "webLimitDate", "eKvGCdbyoP");
        setIntField(term149111, term149111.getClass(), "challengeTrackPhase", -445000291);
        setIntField(term149111, term149111.getClass(), "firstPlayBits", -313254868);
        setField(term149111, term149111.getClass(), "lastPlayDate", "MgMUmPLywB");
        setIntField(term149111, term149111.getClass(), "lastPlaceId", -1879218346);
        setField(term149111, term149111.getClass(), "lastPlaceName", "pNJhowQpXJ");
        setIntField(term149111, term149111.getClass(), "lastRegionId", -658635292);
        setField(term149111, term149111.getClass(), "lastRegionName", "gyfupqhzxo");
        setField(term149111, term149111.getClass(), "lastClientId", "WUwUHGneAq");
        setField(term149111, term149111.getClass(), "lastCountryCode", "zlVKedpZvy");
        setIntField(term149111, term149111.getClass(), "eventPoint", -455947117);
        setIntField(term149111, term149111.getClass(), "totalLv", 1628366071);
        setIntField(term149111, term149111.getClass(), "lastLoginBonusDay", -1343885468);
        setIntField(term149111, term149111.getClass(), "lastSurvivalBonusDay", 57741941);
        setIntField(term149111, term149111.getClass(), "loginBonusLv", -1545510798);
        setField(term149109, term149109.getClass(), "user", term149111);
        setIntField(term149109, term149109.getClass(), "orderId", -10623334);
        setLongField(term149109, term149109.getClass(), "sortNumber", -4904759676997645613L);
        setIntField(term149109, term149109.getClass(), "placeId", -826963523);
        setField(term149109, term149109.getClass(), "placeName", "PEUAKKJLwI");
        setField(term149109, term149109.getClass(), "country", "cYvFrvYBOd");
        setIntField(term149109, term149109.getClass(), "regionId", 1201706903);
        setField(term149109, term149109.getClass(), "playDate", "WfCGsRvHTg");
        setField(term149109, term149109.getClass(), "userPlayDate", "jsThoorJsk");
        setIntField(term149109, term149109.getClass(), "musicId", 925089014);
        setIntField(term149109, term149109.getClass(), "level", 1864594766);
        setIntField(term149109, term149109.getClass(), "gameMode", -1496124355);
        setIntField(term149109, term149109.getClass(), "rivalNum", -482420846);
        setIntField(term149109, term149109.getClass(), "track", -332013562);
        setIntField(term149109, term149109.getClass(), "eventId", -736943198);
        setBooleanField(term149109, term149109.getClass(), "isFreeToPlay", false);
        setIntField(term149109, term149109.getClass(), "playerRating", 2007882601);
        setLongField(term149109, term149109.getClass(), "playedUserId1", -2640287313269620296L);
        setField(term149109, term149109.getClass(), "playedUserName1", "DiLoLWWibV");
        setIntField(term149109, term149109.getClass(), "playedMusicLevel1", 741871354);
        setLongField(term149109, term149109.getClass(), "playedUserId2", -6079558432202737241L);
        setField(term149109, term149109.getClass(), "playedUserName2", "jLARiCBiTZ");
        setIntField(term149109, term149109.getClass(), "playedMusicLevel2", 1577592889);
        setLongField(term149109, term149109.getClass(), "playedUserId3", -3787130598270460761L);
        setField(term149109, term149109.getClass(), "playedUserName3", "qgloCkfuKr");
        setIntField(term149109, term149109.getClass(), "playedMusicLevel3", 1202129074);
        setIntField(term149109, term149109.getClass(), "achievement", -1288669556);
        setIntField(term149109, term149109.getClass(), "score", -1521858560);
        setIntField(term149109, term149109.getClass(), "tapScore", -435042405);
        setIntField(term149109, term149109.getClass(), "holdScore", 593933721);
        setIntField(term149109, term149109.getClass(), "slideScore", 1030504994);
        setIntField(term149109, term149109.getClass(), "breakScore", -701067515);
        setIntField(term149109, term149109.getClass(), "syncRate", -1359929680);
        setIntField(term149109, term149109.getClass(), "vsWin", 1621331491);
        setBooleanField(term149109, term149109.getClass(), "isAllPerfect", false);
        setIntField(term149109, term149109.getClass(), "fullCombo", 1164803194);
        setIntField(term149109, term149109.getClass(), "maxFever", -1091019664);
        setIntField(term149109, term149109.getClass(), "maxCombo", -209173576);
        setIntField(term149109, term149109.getClass(), "tapPerfect", -1009420089);
        setIntField(term149109, term149109.getClass(), "tapGreat", -826849130);
        setIntField(term149109, term149109.getClass(), "tapGood", -886487104);
        setIntField(term149109, term149109.getClass(), "tapBad", -1580975564);
        setIntField(term149109, term149109.getClass(), "holdPerfect", -855762476);
        setIntField(term149109, term149109.getClass(), "holdGreat", -559637675);
        setIntField(term149109, term149109.getClass(), "holdGood", 243554276);
        setIntField(term149109, term149109.getClass(), "holdBad", -31351128);
        setIntField(term149109, term149109.getClass(), "slidePerfect", -634909207);
        setIntField(term149109, term149109.getClass(), "slideGreat", -167225645);
        setIntField(term149109, term149109.getClass(), "slideGood", -555907895);
        setIntField(term149109, term149109.getClass(), "slideBad", 1558825635);
        setIntField(term149109, term149109.getClass(), "breakPerfect", -1602562135);
        setIntField(term149109, term149109.getClass(), "breakGreat", -1071040496);
        setIntField(term149109, term149109.getClass(), "breakGood", -132694475);
        setIntField(term149109, term149109.getClass(), "breakBad", 743421180);
        setBooleanField(term149109, term149109.getClass(), "isTrackSkip", false);
        setBooleanField(term149109, term149109.getClass(), "isHighScore", false);
        setBooleanField(term149109, term149109.getClass(), "isChallengeTrack", true);
        setIntField(term149109, term149109.getClass(), "challengeLife", 582186159);
        setIntField(term149109, term149109.getClass(), "challengeRemain", 1121745615);
        setIntField(term149109, term149109.getClass(), "isAllPerfectPlus", -1259795501);
        term149421 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term149421;
        callMethod(klass, "setFreeToPlay", argTypes, term149109, args);
    }

};


