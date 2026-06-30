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
import java.lang.Integer;

public class UserDetail_setLastSelectCourse_1233323405276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292591;
     Object term292646;

    public UserDetail_setLastSelectCourse_1233323405276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292591, term292591.getClass(), "id", 0L);
        setField(term292591, term292591.getClass(), "card", null);
        setField(term292591, term292591.getClass(), "userName", null);
        setIntField(term292591, term292591.getClass(), "isNetMember", 0);
        setIntField(term292591, term292591.getClass(), "iconId", 0);
        setIntField(term292591, term292591.getClass(), "plateId", 0);
        setIntField(term292591, term292591.getClass(), "titleId", 0);
        setIntField(term292591, term292591.getClass(), "partnerId", 0);
        setIntField(term292591, term292591.getClass(), "frameId", 0);
        setIntField(term292591, term292591.getClass(), "selectMapId", 0);
        setIntField(term292591, term292591.getClass(), "totalAwake", 0);
        setIntField(term292591, term292591.getClass(), "gradeRating", 0);
        setIntField(term292591, term292591.getClass(), "musicRating", 0);
        setIntField(term292591, term292591.getClass(), "playerRating", 0);
        setIntField(term292591, term292591.getClass(), "highestRating", 0);
        setIntField(term292591, term292591.getClass(), "gradeRank", 0);
        setIntField(term292591, term292591.getClass(), "classRank", 0);
        setIntField(term292591, term292591.getClass(), "courseRank", 0);
        setField(term292591, term292591.getClass(), "charaSlot", null);
        setField(term292591, term292591.getClass(), "charaLockSlot", null);
        setLongField(term292591, term292591.getClass(), "contentBit", 0L);
        setIntField(term292591, term292591.getClass(), "playCount", 0);
        setField(term292591, term292591.getClass(), "eventWatchedDate", null);
        setField(term292591, term292591.getClass(), "lastGameId", null);
        setField(term292591, term292591.getClass(), "lastRomVersion", null);
        setField(term292591, term292591.getClass(), "lastDataVersion", null);
        setField(term292591, term292591.getClass(), "lastLoginDate", null);
        setField(term292591, term292591.getClass(), "lastPlayDate", null);
        setIntField(term292591, term292591.getClass(), "lastPlayCredit", 0);
        setIntField(term292591, term292591.getClass(), "lastPlayMode", 0);
        setIntField(term292591, term292591.getClass(), "lastPlaceId", 0);
        setField(term292591, term292591.getClass(), "lastPlaceName", null);
        setIntField(term292591, term292591.getClass(), "lastAllNetId", 0);
        setIntField(term292591, term292591.getClass(), "lastRegionId", 0);
        setField(term292591, term292591.getClass(), "lastRegionName", null);
        setField(term292591, term292591.getClass(), "lastClientId", null);
        setField(term292591, term292591.getClass(), "lastCountryCode", null);
        setIntField(term292591, term292591.getClass(), "lastSelectEMoney", 0);
        setIntField(term292591, term292591.getClass(), "lastSelectTicket", 0);
        setIntField(term292591, term292591.getClass(), "lastSelectCourse", 0);
        setIntField(term292591, term292591.getClass(), "lastCountCourse", 0);
        setField(term292591, term292591.getClass(), "firstGameId", null);
        setField(term292591, term292591.getClass(), "firstRomVersion", null);
        setField(term292591, term292591.getClass(), "firstDataVersion", null);
        setField(term292591, term292591.getClass(), "firstPlayDate", null);
        setField(term292591, term292591.getClass(), "compatibleCmVersion", null);
        setField(term292591, term292591.getClass(), "dailyBonusDate", null);
        setField(term292591, term292591.getClass(), "dailyCourseBonusDate", null);
        setField(term292591, term292591.getClass(), "lastPairLoginDate", null);
        setField(term292591, term292591.getClass(), "lastTrialPlayDate", null);
        setIntField(term292591, term292591.getClass(), "playVsCount", 0);
        setIntField(term292591, term292591.getClass(), "playSyncCount", 0);
        setIntField(term292591, term292591.getClass(), "winCount", 0);
        setIntField(term292591, term292591.getClass(), "helpCount", 0);
        setIntField(term292591, term292591.getClass(), "comboCount", 0);
        setLongField(term292591, term292591.getClass(), "totalDeluxscore", 0L);
        setLongField(term292591, term292591.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292591, term292591.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292591, term292591.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292591, term292591.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292591, term292591.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292591, term292591.getClass(), "totalSync", 0);
        setIntField(term292591, term292591.getClass(), "totalBasicSync", 0);
        setIntField(term292591, term292591.getClass(), "totalAdvancedSync", 0);
        setIntField(term292591, term292591.getClass(), "totalExpertSync", 0);
        setIntField(term292591, term292591.getClass(), "totalMasterSync", 0);
        setIntField(term292591, term292591.getClass(), "totalReMasterSync", 0);
        setLongField(term292591, term292591.getClass(), "totalAchievement", 0L);
        setLongField(term292591, term292591.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292591, term292591.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292591, term292591.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292591, term292591.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292591, term292591.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292591, term292591.getClass(), "playerOldRating", 0L);
        setLongField(term292591, term292591.getClass(), "playerNewRating", 0L);
        setIntField(term292591, term292591.getClass(), "banState", 0);
        setLongField(term292591, term292591.getClass(), "dateTime", 0L);
        term292646 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292646;
        callMethod(klass, "setLastSelectCourse", argTypes, term292591, args);
    }

};


