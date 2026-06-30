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

public class UserDetail_setLastLoginDate_162893736263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291862;

    public UserDetail_setLastLoginDate_162893736263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291862 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291862, term291862.getClass(), "id", 0L);
        setField(term291862, term291862.getClass(), "card", null);
        setField(term291862, term291862.getClass(), "userName", null);
        setIntField(term291862, term291862.getClass(), "isNetMember", 0);
        setIntField(term291862, term291862.getClass(), "iconId", 0);
        setIntField(term291862, term291862.getClass(), "plateId", 0);
        setIntField(term291862, term291862.getClass(), "titleId", 0);
        setIntField(term291862, term291862.getClass(), "partnerId", 0);
        setIntField(term291862, term291862.getClass(), "frameId", 0);
        setIntField(term291862, term291862.getClass(), "selectMapId", 0);
        setIntField(term291862, term291862.getClass(), "totalAwake", 0);
        setIntField(term291862, term291862.getClass(), "gradeRating", 0);
        setIntField(term291862, term291862.getClass(), "musicRating", 0);
        setIntField(term291862, term291862.getClass(), "playerRating", 0);
        setIntField(term291862, term291862.getClass(), "highestRating", 0);
        setIntField(term291862, term291862.getClass(), "gradeRank", 0);
        setIntField(term291862, term291862.getClass(), "classRank", 0);
        setIntField(term291862, term291862.getClass(), "courseRank", 0);
        setField(term291862, term291862.getClass(), "charaSlot", null);
        setField(term291862, term291862.getClass(), "charaLockSlot", null);
        setLongField(term291862, term291862.getClass(), "contentBit", 0L);
        setIntField(term291862, term291862.getClass(), "playCount", 0);
        setField(term291862, term291862.getClass(), "eventWatchedDate", null);
        setField(term291862, term291862.getClass(), "lastGameId", null);
        setField(term291862, term291862.getClass(), "lastRomVersion", null);
        setField(term291862, term291862.getClass(), "lastDataVersion", null);
        setField(term291862, term291862.getClass(), "lastLoginDate", null);
        setField(term291862, term291862.getClass(), "lastPlayDate", null);
        setIntField(term291862, term291862.getClass(), "lastPlayCredit", 0);
        setIntField(term291862, term291862.getClass(), "lastPlayMode", 0);
        setIntField(term291862, term291862.getClass(), "lastPlaceId", 0);
        setField(term291862, term291862.getClass(), "lastPlaceName", null);
        setIntField(term291862, term291862.getClass(), "lastAllNetId", 0);
        setIntField(term291862, term291862.getClass(), "lastRegionId", 0);
        setField(term291862, term291862.getClass(), "lastRegionName", null);
        setField(term291862, term291862.getClass(), "lastClientId", null);
        setField(term291862, term291862.getClass(), "lastCountryCode", null);
        setIntField(term291862, term291862.getClass(), "lastSelectEMoney", 0);
        setIntField(term291862, term291862.getClass(), "lastSelectTicket", 0);
        setIntField(term291862, term291862.getClass(), "lastSelectCourse", 0);
        setIntField(term291862, term291862.getClass(), "lastCountCourse", 0);
        setField(term291862, term291862.getClass(), "firstGameId", null);
        setField(term291862, term291862.getClass(), "firstRomVersion", null);
        setField(term291862, term291862.getClass(), "firstDataVersion", null);
        setField(term291862, term291862.getClass(), "firstPlayDate", null);
        setField(term291862, term291862.getClass(), "compatibleCmVersion", null);
        setField(term291862, term291862.getClass(), "dailyBonusDate", null);
        setField(term291862, term291862.getClass(), "dailyCourseBonusDate", null);
        setField(term291862, term291862.getClass(), "lastPairLoginDate", null);
        setField(term291862, term291862.getClass(), "lastTrialPlayDate", null);
        setIntField(term291862, term291862.getClass(), "playVsCount", 0);
        setIntField(term291862, term291862.getClass(), "playSyncCount", 0);
        setIntField(term291862, term291862.getClass(), "winCount", 0);
        setIntField(term291862, term291862.getClass(), "helpCount", 0);
        setIntField(term291862, term291862.getClass(), "comboCount", 0);
        setLongField(term291862, term291862.getClass(), "totalDeluxscore", 0L);
        setLongField(term291862, term291862.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291862, term291862.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291862, term291862.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291862, term291862.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291862, term291862.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291862, term291862.getClass(), "totalSync", 0);
        setIntField(term291862, term291862.getClass(), "totalBasicSync", 0);
        setIntField(term291862, term291862.getClass(), "totalAdvancedSync", 0);
        setIntField(term291862, term291862.getClass(), "totalExpertSync", 0);
        setIntField(term291862, term291862.getClass(), "totalMasterSync", 0);
        setIntField(term291862, term291862.getClass(), "totalReMasterSync", 0);
        setLongField(term291862, term291862.getClass(), "totalAchievement", 0L);
        setLongField(term291862, term291862.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291862, term291862.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291862, term291862.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291862, term291862.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291862, term291862.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291862, term291862.getClass(), "playerOldRating", 0L);
        setLongField(term291862, term291862.getClass(), "playerNewRating", 0L);
        setIntField(term291862, term291862.getClass(), "banState", 0);
        setLongField(term291862, term291862.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastLoginDate", argTypes, term291862, args);
    }

};


