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

public class UserDetail_setLastPlayDate_733446483264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291917;

    public UserDetail_setLastPlayDate_733446483264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291917, term291917.getClass(), "id", 0L);
        setField(term291917, term291917.getClass(), "card", null);
        setField(term291917, term291917.getClass(), "userName", null);
        setIntField(term291917, term291917.getClass(), "isNetMember", 0);
        setIntField(term291917, term291917.getClass(), "iconId", 0);
        setIntField(term291917, term291917.getClass(), "plateId", 0);
        setIntField(term291917, term291917.getClass(), "titleId", 0);
        setIntField(term291917, term291917.getClass(), "partnerId", 0);
        setIntField(term291917, term291917.getClass(), "frameId", 0);
        setIntField(term291917, term291917.getClass(), "selectMapId", 0);
        setIntField(term291917, term291917.getClass(), "totalAwake", 0);
        setIntField(term291917, term291917.getClass(), "gradeRating", 0);
        setIntField(term291917, term291917.getClass(), "musicRating", 0);
        setIntField(term291917, term291917.getClass(), "playerRating", 0);
        setIntField(term291917, term291917.getClass(), "highestRating", 0);
        setIntField(term291917, term291917.getClass(), "gradeRank", 0);
        setIntField(term291917, term291917.getClass(), "classRank", 0);
        setIntField(term291917, term291917.getClass(), "courseRank", 0);
        setField(term291917, term291917.getClass(), "charaSlot", null);
        setField(term291917, term291917.getClass(), "charaLockSlot", null);
        setLongField(term291917, term291917.getClass(), "contentBit", 0L);
        setIntField(term291917, term291917.getClass(), "playCount", 0);
        setField(term291917, term291917.getClass(), "eventWatchedDate", null);
        setField(term291917, term291917.getClass(), "lastGameId", null);
        setField(term291917, term291917.getClass(), "lastRomVersion", null);
        setField(term291917, term291917.getClass(), "lastDataVersion", null);
        setField(term291917, term291917.getClass(), "lastLoginDate", null);
        setField(term291917, term291917.getClass(), "lastPlayDate", null);
        setIntField(term291917, term291917.getClass(), "lastPlayCredit", 0);
        setIntField(term291917, term291917.getClass(), "lastPlayMode", 0);
        setIntField(term291917, term291917.getClass(), "lastPlaceId", 0);
        setField(term291917, term291917.getClass(), "lastPlaceName", null);
        setIntField(term291917, term291917.getClass(), "lastAllNetId", 0);
        setIntField(term291917, term291917.getClass(), "lastRegionId", 0);
        setField(term291917, term291917.getClass(), "lastRegionName", null);
        setField(term291917, term291917.getClass(), "lastClientId", null);
        setField(term291917, term291917.getClass(), "lastCountryCode", null);
        setIntField(term291917, term291917.getClass(), "lastSelectEMoney", 0);
        setIntField(term291917, term291917.getClass(), "lastSelectTicket", 0);
        setIntField(term291917, term291917.getClass(), "lastSelectCourse", 0);
        setIntField(term291917, term291917.getClass(), "lastCountCourse", 0);
        setField(term291917, term291917.getClass(), "firstGameId", null);
        setField(term291917, term291917.getClass(), "firstRomVersion", null);
        setField(term291917, term291917.getClass(), "firstDataVersion", null);
        setField(term291917, term291917.getClass(), "firstPlayDate", null);
        setField(term291917, term291917.getClass(), "compatibleCmVersion", null);
        setField(term291917, term291917.getClass(), "dailyBonusDate", null);
        setField(term291917, term291917.getClass(), "dailyCourseBonusDate", null);
        setField(term291917, term291917.getClass(), "lastPairLoginDate", null);
        setField(term291917, term291917.getClass(), "lastTrialPlayDate", null);
        setIntField(term291917, term291917.getClass(), "playVsCount", 0);
        setIntField(term291917, term291917.getClass(), "playSyncCount", 0);
        setIntField(term291917, term291917.getClass(), "winCount", 0);
        setIntField(term291917, term291917.getClass(), "helpCount", 0);
        setIntField(term291917, term291917.getClass(), "comboCount", 0);
        setLongField(term291917, term291917.getClass(), "totalDeluxscore", 0L);
        setLongField(term291917, term291917.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291917, term291917.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291917, term291917.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291917, term291917.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291917, term291917.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291917, term291917.getClass(), "totalSync", 0);
        setIntField(term291917, term291917.getClass(), "totalBasicSync", 0);
        setIntField(term291917, term291917.getClass(), "totalAdvancedSync", 0);
        setIntField(term291917, term291917.getClass(), "totalExpertSync", 0);
        setIntField(term291917, term291917.getClass(), "totalMasterSync", 0);
        setIntField(term291917, term291917.getClass(), "totalReMasterSync", 0);
        setLongField(term291917, term291917.getClass(), "totalAchievement", 0L);
        setLongField(term291917, term291917.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291917, term291917.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291917, term291917.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291917, term291917.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291917, term291917.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291917, term291917.getClass(), "playerOldRating", 0L);
        setLongField(term291917, term291917.getClass(), "playerNewRating", 0L);
        setIntField(term291917, term291917.getClass(), "banState", 0);
        setLongField(term291917, term291917.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term291917, args);
    }

};


