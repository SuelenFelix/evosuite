package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserFavorite_getFavUserId_4448623123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564975;

    public UserFavorite_getFavUserId_4448623123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564981 = new Long(7314774835988078404L);
        Integer term565044 = new Integer(1293555421);
        Integer term565046 = new Integer(-1861656988);
        Integer term565048 = new Integer(-2030143064);
        ArrayList term565042 = new ArrayList();
        ((ArrayList) term565042).add(term565044);
        ((ArrayList) term565042).add(term565046);
        ((ArrayList) term565042).add(term565048);
        Integer term565054 = new Integer(2036980797);
        Integer term565056 = new Integer(-935931812);
        Integer term565058 = new Integer(1486721984);
        Integer term565060 = new Integer(279609538);
        ArrayList term565052 = new ArrayList();
        ((ArrayList) term565052).add(term565054);
        ((ArrayList) term565052).add(term565056);
        ((ArrayList) term565052).add(term565058);
        ((ArrayList) term565052).add(term565060);
        Integer term565334 = new Integer(-1364161498);
        Integer term565336 = new Integer(-1602874517);
        Integer term565338 = new Integer(522533128);
        Integer term565340 = new Integer(2076616628);
        Integer term565342 = new Integer(-138960474);
        Integer term565344 = new Integer(541109635);
        Integer term565346 = new Integer(-1533186568);
        ArrayList term565332 = new ArrayList();
        ((ArrayList) term565332).add(term565334);
        ((ArrayList) term565332).add(term565336);
        ((ArrayList) term565332).add(term565338);
        ((ArrayList) term565332).add(term565340);
        ((ArrayList) term565332).add(term565342);
        ((ArrayList) term565332).add(term565344);
        ((ArrayList) term565332).add(term565346);
        term564975 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term564977 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term564979 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term564995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term564996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term565000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term565005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term565006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term565010 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term564975, term564975.getClass(), "id", 4289081996114750969L);
        setLongField(term564977, term564977.getClass(), "id", -7572050122581396527L);
        setLongField(term564979, term564979.getClass(), "id", -149743813598331340L);
        setField(term564979, term564979.getClass(), "extId", term564981);
        setField(term564979, term564979.getClass(), "luid", "UxaAGtRgCD");
        setIntField(term564996, term564996.getClass(), "year", 2016);
        setShortField(term564996, term564996.getClass(), "month", (short) 3);
        setShortField(term564996, term564996.getClass(), "day", (short) 14);
        setField(term564995, term564995.getClass(), "date", term564996);
        setByteField(term565000, term565000.getClass(), "hour", (byte) 18);
        setByteField(term565000, term565000.getClass(), "minute", (byte) 35);
        setByteField(term565000, term565000.getClass(), "second", (byte) 21);
        setIntField(term565000, term565000.getClass(), "nano", 363249410);
        setField(term564995, term564995.getClass(), "time", term565000);
        setField(term564979, term564979.getClass(), "registerTime", term564995);
        setIntField(term565006, term565006.getClass(), "year", 2024);
        setShortField(term565006, term565006.getClass(), "month", (short) 4);
        setShortField(term565006, term565006.getClass(), "day", (short) 10);
        setField(term565005, term565005.getClass(), "date", term565006);
        setByteField(term565010, term565010.getClass(), "hour", (byte) 0);
        setByteField(term565010, term565010.getClass(), "minute", (byte) 37);
        setByteField(term565010, term565010.getClass(), "second", (byte) 26);
        setIntField(term565010, term565010.getClass(), "nano", 518241770);
        setField(term565005, term565005.getClass(), "time", term565010);
        setField(term564979, term564979.getClass(), "accessTime", term565005);
        setField(term564977, term564977.getClass(), "card", term564979);
        setField(term564977, term564977.getClass(), "userName", "pRckFaBOim");
        setIntField(term564977, term564977.getClass(), "isNetMember", -911711857);
        setIntField(term564977, term564977.getClass(), "iconId", -795006056);
        setIntField(term564977, term564977.getClass(), "plateId", -963432533);
        setIntField(term564977, term564977.getClass(), "titleId", 1192682371);
        setIntField(term564977, term564977.getClass(), "partnerId", 674817553);
        setIntField(term564977, term564977.getClass(), "frameId", 1632125518);
        setIntField(term564977, term564977.getClass(), "selectMapId", 2056069446);
        setIntField(term564977, term564977.getClass(), "totalAwake", 549744954);
        setIntField(term564977, term564977.getClass(), "gradeRating", 308751573);
        setIntField(term564977, term564977.getClass(), "musicRating", 591404319);
        setIntField(term564977, term564977.getClass(), "playerRating", -1605835695);
        setIntField(term564977, term564977.getClass(), "highestRating", -978961960);
        setIntField(term564977, term564977.getClass(), "gradeRank", -1378415294);
        setIntField(term564977, term564977.getClass(), "classRank", 740988654);
        setIntField(term564977, term564977.getClass(), "courseRank", 2016764573);
        setField(term564977, term564977.getClass(), "charaSlot", term565042);
        setField(term564977, term564977.getClass(), "charaLockSlot", term565052);
        setLongField(term564977, term564977.getClass(), "contentBit", 3400595075181226951L);
        setIntField(term564977, term564977.getClass(), "playCount", -662481673);
        setField(term564977, term564977.getClass(), "eventWatchedDate", "FHGHhRcJFU");
        setField(term564977, term564977.getClass(), "lastGameId", "YqEClxjfHz");
        setField(term564977, term564977.getClass(), "lastRomVersion", "yMGLPPbHtN");
        setField(term564977, term564977.getClass(), "lastDataVersion", "RYYdNlkdHb");
        setField(term564977, term564977.getClass(), "lastLoginDate", "gukWKZaVts");
        setField(term564977, term564977.getClass(), "lastPlayDate", "zaKhCPPVqb");
        setIntField(term564977, term564977.getClass(), "lastPlayCredit", 1393958588);
        setIntField(term564977, term564977.getClass(), "lastPlayMode", 1035725442);
        setIntField(term564977, term564977.getClass(), "lastPlaceId", -1581703438);
        setField(term564977, term564977.getClass(), "lastPlaceName", "lKdCqDKRZY");
        setIntField(term564977, term564977.getClass(), "lastAllNetId", -1384171381);
        setIntField(term564977, term564977.getClass(), "lastRegionId", 2073121832);
        setField(term564977, term564977.getClass(), "lastRegionName", "RnuuMQmAar");
        setField(term564977, term564977.getClass(), "lastClientId", "HpjrImBwxV");
        setField(term564977, term564977.getClass(), "lastCountryCode", "YouPGxynTk");
        setIntField(term564977, term564977.getClass(), "lastSelectEMoney", -1766686270);
        setIntField(term564977, term564977.getClass(), "lastSelectTicket", 1854023218);
        setIntField(term564977, term564977.getClass(), "lastSelectCourse", 452574517);
        setIntField(term564977, term564977.getClass(), "lastCountCourse", -901100624);
        setField(term564977, term564977.getClass(), "firstGameId", "CojZYdwcwt");
        setField(term564977, term564977.getClass(), "firstRomVersion", "gfqiYmmXUT");
        setField(term564977, term564977.getClass(), "firstDataVersion", "whoEHGLUhh");
        setField(term564977, term564977.getClass(), "firstPlayDate", "WVdfjzeThF");
        setField(term564977, term564977.getClass(), "compatibleCmVersion", "MSAeSWLpvE");
        setField(term564977, term564977.getClass(), "dailyBonusDate", "ymVNlgISof");
        setField(term564977, term564977.getClass(), "dailyCourseBonusDate", "PAInRrlXjv");
        setField(term564977, term564977.getClass(), "lastPairLoginDate", "RQLSTfypam");
        setField(term564977, term564977.getClass(), "lastTrialPlayDate", "jRwUACtzxu");
        setIntField(term564977, term564977.getClass(), "playVsCount", 241435679);
        setIntField(term564977, term564977.getClass(), "playSyncCount", 1132555965);
        setIntField(term564977, term564977.getClass(), "winCount", 1148883929);
        setIntField(term564977, term564977.getClass(), "helpCount", -1171564861);
        setIntField(term564977, term564977.getClass(), "comboCount", -1452779440);
        setLongField(term564977, term564977.getClass(), "totalDeluxscore", 3094712555339478074L);
        setLongField(term564977, term564977.getClass(), "totalBasicDeluxscore", -7179018677690733035L);
        setLongField(term564977, term564977.getClass(), "totalAdvancedDeluxscore", 3897052507349541366L);
        setLongField(term564977, term564977.getClass(), "totalExpertDeluxscore", 2127942897446893533L);
        setLongField(term564977, term564977.getClass(), "totalMasterDeluxscore", 6538718818152873837L);
        setLongField(term564977, term564977.getClass(), "totalReMasterDeluxscore", 3727480423622771288L);
        setIntField(term564977, term564977.getClass(), "totalSync", 858933783);
        setIntField(term564977, term564977.getClass(), "totalBasicSync", 1986396269);
        setIntField(term564977, term564977.getClass(), "totalAdvancedSync", -1656390049);
        setIntField(term564977, term564977.getClass(), "totalExpertSync", -444166843);
        setIntField(term564977, term564977.getClass(), "totalMasterSync", -2085303096);
        setIntField(term564977, term564977.getClass(), "totalReMasterSync", 1992420884);
        setLongField(term564977, term564977.getClass(), "totalAchievement", 1493279400077969479L);
        setLongField(term564977, term564977.getClass(), "totalBasicAchievement", -1452540883918977539L);
        setLongField(term564977, term564977.getClass(), "totalAdvancedAchievement", -2567987307320939122L);
        setLongField(term564977, term564977.getClass(), "totalExpertAchievement", 2765721070408059867L);
        setLongField(term564977, term564977.getClass(), "totalMasterAchievement", 9115627740206358452L);
        setLongField(term564977, term564977.getClass(), "totalReMasterAchievement", 3940622137543323978L);
        setLongField(term564977, term564977.getClass(), "playerOldRating", 4497978961812813018L);
        setLongField(term564977, term564977.getClass(), "playerNewRating", -3019312741531614782L);
        setIntField(term564977, term564977.getClass(), "banState", -348911726);
        setLongField(term564977, term564977.getClass(), "dateTime", 720184543030390607L);
        setField(term564975, term564975.getClass(), "user", term564977);
        setLongField(term564975, term564975.getClass(), "favUserId", -4671651826568393974L);
        setIntField(term564975, term564975.getClass(), "itemKind", 617799253);
        setField(term564975, term564975.getClass(), "itemIdList", term565332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFavUserId", argTypes, term564975, args);
    }

};


