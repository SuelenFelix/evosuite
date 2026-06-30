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

public class UserDetail_setClassRank_1856841184253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291304;
     Object term291359;

    public UserDetail_setClassRank_1856841184253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291304 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291304, term291304.getClass(), "id", 0L);
        setField(term291304, term291304.getClass(), "card", null);
        setField(term291304, term291304.getClass(), "userName", null);
        setIntField(term291304, term291304.getClass(), "isNetMember", 0);
        setIntField(term291304, term291304.getClass(), "iconId", 0);
        setIntField(term291304, term291304.getClass(), "plateId", 0);
        setIntField(term291304, term291304.getClass(), "titleId", 0);
        setIntField(term291304, term291304.getClass(), "partnerId", 0);
        setIntField(term291304, term291304.getClass(), "frameId", 0);
        setIntField(term291304, term291304.getClass(), "selectMapId", 0);
        setIntField(term291304, term291304.getClass(), "totalAwake", 0);
        setIntField(term291304, term291304.getClass(), "gradeRating", 0);
        setIntField(term291304, term291304.getClass(), "musicRating", 0);
        setIntField(term291304, term291304.getClass(), "playerRating", 0);
        setIntField(term291304, term291304.getClass(), "highestRating", 0);
        setIntField(term291304, term291304.getClass(), "gradeRank", 0);
        setIntField(term291304, term291304.getClass(), "classRank", 0);
        setIntField(term291304, term291304.getClass(), "courseRank", 0);
        setField(term291304, term291304.getClass(), "charaSlot", null);
        setField(term291304, term291304.getClass(), "charaLockSlot", null);
        setLongField(term291304, term291304.getClass(), "contentBit", 0L);
        setIntField(term291304, term291304.getClass(), "playCount", 0);
        setField(term291304, term291304.getClass(), "eventWatchedDate", null);
        setField(term291304, term291304.getClass(), "lastGameId", null);
        setField(term291304, term291304.getClass(), "lastRomVersion", null);
        setField(term291304, term291304.getClass(), "lastDataVersion", null);
        setField(term291304, term291304.getClass(), "lastLoginDate", null);
        setField(term291304, term291304.getClass(), "lastPlayDate", null);
        setIntField(term291304, term291304.getClass(), "lastPlayCredit", 0);
        setIntField(term291304, term291304.getClass(), "lastPlayMode", 0);
        setIntField(term291304, term291304.getClass(), "lastPlaceId", 0);
        setField(term291304, term291304.getClass(), "lastPlaceName", null);
        setIntField(term291304, term291304.getClass(), "lastAllNetId", 0);
        setIntField(term291304, term291304.getClass(), "lastRegionId", 0);
        setField(term291304, term291304.getClass(), "lastRegionName", null);
        setField(term291304, term291304.getClass(), "lastClientId", null);
        setField(term291304, term291304.getClass(), "lastCountryCode", null);
        setIntField(term291304, term291304.getClass(), "lastSelectEMoney", 0);
        setIntField(term291304, term291304.getClass(), "lastSelectTicket", 0);
        setIntField(term291304, term291304.getClass(), "lastSelectCourse", 0);
        setIntField(term291304, term291304.getClass(), "lastCountCourse", 0);
        setField(term291304, term291304.getClass(), "firstGameId", null);
        setField(term291304, term291304.getClass(), "firstRomVersion", null);
        setField(term291304, term291304.getClass(), "firstDataVersion", null);
        setField(term291304, term291304.getClass(), "firstPlayDate", null);
        setField(term291304, term291304.getClass(), "compatibleCmVersion", null);
        setField(term291304, term291304.getClass(), "dailyBonusDate", null);
        setField(term291304, term291304.getClass(), "dailyCourseBonusDate", null);
        setField(term291304, term291304.getClass(), "lastPairLoginDate", null);
        setField(term291304, term291304.getClass(), "lastTrialPlayDate", null);
        setIntField(term291304, term291304.getClass(), "playVsCount", 0);
        setIntField(term291304, term291304.getClass(), "playSyncCount", 0);
        setIntField(term291304, term291304.getClass(), "winCount", 0);
        setIntField(term291304, term291304.getClass(), "helpCount", 0);
        setIntField(term291304, term291304.getClass(), "comboCount", 0);
        setLongField(term291304, term291304.getClass(), "totalDeluxscore", 0L);
        setLongField(term291304, term291304.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291304, term291304.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291304, term291304.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291304, term291304.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291304, term291304.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291304, term291304.getClass(), "totalSync", 0);
        setIntField(term291304, term291304.getClass(), "totalBasicSync", 0);
        setIntField(term291304, term291304.getClass(), "totalAdvancedSync", 0);
        setIntField(term291304, term291304.getClass(), "totalExpertSync", 0);
        setIntField(term291304, term291304.getClass(), "totalMasterSync", 0);
        setIntField(term291304, term291304.getClass(), "totalReMasterSync", 0);
        setLongField(term291304, term291304.getClass(), "totalAchievement", 0L);
        setLongField(term291304, term291304.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291304, term291304.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291304, term291304.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291304, term291304.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291304, term291304.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291304, term291304.getClass(), "playerOldRating", 0L);
        setLongField(term291304, term291304.getClass(), "playerNewRating", 0L);
        setIntField(term291304, term291304.getClass(), "banState", 0);
        setLongField(term291304, term291304.getClass(), "dateTime", 0L);
        term291359 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291359;
        callMethod(klass, "setClassRank", argTypes, term291304, args);
    }

};


