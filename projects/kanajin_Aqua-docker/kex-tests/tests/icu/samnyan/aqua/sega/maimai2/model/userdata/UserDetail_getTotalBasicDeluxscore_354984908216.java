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

public class UserDetail_getTotalBasicDeluxscore_354984908216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289241;

    public UserDetail_getTotalBasicDeluxscore_354984908216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289241 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289241, term289241.getClass(), "id", 0L);
        setField(term289241, term289241.getClass(), "card", null);
        setField(term289241, term289241.getClass(), "userName", null);
        setIntField(term289241, term289241.getClass(), "isNetMember", 0);
        setIntField(term289241, term289241.getClass(), "iconId", 0);
        setIntField(term289241, term289241.getClass(), "plateId", 0);
        setIntField(term289241, term289241.getClass(), "titleId", 0);
        setIntField(term289241, term289241.getClass(), "partnerId", 0);
        setIntField(term289241, term289241.getClass(), "frameId", 0);
        setIntField(term289241, term289241.getClass(), "selectMapId", 0);
        setIntField(term289241, term289241.getClass(), "totalAwake", 0);
        setIntField(term289241, term289241.getClass(), "gradeRating", 0);
        setIntField(term289241, term289241.getClass(), "musicRating", 0);
        setIntField(term289241, term289241.getClass(), "playerRating", 0);
        setIntField(term289241, term289241.getClass(), "highestRating", 0);
        setIntField(term289241, term289241.getClass(), "gradeRank", 0);
        setIntField(term289241, term289241.getClass(), "classRank", 0);
        setIntField(term289241, term289241.getClass(), "courseRank", 0);
        setField(term289241, term289241.getClass(), "charaSlot", null);
        setField(term289241, term289241.getClass(), "charaLockSlot", null);
        setLongField(term289241, term289241.getClass(), "contentBit", 0L);
        setIntField(term289241, term289241.getClass(), "playCount", 0);
        setField(term289241, term289241.getClass(), "eventWatchedDate", null);
        setField(term289241, term289241.getClass(), "lastGameId", null);
        setField(term289241, term289241.getClass(), "lastRomVersion", null);
        setField(term289241, term289241.getClass(), "lastDataVersion", null);
        setField(term289241, term289241.getClass(), "lastLoginDate", null);
        setField(term289241, term289241.getClass(), "lastPlayDate", null);
        setIntField(term289241, term289241.getClass(), "lastPlayCredit", 0);
        setIntField(term289241, term289241.getClass(), "lastPlayMode", 0);
        setIntField(term289241, term289241.getClass(), "lastPlaceId", 0);
        setField(term289241, term289241.getClass(), "lastPlaceName", null);
        setIntField(term289241, term289241.getClass(), "lastAllNetId", 0);
        setIntField(term289241, term289241.getClass(), "lastRegionId", 0);
        setField(term289241, term289241.getClass(), "lastRegionName", null);
        setField(term289241, term289241.getClass(), "lastClientId", null);
        setField(term289241, term289241.getClass(), "lastCountryCode", null);
        setIntField(term289241, term289241.getClass(), "lastSelectEMoney", 0);
        setIntField(term289241, term289241.getClass(), "lastSelectTicket", 0);
        setIntField(term289241, term289241.getClass(), "lastSelectCourse", 0);
        setIntField(term289241, term289241.getClass(), "lastCountCourse", 0);
        setField(term289241, term289241.getClass(), "firstGameId", null);
        setField(term289241, term289241.getClass(), "firstRomVersion", null);
        setField(term289241, term289241.getClass(), "firstDataVersion", null);
        setField(term289241, term289241.getClass(), "firstPlayDate", null);
        setField(term289241, term289241.getClass(), "compatibleCmVersion", null);
        setField(term289241, term289241.getClass(), "dailyBonusDate", null);
        setField(term289241, term289241.getClass(), "dailyCourseBonusDate", null);
        setField(term289241, term289241.getClass(), "lastPairLoginDate", null);
        setField(term289241, term289241.getClass(), "lastTrialPlayDate", null);
        setIntField(term289241, term289241.getClass(), "playVsCount", 0);
        setIntField(term289241, term289241.getClass(), "playSyncCount", 0);
        setIntField(term289241, term289241.getClass(), "winCount", 0);
        setIntField(term289241, term289241.getClass(), "helpCount", 0);
        setIntField(term289241, term289241.getClass(), "comboCount", 0);
        setLongField(term289241, term289241.getClass(), "totalDeluxscore", 0L);
        setLongField(term289241, term289241.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289241, term289241.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289241, term289241.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289241, term289241.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289241, term289241.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289241, term289241.getClass(), "totalSync", 0);
        setIntField(term289241, term289241.getClass(), "totalBasicSync", 0);
        setIntField(term289241, term289241.getClass(), "totalAdvancedSync", 0);
        setIntField(term289241, term289241.getClass(), "totalExpertSync", 0);
        setIntField(term289241, term289241.getClass(), "totalMasterSync", 0);
        setIntField(term289241, term289241.getClass(), "totalReMasterSync", 0);
        setLongField(term289241, term289241.getClass(), "totalAchievement", 0L);
        setLongField(term289241, term289241.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289241, term289241.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289241, term289241.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289241, term289241.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289241, term289241.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289241, term289241.getClass(), "playerOldRating", 0L);
        setLongField(term289241, term289241.getClass(), "playerNewRating", 0L);
        setIntField(term289241, term289241.getClass(), "banState", 0);
        setLongField(term289241, term289241.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicDeluxscore", argTypes, term289241, args);
    }

};


