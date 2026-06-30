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

public class UserDetail_getTotalBasicDeluxscore_35498490857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227345;

    public UserDetail_getTotalBasicDeluxscore_35498490857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term227349 = new Long(-2828343143039517941L);
        Integer term227412 = new Integer(696829611);
        Integer term227414 = new Integer(1751983051);
        ArrayList term227410 = new ArrayList();
        ((ArrayList) term227410).add(term227412);
        ((ArrayList) term227410).add(term227414);
        ArrayList term227418 = new ArrayList();
        term227345 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term227347 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term227363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term227368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term227373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term227378 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term227345, term227345.getClass(), "id", 9185310332814987599L);
        setLongField(term227347, term227347.getClass(), "id", -4736884397729166623L);
        setField(term227347, term227347.getClass(), "extId", term227349);
        setField(term227347, term227347.getClass(), "luid", "lyrSJRdQbw");
        setIntField(term227364, term227364.getClass(), "year", 2014);
        setShortField(term227364, term227364.getClass(), "month", (short) 6);
        setShortField(term227364, term227364.getClass(), "day", (short) 5);
        setField(term227363, term227363.getClass(), "date", term227364);
        setByteField(term227368, term227368.getClass(), "hour", (byte) 0);
        setByteField(term227368, term227368.getClass(), "minute", (byte) 4);
        setByteField(term227368, term227368.getClass(), "second", (byte) 17);
        setIntField(term227368, term227368.getClass(), "nano", 755508342);
        setField(term227363, term227363.getClass(), "time", term227368);
        setField(term227347, term227347.getClass(), "registerTime", term227363);
        setIntField(term227374, term227374.getClass(), "year", 2021);
        setShortField(term227374, term227374.getClass(), "month", (short) 4);
        setShortField(term227374, term227374.getClass(), "day", (short) 25);
        setField(term227373, term227373.getClass(), "date", term227374);
        setByteField(term227378, term227378.getClass(), "hour", (byte) 8);
        setByteField(term227378, term227378.getClass(), "minute", (byte) 14);
        setByteField(term227378, term227378.getClass(), "second", (byte) 16);
        setIntField(term227378, term227378.getClass(), "nano", 794729004);
        setField(term227373, term227373.getClass(), "time", term227378);
        setField(term227347, term227347.getClass(), "accessTime", term227373);
        setField(term227345, term227345.getClass(), "card", term227347);
        setField(term227345, term227345.getClass(), "userName", "PVBjmhwdMr");
        setIntField(term227345, term227345.getClass(), "isNetMember", 1751137479);
        setIntField(term227345, term227345.getClass(), "iconId", -1425278453);
        setIntField(term227345, term227345.getClass(), "plateId", 1791235863);
        setIntField(term227345, term227345.getClass(), "titleId", 889880081);
        setIntField(term227345, term227345.getClass(), "partnerId", 711666564);
        setIntField(term227345, term227345.getClass(), "frameId", -1568954017);
        setIntField(term227345, term227345.getClass(), "selectMapId", 1183123217);
        setIntField(term227345, term227345.getClass(), "totalAwake", -106074389);
        setIntField(term227345, term227345.getClass(), "gradeRating", 1750571132);
        setIntField(term227345, term227345.getClass(), "musicRating", 590753141);
        setIntField(term227345, term227345.getClass(), "playerRating", 750364664);
        setIntField(term227345, term227345.getClass(), "highestRating", -762712240);
        setIntField(term227345, term227345.getClass(), "gradeRank", 437727883);
        setIntField(term227345, term227345.getClass(), "classRank", 362508069);
        setIntField(term227345, term227345.getClass(), "courseRank", 1363722184);
        setField(term227345, term227345.getClass(), "charaSlot", term227410);
        setField(term227345, term227345.getClass(), "charaLockSlot", term227418);
        setLongField(term227345, term227345.getClass(), "contentBit", -3609033843305859408L);
        setIntField(term227345, term227345.getClass(), "playCount", -35490007);
        setField(term227345, term227345.getClass(), "eventWatchedDate", "TURoCylnmF");
        setField(term227345, term227345.getClass(), "lastGameId", "OqAYoPyLDR");
        setField(term227345, term227345.getClass(), "lastRomVersion", "WeWWdLzBLg");
        setField(term227345, term227345.getClass(), "lastDataVersion", "bFRkUYAxoi");
        setField(term227345, term227345.getClass(), "lastLoginDate", "ibOCzSlAfB");
        setField(term227345, term227345.getClass(), "lastPlayDate", "FVWEzQNAbm");
        setIntField(term227345, term227345.getClass(), "lastPlayCredit", -283472712);
        setIntField(term227345, term227345.getClass(), "lastPlayMode", 2086485920);
        setIntField(term227345, term227345.getClass(), "lastPlaceId", -844733146);
        setField(term227345, term227345.getClass(), "lastPlaceName", "otxUlpZpcf");
        setIntField(term227345, term227345.getClass(), "lastAllNetId", 844968617);
        setIntField(term227345, term227345.getClass(), "lastRegionId", 1715915962);
        setField(term227345, term227345.getClass(), "lastRegionName", "QjEwBIXDUi");
        setField(term227345, term227345.getClass(), "lastClientId", "mIyJMumZKG");
        setField(term227345, term227345.getClass(), "lastCountryCode", "QvobVEStXg");
        setIntField(term227345, term227345.getClass(), "lastSelectEMoney", -1131069791);
        setIntField(term227345, term227345.getClass(), "lastSelectTicket", 1323940733);
        setIntField(term227345, term227345.getClass(), "lastSelectCourse", -293767776);
        setIntField(term227345, term227345.getClass(), "lastCountCourse", -340181571);
        setField(term227345, term227345.getClass(), "firstGameId", "RPfKIhBpQv");
        setField(term227345, term227345.getClass(), "firstRomVersion", "jQpmHIcJfG");
        setField(term227345, term227345.getClass(), "firstDataVersion", "CtygGfxssv");
        setField(term227345, term227345.getClass(), "firstPlayDate", "vkVKjCrolQ");
        setField(term227345, term227345.getClass(), "compatibleCmVersion", "BrcErlTKix");
        setField(term227345, term227345.getClass(), "dailyBonusDate", "RTrlkZrszR");
        setField(term227345, term227345.getClass(), "dailyCourseBonusDate", "LwEVtHWUbm");
        setField(term227345, term227345.getClass(), "lastPairLoginDate", "CprHpAIkGr");
        setField(term227345, term227345.getClass(), "lastTrialPlayDate", "xdyDUmqjTv");
        setIntField(term227345, term227345.getClass(), "playVsCount", 1150709730);
        setIntField(term227345, term227345.getClass(), "playSyncCount", -935342742);
        setIntField(term227345, term227345.getClass(), "winCount", -1343188975);
        setIntField(term227345, term227345.getClass(), "helpCount", -1142240411);
        setIntField(term227345, term227345.getClass(), "comboCount", 37630929);
        setLongField(term227345, term227345.getClass(), "totalDeluxscore", 7683219852267031953L);
        setLongField(term227345, term227345.getClass(), "totalBasicDeluxscore", 5436897249263218091L);
        setLongField(term227345, term227345.getClass(), "totalAdvancedDeluxscore", 8349674341135166190L);
        setLongField(term227345, term227345.getClass(), "totalExpertDeluxscore", 2449024892212706402L);
        setLongField(term227345, term227345.getClass(), "totalMasterDeluxscore", 3977735853853030523L);
        setLongField(term227345, term227345.getClass(), "totalReMasterDeluxscore", -7540555705838845232L);
        setIntField(term227345, term227345.getClass(), "totalSync", -255383207);
        setIntField(term227345, term227345.getClass(), "totalBasicSync", 2012928001);
        setIntField(term227345, term227345.getClass(), "totalAdvancedSync", 610380050);
        setIntField(term227345, term227345.getClass(), "totalExpertSync", -1248880765);
        setIntField(term227345, term227345.getClass(), "totalMasterSync", 1182147696);
        setIntField(term227345, term227345.getClass(), "totalReMasterSync", 1238039697);
        setLongField(term227345, term227345.getClass(), "totalAchievement", -6985725007546263573L);
        setLongField(term227345, term227345.getClass(), "totalBasicAchievement", -1650621820741347317L);
        setLongField(term227345, term227345.getClass(), "totalAdvancedAchievement", 461946014443413513L);
        setLongField(term227345, term227345.getClass(), "totalExpertAchievement", 2569080328178972616L);
        setLongField(term227345, term227345.getClass(), "totalMasterAchievement", -615536300700028969L);
        setLongField(term227345, term227345.getClass(), "totalReMasterAchievement", 370944316023964708L);
        setLongField(term227345, term227345.getClass(), "playerOldRating", 3500779314636148730L);
        setLongField(term227345, term227345.getClass(), "playerNewRating", -3742975059358998623L);
        setIntField(term227345, term227345.getClass(), "banState", 406825318);
        setLongField(term227345, term227345.getClass(), "dateTime", 5903804105618179668L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicDeluxscore", argTypes, term227345, args);
    }

};


