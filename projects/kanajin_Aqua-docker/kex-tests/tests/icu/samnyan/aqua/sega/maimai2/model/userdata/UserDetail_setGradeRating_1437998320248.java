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

public class UserDetail_setGradeRating_1437998320248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291019;
     Object term291074;

    public UserDetail_setGradeRating_1437998320248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291019 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291019, term291019.getClass(), "id", 0L);
        setField(term291019, term291019.getClass(), "card", null);
        setField(term291019, term291019.getClass(), "userName", null);
        setIntField(term291019, term291019.getClass(), "isNetMember", 0);
        setIntField(term291019, term291019.getClass(), "iconId", 0);
        setIntField(term291019, term291019.getClass(), "plateId", 0);
        setIntField(term291019, term291019.getClass(), "titleId", 0);
        setIntField(term291019, term291019.getClass(), "partnerId", 0);
        setIntField(term291019, term291019.getClass(), "frameId", 0);
        setIntField(term291019, term291019.getClass(), "selectMapId", 0);
        setIntField(term291019, term291019.getClass(), "totalAwake", 0);
        setIntField(term291019, term291019.getClass(), "gradeRating", 0);
        setIntField(term291019, term291019.getClass(), "musicRating", 0);
        setIntField(term291019, term291019.getClass(), "playerRating", 0);
        setIntField(term291019, term291019.getClass(), "highestRating", 0);
        setIntField(term291019, term291019.getClass(), "gradeRank", 0);
        setIntField(term291019, term291019.getClass(), "classRank", 0);
        setIntField(term291019, term291019.getClass(), "courseRank", 0);
        setField(term291019, term291019.getClass(), "charaSlot", null);
        setField(term291019, term291019.getClass(), "charaLockSlot", null);
        setLongField(term291019, term291019.getClass(), "contentBit", 0L);
        setIntField(term291019, term291019.getClass(), "playCount", 0);
        setField(term291019, term291019.getClass(), "eventWatchedDate", null);
        setField(term291019, term291019.getClass(), "lastGameId", null);
        setField(term291019, term291019.getClass(), "lastRomVersion", null);
        setField(term291019, term291019.getClass(), "lastDataVersion", null);
        setField(term291019, term291019.getClass(), "lastLoginDate", null);
        setField(term291019, term291019.getClass(), "lastPlayDate", null);
        setIntField(term291019, term291019.getClass(), "lastPlayCredit", 0);
        setIntField(term291019, term291019.getClass(), "lastPlayMode", 0);
        setIntField(term291019, term291019.getClass(), "lastPlaceId", 0);
        setField(term291019, term291019.getClass(), "lastPlaceName", null);
        setIntField(term291019, term291019.getClass(), "lastAllNetId", 0);
        setIntField(term291019, term291019.getClass(), "lastRegionId", 0);
        setField(term291019, term291019.getClass(), "lastRegionName", null);
        setField(term291019, term291019.getClass(), "lastClientId", null);
        setField(term291019, term291019.getClass(), "lastCountryCode", null);
        setIntField(term291019, term291019.getClass(), "lastSelectEMoney", 0);
        setIntField(term291019, term291019.getClass(), "lastSelectTicket", 0);
        setIntField(term291019, term291019.getClass(), "lastSelectCourse", 0);
        setIntField(term291019, term291019.getClass(), "lastCountCourse", 0);
        setField(term291019, term291019.getClass(), "firstGameId", null);
        setField(term291019, term291019.getClass(), "firstRomVersion", null);
        setField(term291019, term291019.getClass(), "firstDataVersion", null);
        setField(term291019, term291019.getClass(), "firstPlayDate", null);
        setField(term291019, term291019.getClass(), "compatibleCmVersion", null);
        setField(term291019, term291019.getClass(), "dailyBonusDate", null);
        setField(term291019, term291019.getClass(), "dailyCourseBonusDate", null);
        setField(term291019, term291019.getClass(), "lastPairLoginDate", null);
        setField(term291019, term291019.getClass(), "lastTrialPlayDate", null);
        setIntField(term291019, term291019.getClass(), "playVsCount", 0);
        setIntField(term291019, term291019.getClass(), "playSyncCount", 0);
        setIntField(term291019, term291019.getClass(), "winCount", 0);
        setIntField(term291019, term291019.getClass(), "helpCount", 0);
        setIntField(term291019, term291019.getClass(), "comboCount", 0);
        setLongField(term291019, term291019.getClass(), "totalDeluxscore", 0L);
        setLongField(term291019, term291019.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291019, term291019.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291019, term291019.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291019, term291019.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291019, term291019.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291019, term291019.getClass(), "totalSync", 0);
        setIntField(term291019, term291019.getClass(), "totalBasicSync", 0);
        setIntField(term291019, term291019.getClass(), "totalAdvancedSync", 0);
        setIntField(term291019, term291019.getClass(), "totalExpertSync", 0);
        setIntField(term291019, term291019.getClass(), "totalMasterSync", 0);
        setIntField(term291019, term291019.getClass(), "totalReMasterSync", 0);
        setLongField(term291019, term291019.getClass(), "totalAchievement", 0L);
        setLongField(term291019, term291019.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291019, term291019.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291019, term291019.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291019, term291019.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291019, term291019.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291019, term291019.getClass(), "playerOldRating", 0L);
        setLongField(term291019, term291019.getClass(), "playerNewRating", 0L);
        setIntField(term291019, term291019.getClass(), "banState", 0);
        setLongField(term291019, term291019.getClass(), "dateTime", 0L);
        term291074 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291074;
        callMethod(klass, "setGradeRating", argTypes, term291019, args);
    }

};


