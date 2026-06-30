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

public class UserMusicDetail_getScoreMax_9776010856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181573;

    public UserMusicDetail_getScoreMax_9776010856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term181579 = new Long(1350676497718116574L);
        term181573 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term181575 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term181577 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term181593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181608 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term181573, term181573.getClass(), "id", -5149906517600309652L);
        setLongField(term181575, term181575.getClass(), "id", -2412920067936514032L);
        setLongField(term181577, term181577.getClass(), "id", -1760891577100845054L);
        setField(term181577, term181577.getClass(), "extId", term181579);
        setField(term181577, term181577.getClass(), "luid", "WNUzKkDpZX");
        setIntField(term181594, term181594.getClass(), "year", 2027);
        setShortField(term181594, term181594.getClass(), "month", (short) 2);
        setShortField(term181594, term181594.getClass(), "day", (short) 9);
        setField(term181593, term181593.getClass(), "date", term181594);
        setByteField(term181598, term181598.getClass(), "hour", (byte) 9);
        setByteField(term181598, term181598.getClass(), "minute", (byte) 1);
        setByteField(term181598, term181598.getClass(), "second", (byte) 14);
        setIntField(term181598, term181598.getClass(), "nano", 990366124);
        setField(term181593, term181593.getClass(), "time", term181598);
        setField(term181577, term181577.getClass(), "registerTime", term181593);
        setIntField(term181604, term181604.getClass(), "year", 2010);
        setShortField(term181604, term181604.getClass(), "month", (short) 11);
        setShortField(term181604, term181604.getClass(), "day", (short) 11);
        setField(term181603, term181603.getClass(), "date", term181604);
        setByteField(term181608, term181608.getClass(), "hour", (byte) 0);
        setByteField(term181608, term181608.getClass(), "minute", (byte) 3);
        setByteField(term181608, term181608.getClass(), "second", (byte) 1);
        setIntField(term181608, term181608.getClass(), "nano", 292262275);
        setField(term181603, term181603.getClass(), "time", term181608);
        setField(term181577, term181577.getClass(), "accessTime", term181603);
        setField(term181575, term181575.getClass(), "card", term181577);
        setIntField(term181575, term181575.getClass(), "lastDataVersion", 778302985);
        setField(term181575, term181575.getClass(), "userName", "aduqofSIXN");
        setIntField(term181575, term181575.getClass(), "point", -61350205);
        setIntField(term181575, term181575.getClass(), "totalPoint", -559353692);
        setIntField(term181575, term181575.getClass(), "iconId", -454902894);
        setIntField(term181575, term181575.getClass(), "nameplateId", -453497094);
        setIntField(term181575, term181575.getClass(), "frameId", -779349222);
        setIntField(term181575, term181575.getClass(), "trophyId", 602547827);
        setIntField(term181575, term181575.getClass(), "playCount", -693722083);
        setIntField(term181575, term181575.getClass(), "playVsCount", -1238070855);
        setIntField(term181575, term181575.getClass(), "playSyncCount", -1515130373);
        setIntField(term181575, term181575.getClass(), "winCount", -1898635483);
        setIntField(term181575, term181575.getClass(), "helpCount", 847436830);
        setIntField(term181575, term181575.getClass(), "comboCount", 1128285405);
        setIntField(term181575, term181575.getClass(), "feverCount", 947308779);
        setIntField(term181575, term181575.getClass(), "totalHiScore", -2043021842);
        setIntField(term181575, term181575.getClass(), "totalEasyHighScore", -362424436);
        setIntField(term181575, term181575.getClass(), "totalBasicHighScore", 2030573082);
        setIntField(term181575, term181575.getClass(), "totalAdvancedHighScore", -984207078);
        setIntField(term181575, term181575.getClass(), "totalExpertHighScore", 1516611142);
        setIntField(term181575, term181575.getClass(), "totalMasterHighScore", -1169041176);
        setIntField(term181575, term181575.getClass(), "totalReMasterHighScore", 743840);
        setIntField(term181575, term181575.getClass(), "totalHighSync", 1588663547);
        setIntField(term181575, term181575.getClass(), "totalEasySync", 967074800);
        setIntField(term181575, term181575.getClass(), "totalBasicSync", -90176774);
        setIntField(term181575, term181575.getClass(), "totalAdvancedSync", 1858229184);
        setIntField(term181575, term181575.getClass(), "totalExpertSync", -41551082);
        setIntField(term181575, term181575.getClass(), "totalMasterSync", -935137481);
        setIntField(term181575, term181575.getClass(), "totalReMasterSync", 821449151);
        setIntField(term181575, term181575.getClass(), "playerRating", 418670805);
        setIntField(term181575, term181575.getClass(), "highestRating", 2106370588);
        setIntField(term181575, term181575.getClass(), "rankAuthTailId", -828741254);
        setField(term181575, term181575.getClass(), "eventWatchedDate", "oDCJeRRdBM");
        setField(term181575, term181575.getClass(), "webLimitDate", "RqPlzjjWzi");
        setIntField(term181575, term181575.getClass(), "challengeTrackPhase", 770682529);
        setIntField(term181575, term181575.getClass(), "firstPlayBits", 1784639329);
        setField(term181575, term181575.getClass(), "lastPlayDate", "rTGRmrdzoJ");
        setIntField(term181575, term181575.getClass(), "lastPlaceId", 2070968891);
        setField(term181575, term181575.getClass(), "lastPlaceName", "ZWjeJhPPnm");
        setIntField(term181575, term181575.getClass(), "lastRegionId", 241593835);
        setField(term181575, term181575.getClass(), "lastRegionName", "yPIlHPlNib");
        setField(term181575, term181575.getClass(), "lastClientId", "qdtUDYxxKy");
        setField(term181575, term181575.getClass(), "lastCountryCode", "fSxuiDFwrP");
        setIntField(term181575, term181575.getClass(), "eventPoint", 162829288);
        setIntField(term181575, term181575.getClass(), "totalLv", -578846602);
        setIntField(term181575, term181575.getClass(), "lastLoginBonusDay", -1051859021);
        setIntField(term181575, term181575.getClass(), "lastSurvivalBonusDay", -1101172077);
        setIntField(term181575, term181575.getClass(), "loginBonusLv", -1833569424);
        setField(term181573, term181573.getClass(), "user", term181575);
        setIntField(term181573, term181573.getClass(), "musicId", -765924778);
        setIntField(term181573, term181573.getClass(), "level", 299776681);
        setIntField(term181573, term181573.getClass(), "playCount", -738216551);
        setIntField(term181573, term181573.getClass(), "scoreMax", 1453544604);
        setIntField(term181573, term181573.getClass(), "syncRateMax", -1290000035);
        setBooleanField(term181573, term181573.getClass(), "isAllPerfect", false);
        setIntField(term181573, term181573.getClass(), "isAllPerfectPlus", 1041586235);
        setIntField(term181573, term181573.getClass(), "fullCombo", 403782338);
        setIntField(term181573, term181573.getClass(), "maxFever", 567303562);
        setIntField(term181573, term181573.getClass(), "achievement", -6943969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term181573, args);
    }

};


