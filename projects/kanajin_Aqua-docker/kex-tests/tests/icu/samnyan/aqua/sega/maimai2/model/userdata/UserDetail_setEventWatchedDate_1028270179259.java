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

public class UserDetail_setEventWatchedDate_1028270179259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291642;

    public UserDetail_setEventWatchedDate_1028270179259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291642 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291642, term291642.getClass(), "id", 0L);
        setField(term291642, term291642.getClass(), "card", null);
        setField(term291642, term291642.getClass(), "userName", null);
        setIntField(term291642, term291642.getClass(), "isNetMember", 0);
        setIntField(term291642, term291642.getClass(), "iconId", 0);
        setIntField(term291642, term291642.getClass(), "plateId", 0);
        setIntField(term291642, term291642.getClass(), "titleId", 0);
        setIntField(term291642, term291642.getClass(), "partnerId", 0);
        setIntField(term291642, term291642.getClass(), "frameId", 0);
        setIntField(term291642, term291642.getClass(), "selectMapId", 0);
        setIntField(term291642, term291642.getClass(), "totalAwake", 0);
        setIntField(term291642, term291642.getClass(), "gradeRating", 0);
        setIntField(term291642, term291642.getClass(), "musicRating", 0);
        setIntField(term291642, term291642.getClass(), "playerRating", 0);
        setIntField(term291642, term291642.getClass(), "highestRating", 0);
        setIntField(term291642, term291642.getClass(), "gradeRank", 0);
        setIntField(term291642, term291642.getClass(), "classRank", 0);
        setIntField(term291642, term291642.getClass(), "courseRank", 0);
        setField(term291642, term291642.getClass(), "charaSlot", null);
        setField(term291642, term291642.getClass(), "charaLockSlot", null);
        setLongField(term291642, term291642.getClass(), "contentBit", 0L);
        setIntField(term291642, term291642.getClass(), "playCount", 0);
        setField(term291642, term291642.getClass(), "eventWatchedDate", null);
        setField(term291642, term291642.getClass(), "lastGameId", null);
        setField(term291642, term291642.getClass(), "lastRomVersion", null);
        setField(term291642, term291642.getClass(), "lastDataVersion", null);
        setField(term291642, term291642.getClass(), "lastLoginDate", null);
        setField(term291642, term291642.getClass(), "lastPlayDate", null);
        setIntField(term291642, term291642.getClass(), "lastPlayCredit", 0);
        setIntField(term291642, term291642.getClass(), "lastPlayMode", 0);
        setIntField(term291642, term291642.getClass(), "lastPlaceId", 0);
        setField(term291642, term291642.getClass(), "lastPlaceName", null);
        setIntField(term291642, term291642.getClass(), "lastAllNetId", 0);
        setIntField(term291642, term291642.getClass(), "lastRegionId", 0);
        setField(term291642, term291642.getClass(), "lastRegionName", null);
        setField(term291642, term291642.getClass(), "lastClientId", null);
        setField(term291642, term291642.getClass(), "lastCountryCode", null);
        setIntField(term291642, term291642.getClass(), "lastSelectEMoney", 0);
        setIntField(term291642, term291642.getClass(), "lastSelectTicket", 0);
        setIntField(term291642, term291642.getClass(), "lastSelectCourse", 0);
        setIntField(term291642, term291642.getClass(), "lastCountCourse", 0);
        setField(term291642, term291642.getClass(), "firstGameId", null);
        setField(term291642, term291642.getClass(), "firstRomVersion", null);
        setField(term291642, term291642.getClass(), "firstDataVersion", null);
        setField(term291642, term291642.getClass(), "firstPlayDate", null);
        setField(term291642, term291642.getClass(), "compatibleCmVersion", null);
        setField(term291642, term291642.getClass(), "dailyBonusDate", null);
        setField(term291642, term291642.getClass(), "dailyCourseBonusDate", null);
        setField(term291642, term291642.getClass(), "lastPairLoginDate", null);
        setField(term291642, term291642.getClass(), "lastTrialPlayDate", null);
        setIntField(term291642, term291642.getClass(), "playVsCount", 0);
        setIntField(term291642, term291642.getClass(), "playSyncCount", 0);
        setIntField(term291642, term291642.getClass(), "winCount", 0);
        setIntField(term291642, term291642.getClass(), "helpCount", 0);
        setIntField(term291642, term291642.getClass(), "comboCount", 0);
        setLongField(term291642, term291642.getClass(), "totalDeluxscore", 0L);
        setLongField(term291642, term291642.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291642, term291642.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291642, term291642.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291642, term291642.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291642, term291642.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291642, term291642.getClass(), "totalSync", 0);
        setIntField(term291642, term291642.getClass(), "totalBasicSync", 0);
        setIntField(term291642, term291642.getClass(), "totalAdvancedSync", 0);
        setIntField(term291642, term291642.getClass(), "totalExpertSync", 0);
        setIntField(term291642, term291642.getClass(), "totalMasterSync", 0);
        setIntField(term291642, term291642.getClass(), "totalReMasterSync", 0);
        setLongField(term291642, term291642.getClass(), "totalAchievement", 0L);
        setLongField(term291642, term291642.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291642, term291642.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291642, term291642.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291642, term291642.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291642, term291642.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291642, term291642.getClass(), "playerOldRating", 0L);
        setLongField(term291642, term291642.getClass(), "playerNewRating", 0L);
        setIntField(term291642, term291642.getClass(), "banState", 0);
        setLongField(term291642, term291642.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEventWatchedDate", argTypes, term291642, args);
    }

};


