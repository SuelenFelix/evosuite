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

public class UserPlaylog_setPlayerRating_143287096178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149583;
     Object term149895;

    public UserPlaylog_setPlayerRating_143287096178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149589 = new Long(-6108006981756732593L);
        term149583 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term149585 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term149587 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149608 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149618 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149583, term149583.getClass(), "id", 3458780357847556173L);
        setLongField(term149585, term149585.getClass(), "id", -252234842640503104L);
        setLongField(term149587, term149587.getClass(), "id", -4237738930912633869L);
        setField(term149587, term149587.getClass(), "extId", term149589);
        setField(term149587, term149587.getClass(), "luid", "KKIqUqWzEr");
        setIntField(term149604, term149604.getClass(), "year", 2027);
        setShortField(term149604, term149604.getClass(), "month", (short) 5);
        setShortField(term149604, term149604.getClass(), "day", (short) 9);
        setField(term149603, term149603.getClass(), "date", term149604);
        setByteField(term149608, term149608.getClass(), "hour", (byte) 18);
        setByteField(term149608, term149608.getClass(), "minute", (byte) 17);
        setByteField(term149608, term149608.getClass(), "second", (byte) 45);
        setIntField(term149608, term149608.getClass(), "nano", 184100659);
        setField(term149603, term149603.getClass(), "time", term149608);
        setField(term149587, term149587.getClass(), "registerTime", term149603);
        setIntField(term149614, term149614.getClass(), "year", 2029);
        setShortField(term149614, term149614.getClass(), "month", (short) 7);
        setShortField(term149614, term149614.getClass(), "day", (short) 19);
        setField(term149613, term149613.getClass(), "date", term149614);
        setByteField(term149618, term149618.getClass(), "hour", (byte) 21);
        setByteField(term149618, term149618.getClass(), "minute", (byte) 46);
        setByteField(term149618, term149618.getClass(), "second", (byte) 27);
        setIntField(term149618, term149618.getClass(), "nano", 413909191);
        setField(term149613, term149613.getClass(), "time", term149618);
        setField(term149587, term149587.getClass(), "accessTime", term149613);
        setField(term149585, term149585.getClass(), "card", term149587);
        setIntField(term149585, term149585.getClass(), "lastDataVersion", 2135167581);
        setField(term149585, term149585.getClass(), "userName", "ERiiSXCvBM");
        setIntField(term149585, term149585.getClass(), "point", -732115520);
        setIntField(term149585, term149585.getClass(), "totalPoint", 441210816);
        setIntField(term149585, term149585.getClass(), "iconId", 1491573390);
        setIntField(term149585, term149585.getClass(), "nameplateId", -263423483);
        setIntField(term149585, term149585.getClass(), "frameId", 1461876287);
        setIntField(term149585, term149585.getClass(), "trophyId", -2077900576);
        setIntField(term149585, term149585.getClass(), "playCount", 1315949345);
        setIntField(term149585, term149585.getClass(), "playVsCount", -165571895);
        setIntField(term149585, term149585.getClass(), "playSyncCount", -1773441307);
        setIntField(term149585, term149585.getClass(), "winCount", -205848544);
        setIntField(term149585, term149585.getClass(), "helpCount", -887384593);
        setIntField(term149585, term149585.getClass(), "comboCount", -845902757);
        setIntField(term149585, term149585.getClass(), "feverCount", 1259462576);
        setIntField(term149585, term149585.getClass(), "totalHiScore", 1096752196);
        setIntField(term149585, term149585.getClass(), "totalEasyHighScore", -796862449);
        setIntField(term149585, term149585.getClass(), "totalBasicHighScore", -1652791090);
        setIntField(term149585, term149585.getClass(), "totalAdvancedHighScore", -1234698980);
        setIntField(term149585, term149585.getClass(), "totalExpertHighScore", 219686926);
        setIntField(term149585, term149585.getClass(), "totalMasterHighScore", -1838719573);
        setIntField(term149585, term149585.getClass(), "totalReMasterHighScore", -428877223);
        setIntField(term149585, term149585.getClass(), "totalHighSync", -1727427440);
        setIntField(term149585, term149585.getClass(), "totalEasySync", -838541413);
        setIntField(term149585, term149585.getClass(), "totalBasicSync", 547667338);
        setIntField(term149585, term149585.getClass(), "totalAdvancedSync", 555268442);
        setIntField(term149585, term149585.getClass(), "totalExpertSync", -591610853);
        setIntField(term149585, term149585.getClass(), "totalMasterSync", 380909580);
        setIntField(term149585, term149585.getClass(), "totalReMasterSync", -828253718);
        setIntField(term149585, term149585.getClass(), "playerRating", 1597658782);
        setIntField(term149585, term149585.getClass(), "highestRating", -1600372385);
        setIntField(term149585, term149585.getClass(), "rankAuthTailId", -1988901529);
        setField(term149585, term149585.getClass(), "eventWatchedDate", "RgePgJxaiq");
        setField(term149585, term149585.getClass(), "webLimitDate", "wbdTRzpToE");
        setIntField(term149585, term149585.getClass(), "challengeTrackPhase", 1316428434);
        setIntField(term149585, term149585.getClass(), "firstPlayBits", 357838303);
        setField(term149585, term149585.getClass(), "lastPlayDate", "hYyOXAATCh");
        setIntField(term149585, term149585.getClass(), "lastPlaceId", 1232073677);
        setField(term149585, term149585.getClass(), "lastPlaceName", "UbvbXQRnLW");
        setIntField(term149585, term149585.getClass(), "lastRegionId", -1467737409);
        setField(term149585, term149585.getClass(), "lastRegionName", "CkIbQCWOgW");
        setField(term149585, term149585.getClass(), "lastClientId", "JWaRuPqymE");
        setField(term149585, term149585.getClass(), "lastCountryCode", "nTasTwGyTu");
        setIntField(term149585, term149585.getClass(), "eventPoint", 1053406248);
        setIntField(term149585, term149585.getClass(), "totalLv", -379667315);
        setIntField(term149585, term149585.getClass(), "lastLoginBonusDay", 632837650);
        setIntField(term149585, term149585.getClass(), "lastSurvivalBonusDay", 1534101651);
        setIntField(term149585, term149585.getClass(), "loginBonusLv", 40210623);
        setField(term149583, term149583.getClass(), "user", term149585);
        setIntField(term149583, term149583.getClass(), "orderId", -2034728751);
        setLongField(term149583, term149583.getClass(), "sortNumber", -3539678318307233375L);
        setIntField(term149583, term149583.getClass(), "placeId", 644137680);
        setField(term149583, term149583.getClass(), "placeName", "qRRPimcPhW");
        setField(term149583, term149583.getClass(), "country", "vhGXukwBWg");
        setIntField(term149583, term149583.getClass(), "regionId", -1900421772);
        setField(term149583, term149583.getClass(), "playDate", "JahleHixdz");
        setField(term149583, term149583.getClass(), "userPlayDate", "rnkTocCEbH");
        setIntField(term149583, term149583.getClass(), "musicId", -197874252);
        setIntField(term149583, term149583.getClass(), "level", 1412785358);
        setIntField(term149583, term149583.getClass(), "gameMode", 410202257);
        setIntField(term149583, term149583.getClass(), "rivalNum", -2082861847);
        setIntField(term149583, term149583.getClass(), "track", 1391329978);
        setIntField(term149583, term149583.getClass(), "eventId", 1336089129);
        setBooleanField(term149583, term149583.getClass(), "isFreeToPlay", true);
        setIntField(term149583, term149583.getClass(), "playerRating", -600588040);
        setLongField(term149583, term149583.getClass(), "playedUserId1", -256569768909962991L);
        setField(term149583, term149583.getClass(), "playedUserName1", "wsDKWECjHf");
        setIntField(term149583, term149583.getClass(), "playedMusicLevel1", 664854678);
        setLongField(term149583, term149583.getClass(), "playedUserId2", -1765487752643688529L);
        setField(term149583, term149583.getClass(), "playedUserName2", "FBPRmfNDEr");
        setIntField(term149583, term149583.getClass(), "playedMusicLevel2", -756857294);
        setLongField(term149583, term149583.getClass(), "playedUserId3", -322037057179477006L);
        setField(term149583, term149583.getClass(), "playedUserName3", "qOEJpzrzgF");
        setIntField(term149583, term149583.getClass(), "playedMusicLevel3", -700896821);
        setIntField(term149583, term149583.getClass(), "achievement", -338063559);
        setIntField(term149583, term149583.getClass(), "score", 1648891802);
        setIntField(term149583, term149583.getClass(), "tapScore", 1928733375);
        setIntField(term149583, term149583.getClass(), "holdScore", 1536408549);
        setIntField(term149583, term149583.getClass(), "slideScore", 1873113546);
        setIntField(term149583, term149583.getClass(), "breakScore", -1046505415);
        setIntField(term149583, term149583.getClass(), "syncRate", -1590513127);
        setIntField(term149583, term149583.getClass(), "vsWin", -582722508);
        setBooleanField(term149583, term149583.getClass(), "isAllPerfect", true);
        setIntField(term149583, term149583.getClass(), "fullCombo", 1770955610);
        setIntField(term149583, term149583.getClass(), "maxFever", -258435141);
        setIntField(term149583, term149583.getClass(), "maxCombo", -1525264094);
        setIntField(term149583, term149583.getClass(), "tapPerfect", -1611383163);
        setIntField(term149583, term149583.getClass(), "tapGreat", -1474787582);
        setIntField(term149583, term149583.getClass(), "tapGood", 578870419);
        setIntField(term149583, term149583.getClass(), "tapBad", -1234755274);
        setIntField(term149583, term149583.getClass(), "holdPerfect", -1731737733);
        setIntField(term149583, term149583.getClass(), "holdGreat", 524549049);
        setIntField(term149583, term149583.getClass(), "holdGood", 1236106946);
        setIntField(term149583, term149583.getClass(), "holdBad", -1057895738);
        setIntField(term149583, term149583.getClass(), "slidePerfect", -93626992);
        setIntField(term149583, term149583.getClass(), "slideGreat", -1568804083);
        setIntField(term149583, term149583.getClass(), "slideGood", -1553544579);
        setIntField(term149583, term149583.getClass(), "slideBad", 214455591);
        setIntField(term149583, term149583.getClass(), "breakPerfect", 489539161);
        setIntField(term149583, term149583.getClass(), "breakGreat", 1515470608);
        setIntField(term149583, term149583.getClass(), "breakGood", -1143133939);
        setIntField(term149583, term149583.getClass(), "breakBad", 1626744743);
        setBooleanField(term149583, term149583.getClass(), "isTrackSkip", false);
        setBooleanField(term149583, term149583.getClass(), "isHighScore", false);
        setBooleanField(term149583, term149583.getClass(), "isChallengeTrack", true);
        setIntField(term149583, term149583.getClass(), "challengeLife", 1426887693);
        setIntField(term149583, term149583.getClass(), "challengeRemain", 2144652175);
        setIntField(term149583, term149583.getClass(), "isAllPerfectPlus", -1761004554);
        term149895 = new Integer(-1723168799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term149895;
        callMethod(klass, "setPlayerRating", argTypes, term149583, args);
    }

};


