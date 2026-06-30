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

public class UserDetail_getId_693379289161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286216;

    public UserDetail_getId_693379289161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286216 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286216, term286216.getClass(), "id", 0L);
        setField(term286216, term286216.getClass(), "card", null);
        setField(term286216, term286216.getClass(), "userName", null);
        setIntField(term286216, term286216.getClass(), "isNetMember", 0);
        setIntField(term286216, term286216.getClass(), "iconId", 0);
        setIntField(term286216, term286216.getClass(), "plateId", 0);
        setIntField(term286216, term286216.getClass(), "titleId", 0);
        setIntField(term286216, term286216.getClass(), "partnerId", 0);
        setIntField(term286216, term286216.getClass(), "frameId", 0);
        setIntField(term286216, term286216.getClass(), "selectMapId", 0);
        setIntField(term286216, term286216.getClass(), "totalAwake", 0);
        setIntField(term286216, term286216.getClass(), "gradeRating", 0);
        setIntField(term286216, term286216.getClass(), "musicRating", 0);
        setIntField(term286216, term286216.getClass(), "playerRating", 0);
        setIntField(term286216, term286216.getClass(), "highestRating", 0);
        setIntField(term286216, term286216.getClass(), "gradeRank", 0);
        setIntField(term286216, term286216.getClass(), "classRank", 0);
        setIntField(term286216, term286216.getClass(), "courseRank", 0);
        setField(term286216, term286216.getClass(), "charaSlot", null);
        setField(term286216, term286216.getClass(), "charaLockSlot", null);
        setLongField(term286216, term286216.getClass(), "contentBit", 0L);
        setIntField(term286216, term286216.getClass(), "playCount", 0);
        setField(term286216, term286216.getClass(), "eventWatchedDate", null);
        setField(term286216, term286216.getClass(), "lastGameId", null);
        setField(term286216, term286216.getClass(), "lastRomVersion", null);
        setField(term286216, term286216.getClass(), "lastDataVersion", null);
        setField(term286216, term286216.getClass(), "lastLoginDate", null);
        setField(term286216, term286216.getClass(), "lastPlayDate", null);
        setIntField(term286216, term286216.getClass(), "lastPlayCredit", 0);
        setIntField(term286216, term286216.getClass(), "lastPlayMode", 0);
        setIntField(term286216, term286216.getClass(), "lastPlaceId", 0);
        setField(term286216, term286216.getClass(), "lastPlaceName", null);
        setIntField(term286216, term286216.getClass(), "lastAllNetId", 0);
        setIntField(term286216, term286216.getClass(), "lastRegionId", 0);
        setField(term286216, term286216.getClass(), "lastRegionName", null);
        setField(term286216, term286216.getClass(), "lastClientId", null);
        setField(term286216, term286216.getClass(), "lastCountryCode", null);
        setIntField(term286216, term286216.getClass(), "lastSelectEMoney", 0);
        setIntField(term286216, term286216.getClass(), "lastSelectTicket", 0);
        setIntField(term286216, term286216.getClass(), "lastSelectCourse", 0);
        setIntField(term286216, term286216.getClass(), "lastCountCourse", 0);
        setField(term286216, term286216.getClass(), "firstGameId", null);
        setField(term286216, term286216.getClass(), "firstRomVersion", null);
        setField(term286216, term286216.getClass(), "firstDataVersion", null);
        setField(term286216, term286216.getClass(), "firstPlayDate", null);
        setField(term286216, term286216.getClass(), "compatibleCmVersion", null);
        setField(term286216, term286216.getClass(), "dailyBonusDate", null);
        setField(term286216, term286216.getClass(), "dailyCourseBonusDate", null);
        setField(term286216, term286216.getClass(), "lastPairLoginDate", null);
        setField(term286216, term286216.getClass(), "lastTrialPlayDate", null);
        setIntField(term286216, term286216.getClass(), "playVsCount", 0);
        setIntField(term286216, term286216.getClass(), "playSyncCount", 0);
        setIntField(term286216, term286216.getClass(), "winCount", 0);
        setIntField(term286216, term286216.getClass(), "helpCount", 0);
        setIntField(term286216, term286216.getClass(), "comboCount", 0);
        setLongField(term286216, term286216.getClass(), "totalDeluxscore", 0L);
        setLongField(term286216, term286216.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286216, term286216.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286216, term286216.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286216, term286216.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286216, term286216.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286216, term286216.getClass(), "totalSync", 0);
        setIntField(term286216, term286216.getClass(), "totalBasicSync", 0);
        setIntField(term286216, term286216.getClass(), "totalAdvancedSync", 0);
        setIntField(term286216, term286216.getClass(), "totalExpertSync", 0);
        setIntField(term286216, term286216.getClass(), "totalMasterSync", 0);
        setIntField(term286216, term286216.getClass(), "totalReMasterSync", 0);
        setLongField(term286216, term286216.getClass(), "totalAchievement", 0L);
        setLongField(term286216, term286216.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286216, term286216.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286216, term286216.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286216, term286216.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286216, term286216.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286216, term286216.getClass(), "playerOldRating", 0L);
        setLongField(term286216, term286216.getClass(), "playerNewRating", 0L);
        setIntField(term286216, term286216.getClass(), "banState", 0);
        setLongField(term286216, term286216.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term286216, args);
    }

};


