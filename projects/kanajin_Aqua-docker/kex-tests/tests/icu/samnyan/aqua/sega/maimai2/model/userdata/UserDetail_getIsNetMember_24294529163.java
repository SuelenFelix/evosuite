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

public class UserDetail_getIsNetMember_24294529163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4320499;

    public UserDetail_getIsNetMember_24294529163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4320499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term4320499, term4320499.getClass(), "id", 0L);
        setField(term4320499, term4320499.getClass(), "card", null);
        setField(term4320499, term4320499.getClass(), "userName", null);
        setIntField(term4320499, term4320499.getClass(), "isNetMember", 0);
        setIntField(term4320499, term4320499.getClass(), "iconId", 0);
        setIntField(term4320499, term4320499.getClass(), "plateId", 0);
        setIntField(term4320499, term4320499.getClass(), "titleId", 0);
        setIntField(term4320499, term4320499.getClass(), "partnerId", 0);
        setIntField(term4320499, term4320499.getClass(), "frameId", 0);
        setIntField(term4320499, term4320499.getClass(), "selectMapId", 0);
        setIntField(term4320499, term4320499.getClass(), "totalAwake", 0);
        setIntField(term4320499, term4320499.getClass(), "gradeRating", 0);
        setIntField(term4320499, term4320499.getClass(), "musicRating", 0);
        setIntField(term4320499, term4320499.getClass(), "playerRating", 0);
        setIntField(term4320499, term4320499.getClass(), "highestRating", 0);
        setIntField(term4320499, term4320499.getClass(), "gradeRank", 0);
        setIntField(term4320499, term4320499.getClass(), "classRank", 0);
        setIntField(term4320499, term4320499.getClass(), "courseRank", 0);
        setField(term4320499, term4320499.getClass(), "charaSlot", null);
        setField(term4320499, term4320499.getClass(), "charaLockSlot", null);
        setLongField(term4320499, term4320499.getClass(), "contentBit", 0L);
        setIntField(term4320499, term4320499.getClass(), "playCount", 0);
        setField(term4320499, term4320499.getClass(), "eventWatchedDate", null);
        setField(term4320499, term4320499.getClass(), "lastGameId", null);
        setField(term4320499, term4320499.getClass(), "lastRomVersion", null);
        setField(term4320499, term4320499.getClass(), "lastDataVersion", null);
        setField(term4320499, term4320499.getClass(), "lastLoginDate", null);
        setField(term4320499, term4320499.getClass(), "lastPlayDate", null);
        setIntField(term4320499, term4320499.getClass(), "lastPlayCredit", 0);
        setIntField(term4320499, term4320499.getClass(), "lastPlayMode", 0);
        setIntField(term4320499, term4320499.getClass(), "lastPlaceId", 0);
        setField(term4320499, term4320499.getClass(), "lastPlaceName", null);
        setIntField(term4320499, term4320499.getClass(), "lastAllNetId", 0);
        setIntField(term4320499, term4320499.getClass(), "lastRegionId", 0);
        setField(term4320499, term4320499.getClass(), "lastRegionName", null);
        setField(term4320499, term4320499.getClass(), "lastClientId", null);
        setField(term4320499, term4320499.getClass(), "lastCountryCode", null);
        setIntField(term4320499, term4320499.getClass(), "lastSelectEMoney", 0);
        setIntField(term4320499, term4320499.getClass(), "lastSelectTicket", 0);
        setIntField(term4320499, term4320499.getClass(), "lastSelectCourse", 0);
        setIntField(term4320499, term4320499.getClass(), "lastCountCourse", 0);
        setField(term4320499, term4320499.getClass(), "firstGameId", null);
        setField(term4320499, term4320499.getClass(), "firstRomVersion", null);
        setField(term4320499, term4320499.getClass(), "firstDataVersion", null);
        setField(term4320499, term4320499.getClass(), "firstPlayDate", null);
        setField(term4320499, term4320499.getClass(), "compatibleCmVersion", null);
        setField(term4320499, term4320499.getClass(), "dailyBonusDate", null);
        setField(term4320499, term4320499.getClass(), "dailyCourseBonusDate", null);
        setField(term4320499, term4320499.getClass(), "lastPairLoginDate", null);
        setField(term4320499, term4320499.getClass(), "lastTrialPlayDate", null);
        setIntField(term4320499, term4320499.getClass(), "playVsCount", 0);
        setIntField(term4320499, term4320499.getClass(), "playSyncCount", 0);
        setIntField(term4320499, term4320499.getClass(), "winCount", 0);
        setIntField(term4320499, term4320499.getClass(), "helpCount", 0);
        setIntField(term4320499, term4320499.getClass(), "comboCount", 0);
        setLongField(term4320499, term4320499.getClass(), "totalDeluxscore", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term4320499, term4320499.getClass(), "totalSync", 0);
        setIntField(term4320499, term4320499.getClass(), "totalBasicSync", 0);
        setIntField(term4320499, term4320499.getClass(), "totalAdvancedSync", 0);
        setIntField(term4320499, term4320499.getClass(), "totalExpertSync", 0);
        setIntField(term4320499, term4320499.getClass(), "totalMasterSync", 0);
        setIntField(term4320499, term4320499.getClass(), "totalReMasterSync", 0);
        setLongField(term4320499, term4320499.getClass(), "totalAchievement", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalBasicAchievement", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalExpertAchievement", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalMasterAchievement", 0L);
        setLongField(term4320499, term4320499.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term4320499, term4320499.getClass(), "playerOldRating", 0L);
        setLongField(term4320499, term4320499.getClass(), "playerNewRating", 0L);
        setIntField(term4320499, term4320499.getClass(), "banState", 0);
        setLongField(term4320499, term4320499.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNetMember", argTypes, term4320499, args);
    }

};


