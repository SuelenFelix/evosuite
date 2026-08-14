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

public class UserDetail_getTotalBasicDeluxscore_35498490856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227290;

    public UserDetail_getTotalBasicDeluxscore_35498490856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term227294 = new Long(-2828343143039517941L);
        Integer term227357 = new Integer(696829611);
        Integer term227359 = new Integer(1751983051);
        ArrayList term227355 = new ArrayList();
        ((ArrayList) term227355).add(term227357);
        ((ArrayList) term227355).add(term227359);
        ArrayList term227363 = new ArrayList();
        term227290 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term227292 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term227308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term227313 = newInstance(Class.forName("java.time.LocalTime"));
        Object term227318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term227323 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term227290, term227290.getClass(), "id", 9185310332814987599L);
        setLongField(term227292, term227292.getClass(), "id", -4736884397729166623L);
        setField(term227292, term227292.getClass(), "extId", term227294);
        setField(term227292, term227292.getClass(), "luid", "lyrSJRdQbw");
        setIntField(term227309, term227309.getClass(), "year", 2014);
        setShortField(term227309, term227309.getClass(), "month", (short) 6);
        setShortField(term227309, term227309.getClass(), "day", (short) 5);
        setField(term227308, term227308.getClass(), "date", term227309);
        setByteField(term227313, term227313.getClass(), "hour", (byte) 0);
        setByteField(term227313, term227313.getClass(), "minute", (byte) 4);
        setByteField(term227313, term227313.getClass(), "second", (byte) 17);
        setIntField(term227313, term227313.getClass(), "nano", 755508342);
        setField(term227308, term227308.getClass(), "time", term227313);
        setField(term227292, term227292.getClass(), "registerTime", term227308);
        setIntField(term227319, term227319.getClass(), "year", 2021);
        setShortField(term227319, term227319.getClass(), "month", (short) 4);
        setShortField(term227319, term227319.getClass(), "day", (short) 25);
        setField(term227318, term227318.getClass(), "date", term227319);
        setByteField(term227323, term227323.getClass(), "hour", (byte) 8);
        setByteField(term227323, term227323.getClass(), "minute", (byte) 14);
        setByteField(term227323, term227323.getClass(), "second", (byte) 16);
        setIntField(term227323, term227323.getClass(), "nano", 794729004);
        setField(term227318, term227318.getClass(), "time", term227323);
        setField(term227292, term227292.getClass(), "accessTime", term227318);
        setField(term227290, term227290.getClass(), "card", term227292);
        setField(term227290, term227290.getClass(), "userName", "PVBjmhwdMr");
        setIntField(term227290, term227290.getClass(), "isNetMember", 1751137479);
        setIntField(term227290, term227290.getClass(), "iconId", -1425278453);
        setIntField(term227290, term227290.getClass(), "plateId", 1791235863);
        setIntField(term227290, term227290.getClass(), "titleId", 889880081);
        setIntField(term227290, term227290.getClass(), "partnerId", 711666564);
        setIntField(term227290, term227290.getClass(), "frameId", -1568954017);
        setIntField(term227290, term227290.getClass(), "selectMapId", 1183123217);
        setIntField(term227290, term227290.getClass(), "totalAwake", -106074389);
        setIntField(term227290, term227290.getClass(), "gradeRating", 1750571132);
        setIntField(term227290, term227290.getClass(), "musicRating", 590753141);
        setIntField(term227290, term227290.getClass(), "playerRating", 750364664);
        setIntField(term227290, term227290.getClass(), "highestRating", -762712240);
        setIntField(term227290, term227290.getClass(), "gradeRank", 437727883);
        setIntField(term227290, term227290.getClass(), "classRank", 362508069);
        setIntField(term227290, term227290.getClass(), "courseRank", 1363722184);
        setField(term227290, term227290.getClass(), "charaSlot", term227355);
        setField(term227290, term227290.getClass(), "charaLockSlot", term227363);
        setLongField(term227290, term227290.getClass(), "contentBit", -3609033843305859408L);
        setIntField(term227290, term227290.getClass(), "playCount", -35490007);
        setField(term227290, term227290.getClass(), "eventWatchedDate", "TURoCylnmF");
        setField(term227290, term227290.getClass(), "lastGameId", "OqAYoPyLDR");
        setField(term227290, term227290.getClass(), "lastRomVersion", "WeWWdLzBLg");
        setField(term227290, term227290.getClass(), "lastDataVersion", "bFRkUYAxoi");
        setField(term227290, term227290.getClass(), "lastLoginDate", "ibOCzSlAfB");
        setField(term227290, term227290.getClass(), "lastPlayDate", "FVWEzQNAbm");
        setIntField(term227290, term227290.getClass(), "lastPlayCredit", -283472712);
        setIntField(term227290, term227290.getClass(), "lastPlayMode", 2086485920);
        setIntField(term227290, term227290.getClass(), "lastPlaceId", -844733146);
        setField(term227290, term227290.getClass(), "lastPlaceName", "otxUlpZpcf");
        setIntField(term227290, term227290.getClass(), "lastAllNetId", 844968617);
        setIntField(term227290, term227290.getClass(), "lastRegionId", 1715915962);
        setField(term227290, term227290.getClass(), "lastRegionName", "QjEwBIXDUi");
        setField(term227290, term227290.getClass(), "lastClientId", "mIyJMumZKG");
        setField(term227290, term227290.getClass(), "lastCountryCode", "QvobVEStXg");
        setIntField(term227290, term227290.getClass(), "lastSelectEMoney", -1131069791);
        setIntField(term227290, term227290.getClass(), "lastSelectTicket", 1323940733);
        setIntField(term227290, term227290.getClass(), "lastSelectCourse", -293767776);
        setIntField(term227290, term227290.getClass(), "lastCountCourse", -340181571);
        setField(term227290, term227290.getClass(), "firstGameId", "RPfKIhBpQv");
        setField(term227290, term227290.getClass(), "firstRomVersion", "jQpmHIcJfG");
        setField(term227290, term227290.getClass(), "firstDataVersion", "CtygGfxssv");
        setField(term227290, term227290.getClass(), "firstPlayDate", "vkVKjCrolQ");
        setField(term227290, term227290.getClass(), "compatibleCmVersion", "BrcErlTKix");
        setField(term227290, term227290.getClass(), "dailyBonusDate", "RTrlkZrszR");
        setField(term227290, term227290.getClass(), "dailyCourseBonusDate", "LwEVtHWUbm");
        setField(term227290, term227290.getClass(), "lastPairLoginDate", "CprHpAIkGr");
        setField(term227290, term227290.getClass(), "lastTrialPlayDate", "xdyDUmqjTv");
        setIntField(term227290, term227290.getClass(), "playVsCount", 1150709730);
        setIntField(term227290, term227290.getClass(), "playSyncCount", -935342742);
        setIntField(term227290, term227290.getClass(), "winCount", -1343188975);
        setIntField(term227290, term227290.getClass(), "helpCount", -1142240411);
        setIntField(term227290, term227290.getClass(), "comboCount", 37630929);
        setLongField(term227290, term227290.getClass(), "totalDeluxscore", 7683219852267031953L);
        setLongField(term227290, term227290.getClass(), "totalBasicDeluxscore", 5436897249263218091L);
        setLongField(term227290, term227290.getClass(), "totalAdvancedDeluxscore", 8349674341135166190L);
        setLongField(term227290, term227290.getClass(), "totalExpertDeluxscore", 2449024892212706402L);
        setLongField(term227290, term227290.getClass(), "totalMasterDeluxscore", 3977735853853030523L);
        setLongField(term227290, term227290.getClass(), "totalReMasterDeluxscore", -7540555705838845232L);
        setIntField(term227290, term227290.getClass(), "totalSync", -255383207);
        setIntField(term227290, term227290.getClass(), "totalBasicSync", 2012928001);
        setIntField(term227290, term227290.getClass(), "totalAdvancedSync", 610380050);
        setIntField(term227290, term227290.getClass(), "totalExpertSync", -1248880765);
        setIntField(term227290, term227290.getClass(), "totalMasterSync", 1182147696);
        setIntField(term227290, term227290.getClass(), "totalReMasterSync", 1238039697);
        setLongField(term227290, term227290.getClass(), "totalAchievement", -6985725007546263573L);
        setLongField(term227290, term227290.getClass(), "totalBasicAchievement", -1650621820741347317L);
        setLongField(term227290, term227290.getClass(), "totalAdvancedAchievement", 461946014443413513L);
        setLongField(term227290, term227290.getClass(), "totalExpertAchievement", 2569080328178972616L);
        setLongField(term227290, term227290.getClass(), "totalMasterAchievement", -615536300700028969L);
        setLongField(term227290, term227290.getClass(), "totalReMasterAchievement", 370944316023964708L);
        setLongField(term227290, term227290.getClass(), "playerOldRating", 3500779314636148730L);
        setLongField(term227290, term227290.getClass(), "playerNewRating", -3742975059358998623L);
        setIntField(term227290, term227290.getClass(), "banState", 406825318);
        setLongField(term227290, term227290.getClass(), "dateTime", 5903804105618179668L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicDeluxscore", argTypes, term227290, args);
    }

};


