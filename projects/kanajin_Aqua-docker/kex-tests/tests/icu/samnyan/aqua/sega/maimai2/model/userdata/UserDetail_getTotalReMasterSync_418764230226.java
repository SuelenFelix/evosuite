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

public class UserDetail_getTotalReMasterSync_418764230226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289791;

    public UserDetail_getTotalReMasterSync_418764230226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289791 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289791, term289791.getClass(), "id", 0L);
        setField(term289791, term289791.getClass(), "card", null);
        setField(term289791, term289791.getClass(), "userName", null);
        setIntField(term289791, term289791.getClass(), "isNetMember", 0);
        setIntField(term289791, term289791.getClass(), "iconId", 0);
        setIntField(term289791, term289791.getClass(), "plateId", 0);
        setIntField(term289791, term289791.getClass(), "titleId", 0);
        setIntField(term289791, term289791.getClass(), "partnerId", 0);
        setIntField(term289791, term289791.getClass(), "frameId", 0);
        setIntField(term289791, term289791.getClass(), "selectMapId", 0);
        setIntField(term289791, term289791.getClass(), "totalAwake", 0);
        setIntField(term289791, term289791.getClass(), "gradeRating", 0);
        setIntField(term289791, term289791.getClass(), "musicRating", 0);
        setIntField(term289791, term289791.getClass(), "playerRating", 0);
        setIntField(term289791, term289791.getClass(), "highestRating", 0);
        setIntField(term289791, term289791.getClass(), "gradeRank", 0);
        setIntField(term289791, term289791.getClass(), "classRank", 0);
        setIntField(term289791, term289791.getClass(), "courseRank", 0);
        setField(term289791, term289791.getClass(), "charaSlot", null);
        setField(term289791, term289791.getClass(), "charaLockSlot", null);
        setLongField(term289791, term289791.getClass(), "contentBit", 0L);
        setIntField(term289791, term289791.getClass(), "playCount", 0);
        setField(term289791, term289791.getClass(), "eventWatchedDate", null);
        setField(term289791, term289791.getClass(), "lastGameId", null);
        setField(term289791, term289791.getClass(), "lastRomVersion", null);
        setField(term289791, term289791.getClass(), "lastDataVersion", null);
        setField(term289791, term289791.getClass(), "lastLoginDate", null);
        setField(term289791, term289791.getClass(), "lastPlayDate", null);
        setIntField(term289791, term289791.getClass(), "lastPlayCredit", 0);
        setIntField(term289791, term289791.getClass(), "lastPlayMode", 0);
        setIntField(term289791, term289791.getClass(), "lastPlaceId", 0);
        setField(term289791, term289791.getClass(), "lastPlaceName", null);
        setIntField(term289791, term289791.getClass(), "lastAllNetId", 0);
        setIntField(term289791, term289791.getClass(), "lastRegionId", 0);
        setField(term289791, term289791.getClass(), "lastRegionName", null);
        setField(term289791, term289791.getClass(), "lastClientId", null);
        setField(term289791, term289791.getClass(), "lastCountryCode", null);
        setIntField(term289791, term289791.getClass(), "lastSelectEMoney", 0);
        setIntField(term289791, term289791.getClass(), "lastSelectTicket", 0);
        setIntField(term289791, term289791.getClass(), "lastSelectCourse", 0);
        setIntField(term289791, term289791.getClass(), "lastCountCourse", 0);
        setField(term289791, term289791.getClass(), "firstGameId", null);
        setField(term289791, term289791.getClass(), "firstRomVersion", null);
        setField(term289791, term289791.getClass(), "firstDataVersion", null);
        setField(term289791, term289791.getClass(), "firstPlayDate", null);
        setField(term289791, term289791.getClass(), "compatibleCmVersion", null);
        setField(term289791, term289791.getClass(), "dailyBonusDate", null);
        setField(term289791, term289791.getClass(), "dailyCourseBonusDate", null);
        setField(term289791, term289791.getClass(), "lastPairLoginDate", null);
        setField(term289791, term289791.getClass(), "lastTrialPlayDate", null);
        setIntField(term289791, term289791.getClass(), "playVsCount", 0);
        setIntField(term289791, term289791.getClass(), "playSyncCount", 0);
        setIntField(term289791, term289791.getClass(), "winCount", 0);
        setIntField(term289791, term289791.getClass(), "helpCount", 0);
        setIntField(term289791, term289791.getClass(), "comboCount", 0);
        setLongField(term289791, term289791.getClass(), "totalDeluxscore", 0L);
        setLongField(term289791, term289791.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289791, term289791.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289791, term289791.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289791, term289791.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289791, term289791.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289791, term289791.getClass(), "totalSync", 0);
        setIntField(term289791, term289791.getClass(), "totalBasicSync", 0);
        setIntField(term289791, term289791.getClass(), "totalAdvancedSync", 0);
        setIntField(term289791, term289791.getClass(), "totalExpertSync", 0);
        setIntField(term289791, term289791.getClass(), "totalMasterSync", 0);
        setIntField(term289791, term289791.getClass(), "totalReMasterSync", 0);
        setLongField(term289791, term289791.getClass(), "totalAchievement", 0L);
        setLongField(term289791, term289791.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289791, term289791.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289791, term289791.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289791, term289791.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289791, term289791.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289791, term289791.getClass(), "playerOldRating", 0L);
        setLongField(term289791, term289791.getClass(), "playerNewRating", 0L);
        setIntField(term289791, term289791.getClass(), "banState", 0);
        setLongField(term289791, term289791.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterSync", argTypes, term289791, args);
    }

};


