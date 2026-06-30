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

public class UserMusicDetail_getIsAllPerfectPlus_11153689659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182401;

    public UserMusicDetail_getIsAllPerfectPlus_11153689659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term182407 = new Long(-354905832180781372L);
        term182401 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term182403 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term182405 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term182421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term182431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182436 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term182401, term182401.getClass(), "id", 6921894188357771660L);
        setLongField(term182403, term182403.getClass(), "id", -6433492565384127622L);
        setLongField(term182405, term182405.getClass(), "id", 2886519650889727392L);
        setField(term182405, term182405.getClass(), "extId", term182407);
        setField(term182405, term182405.getClass(), "luid", "yWPHiAqZcQ");
        setIntField(term182422, term182422.getClass(), "year", 2010);
        setShortField(term182422, term182422.getClass(), "month", (short) 3);
        setShortField(term182422, term182422.getClass(), "day", (short) 31);
        setField(term182421, term182421.getClass(), "date", term182422);
        setByteField(term182426, term182426.getClass(), "hour", (byte) 13);
        setByteField(term182426, term182426.getClass(), "minute", (byte) 35);
        setByteField(term182426, term182426.getClass(), "second", (byte) 45);
        setIntField(term182426, term182426.getClass(), "nano", 154359665);
        setField(term182421, term182421.getClass(), "time", term182426);
        setField(term182405, term182405.getClass(), "registerTime", term182421);
        setIntField(term182432, term182432.getClass(), "year", 2014);
        setShortField(term182432, term182432.getClass(), "month", (short) 11);
        setShortField(term182432, term182432.getClass(), "day", (short) 7);
        setField(term182431, term182431.getClass(), "date", term182432);
        setByteField(term182436, term182436.getClass(), "hour", (byte) 8);
        setByteField(term182436, term182436.getClass(), "minute", (byte) 9);
        setByteField(term182436, term182436.getClass(), "second", (byte) 37);
        setIntField(term182436, term182436.getClass(), "nano", 366421600);
        setField(term182431, term182431.getClass(), "time", term182436);
        setField(term182405, term182405.getClass(), "accessTime", term182431);
        setField(term182403, term182403.getClass(), "card", term182405);
        setIntField(term182403, term182403.getClass(), "lastDataVersion", 234785131);
        setField(term182403, term182403.getClass(), "userName", "IppcpUlrjC");
        setIntField(term182403, term182403.getClass(), "point", 681149351);
        setIntField(term182403, term182403.getClass(), "totalPoint", -1907521328);
        setIntField(term182403, term182403.getClass(), "iconId", -1277683845);
        setIntField(term182403, term182403.getClass(), "nameplateId", 650528666);
        setIntField(term182403, term182403.getClass(), "frameId", -1993469096);
        setIntField(term182403, term182403.getClass(), "trophyId", 470308773);
        setIntField(term182403, term182403.getClass(), "playCount", -737959846);
        setIntField(term182403, term182403.getClass(), "playVsCount", 1364676016);
        setIntField(term182403, term182403.getClass(), "playSyncCount", 967252350);
        setIntField(term182403, term182403.getClass(), "winCount", 763123739);
        setIntField(term182403, term182403.getClass(), "helpCount", -1830705943);
        setIntField(term182403, term182403.getClass(), "comboCount", -862161476);
        setIntField(term182403, term182403.getClass(), "feverCount", -85797853);
        setIntField(term182403, term182403.getClass(), "totalHiScore", 478488394);
        setIntField(term182403, term182403.getClass(), "totalEasyHighScore", 1401128739);
        setIntField(term182403, term182403.getClass(), "totalBasicHighScore", 591105329);
        setIntField(term182403, term182403.getClass(), "totalAdvancedHighScore", -128994206);
        setIntField(term182403, term182403.getClass(), "totalExpertHighScore", -588911401);
        setIntField(term182403, term182403.getClass(), "totalMasterHighScore", -92919720);
        setIntField(term182403, term182403.getClass(), "totalReMasterHighScore", 582214544);
        setIntField(term182403, term182403.getClass(), "totalHighSync", 437573893);
        setIntField(term182403, term182403.getClass(), "totalEasySync", -1662719279);
        setIntField(term182403, term182403.getClass(), "totalBasicSync", -2103009673);
        setIntField(term182403, term182403.getClass(), "totalAdvancedSync", -833974170);
        setIntField(term182403, term182403.getClass(), "totalExpertSync", -814411921);
        setIntField(term182403, term182403.getClass(), "totalMasterSync", 1852815037);
        setIntField(term182403, term182403.getClass(), "totalReMasterSync", -2088339057);
        setIntField(term182403, term182403.getClass(), "playerRating", -1600084871);
        setIntField(term182403, term182403.getClass(), "highestRating", 1608941244);
        setIntField(term182403, term182403.getClass(), "rankAuthTailId", 253849583);
        setField(term182403, term182403.getClass(), "eventWatchedDate", "hxSnnaHCFY");
        setField(term182403, term182403.getClass(), "webLimitDate", "SQvESbffjw");
        setIntField(term182403, term182403.getClass(), "challengeTrackPhase", -571449965);
        setIntField(term182403, term182403.getClass(), "firstPlayBits", 1138670142);
        setField(term182403, term182403.getClass(), "lastPlayDate", "eOSkqEXcaE");
        setIntField(term182403, term182403.getClass(), "lastPlaceId", 1012359462);
        setField(term182403, term182403.getClass(), "lastPlaceName", "MAHSuEBjDv");
        setIntField(term182403, term182403.getClass(), "lastRegionId", -515537125);
        setField(term182403, term182403.getClass(), "lastRegionName", "FJPRnSrJmK");
        setField(term182403, term182403.getClass(), "lastClientId", "fYRcUEKErh");
        setField(term182403, term182403.getClass(), "lastCountryCode", "ObBNcwkdKb");
        setIntField(term182403, term182403.getClass(), "eventPoint", -1776946083);
        setIntField(term182403, term182403.getClass(), "totalLv", -1222338163);
        setIntField(term182403, term182403.getClass(), "lastLoginBonusDay", 1052405674);
        setIntField(term182403, term182403.getClass(), "lastSurvivalBonusDay", -1769542870);
        setIntField(term182403, term182403.getClass(), "loginBonusLv", 231504885);
        setField(term182401, term182401.getClass(), "user", term182403);
        setIntField(term182401, term182401.getClass(), "musicId", 128115351);
        setIntField(term182401, term182401.getClass(), "level", -1166285846);
        setIntField(term182401, term182401.getClass(), "playCount", -945508527);
        setIntField(term182401, term182401.getClass(), "scoreMax", 1545434386);
        setIntField(term182401, term182401.getClass(), "syncRateMax", -273681385);
        setBooleanField(term182401, term182401.getClass(), "isAllPerfect", true);
        setIntField(term182401, term182401.getClass(), "isAllPerfectPlus", 1328165973);
        setIntField(term182401, term182401.getClass(), "fullCombo", -394101152);
        setIntField(term182401, term182401.getClass(), "maxFever", 693450208);
        setIntField(term182401, term182401.getClass(), "achievement", -444038969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsAllPerfectPlus", argTypes, term182401, args);
    }

};


