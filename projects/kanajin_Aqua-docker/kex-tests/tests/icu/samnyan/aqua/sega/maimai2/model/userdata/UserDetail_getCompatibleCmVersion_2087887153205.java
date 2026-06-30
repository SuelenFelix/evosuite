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

public class UserDetail_getCompatibleCmVersion_2087887153205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288636;

    public UserDetail_getCompatibleCmVersion_2087887153205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288636 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288636, term288636.getClass(), "id", 0L);
        setField(term288636, term288636.getClass(), "card", null);
        setField(term288636, term288636.getClass(), "userName", null);
        setIntField(term288636, term288636.getClass(), "isNetMember", 0);
        setIntField(term288636, term288636.getClass(), "iconId", 0);
        setIntField(term288636, term288636.getClass(), "plateId", 0);
        setIntField(term288636, term288636.getClass(), "titleId", 0);
        setIntField(term288636, term288636.getClass(), "partnerId", 0);
        setIntField(term288636, term288636.getClass(), "frameId", 0);
        setIntField(term288636, term288636.getClass(), "selectMapId", 0);
        setIntField(term288636, term288636.getClass(), "totalAwake", 0);
        setIntField(term288636, term288636.getClass(), "gradeRating", 0);
        setIntField(term288636, term288636.getClass(), "musicRating", 0);
        setIntField(term288636, term288636.getClass(), "playerRating", 0);
        setIntField(term288636, term288636.getClass(), "highestRating", 0);
        setIntField(term288636, term288636.getClass(), "gradeRank", 0);
        setIntField(term288636, term288636.getClass(), "classRank", 0);
        setIntField(term288636, term288636.getClass(), "courseRank", 0);
        setField(term288636, term288636.getClass(), "charaSlot", null);
        setField(term288636, term288636.getClass(), "charaLockSlot", null);
        setLongField(term288636, term288636.getClass(), "contentBit", 0L);
        setIntField(term288636, term288636.getClass(), "playCount", 0);
        setField(term288636, term288636.getClass(), "eventWatchedDate", null);
        setField(term288636, term288636.getClass(), "lastGameId", null);
        setField(term288636, term288636.getClass(), "lastRomVersion", null);
        setField(term288636, term288636.getClass(), "lastDataVersion", null);
        setField(term288636, term288636.getClass(), "lastLoginDate", null);
        setField(term288636, term288636.getClass(), "lastPlayDate", null);
        setIntField(term288636, term288636.getClass(), "lastPlayCredit", 0);
        setIntField(term288636, term288636.getClass(), "lastPlayMode", 0);
        setIntField(term288636, term288636.getClass(), "lastPlaceId", 0);
        setField(term288636, term288636.getClass(), "lastPlaceName", null);
        setIntField(term288636, term288636.getClass(), "lastAllNetId", 0);
        setIntField(term288636, term288636.getClass(), "lastRegionId", 0);
        setField(term288636, term288636.getClass(), "lastRegionName", null);
        setField(term288636, term288636.getClass(), "lastClientId", null);
        setField(term288636, term288636.getClass(), "lastCountryCode", null);
        setIntField(term288636, term288636.getClass(), "lastSelectEMoney", 0);
        setIntField(term288636, term288636.getClass(), "lastSelectTicket", 0);
        setIntField(term288636, term288636.getClass(), "lastSelectCourse", 0);
        setIntField(term288636, term288636.getClass(), "lastCountCourse", 0);
        setField(term288636, term288636.getClass(), "firstGameId", null);
        setField(term288636, term288636.getClass(), "firstRomVersion", null);
        setField(term288636, term288636.getClass(), "firstDataVersion", null);
        setField(term288636, term288636.getClass(), "firstPlayDate", null);
        setField(term288636, term288636.getClass(), "compatibleCmVersion", null);
        setField(term288636, term288636.getClass(), "dailyBonusDate", null);
        setField(term288636, term288636.getClass(), "dailyCourseBonusDate", null);
        setField(term288636, term288636.getClass(), "lastPairLoginDate", null);
        setField(term288636, term288636.getClass(), "lastTrialPlayDate", null);
        setIntField(term288636, term288636.getClass(), "playVsCount", 0);
        setIntField(term288636, term288636.getClass(), "playSyncCount", 0);
        setIntField(term288636, term288636.getClass(), "winCount", 0);
        setIntField(term288636, term288636.getClass(), "helpCount", 0);
        setIntField(term288636, term288636.getClass(), "comboCount", 0);
        setLongField(term288636, term288636.getClass(), "totalDeluxscore", 0L);
        setLongField(term288636, term288636.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288636, term288636.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288636, term288636.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288636, term288636.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288636, term288636.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288636, term288636.getClass(), "totalSync", 0);
        setIntField(term288636, term288636.getClass(), "totalBasicSync", 0);
        setIntField(term288636, term288636.getClass(), "totalAdvancedSync", 0);
        setIntField(term288636, term288636.getClass(), "totalExpertSync", 0);
        setIntField(term288636, term288636.getClass(), "totalMasterSync", 0);
        setIntField(term288636, term288636.getClass(), "totalReMasterSync", 0);
        setLongField(term288636, term288636.getClass(), "totalAchievement", 0L);
        setLongField(term288636, term288636.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288636, term288636.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288636, term288636.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288636, term288636.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288636, term288636.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288636, term288636.getClass(), "playerOldRating", 0L);
        setLongField(term288636, term288636.getClass(), "playerNewRating", 0L);
        setIntField(term288636, term288636.getClass(), "banState", 0);
        setLongField(term288636, term288636.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompatibleCmVersion", argTypes, term288636, args);
    }

};


